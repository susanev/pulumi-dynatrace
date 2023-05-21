// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs extends com.pulumi.resources.ResourceArgs {

    public static final MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs Empty = new MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs();

    @Import(name="durationThreshold", required=true)
    private Output<Double> durationThreshold;

    public Output<Double> durationThreshold() {
        return this.durationThreshold;
    }

    @Import(name="slowdownPercentage", required=true)
    private Output<Double> slowdownPercentage;

    public Output<Double> slowdownPercentage() {
        return this.slowdownPercentage;
    }

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs() {}

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs $) {
        this.durationThreshold = $.durationThreshold;
        this.slowdownPercentage = $.slowdownPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs $;

        public Builder() {
            $ = new MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs();
        }

        public Builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs defaults) {
            $ = new MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationThreshold(Output<Double> durationThreshold) {
            $.durationThreshold = durationThreshold;
            return this;
        }

        public Builder durationThreshold(Double durationThreshold) {
            return durationThreshold(Output.of(durationThreshold));
        }

        public Builder slowdownPercentage(Output<Double> slowdownPercentage) {
            $.slowdownPercentage = slowdownPercentage;
            return this;
        }

        public Builder slowdownPercentage(Double slowdownPercentage) {
            return slowdownPercentage(Output.of(slowdownPercentage));
        }

        public MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAllArgs build() {
            $.durationThreshold = Objects.requireNonNull($.durationThreshold, "expected parameter 'durationThreshold' to be non-null");
            $.slowdownPercentage = Objects.requireNonNull($.slowdownPercentage, "expected parameter 'slowdownPercentage' to be non-null");
            return $;
        }
    }

}
