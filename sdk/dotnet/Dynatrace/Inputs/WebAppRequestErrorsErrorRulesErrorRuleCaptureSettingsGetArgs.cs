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

    public sealed class WebAppRequestErrorsErrorRulesErrorRuleCaptureSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("capture", required: true)]
        public Input<bool> Capture { get; set; } = null!;

        [Input("considerForAi")]
        public Input<bool>? ConsiderForAi { get; set; }

        [Input("impactApdex")]
        public Input<bool>? ImpactApdex { get; set; }

        public WebAppRequestErrorsErrorRulesErrorRuleCaptureSettingsGetArgs()
        {
        }
        public static new WebAppRequestErrorsErrorRulesErrorRuleCaptureSettingsGetArgs Empty => new WebAppRequestErrorsErrorRulesErrorRuleCaptureSettingsGetArgs();
    }
}
