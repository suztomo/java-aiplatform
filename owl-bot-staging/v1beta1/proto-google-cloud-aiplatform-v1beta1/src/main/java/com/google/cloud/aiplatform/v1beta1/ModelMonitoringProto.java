// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitoringProto {
  private ModelMonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/model_" +
      "monitoring.proto\022\037google.cloud.aiplatfor" +
      "m.v1beta1\032\031google/api/resource.proto\032(go" +
      "ogle/cloud/aiplatform/v1beta1/io.proto\032\034" +
      "google/api/annotations.proto\"\344\n\n\036ModelMo" +
      "nitoringObjectiveConfig\022i\n\020training_data" +
      "set\030\001 \001(\0132O.google.cloud.aiplatform.v1be" +
      "ta1.ModelMonitoringObjectiveConfig.Train" +
      "ingDataset\022\230\001\n)training_prediction_skew_" +
      "detection_config\030\002 \001(\0132e.google.cloud.ai" +
      "platform.v1beta1.ModelMonitoringObjectiv" +
      "eConfig.TrainingPredictionSkewDetectionC" +
      "onfig\022\211\001\n!prediction_drift_detection_con" +
      "fig\030\003 \001(\0132^.google.cloud.aiplatform.v1be" +
      "ta1.ModelMonitoringObjectiveConfig.Predi" +
      "ctionDriftDetectionConfig\032\352\002\n\017TrainingDa" +
      "taset\0229\n\007dataset\030\003 \001(\tB&\372A#\n!aiplatform." +
      "googleapis.com/DatasetH\000\022@\n\ngcs_source\030\004" +
      " \001(\0132*.google.cloud.aiplatform.v1beta1.G" +
      "csSourceH\000\022J\n\017bigquery_source\030\005 \001(\0132/.go" +
      "ogle.cloud.aiplatform.v1beta1.BigQuerySo" +
      "urceH\000\022\023\n\013data_format\030\002 \001(\t\022\024\n\014target_fi" +
      "eld\030\006 \001(\t\022T\n\031logging_sampling_strategy\030\007" +
      " \001(\01321.google.cloud.aiplatform.v1beta1.S" +
      "amplingStrategyB\r\n\013data_source\032\245\002\n%Train" +
      "ingPredictionSkewDetectionConfig\022\222\001\n\017ske" +
      "w_thresholds\030\001 \003(\0132y.google.cloud.aiplat" +
      "form.v1beta1.ModelMonitoringObjectiveCon" +
      "fig.TrainingPredictionSkewDetectionConfi" +
      "g.SkewThresholdsEntry\032g\n\023SkewThresholdsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.googl" +
      "e.cloud.aiplatform.v1beta1.ThresholdConf" +
      "ig:\0028\001\032\232\002\n\036PredictionDriftDetectionConfi" +
      "g\022\215\001\n\020drift_thresholds\030\001 \003(\0132s.google.cl" +
      "oud.aiplatform.v1beta1.ModelMonitoringOb" +
      "jectiveConfig.PredictionDriftDetectionCo" +
      "nfig.DriftThresholdsEntry\032h\n\024DriftThresh" +
      "oldsEntry\022\013\n\003key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320." +
      "google.cloud.aiplatform.v1beta1.Threshol" +
      "dConfig:\0028\001\"\272\001\n\032ModelMonitoringAlertConf" +
      "ig\022j\n\022email_alert_config\030\001 \001(\0132L.google." +
      "cloud.aiplatform.v1beta1.ModelMonitoring" +
      "AlertConfig.EmailAlertConfigH\000\032\'\n\020EmailA" +
      "lertConfig\022\023\n\013user_emails\030\001 \003(\tB\007\n\005alert" +
      "\"/\n\017ThresholdConfig\022\017\n\005value\030\001 \001(\001H\000B\013\n\t" +
      "threshold\"\241\001\n\020SamplingStrategy\022b\n\024random" +
      "_sample_config\030\001 \001(\0132D.google.cloud.aipl" +
      "atform.v1beta1.SamplingStrategy.RandomSa" +
      "mpleConfig\032)\n\022RandomSampleConfig\022\023\n\013samp" +
      "le_rate\030\001 \001(\001B\210\001\n#com.google.cloud.aipla" +
      "tform.v1beta1B\024ModelMonitoringProtoP\001ZIg" +
      "oogle.golang.org/genproto/googleapis/clo" +
      "ud/aiplatform/v1beta1;aiplatformb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor,
        new java.lang.String[] { "TrainingDataset", "TrainingPredictionSkewDetectionConfig", "PredictionDriftDetectionConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor,
        new java.lang.String[] { "Dataset", "GcsSource", "BigquerySource", "DataFormat", "TargetField", "LoggingSamplingStrategy", "DataSource", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor,
        new java.lang.String[] { "SkewThresholds", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor,
        new java.lang.String[] { "DriftThresholds", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor,
        new java.lang.String[] { "EmailAlertConfig", "Alert", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor,
        new java.lang.String[] { "UserEmails", });
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor,
        new java.lang.String[] { "Value", "Threshold", });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor,
        new java.lang.String[] { "RandomSampleConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor,
        new java.lang.String[] { "SampleRate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
