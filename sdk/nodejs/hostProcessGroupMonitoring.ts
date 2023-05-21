// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class HostProcessGroupMonitoring extends pulumi.CustomResource {
    /**
     * Get an existing HostProcessGroupMonitoring resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostProcessGroupMonitoringState, opts?: pulumi.CustomResourceOptions): HostProcessGroupMonitoring {
        return new HostProcessGroupMonitoring(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/hostProcessGroupMonitoring:HostProcessGroupMonitoring';

    /**
     * Returns true if the given object is an instance of HostProcessGroupMonitoring.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HostProcessGroupMonitoring {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HostProcessGroupMonitoring.__pulumiType;
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    public readonly hostId!: pulumi.Output<string>;
    /**
     * Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
     */
    public readonly monitoringState!: pulumi.Output<string>;
    /**
     * Process group
     */
    public readonly processGroup!: pulumi.Output<string>;

    /**
     * Create a HostProcessGroupMonitoring resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostProcessGroupMonitoringArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostProcessGroupMonitoringArgs | HostProcessGroupMonitoringState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostProcessGroupMonitoringState | undefined;
            resourceInputs["hostId"] = state ? state.hostId : undefined;
            resourceInputs["monitoringState"] = state ? state.monitoringState : undefined;
            resourceInputs["processGroup"] = state ? state.processGroup : undefined;
        } else {
            const args = argsOrState as HostProcessGroupMonitoringArgs | undefined;
            if ((!args || args.hostId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostId'");
            }
            if ((!args || args.monitoringState === undefined) && !opts.urn) {
                throw new Error("Missing required property 'monitoringState'");
            }
            if ((!args || args.processGroup === undefined) && !opts.urn) {
                throw new Error("Missing required property 'processGroup'");
            }
            resourceInputs["hostId"] = args ? args.hostId : undefined;
            resourceInputs["monitoringState"] = args ? args.monitoringState : undefined;
            resourceInputs["processGroup"] = args ? args.processGroup : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HostProcessGroupMonitoring.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HostProcessGroupMonitoring resources.
 */
export interface HostProcessGroupMonitoringState {
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    hostId?: pulumi.Input<string>;
    /**
     * Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
     */
    monitoringState?: pulumi.Input<string>;
    /**
     * Process group
     */
    processGroup?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HostProcessGroupMonitoring resource.
 */
export interface HostProcessGroupMonitoringArgs {
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
     */
    hostId: pulumi.Input<string>;
    /**
     * Possible Values: `DEFAULT`, `MONITORING_OFF`, `MONITORING_ON`
     */
    monitoringState: pulumi.Input<string>;
    /**
     * Process group
     */
    processGroup: pulumi.Input<string>;
}
