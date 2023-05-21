// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection {
    private Double actionsPerMinute;
    private Double minutesAbnormalState;

    private WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection() {}
    public Double actionsPerMinute() {
        return this.actionsPerMinute;
    }
    public Double minutesAbnormalState() {
        return this.minutesAbnormalState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double actionsPerMinute;
        private Double minutesAbnormalState;
        public Builder() {}
        public Builder(WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsPerMinute = defaults.actionsPerMinute;
    	      this.minutesAbnormalState = defaults.minutesAbnormalState;
        }

        @CustomType.Setter
        public Builder actionsPerMinute(Double actionsPerMinute) {
            this.actionsPerMinute = Objects.requireNonNull(actionsPerMinute);
            return this;
        }
        @CustomType.Setter
        public Builder minutesAbnormalState(Double minutesAbnormalState) {
            this.minutesAbnormalState = Objects.requireNonNull(minutesAbnormalState);
            return this;
        }
        public WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection build() {
            final var o = new WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtection();
            o.actionsPerMinute = actionsPerMinute;
            o.minutesAbnormalState = minutesAbnormalState;
            return o;
        }
    }
}
