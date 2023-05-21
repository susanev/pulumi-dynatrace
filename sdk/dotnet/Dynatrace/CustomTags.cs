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
    [DynatraceResourceType("dynatrace:index/customTags:CustomTags")]
    public partial class CustomTags : global::Pulumi.CustomResource
    {
        /// <summary>
        /// For internal use: current state of tags in JSON format
        /// </summary>
        [Output("currentState")]
        public Output<string> CurrentState { get; private set; } = null!;

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Output("entitySelector")]
        public Output<string> EntitySelector { get; private set; } = null!;

        /// <summary>
        /// The number of monitored entities where the tags have been added.
        /// </summary>
        [Output("matchedEntities")]
        public Output<int> MatchedEntities { get; private set; } = null!;

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Output("tags")]
        public Output<Outputs.CustomTagsTags> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a CustomTags resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomTags(string name, CustomTagsArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/customTags:CustomTags", name, args ?? new CustomTagsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomTags(string name, Input<string> id, CustomTagsState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/customTags:CustomTags", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomTags resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomTags Get(string name, Input<string> id, CustomTagsState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomTags(name, id, state, options);
        }
    }

    public sealed class CustomTagsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For internal use: current state of tags in JSON format
        /// </summary>
        [Input("currentState")]
        public Input<string>? CurrentState { get; set; }

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Input("entitySelector", required: true)]
        public Input<string> EntitySelector { get; set; } = null!;

        /// <summary>
        /// The number of monitored entities where the tags have been added.
        /// </summary>
        [Input("matchedEntities")]
        public Input<int>? MatchedEntities { get; set; }

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Input("tags", required: true)]
        public Input<Inputs.CustomTagsTagsArgs> Tags { get; set; } = null!;

        public CustomTagsArgs()
        {
        }
        public static new CustomTagsArgs Empty => new CustomTagsArgs();
    }

    public sealed class CustomTagsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// For internal use: current state of tags in JSON format
        /// </summary>
        [Input("currentState")]
        public Input<string>? CurrentState { get; set; }

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Input("entitySelector")]
        public Input<string>? EntitySelector { get; set; }

        /// <summary>
        /// The number of monitored entities where the tags have been added.
        /// </summary>
        [Input("matchedEntities")]
        public Input<int>? MatchedEntities { get; set; }

        /// <summary>
        /// Specifies the entities where you want to update tags
        /// </summary>
        [Input("tags")]
        public Input<Inputs.CustomTagsTagsGetArgs>? Tags { get; set; }

        public CustomTagsState()
        {
        }
        public static new CustomTagsState Empty => new CustomTagsState();
    }
}
