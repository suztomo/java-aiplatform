// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/annotation_spec.proto

package com.google.cloud.aiplatform.v1beta1;

public interface AnnotationSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.AnnotationSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the AnnotationSpec.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the AnnotationSpec.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The user-defined name of the AnnotationSpec.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The user-defined name of the AnnotationSpec.
   * The name can be up to 128 characters long and can be consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. Timestamp when this AnnotationSpec was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this AnnotationSpec was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this AnnotationSpec was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when AnnotationSpec was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when AnnotationSpec was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when AnnotationSpec was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
