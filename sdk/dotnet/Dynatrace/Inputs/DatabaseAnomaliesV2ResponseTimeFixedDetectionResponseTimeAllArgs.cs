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

    public sealed class DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs : global::Pulumi.ResourceArgs
    {
        [Input("degradationMilliseconds", required: true)]
        public Input<double> DegradationMilliseconds { get; set; } = null!;

        public DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs()
        {
        }
        public static new DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs Empty => new DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllArgs();
    }
}
