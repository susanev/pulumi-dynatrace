// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagementZoneV2RulesRuleAttributeRuleAttributeConditions {
    private @Nullable List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition> conditions;

    private ManagementZoneV2RulesRuleAttributeRuleAttributeConditions() {}
    public List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementZoneV2RulesRuleAttributeRuleAttributeConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition> conditions;
        public Builder() {}
        public Builder(ManagementZoneV2RulesRuleAttributeRuleAttributeConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(@Nullable List<ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ManagementZoneV2RulesRuleAttributeRuleAttributeConditionsCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public ManagementZoneV2RulesRuleAttributeRuleAttributeConditions build() {
            final var o = new ManagementZoneV2RulesRuleAttributeRuleAttributeConditions();
            o.conditions = conditions;
            return o;
        }
    }
}
