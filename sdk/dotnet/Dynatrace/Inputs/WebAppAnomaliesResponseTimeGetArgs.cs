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

    public sealed class WebAppAnomaliesResponseTimeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible Values: `Auto`, `Fixed`
        /// </summary>
        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("responseTimeAuto")]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeAutoGetArgs>? ResponseTimeAuto { get; set; }

        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("responseTimeFixed")]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeFixedGetArgs>? ResponseTimeFixed { get; set; }

        public WebAppAnomaliesResponseTimeGetArgs()
        {
        }
        public static new WebAppAnomaliesResponseTimeGetArgs Empty => new WebAppAnomaliesResponseTimeGetArgs();
    }
}
