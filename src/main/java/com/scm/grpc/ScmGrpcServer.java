package main.java.com.scm.grpc;

import com.scm.resources.*;
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
		
		/*
		//Use this for testing
		groupsList.add("AB");
		groupsList.add("AdvManLab");
		groupsList.add("CNC1");
		groupsList.add("CNC2");
		groupsList.add("CNC3");
		groupsList.add("CNC4");
		groupsList.add("Counting_number_of_IO_points");
		groupsList.add("Emu_PLC0");
		groupsList.add("Emu_PLC1");
		groupsList.add("JADE");
		groupsList.add("Jenny_branch");
		groupsList.add("PLC0");
		groupsList.add("ProjectTemplate");
		groupsList.add("TestProject");
		*/

		GroupsReply reply = GroupsReply.newBuilder()
			.addAllGroupNames(groupsList)
			.build();
		
		replyObserver.onNext(reply);
		replyObserver.onCompleted();
	}
	
	@Override
	public void getGroupTags(GroupTagsRequest request, StreamObserver<GroupTagsReply> replyObserver){
		
		String groupName = request.getGroupName();

		List<String> groupTagsList = /*new ArrayList<String>();*/OPCDataExtractor.getExistingGroups();
		
		/*
		//Use this for testing (This is data for CNC1 for reference)
		groupTagsList.add("ACTIVE_SCREEN");
		groupTagsList.add("ANGLE");
		groupTagsList.add("ANGLE1");
		groupTagsList.add("ANGLE2");
		groupTagsList.add("ANGLE_C");
		groupTagsList.add("ANGLE_C_IJ");
		groupTagsList.add("ANGLE_NEW");
		groupTagsList.add("ANGLE_NEW1");
		groupTagsList.add("ANGLE_OFFSET");
		groupTagsList.add("ANGLE_RAD");
		groupTagsList.add("AVG_CYCLE");
		groupTagsList.add("AVG_CYCLE_TIME");
		groupTagsList.add("AVG_CYCLES");
		groupTagsList.add("AX0_E_RETURN_POSITION");
		*/

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
	
		/*
		// Use this for testing. These values are random and not part of anything
		JSONObject tagData = new JSONObject();
		//add client handle
		tagData.put("clientHandle", 0);
		//add item name
		tagData.put("itemName", "MISC_ITEM");
		//add item  activity
		tagData.put("active", true);
		//add access path
		tagData.put("accessPath", "MachineName");
		//add time stamp
		tagData.put("timeStamp", ":Wed Apr 24 11:42:36 EDT 2019");
		//add item data type
		tagData.put("dataType", "VT_R4");
		//add item value
		tagData.put("value", 0);
		//add item quality
		tagData.put("quality", true);
		*/

		
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
	
 
}