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
    public sealed class ServiceExternalWebServiceConditionsCondition
    {
        public readonly string Attribute;
        public readonly string CompareOperationType;
        public readonly ImmutableArray<string> Frameworks;
        public readonly bool? IgnoreCase;
        public readonly int? IntValue;
        public readonly ImmutableArray<int> IntValues;
        public readonly string? IpRangeFrom;
        public readonly string? IpRangeTo;
        public readonly ImmutableArray<string> TagValues;
        public readonly ImmutableArray<string> TextValues;

        [OutputConstructor]
        private ServiceExternalWebServiceConditionsCondition(
            string attribute,

            string compareOperationType,

            ImmutableArray<string> frameworks,

            bool? ignoreCase,

            int? intValue,

            ImmutableArray<int> intValues,

            string? ipRangeFrom,

            string? ipRangeTo,

            ImmutableArray<string> tagValues,

            ImmutableArray<string> textValues)
        {
            Attribute = attribute;
            CompareOperationType = compareOperationType;
            Frameworks = frameworks;
            IgnoreCase = ignoreCase;
            IntValue = intValue;
            IntValues = intValues;
            IpRangeFrom = ipRangeFrom;
            IpRangeTo = ipRangeTo;
            TagValues = tagValues;
            TextValues = textValues;
        }
    }
}
