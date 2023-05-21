// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DataPrivacyDataCollectionArgs;
import com.pulumi.dynatrace.inputs.DataPrivacyDoNotTrackArgs;
import com.pulumi.dynatrace.inputs.DataPrivacyMaskingArgs;
import com.pulumi.dynatrace.inputs.DataPrivacyUserTrackingArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPrivacyState extends com.pulumi.resources.ResourceArgs {

    public static final DataPrivacyState Empty = new DataPrivacyState();

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
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
     * 
     */
    @Import(name="dataCollection")
    private @Nullable Output<DataPrivacyDataCollectionArgs> dataCollection;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
     * 
     */
    public Optional<Output<DataPrivacyDataCollectionArgs>> dataCollection() {
        return Optional.ofNullable(this.dataCollection);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called [&#34;Do Not Track&#34;](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
     * 
     */
    @Import(name="doNotTrack")
    private @Nullable Output<DataPrivacyDoNotTrackArgs> doNotTrack;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called [&#34;Do Not Track&#34;](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
     * 
     */
    public Optional<Output<DataPrivacyDoNotTrackArgs>> doNotTrack() {
        return Optional.ofNullable(this.doNotTrack);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`)
     * 
     */
    @Import(name="masking")
    private @Nullable Output<DataPrivacyMaskingArgs> masking;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`)
     * 
     */
    public Optional<Output<DataPrivacyMaskingArgs>> masking() {
        return Optional.ofNullable(this.masking);
    }

    /**
     * (Field has overlap with `dynatrace.ApplicationDataPrivacy`) User tracking
     * 
     */
    @Import(name="userTracking")
    private @Nullable Output<DataPrivacyUserTrackingArgs> userTracking;

    /**
     * @return (Field has overlap with `dynatrace.ApplicationDataPrivacy`) User tracking
     * 
     */
    public Optional<Output<DataPrivacyUserTrackingArgs>> userTracking() {
        return Optional.ofNullable(this.userTracking);
    }

    private DataPrivacyState() {}

    private DataPrivacyState(DataPrivacyState $) {
        this.applicationId = $.applicationId;
        this.dataCollection = $.dataCollection;
        this.doNotTrack = $.doNotTrack;
        this.masking = $.masking;
        this.userTracking = $.userTracking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataPrivacyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataPrivacyState $;

        public Builder() {
            $ = new DataPrivacyState();
        }

        public Builder(DataPrivacyState defaults) {
            $ = new DataPrivacyState(Objects.requireNonNull(defaults));
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
         * @param dataCollection (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
         * 
         * @return builder
         * 
         */
        public Builder dataCollection(@Nullable Output<DataPrivacyDataCollectionArgs> dataCollection) {
            $.dataCollection = dataCollection;
            return this;
        }

        /**
         * @param dataCollection (Field has overlap with `dynatrace.ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
         * 
         * @return builder
         * 
         */
        public Builder dataCollection(DataPrivacyDataCollectionArgs dataCollection) {
            return dataCollection(Output.of(dataCollection));
        }

        /**
         * @param doNotTrack (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called [&#34;Do Not Track&#34;](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
         * 
         * @return builder
         * 
         */
        public Builder doNotTrack(@Nullable Output<DataPrivacyDoNotTrackArgs> doNotTrack) {
            $.doNotTrack = doNotTrack;
            return this;
        }

        /**
         * @param doNotTrack (Field has overlap with `dynatrace.ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called [&#34;Do Not Track&#34;](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
         * 
         * @return builder
         * 
         */
        public Builder doNotTrack(DataPrivacyDoNotTrackArgs doNotTrack) {
            return doNotTrack(Output.of(doNotTrack));
        }

        /**
         * @param masking (Field has overlap with `dynatrace.ApplicationDataPrivacy`)
         * 
         * @return builder
         * 
         */
        public Builder masking(@Nullable Output<DataPrivacyMaskingArgs> masking) {
            $.masking = masking;
            return this;
        }

        /**
         * @param masking (Field has overlap with `dynatrace.ApplicationDataPrivacy`)
         * 
         * @return builder
         * 
         */
        public Builder masking(DataPrivacyMaskingArgs masking) {
            return masking(Output.of(masking));
        }

        /**
         * @param userTracking (Field has overlap with `dynatrace.ApplicationDataPrivacy`) User tracking
         * 
         * @return builder
         * 
         */
        public Builder userTracking(@Nullable Output<DataPrivacyUserTrackingArgs> userTracking) {
            $.userTracking = userTracking;
            return this;
        }

        /**
         * @param userTracking (Field has overlap with `dynatrace.ApplicationDataPrivacy`) User tracking
         * 
         * @return builder
         * 
         */
        public Builder userTracking(DataPrivacyUserTrackingArgs userTracking) {
            return userTracking(Output.of(userTracking));
        }

        public DataPrivacyState build() {
            return $;
        }
    }

}
