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

    public sealed class SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributeExpression")]
        public Input<string>? AttributeExpression { get; set; }

        [Input("cssExpression")]
        public Input<string>? CssExpression { get; set; }

        [Input("hideUserInteraction")]
        public Input<bool>? HideUserInteraction { get; set; }

        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        public SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs()
        {
        }
        public static new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs Empty => new SessionReplayWebPrivacyMaskingPresetsPlaybackMaskingBlockListRulesBlockListRuleGetArgs();
    }
}
