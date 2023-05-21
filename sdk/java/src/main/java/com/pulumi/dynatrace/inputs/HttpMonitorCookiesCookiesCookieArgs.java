// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpMonitorCookiesCookiesCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpMonitorCookiesCookiesCookieArgs Empty = new HttpMonitorCookiesCookiesCookieArgs();

    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private HttpMonitorCookiesCookiesCookieArgs() {}

    private HttpMonitorCookiesCookiesCookieArgs(HttpMonitorCookiesCookiesCookieArgs $) {
        this.domain = $.domain;
        this.name = $.name;
        this.path = $.path;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpMonitorCookiesCookiesCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpMonitorCookiesCookiesCookieArgs $;

        public Builder() {
            $ = new HttpMonitorCookiesCookiesCookieArgs();
        }

        public Builder(HttpMonitorCookiesCookiesCookieArgs defaults) {
            $ = new HttpMonitorCookiesCookiesCookieArgs(Objects.requireNonNull(defaults));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HttpMonitorCookiesCookiesCookieArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
