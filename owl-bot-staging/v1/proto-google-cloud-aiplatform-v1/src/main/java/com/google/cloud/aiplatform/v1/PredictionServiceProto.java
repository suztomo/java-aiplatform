// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1/prediction_" +
      "service.proto\022\032google.cloud.aiplatform.v" +
      "1\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/httpbody.proto\032\031go" +
      "ogle/api/resource.proto\032\034google/protobuf" +
      "/struct.proto\"\252\001\n\016PredictRequest\022<\n\010endp" +
      "oint\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapi" +
      "s.com/Endpoint\022.\n\tinstances\030\002 \003(\0132\026.goog" +
      "le.protobuf.ValueB\003\340A\002\022*\n\nparameters\030\003 \001" +
      "(\0132\026.google.protobuf.Value\"Y\n\017PredictRes" +
      "ponse\022+\n\013predictions\030\001 \003(\0132\026.google.prot" +
      "obuf.Value\022\031\n\021deployed_model_id\030\002 \001(\t2\367\002" +
      "\n\021PredictionService\022\222\002\n\007Predict\022*.google" +
      ".cloud.aiplatform.v1.PredictRequest\032+.go" +
      "ogle.cloud.aiplatform.v1.PredictResponse" +
      "\"\255\001\202\323\344\223\002\206\001\"9/v1/{endpoint=projects/*/loc" +
      "ations/*/endpoints/*}:predict:\001*ZF\"A/v1/" +
      "{endpoint=projects/*/locations/*/endpoin" +
      "ts/*}:predictInternal:\001*\332A\035endpoint,para" +
      "meters,instances\032M\312A\031aiplatform.googleap" +
      "is.com\322A.https://www.googleapis.com/auth" +
      "/cloud-platformB\332\001\n\036com.google.cloud.aip" +
      "latform.v1B\026PredictionServiceProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/clou" +
      "d/aiplatform/v1;aiplatform\252\002\032Google.Clou" +
      "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor" +
      "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.HttpBodyProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", "Parameters", });
    internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor,
        new java.lang.String[] { "Predictions", "DeployedModelId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
