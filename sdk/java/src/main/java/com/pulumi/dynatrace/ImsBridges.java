// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ImsBridgesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ImsBridgesState;
import com.pulumi.dynatrace.outputs.ImsBridgesQueueManager;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/imsBridges:ImsBridges")
public class ImsBridges extends com.pulumi.resources.CustomResource {
    /**
     * The name of the IMS bridge
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the IMS bridge
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Queue manager(s) that belong to the IMS bridge
     * 
     */
    @Export(name="queueManagers", refs={List.class,ImsBridgesQueueManager.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ImsBridgesQueueManager>> queueManagers;

    /**
     * @return Queue manager(s) that belong to the IMS bridge
     * 
     */
    public Output<Optional<List<ImsBridgesQueueManager>>> queueManagers() {
        return Codegen.optional(this.queueManagers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImsBridges(String name) {
        this(name, ImsBridgesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImsBridges(String name, @Nullable ImsBridgesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImsBridges(String name, @Nullable ImsBridgesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/imsBridges:ImsBridges", name, args == null ? ImsBridgesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImsBridges(String name, Output<String> id, @Nullable ImsBridgesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/imsBridges:ImsBridges", name, state, makeResourceOptions(options, id));
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
    public static ImsBridges get(String name, Output<String> id, @Nullable ImsBridgesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImsBridges(name, id, state, options);
    }
}
