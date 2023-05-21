// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.LogStorageArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.LogStorageState;
import com.pulumi.dynatrace.outputs.LogStorageMatchers;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/logStorage:LogStorage")
public class LogStorage extends com.pulumi.resources.CustomResource {
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
     * no documentation available
     * 
     */
    @Export(name="matchers", refs={LogStorageMatchers.class}, tree="[0]")
    private Output</* @Nullable */ LogStorageMatchers> matchers;

    /**
     * @return no documentation available
     * 
     */
    public Output<Optional<LogStorageMatchers>> matchers() {
        return Codegen.optional(this.matchers);
    }
    /**
     * Name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name
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
     * If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
     * 
     */
    @Export(name="sendToStorage", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> sendToStorage;

    /**
     * @return If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
     * 
     */
    public Output<Boolean> sendToStorage() {
        return this.sendToStorage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogStorage(String name) {
        this(name, LogStorageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogStorage(String name, LogStorageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogStorage(String name, LogStorageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logStorage:LogStorage", name, args == null ? LogStorageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogStorage(String name, Output<String> id, @Nullable LogStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logStorage:LogStorage", name, state, makeResourceOptions(options, id));
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
    public static LogStorage get(String name, Output<String> id, @Nullable LogStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogStorage(name, id, state, options);
    }
}
