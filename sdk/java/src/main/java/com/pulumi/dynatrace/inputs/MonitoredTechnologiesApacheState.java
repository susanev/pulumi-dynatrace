// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredTechnologiesApacheState extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredTechnologiesApacheState Empty = new MonitoredTechnologiesApacheState();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Import(name="hostId")
    private @Nullable Output<String> hostId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Optional<Output<String>> hostId() {
        return Optional.ofNullable(this.hostId);
    }

    private MonitoredTechnologiesApacheState() {}

    private MonitoredTechnologiesApacheState(MonitoredTechnologiesApacheState $) {
        this.enabled = $.enabled;
        this.hostId = $.hostId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredTechnologiesApacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredTechnologiesApacheState $;

        public Builder() {
            $ = new MonitoredTechnologiesApacheState();
        }

        public Builder(MonitoredTechnologiesApacheState defaults) {
            $ = new MonitoredTechnologiesApacheState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
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
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(@Nullable Output<String> hostId) {
            $.hostId = hostId;
            return this;
        }

        /**
         * @param hostId The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
         * 
         * @return builder
         * 
         */
        public Builder hostId(String hostId) {
            return hostId(Output.of(hostId));
        }

        public MonitoredTechnologiesApacheState build() {
            return $;
        }
    }

}
