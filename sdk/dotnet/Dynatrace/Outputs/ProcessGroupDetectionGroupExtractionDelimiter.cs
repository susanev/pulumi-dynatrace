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
    public sealed class ProcessGroupDetectionGroupExtractionDelimiter
    {
        public readonly string? From;
        public readonly bool RemoveIds;
        public readonly string? To;

        [OutputConstructor]
        private ProcessGroupDetectionGroupExtractionDelimiter(
            string? from,

            bool removeIds,

            string? to)
        {
            From = from;
            RemoveIds = removeIds;
            To = to;
        }
    }
}
