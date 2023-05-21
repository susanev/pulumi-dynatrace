// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs Empty = new ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs();

    @Import(name="minutesAbnormalState", required=true)
    private Output<Integer> minutesAbnormalState;

    public Output<Integer> minutesAbnormalState() {
        return this.minutesAbnormalState;
    }

    @Import(name="requestsPerMinute", required=true)
    private Output<Double> requestsPerMinute;

    public Output<Double> requestsPerMinute() {
        return this.requestsPerMinute;
    }

    private ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs() {}

    private ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs(ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs $) {
        this.minutesAbnormalState = $.minutesAbnormalState;
        this.requestsPerMinute = $.requestsPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs $;

        public Builder() {
            $ = new ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs();
        }

        public Builder(ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs defaults) {
            $ = new ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder minutesAbnormalState(Output<Integer> minutesAbnormalState) {
            $.minutesAbnormalState = minutesAbnormalState;
            return this;
        }

        public Builder minutesAbnormalState(Integer minutesAbnormalState) {
            return minutesAbnormalState(Output.of(minutesAbnormalState));
        }

        public Builder requestsPerMinute(Output<Double> requestsPerMinute) {
            $.requestsPerMinute = requestsPerMinute;
            return this;
        }

        public Builder requestsPerMinute(Double requestsPerMinute) {
            return requestsPerMinute(Output.of(requestsPerMinute));
        }

        public ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionArgs build() {
            $.minutesAbnormalState = Objects.requireNonNull($.minutesAbnormalState, "expected parameter 'minutesAbnormalState' to be non-null");
            $.requestsPerMinute = Objects.requireNonNull($.requestsPerMinute, "expected parameter 'requestsPerMinute' to be non-null");
            return $;
        }
    }

}
