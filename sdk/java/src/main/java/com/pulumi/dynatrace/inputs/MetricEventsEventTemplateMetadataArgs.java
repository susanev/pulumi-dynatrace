// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MetricEventsEventTemplateMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricEventsEventTemplateMetadataArgs Empty = new MetricEventsEventTemplateMetadataArgs();

    @Import(name="metadataKey", required=true)
    private Output<String> metadataKey;

    public Output<String> metadataKey() {
        return this.metadataKey;
    }

    @Import(name="metadataValue", required=true)
    private Output<String> metadataValue;

    public Output<String> metadataValue() {
        return this.metadataValue;
    }

    private MetricEventsEventTemplateMetadataArgs() {}

    private MetricEventsEventTemplateMetadataArgs(MetricEventsEventTemplateMetadataArgs $) {
        this.metadataKey = $.metadataKey;
        this.metadataValue = $.metadataValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricEventsEventTemplateMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricEventsEventTemplateMetadataArgs $;

        public Builder() {
            $ = new MetricEventsEventTemplateMetadataArgs();
        }

        public Builder(MetricEventsEventTemplateMetadataArgs defaults) {
            $ = new MetricEventsEventTemplateMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder metadataKey(Output<String> metadataKey) {
            $.metadataKey = metadataKey;
            return this;
        }

        public Builder metadataKey(String metadataKey) {
            return metadataKey(Output.of(metadataKey));
        }

        public Builder metadataValue(Output<String> metadataValue) {
            $.metadataValue = metadataValue;
            return this;
        }

        public Builder metadataValue(String metadataValue) {
            return metadataValue(Output.of(metadataValue));
        }

        public MetricEventsEventTemplateMetadataArgs build() {
            $.metadataKey = Objects.requireNonNull($.metadataKey, "expected parameter 'metadataKey' to be non-null");
            $.metadataValue = Objects.requireNonNull($.metadataValue, "expected parameter 'metadataValue' to be non-null");
            return $;
        }
    }

}
