// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserActionMetricsFiltersFilter {
    private String fieldName;
    private String operator;
    /**
     * @return Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
     * 
     */
    private @Nullable String value;
    private @Nullable List<String> valueIns;

    private UserActionMetricsFiltersFilter() {}
    public String fieldName() {
        return this.fieldName;
    }
    public String operator() {
        return this.operator;
    }
    /**
     * @return Defines the type of value to be extracted from the user action. When using **user action counter**, the number of user actions is counted (similar to count(*) when using USQL). When using **user action field value**, the value of a user action field is extracted.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    public List<String> valueIns() {
        return this.valueIns == null ? List.of() : this.valueIns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserActionMetricsFiltersFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private String operator;
        private @Nullable String value;
        private @Nullable List<String> valueIns;
        public Builder() {}
        public Builder(UserActionMetricsFiltersFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
    	      this.valueIns = defaults.valueIns;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueIns(@Nullable List<String> valueIns) {
            this.valueIns = valueIns;
            return this;
        }
        public Builder valueIns(String... valueIns) {
            return valueIns(List.of(valueIns));
        }
        public UserActionMetricsFiltersFilter build() {
            final var o = new UserActionMetricsFiltersFilter();
            o.fieldName = fieldName;
            o.operator = operator;
            o.value = value;
            o.valueIns = valueIns;
            return o;
        }
    }
}
