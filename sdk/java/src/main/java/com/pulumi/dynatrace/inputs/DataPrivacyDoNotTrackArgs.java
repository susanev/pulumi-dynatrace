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


public final class DataPrivacyDoNotTrackArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataPrivacyDoNotTrackArgs Empty = new DataPrivacyDoNotTrackArgs();

    /**
     * Comply with &#34;Do Not Track&#34; browser settings
     * 
     */
    @Import(name="complyWithDoNotTrack", required=true)
    private Output<Boolean> complyWithDoNotTrack;

    /**
     * @return Comply with &#34;Do Not Track&#34; browser settings
     * 
     */
    public Output<Boolean> complyWithDoNotTrack() {
        return this.complyWithDoNotTrack;
    }

    /**
     * Possible Values: `Anonymous`, `Disable_rum`
     * 
     */
    @Import(name="doNotTrack")
    private @Nullable Output<String> doNotTrack;

    /**
     * @return Possible Values: `Anonymous`, `Disable_rum`
     * 
     */
    public Optional<Output<String>> doNotTrack() {
        return Optional.ofNullable(this.doNotTrack);
    }

    private DataPrivacyDoNotTrackArgs() {}

    private DataPrivacyDoNotTrackArgs(DataPrivacyDoNotTrackArgs $) {
        this.complyWithDoNotTrack = $.complyWithDoNotTrack;
        this.doNotTrack = $.doNotTrack;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPrivacyDoNotTrackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPrivacyDoNotTrackArgs $;

        public Builder() {
            $ = new DataPrivacyDoNotTrackArgs();
        }

        public Builder(DataPrivacyDoNotTrackArgs defaults) {
            $ = new DataPrivacyDoNotTrackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param complyWithDoNotTrack Comply with &#34;Do Not Track&#34; browser settings
         * 
         * @return builder
         * 
         */
        public Builder complyWithDoNotTrack(Output<Boolean> complyWithDoNotTrack) {
            $.complyWithDoNotTrack = complyWithDoNotTrack;
            return this;
        }

        /**
         * @param complyWithDoNotTrack Comply with &#34;Do Not Track&#34; browser settings
         * 
         * @return builder
         * 
         */
        public Builder complyWithDoNotTrack(Boolean complyWithDoNotTrack) {
            return complyWithDoNotTrack(Output.of(complyWithDoNotTrack));
        }

        /**
         * @param doNotTrack Possible Values: `Anonymous`, `Disable_rum`
         * 
         * @return builder
         * 
         */
        public Builder doNotTrack(@Nullable Output<String> doNotTrack) {
            $.doNotTrack = doNotTrack;
            return this;
        }

        /**
         * @param doNotTrack Possible Values: `Anonymous`, `Disable_rum`
         * 
         * @return builder
         * 
         */
        public Builder doNotTrack(String doNotTrack) {
            return doNotTrack(Output.of(doNotTrack));
        }

        public DataPrivacyDoNotTrackArgs build() {
            $.complyWithDoNotTrack = Objects.requireNonNull($.complyWithDoNotTrack, "expected parameter 'complyWithDoNotTrack' to be non-null");
            return $;
        }
    }

}
