package com.scm.grpc;

import getInfo.getAllInfo;
import com.scm.resources.*;

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
		Server server = ServerBuilder.forPort(8080)
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
		
		List<String> groupsList = OPCDataExtractor.getExistingGroups();
		
		GroupsReply reply = GroupsReply.newBuilder()
			.addAllGroupNames(groupsList)
			.build();
		
		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}

	@Override
	public void getGroupTags(GroupTagsRequest request, StreamObserver<GroupTagsReply> replyObserver){
		
		String groupName = request.getGroupName();

		List<String> groupTagsList = OPCDataExtractor.getExistingTagsInGroups();

		GroupTagsReply reply = GroupTagsReply.newBuilder()
			.addAllTagNames(groupTagsList)
			.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}

	/*@Override
	public void getTag(TagRequest request, StreamObserver<TagReply> replyObserver){

		String tagName = request.getTagName();
		String groupName = request.getGroupName();
		JSONObject tagData = OPCDataExtractor.getTag(tagName, groupName);
	
		// TODO : Need to do something with value

		TagReply reply = TagReply.newBuilder()
			.setClientHandle(tagData.get("clientHandle"))
			.setItemName(tagData.get("itemName"))
			.setActive(tagData.get("active"))
			.setAccessPath(tagData.get("accessPath"))
			.setTimeStamp(tagData.get("timeStamp"))
			.setValue(tagData.get("value"))
			.setQuality(tagData.get("quality"))
			.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}

	@Override
	public void getMultipleTags(MultipleTagsRequest request, StreamObserver<MultipleTagsReply> replyObserver) {
		
		List<TagRequest> requests= request.getTagRequestList();
		String[] tagNames = new String[requests.size()];
		String[] groupNames = new String[requests.size()];


		for (int index = 0;index < requests.size(); ++index) {
			tagNames[index] = requests[index].getTagName();
			groupNames[index] = requests[index].getGroupName();
		}

		JSONArray tagDataArray = OPCDataExtractor.getTags(tagNames, groupNames);
		
		MultipleTagsReply.Builder replyBuilder = MultipleTagsReply.newBuilder();

		for (int index = 0; index < tagDataArray.size(); ++index) {
			TagReply currTagReply = TagReply.newBuilder()
				.setClientHandle(tagData.get("clientHandle"))
				.setItemName(tagData.get("itemName"))
				.setActive(tagData.get("active"))
				.setAccessPath(tagData.get("accessPath"))
				.setTimeStamp(tagData.get("timeStamp"))
				.setValue(tagData.get("value"))
				.setQuality(tagData.get("quality"))
				.build();

			replyBuilder.addTagReply(currTagReply);
		}
		
		MultipleTagsReply reply = replyBuilder.build();

		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}
	
	*/
 
}