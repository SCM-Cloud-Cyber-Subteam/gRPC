package com.scm.grpc;

import com.scm.resources.*;
import main.java.com.scm.resources.getAllInfo;

import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.io.IOException;

import java.lang.InterruptedException;
import java.lang.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class ScmGrpcClientMain {
	public static void main(String [] args)throws IOException{
		ScmGrpcClient foo = new ScmGrpcClient("141.212.133.36", 50051);
		Scanner input = new Scanner(System.in);
		getAllInfo OPCDataExtractor = new getAllInfo();
		String choice, tagName, groupName, srcPath,destPath;
		while(true){
			System.out.println("Enter 1 to read tags from file or 2 to input tag/group name or 'exit' to exit");
			choice = input.next();
			switch(choice) {
				case "exit":
					System.out.println("Goodbye");
					System.exit(0);
				case "1":
					System.out.println("Enter source file path");
					srcPath = input.next();
					System.out.println("Enter a destination path");
					destPath = input.next();
					System.out.println(OPCDataExtractor.readTagsFromFile(srcPath,destPath));
				case "2":
					System.out.println("Enter a tag name");
					tagName = input.next();
					System.out.println("Enter its group corresponding group name");
					groupName = input.next();
					System.out.println(OPCDataExtractor.getTag(tagName,groupName));
			}

		}

	}
}

class ScmGrpcClient {

  	private static final Logger logger = Logger.getLogger(ScmGrpcClient.class.getName());
  	private final ManagedChannel channel;
  	private final MessageHandlerGrpc.MessageHandlerBlockingStub blockingStub;
  	private boolean connected = false;
  	private String currentServer = "";


  	public ScmGrpcClient (String host, int port) {
  		this(ManagedChannelBuilder.forAddress(host, port)
	        .usePlaintext()
	        .build());
  		String server = host + String.valueOf(port);
  		try {
  			this.connect(server);
  		} catch (StatusRuntimeException e) {
  			System.out.println("Could not connect to testbed computer. The desktop may be turned off or another application interfered with the gRPC server");
  		}
  		this.currentServer = server;
  	}

	private ScmGrpcClient(ManagedChannel channel) {
	    this.channel = channel;
	    blockingStub = MessageHandlerGrpc.newBlockingStub(channel);
  	}

  	public void shutdown() throws InterruptedException {
	    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  	}


	private void connect(String server) {

	    logger.info("Will try to connect to server '" + server + "'");
	    ConnectRequest request = ConnectRequest.newBuilder().setServer(server).build();
	    ConnectReply reply;

	    try {
	      	reply = blockingStub.connect(request);
	    } catch (StatusRuntimeException e) {
	      	logger.log(Level.WARNING, "RPC failed: Failed to connect to server '" + server + "'", e.getStatus());
	      	throw(e);
	    }

	    this.connected = true;

	    logger.info("Successfully connected to '" + server + "'");
  	}


	public JSONObject getTag(String tagNameGiven, String groupName){
		if (!this.connected) {return new JSONObject();}

		TagRequest request = TagRequest.newBuilder()
								.setTagName(tagNameGiven)
								.setGroupName(groupName)
								.build();
		TagReply reply;

		try {
	      	reply = blockingStub.getTag(request);
	    } catch (StatusRuntimeException e) {
	      	logger.log(Level.WARNING, "Unable to retrieve tags from group '" + groupName +  "' from server '" + this.currentServer + "'", e.getStatus());
	      	throw(e);
	    }

	    JSONObject tagData = new JSONObject();
	    tagData.put("clientHandle", reply.getClientHandle());
		//add item name
		tagData.put("itemName", reply.getItemName());
		//add item  activity
		tagData.put("active", reply.getActive());
		//add access path
		tagData.put("accessPath", reply.getAccessPath());
		//add time stamp
		tagData.put("timeStamp", reply.getTimeStamp());
		//add item data type
		tagData.put("dataType", reply.getDataType());
		//add item value
		tagData.put("value", reply.getValue());
		//add item quality
		tagData.put("quality", reply.getQuality());


		return tagData;
	}

	public JSONArray getTags(String[] tagNamesGiven, String[] groupNamesGiven){
		if (!this.connected) {return new JSONArray();}

		MultipleTagsRequest.Builder requestBuilder = MultipleTagsRequest.newBuilder();

		for(int index = 0; index < tagNamesGiven.length; ++index){
			TagRequest tagRequest = TagRequest.newBuilder()
								.setTagName(tagNamesGiven[index])
								.setGroupName(groupNamesGiven[index])
								.build();
			requestBuilder.addTagRequest(tagRequest);
		}

		MultipleTagsRequest request = requestBuilder.build();

		MultipleTagsReply reply;

		try {
	      	reply = blockingStub.getMultipleTags(request);
	    } catch (StatusRuntimeException e) {
	      	logger.log(Level.WARNING, "Unable to retrieve multiple tags" +  "' from server '" + this.currentServer + "'", e.getStatus());
	      	throw(e);
	    }



		JSONArray tagsData = new JSONArray();
	    for (TagReply tagReply : reply.getTagReplyList()){

		    JSONObject tagData = new JSONObject();
		    tagData.put("clientHandle", tagReply.getClientHandle());
			//add item name
			tagData.put("itemName", tagReply.getItemName());
			//add item  activity
			tagData.put("active", tagReply.getActive());
			//add access accessPath
			tagData.put("accessPath", tagReply.getAccessPath());
			//add time stamp
			tagData.put("timeStamp", tagReply.getTimeStamp());
			//add item data type
			tagData.put("dataType", tagReply.getDataType());
			//add item value
			tagData.put("value", tagReply.getValue());
			//add item quality
			tagData.put("quality", tagReply.getQuality());

			tagsData.add(tagData);
	    }

	    return tagsData;
	}

	public List<String> getAvailableTagsInGroup(String groupName){
		if (!this.connected) {return new ArrayList<String>();}
	    logger.info("Getting Existing Tags in Groups from '" + groupName + "' from server '" + this.currentServer + "'");

		GroupTagsRequest request = GroupTagsRequest.newBuilder().setGroupName(groupName).build();
		GroupTagsReply reply;

		try {
	      	reply = blockingStub.getGroupTags(request);
	    } catch (StatusRuntimeException e) {
	      	logger.log(Level.WARNING, "Unable to retrieve tags from group '" + groupName +  "' from server '" + this.currentServer + "'", e.getStatus());
	      	throw(e);
	    }

	    return reply.getTagNamesList();
	}

	public List<String> getExistingGroups(){
		if (!this.connected) {return new ArrayList<String>();}
	    logger.info("Getting Existing Groups from  '" + this.currentServer+ "'");

	    GroupsRequest request = GroupsRequest.newBuilder().setRequest("GetGroups").build();
	    GroupsReply reply;

	    try {
	      	reply = blockingStub.getGroups(request);
	    } catch (StatusRuntimeException e) {
	      	logger.log(Level.WARNING, "Unable to retrieve groups from server '" + this.currentServer + "'", e.getStatus());
	      	throw(e);
	    }

	    return reply.getGroupNamesList();

	}

	public String readTagsFromFile(String srcFile, String destFile){
		if(!this.connected){return "";}
		logger.info("Reading tags from file '" + srcFile + "'");

		TagGroupFileRequest request = TagGroupFileRequest.newBuilder().setSrcPathTagGroup(srcFile).setDestPath(destFile).build();
		SuccessfulWritingReply reply;

		try{
				reply = blockingStub.readTagsFromFile(request);
		}catch (StatusRuntimeException e){
			logger.log(Level.WARNING, "Unable to read from file '" + srcFile + "'", e.getStatus());
			throw(e);
		}

		return reply.getSuccess();

	}

}
