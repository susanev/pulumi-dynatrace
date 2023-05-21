// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The host data source allows the host ID to be retrieved by its name and optionally tags / tag-value pairs.
 *
 * - `name` queries for all hosts with the specified name
 * - `tags` (optional) refers to the tags that need to be present for the host (inclusive)
 *
 * If multiple hosts match the given criteria, the first result will be retrieved.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dynatrace from "@lbrlabs/pulumi-dynatrace";
 * import * as dynatrace from "@pulumi/dynatrace";
 *
 * const test = dynatrace.getHost({
 *     name: "Example",
 *     tags: [
 *         "TerraformKeyTest",
 *         "TerraformKeyValueTest=TestValue",
 *     ],
 * });
 * const _name_ = new dynatrace.ManagementZone("#name#", {entitySelectorBasedRules: [{
 *     enabled: true,
 *     selector: test.then(test => `type("host"),entityId("${test.id}")`),
 * }]});
 * ```
 */
export function getHost(args: GetHostArgs, opts?: pulumi.InvokeOptions): Promise<GetHostResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dynatrace:index/getHost:getHost", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getHost.
 */
export interface GetHostArgs {
    name: string;
    /**
     * Required tags of the host to find
     */
    tags?: string[];
}

/**
 * A collection of values returned by getHost.
 */
export interface GetHostResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Required tags of the host to find
     */
    readonly tags?: string[];
}
/**
 * The host data source allows the host ID to be retrieved by its name and optionally tags / tag-value pairs.
 *
 * - `name` queries for all hosts with the specified name
 * - `tags` (optional) refers to the tags that need to be present for the host (inclusive)
 *
 * If multiple hosts match the given criteria, the first result will be retrieved.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dynatrace from "@lbrlabs/pulumi-dynatrace";
 * import * as dynatrace from "@pulumi/dynatrace";
 *
 * const test = dynatrace.getHost({
 *     name: "Example",
 *     tags: [
 *         "TerraformKeyTest",
 *         "TerraformKeyValueTest=TestValue",
 *     ],
 * });
 * const _name_ = new dynatrace.ManagementZone("#name#", {entitySelectorBasedRules: [{
 *     enabled: true,
 *     selector: test.then(test => `type("host"),entityId("${test.id}")`),
 * }]});
 * ```
 */
export function getHostOutput(args: GetHostOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHostResult> {
    return pulumi.output(args).apply((a: any) => getHost(a, opts))
}

/**
 * A collection of arguments for invoking getHost.
 */
export interface GetHostOutputArgs {
    name: pulumi.Input<string>;
    /**
     * Required tags of the host to find
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
