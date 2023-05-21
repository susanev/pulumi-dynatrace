// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceConditionsArgs;
import com.pulumi.dynatrace.inputs.ServiceFullWebServiceIdContributorsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceFullWebServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFullWebServiceArgs Empty = new ServiceFullWebServiceArgs();

    /**
     * A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<ServiceFullWebServiceConditionsArgs> conditions;

    /**
     * @return A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
     * 
     */
    public Optional<Output<ServiceFullWebServiceConditionsArgs>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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

    /**
     * Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     * 
     */
    @Import(name="idContributors", required=true)
    private Output<ServiceFullWebServiceIdContributorsArgs> idContributors;

    /**
     * @return Contributors to the Service Identifier calculation. All of the Contributors always get applied.
     * 
     */
    public Output<ServiceFullWebServiceIdContributorsArgs> idContributors() {
        return this.idContributors;
    }

    /**
     * Define a management zone filter for this service detection rule.
     * 
     */
    @Import(name="managementZones")
    private @Nullable Output<List<String>> managementZones;

    /**
     * @return Define a management zone filter for this service detection rule.
     * 
     */
    public Optional<Output<List<String>>> managementZones() {
        return Optional.ofNullable(this.managementZones);
    }

    /**
     * Rule name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Rule name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ServiceFullWebServiceArgs() {}

    private ServiceFullWebServiceArgs(ServiceFullWebServiceArgs $) {
        this.conditions = $.conditions;
        this.description = $.description;
        this.enabled = $.enabled;
        this.idContributors = $.idContributors;
        this.managementZones = $.managementZones;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFullWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFullWebServiceArgs $;

        public Builder() {
            $ = new ServiceFullWebServiceArgs();
        }

        public Builder(ServiceFullWebServiceArgs defaults) {
            $ = new ServiceFullWebServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<ServiceFullWebServiceConditionsArgs> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions A list of conditions necessary for the rule to take effect. If multiple conditions are specified, they **all** must match a Request for the rule to apply. Conditions evaluate against attributes, but do not modify them.
         * 
         * @return builder
         * 
         */
        public Builder conditions(ServiceFullWebServiceConditionsArgs conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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

        /**
         * @param idContributors Contributors to the Service Identifier calculation. All of the Contributors always get applied.
         * 
         * @return builder
         * 
         */
        public Builder idContributors(Output<ServiceFullWebServiceIdContributorsArgs> idContributors) {
            $.idContributors = idContributors;
            return this;
        }

        /**
         * @param idContributors Contributors to the Service Identifier calculation. All of the Contributors always get applied.
         * 
         * @return builder
         * 
         */
        public Builder idContributors(ServiceFullWebServiceIdContributorsArgs idContributors) {
            return idContributors(Output.of(idContributors));
        }

        /**
         * @param managementZones Define a management zone filter for this service detection rule.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(@Nullable Output<List<String>> managementZones) {
            $.managementZones = managementZones;
            return this;
        }

        /**
         * @param managementZones Define a management zone filter for this service detection rule.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(List<String> managementZones) {
            return managementZones(Output.of(managementZones));
        }

        /**
         * @param managementZones Define a management zone filter for this service detection rule.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(String... managementZones) {
            return managementZones(List.of(managementZones));
        }

        /**
         * @param name Rule name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Rule name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ServiceFullWebServiceArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.idContributors = Objects.requireNonNull($.idContributors, "expected parameter 'idContributors' to be non-null");
            return $;
        }
    }

}
