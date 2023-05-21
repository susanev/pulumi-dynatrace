// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy {
    private Integer consecutiveRuns;

    private BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy() {}
    public Integer consecutiveRuns() {
        return this.consecutiveRuns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer consecutiveRuns;
        public Builder() {}
        public Builder(BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consecutiveRuns = defaults.consecutiveRuns;
        }

        @CustomType.Setter
        public Builder consecutiveRuns(Integer consecutiveRuns) {
            this.consecutiveRuns = Objects.requireNonNull(consecutiveRuns);
            return this;
        }
        public BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy build() {
            final var o = new BrowserMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicy();
            o.consecutiveRuns = consecutiveRuns;
            return o;
        }
    }
}
