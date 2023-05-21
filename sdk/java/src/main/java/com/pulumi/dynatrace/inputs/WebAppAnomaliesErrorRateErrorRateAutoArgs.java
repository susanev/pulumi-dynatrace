// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesErrorRateErrorRateAutoOverAlertingProtectionArgs;
import java.lang.Double;
import java.util.Objects;


public final class WebAppAnomaliesErrorRateErrorRateAutoArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAnomaliesErrorRateErrorRateAutoArgs Empty = new WebAppAnomaliesErrorRateErrorRateAutoArgs();

    @Import(name="absoluteIncrease", required=true)
    private Output<Double> absoluteIncrease;

    public Output<Double> absoluteIncrease() {
        return this.absoluteIncrease;
    }

    @Import(name="overAlertingProtection", required=true)
    private Output<WebAppAnomaliesErrorRateErrorRateAutoOverAlertingProtectionArgs> overAlertingProtection;

    public Output<WebAppAnomaliesErrorRateErrorRateAutoOverAlertingProtectionArgs> overAlertingProtection() {
        return this.overAlertingProtection;
    }

    @Import(name="relativeIncrease", required=true)
    private Output<Double> relativeIncrease;

    public Output<Double> relativeIncrease() {
        return this.relativeIncrease;
    }

    private WebAppAnomaliesErrorRateErrorRateAutoArgs() {}

    private WebAppAnomaliesErrorRateErrorRateAutoArgs(WebAppAnomaliesErrorRateErrorRateAutoArgs $) {
        this.absoluteIncrease = $.absoluteIncrease;
        this.overAlertingProtection = $.overAlertingProtection;
        this.relativeIncrease = $.relativeIncrease;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAnomaliesErrorRateErrorRateAutoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAnomaliesErrorRateErrorRateAutoArgs $;

        public Builder() {
            $ = new WebAppAnomaliesErrorRateErrorRateAutoArgs();
        }

        public Builder(WebAppAnomaliesErrorRateErrorRateAutoArgs defaults) {
            $ = new WebAppAnomaliesErrorRateErrorRateAutoArgs(Objects.requireNonNull(defaults));
        }

        public Builder absoluteIncrease(Output<Double> absoluteIncrease) {
            $.absoluteIncrease = absoluteIncrease;
            return this;
        }

        public Builder absoluteIncrease(Double absoluteIncrease) {
            return absoluteIncrease(Output.of(absoluteIncrease));
        }

        public Builder overAlertingProtection(Output<WebAppAnomaliesErrorRateErrorRateAutoOverAlertingProtectionArgs> overAlertingProtection) {
            $.overAlertingProtection = overAlertingProtection;
            return this;
        }

        public Builder overAlertingProtection(WebAppAnomaliesErrorRateErrorRateAutoOverAlertingProtectionArgs overAlertingProtection) {
            return overAlertingProtection(Output.of(overAlertingProtection));
        }

        public Builder relativeIncrease(Output<Double> relativeIncrease) {
            $.relativeIncrease = relativeIncrease;
            return this;
        }

        public Builder relativeIncrease(Double relativeIncrease) {
            return relativeIncrease(Output.of(relativeIncrease));
        }

        public WebAppAnomaliesErrorRateErrorRateAutoArgs build() {
            $.absoluteIncrease = Objects.requireNonNull($.absoluteIncrease, "expected parameter 'absoluteIncrease' to be non-null");
            $.overAlertingProtection = Objects.requireNonNull($.overAlertingProtection, "expected parameter 'overAlertingProtection' to be non-null");
            $.relativeIncrease = Objects.requireNonNull($.relativeIncrease, "expected parameter 'relativeIncrease' to be non-null");
            return $;
        }
    }

}
