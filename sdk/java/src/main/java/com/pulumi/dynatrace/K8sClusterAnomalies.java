// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.K8sClusterAnomaliesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesState;
import com.pulumi.dynatrace.outputs.K8sClusterAnomaliesCpuRequestsSaturation;
import com.pulumi.dynatrace.outputs.K8sClusterAnomaliesMemoryRequestsSaturation;
import com.pulumi.dynatrace.outputs.K8sClusterAnomaliesMonitoringIssues;
import com.pulumi.dynatrace.outputs.K8sClusterAnomaliesPodsSaturation;
import com.pulumi.dynatrace.outputs.K8sClusterAnomaliesReadinessIssues;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/k8sClusterAnomalies:K8sClusterAnomalies")
public class K8sClusterAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * no documentation available
     * 
     */
    @Export(name="cpuRequestsSaturation", refs={K8sClusterAnomaliesCpuRequestsSaturation.class}, tree="[0]")
    private Output<K8sClusterAnomaliesCpuRequestsSaturation> cpuRequestsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sClusterAnomaliesCpuRequestsSaturation> cpuRequestsSaturation() {
        return this.cpuRequestsSaturation;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="memoryRequestsSaturation", refs={K8sClusterAnomaliesMemoryRequestsSaturation.class}, tree="[0]")
    private Output<K8sClusterAnomaliesMemoryRequestsSaturation> memoryRequestsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sClusterAnomaliesMemoryRequestsSaturation> memoryRequestsSaturation() {
        return this.memoryRequestsSaturation;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="monitoringIssues", refs={K8sClusterAnomaliesMonitoringIssues.class}, tree="[0]")
    private Output<K8sClusterAnomaliesMonitoringIssues> monitoringIssues;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sClusterAnomaliesMonitoringIssues> monitoringIssues() {
        return this.monitoringIssues;
    }
    /**
     * no documentation available
     * 
     */
    @Export(name="podsSaturation", refs={K8sClusterAnomaliesPodsSaturation.class}, tree="[0]")
    private Output<K8sClusterAnomaliesPodsSaturation> podsSaturation;

    /**
     * @return no documentation available
     * 
     */
    public Output<K8sClusterAnomaliesPodsSaturation> podsSaturation() {
        return this.podsSaturation;
    }
    /**
     * Alerts if cluster has not been ready for a given amount of time
     * 
     */
    @Export(name="readinessIssues", refs={K8sClusterAnomaliesReadinessIssues.class}, tree="[0]")
    private Output<K8sClusterAnomaliesReadinessIssues> readinessIssues;

    /**
     * @return Alerts if cluster has not been ready for a given amount of time
     * 
     */
    public Output<K8sClusterAnomaliesReadinessIssues> readinessIssues() {
        return this.readinessIssues;
    }
    /**
     * The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (KUBERNETES_CLUSTER). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public K8sClusterAnomalies(String name) {
        this(name, K8sClusterAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public K8sClusterAnomalies(String name, K8sClusterAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public K8sClusterAnomalies(String name, K8sClusterAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sClusterAnomalies:K8sClusterAnomalies", name, args == null ? K8sClusterAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private K8sClusterAnomalies(String name, Output<String> id, @Nullable K8sClusterAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/k8sClusterAnomalies:K8sClusterAnomalies", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static K8sClusterAnomalies get(String name, Output<String> id, @Nullable K8sClusterAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new K8sClusterAnomalies(name, id, state, options);
    }
}
