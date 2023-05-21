// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.LogStorageMatchersMatcher;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LogStorageMatchers {
    private List<LogStorageMatchersMatcher> matchers;

    private LogStorageMatchers() {}
    public List<LogStorageMatchersMatcher> matchers() {
        return this.matchers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStorageMatchers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<LogStorageMatchersMatcher> matchers;
        public Builder() {}
        public Builder(LogStorageMatchers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchers = defaults.matchers;
        }

        @CustomType.Setter
        public Builder matchers(List<LogStorageMatchersMatcher> matchers) {
            this.matchers = Objects.requireNonNull(matchers);
            return this;
        }
        public Builder matchers(LogStorageMatchersMatcher... matchers) {
            return matchers(List.of(matchers));
        }
        public LogStorageMatchers build() {
            final var o = new LogStorageMatchers();
            o.matchers = matchers;
            return o;
        }
    }
}
