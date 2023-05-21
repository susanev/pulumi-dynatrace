// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.EnvironmentArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.EnvironmentState;
import com.pulumi.dynatrace.outputs.EnvironmentQuotas;
import com.pulumi.dynatrace.outputs.EnvironmentStorage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Dynatrace Documentation
 * 
 * - Manage your monitoring environments - https://www.dynatrace.com/support/help/setup-and-configuration/dynatrace-managed/operation/manage-your-monitoring-environments
 * 
 * - Cluster API v2 - Environments - https://www.dynatrace.com/support/help/shortlink/cluster-api#environments
 * 
 */
@ResourceType(type="dynatrace:index/environment:Environment")
public class Environment extends com.pulumi.resources.CustomResource {
    /**
     * The display name of the environment
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The display name of the environment
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Environment level consumption and quotas information
     * 
     */
    @Export(name="quotas", refs={EnvironmentQuotas.class}, tree="[0]")
    private Output</* @Nullable */ EnvironmentQuotas> quotas;

    /**
     * @return Environment level consumption and quotas information
     * 
     */
    public Output<Optional<EnvironmentQuotas>> quotas() {
        return Codegen.optional(this.quotas);
    }
    /**
     * Indicates whether the environment is enabled or disabled. Possible values are `ENABLED` and `DISABLED`. The default value is ENABLED
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Indicates whether the environment is enabled or disabled. Possible values are `ENABLED` and `DISABLED`. The default value is ENABLED
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Environment level storage usage and limit information
     * 
     */
    @Export(name="storage", refs={EnvironmentStorage.class}, tree="[0]")
    private Output<EnvironmentStorage> storage;

    /**
     * @return Environment level storage usage and limit information
     * 
     */
    public Output<EnvironmentStorage> storage() {
        return this.storage;
    }
    /**
     * A set of tags that are assigned to this environment. Every tag can have a maximum length of 100 characters
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A set of tags that are assigned to this environment. Every tag can have a maximum length of 100 characters
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies whether the environment is a trial environment or a non-trial environment. Creating a trial environment is only possible if your license allows that. The default value is false (non-trial)
     * 
     */
    @Export(name="trial", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> trial;

    /**
     * @return Specifies whether the environment is a trial environment or a non-trial environment. Creating a trial environment is only possible if your license allows that. The default value is false (non-trial)
     * 
     */
    public Output<Optional<Boolean>> trial() {
        return Codegen.optional(this.trial);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/environment:Environment", name, state, makeResourceOptions(options, id));
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
    public static Environment get(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
