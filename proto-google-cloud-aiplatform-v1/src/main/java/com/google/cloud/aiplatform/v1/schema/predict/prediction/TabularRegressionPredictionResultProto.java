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
// source: google/cloud/aiplatform/v1/schema/predict/prediction/tabular_regression.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class TabularRegressionPredictionResultProto {
  private TabularRegressionPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularRegressionPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/prediction/tabular_regression.proto\022"
          + "4google.cloud.aiplatform.v1.schema.predi"
          + "ct.prediction\032\034google/api/annotations.pr"
          + "oto\"\\\n!TabularRegressionPredictionResult"
          + "\022\r\n\005value\030\001 \001(\002\022\023\n\013lower_bound\030\002 \001(\002\022\023\n\013"
          + "upper_bound\030\003 \001(\002B\304\001\n8com.google.cloud.a"
          + "iplatform.v1.schema.predict.predictionB&"
          + "TabularRegressionPredictionResultProtoP\001"
          + "Z^google.golang.org/genproto/googleapis/"
          + "cloud/aiplatform/v1/schema/predict/predi"
          + "ction;predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularRegressionPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularRegressionPredictionResult_descriptor,
            new java.lang.String[] {
              "Value", "LowerBound", "UpperBound",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
