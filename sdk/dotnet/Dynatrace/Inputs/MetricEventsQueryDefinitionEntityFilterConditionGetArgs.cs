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

    public sealed class MetricEventsQueryDefinitionEntityFilterConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionConditionGetArgs>? _conditions;
        public InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionConditionGetArgs>());
            set => _conditions = value;
        }

        public MetricEventsQueryDefinitionEntityFilterConditionGetArgs()
        {
        }
        public static new MetricEventsQueryDefinitionEntityFilterConditionGetArgs Empty => new MetricEventsQueryDefinitionEntityFilterConditionGetArgs();
    }
}
