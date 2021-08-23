// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/specialist_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class SpecialistPoolServiceProto {
  private SpecialistPoolServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GetSpecialistPoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeleteSpecialistPoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1beta1/specia" +
      "list_pool_service.proto\022\037google.cloud.ai" +
      "platform.v1beta1\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032/google/cloud/aiplatform/v1b" +
      "eta1/operation.proto\0325google/cloud/aipla" +
      "tform/v1beta1/specialist_pool.proto\032#goo" +
      "gle/longrunning/operations.proto\032 google" +
      "/protobuf/field_mask.proto\"\247\001\n\033CreateSpe" +
      "cialistPoolRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372" +
      "A#\n!locations.googleapis.com/Location\022M\n" +
      "\017specialist_pool\030\002 \001(\0132/.google.cloud.ai" +
      "platform.v1beta1.SpecialistPoolB\003\340A\002\"|\n%" +
      "CreateSpecialistPoolOperationMetadata\022S\n" +
      "\020generic_metadata\030\001 \001(\01329.google.cloud.a" +
      "iplatform.v1beta1.GenericOperationMetada" +
      "ta\"Z\n\030GetSpecialistPoolRequest\022>\n\004name\030\001" +
      " \001(\tB0\340A\002\372A*\n(aiplatform.googleapis.com/" +
      "SpecialistPool\"\255\001\n\032ListSpecialistPoolsRe" +
      "quest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations" +
      ".googleapis.com/Location\022\021\n\tpage_size\030\002 " +
      "\001(\005\022\022\n\npage_token\030\003 \001(\t\022-\n\tread_mask\030\004 \001" +
      "(\0132\032.google.protobuf.FieldMask\"\201\001\n\033ListS" +
      "pecialistPoolsResponse\022I\n\020specialist_poo" +
      "ls\030\001 \003(\0132/.google.cloud.aiplatform.v1bet" +
      "a1.SpecialistPool\022\027\n\017next_page_token\030\002 \001" +
      "(\t\"l\n\033DeleteSpecialistPoolRequest\022>\n\004nam" +
      "e\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.googleapis.c" +
      "om/SpecialistPool\022\r\n\005force\030\002 \001(\010\"\242\001\n\033Upd" +
      "ateSpecialistPoolRequest\022M\n\017specialist_p" +
      "ool\030\001 \001(\0132/.google.cloud.aiplatform.v1be" +
      "ta1.SpecialistPoolB\003\340A\002\0224\n\013update_mask\030\002" +
      " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\307\001" +
      "\n%UpdateSpecialistPoolOperationMetadata\022" +
      "I\n\017specialist_pool\030\001 \001(\tB0\340A\003\372A*\n(aiplat" +
      "form.googleapis.com/SpecialistPool\022S\n\020ge" +
      "neric_metadata\030\002 \001(\01329.google.cloud.aipl" +
      "atform.v1beta1.GenericOperationMetadata2" +
      "\320\n\n\025SpecialistPoolService\022\232\002\n\024CreateSpec" +
      "ialistPool\022<.google.cloud.aiplatform.v1b" +
      "eta1.CreateSpecialistPoolRequest\032\035.googl" +
      "e.longrunning.Operation\"\244\001\202\323\344\223\002K\"8/v1bet" +
      "a1/{parent=projects/*/locations/*}/speci" +
      "alistPools:\017specialist_pool\332A\026parent,spe" +
      "cialist_pool\312A7\n\016SpecialistPool\022%CreateS" +
      "pecialistPoolOperationMetadata\022\310\001\n\021GetSp" +
      "ecialistPool\0229.google.cloud.aiplatform.v" +
      "1beta1.GetSpecialistPoolRequest\032/.google" +
      ".cloud.aiplatform.v1beta1.SpecialistPool" +
      "\"G\202\323\344\223\002:\0228/v1beta1/{name=projects/*/loca" +
      "tions/*/specialistPools/*}\332A\004name\022\333\001\n\023Li" +
      "stSpecialistPools\022;.google.cloud.aiplatf" +
      "orm.v1beta1.ListSpecialistPoolsRequest\032<" +
      ".google.cloud.aiplatform.v1beta1.ListSpe" +
      "cialistPoolsResponse\"I\202\323\344\223\002:\0228/v1beta1/{" +
      "parent=projects/*/locations/*}/specialis" +
      "tPools\332A\006parent\022\357\001\n\024DeleteSpecialistPool" +
      "\022<.google.cloud.aiplatform.v1beta1.Delet" +
      "eSpecialistPoolRequest\032\035.google.longrunn" +
      "ing.Operation\"z\202\323\344\223\002:*8/v1beta1/{name=pr" +
      "ojects/*/locations/*/specialistPools/*}\332" +
      "A\004name\312A0\n\025google.protobuf.Empty\022\027Delete" +
      "OperationMetadata\022\257\002\n\024UpdateSpecialistPo" +
      "ol\022<.google.cloud.aiplatform.v1beta1.Upd" +
      "ateSpecialistPoolRequest\032\035.google.longru" +
      "nning.Operation\"\271\001\202\323\344\223\002[2H/v1beta1/{spec" +
      "ialist_pool.name=projects/*/locations/*/" +
      "specialistPools/*}:\017specialist_pool\332A\033sp" +
      "ecialist_pool,update_mask\312A7\n\016Specialist" +
      "Pool\022%UpdateSpecialistPoolOperationMetad" +
      "ata\032M\312A\031aiplatform.googleapis.com\322A.http" +
      "s://www.googleapis.com/auth/cloud-platfo" +
      "rmB\367\001\n#com.google.cloud.aiplatform.v1bet" +
      "a1B\032SpecialistPoolServiceProtoP\001ZIgoogle" +
      ".golang.org/genproto/googleapis/cloud/ai" +
      "platform/v1beta1;aiplatform\252\002\037Google.Clo" +
      "ud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIP" +
      "latform\\V1beta1\352\002\"Google::Cloud::AIPlatf" +
      "orm::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolRequest_descriptor,
        new java.lang.String[] { "Parent", "SpecialistPool", });
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateSpecialistPoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_GetSpecialistPoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetSpecialistPoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GetSpecialistPoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "ReadMask", });
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListSpecialistPoolsResponse_descriptor,
        new java.lang.String[] { "SpecialistPools", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteSpecialistPoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteSpecialistPoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeleteSpecialistPoolRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolRequest_descriptor,
        new java.lang.String[] { "SpecialistPool", "UpdateMask", });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UpdateSpecialistPoolOperationMetadata_descriptor,
        new java.lang.String[] { "SpecialistPool", "GenericMetadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
