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
    public sealed class FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleCondition
    {
        public readonly bool? CaseSensitive;
        public readonly string CompareOperationType;
        public readonly double? DoubleValue;
        public readonly int? IntValue;
        public readonly string? TextValue;

        [OutputConstructor]
        private FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleCondition(
            bool? caseSensitive,

            string compareOperationType,

            double? doubleValue,

            int? intValue,

            string? textValue)
        {
            CaseSensitive = caseSensitive;
            CompareOperationType = compareOperationType;
            DoubleValue = doubleValue;
            IntValue = intValue;
            TextValue = textValue;
        }
    }
}
