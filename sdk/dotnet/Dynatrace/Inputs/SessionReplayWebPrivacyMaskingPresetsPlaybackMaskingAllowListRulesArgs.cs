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

    public sealed class SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowListRules", required: true)]
        private InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesAllowListRuleArgs>? _allowListRules;
        public InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesAllowListRuleArgs> AllowListRules
        {
            get => _allowListRules ?? (_allowListRules = new InputList<Inputs.SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesAllowListRuleArgs>());
            set => _allowListRules = value;
        }

        public SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs()
        {
        }
        public static new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs Empty => new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingAllowListRulesArgs();
    }
}
