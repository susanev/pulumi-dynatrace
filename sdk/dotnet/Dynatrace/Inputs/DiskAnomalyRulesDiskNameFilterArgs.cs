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

    public sealed class DiskAnomalyRulesDiskNameFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible Values: `CONTAINS`, `DOES_NOT_CONTAIN`, `DOES_NOT_EQUAL`, `DOES_NOT_START_WITH`, `EQUALS`, `STARTS_WITH`
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Matching text
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DiskAnomalyRulesDiskNameFilterArgs()
        {
        }
        public static new DiskAnomalyRulesDiskNameFilterArgs Empty => new DiskAnomalyRulesDiskNameFilterArgs();
    }
}
