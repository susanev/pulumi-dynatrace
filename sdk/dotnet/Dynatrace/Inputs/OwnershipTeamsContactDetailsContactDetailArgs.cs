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

    public sealed class OwnershipTeamsContactDetailsContactDetailArgs : global::Pulumi.ResourceArgs
    {
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        [Input("jira")]
        public Input<Inputs.OwnershipTeamsContactDetailsContactDetailJiraArgs>? Jira { get; set; }

        [Input("msTeams")]
        public Input<string>? MsTeams { get; set; }

        [Input("slackChannel")]
        public Input<string>? SlackChannel { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public OwnershipTeamsContactDetailsContactDetailArgs()
        {
        }
        public static new OwnershipTeamsContactDetailsContactDetailArgs Empty => new OwnershipTeamsContactDetailsContactDetailArgs();
    }
}
