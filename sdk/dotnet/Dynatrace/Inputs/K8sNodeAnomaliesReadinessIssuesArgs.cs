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

    public sealed class K8sNodeAnomaliesReadinessIssuesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert if
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.K8sNodeAnomaliesReadinessIssuesConfigurationArgs>? Configuration { get; set; }

        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public K8sNodeAnomaliesReadinessIssuesArgs()
        {
        }
        public static new K8sNodeAnomaliesReadinessIssuesArgs Empty => new K8sNodeAnomaliesReadinessIssuesArgs();
    }
}
