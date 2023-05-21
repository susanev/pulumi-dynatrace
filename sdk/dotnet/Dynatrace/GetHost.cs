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
    public static class GetHost
    {
        /// <summary>
        /// The host data source allows the host ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all hosts with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the host (inclusive)
        /// 
        /// If multiple hosts match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Dynatrace.GetHost.Invoke(new()
        ///     {
        ///         Name = "Example",
        ///         Tags = new[]
        ///         {
        ///             "TerraformKeyTest",
        ///             "TerraformKeyValueTest=TestValue",
        ///         },
        ///     });
        /// 
        ///     var _name_ = new Dynatrace.ManagementZone("#name#", new()
        ///     {
        ///         EntitySelectorBasedRules = new[]
        ///         {
        ///             new Dynatrace.Inputs.ManagementZoneEntitySelectorBasedRuleArgs
        ///             {
        ///                 Enabled = true,
        ///                 Selector = $"type(\"host\"),entityId(\"{test.Apply(getHostResult =&gt; getHostResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHostResult> InvokeAsync(GetHostArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHostResult>("dynatrace:index/getHost:getHost", args ?? new GetHostArgs(), options.WithDefaults());

        /// <summary>
        /// The host data source allows the host ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all hosts with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the host (inclusive)
        /// 
        /// If multiple hosts match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Dynatrace.GetHost.Invoke(new()
        ///     {
        ///         Name = "Example",
        ///         Tags = new[]
        ///         {
        ///             "TerraformKeyTest",
        ///             "TerraformKeyValueTest=TestValue",
        ///         },
        ///     });
        /// 
        ///     var _name_ = new Dynatrace.ManagementZone("#name#", new()
        ///     {
        ///         EntitySelectorBasedRules = new[]
        ///         {
        ///             new Dynatrace.Inputs.ManagementZoneEntitySelectorBasedRuleArgs
        ///             {
        ///                 Enabled = true,
        ///                 Selector = $"type(\"host\"),entityId(\"{test.Apply(getHostResult =&gt; getHostResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHostResult> Invoke(GetHostInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHostResult>("dynatrace:index/getHost:getHost", args ?? new GetHostInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHostArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Required tags of the host to find
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetHostArgs()
        {
        }
        public static new GetHostArgs Empty => new GetHostArgs();
    }

    public sealed class GetHostInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Required tags of the host to find
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetHostInvokeArgs()
        {
        }
        public static new GetHostInvokeArgs Empty => new GetHostInvokeArgs();
    }


    [OutputType]
    public sealed class GetHostResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Required tags of the host to find
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetHostResult(
            string id,

            string name,

            ImmutableArray<string> tags)
        {
            Id = id;
            Name = name;
            Tags = tags;
        }
    }
}
