// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class ServiceFullWebRequestIdContributorsApplicationIdServiceIdContributorValueOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ServiceFullWebRequestIdContributorsApplicationIdServiceIdContributorValueOverrideGetArgs()
        {
        }
        public static new ServiceFullWebRequestIdContributorsApplicationIdServiceIdContributorValueOverrideGetArgs Empty => new ServiceFullWebRequestIdContributorsApplicationIdServiceIdContributorValueOverrideGetArgs();
    }
}
