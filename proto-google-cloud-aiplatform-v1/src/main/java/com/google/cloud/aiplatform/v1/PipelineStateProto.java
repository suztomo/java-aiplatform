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
// source: google/cloud/aiplatform/v1/pipeline_state.proto

package com.google.cloud.aiplatform.v1;

public final class PipelineStateProto {
  private PipelineStateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1/pipeline_st"
          + "ate.proto\022\032google.cloud.aiplatform.v1\032\034g"
          + "oogle/api/annotations.proto*\223\002\n\rPipeline"
          + "State\022\036\n\032PIPELINE_STATE_UNSPECIFIED\020\000\022\031\n"
          + "\025PIPELINE_STATE_QUEUED\020\001\022\032\n\026PIPELINE_STA"
          + "TE_PENDING\020\002\022\032\n\026PIPELINE_STATE_RUNNING\020\003"
          + "\022\034\n\030PIPELINE_STATE_SUCCEEDED\020\004\022\031\n\025PIPELI"
          + "NE_STATE_FAILED\020\005\022\035\n\031PIPELINE_STATE_CANC"
          + "ELLING\020\006\022\034\n\030PIPELINE_STATE_CANCELLED\020\007\022\031"
          + "\n\025PIPELINE_STATE_PAUSED\020\010B\326\001\n\036com.google"
          + ".cloud.aiplatform.v1B\022PipelineStateProto"
          + "P\001ZDgoogle.golang.org/genproto/googleapi"
          + "s/cloud/aiplatform/v1;aiplatform\252\002\032Googl"
          + "e.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIP"
          + "latform\\V1\352\002\035Google::Cloud::AIPlatform::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}