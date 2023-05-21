// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ExtensionExecutionControllerArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ExtensionExecutionControllerState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/extensionExecutionController:ExtensionExecutionController")
public class ExtensionExecutionController extends com.pulumi.resources.CustomResource {
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Enable local PIPE/HTTP metric and Log Ingest API
     * 
     */
    @Export(name="ingestActive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ingestActive;

    /**
     * @return Enable local PIPE/HTTP metric and Log Ingest API
     * 
     */
    public Output<Optional<Boolean>> ingestActive() {
        return Codegen.optional(this.ingestActive);
    }
    /**
     * Possible Values: `DEFAULT`, `HIGH`
     * 
     */
    @Export(name="performanceProfile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> performanceProfile;

    /**
     * @return Possible Values: `DEFAULT`, `HIGH`
     * 
     */
    public Output<Optional<String>> performanceProfile() {
        return Codegen.optional(this.performanceProfile);
    }
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Enable Dynatrace StatsD
     * 
     */
    @Export(name="statsdActive", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> statsdActive;

    /**
     * @return Enable Dynatrace StatsD
     * 
     */
    public Output<Optional<Boolean>> statsdActive() {
        return Codegen.optional(this.statsdActive);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExtensionExecutionController(String name) {
        this(name, ExtensionExecutionControllerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExtensionExecutionController(String name, ExtensionExecutionControllerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExtensionExecutionController(String name, ExtensionExecutionControllerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/extensionExecutionController:ExtensionExecutionController", name, args == null ? ExtensionExecutionControllerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExtensionExecutionController(String name, Output<String> id, @Nullable ExtensionExecutionControllerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/extensionExecutionController:ExtensionExecutionController", name, state, makeResourceOptions(options, id));
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
    public static ExtensionExecutionController get(String name, Output<String> id, @Nullable ExtensionExecutionControllerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExtensionExecutionController(name, id, state, options);
    }
}
