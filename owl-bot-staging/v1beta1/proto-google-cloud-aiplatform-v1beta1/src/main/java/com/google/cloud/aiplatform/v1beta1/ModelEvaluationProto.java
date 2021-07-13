// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_evaluation.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelEvaluationProto {
  private ModelEvaluationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/model_" +
      "evaluation.proto\022\037google.cloud.aiplatfor" +
      "m.v1beta1\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\0321google/cl" +
      "oud/aiplatform/v1beta1/explanation.proto" +
      "\032\034google/protobuf/struct.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\034google/api/anno" +
      "tations.proto\"\226\005\n\017ModelEvaluation\022\021\n\004nam" +
      "e\030\001 \001(\tB\003\340A\003\022\037\n\022metrics_schema_uri\030\002 \001(\t" +
      "B\003\340A\003\022,\n\007metrics\030\003 \001(\0132\026.google.protobuf" +
      ".ValueB\003\340A\003\0224\n\013create_time\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\022\035\n\020slice_dimen" +
      "sions\030\005 \003(\tB\003\340A\003\022Q\n\021model_explanation\030\010 " +
      "\001(\01321.google.cloud.aiplatform.v1beta1.Mo" +
      "delExplanationB\003\340A\003\022o\n\021explanation_specs" +
      "\030\t \003(\0132O.google.cloud.aiplatform.v1beta1" +
      ".ModelEvaluation.ModelEvaluationExplanat" +
      "ionSpecB\003\340A\003\032\206\001\n\036ModelEvaluationExplanat" +
      "ionSpec\022\030\n\020explanation_type\030\001 \001(\t\022J\n\020exp" +
      "lanation_spec\030\002 \001(\01320.google.cloud.aipla" +
      "tform.v1beta1.ExplanationSpec:\177\352A|\n)aipl" +
      "atform.googleapis.com/ModelEvaluation\022Op" +
      "rojects/{project}/locations/{location}/m" +
      "odels/{model}/evaluations/{evaluation}B\210" +
      "\001\n#com.google.cloud.aiplatform.v1beta1B\024" +
      "ModelEvaluationProtoP\001ZIgoogle.golang.or" +
      "g/genproto/googleapis/cloud/aiplatform/v" +
      "1beta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor,
        new java.lang.String[] { "Name", "MetricsSchemaUri", "Metrics", "CreateTime", "SliceDimensions", "ModelExplanation", "ExplanationSpecs", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor,
        new java.lang.String[] { "ExplanationType", "ExplanationSpec", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
