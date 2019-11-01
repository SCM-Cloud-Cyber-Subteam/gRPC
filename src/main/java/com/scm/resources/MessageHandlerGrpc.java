package com.scm.resources;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: scmmessages.proto")
public final class MessageHandlerGrpc {

  private MessageHandlerGrpc() {}

  public static final String SERVICE_NAME = "com.scm.resources.MessageHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.scm.resources.ConnectRequest,
      com.scm.resources.ConnectReply> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connect",
      requestType = com.scm.resources.ConnectRequest.class,
      responseType = com.scm.resources.ConnectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scm.resources.ConnectRequest,
      com.scm.resources.ConnectReply> getConnectMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.ConnectRequest, com.scm.resources.ConnectReply> getConnectMethod;
    if ((getConnectMethod = MessageHandlerGrpc.getConnectMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getConnectMethod = MessageHandlerGrpc.getConnectMethod) == null) {
          MessageHandlerGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.ConnectRequest, com.scm.resources.ConnectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.ConnectReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.GroupsRequest,
      com.scm.resources.GroupsReply> getGetGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroups",
      requestType = com.scm.resources.GroupsRequest.class,
      responseType = com.scm.resources.GroupsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scm.resources.GroupsRequest,
      com.scm.resources.GroupsReply> getGetGroupsMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.GroupsRequest, com.scm.resources.GroupsReply> getGetGroupsMethod;
    if ((getGetGroupsMethod = MessageHandlerGrpc.getGetGroupsMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getGetGroupsMethod = MessageHandlerGrpc.getGetGroupsMethod) == null) {
          MessageHandlerGrpc.getGetGroupsMethod = getGetGroupsMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.GroupsRequest, com.scm.resources.GroupsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.GroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.GroupsReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("getGroups"))
              .build();
        }
      }
    }
    return getGetGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.GroupTagsRequest,
      com.scm.resources.GroupTagsReply> getGetGroupTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGroupTags",
      requestType = com.scm.resources.GroupTagsRequest.class,
      responseType = com.scm.resources.GroupTagsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scm.resources.GroupTagsRequest,
      com.scm.resources.GroupTagsReply> getGetGroupTagsMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.GroupTagsRequest, com.scm.resources.GroupTagsReply> getGetGroupTagsMethod;
    if ((getGetGroupTagsMethod = MessageHandlerGrpc.getGetGroupTagsMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getGetGroupTagsMethod = MessageHandlerGrpc.getGetGroupTagsMethod) == null) {
          MessageHandlerGrpc.getGetGroupTagsMethod = getGetGroupTagsMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.GroupTagsRequest, com.scm.resources.GroupTagsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGroupTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.GroupTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.GroupTagsReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("getGroupTags"))
              .build();
        }
      }
    }
    return getGetGroupTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.TagRequest,
      com.scm.resources.TagReply> getGetTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTag",
      requestType = com.scm.resources.TagRequest.class,
      responseType = com.scm.resources.TagReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scm.resources.TagRequest,
      com.scm.resources.TagReply> getGetTagMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.TagRequest, com.scm.resources.TagReply> getGetTagMethod;
    if ((getGetTagMethod = MessageHandlerGrpc.getGetTagMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getGetTagMethod = MessageHandlerGrpc.getGetTagMethod) == null) {
          MessageHandlerGrpc.getGetTagMethod = getGetTagMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.TagRequest, com.scm.resources.TagReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.TagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.TagReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("getTag"))
              .build();
        }
      }
    }
    return getGetTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.MultipleTagsRequest,
      com.scm.resources.MultipleTagsReply> getGetMultipleTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMultipleTags",
      requestType = com.scm.resources.MultipleTagsRequest.class,
      responseType = com.scm.resources.MultipleTagsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.scm.resources.MultipleTagsRequest,
      com.scm.resources.MultipleTagsReply> getGetMultipleTagsMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.MultipleTagsRequest, com.scm.resources.MultipleTagsReply> getGetMultipleTagsMethod;
    if ((getGetMultipleTagsMethod = MessageHandlerGrpc.getGetMultipleTagsMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getGetMultipleTagsMethod = MessageHandlerGrpc.getGetMultipleTagsMethod) == null) {
          MessageHandlerGrpc.getGetMultipleTagsMethod = getGetMultipleTagsMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.MultipleTagsRequest, com.scm.resources.MultipleTagsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMultipleTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.MultipleTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.MultipleTagsReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("getMultipleTags"))
              .build();
        }
      }
    }
    return getGetMultipleTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.TagGroupFileRequest,
      com.scm.resources.SuccessfulWritingReply> getReadTagsFromFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readTagsFromFile",
      requestType = com.scm.resources.TagGroupFileRequest.class,
      responseType = com.scm.resources.SuccessfulWritingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.scm.resources.TagGroupFileRequest,
      com.scm.resources.SuccessfulWritingReply> getReadTagsFromFileMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.TagGroupFileRequest, com.scm.resources.SuccessfulWritingReply> getReadTagsFromFileMethod;
    if ((getReadTagsFromFileMethod = MessageHandlerGrpc.getReadTagsFromFileMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getReadTagsFromFileMethod = MessageHandlerGrpc.getReadTagsFromFileMethod) == null) {
          MessageHandlerGrpc.getReadTagsFromFileMethod = getReadTagsFromFileMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.TagGroupFileRequest, com.scm.resources.SuccessfulWritingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readTagsFromFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.TagGroupFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.SuccessfulWritingReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("readTagsFromFile"))
              .build();
        }
      }
    }
    return getReadTagsFromFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.scm.resources.TagGroupTwoFileRequest,
      com.scm.resources.MultipleTagsReply> getReadTagsFromSeparateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readTagsFromSeparateFile",
      requestType = com.scm.resources.TagGroupTwoFileRequest.class,
      responseType = com.scm.resources.MultipleTagsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.scm.resources.TagGroupTwoFileRequest,
      com.scm.resources.MultipleTagsReply> getReadTagsFromSeparateFileMethod() {
    io.grpc.MethodDescriptor<com.scm.resources.TagGroupTwoFileRequest, com.scm.resources.MultipleTagsReply> getReadTagsFromSeparateFileMethod;
    if ((getReadTagsFromSeparateFileMethod = MessageHandlerGrpc.getReadTagsFromSeparateFileMethod) == null) {
      synchronized (MessageHandlerGrpc.class) {
        if ((getReadTagsFromSeparateFileMethod = MessageHandlerGrpc.getReadTagsFromSeparateFileMethod) == null) {
          MessageHandlerGrpc.getReadTagsFromSeparateFileMethod = getReadTagsFromSeparateFileMethod =
              io.grpc.MethodDescriptor.<com.scm.resources.TagGroupTwoFileRequest, com.scm.resources.MultipleTagsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readTagsFromSeparateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.TagGroupTwoFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.scm.resources.MultipleTagsReply.getDefaultInstance()))
              .setSchemaDescriptor(new MessageHandlerMethodDescriptorSupplier("readTagsFromSeparateFile"))
              .build();
        }
      }
    }
    return getReadTagsFromSeparateFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageHandlerStub newStub(io.grpc.Channel channel) {
    return new MessageHandlerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessageHandlerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessageHandlerFutureStub(channel);
  }

  /**
   */
  public static abstract class MessageHandlerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC for connection/confirmation message
     * </pre>
     */
    public void connect(com.scm.resources.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.ConnectReply> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC get groups/tag info
     * </pre>
     */
    public void getGroups(com.scm.resources.GroupsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.GroupsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupsMethod(), responseObserver);
    }

    /**
     */
    public void getGroupTags(com.scm.resources.GroupTagsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.GroupTagsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC for getting tag values (single)
     * </pre>
     */
    public void getTag(com.scm.resources.TagRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.TagReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC for getting tag values (multiple)
     * </pre>
     */
    public void getMultipleTags(com.scm.resources.MultipleTagsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMultipleTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading a single file
     * </pre>
     */
    public void readTagsFromFile(com.scm.resources.TagGroupFileRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.SuccessfulWritingReply> responseObserver) {
      asyncUnimplementedUnaryCall(getReadTagsFromFileMethod(), responseObserver);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading separate files for groups/tagNames
     * </pre>
     */
    public void readTagsFromSeparateFile(com.scm.resources.TagGroupTwoFileRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getReadTagsFromSeparateFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.scm.resources.ConnectRequest,
                com.scm.resources.ConnectReply>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getGetGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.scm.resources.GroupsRequest,
                com.scm.resources.GroupsReply>(
                  this, METHODID_GET_GROUPS)))
          .addMethod(
            getGetGroupTagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.scm.resources.GroupTagsRequest,
                com.scm.resources.GroupTagsReply>(
                  this, METHODID_GET_GROUP_TAGS)))
          .addMethod(
            getGetTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.scm.resources.TagRequest,
                com.scm.resources.TagReply>(
                  this, METHODID_GET_TAG)))
          .addMethod(
            getGetMultipleTagsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.scm.resources.MultipleTagsRequest,
                com.scm.resources.MultipleTagsReply>(
                  this, METHODID_GET_MULTIPLE_TAGS)))
          .addMethod(
            getReadTagsFromFileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.scm.resources.TagGroupFileRequest,
                com.scm.resources.SuccessfulWritingReply>(
                  this, METHODID_READ_TAGS_FROM_FILE)))
          .addMethod(
            getReadTagsFromSeparateFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.scm.resources.TagGroupTwoFileRequest,
                com.scm.resources.MultipleTagsReply>(
                  this, METHODID_READ_TAGS_FROM_SEPARATE_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class MessageHandlerStub extends io.grpc.stub.AbstractStub<MessageHandlerStub> {
    private MessageHandlerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageHandlerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageHandlerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageHandlerStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for connection/confirmation message
     * </pre>
     */
    public void connect(com.scm.resources.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.ConnectReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC get groups/tag info
     * </pre>
     */
    public void getGroups(com.scm.resources.GroupsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.GroupsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGroupTags(com.scm.resources.GroupTagsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.GroupTagsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC for getting tag values (single)
     * </pre>
     */
    public void getTag(com.scm.resources.TagRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.TagReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC for getting tag values (multiple)
     * </pre>
     */
    public void getMultipleTags(com.scm.resources.MultipleTagsRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMultipleTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading a single file
     * </pre>
     */
    public void readTagsFromFile(com.scm.resources.TagGroupFileRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.SuccessfulWritingReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadTagsFromFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading separate files for groups/tagNames
     * </pre>
     */
    public void readTagsFromSeparateFile(com.scm.resources.TagGroupTwoFileRequest request,
        io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReadTagsFromSeparateFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageHandlerBlockingStub extends io.grpc.stub.AbstractStub<MessageHandlerBlockingStub> {
    private MessageHandlerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageHandlerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageHandlerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageHandlerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for connection/confirmation message
     * </pre>
     */
    public com.scm.resources.ConnectReply connect(com.scm.resources.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC get groups/tag info
     * </pre>
     */
    public com.scm.resources.GroupsReply getGroups(com.scm.resources.GroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.scm.resources.GroupTagsReply getGroupTags(com.scm.resources.GroupTagsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC for getting tag values (single)
     * </pre>
     */
    public com.scm.resources.TagReply getTag(com.scm.resources.TagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC for getting tag values (multiple)
     * </pre>
     */
    public java.util.Iterator<com.scm.resources.MultipleTagsReply> getMultipleTags(
        com.scm.resources.MultipleTagsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMultipleTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading a single file
     * </pre>
     */
    public com.scm.resources.SuccessfulWritingReply readTagsFromFile(com.scm.resources.TagGroupFileRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadTagsFromFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading separate files for groups/tagNames
     * </pre>
     */
    public java.util.Iterator<com.scm.resources.MultipleTagsReply> readTagsFromSeparateFile(
        com.scm.resources.TagGroupTwoFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getReadTagsFromSeparateFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageHandlerFutureStub extends io.grpc.stub.AbstractStub<MessageHandlerFutureStub> {
    private MessageHandlerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageHandlerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageHandlerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageHandlerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for connection/confirmation message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scm.resources.ConnectReply> connect(
        com.scm.resources.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC get groups/tag info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scm.resources.GroupsReply> getGroups(
        com.scm.resources.GroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scm.resources.GroupTagsReply> getGroupTags(
        com.scm.resources.GroupTagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RPC for getting tag values (single)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scm.resources.TagReply> getTag(
        com.scm.resources.TagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *RPC for getting tag values from reading a single file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.scm.resources.SuccessfulWritingReply> readTagsFromFile(
        com.scm.resources.TagGroupFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadTagsFromFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECT = 0;
  private static final int METHODID_GET_GROUPS = 1;
  private static final int METHODID_GET_GROUP_TAGS = 2;
  private static final int METHODID_GET_TAG = 3;
  private static final int METHODID_GET_MULTIPLE_TAGS = 4;
  private static final int METHODID_READ_TAGS_FROM_FILE = 5;
  private static final int METHODID_READ_TAGS_FROM_SEPARATE_FILE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECT:
          serviceImpl.connect((com.scm.resources.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.ConnectReply>) responseObserver);
          break;
        case METHODID_GET_GROUPS:
          serviceImpl.getGroups((com.scm.resources.GroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.GroupsReply>) responseObserver);
          break;
        case METHODID_GET_GROUP_TAGS:
          serviceImpl.getGroupTags((com.scm.resources.GroupTagsRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.GroupTagsReply>) responseObserver);
          break;
        case METHODID_GET_TAG:
          serviceImpl.getTag((com.scm.resources.TagRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.TagReply>) responseObserver);
          break;
        case METHODID_GET_MULTIPLE_TAGS:
          serviceImpl.getMultipleTags((com.scm.resources.MultipleTagsRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply>) responseObserver);
          break;
        case METHODID_READ_TAGS_FROM_FILE:
          serviceImpl.readTagsFromFile((com.scm.resources.TagGroupFileRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.SuccessfulWritingReply>) responseObserver);
          break;
        case METHODID_READ_TAGS_FROM_SEPARATE_FILE:
          serviceImpl.readTagsFromSeparateFile((com.scm.resources.TagGroupTwoFileRequest) request,
              (io.grpc.stub.StreamObserver<com.scm.resources.MultipleTagsReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MessageHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.scm.resources.Scmmessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageHandler");
    }
  }

  private static final class MessageHandlerFileDescriptorSupplier
      extends MessageHandlerBaseDescriptorSupplier {
    MessageHandlerFileDescriptorSupplier() {}
  }

  private static final class MessageHandlerMethodDescriptorSupplier
      extends MessageHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageHandlerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MessageHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageHandlerFileDescriptorSupplier())
              .addMethod(getConnectMethod())
              .addMethod(getGetGroupsMethod())
              .addMethod(getGetGroupTagsMethod())
              .addMethod(getGetTagMethod())
              .addMethod(getGetMultipleTagsMethod())
              .addMethod(getReadTagsFromFileMethod())
              .addMethod(getReadTagsFromSeparateFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
