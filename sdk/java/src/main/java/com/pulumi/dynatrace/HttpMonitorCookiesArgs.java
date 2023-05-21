// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HttpMonitorCookiesCookiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpMonitorCookiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpMonitorCookiesArgs Empty = new HttpMonitorCookiesArgs();

    /**
     * no documentation available
     * 
     */
    @Import(name="cookies")
    private @Nullable Output<HttpMonitorCookiesCookiesArgs> cookies;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<HttpMonitorCookiesCookiesArgs>> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The scope of this setting (HTTP_CHECK)
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of this setting (HTTP_CHECK)
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private HttpMonitorCookiesArgs() {}

    private HttpMonitorCookiesArgs(HttpMonitorCookiesArgs $) {
        this.cookies = $.cookies;
        this.enabled = $.enabled;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpMonitorCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpMonitorCookiesArgs $;

        public Builder() {
            $ = new HttpMonitorCookiesArgs();
        }

        public Builder(HttpMonitorCookiesArgs defaults) {
            $ = new HttpMonitorCookiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cookies no documentation available
         * 
         * @return builder
         * 
         */
        public Builder cookies(@Nullable Output<HttpMonitorCookiesCookiesArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        /**
         * @param cookies no documentation available
         * 
         * @return builder
         * 
         */
        public Builder cookies(HttpMonitorCookiesCookiesArgs cookies) {
            return cookies(Output.of(cookies));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param scope The scope of this setting (HTTP_CHECK)
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HTTP_CHECK)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public HttpMonitorCookiesArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
