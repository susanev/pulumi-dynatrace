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

    public sealed class K8sClusterAnomaliesMemoryRequestsSaturationConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("observationPeriodInMinutes", required: true)]
        public Input<int> ObservationPeriodInMinutes { get; set; } = null!;

        [Input("samplePeriodInMinutes", required: true)]
        public Input<int> SamplePeriodInMinutes { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<int> Threshold { get; set; } = null!;

        public K8sClusterAnomaliesMemoryRequestsSaturationConfigurationArgs()
        {
        }
        public static new K8sClusterAnomaliesMemoryRequestsSaturationConfigurationArgs Empty => new K8sClusterAnomaliesMemoryRequestsSaturationConfigurationArgs();
    }
}
