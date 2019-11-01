// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scmmessages.proto

package com.scm.resources;

/**
 * Protobuf type {@code com.scm.resources.TagRequest}
 */
public  final class TagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.scm.resources.TagRequest)
    TagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TagRequest.newBuilder() to construct.
  private TagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TagRequest() {
    tagName_ = "";
    groupName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TagRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TagRequest(
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

            tagName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            groupName_ = s;
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
    return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.scm.resources.TagRequest.class, com.scm.resources.TagRequest.Builder.class);
  }

  public static final int TAGNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tagName_;
  /**
   * <code>string tagName = 1;</code>
   * @return The tagName.
   */
  public java.lang.String getTagName() {
    java.lang.Object ref = tagName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tagName_ = s;
      return s;
    }
  }
  /**
   * <code>string tagName = 1;</code>
   * @return The bytes for tagName.
   */
  public com.google.protobuf.ByteString
      getTagNameBytes() {
    java.lang.Object ref = tagName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tagName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUPNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object groupName_;
  /**
   * <code>string groupName = 2;</code>
   * @return The groupName.
   */
  public java.lang.String getGroupName() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupName_ = s;
      return s;
    }
  }
  /**
   * <code>string groupName = 2;</code>
   * @return The bytes for groupName.
   */
  public com.google.protobuf.ByteString
      getGroupNameBytes() {
    java.lang.Object ref = groupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupName_ = b;
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
    if (!getTagNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tagName_);
    }
    if (!getGroupNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTagNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tagName_);
    }
    if (!getGroupNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, groupName_);
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
    if (!(obj instanceof com.scm.resources.TagRequest)) {
      return super.equals(obj);
    }
    com.scm.resources.TagRequest other = (com.scm.resources.TagRequest) obj;

    if (!getTagName()
        .equals(other.getTagName())) return false;
    if (!getGroupName()
        .equals(other.getGroupName())) return false;
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
    hash = (37 * hash) + TAGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getTagName().hashCode();
    hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getGroupName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.scm.resources.TagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.scm.resources.TagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.scm.resources.TagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scm.resources.TagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.scm.resources.TagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.scm.resources.TagRequest parseFrom(
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
  public static Builder newBuilder(com.scm.resources.TagRequest prototype) {
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
   * Protobuf type {@code com.scm.resources.TagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.scm.resources.TagRequest)
      com.scm.resources.TagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scm.resources.TagRequest.class, com.scm.resources.TagRequest.Builder.class);
    }

    // Construct using com.scm.resources.TagRequest.newBuilder()
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
      tagName_ = "";

      groupName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.scm.resources.Scmmessages.internal_static_com_scm_resources_TagRequest_descriptor;
    }

    @java.lang.Override
    public com.scm.resources.TagRequest getDefaultInstanceForType() {
      return com.scm.resources.TagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.scm.resources.TagRequest build() {
      com.scm.resources.TagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.scm.resources.TagRequest buildPartial() {
      com.scm.resources.TagRequest result = new com.scm.resources.TagRequest(this);
      result.tagName_ = tagName_;
      result.groupName_ = groupName_;
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
      if (other instanceof com.scm.resources.TagRequest) {
        return mergeFrom((com.scm.resources.TagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.scm.resources.TagRequest other) {
      if (other == com.scm.resources.TagRequest.getDefaultInstance()) return this;
      if (!other.getTagName().isEmpty()) {
        tagName_ = other.tagName_;
        onChanged();
      }
      if (!other.getGroupName().isEmpty()) {
        groupName_ = other.groupName_;
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
      com.scm.resources.TagRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.scm.resources.TagRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tagName_ = "";
    /**
     * <code>string tagName = 1;</code>
     * @return The tagName.
     */
    public java.lang.String getTagName() {
      java.lang.Object ref = tagName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tagName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tagName = 1;</code>
     * @return The bytes for tagName.
     */
    public com.google.protobuf.ByteString
        getTagNameBytes() {
      java.lang.Object ref = tagName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tagName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tagName = 1;</code>
     * @param value The tagName to set.
     * @return This builder for chaining.
     */
    public Builder setTagName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tagName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tagName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTagName() {
      
      tagName_ = getDefaultInstance().getTagName();
      onChanged();
      return this;
    }
    /**
     * <code>string tagName = 1;</code>
     * @param value The bytes for tagName to set.
     * @return This builder for chaining.
     */
    public Builder setTagNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tagName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object groupName_ = "";
    /**
     * <code>string groupName = 2;</code>
     * @return The groupName.
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string groupName = 2;</code>
     * @return The bytes for groupName.
     */
    public com.google.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string groupName = 2;</code>
     * @param value The groupName to set.
     * @return This builder for chaining.
     */
    public Builder setGroupName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string groupName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupName() {
      
      groupName_ = getDefaultInstance().getGroupName();
      onChanged();
      return this;
    }
    /**
     * <code>string groupName = 2;</code>
     * @param value The bytes for groupName to set.
     * @return This builder for chaining.
     */
    public Builder setGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupName_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.scm.resources.TagRequest)
  }

  // @@protoc_insertion_point(class_scope:com.scm.resources.TagRequest)
  private static final com.scm.resources.TagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.scm.resources.TagRequest();
  }

  public static com.scm.resources.TagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagRequest>
      PARSER = new com.google.protobuf.AbstractParser<TagRequest>() {
    @java.lang.Override
    public TagRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TagRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.scm.resources.TagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

