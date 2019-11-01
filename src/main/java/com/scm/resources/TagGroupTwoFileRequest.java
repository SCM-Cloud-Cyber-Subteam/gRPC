// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scmmessages.proto

package com.scm.resources;

/**
 * Protobuf type {@code com.scm.resources.TagGroupTwoFileRequest}
 */
public  final class TagGroupTwoFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.scm.resources.TagGroupTwoFileRequest)
    TagGroupTwoFileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TagGroupTwoFileRequest.newBuilder() to construct.
  private TagGroupTwoFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TagGroupTwoFileRequest() {
    filePathTag_ = "";
    filePathGroup_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TagGroupTwoFileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TagGroupTwoFileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            filePathTag_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filePathGroup_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagGroupTwoFileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagGroupTwoFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scm.resources.TagGroupTwoFileRequest.class, com.scm.resources.TagGroupTwoFileRequest.Builder.class);
  }

  public static final int FILEPATHTAG_FIELD_NUMBER = 1;
  private volatile java.lang.Object filePathTag_;
  /**
   * <code>string filePathTag = 1;</code>
   * @return The filePathTag.
   */
  public java.lang.String getFilePathTag() {
    java.lang.Object ref = filePathTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePathTag_ = s;
      return s;
    }
  }
  /**
   * <code>string filePathTag = 1;</code>
   * @return The bytes for filePathTag.
   */
  public com.google.protobuf.ByteString
      getFilePathTagBytes() {
    java.lang.Object ref = filePathTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filePathTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILEPATHGROUP_FIELD_NUMBER = 2;
  private volatile java.lang.Object filePathGroup_;
  /**
   * <code>string filePathGroup = 2;</code>
   * @return The filePathGroup.
   */
  public java.lang.String getFilePathGroup() {
    java.lang.Object ref = filePathGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePathGroup_ = s;
      return s;
    }
  }
  /**
   * <code>string filePathGroup = 2;</code>
   * @return The bytes for filePathGroup.
   */
  public com.google.protobuf.ByteString
      getFilePathGroupBytes() {
    java.lang.Object ref = filePathGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filePathGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFilePathTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePathTag_);
    }
    if (!getFilePathGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filePathGroup_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilePathTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePathTag_);
    }
    if (!getFilePathGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filePathGroup_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.scm.resources.TagGroupTwoFileRequest)) {
      return super.equals(obj);
    }
    com.scm.resources.TagGroupTwoFileRequest other = (com.scm.resources.TagGroupTwoFileRequest) obj;

    if (!getFilePathTag()
        .equals(other.getFilePathTag())) return false;
    if (!getFilePathGroup()
        .equals(other.getFilePathGroup())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FILEPATHTAG_FIELD_NUMBER;
    hash = (53 * hash) + getFilePathTag().hashCode();
    hash = (37 * hash) + FILEPATHGROUP_FIELD_NUMBER;
    hash = (53 * hash) + getFilePathGroup().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagGroupTwoFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.scm.resources.TagGroupTwoFileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.scm.resources.TagGroupTwoFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.scm.resources.TagGroupTwoFileRequest)
      com.scm.resources.TagGroupTwoFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagGroupTwoFileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagGroupTwoFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scm.resources.TagGroupTwoFileRequest.class, com.scm.resources.TagGroupTwoFileRequest.Builder.class);
    }

    // Construct using com.scm.resources.TagGroupTwoFileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      filePathTag_ = "";

      filePathGroup_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagGroupTwoFileRequest_descriptor;
    }

    @java.lang.Override
    public com.scm.resources.TagGroupTwoFileRequest getDefaultInstanceForType() {
      return com.scm.resources.TagGroupTwoFileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scm.resources.TagGroupTwoFileRequest build() {
      com.scm.resources.TagGroupTwoFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scm.resources.TagGroupTwoFileRequest buildPartial() {
      com.scm.resources.TagGroupTwoFileRequest result = new com.scm.resources.TagGroupTwoFileRequest(this);
      result.filePathTag_ = filePathTag_;
      result.filePathGroup_ = filePathGroup_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.scm.resources.TagGroupTwoFileRequest) {
        return mergeFrom((com.scm.resources.TagGroupTwoFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scm.resources.TagGroupTwoFileRequest other) {
      if (other == com.scm.resources.TagGroupTwoFileRequest.getDefaultInstance()) return this;
      if (!other.getFilePathTag().isEmpty()) {
        filePathTag_ = other.filePathTag_;
        onChanged();
      }
      if (!other.getFilePathGroup().isEmpty()) {
        filePathGroup_ = other.filePathGroup_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.scm.resources.TagGroupTwoFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scm.resources.TagGroupTwoFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object filePathTag_ = "";
    /**
     * <code>string filePathTag = 1;</code>
     * @return The filePathTag.
     */
    public java.lang.String getFilePathTag() {
      java.lang.Object ref = filePathTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePathTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filePathTag = 1;</code>
     * @return The bytes for filePathTag.
     */
    public com.google.protobuf.ByteString
        getFilePathTagBytes() {
      java.lang.Object ref = filePathTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filePathTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filePathTag = 1;</code>
     * @param value The filePathTag to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filePathTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filePathTag = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilePathTag() {
      
      filePathTag_ = getDefaultInstance().getFilePathTag();
      onChanged();
      return this;
    }
    /**
     * <code>string filePathTag = 1;</code>
     * @param value The bytes for filePathTag to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filePathTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filePathGroup_ = "";
    /**
     * <code>string filePathGroup = 2;</code>
     * @return The filePathGroup.
     */
    public java.lang.String getFilePathGroup() {
      java.lang.Object ref = filePathGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePathGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filePathGroup = 2;</code>
     * @return The bytes for filePathGroup.
     */
    public com.google.protobuf.ByteString
        getFilePathGroupBytes() {
      java.lang.Object ref = filePathGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filePathGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filePathGroup = 2;</code>
     * @param value The filePathGroup to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filePathGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filePathGroup = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFilePathGroup() {
      
      filePathGroup_ = getDefaultInstance().getFilePathGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string filePathGroup = 2;</code>
     * @param value The bytes for filePathGroup to set.
     * @return This builder for chaining.
     */
    public Builder setFilePathGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filePathGroup_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.scm.resources.TagGroupTwoFileRequest)
  }

  // @@protoc_insertion_point(class_scope:com.scm.resources.TagGroupTwoFileRequest)
  private static final com.scm.resources.TagGroupTwoFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scm.resources.TagGroupTwoFileRequest();
  }

  public static com.scm.resources.TagGroupTwoFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagGroupTwoFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<TagGroupTwoFileRequest>() {
    @java.lang.Override
    public TagGroupTwoFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TagGroupTwoFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TagGroupTwoFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagGroupTwoFileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scm.resources.TagGroupTwoFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

