// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_state.proto

package com.google.cloud.aiplatform.v1;

public final class JobStateProto {
  private JobStateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/aiplatform/v1/job_state.p" +
      "roto\022\032google.cloud.aiplatform.v1\032\034google" +
      "/api/annotations.proto*\370\001\n\010JobState\022\031\n\025J" +
      "OB_STATE_UNSPECIFIED\020\000\022\024\n\020JOB_STATE_QUEU" +
      "ED\020\001\022\025\n\021JOB_STATE_PENDING\020\002\022\025\n\021JOB_STATE" +
      "_RUNNING\020\003\022\027\n\023JOB_STATE_SUCCEEDED\020\004\022\024\n\020J" +
      "OB_STATE_FAILED\020\005\022\030\n\024JOB_STATE_CANCELLIN" +
      "G\020\006\022\027\n\023JOB_STATE_CANCELLED\020\007\022\024\n\020JOB_STAT" +
      "E_PAUSED\020\010\022\025\n\021JOB_STATE_EXPIRED\020\tB\321\001\n\036co" +
      "m.google.cloud.aiplatform.v1B\rJobStatePr" +
      "otoP\001ZDgoogle.golang.org/genproto/google" +
      "apis/cloud/aiplatform/v1;aiplatform\252\002\032Go" +
      "ogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\" +
      "AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfor" +
      "m::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
