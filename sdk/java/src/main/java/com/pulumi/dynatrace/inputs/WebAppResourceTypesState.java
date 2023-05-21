// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppResourceTypesState extends com.pulumi.resources.ResourceArgs {

    public static final WebAppResourceTypesState Empty = new WebAppResourceTypesState();

    /**
     * Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
     * 
     */
    @Import(name="primaryResourceType")
    private @Nullable Output<String> primaryResourceType;

    /**
     * @return Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
     * 
     */
    public Optional<Output<String>> primaryResourceType() {
        return Optional.ofNullable(this.primaryResourceType);
    }

    /**
     * The regular expression to detect the resource.
     * 
     */
    @Import(name="regularExpression")
    private @Nullable Output<String> regularExpression;

    /**
     * @return The regular expression to detect the resource.
     * 
     */
    public Optional<Output<String>> regularExpression() {
        return Optional.ofNullable(this.regularExpression);
    }

    /**
     * The secondary type of the resource.
     * 
     */
    @Import(name="secondaryResourceType")
    private @Nullable Output<String> secondaryResourceType;

    /**
     * @return The secondary type of the resource.
     * 
     */
    public Optional<Output<String>> secondaryResourceType() {
        return Optional.ofNullable(this.secondaryResourceType);
    }

    private WebAppResourceTypesState() {}

    private WebAppResourceTypesState(WebAppResourceTypesState $) {
        this.primaryResourceType = $.primaryResourceType;
        this.regularExpression = $.regularExpression;
        this.secondaryResourceType = $.secondaryResourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppResourceTypesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppResourceTypesState $;

        public Builder() {
            $ = new WebAppResourceTypesState();
        }

        public Builder(WebAppResourceTypesState defaults) {
            $ = new WebAppResourceTypesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param primaryResourceType Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
         * 
         * @return builder
         * 
         */
        public Builder primaryResourceType(@Nullable Output<String> primaryResourceType) {
            $.primaryResourceType = primaryResourceType;
            return this;
        }

        /**
         * @param primaryResourceType Possible Values: `CSS`, `IMAGE`, `OTHER`, `SCRIPT`
         * 
         * @return builder
         * 
         */
        public Builder primaryResourceType(String primaryResourceType) {
            return primaryResourceType(Output.of(primaryResourceType));
        }

        /**
         * @param regularExpression The regular expression to detect the resource.
         * 
         * @return builder
         * 
         */
        public Builder regularExpression(@Nullable Output<String> regularExpression) {
            $.regularExpression = regularExpression;
            return this;
        }

        /**
         * @param regularExpression The regular expression to detect the resource.
         * 
         * @return builder
         * 
         */
        public Builder regularExpression(String regularExpression) {
            return regularExpression(Output.of(regularExpression));
        }

        /**
         * @param secondaryResourceType The secondary type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder secondaryResourceType(@Nullable Output<String> secondaryResourceType) {
            $.secondaryResourceType = secondaryResourceType;
            return this;
        }

        /**
         * @param secondaryResourceType The secondary type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder secondaryResourceType(String secondaryResourceType) {
            return secondaryResourceType(Output.of(secondaryResourceType));
        }

        public WebAppResourceTypesState build() {
            return $;
        }
    }

}
