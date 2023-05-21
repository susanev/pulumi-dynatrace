// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CloudappWorkloaddetectionKubernetesFiltersFilterInclusionTogglesArgs;
import com.pulumi.dynatrace.inputs.CloudappWorkloaddetectionKubernetesFiltersFilterMatchFilterArgs;
import java.lang.Boolean;
import java.util.Objects;


public final class CloudappWorkloaddetectionKubernetesFiltersFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudappWorkloaddetectionKubernetesFiltersFilterArgs Empty = new CloudappWorkloaddetectionKubernetesFiltersFilterArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="inclusionToggles", required=true)
    private Output<CloudappWorkloaddetectionKubernetesFiltersFilterInclusionTogglesArgs> inclusionToggles;

    public Output<CloudappWorkloaddetectionKubernetesFiltersFilterInclusionTogglesArgs> inclusionToggles() {
        return this.inclusionToggles;
    }

    @Import(name="matchFilter", required=true)
    private Output<CloudappWorkloaddetectionKubernetesFiltersFilterMatchFilterArgs> matchFilter;

    public Output<CloudappWorkloaddetectionKubernetesFiltersFilterMatchFilterArgs> matchFilter() {
        return this.matchFilter;
    }

    private CloudappWorkloaddetectionKubernetesFiltersFilterArgs() {}

    private CloudappWorkloaddetectionKubernetesFiltersFilterArgs(CloudappWorkloaddetectionKubernetesFiltersFilterArgs $) {
        this.enabled = $.enabled;
        this.inclusionToggles = $.inclusionToggles;
        this.matchFilter = $.matchFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudappWorkloaddetectionKubernetesFiltersFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudappWorkloaddetectionKubernetesFiltersFilterArgs $;

        public Builder() {
            $ = new CloudappWorkloaddetectionKubernetesFiltersFilterArgs();
        }

        public Builder(CloudappWorkloaddetectionKubernetesFiltersFilterArgs defaults) {
            $ = new CloudappWorkloaddetectionKubernetesFiltersFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder inclusionToggles(Output<CloudappWorkloaddetectionKubernetesFiltersFilterInclusionTogglesArgs> inclusionToggles) {
            $.inclusionToggles = inclusionToggles;
            return this;
        }

        public Builder inclusionToggles(CloudappWorkloaddetectionKubernetesFiltersFilterInclusionTogglesArgs inclusionToggles) {
            return inclusionToggles(Output.of(inclusionToggles));
        }

        public Builder matchFilter(Output<CloudappWorkloaddetectionKubernetesFiltersFilterMatchFilterArgs> matchFilter) {
            $.matchFilter = matchFilter;
            return this;
        }

        public Builder matchFilter(CloudappWorkloaddetectionKubernetesFiltersFilterMatchFilterArgs matchFilter) {
            return matchFilter(Output.of(matchFilter));
        }

        public CloudappWorkloaddetectionKubernetesFiltersFilterArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.inclusionToggles = Objects.requireNonNull($.inclusionToggles, "expected parameter 'inclusionToggles' to be non-null");
            $.matchFilter = Objects.requireNonNull($.matchFilter, "expected parameter 'matchFilter' to be non-null");
            return $;
        }
    }

}
