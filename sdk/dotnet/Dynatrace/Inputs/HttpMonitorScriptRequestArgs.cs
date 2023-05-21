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

    public sealed class HttpMonitorScriptRequestArgs : global::Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.HttpMonitorScriptRequestAuthenticationArgs>? Authentication { get; set; }

        [Input("body")]
        public Input<string>? Body { get; set; }

        [Input("configuration")]
        public Input<Inputs.HttpMonitorScriptRequestConfigurationArgs>? Configuration { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        [Input("postProcessing")]
        public Input<string>? PostProcessing { get; set; }

        [Input("preProcessing")]
        public Input<string>? PreProcessing { get; set; }

        [Input("requestTimeout")]
        public Input<int>? RequestTimeout { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("validation")]
        public Input<Inputs.HttpMonitorScriptRequestValidationArgs>? Validation { get; set; }

        public HttpMonitorScriptRequestArgs()
        {
        }
        public static new HttpMonitorScriptRequestArgs Empty => new HttpMonitorScriptRequestArgs();
    }
}
