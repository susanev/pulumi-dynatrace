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

    public sealed class MetricEventsQueryDefinitionDimensionFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<Inputs.MetricEventsQueryDefinitionDimensionFilterFilterArgs>? _filters;
        public InputList<Inputs.MetricEventsQueryDefinitionDimensionFilterFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.MetricEventsQueryDefinitionDimensionFilterFilterArgs>());
            set => _filters = value;
        }

        public MetricEventsQueryDefinitionDimensionFilterArgs()
        {
        }
        public static new MetricEventsQueryDefinitionDimensionFilterArgs Empty => new MetricEventsQueryDefinitionDimensionFilterArgs();
    }
}
