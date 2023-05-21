// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds {
    private Integer freeInodesPercentage;

    private DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds() {}
    public Integer freeInodesPercentage() {
        return this.freeInodesPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer freeInodesPercentage;
        public Builder() {}
        public Builder(DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.freeInodesPercentage = defaults.freeInodesPercentage;
        }

        @CustomType.Setter
        public Builder freeInodesPercentage(Integer freeInodesPercentage) {
            this.freeInodesPercentage = Objects.requireNonNull(freeInodesPercentage);
            return this;
        }
        public DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds build() {
            final var o = new DiskAnomaliesV2DiskDiskLowInodesDetectionCustomThresholds();
            o.freeInodesPercentage = freeInodesPercentage;
            return o;
        }
    }
}
