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


public final class ConnectivityAlertsState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectivityAlertsState Empty = new ConnectivityAlertsState();

    /**
     * TCP connectivity problems
     * 
     */
    @Import(name="connectivityAlerts")
    private @Nullable Output<Boolean> connectivityAlerts;

    /**
     * @return TCP connectivity problems
     * 
     */
    public Optional<Output<Boolean>> connectivityAlerts() {
        return Optional.ofNullable(this.connectivityAlerts);
    }

    /**
     * The scope of this settings
     * 
     */
    @Import(name="processGroupId")
    private @Nullable Output<String> processGroupId;

    /**
     * @return The scope of this settings
     * 
     */
    public Optional<Output<String>> processGroupId() {
        return Optional.ofNullable(this.processGroupId);
    }

    private ConnectivityAlertsState() {}

    private ConnectivityAlertsState(ConnectivityAlertsState $) {
        this.connectivityAlerts = $.connectivityAlerts;
        this.processGroupId = $.processGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectivityAlertsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityAlertsState $;

        public Builder() {
            $ = new ConnectivityAlertsState();
        }

        public Builder(ConnectivityAlertsState defaults) {
            $ = new ConnectivityAlertsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectivityAlerts TCP connectivity problems
         * 
         * @return builder
         * 
         */
        public Builder connectivityAlerts(@Nullable Output<Boolean> connectivityAlerts) {
            $.connectivityAlerts = connectivityAlerts;
            return this;
        }

        /**
         * @param connectivityAlerts TCP connectivity problems
         * 
         * @return builder
         * 
         */
        public Builder connectivityAlerts(Boolean connectivityAlerts) {
            return connectivityAlerts(Output.of(connectivityAlerts));
        }

        /**
         * @param processGroupId The scope of this settings
         * 
         * @return builder
         * 
         */
        public Builder processGroupId(@Nullable Output<String> processGroupId) {
            $.processGroupId = processGroupId;
            return this;
        }

        /**
         * @param processGroupId The scope of this settings
         * 
         * @return builder
         * 
         */
        public Builder processGroupId(String processGroupId) {
            return processGroupId(Output.of(processGroupId));
        }

        public ConnectivityAlertsState build() {
            return $;
        }
    }

}
