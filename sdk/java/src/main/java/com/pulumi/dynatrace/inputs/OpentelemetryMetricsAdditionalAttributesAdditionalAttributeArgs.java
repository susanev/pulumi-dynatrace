// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs Empty = new OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs();

    @Import(name="attributeKey", required=true)
    private Output<String> attributeKey;

    public Output<String> attributeKey() {
        return this.attributeKey;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs() {}

    private OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs(OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs $) {
        this.attributeKey = $.attributeKey;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs $;

        public Builder() {
            $ = new OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs();
        }

        public Builder(OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs defaults) {
            $ = new OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeKey(Output<String> attributeKey) {
            $.attributeKey = attributeKey;
            return this;
        }

        public Builder attributeKey(String attributeKey) {
            return attributeKey(Output.of(attributeKey));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public OpentelemetryMetricsAdditionalAttributesAdditionalAttributeArgs build() {
            $.attributeKey = Objects.requireNonNull($.attributeKey, "expected parameter 'attributeKey' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
