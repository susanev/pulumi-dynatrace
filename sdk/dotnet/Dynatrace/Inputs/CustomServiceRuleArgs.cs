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

    public sealed class CustomServiceRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputList<string>? _annotations;

        /// <summary>
        /// Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
        /// </summary>
        public InputList<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The fully qualified class or interface to instrument (or a substring if matching to a string). Required for Java and .NET custom services. Not applicable to PHP
        /// </summary>
        [Input("class")]
        public Input<Inputs.CustomServiceRuleClassArgs>? Class { get; set; }

        /// <summary>
        /// Rule enabled/disabled
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The PHP file containing the class or methods to instrument. Required for PHP custom service. Not applicable to Java and .NET
        /// </summary>
        [Input("file")]
        public Input<Inputs.CustomServiceRuleFileArgs>? File { get; set; }

        [Input("methods", required: true)]
        private InputList<Inputs.CustomServiceRuleMethodArgs>? _methods;

        /// <summary>
        /// methods to instrument
        /// </summary>
        public InputList<Inputs.CustomServiceRuleMethodArgs> Methods
        {
            get => _methods ?? (_methods = new InputList<Inputs.CustomServiceRuleMethodArgs>());
            set => _methods = value;
        }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public CustomServiceRuleArgs()
        {
        }
        public static new CustomServiceRuleArgs Empty => new CustomServiceRuleArgs();
    }
}
