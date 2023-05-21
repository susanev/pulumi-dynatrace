// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholds
    {
        public readonly int DealertingEvaluationWindow;
        public readonly int DealertingSamples;
        public readonly int ViolatingEvaluationWindow;
        public readonly int ViolatingSamples;

        [OutputConstructor]
        private HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholds(
            int dealertingEvaluationWindow,

            int dealertingSamples,

            int violatingEvaluationWindow,

            int violatingSamples)
        {
            DealertingEvaluationWindow = dealertingEvaluationWindow;
            DealertingSamples = dealertingSamples;
            ViolatingEvaluationWindow = violatingEvaluationWindow;
            ViolatingSamples = violatingSamples;
        }
    }
}
