// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RumProviderBreakdownDomainNamePatternListDomainNamePattern {
    private String pattern;

    private RumProviderBreakdownDomainNamePatternListDomainNamePattern() {}
    public String pattern() {
        return this.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RumProviderBreakdownDomainNamePatternListDomainNamePattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pattern;
        public Builder() {}
        public Builder(RumProviderBreakdownDomainNamePatternListDomainNamePattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        @CustomType.Setter
        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public RumProviderBreakdownDomainNamePatternListDomainNamePattern build() {
            final var o = new RumProviderBreakdownDomainNamePatternListDomainNamePattern();
            o.pattern = pattern;
            return o;
        }
    }
}
