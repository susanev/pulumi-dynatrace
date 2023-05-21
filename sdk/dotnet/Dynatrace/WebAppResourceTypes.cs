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
    [DynatraceResourceType("dynatrace:index/webAppResourceTypes:WebAppResourceTypes")]
    public partial class WebAppResourceTypes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
        /// </summary>
        [Output("primaryResourceType")]
        public Output<string> PrimaryResourceType { get; private set; } = null!;

        /// <summary>
        /// The regular expression to detect the resource.
        /// </summary>
        [Output("regularExpression")]
        public Output<string> RegularExpression { get; private set; } = null!;

        /// <summary>
        /// The secondary type of the resource.
        /// </summary>
        [Output("secondaryResourceType")]
        public Output<string?> SecondaryResourceType { get; private set; } = null!;


        /// <summary>
        /// Create a WebAppResourceTypes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebAppResourceTypes(string name, WebAppResourceTypesArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/webAppResourceTypes:WebAppResourceTypes", name, args ?? new WebAppResourceTypesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebAppResourceTypes(string name, Input<string> id, WebAppResourceTypesState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/webAppResourceTypes:WebAppResourceTypes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WebAppResourceTypes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebAppResourceTypes Get(string name, Input<string> id, WebAppResourceTypesState? state = null, CustomResourceOptions? options = null)
        {
            return new WebAppResourceTypes(name, id, state, options);
        }
    }

    public sealed class WebAppResourceTypesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
        /// </summary>
        [Input("primaryResourceType", required: true)]
        public Input<string> PrimaryResourceType { get; set; } = null!;

        /// <summary>
        /// The regular expression to detect the resource.
        /// </summary>
        [Input("regularExpression", required: true)]
        public Input<string> RegularExpression { get; set; } = null!;

        /// <summary>
        /// The secondary type of the resource.
        /// </summary>
        [Input("secondaryResourceType")]
        public Input<string>? SecondaryResourceType { get; set; }

        public WebAppResourceTypesArgs()
        {
        }
        public static new WebAppResourceTypesArgs Empty => new WebAppResourceTypesArgs();
    }

    public sealed class WebAppResourceTypesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
        /// </summary>
        [Input("primaryResourceType")]
        public Input<string>? PrimaryResourceType { get; set; }

        /// <summary>
        /// The regular expression to detect the resource.
        /// </summary>
        [Input("regularExpression")]
        public Input<string>? RegularExpression { get; set; }

        /// <summary>
        /// The secondary type of the resource.
        /// </summary>
        [Input("secondaryResourceType")]
        public Input<string>? SecondaryResourceType { get; set; }

        public WebAppResourceTypesState()
        {
        }
        public static new WebAppResourceTypesState Empty => new WebAppResourceTypesState();
    }
}
