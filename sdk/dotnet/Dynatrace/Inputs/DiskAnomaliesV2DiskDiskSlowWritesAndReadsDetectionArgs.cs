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

    public sealed class DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("customThresholds")]
        public Input<Inputs.DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionCustomThresholdsArgs>? CustomThresholds { get; set; }

        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs()
        {
        }
        public static new DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs Empty => new DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs();
    }
}
