// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs Empty = new ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs();

    @Import(name="includeHexNumbers")
    private @Nullable Output<Boolean> includeHexNumbers;

    public Optional<Output<Boolean>> includeHexNumbers() {
        return Optional.ofNullable(this.includeHexNumbers);
    }

    @Import(name="minDigitCount")
    private @Nullable Output<Integer> minDigitCount;

    public Optional<Output<Integer>> minDigitCount() {
        return Optional.ofNullable(this.minDigitCount);
    }

    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="replacementValue")
    private @Nullable Output<String> replacementValue;

    public Optional<Output<String>> replacementValue() {
        return Optional.ofNullable(this.replacementValue);
    }

    @Import(name="segmentCount")
    private @Nullable Output<Integer> segmentCount;

    public Optional<Output<Integer>> segmentCount() {
        return Optional.ofNullable(this.segmentCount);
    }

    @Import(name="selectIndex")
    private @Nullable Output<Integer> selectIndex;

    public Optional<Output<Integer>> selectIndex() {
        return Optional.ofNullable(this.selectIndex);
    }

    @Import(name="splitDelimiter")
    private @Nullable Output<String> splitDelimiter;

    public Optional<Output<String>> splitDelimiter() {
        return Optional.ofNullable(this.splitDelimiter);
    }

    @Import(name="suffix")
    private @Nullable Output<String> suffix;

    public Optional<Output<String>> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    @Import(name="takeFromEnd")
    private @Nullable Output<Boolean> takeFromEnd;

    public Optional<Output<Boolean>> takeFromEnd() {
        return Optional.ofNullable(this.takeFromEnd);
    }

    @Import(name="transformationType", required=true)
    private Output<String> transformationType;

    public Output<String> transformationType() {
        return this.transformationType;
    }

    private ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs() {}

    private ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs(ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs $) {
        this.includeHexNumbers = $.includeHexNumbers;
        this.minDigitCount = $.minDigitCount;
        this.prefix = $.prefix;
        this.replacementValue = $.replacementValue;
        this.segmentCount = $.segmentCount;
        this.selectIndex = $.selectIndex;
        this.splitDelimiter = $.splitDelimiter;
        this.suffix = $.suffix;
        this.takeFromEnd = $.takeFromEnd;
        this.transformationType = $.transformationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs $;

        public Builder() {
            $ = new ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs();
        }

        public Builder(ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs defaults) {
            $ = new ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeHexNumbers(@Nullable Output<Boolean> includeHexNumbers) {
            $.includeHexNumbers = includeHexNumbers;
            return this;
        }

        public Builder includeHexNumbers(Boolean includeHexNumbers) {
            return includeHexNumbers(Output.of(includeHexNumbers));
        }

        public Builder minDigitCount(@Nullable Output<Integer> minDigitCount) {
            $.minDigitCount = minDigitCount;
            return this;
        }

        public Builder minDigitCount(Integer minDigitCount) {
            return minDigitCount(Output.of(minDigitCount));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder replacementValue(@Nullable Output<String> replacementValue) {
            $.replacementValue = replacementValue;
            return this;
        }

        public Builder replacementValue(String replacementValue) {
            return replacementValue(Output.of(replacementValue));
        }

        public Builder segmentCount(@Nullable Output<Integer> segmentCount) {
            $.segmentCount = segmentCount;
            return this;
        }

        public Builder segmentCount(Integer segmentCount) {
            return segmentCount(Output.of(segmentCount));
        }

        public Builder selectIndex(@Nullable Output<Integer> selectIndex) {
            $.selectIndex = selectIndex;
            return this;
        }

        public Builder selectIndex(Integer selectIndex) {
            return selectIndex(Output.of(selectIndex));
        }

        public Builder splitDelimiter(@Nullable Output<String> splitDelimiter) {
            $.splitDelimiter = splitDelimiter;
            return this;
        }

        public Builder splitDelimiter(String splitDelimiter) {
            return splitDelimiter(Output.of(splitDelimiter));
        }

        public Builder suffix(@Nullable Output<String> suffix) {
            $.suffix = suffix;
            return this;
        }

        public Builder suffix(String suffix) {
            return suffix(Output.of(suffix));
        }

        public Builder takeFromEnd(@Nullable Output<Boolean> takeFromEnd) {
            $.takeFromEnd = takeFromEnd;
            return this;
        }

        public Builder takeFromEnd(Boolean takeFromEnd) {
            return takeFromEnd(Output.of(takeFromEnd));
        }

        public Builder transformationType(Output<String> transformationType) {
            $.transformationType = transformationType;
            return this;
        }

        public Builder transformationType(String transformationType) {
            return transformationType(Output.of(transformationType));
        }

        public ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformationsTransformationArgs build() {
            $.transformationType = Objects.requireNonNull($.transformationType, "expected parameter 'transformationType' to be non-null");
            return $;
        }
    }

}
