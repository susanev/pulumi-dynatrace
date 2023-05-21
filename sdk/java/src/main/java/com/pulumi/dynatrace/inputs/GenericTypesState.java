// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.GenericTypesRulesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GenericTypesState extends com.pulumi.resources.ResourceArgs {

    public static final GenericTypesState Empty = new GenericTypesState();

    /**
     * The user or extension that created this type.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The user or extension that created this type.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The human readable type name for this entity type.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The human readable type name for this entity type.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The entity type name. This type name must be unique and must not be changed after creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The entity type name. This type name must be unique and must not be changed after creation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify a list of rules which are evaluated in order. When **any** rule matches, the entity defined according to that rule will be extracted. Subsequent rules will not be evaluated.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<GenericTypesRulesArgs> rules;

    /**
     * @return Specify a list of rules which are evaluated in order. When **any** rule matches, the entity defined according to that rule will be extracted. Subsequent rules will not be evaluated.
     * 
     */
    public Optional<Output<GenericTypesRulesArgs>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private GenericTypesState() {}

    private GenericTypesState(GenericTypesState $) {
        this.createdBy = $.createdBy;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.name = $.name;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericTypesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericTypesState $;

        public Builder() {
            $ = new GenericTypesState();
        }

        public Builder(GenericTypesState defaults) {
            $ = new GenericTypesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdBy The user or extension that created this type.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The user or extension that created this type.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param displayName The human readable type name for this entity type.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human readable type name for this entity type.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
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
         * @param name The entity type name. This type name must be unique and must not be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The entity type name. This type name must be unique and must not be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rules Specify a list of rules which are evaluated in order. When **any** rule matches, the entity defined according to that rule will be extracted. Subsequent rules will not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<GenericTypesRulesArgs> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Specify a list of rules which are evaluated in order. When **any** rule matches, the entity defined according to that rule will be extracted. Subsequent rules will not be evaluated.
         * 
         * @return builder
         * 
         */
        public Builder rules(GenericTypesRulesArgs rules) {
            return rules(Output.of(rules));
        }

        public GenericTypesState build() {
            return $;
        }
    }

}
