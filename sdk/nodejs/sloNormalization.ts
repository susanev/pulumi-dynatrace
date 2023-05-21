// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class SloNormalization extends pulumi.CustomResource {
    /**
     * Get an existing SloNormalization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SloNormalizationState, opts?: pulumi.CustomResourceOptions): SloNormalization {
        return new SloNormalization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/sloNormalization:SloNormalization';

    /**
     * Returns true if the given object is an instance of SloNormalization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SloNormalization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SloNormalization.__pulumiType;
    }

    /**
     * When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     */
    public readonly normalize!: pulumi.Output<boolean>;

    /**
     * Create a SloNormalization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SloNormalizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SloNormalizationArgs | SloNormalizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SloNormalizationState | undefined;
            resourceInputs["normalize"] = state ? state.normalize : undefined;
        } else {
            const args = argsOrState as SloNormalizationArgs | undefined;
            if ((!args || args.normalize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'normalize'");
            }
            resourceInputs["normalize"] = args ? args.normalize : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SloNormalization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SloNormalization resources.
 */
export interface SloNormalizationState {
    /**
     * When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     */
    normalize?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SloNormalization resource.
 */
export interface SloNormalizationArgs {
    /**
     * When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     */
    normalize: pulumi.Input<boolean>;
}
