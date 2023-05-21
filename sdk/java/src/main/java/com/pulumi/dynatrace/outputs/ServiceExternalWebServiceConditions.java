// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceExternalWebServiceConditionsCondition;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceExternalWebServiceConditions {
    private List<ServiceExternalWebServiceConditionsCondition> conditions;

    private ServiceExternalWebServiceConditions() {}
    public List<ServiceExternalWebServiceConditionsCondition> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalWebServiceConditions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceExternalWebServiceConditionsCondition> conditions;
        public Builder() {}
        public Builder(ServiceExternalWebServiceConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder conditions(List<ServiceExternalWebServiceConditionsCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(ServiceExternalWebServiceConditionsCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public ServiceExternalWebServiceConditions build() {
            final var o = new ServiceExternalWebServiceConditions();
            o.conditions = conditions;
            return o;
        }
    }
}
