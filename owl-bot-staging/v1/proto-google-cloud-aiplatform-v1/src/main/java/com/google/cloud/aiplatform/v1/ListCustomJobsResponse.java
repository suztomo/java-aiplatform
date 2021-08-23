// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Response message for [JobService.ListCustomJobs][google.cloud.aiplatform.v1.JobService.ListCustomJobs]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ListCustomJobsResponse}
 */
public final class ListCustomJobsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ListCustomJobsResponse)
    ListCustomJobsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCustomJobsResponse.newBuilder() to construct.
  private ListCustomJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCustomJobsResponse() {
    customJobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCustomJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCustomJobsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              customJobs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.CustomJob>();
              mutable_bitField0_ |= 0x00000001;
            }
            customJobs_.add(
                input.readMessage(com.google.cloud.aiplatform.v1.CustomJob.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        customJobs_ = java.util.Collections.unmodifiableList(customJobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListCustomJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListCustomJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ListCustomJobsResponse.class, com.google.cloud.aiplatform.v1.ListCustomJobsResponse.Builder.class);
  }

  public static final int CUSTOM_JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1.CustomJob> customJobs_;
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1.CustomJob> getCustomJobsList() {
    return customJobs_;
  }
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1.CustomJobOrBuilder> 
      getCustomJobsOrBuilderList() {
    return customJobs_;
  }
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  @java.lang.Override
  public int getCustomJobsCount() {
    return customJobs_.size();
  }
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CustomJob getCustomJobs(int index) {
    return customJobs_.get(index);
  }
  /**
   * <pre>
   * List of CustomJobs in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CustomJobOrBuilder getCustomJobsOrBuilder(
      int index) {
    return customJobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < customJobs_.size(); i++) {
      output.writeMessage(1, customJobs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < customJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, customJobs_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ListCustomJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ListCustomJobsResponse other = (com.google.cloud.aiplatform.v1.ListCustomJobsResponse) obj;

    if (!getCustomJobsList()
        .equals(other.getCustomJobsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getCustomJobsCount() > 0) {
      hash = (37 * hash) + CUSTOM_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ListCustomJobsResponse prototype) {
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
   * <pre>
   * Response message for [JobService.ListCustomJobs][google.cloud.aiplatform.v1.JobService.ListCustomJobs]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ListCustomJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ListCustomJobsResponse)
      com.google.cloud.aiplatform.v1.ListCustomJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListCustomJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListCustomJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ListCustomJobsResponse.class, com.google.cloud.aiplatform.v1.ListCustomJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ListCustomJobsResponse.newBuilder()
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
        getCustomJobsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (customJobsBuilder_ == null) {
        customJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        customJobsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.JobServiceProto.internal_static_google_cloud_aiplatform_v1_ListCustomJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListCustomJobsResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ListCustomJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListCustomJobsResponse build() {
      com.google.cloud.aiplatform.v1.ListCustomJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ListCustomJobsResponse buildPartial() {
      com.google.cloud.aiplatform.v1.ListCustomJobsResponse result = new com.google.cloud.aiplatform.v1.ListCustomJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (customJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          customJobs_ = java.util.Collections.unmodifiableList(customJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customJobs_ = customJobs_;
      } else {
        result.customJobs_ = customJobsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ListCustomJobsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ListCustomJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ListCustomJobsResponse other) {
      if (other == com.google.cloud.aiplatform.v1.ListCustomJobsResponse.getDefaultInstance()) return this;
      if (customJobsBuilder_ == null) {
        if (!other.customJobs_.isEmpty()) {
          if (customJobs_.isEmpty()) {
            customJobs_ = other.customJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomJobsIsMutable();
            customJobs_.addAll(other.customJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.customJobs_.isEmpty()) {
          if (customJobsBuilder_.isEmpty()) {
            customJobsBuilder_.dispose();
            customJobsBuilder_ = null;
            customJobs_ = other.customJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCustomJobsFieldBuilder() : null;
          } else {
            customJobsBuilder_.addAllMessages(other.customJobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.aiplatform.v1.ListCustomJobsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.ListCustomJobsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.aiplatform.v1.CustomJob> customJobs_ =
      java.util.Collections.emptyList();
    private void ensureCustomJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        customJobs_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1.CustomJob>(customJobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder> customJobsBuilder_;

    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.CustomJob> getCustomJobsList() {
      if (customJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customJobs_);
      } else {
        return customJobsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public int getCustomJobsCount() {
      if (customJobsBuilder_ == null) {
        return customJobs_.size();
      } else {
        return customJobsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJob getCustomJobs(int index) {
      if (customJobsBuilder_ == null) {
        return customJobs_.get(index);
      } else {
        return customJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder setCustomJobs(
        int index, com.google.cloud.aiplatform.v1.CustomJob value) {
      if (customJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomJobsIsMutable();
        customJobs_.set(index, value);
        onChanged();
      } else {
        customJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder setCustomJobs(
        int index, com.google.cloud.aiplatform.v1.CustomJob.Builder builderForValue) {
      if (customJobsBuilder_ == null) {
        ensureCustomJobsIsMutable();
        customJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        customJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder addCustomJobs(com.google.cloud.aiplatform.v1.CustomJob value) {
      if (customJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomJobsIsMutable();
        customJobs_.add(value);
        onChanged();
      } else {
        customJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder addCustomJobs(
        int index, com.google.cloud.aiplatform.v1.CustomJob value) {
      if (customJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomJobsIsMutable();
        customJobs_.add(index, value);
        onChanged();
      } else {
        customJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder addCustomJobs(
        com.google.cloud.aiplatform.v1.CustomJob.Builder builderForValue) {
      if (customJobsBuilder_ == null) {
        ensureCustomJobsIsMutable();
        customJobs_.add(builderForValue.build());
        onChanged();
      } else {
        customJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder addCustomJobs(
        int index, com.google.cloud.aiplatform.v1.CustomJob.Builder builderForValue) {
      if (customJobsBuilder_ == null) {
        ensureCustomJobsIsMutable();
        customJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        customJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder addAllCustomJobs(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1.CustomJob> values) {
      if (customJobsBuilder_ == null) {
        ensureCustomJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, customJobs_);
        onChanged();
      } else {
        customJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder clearCustomJobs() {
      if (customJobsBuilder_ == null) {
        customJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public Builder removeCustomJobs(int index) {
      if (customJobsBuilder_ == null) {
        ensureCustomJobsIsMutable();
        customJobs_.remove(index);
        onChanged();
      } else {
        customJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJob.Builder getCustomJobsBuilder(
        int index) {
      return getCustomJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJobOrBuilder getCustomJobsOrBuilder(
        int index) {
      if (customJobsBuilder_ == null) {
        return customJobs_.get(index);  } else {
        return customJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1.CustomJobOrBuilder> 
         getCustomJobsOrBuilderList() {
      if (customJobsBuilder_ != null) {
        return customJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customJobs_);
      }
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJob.Builder addCustomJobsBuilder() {
      return getCustomJobsFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.CustomJob.Builder addCustomJobsBuilder(
        int index) {
      return getCustomJobsFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1.CustomJob.getDefaultInstance());
    }
    /**
     * <pre>
     * List of CustomJobs in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1.CustomJob custom_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1.CustomJob.Builder> 
         getCustomJobsBuilderList() {
      return getCustomJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder> 
        getCustomJobsFieldBuilder() {
      if (customJobsBuilder_ == null) {
        customJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1.CustomJob, com.google.cloud.aiplatform.v1.CustomJob.Builder, com.google.cloud.aiplatform.v1.CustomJobOrBuilder>(
                customJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        customJobs_ = null;
      }
      return customJobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to [ListCustomJobsRequest.page_token][google.cloud.aiplatform.v1.ListCustomJobsRequest.page_token] to obtain that page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ListCustomJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ListCustomJobsResponse)
  private static final com.google.cloud.aiplatform.v1.ListCustomJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ListCustomJobsResponse();
  }

  public static com.google.cloud.aiplatform.v1.ListCustomJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCustomJobsResponse>() {
    @java.lang.Override
    public ListCustomJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCustomJobsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCustomJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ListCustomJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

