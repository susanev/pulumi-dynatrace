// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.K8sClusterAnomaliesMonitoringIssuesConfigurationArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class K8sClusterAnomaliesMonitoringIssuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sClusterAnomaliesMonitoringIssuesArgs Empty = new K8sClusterAnomaliesMonitoringIssuesArgs();

    /**
     * Alert if
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<K8sClusterAnomaliesMonitoringIssuesConfigurationArgs> configuration;

    /**
     * @return Alert if
     * 
     */
    public Optional<Output<K8sClusterAnomaliesMonitoringIssuesConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private K8sClusterAnomaliesMonitoringIssuesArgs() {}

    private K8sClusterAnomaliesMonitoringIssuesArgs(K8sClusterAnomaliesMonitoringIssuesArgs $) {
        this.configuration = $.configuration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sClusterAnomaliesMonitoringIssuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sClusterAnomaliesMonitoringIssuesArgs $;

        public Builder() {
            $ = new K8sClusterAnomaliesMonitoringIssuesArgs();
        }

        public Builder(K8sClusterAnomaliesMonitoringIssuesArgs defaults) {
            $ = new K8sClusterAnomaliesMonitoringIssuesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Alert if
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<K8sClusterAnomaliesMonitoringIssuesConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Alert if
         * 
         * @return builder
         * 
         */
        public Builder configuration(K8sClusterAnomaliesMonitoringIssuesConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public K8sClusterAnomaliesMonitoringIssuesArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
