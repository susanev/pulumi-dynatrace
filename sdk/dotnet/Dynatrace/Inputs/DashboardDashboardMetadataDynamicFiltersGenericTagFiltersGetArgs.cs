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

    public sealed class DashboardDashboardMetadataDynamicFiltersGenericTagFiltersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters", required: true)]
        private InputList<Inputs.DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterGetArgs>? _filters;
        public InputList<Inputs.DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.DashboardDashboardMetadataDynamicFiltersGenericTagFiltersFilterGetArgs>());
            set => _filters = value;
        }

        public DashboardDashboardMetadataDynamicFiltersGenericTagFiltersGetArgs()
        {
        }
        public static new DashboardDashboardMetadataDynamicFiltersGenericTagFiltersGetArgs Empty => new DashboardDashboardMetadataDynamicFiltersGenericTagFiltersGetArgs();
    }
}
