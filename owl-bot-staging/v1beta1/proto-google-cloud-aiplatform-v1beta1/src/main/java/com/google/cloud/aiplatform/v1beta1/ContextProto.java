// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/context.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ContextProto {
  private ContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/contex" +
      "t.proto\022\037google.cloud.aiplatform.v1beta1" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032+google/cloud/aipla" +
      "tform/v1beta1/value.proto\032\034google/protob" +
      "uf/struct.proto\032\037google/protobuf/timesta" +
      "mp.proto\032\034google/api/annotations.proto\"\330" +
      "\004\n\007Context\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display" +
      "_name\030\002 \001(\t\022\014\n\004etag\030\010 \001(\t\022D\n\006labels\030\t \003(" +
      "\01324.google.cloud.aiplatform.v1beta1.Cont" +
      "ext.LabelsEntry\0224\n\013create_time\030\n \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_" +
      "time\030\013 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\022B\n\017parent_contexts\030\014 \003(\tB)\340A\003\372A#\n!ai" +
      "platform.googleapis.com/Context\022\024\n\014schem" +
      "a_title\030\r \001(\t\022\026\n\016schema_version\030\016 \001(\t\022)\n" +
      "\010metadata\030\017 \001(\0132\027.google.protobuf.Struct" +
      "\022\023\n\013description\030\020 \001(\t\032-\n\013LabelsEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n!aipl" +
      "atform.googleapis.com/Context\022Zprojects/" +
      "{project}/locations/{location}/metadataS" +
      "tores/{metadata_store}/contexts/{context" +
      "}B\200\001\n#com.google.cloud.aiplatform.v1beta" +
      "1B\014ContextProtoP\001ZIgoogle.golang.org/gen" +
      "proto/googleapis/cloud/aiplatform/v1beta" +
      "1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Etag", "Labels", "CreateTime", "UpdateTime", "ParentContexts", "SchemaTitle", "SchemaVersion", "Metadata", "Description", });
    internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
