// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.LogTimestampMatchersMatcher;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LogTimestampMatchers {
    private List<LogTimestampMatchersMatcher> matchers;

    private LogTimestampMatchers() {}
    public List<LogTimestampMatchersMatcher> matchers() {
        return this.matchers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogTimestampMatchers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<LogTimestampMatchersMatcher> matchers;
        public Builder() {}
        public Builder(LogTimestampMatchers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchers = defaults.matchers;
        }

        @CustomType.Setter
        public Builder matchers(List<LogTimestampMatchersMatcher> matchers) {
            this.matchers = Objects.requireNonNull(matchers);
            return this;
        }
        public Builder matchers(LogTimestampMatchersMatcher... matchers) {
            return matchers(List.of(matchers));
        }
        public LogTimestampMatchers build() {
            final var o = new LogTimestampMatchers();
            o.matchers = matchers;
            return o;
        }
    }
}
