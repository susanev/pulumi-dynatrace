// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MaintenanceWindowScheduleArgs;
import com.pulumi.dynatrace.inputs.MaintenanceWindowScopeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowState extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowState Empty = new MaintenanceWindowState();

    /**
     * A short description of the maintenance purpose
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the maintenance purpose
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Maintenance Window is enabled or disabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The Maintenance Window is enabled or disabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the maintenance window, displayed in the UI
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the maintenance window, displayed in the UI
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schedule of the maintenance window
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<MaintenanceWindowScheduleArgs> schedule;

    /**
     * @return The schedule of the maintenance window
     * 
     */
    public Optional<Output<MaintenanceWindowScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * the tiles this Dashboard consist of
     * 
     */
    @Import(name="scope")
    private @Nullable Output<MaintenanceWindowScopeArgs> scope;

    /**
     * @return the tiles this Dashboard consist of
     * 
     */
    public Optional<Output<MaintenanceWindowScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Suppress execution of synthetic monitors during the maintenance
     * 
     */
    @Import(name="suppressSynthMonExec")
    private @Nullable Output<Boolean> suppressSynthMonExec;

    /**
     * @return Suppress execution of synthetic monitors during the maintenance
     * 
     */
    public Optional<Output<Boolean>> suppressSynthMonExec() {
        return Optional.ofNullable(this.suppressSynthMonExec);
    }

    /**
     * The type of suppression of alerting and problem detection during the maintenance
     * 
     */
    @Import(name="suppression")
    private @Nullable Output<String> suppression;

    /**
     * @return The type of suppression of alerting and problem detection during the maintenance
     * 
     */
    public Optional<Output<String>> suppression() {
        return Optional.ofNullable(this.suppression);
    }

    /**
     * The type of the maintenance: planned or unplanned
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the maintenance: planned or unplanned
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private MaintenanceWindowState() {}

    private MaintenanceWindowState(MaintenanceWindowState $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.name = $.name;
        this.schedule = $.schedule;
        this.scope = $.scope;
        this.suppressSynthMonExec = $.suppressSynthMonExec;
        this.suppression = $.suppression;
        this.type = $.type;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowState $;

        public Builder() {
            $ = new MaintenanceWindowState();
        }

        public Builder(MaintenanceWindowState defaults) {
            $ = new MaintenanceWindowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A short description of the maintenance purpose
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the maintenance purpose
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled The Maintenance Window is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The Maintenance Window is enabled or disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name of the maintenance window, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the maintenance window, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule The schedule of the maintenance window
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<MaintenanceWindowScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The schedule of the maintenance window
         * 
         * @return builder
         * 
         */
        public Builder schedule(MaintenanceWindowScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param scope the tiles this Dashboard consist of
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<MaintenanceWindowScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope the tiles this Dashboard consist of
         * 
         * @return builder
         * 
         */
        public Builder scope(MaintenanceWindowScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param suppressSynthMonExec Suppress execution of synthetic monitors during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppressSynthMonExec(@Nullable Output<Boolean> suppressSynthMonExec) {
            $.suppressSynthMonExec = suppressSynthMonExec;
            return this;
        }

        /**
         * @param suppressSynthMonExec Suppress execution of synthetic monitors during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppressSynthMonExec(Boolean suppressSynthMonExec) {
            return suppressSynthMonExec(Output.of(suppressSynthMonExec));
        }

        /**
         * @param suppression The type of suppression of alerting and problem detection during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppression(@Nullable Output<String> suppression) {
            $.suppression = suppression;
            return this;
        }

        /**
         * @param suppression The type of suppression of alerting and problem detection during the maintenance
         * 
         * @return builder
         * 
         */
        public Builder suppression(String suppression) {
            return suppression(Output.of(suppression));
        }

        /**
         * @param type The type of the maintenance: planned or unplanned
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the maintenance: planned or unplanned
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public MaintenanceWindowState build() {
            return $;
        }
    }

}
