// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.IamPolicyBindingsArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.IamPolicyBindingsState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/iamPolicyBindings:IamPolicyBindings")
public class IamPolicyBindings extends com.pulumi.resources.CustomResource {
    /**
     * The UUID of the account (`urn:dtaccount:&lt;account-uuid&gt;`). The attribute `policies` must contain ONLY policies defined for that account. The prefix `urn:dtaccount:` MUST be omitted here.
     * 
     */
    @Export(name="account", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> account;

    /**
     * @return The UUID of the account (`urn:dtaccount:&lt;account-uuid&gt;`). The attribute `policies` must contain ONLY policies defined for that account. The prefix `urn:dtaccount:` MUST be omitted here.
     * 
     */
    public Output<Optional<String>> account() {
        return Codegen.optional(this.account);
    }
    /**
     * The ID of the environment (https://\n\n.live.dynatrace.com). The attribute `policies` must contain ONLY policies defined for that environment.
     * 
     */
    @Export(name="environment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> environment;

    /**
     * @return The ID of the environment (https://\n\n.live.dynatrace.com). The attribute `policies` must contain ONLY policies defined for that environment.
     * 
     */
    public Output<Optional<String>> environment() {
        return Codegen.optional(this.environment);
    }
    /**
     * The name of the policy
     * 
     */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output<String> group;

    /**
     * @return The name of the policy
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * A list of IDs referring to policies bound to that group. It&#39;s not possible to mix policies here that are defined for different scopes (different accounts or environments) than specified via attributes `account` or `environment`.
     * 
     */
    @Export(name="policies", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> policies;

    /**
     * @return A list of IDs referring to policies bound to that group. It&#39;s not possible to mix policies here that are defined for different scopes (different accounts or environments) than specified via attributes `account` or `environment`.
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamPolicyBindings(String name) {
        this(name, IamPolicyBindingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamPolicyBindings(String name, IamPolicyBindingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamPolicyBindings(String name, IamPolicyBindingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/iamPolicyBindings:IamPolicyBindings", name, args == null ? IamPolicyBindingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IamPolicyBindings(String name, Output<String> id, @Nullable IamPolicyBindingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/iamPolicyBindings:IamPolicyBindings", name, state, makeResourceOptions(options, id));
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
    public static IamPolicyBindings get(String name, Output<String> id, @Nullable IamPolicyBindingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IamPolicyBindings(name, id, state, options);
    }
}
