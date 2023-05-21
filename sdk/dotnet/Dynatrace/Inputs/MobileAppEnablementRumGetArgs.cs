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

    public sealed class MobileAppEnablementRumGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Percentage of user sessions captured and analyzed. By default, Dynatrace captures all user actions and user sessions for analysis. This approach ensures complete insight into your application’s performance and customer experience. You can optionally reduce the granularity of user-action and user-session analysis by capturing a lower percentage of user sessions. While this approach can reduce monitoring costs, it also results in lower visibility into how your customers are using your applications. For example, a setting of 10% results in Dynatrace analyzing only every tenth user session.
        /// </summary>
        [Input("costAndTrafficControl", required: true)]
        public Input<int> CostAndTrafficControl { get; set; } = null!;

        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public MobileAppEnablementRumGetArgs()
        {
        }
        public static new MobileAppEnablementRumGetArgs Empty => new MobileAppEnablementRumGetArgs();
    }
}
