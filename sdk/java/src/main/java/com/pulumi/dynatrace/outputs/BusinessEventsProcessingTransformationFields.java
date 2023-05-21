// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BusinessEventsProcessingTransformationFieldsTransformationField;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BusinessEventsProcessingTransformationFields {
    private List<BusinessEventsProcessingTransformationFieldsTransformationField> transformationFields;

    private BusinessEventsProcessingTransformationFields() {}
    public List<BusinessEventsProcessingTransformationFieldsTransformationField> transformationFields() {
        return this.transformationFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessEventsProcessingTransformationFields defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BusinessEventsProcessingTransformationFieldsTransformationField> transformationFields;
        public Builder() {}
        public Builder(BusinessEventsProcessingTransformationFields defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformationFields = defaults.transformationFields;
        }

        @CustomType.Setter
        public Builder transformationFields(List<BusinessEventsProcessingTransformationFieldsTransformationField> transformationFields) {
            this.transformationFields = Objects.requireNonNull(transformationFields);
            return this;
        }
        public Builder transformationFields(BusinessEventsProcessingTransformationFieldsTransformationField... transformationFields) {
            return transformationFields(List.of(transformationFields));
        }
        public BusinessEventsProcessingTransformationFields build() {
            final var o = new BusinessEventsProcessingTransformationFields();
            o.transformationFields = transformationFields;
            return o;
        }
    }
}
