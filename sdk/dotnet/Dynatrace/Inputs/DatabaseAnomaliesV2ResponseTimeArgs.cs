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

    public sealed class DatabaseAnomaliesV2ResponseTimeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("autoDetection")]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeAutoDetectionArgs>? AutoDetection { get; set; }

        /// <summary>
        /// Detection mode for response time degradations
        /// </summary>
        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        /// <summary>
        /// Detect response time degradations
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("fixedDetection")]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionArgs>? FixedDetection { get; set; }

        public DatabaseAnomaliesV2ResponseTimeArgs()
        {
        }
        public static new DatabaseAnomaliesV2ResponseTimeArgs Empty => new DatabaseAnomaliesV2ResponseTimeArgs();
    }
}
