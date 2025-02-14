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
// source: google/cloud/aiplatform/v1beta1/user_action_reference.proto

package com.google.cloud.aiplatform.v1beta1;

public final class UserActionReferenceProto {
  private UserActionReferenceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/aiplatform/v1beta1/user_a"
          + "ction_reference.proto\022\037google.cloud.aipl"
          + "atform.v1beta1\032\034google/api/annotations.p"
          + "roto\"d\n\023UserActionReference\022\023\n\toperation"
          + "\030\001 \001(\tH\000\022\033\n\021data_labeling_job\030\002 \001(\tH\000\022\016\n"
          + "\006method\030\003 \001(\tB\013\n\treferenceB\365\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\030UserActionRe"
          + "ferenceProtoP\001ZIgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1beta1;a"
          + "iplatform\252\002\037Google.Cloud.AIPlatform.V1Be"
          + "ta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\""
          + "Google::Cloud::AIPlatform::V1beta1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor,
            new java.lang.String[] {
              "Operation", "DataLabelingJob", "Method", "Reference",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
