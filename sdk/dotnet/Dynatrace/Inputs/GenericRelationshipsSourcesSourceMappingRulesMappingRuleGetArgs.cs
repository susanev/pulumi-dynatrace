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

    public sealed class GenericRelationshipsSourcesSourceMappingRulesMappingRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationProperty", required: true)]
        public Input<string> DestinationProperty { get; set; } = null!;

        [Input("destinationTransformation", required: true)]
        public Input<string> DestinationTransformation { get; set; } = null!;

        [Input("sourceProperty", required: true)]
        public Input<string> SourceProperty { get; set; } = null!;

        [Input("sourceTransformation", required: true)]
        public Input<string> SourceTransformation { get; set; } = null!;

        public GenericRelationshipsSourcesSourceMappingRulesMappingRuleGetArgs()
        {
        }
        public static new GenericRelationshipsSourcesSourceMappingRulesMappingRuleGetArgs Empty => new GenericRelationshipsSourcesSourceMappingRulesMappingRuleGetArgs();
    }
}
