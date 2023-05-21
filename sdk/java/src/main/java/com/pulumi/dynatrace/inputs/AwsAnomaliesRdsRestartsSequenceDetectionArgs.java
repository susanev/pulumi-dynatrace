// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.AwsAnomaliesRdsRestartsSequenceDetectionCustomThresholdsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsAnomaliesRdsRestartsSequenceDetectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsAnomaliesRdsRestartsSequenceDetectionArgs Empty = new AwsAnomaliesRdsRestartsSequenceDetectionArgs();

    /**
     * Alert if the condition is met in 2 out of 20 samples
     * 
     */
    @Import(name="customThresholds")
    private @Nullable Output<AwsAnomaliesRdsRestartsSequenceDetectionCustomThresholdsArgs> customThresholds;

    /**
     * @return Alert if the condition is met in 2 out of 20 samples
     * 
     */
    public Optional<Output<AwsAnomaliesRdsRestartsSequenceDetectionCustomThresholdsArgs>> customThresholds() {
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

    private AwsAnomaliesRdsRestartsSequenceDetectionArgs() {}

    private AwsAnomaliesRdsRestartsSequenceDetectionArgs(AwsAnomaliesRdsRestartsSequenceDetectionArgs $) {
        this.customThresholds = $.customThresholds;
        this.detectionMode = $.detectionMode;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsAnomaliesRdsRestartsSequenceDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAnomaliesRdsRestartsSequenceDetectionArgs $;

        public Builder() {
            $ = new AwsAnomaliesRdsRestartsSequenceDetectionArgs();
        }

        public Builder(AwsAnomaliesRdsRestartsSequenceDetectionArgs defaults) {
            $ = new AwsAnomaliesRdsRestartsSequenceDetectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customThresholds Alert if the condition is met in 2 out of 20 samples
         * 
         * @return builder
         * 
         */
        public Builder customThresholds(@Nullable Output<AwsAnomaliesRdsRestartsSequenceDetectionCustomThresholdsArgs> customThresholds) {
            $.customThresholds = customThresholds;
            return this;
        }

        /**
         * @param customThresholds Alert if the condition is met in 2 out of 20 samples
         * 
         * @return builder
         * 
         */
        public Builder customThresholds(AwsAnomaliesRdsRestartsSequenceDetectionCustomThresholdsArgs customThresholds) {
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

        public AwsAnomaliesRdsRestartsSequenceDetectionArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
