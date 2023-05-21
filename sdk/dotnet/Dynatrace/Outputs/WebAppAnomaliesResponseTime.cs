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
    public sealed class WebAppAnomaliesResponseTime
    {
        /// <summary>
        /// Possible Values: `Auto`, `Fixed`
        /// </summary>
        public readonly string? DetectionMode;
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// no documentation available
        /// </summary>
        public readonly Outputs.WebAppAnomaliesResponseTimeResponseTimeAuto? ResponseTimeAuto;
        /// <summary>
        /// no documentation available
        /// </summary>
        public readonly Outputs.WebAppAnomaliesResponseTimeResponseTimeFixed? ResponseTimeFixed;

        [OutputConstructor]
        private WebAppAnomaliesResponseTime(
            string? detectionMode,

            bool enabled,

            Outputs.WebAppAnomaliesResponseTimeResponseTimeAuto? responseTimeAuto,

            Outputs.WebAppAnomaliesResponseTimeResponseTimeFixed? responseTimeFixed)
        {
            DetectionMode = detectionMode;
            Enabled = enabled;
            ResponseTimeAuto = responseTimeAuto;
            ResponseTimeFixed = responseTimeFixed;
        }
    }
}
