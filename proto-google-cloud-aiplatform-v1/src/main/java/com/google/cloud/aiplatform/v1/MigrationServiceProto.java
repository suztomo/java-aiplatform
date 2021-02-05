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
// source: google/cloud/aiplatform/v1/migration_service.proto

package com.google.cloud.aiplatform.v1;

public final class MigrationServiceProto {
  private MigrationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlModelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_PartialResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1/migration_s"
          + "ervice.proto\022\032google.cloud.aiplatform.v1"
          + "\032(google/cloud/aiplatform/v1/dataset.pro"
          + "to\032&google/cloud/aiplatform/v1/model.pro"
          + "to\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\0324g"
          + "oogle/cloud/aiplatform/v1/migratable_res"
          + "ource.proto\032*google/cloud/aiplatform/v1/"
          + "operation.proto\032#google/longrunning/oper"
          + "ations.proto\032\027google/rpc/status.proto\"\224\001"
          + "\n SearchMigratableResourcesRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis"
          + ".com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"\212\001\n!SearchM"
          + "igratableResourcesResponse\022L\n\024migratable"
          + "_resources\030\001 \003(\0132..google.cloud.aiplatfo"
          + "rm.v1.MigratableResource\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\"\265\001\n\034BatchMigrateResourcesReque"
          + "st\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.go"
          + "ogleapis.com/Location\022Z\n\031migrate_resourc"
          + "e_requests\030\002 \003(\01322.google.cloud.aiplatfo"
          + "rm.v1.MigrateResourceRequestB\003\340A\002\"\342\n\n\026Mi"
          + "grateResourceRequest\022\206\001\n&migrate_ml_engi"
          + "ne_model_version_config\030\001 \001(\0132T.google.c"
          + "loud.aiplatform.v1.MigrateResourceReques"
          + "t.MigrateMlEngineModelVersionConfigH\000\022r\n"
          + "\033migrate_automl_model_config\030\002 \001(\0132K.goo"
          + "gle.cloud.aiplatform.v1.MigrateResourceR"
          + "equest.MigrateAutomlModelConfigH\000\022v\n\035mig"
          + "rate_automl_dataset_config\030\003 \001(\0132M.googl"
          + "e.cloud.aiplatform.v1.MigrateResourceReq"
          + "uest.MigrateAutomlDatasetConfigH\000\022\203\001\n$mi"
          + "grate_data_labeling_dataset_config\030\004 \001(\013"
          + "2S.google.cloud.aiplatform.v1.MigrateRes"
          + "ourceRequest.MigrateDataLabelingDatasetC"
          + "onfigH\000\032\225\001\n!MigrateMlEngineModelVersionC"
          + "onfig\022\025\n\010endpoint\030\001 \001(\tB\003\340A\002\0228\n\rmodel_ve"
          + "rsion\030\002 \001(\tB!\340A\002\372A\033\n\031ml.googleapis.com/V"
          + "ersion\022\037\n\022model_display_name\030\003 \001(\tB\003\340A\002\032"
          + "o\n\030MigrateAutomlModelConfig\0222\n\005model\030\001 \001"
          + "(\tB#\340A\002\372A\035\n\033automl.googleapis.com/Model\022"
          + "\037\n\022model_display_name\030\002 \001(\tB\003\340A\001\032w\n\032Migr"
          + "ateAutomlDatasetConfig\0226\n\007dataset\030\001 \001(\tB"
          + "%\340A\002\372A\037\n\035automl.googleapis.com/Dataset\022!"
          + "\n\024dataset_display_name\030\002 \001(\tB\003\340A\002\032\277\003\n Mi"
          + "grateDataLabelingDatasetConfig\022<\n\007datase"
          + "t\030\001 \001(\tB+\340A\002\372A%\n#datalabeling.googleapis"
          + ".com/Dataset\022!\n\024dataset_display_name\030\002 \001"
          + "(\tB\003\340A\001\022\273\001\n/migrate_data_labeling_annota"
          + "ted_dataset_configs\030\003 \003(\0132}.google.cloud"
          + ".aiplatform.v1.MigrateResourceRequest.Mi"
          + "grateDataLabelingDatasetConfig.MigrateDa"
          + "taLabelingAnnotatedDatasetConfigB\003\340A\001\032|\n"
          + ")MigrateDataLabelingAnnotatedDatasetConf"
          + "ig\022O\n\021annotated_dataset\030\001 \001(\tB4\340A\002\372A.\n,d"
          + "atalabeling.googleapis.com/AnnotatedData"
          + "setB\t\n\007request\"x\n\035BatchMigrateResourcesR"
          + "esponse\022W\n\032migrate_resource_responses\030\001 "
          + "\003(\01323.google.cloud.aiplatform.v1.Migrate"
          + "ResourceResponse\"\355\001\n\027MigrateResourceResp"
          + "onse\0229\n\007dataset\030\001 \001(\tB&\372A#\n!aiplatform.g"
          + "oogleapis.com/DatasetH\000\0225\n\005model\030\002 \001(\tB$"
          + "\372A!\n\037aiplatform.googleapis.com/ModelH\000\022K"
          + "\n\023migratable_resource\030\003 \001(\0132..google.clo"
          + "ud.aiplatform.v1.MigratableResourceB\023\n\021m"
          + "igrated_resource\"\333\003\n&BatchMigrateResourc"
          + "esOperationMetadata\022N\n\020generic_metadata\030"
          + "\001 \001(\01324.google.cloud.aiplatform.v1.Gener"
          + "icOperationMetadata\022i\n\017partial_results\030\002"
          + " \003(\0132P.google.cloud.aiplatform.v1.BatchM"
          + "igrateResourcesOperationMetadata.Partial"
          + "Result\032\365\001\n\rPartialResult\022#\n\005error\030\002 \001(\0132"
          + "\022.google.rpc.StatusH\000\0225\n\005model\030\003 \001(\tB$\372A"
          + "!\n\037aiplatform.googleapis.com/ModelH\000\0229\n\007"
          + "dataset\030\004 \001(\tB&\372A#\n!aiplatform.googleapi"
          + "s.com/DatasetH\000\022C\n\007request\030\001 \001(\01322.googl"
          + "e.cloud.aiplatform.v1.MigrateResourceReq"
          + "uestB\010\n\006result2\202\005\n\020MigrationService\022\354\001\n\031"
          + "SearchMigratableResources\022<.google.cloud"
          + ".aiplatform.v1.SearchMigratableResources"
          + "Request\032=.google.cloud.aiplatform.v1.Sea"
          + "rchMigratableResourcesResponse\"R\202\323\344\223\002C\">"
          + "/v1/{parent=projects/*/locations/*}/migr"
          + "atableResources:search:\001*\332A\006parent\022\257\002\n\025B"
          + "atchMigrateResources\0228.google.cloud.aipl"
          + "atform.v1.BatchMigrateResourcesRequest\032\035"
          + ".google.longrunning.Operation\"\274\001\202\323\344\223\002I\"D"
          + "/v1/{parent=projects/*/locations/*}/migr"
          + "atableResources:batchMigrate:\001*\332A parent"
          + ",migrate_resource_requests\312AG\n\035BatchMigr"
          + "ateResourcesResponse\022&BatchMigrateResour"
          + "cesOperationMetadata\032M\312A\031aiplatform.goog"
          + "leapis.com\322A.https://www.googleapis.com/"
          + "auth/cloud-platformB\177\n\036com.google.cloud."
          + "aiplatform.v1B\025MigrationServiceProtoP\001ZD"
          + "google.golang.org/genproto/googleapis/cl"
          + "oud/aiplatform/v1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.aiplatform.v1.DatasetProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MigratableResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SearchMigratableResourcesResponse_descriptor,
            new java.lang.String[] {
              "MigratableResources", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MigrateResourceRequests",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor,
            new java.lang.String[] {
              "MigrateMlEngineModelVersionConfig",
              "MigrateAutomlModelConfig",
              "MigrateAutomlDatasetConfig",
              "MigrateDataLabelingDatasetConfig",
              "Request",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateMlEngineModelVersionConfig_descriptor,
            new java.lang.String[] {
              "Endpoint", "ModelVersion", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlModelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlModelConfig_descriptor,
            new java.lang.String[] {
              "Model", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateAutomlDatasetConfig_descriptor,
            new java.lang.String[] {
              "Dataset", "DatasetDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor,
            new java.lang.String[] {
              "Dataset", "DatasetDisplayName", "MigrateDataLabelingAnnotatedDatasetConfigs",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceRequest_MigrateDataLabelingDatasetConfig_MigrateDataLabelingAnnotatedDatasetConfig_descriptor,
            new java.lang.String[] {
              "AnnotatedDataset",
            });
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesResponse_descriptor,
            new java.lang.String[] {
              "MigrateResourceResponses",
            });
    internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_MigrateResourceResponse_descriptor,
            new java.lang.String[] {
              "Dataset", "Model", "MigratableResource", "MigratedResource",
            });
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "PartialResults",
            });
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor =
        internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_PartialResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BatchMigrateResourcesOperationMetadata_PartialResult_descriptor,
            new java.lang.String[] {
              "Error", "Model", "Dataset", "Request", "Result",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.cloud.aiplatform.v1.DatasetProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MigratableResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
