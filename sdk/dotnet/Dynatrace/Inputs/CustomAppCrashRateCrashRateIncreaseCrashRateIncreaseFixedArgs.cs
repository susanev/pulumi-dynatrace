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

    public sealed class CustomAppCrashRateCrashRateIncreaseCrashRateIncreaseFixedArgs : global::Pulumi.ResourceArgs
    {
        [Input("absoluteCrashRate", required: true)]
        public Input<double> AbsoluteCrashRate { get; set; } = null!;

        [Input("concurrentUsers", required: true)]
        public Input<int> ConcurrentUsers { get; set; } = null!;

        public CustomAppCrashRateCrashRateIncreaseCrashRateIncreaseFixedArgs()
        {
        }
        public static new CustomAppCrashRateCrashRateIncreaseCrashRateIncreaseFixedArgs Empty => new CustomAppCrashRateCrashRateIncreaseCrashRateIncreaseFixedArgs();
    }
}
