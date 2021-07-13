// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/endpoint.proto

package com.google.cloud.aiplatform.v1;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/aiplatform/v1/endpoint.pr" +
      "oto\022\032google.cloud.aiplatform.v1\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\0320google/cloud/aiplatform/v1/" +
      "encryption_spec.proto\0322google/cloud/aipl" +
      "atform/v1/machine_resources.proto\032\037googl" +
      "e/protobuf/timestamp.proto\032\034google/api/a" +
      "nnotations.proto\"\261\005\n\010Endpoint\022\021\n\004name\030\001 " +
      "\001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013d" +
      "escription\030\003 \001(\t\022G\n\017deployed_models\030\004 \003(" +
      "\0132).google.cloud.aiplatform.v1.DeployedM" +
      "odelB\003\340A\003\022M\n\rtraffic_split\030\005 \003(\01326.googl" +
      "e.cloud.aiplatform.v1.Endpoint.TrafficSp" +
      "litEntry\022\014\n\004etag\030\006 \001(\t\022@\n\006labels\030\007 \003(\01320" +
      ".google.cloud.aiplatform.v1.Endpoint.Lab" +
      "elsEntry\0224\n\013create_time\030\010 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\t " +
      "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022C\n\017" +
      "encryption_spec\030\n \001(\0132*.google.cloud.aip" +
      "latform.v1.EncryptionSpec\0323\n\021TrafficSpli" +
      "tEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\032-" +
      "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t:\0028\001:e\352Ab\n\"aiplatform.googleapis.com/En" +
      "dpoint\022<projects/{project}/locations/{lo" +
      "cation}/endpoints/{endpoint}\"\265\003\n\rDeploye" +
      "dModel\022M\n\023dedicated_resources\030\007 \001(\0132..go" +
      "ogle.cloud.aiplatform.v1.DedicatedResour" +
      "cesH\000\022M\n\023automatic_resources\030\010 \001(\0132..goo" +
      "gle.cloud.aiplatform.v1.AutomaticResourc" +
      "esH\000\022\017\n\002id\030\001 \001(\tB\003\340A\003\0226\n\005model\030\002 \001(\tB\'\340A" +
      "\002\372A!\n\037aiplatform.googleapis.com/Model\022\024\n" +
      "\014display_name\030\003 \001(\t\0224\n\013create_time\030\006 \001(\013" +
      "2\032.google.protobuf.TimestampB\003\340A\003\022\027\n\017ser" +
      "vice_account\030\013 \001(\t\022!\n\031disable_container_" +
      "logging\030\017 \001(\010\022\035\n\025enable_access_logging\030\r" +
      " \001(\010B\026\n\024prediction_resourcesB\321\001\n\036com.goo" +
      "gle.cloud.aiplatform.v1B\rEndpointProtoP\001" +
      "ZDgoogle.golang.org/genproto/googleapis/" +
      "cloud/aiplatform/v1;aiplatform\252\002\032Google." +
      "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla" +
      "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "DeployedModels", "TrafficSplit", "Etag", "Labels", "CreateTime", "UpdateTime", "EncryptionSpec", });
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_TrafficSplitEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_Endpoint_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DeployedModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployedModel_descriptor,
        new java.lang.String[] { "DedicatedResources", "AutomaticResources", "Id", "Model", "DisplayName", "CreateTime", "ServiceAccount", "DisableContainerLogging", "EnableAccessLogging", "PredictionResources", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
