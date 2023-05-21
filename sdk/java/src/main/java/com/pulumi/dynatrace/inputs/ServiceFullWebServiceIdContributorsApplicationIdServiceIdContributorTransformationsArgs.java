// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs;
import java.util.List;
import java.util.Objects;


public final class ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs Empty = new ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs();

    @Import(name="transformations", required=true)
    private Output<List<ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs>> transformations;

    public Output<List<ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs>> transformations() {
        return this.transformations;
    }

    private ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs() {}

    private ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs(ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs $) {
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs $;

        public Builder() {
            $ = new ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs();
        }

        public Builder(ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs defaults) {
            $ = new ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder transformations(Output<List<ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        public Builder transformations(List<ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        public Builder transformations(ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorTransformationsArgs build() {
            $.transformations = Objects.requireNonNull($.transformations, "expected parameter 'transformations' to be non-null");
            return $;
        }
    }

}
