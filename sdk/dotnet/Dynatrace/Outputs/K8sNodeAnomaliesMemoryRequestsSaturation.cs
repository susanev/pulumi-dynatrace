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
    public sealed class K8sNodeAnomaliesMemoryRequestsSaturation
    {
        /// <summary>
        /// Alert if
        /// </summary>
        public readonly Outputs.K8sNodeAnomaliesMemoryRequestsSaturationConfiguration? Configuration;
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private K8sNodeAnomaliesMemoryRequestsSaturation(
            Outputs.K8sNodeAnomaliesMemoryRequestsSaturationConfiguration? configuration,

            bool enabled)
        {
            Configuration = configuration;
            Enabled = enabled;
        }
    }
}
