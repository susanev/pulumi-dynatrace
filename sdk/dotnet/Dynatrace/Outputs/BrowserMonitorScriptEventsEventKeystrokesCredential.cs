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
    public sealed class BrowserMonitorScriptEventsEventKeystrokesCredential
    {
        public readonly string Field;
        public readonly string VaultId;

        [OutputConstructor]
        private BrowserMonitorScriptEventsEventKeystrokesCredential(
            string field,

            string vaultId)
        {
            Field = field;
            VaultId = vaultId;
        }
    }
}
