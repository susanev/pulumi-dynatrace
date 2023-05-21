// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAnomaliesV2LoadDropsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesV2LoadDropsArgs Empty = new ServiceAnomaliesV2LoadDropsArgs();

    /**
     * Detect service load drops
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Detect service load drops
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Threshold
     * 
     */
    @Import(name="loadDropPercent")
    private @Nullable Output<Double> loadDropPercent;

    /**
     * @return Threshold
     * 
     */
    public Optional<Output<Double>> loadDropPercent() {
        return Optional.ofNullable(this.loadDropPercent);
    }

    /**
     * Time span
     * 
     */
    @Import(name="minutesAbnormalState")
    private @Nullable Output<Integer> minutesAbnormalState;

    /**
     * @return Time span
     * 
     */
    public Optional<Output<Integer>> minutesAbnormalState() {
        return Optional.ofNullable(this.minutesAbnormalState);
    }

    private ServiceAnomaliesV2LoadDropsArgs() {}

    private ServiceAnomaliesV2LoadDropsArgs(ServiceAnomaliesV2LoadDropsArgs $) {
        this.enabled = $.enabled;
        this.loadDropPercent = $.loadDropPercent;
        this.minutesAbnormalState = $.minutesAbnormalState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesV2LoadDropsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesV2LoadDropsArgs $;

        public Builder() {
            $ = new ServiceAnomaliesV2LoadDropsArgs();
        }

        public Builder(ServiceAnomaliesV2LoadDropsArgs defaults) {
            $ = new ServiceAnomaliesV2LoadDropsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Detect service load drops
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Detect service load drops
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param loadDropPercent Threshold
         * 
         * @return builder
         * 
         */
        public Builder loadDropPercent(@Nullable Output<Double> loadDropPercent) {
            $.loadDropPercent = loadDropPercent;
            return this;
        }

        /**
         * @param loadDropPercent Threshold
         * 
         * @return builder
         * 
         */
        public Builder loadDropPercent(Double loadDropPercent) {
            return loadDropPercent(Output.of(loadDropPercent));
        }

        /**
         * @param minutesAbnormalState Time span
         * 
         * @return builder
         * 
         */
        public Builder minutesAbnormalState(@Nullable Output<Integer> minutesAbnormalState) {
            $.minutesAbnormalState = minutesAbnormalState;
            return this;
        }

        /**
         * @param minutesAbnormalState Time span
         * 
         * @return builder
         * 
         */
        public Builder minutesAbnormalState(Integer minutesAbnormalState) {
            return minutesAbnormalState(Output.of(minutesAbnormalState));
        }

        public ServiceAnomaliesV2LoadDropsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
