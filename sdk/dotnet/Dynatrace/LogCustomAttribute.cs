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
    [DynatraceResourceType("dynatrace:index/logCustomAttribute:LogCustomAttribute")]
    public partial class LogCustomAttribute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The attribute key is case insensitive in log data ingestion.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Show attribute values in side bar
        /// </summary>
        [Output("sidebar")]
        public Output<bool> Sidebar { get; private set; } = null!;


        /// <summary>
        /// Create a LogCustomAttribute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogCustomAttribute(string name, LogCustomAttributeArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/logCustomAttribute:LogCustomAttribute", name, args ?? new LogCustomAttributeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogCustomAttribute(string name, Input<string> id, LogCustomAttributeState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/logCustomAttribute:LogCustomAttribute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogCustomAttribute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogCustomAttribute Get(string name, Input<string> id, LogCustomAttributeState? state = null, CustomResourceOptions? options = null)
        {
            return new LogCustomAttribute(name, id, state, options);
        }
    }

    public sealed class LogCustomAttributeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attribute key is case insensitive in log data ingestion.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Show attribute values in side bar
        /// </summary>
        [Input("sidebar", required: true)]
        public Input<bool> Sidebar { get; set; } = null!;

        public LogCustomAttributeArgs()
        {
        }
        public static new LogCustomAttributeArgs Empty => new LogCustomAttributeArgs();
    }

    public sealed class LogCustomAttributeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attribute key is case insensitive in log data ingestion.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Show attribute values in side bar
        /// </summary>
        [Input("sidebar")]
        public Input<bool>? Sidebar { get; set; }

        public LogCustomAttributeState()
        {
        }
        public static new LogCustomAttributeState Empty => new LogCustomAttributeState();
    }
}
