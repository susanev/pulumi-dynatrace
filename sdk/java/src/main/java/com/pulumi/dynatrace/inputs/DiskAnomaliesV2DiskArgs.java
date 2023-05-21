// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DiskAnomaliesV2DiskDiskLowInodesDetectionArgs;
import com.pulumi.dynatrace.inputs.DiskAnomaliesV2DiskDiskLowSpaceDetectionArgs;
import com.pulumi.dynatrace.inputs.DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs;
import java.util.Objects;


public final class DiskAnomaliesV2DiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAnomaliesV2DiskArgs Empty = new DiskAnomaliesV2DiskArgs();

    /**
     * no documentation available
     * 
     */
    @Import(name="diskLowInodesDetection", required=true)
    private Output<DiskAnomaliesV2DiskDiskLowInodesDetectionArgs> diskLowInodesDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<DiskAnomaliesV2DiskDiskLowInodesDetectionArgs> diskLowInodesDetection() {
        return this.diskLowInodesDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="diskLowSpaceDetection", required=true)
    private Output<DiskAnomaliesV2DiskDiskLowSpaceDetectionArgs> diskLowSpaceDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<DiskAnomaliesV2DiskDiskLowSpaceDetectionArgs> diskLowSpaceDetection() {
        return this.diskLowSpaceDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="diskSlowWritesAndReadsDetection", required=true)
    private Output<DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs> diskSlowWritesAndReadsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs> diskSlowWritesAndReadsDetection() {
        return this.diskSlowWritesAndReadsDetection;
    }

    private DiskAnomaliesV2DiskArgs() {}

    private DiskAnomaliesV2DiskArgs(DiskAnomaliesV2DiskArgs $) {
        this.diskLowInodesDetection = $.diskLowInodesDetection;
        this.diskLowSpaceDetection = $.diskLowSpaceDetection;
        this.diskSlowWritesAndReadsDetection = $.diskSlowWritesAndReadsDetection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAnomaliesV2DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAnomaliesV2DiskArgs $;

        public Builder() {
            $ = new DiskAnomaliesV2DiskArgs();
        }

        public Builder(DiskAnomaliesV2DiskArgs defaults) {
            $ = new DiskAnomaliesV2DiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskLowInodesDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskLowInodesDetection(Output<DiskAnomaliesV2DiskDiskLowInodesDetectionArgs> diskLowInodesDetection) {
            $.diskLowInodesDetection = diskLowInodesDetection;
            return this;
        }

        /**
         * @param diskLowInodesDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskLowInodesDetection(DiskAnomaliesV2DiskDiskLowInodesDetectionArgs diskLowInodesDetection) {
            return diskLowInodesDetection(Output.of(diskLowInodesDetection));
        }

        /**
         * @param diskLowSpaceDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskLowSpaceDetection(Output<DiskAnomaliesV2DiskDiskLowSpaceDetectionArgs> diskLowSpaceDetection) {
            $.diskLowSpaceDetection = diskLowSpaceDetection;
            return this;
        }

        /**
         * @param diskLowSpaceDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskLowSpaceDetection(DiskAnomaliesV2DiskDiskLowSpaceDetectionArgs diskLowSpaceDetection) {
            return diskLowSpaceDetection(Output.of(diskLowSpaceDetection));
        }

        /**
         * @param diskSlowWritesAndReadsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskSlowWritesAndReadsDetection(Output<DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs> diskSlowWritesAndReadsDetection) {
            $.diskSlowWritesAndReadsDetection = diskSlowWritesAndReadsDetection;
            return this;
        }

        /**
         * @param diskSlowWritesAndReadsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder diskSlowWritesAndReadsDetection(DiskAnomaliesV2DiskDiskSlowWritesAndReadsDetectionArgs diskSlowWritesAndReadsDetection) {
            return diskSlowWritesAndReadsDetection(Output.of(diskSlowWritesAndReadsDetection));
        }

        public DiskAnomaliesV2DiskArgs build() {
            $.diskLowInodesDetection = Objects.requireNonNull($.diskLowInodesDetection, "expected parameter 'diskLowInodesDetection' to be non-null");
            $.diskLowSpaceDetection = Objects.requireNonNull($.diskLowSpaceDetection, "expected parameter 'diskLowSpaceDetection' to be non-null");
            $.diskSlowWritesAndReadsDetection = Objects.requireNonNull($.diskSlowWritesAndReadsDetection, "expected parameter 'diskSlowWritesAndReadsDetection' to be non-null");
            return $;
        }
    }

}
