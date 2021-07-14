// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/job_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface UpdateModelDeploymentMonitoringJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateModelDeploymentMonitoringJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the modelDeploymentMonitoringJob field is set.
   */
  boolean hasModelDeploymentMonitoringJob();
  /**
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The modelDeploymentMonitoringJob.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob getModelDeploymentMonitoringJob();
  /**
   * <pre>
   * Required. The model monitoring configuration which replaces the resource on the
   * server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJob model_deployment_monitoring_job = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobOrBuilder getModelDeploymentMonitoringJobOrBuilder();

  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
