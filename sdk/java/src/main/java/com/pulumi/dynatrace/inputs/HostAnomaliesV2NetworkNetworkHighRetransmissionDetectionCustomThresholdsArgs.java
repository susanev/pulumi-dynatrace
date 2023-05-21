// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs;
import java.lang.Integer;
import java.util.Objects;


public final class HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs Empty = new HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs();

    @Import(name="eventThresholds", required=true)
    private Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs> eventThresholds;

    public Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs> eventThresholds() {
        return this.eventThresholds;
    }

    @Import(name="retransmissionRatePercentage", required=true)
    private Output<Integer> retransmissionRatePercentage;

    public Output<Integer> retransmissionRatePercentage() {
        return this.retransmissionRatePercentage;
    }

    @Import(name="retransmittedPacketsNumberPerMinute", required=true)
    private Output<Integer> retransmittedPacketsNumberPerMinute;

    public Output<Integer> retransmittedPacketsNumberPerMinute() {
        return this.retransmittedPacketsNumberPerMinute;
    }

    private HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs() {}

    private HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs(HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs $) {
        this.eventThresholds = $.eventThresholds;
        this.retransmissionRatePercentage = $.retransmissionRatePercentage;
        this.retransmittedPacketsNumberPerMinute = $.retransmittedPacketsNumberPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs $;

        public Builder() {
            $ = new HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs();
        }

        public Builder(HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs defaults) {
            $ = new HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder eventThresholds(Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs> eventThresholds) {
            $.eventThresholds = eventThresholds;
            return this;
        }

        public Builder eventThresholds(HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs eventThresholds) {
            return eventThresholds(Output.of(eventThresholds));
        }

        public Builder retransmissionRatePercentage(Output<Integer> retransmissionRatePercentage) {
            $.retransmissionRatePercentage = retransmissionRatePercentage;
            return this;
        }

        public Builder retransmissionRatePercentage(Integer retransmissionRatePercentage) {
            return retransmissionRatePercentage(Output.of(retransmissionRatePercentage));
        }

        public Builder retransmittedPacketsNumberPerMinute(Output<Integer> retransmittedPacketsNumberPerMinute) {
            $.retransmittedPacketsNumberPerMinute = retransmittedPacketsNumberPerMinute;
            return this;
        }

        public Builder retransmittedPacketsNumberPerMinute(Integer retransmittedPacketsNumberPerMinute) {
            return retransmittedPacketsNumberPerMinute(Output.of(retransmittedPacketsNumberPerMinute));
        }

        public HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsArgs build() {
            $.eventThresholds = Objects.requireNonNull($.eventThresholds, "expected parameter 'eventThresholds' to be non-null");
            $.retransmissionRatePercentage = Objects.requireNonNull($.retransmissionRatePercentage, "expected parameter 'retransmissionRatePercentage' to be non-null");
            $.retransmittedPacketsNumberPerMinute = Objects.requireNonNull($.retransmittedPacketsNumberPerMinute, "expected parameter 'retransmittedPacketsNumberPerMinute' to be non-null");
            return $;
        }
    }

}
