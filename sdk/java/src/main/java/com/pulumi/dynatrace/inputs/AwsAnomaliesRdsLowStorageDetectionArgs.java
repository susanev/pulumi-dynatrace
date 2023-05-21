// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.AwsAnomaliesRdsLowStorageDetectionCustomThresholdsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsAnomaliesRdsLowStorageDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAnomaliesRdsLowStorageDetectionArgs Empty = new AwsAnomaliesRdsLowStorageDetectionArgs();

    /**
     * Alert if the condition is met in 3 out of 5 samples
     * 
     */
    @Import(name="customThresholds")
    private @Nullable Output<AwsAnomaliesRdsLowStorageDetectionCustomThresholdsArgs> customThresholds;

    /**
     * @return Alert if the condition is met in 3 out of 5 samples
     * 
     */
    public Optional<Output<AwsAnomaliesRdsLowStorageDetectionCustomThresholdsArgs>> customThresholds() {
        return Optional.ofNullable(this.customThresholds);
    }

    /**
     * Possible Values: `Auto`, `Custom`
     * 
     */
    @Import(name="detectionMode")
    private @Nullable Output<String> detectionMode;

    /**
     * @return Possible Values: `Auto`, `Custom`
     * 
     */
    public Optional<Output<String>> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private AwsAnomaliesRdsLowStorageDetectionArgs() {}

    private AwsAnomaliesRdsLowStorageDetectionArgs(AwsAnomaliesRdsLowStorageDetectionArgs $) {
        this.customThresholds = $.customThresholds;
        this.detectionMode = $.detectionMode;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAnomaliesRdsLowStorageDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAnomaliesRdsLowStorageDetectionArgs $;

        public Builder() {
            $ = new AwsAnomaliesRdsLowStorageDetectionArgs();
        }

        public Builder(AwsAnomaliesRdsLowStorageDetectionArgs defaults) {
            $ = new AwsAnomaliesRdsLowStorageDetectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customThresholds Alert if the condition is met in 3 out of 5 samples
         * 
         * @return builder
         * 
         */
        public Builder customThresholds(@Nullable Output<AwsAnomaliesRdsLowStorageDetectionCustomThresholdsArgs> customThresholds) {
            $.customThresholds = customThresholds;
            return this;
        }

        /**
         * @param customThresholds Alert if the condition is met in 3 out of 5 samples
         * 
         * @return builder
         * 
         */
        public Builder customThresholds(AwsAnomaliesRdsLowStorageDetectionCustomThresholdsArgs customThresholds) {
            return customThresholds(Output.of(customThresholds));
        }

        /**
         * @param detectionMode Possible Values: `Auto`, `Custom`
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(@Nullable Output<String> detectionMode) {
            $.detectionMode = detectionMode;
            return this;
        }

        /**
         * @param detectionMode Possible Values: `Auto`, `Custom`
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(String detectionMode) {
            return detectionMode(Output.of(detectionMode));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public AwsAnomaliesRdsLowStorageDetectionArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
