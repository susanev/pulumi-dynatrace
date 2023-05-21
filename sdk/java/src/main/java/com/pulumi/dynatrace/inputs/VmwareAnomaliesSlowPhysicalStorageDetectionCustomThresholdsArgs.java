// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs Empty = new VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs();

    @Import(name="avgReadWriteLatency", required=true)
    private Output<Integer> avgReadWriteLatency;

    public Output<Integer> avgReadWriteLatency() {
        return this.avgReadWriteLatency;
    }

    @Import(name="peakReadWriteLatency", required=true)
    private Output<Integer> peakReadWriteLatency;

    public Output<Integer> peakReadWriteLatency() {
        return this.peakReadWriteLatency;
    }

    private VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs() {}

    private VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs(VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs $) {
        this.avgReadWriteLatency = $.avgReadWriteLatency;
        this.peakReadWriteLatency = $.peakReadWriteLatency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs();
        }

        public Builder(VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs defaults) {
            $ = new VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder avgReadWriteLatency(Output<Integer> avgReadWriteLatency) {
            $.avgReadWriteLatency = avgReadWriteLatency;
            return this;
        }

        public Builder avgReadWriteLatency(Integer avgReadWriteLatency) {
            return avgReadWriteLatency(Output.of(avgReadWriteLatency));
        }

        public Builder peakReadWriteLatency(Output<Integer> peakReadWriteLatency) {
            $.peakReadWriteLatency = peakReadWriteLatency;
            return this;
        }

        public Builder peakReadWriteLatency(Integer peakReadWriteLatency) {
            return peakReadWriteLatency(Output.of(peakReadWriteLatency));
        }

        public VmwareAnomaliesSlowPhysicalStorageDetectionCustomThresholdsArgs build() {
            $.avgReadWriteLatency = Objects.requireNonNull($.avgReadWriteLatency, "expected parameter 'avgReadWriteLatency' to be non-null");
            $.peakReadWriteLatency = Objects.requireNonNull($.peakReadWriteLatency, "expected parameter 'peakReadWriteLatency' to be non-null");
            return $;
        }
    }

}
