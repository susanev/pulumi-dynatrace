// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingArgs;
import com.pulumi.dynatrace.inputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixedArgs;
import com.pulumi.dynatrace.inputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowestArgs;
import java.lang.String;
import java.util.Objects;


public final class MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs extends com.pulumi.resources.ResourceArgs {

    public static final MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs Empty = new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs();

    @Import(name="durationAvoidOveralerting", required=true)
    private Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingArgs> durationAvoidOveralerting;

    public Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingArgs> durationAvoidOveralerting() {
        return this.durationAvoidOveralerting;
    }

    @Import(name="durationThresholdAllFixed", required=true)
    private Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixedArgs> durationThresholdAllFixed;

    public Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixedArgs> durationThresholdAllFixed() {
        return this.durationThresholdAllFixed;
    }

    @Import(name="durationThresholdSlowest", required=true)
    private Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowestArgs> durationThresholdSlowest;

    public Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowestArgs> durationThresholdSlowest() {
        return this.durationThresholdSlowest;
    }

    @Import(name="sensitivity", required=true)
    private Output<String> sensitivity;

    public Output<String> sensitivity() {
        return this.sensitivity;
    }

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs() {}

    private MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs $) {
        this.durationAvoidOveralerting = $.durationAvoidOveralerting;
        this.durationThresholdAllFixed = $.durationThresholdAllFixed;
        this.durationThresholdSlowest = $.durationThresholdSlowest;
        this.sensitivity = $.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs $;

        public Builder() {
            $ = new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs();
        }

        public Builder(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs defaults) {
            $ = new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationAvoidOveralerting(Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingArgs> durationAvoidOveralerting) {
            $.durationAvoidOveralerting = durationAvoidOveralerting;
            return this;
        }

        public Builder durationAvoidOveralerting(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingArgs durationAvoidOveralerting) {
            return durationAvoidOveralerting(Output.of(durationAvoidOveralerting));
        }

        public Builder durationThresholdAllFixed(Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixedArgs> durationThresholdAllFixed) {
            $.durationThresholdAllFixed = durationThresholdAllFixed;
            return this;
        }

        public Builder durationThresholdAllFixed(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixedArgs durationThresholdAllFixed) {
            return durationThresholdAllFixed(Output.of(durationThresholdAllFixed));
        }

        public Builder durationThresholdSlowest(Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowestArgs> durationThresholdSlowest) {
            $.durationThresholdSlowest = durationThresholdSlowest;
            return this;
        }

        public Builder durationThresholdSlowest(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowestArgs durationThresholdSlowest) {
            return durationThresholdSlowest(Output.of(durationThresholdSlowest));
        }

        public Builder sensitivity(Output<String> sensitivity) {
            $.sensitivity = sensitivity;
            return this;
        }

        public Builder sensitivity(String sensitivity) {
            return sensitivity(Output.of(sensitivity));
        }

        public MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs build() {
            $.durationAvoidOveralerting = Objects.requireNonNull($.durationAvoidOveralerting, "expected parameter 'durationAvoidOveralerting' to be non-null");
            $.durationThresholdAllFixed = Objects.requireNonNull($.durationThresholdAllFixed, "expected parameter 'durationThresholdAllFixed' to be non-null");
            $.durationThresholdSlowest = Objects.requireNonNull($.durationThresholdSlowest, "expected parameter 'durationThresholdSlowest' to be non-null");
            $.sensitivity = Objects.requireNonNull($.sensitivity, "expected parameter 'sensitivity' to be non-null");
            return $;
        }
    }

}
