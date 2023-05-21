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
    public sealed class HttpMonitorScriptRequest
    {
        public readonly Outputs.HttpMonitorScriptRequestAuthentication? Authentication;
        public readonly string? Body;
        public readonly Outputs.HttpMonitorScriptRequestConfiguration? Configuration;
        public readonly string? Description;
        public readonly string Method;
        public readonly string? PostProcessing;
        public readonly string? PreProcessing;
        public readonly int? RequestTimeout;
        public readonly string Url;
        public readonly Outputs.HttpMonitorScriptRequestValidation? Validation;

        [OutputConstructor]
        private HttpMonitorScriptRequest(
            Outputs.HttpMonitorScriptRequestAuthentication? authentication,

            string? body,

            Outputs.HttpMonitorScriptRequestConfiguration? configuration,

            string? description,

            string method,

            string? postProcessing,

            string? preProcessing,

            int? requestTimeout,

            string url,

            Outputs.HttpMonitorScriptRequestValidation? validation)
        {
            Authentication = authentication;
            Body = body;
            Configuration = configuration;
            Description = description;
            Method = method;
            PostProcessing = postProcessing;
            PreProcessing = preProcessing;
            RequestTimeout = requestTimeout;
            Url = url;
            Validation = validation;
        }
    }
}
