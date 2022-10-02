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
    public static class GetManagementZone
    {
        /// <summary>
        /// The management zone data source allows the management zone ID to be retrieved by its name.
        /// 
        /// - `name` queries for all management zones with the specified name
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
        ///     var test = Dynatrace.GetManagementZone.Invoke(new()
        ///     {
        ///         Name = "Example",
        ///     });
        /// 
        ///     var _name_ = new Dynatrace.CalculatedServiceMetric("#name#", new()
        ///     {
        ///         Conditions = new[]
        ///         {
        ///             new Dynatrace.Inputs.CalculatedServiceMetricConditionArgs
        ///             {
        ///                 Conditions = new[]
        ///                 {
        ///                     new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionArgs
        ///                     {
        ///                         Attribute = "HTTP_REQUEST_METHOD",
        ///                         Comparison = new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionComparisonArgs
        ///                         {
        ///                             HttpMethod = new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionComparisonHttpMethodArgs
        ///                             {
        ///                                 Operator = "EQUALS_ANY_OF",
        ///                                 Values = new[]
        ///                                 {
        ///                                     "POST",
        ///                                     "GET",
        ///                                 },
        ///                             },
        ///                             Negate = false,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///         Enabled = true,
        ///         ManagementZones = new[]
        ///         {
        ///             test.Apply(getManagementZoneResult =&gt; getManagementZoneResult.Id),
        ///         },
        ///         MetricDefinition = new Dynatrace.Inputs.CalculatedServiceMetricMetricDefinitionArgs
        ///         {
        ///             Metric = "REQUEST_ATTRIBUTE",
        ///             RequestAttribute = "foo",
        ///         },
        ///         MetricKey = "calc:service.#name#",
        ///         Unit = "MILLI_SECOND_PER_MINUTE",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetManagementZoneResult> InvokeAsync(GetManagementZoneArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetManagementZoneResult>("dynatrace:index/getManagementZone:getManagementZone", args ?? new GetManagementZoneArgs(), options.WithDefaults());

        /// <summary>
        /// The management zone data source allows the management zone ID to be retrieved by its name.
        /// 
        /// - `name` queries for all management zones with the specified name
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
        ///     var test = Dynatrace.GetManagementZone.Invoke(new()
        ///     {
        ///         Name = "Example",
        ///     });
        /// 
        ///     var _name_ = new Dynatrace.CalculatedServiceMetric("#name#", new()
        ///     {
        ///         Conditions = new[]
        ///         {
        ///             new Dynatrace.Inputs.CalculatedServiceMetricConditionArgs
        ///             {
        ///                 Conditions = new[]
        ///                 {
        ///                     new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionArgs
        ///                     {
        ///                         Attribute = "HTTP_REQUEST_METHOD",
        ///                         Comparison = new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionComparisonArgs
        ///                         {
        ///                             HttpMethod = new Dynatrace.Inputs.CalculatedServiceMetricConditionConditionComparisonHttpMethodArgs
        ///                             {
        ///                                 Operator = "EQUALS_ANY_OF",
        ///                                 Values = new[]
        ///                                 {
        ///                                     "POST",
        ///                                     "GET",
        ///                                 },
        ///                             },
        ///                             Negate = false,
        ///                         },
        ///                     },
        ///                 },
        ///             },
        ///         },
        ///         Enabled = true,
        ///         ManagementZones = new[]
        ///         {
        ///             test.Apply(getManagementZoneResult =&gt; getManagementZoneResult.Id),
        ///         },
        ///         MetricDefinition = new Dynatrace.Inputs.CalculatedServiceMetricMetricDefinitionArgs
        ///         {
        ///             Metric = "REQUEST_ATTRIBUTE",
        ///             RequestAttribute = "foo",
        ///         },
        ///         MetricKey = "calc:service.#name#",
        ///         Unit = "MILLI_SECOND_PER_MINUTE",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetManagementZoneResult> Invoke(GetManagementZoneInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetManagementZoneResult>("dynatrace:index/getManagementZone:getManagementZone", args ?? new GetManagementZoneInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetManagementZoneArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetManagementZoneArgs()
        {
        }
        public static new GetManagementZoneArgs Empty => new GetManagementZoneArgs();
    }

    public sealed class GetManagementZoneInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetManagementZoneInvokeArgs()
        {
        }
        public static new GetManagementZoneInvokeArgs Empty => new GetManagementZoneInvokeArgs();
    }


    [OutputType]
    public sealed class GetManagementZoneResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetManagementZoneResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
