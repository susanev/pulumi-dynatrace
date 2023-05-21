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

    public sealed class MetricEventsEventTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
        /// </summary>
        [Input("davisMerge")]
        public Input<bool>? DavisMerge { get; set; }

        /// <summary>
        /// The description of the event to trigger.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The event type to trigger.
        /// </summary>
        [Input("eventType", required: true)]
        public Input<string> EventType { get; set; } = null!;

        [Input("metadatas")]
        private InputList<Inputs.MetricEventsEventTemplateMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Set of additional key-value properties to be attached to the triggered event.
        /// </summary>
        public InputList<Inputs.MetricEventsEventTemplateMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.MetricEventsEventTemplateMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// The title of the event to trigger.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        public MetricEventsEventTemplateGetArgs()
        {
        }
        public static new MetricEventsEventTemplateGetArgs Empty => new MetricEventsEventTemplateGetArgs();
    }
}
