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
    public static class GetProcessGroup
    {
        /// <summary>
        /// The process group data source allows the process group ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all process groups with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the process group (inclusive)
        /// 
        /// If multiple process groups match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Dynatrace.GetProcessGroup.Invoke(new()
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
        ///                 Selector = $"type(\"process_group\"),entityId(\"{test.Apply(getProcessGroupResult =&gt; getProcessGroupResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProcessGroupResult> InvokeAsync(GetProcessGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProcessGroupResult>("dynatrace:index/getProcessGroup:getProcessGroup", args ?? new GetProcessGroupArgs(), options.WithDefaults());

        /// <summary>
        /// The process group data source allows the process group ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all process groups with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the process group (inclusive)
        /// 
        /// If multiple process groups match the given criteria, the first result will be retrieved.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Dynatrace = Lbrlabs.PulumiPackage.Dynatrace;
        /// using Dynatrace = Pulumi.Dynatrace;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Dynatrace.GetProcessGroup.Invoke(new()
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
        ///                 Selector = $"type(\"process_group\"),entityId(\"{test.Apply(getProcessGroupResult =&gt; getProcessGroupResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProcessGroupResult> Invoke(GetProcessGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProcessGroupResult>("dynatrace:index/getProcessGroup:getProcessGroup", args ?? new GetProcessGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProcessGroupArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Required tags of the process group to find
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetProcessGroupArgs()
        {
        }
        public static new GetProcessGroupArgs Empty => new GetProcessGroupArgs();
    }

    public sealed class GetProcessGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Required tags of the process group to find
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetProcessGroupInvokeArgs()
        {
        }
        public static new GetProcessGroupInvokeArgs Empty => new GetProcessGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetProcessGroupResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Required tags of the process group to find
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetProcessGroupResult(
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
