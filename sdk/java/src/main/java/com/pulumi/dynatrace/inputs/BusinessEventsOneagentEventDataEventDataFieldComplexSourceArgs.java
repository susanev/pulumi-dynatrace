// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs Empty = new BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs();

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    public Output<String> sourceType() {
        return this.sourceType;
    }

    private BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs() {}

    private BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs(BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs $) {
        this.path = $.path;
        this.source = $.source;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs $;

        public Builder() {
            $ = new BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs();
        }

        public Builder(BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs defaults) {
            $ = new BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public BusinessEventsOneagentEventDataEventDataFieldComplexSourceArgs build() {
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            return $;
        }
    }

}
