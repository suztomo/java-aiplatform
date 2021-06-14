// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreProto {
  private FeaturestoreProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/featur" +
      "estore.proto\022\037google.cloud.aiplatform.v1" +
      "beta1\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032\037google/protob" +
      "uf/timestamp.proto\032\034google/api/annotatio" +
      "ns.proto\"\262\005\n\014Featurestore\022\021\n\004name\030\001 \001(\tB" +
      "\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google.proto" +
      "buf.TimestampB\003\340A\003\0224\n\013update_time\030\004 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\022\021\n\004etag" +
      "\030\005 \001(\tB\003\340A\001\022N\n\006labels\030\006 \003(\01329.google.clo" +
      "ud.aiplatform.v1beta1.Featurestore.Label" +
      "sEntryB\003\340A\001\022e\n\025online_serving_config\030\007 \001" +
      "(\0132A.google.cloud.aiplatform.v1beta1.Fea" +
      "turestore.OnlineServingConfigB\003\340A\002\022G\n\005st" +
      "ate\030\010 \001(\01623.google.cloud.aiplatform.v1be" +
      "ta1.Featurestore.StateB\003\340A\003\0324\n\023OnlineSer" +
      "vingConfig\022\035\n\020fixed_node_count\030\002 \001(\005B\003\340A" +
      "\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\t:\0028\001\"8\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000" +
      "\022\n\n\006STABLE\020\001\022\014\n\010UPDATING\020\002:q\352An\n&aiplatf" +
      "orm.googleapis.com/Featurestore\022Dproject" +
      "s/{project}/locations/{location}/feature" +
      "stores/{featurestore}B\205\001\n#com.google.clo" +
      "ud.aiplatform.v1beta1B\021FeaturestoreProto" +
      "P\001ZIgoogle.golang.org/genproto/googleapi" +
      "s/cloud/aiplatform/v1beta1;aiplatformb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Etag", "Labels", "OnlineServingConfig", "State", });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor,
        new java.lang.String[] { "FixedNodeCount", });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}