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
    public sealed class ManagementZoneV2RulesRuleDimensionRuleDimensionConditions
    {
        public readonly ImmutableArray<Outputs.ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsCondition> Conditions;

        [OutputConstructor]
        private ManagementZoneV2RulesRuleDimensionRuleDimensionConditions(ImmutableArray<Outputs.ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsCondition> conditions)
        {
            Conditions = conditions;
        }
    }
}
