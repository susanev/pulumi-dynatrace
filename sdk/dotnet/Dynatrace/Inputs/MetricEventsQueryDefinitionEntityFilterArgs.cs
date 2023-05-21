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

    public sealed class MetricEventsQueryDefinitionEntityFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionArgs>? _conditions;
        public InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.MetricEventsQueryDefinitionEntityFilterConditionArgs>());
            set => _conditions = value;
        }

        [Input("dimensionKey")]
        public Input<string>? DimensionKey { get; set; }

        public MetricEventsQueryDefinitionEntityFilterArgs()
        {
        }
        public static new MetricEventsQueryDefinitionEntityFilterArgs Empty => new MetricEventsQueryDefinitionEntityFilterArgs();
    }
}
