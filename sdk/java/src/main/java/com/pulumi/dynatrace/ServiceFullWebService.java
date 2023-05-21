// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ServiceFullWebServiceArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceState;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceConditions;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceIdContributors;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/serviceFullWebService:ServiceFullWebService")
public class ServiceFullWebService extends com.pulumi.resources.CustomResource {
    /**
     * A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     * 
     */
    @Export(name="conditions", refs={ServiceFullWebServiceConditions.class}, tree="[0]")
    private Output</* @Nullable */ ServiceFullWebServiceConditions> conditions;

    /**
     * @return A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     * 
     */
    public Output<Optional<ServiceFullWebServiceConditions>> conditions() {
        return Codegen.optional(this.conditions);
    }
    /**
     * Description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     * 
     */
    @Export(name="idContributors", refs={ServiceFullWebServiceIdContributors.class}, tree="[0]")
    private Output<ServiceFullWebServiceIdContributors> idContributors;

    /**
     * @return Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     * 
     */
    public Output<ServiceFullWebServiceIdContributors> idContributors() {
        return this.idContributors;
    }
    /**
     * Define a management zone filter for this service detection rule.
     * 
     */
    @Export(name="managementZones", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> managementZones;

    /**
     * @return Define a management zone filter for this service detection rule.
     * 
     */
    public Output<Optional<List<String>>> managementZones() {
        return Codegen.optional(this.managementZones);
    }
    /**
     * Rule name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Rule name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceFullWebService(String name) {
        this(name, ServiceFullWebServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceFullWebService(String name, ServiceFullWebServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceFullWebService(String name, ServiceFullWebServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/serviceFullWebService:ServiceFullWebService", name, args == null ? ServiceFullWebServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceFullWebService(String name, Output<String> id, @Nullable ServiceFullWebServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/serviceFullWebService:ServiceFullWebService", name, state, makeResourceOptions(options, id));
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
    public static ServiceFullWebService get(String name, Output<String> id, @Nullable ServiceFullWebServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceFullWebService(name, id, state, options);
    }
}
