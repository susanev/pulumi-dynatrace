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
    public static class GetProcess
    {
        /// <summary>
        /// The process data source allows the process ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all processes with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the process (inclusive)
        /// 
        /// If multiple processes match the given criteria, the first result will be retrieved.
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
        ///     var test = Dynatrace.GetProcess.Invoke(new()
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
        ///                 Selector = $"type(\"process_group_instance\"),entityId(\"{test.Apply(getProcessResult =&gt; getProcessResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProcessResult> InvokeAsync(GetProcessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProcessResult>("dynatrace:index/getProcess:getProcess", args ?? new GetProcessArgs(), options.WithDefaults());

        /// <summary>
        /// The process data source allows the process ID to be retrieved by its name and optionally tags / tag-value pairs.
        /// 
        /// - `name` queries for all processes with the specified name
        /// - `tags` (optional) refers to the tags that need to be present for the process (inclusive)
        /// 
        /// If multiple processes match the given criteria, the first result will be retrieved.
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
        ///     var test = Dynatrace.GetProcess.Invoke(new()
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
        ///                 Selector = $"type(\"process_group_instance\"),entityId(\"{test.Apply(getProcessResult =&gt; getProcessResult.Id)}\")",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProcessResult> Invoke(GetProcessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProcessResult>("dynatrace:index/getProcess:getProcess", args ?? new GetProcessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProcessArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetProcessArgs()
        {
        }
        public static new GetProcessArgs Empty => new GetProcessArgs();
    }

    public sealed class GetProcessInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetProcessInvokeArgs()
        {
        }
        public static new GetProcessInvokeArgs Empty => new GetProcessInvokeArgs();
    }


    [OutputType]
    public sealed class GetProcessResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetProcessResult(
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
