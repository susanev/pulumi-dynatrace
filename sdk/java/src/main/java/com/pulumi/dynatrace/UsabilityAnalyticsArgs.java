// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsabilityAnalyticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsabilityAnalyticsArgs Empty = new UsabilityAnalyticsArgs();

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Three or more rapid clicks within the same area of a web page are considered to be rage clicks. Rage clicks commonly reflect slow-loading or failed page resources. Rage click counts are compiled for each session and considered in the [User Experience Score](https://dt-url.net/39034wt) .
     * With this setting enabled, a rage click count is compiled for each monitored user session.
     * 
     */
    @Import(name="detectRageClicks", required=true)
    private Output<Boolean> detectRageClicks;

    /**
     * @return Three or more rapid clicks within the same area of a web page are considered to be rage clicks. Rage clicks commonly reflect slow-loading or failed page resources. Rage click counts are compiled for each session and considered in the [User Experience Score](https://dt-url.net/39034wt) .
     * With this setting enabled, a rage click count is compiled for each monitored user session.
     * 
     */
    public Output<Boolean> detectRageClicks() {
        return this.detectRageClicks;
    }

    private UsabilityAnalyticsArgs() {}

    private UsabilityAnalyticsArgs(UsabilityAnalyticsArgs $) {
        this.applicationId = $.applicationId;
        this.detectRageClicks = $.detectRageClicks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsabilityAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsabilityAnalyticsArgs $;

        public Builder() {
            $ = new UsabilityAnalyticsArgs();
        }

        public Builder(UsabilityAnalyticsArgs defaults) {
            $ = new UsabilityAnalyticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param detectRageClicks Three or more rapid clicks within the same area of a web page are considered to be rage clicks. Rage clicks commonly reflect slow-loading or failed page resources. Rage click counts are compiled for each session and considered in the [User Experience Score](https://dt-url.net/39034wt) .
         * With this setting enabled, a rage click count is compiled for each monitored user session.
         * 
         * @return builder
         * 
         */
        public Builder detectRageClicks(Output<Boolean> detectRageClicks) {
            $.detectRageClicks = detectRageClicks;
            return this;
        }

        /**
         * @param detectRageClicks Three or more rapid clicks within the same area of a web page are considered to be rage clicks. Rage clicks commonly reflect slow-loading or failed page resources. Rage click counts are compiled for each session and considered in the [User Experience Score](https://dt-url.net/39034wt) .
         * With this setting enabled, a rage click count is compiled for each monitored user session.
         * 
         * @return builder
         * 
         */
        public Builder detectRageClicks(Boolean detectRageClicks) {
            return detectRageClicks(Output.of(detectRageClicks));
        }

        public UsabilityAnalyticsArgs build() {
            $.detectRageClicks = Objects.requireNonNull($.detectRageClicks, "expected parameter 'detectRageClicks' to be non-null");
            return $;
        }
    }

}
