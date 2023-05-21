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

    public sealed class EnvironmentStorageRetentionArgs : global::Pulumi.ResourceArgs
    {
        [Input("logs")]
        public Input<int>? Logs { get; set; }

        [Input("rum", required: true)]
        public Input<int> Rum { get; set; } = null!;

        [Input("serviceCodeLevel", required: true)]
        public Input<int> ServiceCodeLevel { get; set; } = null!;

        [Input("serviceRequestLevel", required: true)]
        public Input<int> ServiceRequestLevel { get; set; } = null!;

        [Input("sessionReplay", required: true)]
        public Input<int> SessionReplay { get; set; } = null!;

        [Input("synthetic", required: true)]
        public Input<int> Synthetic { get; set; } = null!;

        public EnvironmentStorageRetentionArgs()
        {
        }
        public static new EnvironmentStorageRetentionArgs Empty => new EnvironmentStorageRetentionArgs();
    }
}
