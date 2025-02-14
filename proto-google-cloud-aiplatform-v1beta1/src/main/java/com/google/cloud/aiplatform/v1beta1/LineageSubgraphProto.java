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
// source: google/cloud/aiplatform/v1beta1/lineage_subgraph.proto

package com.google.cloud.aiplatform.v1beta1;

public final class LineageSubgraphProto {
  private LineageSubgraphProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_LineageSubgraph_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_LineageSubgraph_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/lineag"
          + "e_subgraph.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\031google/api/resource.proto\032.go"
          + "ogle/cloud/aiplatform/v1beta1/artifact.p"
          + "roto\032+google/cloud/aiplatform/v1beta1/ev"
          + "ent.proto\032/google/cloud/aiplatform/v1bet"
          + "a1/execution.proto\032\034google/api/annotatio"
          + "ns.proto\"\232\002\n\017LineageSubgraph\022e\n\tartifact"
          + "s\030\001 \003(\0132).google.cloud.aiplatform.v1beta"
          + "1.ArtifactB\'\372A$\n\"aiplatform.googleapis.c"
          + "om/Artifact\022h\n\nexecutions\030\002 \003(\0132*.google"
          + ".cloud.aiplatform.v1beta1.ExecutionB(\372A%"
          + "\n#aiplatform.googleapis.com/Execution\0226\n"
          + "\006events\030\003 \003(\0132&.google.cloud.aiplatform."
          + "v1beta1.EventB\361\001\n#com.google.cloud.aipla"
          + "tform.v1beta1B\024LineageSubgraphProtoP\001ZIg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/aiplatform/v1beta1;aiplatform\252\002\037Googl"
          + "e.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clou"
          + "d\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AI"
          + "Platform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EventProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_LineageSubgraph_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_LineageSubgraph_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_LineageSubgraph_descriptor,
            new java.lang.String[] {
              "Artifacts", "Executions", "Events",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EventProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExecutionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
