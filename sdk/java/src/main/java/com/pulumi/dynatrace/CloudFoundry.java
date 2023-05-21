// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.CloudFoundryArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.CloudFoundryState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/cloudFoundry:CloudFoundry")
public class CloudFoundry extends com.pulumi.resources.CustomResource {
    /**
     * ActiveGate group
     * 
     */
    @Export(name="activeGateGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> activeGateGroup;

    /**
     * @return ActiveGate group
     * 
     */
    public Output<Optional<String>> activeGateGroup() {
        return Codegen.optional(this.activeGateGroup);
    }
    /**
     * Cloud Foundry API Target
     * 
     */
    @Export(name="apiUrl", refs={String.class}, tree="[0]")
    private Output<String> apiUrl;

    /**
     * @return Cloud Foundry API Target
     * 
     */
    public Output<String> apiUrl() {
        return this.apiUrl;
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
     * Name this connection
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return Name this connection
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * Cloud Foundry Authentication Endpoint
     * 
     */
    @Export(name="loginUrl", refs={String.class}, tree="[0]")
    private Output<String> loginUrl;

    /**
     * @return Cloud Foundry Authentication Endpoint
     * 
     */
    public Output<String> loginUrl() {
        return this.loginUrl;
    }
    /**
     * Cloud Foundry Password
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return Cloud Foundry Password
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Cloud Foundry Username
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Cloud Foundry Username
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudFoundry(String name) {
        this(name, CloudFoundryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudFoundry(String name, CloudFoundryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudFoundry(String name, CloudFoundryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/cloudFoundry:CloudFoundry", name, args == null ? CloudFoundryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudFoundry(String name, Output<String> id, @Nullable CloudFoundryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/cloudFoundry:CloudFoundry", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static CloudFoundry get(String name, Output<String> id, @Nullable CloudFoundryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudFoundry(name, id, state, options);
    }
}
