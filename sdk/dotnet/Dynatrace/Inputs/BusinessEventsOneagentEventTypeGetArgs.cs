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

    public sealed class BusinessEventsOneagentEventTypeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        public BusinessEventsOneagentEventTypeGetArgs()
        {
        }
        public static new BusinessEventsOneagentEventTypeGetArgs Empty => new BusinessEventsOneagentEventTypeGetArgs();
    }
}
