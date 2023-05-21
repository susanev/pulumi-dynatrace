// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholdsEventThresholds;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds {
    private Integer cpuSaturation;
    private HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholdsEventThresholds eventThresholds;

    private HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds() {}
    public Integer cpuSaturation() {
        return this.cpuSaturation;
    }
    public HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholdsEventThresholds eventThresholds() {
        return this.eventThresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpuSaturation;
        private HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholdsEventThresholds eventThresholds;
        public Builder() {}
        public Builder(HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuSaturation = defaults.cpuSaturation;
    	      this.eventThresholds = defaults.eventThresholds;
        }

        @CustomType.Setter
        public Builder cpuSaturation(Integer cpuSaturation) {
            this.cpuSaturation = Objects.requireNonNull(cpuSaturation);
            return this;
        }
        @CustomType.Setter
        public Builder eventThresholds(HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholdsEventThresholds eventThresholds) {
            this.eventThresholds = Objects.requireNonNull(eventThresholds);
            return this;
        }
        public HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds build() {
            final var o = new HostAnomaliesV2HostHighCpuSaturationDetectionCustomThresholds();
            o.cpuSaturation = cpuSaturation;
            o.eventThresholds = eventThresholds;
            return o;
        }
    }
}
