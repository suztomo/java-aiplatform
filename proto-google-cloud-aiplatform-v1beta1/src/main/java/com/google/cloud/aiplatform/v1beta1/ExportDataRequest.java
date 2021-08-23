/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataRequest}
 */
public final class ExportDataRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExportDataRequest)
    ExportDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportDataRequest.newBuilder() to construct.
  private ExportDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportDataRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportDataRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder subBuilder = null;
              if (exportConfig_ != null) {
                subBuilder = exportConfig_.toBuilder();
              }
              exportConfig_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.ExportDataConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(exportConfig_);
                exportConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExportDataRequest.class,
            com.google.cloud.aiplatform.v1beta1.ExportDataRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPORT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.ExportDataConfig exportConfig_;
  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the exportConfig field is set.
   */
  @java.lang.Override
  public boolean hasExportConfig() {
    return exportConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The exportConfig.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataConfig getExportConfig() {
    return exportConfig_ == null
        ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance()
        : exportConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder getExportConfigOrBuilder() {
    return getExportConfig();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (exportConfig_ != null) {
      output.writeMessage(2, getExportConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (exportConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExportConfig());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExportDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExportDataRequest other =
        (com.google.cloud.aiplatform.v1beta1.ExportDataRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasExportConfig() != other.hasExportConfig()) return false;
    if (hasExportConfig()) {
      if (!getExportConfig().equals(other.getExportConfig())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasExportConfig()) {
      hash = (37 * hash) + EXPORT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getExportConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExportDataRequest)
      com.google.cloud.aiplatform.v1beta1.ExportDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExportDataRequest.class,
              com.google.cloud.aiplatform.v1beta1.ExportDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExportDataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (exportConfigBuilder_ == null) {
        exportConfig_ = null;
      } else {
        exportConfig_ = null;
        exportConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExportDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest build() {
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest result =
          new com.google.cloud.aiplatform.v1beta1.ExportDataRequest(this);
      result.name_ = name_;
      if (exportConfigBuilder_ == null) {
        result.exportConfig_ = exportConfig_;
      } else {
        result.exportConfig_ = exportConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExportDataRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExportDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExportDataRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExportDataRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasExportConfig()) {
        mergeExportConfig(other.getExportConfig());
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
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.ExportDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.ExportDataConfig exportConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig,
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder,
            com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder>
        exportConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the exportConfig field is set.
     */
    public boolean hasExportConfig() {
      return exportConfigBuilder_ != null || exportConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The exportConfig.
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfig getExportConfig() {
      if (exportConfigBuilder_ == null) {
        return exportConfig_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance()
            : exportConfig_;
      } else {
        return exportConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExportConfig(com.google.cloud.aiplatform.v1beta1.ExportDataConfig value) {
      if (exportConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exportConfig_ = value;
        onChanged();
      } else {
        exportConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExportConfig(
        com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder builderForValue) {
      if (exportConfigBuilder_ == null) {
        exportConfig_ = builderForValue.build();
        onChanged();
      } else {
        exportConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExportConfig(com.google.cloud.aiplatform.v1beta1.ExportDataConfig value) {
      if (exportConfigBuilder_ == null) {
        if (exportConfig_ != null) {
          exportConfig_ =
              com.google.cloud.aiplatform.v1beta1.ExportDataConfig.newBuilder(exportConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          exportConfig_ = value;
        }
        onChanged();
      } else {
        exportConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExportConfig() {
      if (exportConfigBuilder_ == null) {
        exportConfig_ = null;
        onChanged();
      } else {
        exportConfig_ = null;
        exportConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder getExportConfigBuilder() {

      onChanged();
      return getExportConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder
        getExportConfigOrBuilder() {
      if (exportConfigBuilder_ != null) {
        return exportConfigBuilder_.getMessageOrBuilder();
      } else {
        return exportConfig_ == null
            ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance()
            : exportConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig,
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder,
            com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder>
        getExportConfigFieldBuilder() {
      if (exportConfigBuilder_ == null) {
        exportConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.ExportDataConfig,
                com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder,
                com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder>(
                getExportConfig(), getParentForChildren(), isClean());
        exportConfig_ = null;
      }
      return exportConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExportDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExportDataRequest)
  private static final com.google.cloud.aiplatform.v1beta1.ExportDataRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExportDataRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportDataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportDataRequest>() {
        @java.lang.Override
        public ExportDataRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportDataRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
