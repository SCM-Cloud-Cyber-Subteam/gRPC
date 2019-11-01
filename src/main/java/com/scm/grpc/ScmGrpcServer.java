package main.java.com.scm.grpc;

import com.scm.resources.*;
import io.grpc.stub.StreamObserver;
import main.java.com.scm.resources.getAllInfo;

import io.grpc.stub.*;
import io.grpc.*;

import java.io.IOException;

import java.lang.InterruptedException;

import java.util.*;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;





public class ScmGrpcServer {
	public static void main(String [] args) throws IOException, InterruptedException {
		System.out.println("SecCldMfg Grpc Server Started");
		Server server = ServerBuilder.forPort(50051)
			.addService(new MessageHandlerImpl())
			.build();
		server.start();
		server.awaitTermination();
	}


}


class MessageHandlerImpl extends MessageHandlerGrpc.MessageHandlerImplBase {
	
	private getAllInfo OPCDataExtractor = new getAllInfo();

	@Override
	public void connect(ConnectRequest request, StreamObserver<ConnectReply> replyObserver) {
		
		ConnectReply reply = ConnectReply.newBuilder()
			.setConfirmation(true)
			.build();
		
		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}

	@Override
	public void getGroups(GroupsRequest request, StreamObserver<GroupsReply> replyObserver){
		
		List<String> groupsList = /*new ArrayList<String>();*/OPCDataExtractor.getExistingGroups();
		GroupsReply reply = GroupsReply.newBuilder()
			.addAllGroupNames(groupsList)
			.build();
		
		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}
	
	@Override
	public void getGroupTags(GroupTagsRequest request, StreamObserver<GroupTagsReply> replyObserver){
		
		String groupName = request.getGroupName();

		List<String> groupTagsList = OPCDataExtractor.getExistingGroups();
		GroupTagsReply reply = GroupTagsReply.newBuilder()
			.addAllTagNames(groupTagsList)
			.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}
	
	@Override
	public void getTag(TagRequest request, StreamObserver<TagReply> replyObserver){

		String tagName = request.getTagName();
		String groupName = request.getGroupName();
		JSONObject tagData = OPCDataExtractor.getTag(tagName, groupName);

		
		TagReply reply = TagReply.newBuilder()
			.setClientHandle(tagData.get("clientHandle").toString())
			.setItemName(tagData.get("itemName").toString())
			.setActive(Boolean.valueOf(tagData.get("active").toString()))
			.setAccessPath(tagData.get("accessPath").toString())
			.setTimeStamp(4242019)
			.setDataType(tagData.get("dataType").toString())
			.setValue(tagData.get("value").toString())
			.setQuality(Boolean.valueOf(tagData.get("quality").toString()))
			.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}

	/*
	@Override
	public void getMultipleTags(MultipleTagsRequest request, StreamObserver<MultipleTagsReply> replyObserver) {
		
		List<TagRequest> requests= request.getTagRequestList();
		String[] tagNames = new String[requests.size()];
		String[] groupNames = new String[requests.size()];


		for (int index = 0;index < request.getTagRequestCount(); ++index) {
			tagNames[index] = request.getTagRequest(index).getTagName();
			groupNames[index] = request.getTagRequest(index).getGroupName();
		}

		ArrayList<JSONObject> tagDataArray = OPCDataExtractor.getTags(tagNames, groupNames);
		
		MultipleTagsReply.Builder replyBuilder = MultipleTagsReply.newBuilder();

		for (JSONObject singleTagData : tagDataArray) {

			TagReply currTagReply = TagReply.newBuilder()
				.setClientHandle(singleTagData.get("clientHandle").toString())
				.setItemName(singleTagData.get("itemName").toString())
				.setActive(Boolean.valueOf(singleTagData.get("active").toString()))
				.setAccessPath(singleTagData.get("accessPath").toString())
				.setTimeStamp(Long.valueOf(singleTagData.get("timeStamp").toString()))
				.setDataType(singleTagData.get("dataType").toString())
				.setValue(singleTagData.get("value").toString())
				.setQuality(Boolean.valueOf(singleTagData.get("quality").toString()))
				.build();

			replyBuilder.addTagReply(currTagReply);
		}
		
		MultipleTagsReply reply = replyBuilder.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}
	*/

	@Override
	public void readTagsFromFile(TagGroupFileRequest request, StreamObserver<SuccessfulWritingReply> replyObserver){

		String srcFile = request.getSrcPathTagGroup();
		String destFile = request.getDestPath();
		try {
			String[][] tagsAndGroups = OPCDataExtractor.readTagsFromFile(srcFile);
			SuccessfulWritingReply reply = SuccessfulWritingReply.newBuilder()
					.setSuccess(OPCDataExtractor.writeTagsToFile(destFile, OPCDataExtractor.getTags(tagsAndGroups))).build();
			replyObserver.onNext(reply);
			replyObserver.onCompleted();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
 
}