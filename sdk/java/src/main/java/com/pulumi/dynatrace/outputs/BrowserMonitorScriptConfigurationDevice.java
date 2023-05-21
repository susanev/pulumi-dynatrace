// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrowserMonitorScriptConfigurationDevice {
    private @Nullable Integer height;
    private @Nullable Boolean mobile;
    private @Nullable String name;
    private @Nullable String orientation;
    private @Nullable Double scaleFactor;
    private @Nullable Boolean touchEnabled;
    private @Nullable Integer width;

    private BrowserMonitorScriptConfigurationDevice() {}
    public Optional<Integer> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<Boolean> mobile() {
        return Optional.ofNullable(this.mobile);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> orientation() {
        return Optional.ofNullable(this.orientation);
    }
    public Optional<Double> scaleFactor() {
        return Optional.ofNullable(this.scaleFactor);
    }
    public Optional<Boolean> touchEnabled() {
        return Optional.ofNullable(this.touchEnabled);
    }
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptConfigurationDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer height;
        private @Nullable Boolean mobile;
        private @Nullable String name;
        private @Nullable String orientation;
        private @Nullable Double scaleFactor;
        private @Nullable Boolean touchEnabled;
        private @Nullable Integer width;
        public Builder() {}
        public Builder(BrowserMonitorScriptConfigurationDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.mobile = defaults.mobile;
    	      this.name = defaults.name;
    	      this.orientation = defaults.orientation;
    	      this.scaleFactor = defaults.scaleFactor;
    	      this.touchEnabled = defaults.touchEnabled;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder height(@Nullable Integer height) {
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder mobile(@Nullable Boolean mobile) {
            this.mobile = mobile;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orientation(@Nullable String orientation) {
            this.orientation = orientation;
            return this;
        }
        @CustomType.Setter
        public Builder scaleFactor(@Nullable Double scaleFactor) {
            this.scaleFactor = scaleFactor;
            return this;
        }
        @CustomType.Setter
        public Builder touchEnabled(@Nullable Boolean touchEnabled) {
            this.touchEnabled = touchEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable Integer width) {
            this.width = width;
            return this;
        }
        public BrowserMonitorScriptConfigurationDevice build() {
            final var o = new BrowserMonitorScriptConfigurationDevice();
            o.height = height;
            o.mobile = mobile;
            o.name = name;
            o.orientation = orientation;
            o.scaleFactor = scaleFactor;
            o.touchEnabled = touchEnabled;
            o.width = width;
            return o;
        }
    }
}
