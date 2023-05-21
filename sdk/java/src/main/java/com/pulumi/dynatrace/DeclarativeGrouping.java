// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.DeclarativeGroupingArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.DeclarativeGroupingState;
import com.pulumi.dynatrace.outputs.DeclarativeGroupingDetection;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/declarativeGrouping:DeclarativeGrouping")
public class DeclarativeGrouping extends com.pulumi.resources.CustomResource {
    /**
     * Enter a descriptive process group display name and a unique identifier that Dynatrace can use to recognize this process
     * group.
     * 
     */
    @Export(name="detection", refs={DeclarativeGroupingDetection.class}, tree="[0]")
    private Output</* @Nullable */ DeclarativeGroupingDetection> detection;

    /**
     * @return Enter a descriptive process group display name and a unique identifier that Dynatrace can use to recognize this process
     * group.
     * 
     */
    public Output<Optional<DeclarativeGroupingDetection>> detection() {
        return Codegen.optional(this.detection);
    }
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
     * Monitored technology name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Monitored technology name
     * 
     */
    public Output<String> name() {
        return this.name;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeclarativeGrouping(String name) {
        this(name, DeclarativeGroupingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeclarativeGrouping(String name, DeclarativeGroupingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeclarativeGrouping(String name, DeclarativeGroupingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/declarativeGrouping:DeclarativeGrouping", name, args == null ? DeclarativeGroupingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeclarativeGrouping(String name, Output<String> id, @Nullable DeclarativeGroupingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/declarativeGrouping:DeclarativeGrouping", name, state, makeResourceOptions(options, id));
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
    public static DeclarativeGrouping get(String name, Output<String> id, @Nullable DeclarativeGroupingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeclarativeGrouping(name, id, state, options);
    }
}
