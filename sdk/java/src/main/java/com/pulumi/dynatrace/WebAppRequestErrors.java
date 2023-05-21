// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.WebAppRequestErrorsArgs;
import com.pulumi.dynatrace.inputs.WebAppRequestErrorsState;
import com.pulumi.dynatrace.outputs.WebAppRequestErrorsErrorRules;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/webAppRequestErrors:WebAppRequestErrors")
public class WebAppRequestErrors extends com.pulumi.resources.CustomResource {
    /**
     * (Field has overlap with `dynatrace.ApplicationErrorRules`)
     * 
     */
    @Export(name="errorRules", refs={WebAppRequestErrorsErrorRules.class}, tree="[0]")
    private Output</* @Nullable */ WebAppRequestErrorsErrorRules> errorRules;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationErrorRules`)
     * 
     */
    public Output<Optional<WebAppRequestErrorsErrorRules>> errorRules() {
        return Codegen.optional(this.errorRules);
    }
    /**
     * (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
     * 
     */
    @Export(name="ignoreRequestErrorsInApdexCalculation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ignoreRequestErrorsInApdexCalculation;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationErrorRules`) This setting overrides Apdex settings for individual rules listed below
     * 
     */
    public Output<Boolean> ignoreRequestErrorsInApdexCalculation() {
        return this.ignoreRequestErrorsInApdexCalculation;
    }
    /**
     * The scope of this setting (APPLICATION)
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The scope of this setting (APPLICATION)
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppRequestErrors(String name) {
        this(name, WebAppRequestErrorsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppRequestErrors(String name, WebAppRequestErrorsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppRequestErrors(String name, WebAppRequestErrorsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/webAppRequestErrors:WebAppRequestErrors", name, args == null ? WebAppRequestErrorsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppRequestErrors(String name, Output<String> id, @Nullable WebAppRequestErrorsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/webAppRequestErrors:WebAppRequestErrors", name, state, makeResourceOptions(options, id));
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
    public static WebAppRequestErrors get(String name, Output<String> id, @Nullable WebAppRequestErrorsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppRequestErrors(name, id, state, options);
    }
}
