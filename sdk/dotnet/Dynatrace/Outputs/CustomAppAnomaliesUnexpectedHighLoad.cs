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
    public sealed class CustomAppAnomaliesUnexpectedHighLoad
    {
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Dynatrace learns your typical application traffic over an observation period of one week. Depending on this expected value Dynatrace detects abnormal traffic spikes within your application.
        /// </summary>
        public readonly double? ThresholdPercentage;

        [OutputConstructor]
        private CustomAppAnomaliesUnexpectedHighLoad(
            bool enabled,

            double? thresholdPercentage)
        {
            Enabled = enabled;
            ThresholdPercentage = thresholdPercentage;
        }
    }
}
