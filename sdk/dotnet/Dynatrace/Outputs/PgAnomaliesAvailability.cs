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
    public sealed class PgAnomaliesAvailability
    {
        /// <summary>
        /// How to monitor the availability of the process group:  * `PROCESS_IMPACT`: Alert if any process of the group becomes unavailable.  * `MINIMUM_THRESHOLD`: Alert if the number of active processes in the group falls below the specified threshold.  * `OFF`: Availability monitoring is disabled.
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Alert if the number of active processes in the group is lower than this value.
        /// </summary>
        public readonly int? MinimumThreshold;

        [OutputConstructor]
        private PgAnomaliesAvailability(
            string method,

            int? minimumThreshold)
        {
            Method = method;
            MinimumThreshold = minimumThreshold;
        }
    }
}
