// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs Empty = new FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs();

    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="compareOperationType", required=true)
    private Output<String> compareOperationType;

    public Output<String> compareOperationType() {
        return this.compareOperationType;
    }

    @Import(name="doubleValue")
    private @Nullable Output<Double> doubleValue;

    public Optional<Output<Double>> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }

    @Import(name="intValue")
    private @Nullable Output<Integer> intValue;

    public Optional<Output<Integer>> intValue() {
        return Optional.ofNullable(this.intValue);
    }

    @Import(name="textValue")
    private @Nullable Output<String> textValue;

    public Optional<Output<String>> textValue() {
        return Optional.ofNullable(this.textValue);
    }

    private FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs() {}

    private FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs(FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.compareOperationType = $.compareOperationType;
        this.doubleValue = $.doubleValue;
        this.intValue = $.intValue;
        this.textValue = $.textValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs $;

        public Builder() {
            $ = new FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs();
        }

        public Builder(FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs defaults) {
            $ = new FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder compareOperationType(Output<String> compareOperationType) {
            $.compareOperationType = compareOperationType;
            return this;
        }

        public Builder compareOperationType(String compareOperationType) {
            return compareOperationType(Output.of(compareOperationType));
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            $.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(Double doubleValue) {
            return doubleValue(Output.of(doubleValue));
        }

        public Builder intValue(@Nullable Output<Integer> intValue) {
            $.intValue = intValue;
            return this;
        }

        public Builder intValue(Integer intValue) {
            return intValue(Output.of(intValue));
        }

        public Builder textValue(@Nullable Output<String> textValue) {
            $.textValue = textValue;
            return this;
        }

        public Builder textValue(String textValue) {
            return textValue(Output.of(textValue));
        }

        public FailureDetectionParametersExceptionRulesCustomErrorRulesCustomErrorRuleConditionArgs build() {
            $.compareOperationType = Objects.requireNonNull($.compareOperationType, "expected parameter 'compareOperationType' to be non-null");
            return $;
        }
    }

}
