// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll {
    private Double degradationMilliseconds;

    private WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll() {}
    public Double degradationMilliseconds() {
        return this.degradationMilliseconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double degradationMilliseconds;
        public Builder() {}
        public Builder(WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.degradationMilliseconds = defaults.degradationMilliseconds;
        }

        @CustomType.Setter
        public Builder degradationMilliseconds(Double degradationMilliseconds) {
            this.degradationMilliseconds = Objects.requireNonNull(degradationMilliseconds);
            return this;
        }
        public WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll build() {
            final var o = new WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll();
            o.degradationMilliseconds = degradationMilliseconds;
            return o;
        }
    }
}
