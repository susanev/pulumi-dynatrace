// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/monitoredTechnologiesApache:MonitoredTechnologiesApache")]
    public partial class MonitoredTechnologiesApache : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        /// </summary>
        [Output("hostId")]
        public Output<string?> HostId { get; private set; } = null!;


        /// <summary>
        /// Create a MonitoredTechnologiesApache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitoredTechnologiesApache(string name, MonitoredTechnologiesApacheArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/monitoredTechnologiesApache:MonitoredTechnologiesApache", name, args ?? new MonitoredTechnologiesApacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MonitoredTechnologiesApache(string name, Input<string> id, MonitoredTechnologiesApacheState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/monitoredTechnologiesApache:MonitoredTechnologiesApache", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MonitoredTechnologiesApache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitoredTechnologiesApache Get(string name, Input<string> id, MonitoredTechnologiesApacheState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitoredTechnologiesApache(name, id, state, options);
        }
    }

    public sealed class MonitoredTechnologiesApacheArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        /// </summary>
        [Input("hostId")]
        public Input<string>? HostId { get; set; }

        public MonitoredTechnologiesApacheArgs()
        {
        }
        public static new MonitoredTechnologiesApacheArgs Empty => new MonitoredTechnologiesApacheArgs();
    }

    public sealed class MonitoredTechnologiesApacheState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
        /// </summary>
        [Input("hostId")]
        public Input<string>? HostId { get; set; }

        public MonitoredTechnologiesApacheState()
        {
        }
        public static new MonitoredTechnologiesApacheState Empty => new MonitoredTechnologiesApacheState();
    }
}
