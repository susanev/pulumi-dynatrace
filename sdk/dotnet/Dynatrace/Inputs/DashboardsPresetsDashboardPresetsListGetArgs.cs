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

    public sealed class DashboardsPresetsDashboardPresetsListGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dashboardPresets", required: true)]
        private InputList<Inputs.DashboardsPresetsDashboardPresetsListDashboardPresetGetArgs>? _dashboardPresets;
        public InputList<Inputs.DashboardsPresetsDashboardPresetsListDashboardPresetGetArgs> DashboardPresets
        {
            get => _dashboardPresets ?? (_dashboardPresets = new InputList<Inputs.DashboardsPresetsDashboardPresetsListDashboardPresetGetArgs>());
            set => _dashboardPresets = value;
        }

        public DashboardsPresetsDashboardPresetsListGetArgs()
        {
        }
        public static new DashboardsPresetsDashboardPresetsListGetArgs Empty => new DashboardsPresetsDashboardPresetsListGetArgs();
    }
}
