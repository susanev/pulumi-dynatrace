// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The synthetic location data source allows the location ID to be retrieved based off of provided parameters.
 */
export function getSyntheticLocation(args?: GetSyntheticLocationArgs, opts?: pulumi.InvokeOptions): Promise<GetSyntheticLocationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dynatrace:index/getSyntheticLocation:getSyntheticLocation", {
        "cloudPlatform": args.cloudPlatform,
        "entityId": args.entityId,
        "ips": args.ips,
        "name": args.name,
        "stage": args.stage,
        "status": args.status,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getSyntheticLocation.
 */
export interface GetSyntheticLocationArgs {
    /**
     * The cloud provider where the location is hosted.
     */
    cloudPlatform?: string;
    entityId?: string;
    ips?: string[];
    name?: string;
    stage?: string;
    status?: string;
    type?: string;
}

/**
 * A collection of values returned by getSyntheticLocation.
 */
export interface GetSyntheticLocationResult {
    /**
     * The cloud provider where the location is hosted.
     */
    readonly cloudPlatform: string;
    readonly entityId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ips: string[];
    readonly name?: string;
    readonly stage: string;
    readonly status: string;
    readonly type?: string;
}
/**
 * The synthetic location data source allows the location ID to be retrieved based off of provided parameters.
 */
export function getSyntheticLocationOutput(args?: GetSyntheticLocationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSyntheticLocationResult> {
    return pulumi.output(args).apply((a: any) => getSyntheticLocation(a, opts))
}

/**
 * A collection of arguments for invoking getSyntheticLocation.
 */
export interface GetSyntheticLocationOutputArgs {
    /**
     * The cloud provider where the location is hosted.
     */
    cloudPlatform?: pulumi.Input<string>;
    entityId?: pulumi.Input<string>;
    ips?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    stage?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}
