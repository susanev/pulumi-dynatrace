// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributor;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceFullWebServiceIdContributorsWebServiceNamespace {
    private Boolean enableIdContributor;
    private @Nullable ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributor serviceIdContributor;

    private ServiceFullWebServiceIdContributorsWebServiceNamespace() {}
    public Boolean enableIdContributor() {
        return this.enableIdContributor;
    }
    public Optional<ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributor> serviceIdContributor() {
        return Optional.ofNullable(this.serviceIdContributor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebServiceIdContributorsWebServiceNamespace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableIdContributor;
        private @Nullable ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributor serviceIdContributor;
        public Builder() {}
        public Builder(ServiceFullWebServiceIdContributorsWebServiceNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIdContributor = defaults.enableIdContributor;
    	      this.serviceIdContributor = defaults.serviceIdContributor;
        }

        @CustomType.Setter
        public Builder enableIdContributor(Boolean enableIdContributor) {
            this.enableIdContributor = Objects.requireNonNull(enableIdContributor);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIdContributor(@Nullable ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributor serviceIdContributor) {
            this.serviceIdContributor = serviceIdContributor;
            return this;
        }
        public ServiceFullWebServiceIdContributorsWebServiceNamespace build() {
            final var o = new ServiceFullWebServiceIdContributorsWebServiceNamespace();
            o.enableIdContributor = enableIdContributor;
            o.serviceIdContributor = serviceIdContributor;
            return o;
        }
    }
}
