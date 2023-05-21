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

    public sealed class DashboardDashboardMetadataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tile uses consistent colors when rendering its content
        /// </summary>
        [Input("consistentColors")]
        public Input<bool>? ConsistentColors { get; set; }

        /// <summary>
        /// Dashboard filter configuration of a dashboard
        /// </summary>
        [Input("dynamicFilters")]
        public Input<Inputs.DashboardDashboardMetadataDynamicFiltersGetArgs>? DynamicFilters { get; set; }

        /// <summary>
        /// Global filter Settings for the Dashboard
        /// </summary>
        [Input("filter")]
        public Input<Inputs.DashboardDashboardMetadataFilterGetArgs>? Filter { get; set; }

        /// <summary>
        /// the name of the dashboard
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// the owner of the dashboard
        /// </summary>
        [Input("owner", required: true)]
        public Input<string> Owner { get; set; } = null!;

        /// <summary>
        /// the dashboard is a preset (`true`) or not (`false`). Default is `false`.
        /// </summary>
        [Input("preset")]
        public Input<bool>? Preset { get; set; }

        /// <summary>
        /// the dashboard is shared (`true`) or private (`false`)
        /// </summary>
        [Input("shared")]
        public Input<bool>? Shared { get; set; }

        /// <summary>
        /// represents sharing configuration of a dashboard
        /// </summary>
        [Input("sharingDetails")]
        public Input<Inputs.DashboardDashboardMetadataSharingDetailsGetArgs>? SharingDetails { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// a set of tags assigned to the dashboard
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// No documentation available
        /// </summary>
        [Input("tilesNameSize")]
        public Input<string>? TilesNameSize { get; set; }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        [Input("validFilterKeys")]
        private InputList<string>? _validFilterKeys;

        /// <summary>
        /// a set of all possible global dashboard filters that can be applied to dashboard
        /// </summary>
        public InputList<string> ValidFilterKeys
        {
            get => _validFilterKeys ?? (_validFilterKeys = new InputList<string>());
            set => _validFilterKeys = value;
        }

        public DashboardDashboardMetadataGetArgs()
        {
        }
        public static new DashboardDashboardMetadataGetArgs Empty => new DashboardDashboardMetadataGetArgs();
    }
}
