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

    public sealed class ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition", required: true)]
        public Input<Inputs.ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs> Condition { get; set; } = null!;

        [Input("requestAttribute", required: true)]
        public Input<string> RequestAttribute { get; set; } = null!;

        public ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs()
        {
        }
        public static new ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs Empty => new ServiceFailureExceptionRulesCustomErrorRulesCustomErrorRuleArgs();
    }
}
