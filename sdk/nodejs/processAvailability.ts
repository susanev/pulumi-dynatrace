// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ProcessAvailability extends pulumi.CustomResource {
    /**
     * Get an existing ProcessAvailability resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProcessAvailabilityState, opts?: pulumi.CustomResourceOptions): ProcessAvailability {
        return new ProcessAvailability(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/processAvailability:ProcessAvailability';

    /**
     * Returns true if the given object is an instance of ProcessAvailability.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProcessAvailability {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProcessAvailability.__pulumiType;
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Set of additional key-value properties to be attached to the triggered event.
     */
    public readonly metadata!: pulumi.Output<outputs.ProcessAvailabilityMetadata | undefined>;
    /**
     * Monitored rule name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Define process detection rules by selecting a process property and a condition. Each monitoring rule can have multiple
     * detection rules associated with it.
     */
    public readonly rules!: pulumi.Output<outputs.ProcessAvailabilityRules | undefined>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    public readonly scope!: pulumi.Output<string | undefined>;

    /**
     * Create a ProcessAvailability resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProcessAvailabilityArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProcessAvailabilityArgs | ProcessAvailabilityState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProcessAvailabilityState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
        } else {
            const args = argsOrState as ProcessAvailabilityArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProcessAvailability.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProcessAvailability resources.
 */
export interface ProcessAvailabilityState {
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Set of additional key-value properties to be attached to the triggered event.
     */
    metadata?: pulumi.Input<inputs.ProcessAvailabilityMetadata>;
    /**
     * Monitored rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Define process detection rules by selecting a process property and a condition. Each monitoring rule can have multiple
     * detection rules associated with it.
     */
    rules?: pulumi.Input<inputs.ProcessAvailabilityRules>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    scope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProcessAvailability resource.
 */
export interface ProcessAvailabilityArgs {
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Set of additional key-value properties to be attached to the triggered event.
     */
    metadata?: pulumi.Input<inputs.ProcessAvailabilityMetadata>;
    /**
     * Monitored rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Define process detection rules by selecting a process property and a condition. Each monitoring rule can have multiple
     * detection rules associated with it.
     */
    rules?: pulumi.Input<inputs.ProcessAvailabilityRules>;
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     */
    scope?: pulumi.Input<string>;
}
