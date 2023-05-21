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
    public sealed class GetAlertingProfilesValueResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly string LegacyId;
        public readonly string ManagementZoneId;
        public readonly string ManagementZoneLegacyId;
        public readonly string Name;

        [OutputConstructor]
        private GetAlertingProfilesValueResult(
            string id,

            string legacyId,

            string managementZoneId,

            string managementZoneLegacyId,

            string name)
        {
            Id = id;
            LegacyId = legacyId;
            ManagementZoneId = managementZoneId;
            ManagementZoneLegacyId = managementZoneLegacyId;
            Name = name;
        }
    }
}
