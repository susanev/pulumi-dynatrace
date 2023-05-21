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


public final class SpanAttributedArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpanAttributedArgs Empty = new SpanAttributedArgs();

    /**
     * the key of the attribute to capture
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return the key of the attribute to capture
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * granular control over the visibility of attribute values
     * 
     */
    @Import(name="masking", required=true)
    private Output<String> masking;

    /**
     * @return granular control over the visibility of attribute values
     * 
     */
    public Output<String> masking() {
        return this.masking;
    }

    /**
     * Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
     * are defined by default on every Dynatrace environment.
     * 
     */
    @Import(name="persistent")
    private @Nullable Output<Boolean> persistent;

    /**
     * @return Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
     * are defined by default on every Dynatrace environment.
     * 
     */
    public Optional<Output<Boolean>> persistent() {
        return Optional.ofNullable(this.persistent);
    }

    private SpanAttributedArgs() {}

    private SpanAttributedArgs(SpanAttributedArgs $) {
        this.key = $.key;
        this.masking = $.masking;
        this.persistent = $.persistent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpanAttributedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpanAttributedArgs $;

        public Builder() {
            $ = new SpanAttributedArgs();
        }

        public Builder(SpanAttributedArgs defaults) {
            $ = new SpanAttributedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key the key of the attribute to capture
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key the key of the attribute to capture
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param masking granular control over the visibility of attribute values
         * 
         * @return builder
         * 
         */
        public Builder masking(Output<String> masking) {
            $.masking = masking;
            return this;
        }

        /**
         * @param masking granular control over the visibility of attribute values
         * 
         * @return builder
         * 
         */
        public Builder masking(String masking) {
            return masking(Output.of(masking));
        }

        /**
         * @param persistent Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
         * are defined by default on every Dynatrace environment.
         * 
         * @return builder
         * 
         */
        public Builder persistent(@Nullable Output<Boolean> persistent) {
            $.persistent = persistent;
            return this;
        }

        /**
         * @param persistent Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
         * are defined by default on every Dynatrace environment.
         * 
         * @return builder
         * 
         */
        public Builder persistent(Boolean persistent) {
            return persistent(Output.of(persistent));
        }

        public SpanAttributedArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.masking = Objects.requireNonNull($.masking, "expected parameter 'masking' to be non-null");
            return $;
        }
    }

}
