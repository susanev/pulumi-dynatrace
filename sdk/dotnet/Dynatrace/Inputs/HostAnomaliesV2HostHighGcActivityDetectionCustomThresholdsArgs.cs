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

    public sealed class HostAnomaliesV2HostHighGcActivityDetectionCustomThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("eventThresholds", required: true)]
        public Input<Inputs.HostAnomaliesV2HostHighGcActivityDetectionCustomThresholdsEventThresholdsArgs> EventThresholds { get; set; } = null!;

        [Input("gcSuspensionPercentage", required: true)]
        public Input<int> GcSuspensionPercentage { get; set; } = null!;

        [Input("gcTimePercentage", required: true)]
        public Input<int> GcTimePercentage { get; set; } = null!;

        public HostAnomaliesV2HostHighGcActivityDetectionCustomThresholdsArgs()
        {
        }
        public static new HostAnomaliesV2HostHighGcActivityDetectionCustomThresholdsArgs Empty => new HostAnomaliesV2HostHighGcActivityDetectionCustomThresholdsArgs();
    }
}
