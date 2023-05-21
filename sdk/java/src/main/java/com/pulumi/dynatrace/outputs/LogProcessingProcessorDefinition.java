// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogProcessingProcessorDefinition {
    private String rule;

    private LogProcessingProcessorDefinition() {}
    public String rule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogProcessingProcessorDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String rule;
        public Builder() {}
        public Builder(LogProcessingProcessorDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        @CustomType.Setter
        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public LogProcessingProcessorDefinition build() {
            final var o = new LogProcessingProcessorDefinition();
            o.rule = rule;
            return o;
        }
    }
}
