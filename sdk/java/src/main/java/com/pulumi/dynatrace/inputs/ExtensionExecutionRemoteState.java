// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionExecutionRemoteState extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionExecutionRemoteState Empty = new ExtensionExecutionRemoteState();

    /**
     * Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     * 
     */
    @Import(name="performanceProfile")
    private @Nullable Output<String> performanceProfile;

    /**
     * @return Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     * 
     */
    public Optional<Output<String>> performanceProfile() {
        return Optional.ofNullable(this.performanceProfile);
    }

    /**
     * The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private ExtensionExecutionRemoteState() {}

    private ExtensionExecutionRemoteState(ExtensionExecutionRemoteState $) {
        this.performanceProfile = $.performanceProfile;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionExecutionRemoteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionExecutionRemoteState $;

        public Builder() {
            $ = new ExtensionExecutionRemoteState();
        }

        public Builder(ExtensionExecutionRemoteState defaults) {
            $ = new ExtensionExecutionRemoteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param performanceProfile Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(@Nullable Output<String> performanceProfile) {
            $.performanceProfile = performanceProfile;
            return this;
        }

        /**
         * @param performanceProfile Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(String performanceProfile) {
            return performanceProfile(Output.of(performanceProfile));
        }

        /**
         * @param scope The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ExtensionExecutionRemoteState build() {
            return $;
        }
    }

}
