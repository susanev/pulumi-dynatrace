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
    public sealed class AlertingFiltersFilterCustomMetadata
    {
        public readonly Outputs.AlertingFiltersFilterCustomMetadataItems Items;

        [OutputConstructor]
        private AlertingFiltersFilterCustomMetadata(Outputs.AlertingFiltersFilterCustomMetadataItems items)
        {
            Items = items;
        }
    }
}
