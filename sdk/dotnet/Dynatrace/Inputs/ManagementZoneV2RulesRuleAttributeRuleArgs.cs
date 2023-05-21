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

    public sealed class ManagementZoneV2RulesRuleAttributeRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributeConditions", required: true)]
        public Input<Inputs.ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsArgs> AttributeConditions { get; set; } = null!;

        [Input("azureToPgpropagation")]
        public Input<bool>? AzureToPgpropagation { get; set; }

        [Input("azureToServicePropagation")]
        public Input<bool>? AzureToServicePropagation { get; set; }

        [Input("customDeviceGroupToCustomDevicePropagation")]
        public Input<bool>? CustomDeviceGroupToCustomDevicePropagation { get; set; }

        [Input("entityType", required: true)]
        public Input<string> EntityType { get; set; } = null!;

        [Input("hostToPgpropagation")]
        public Input<bool>? HostToPgpropagation { get; set; }

        [Input("pgToHostPropagation")]
        public Input<bool>? PgToHostPropagation { get; set; }

        [Input("pgToServicePropagation")]
        public Input<bool>? PgToServicePropagation { get; set; }

        [Input("serviceToHostPropagation")]
        public Input<bool>? ServiceToHostPropagation { get; set; }

        [Input("serviceToPgpropagation")]
        public Input<bool>? ServiceToPgpropagation { get; set; }

        public ManagementZoneV2RulesRuleAttributeRuleArgs()
        {
        }
        public static new ManagementZoneV2RulesRuleAttributeRuleArgs Empty => new ManagementZoneV2RulesRuleAttributeRuleArgs();
    }
}
