// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MetricEventsEventTemplateMetadataArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricEventsEventTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricEventsEventTemplateArgs Empty = new MetricEventsEventTemplateArgs();

    /**
     * Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
     * 
     */
    @Import(name="davisMerge")
    private @Nullable Output<Boolean> davisMerge;

    /**
     * @return Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
     * 
     */
    public Optional<Output<Boolean>> davisMerge() {
        return Optional.ofNullable(this.davisMerge);
    }

    /**
     * The description of the event to trigger.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the event to trigger.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The event type to trigger.
     * 
     */
    @Import(name="eventType", required=true)
    private Output<String> eventType;

    /**
     * @return The event type to trigger.
     * 
     */
    public Output<String> eventType() {
        return this.eventType;
    }

    /**
     * Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    @Import(name="metadatas")
    private @Nullable Output<List<MetricEventsEventTemplateMetadataArgs>> metadatas;

    /**
     * @return Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    public Optional<Output<List<MetricEventsEventTemplateMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * The title of the event to trigger.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The title of the event to trigger.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private MetricEventsEventTemplateArgs() {}

    private MetricEventsEventTemplateArgs(MetricEventsEventTemplateArgs $) {
        this.davisMerge = $.davisMerge;
        this.description = $.description;
        this.eventType = $.eventType;
        this.metadatas = $.metadatas;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricEventsEventTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricEventsEventTemplateArgs $;

        public Builder() {
            $ = new MetricEventsEventTemplateArgs();
        }

        public Builder(MetricEventsEventTemplateArgs defaults) {
            $ = new MetricEventsEventTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param davisMerge Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
         * 
         * @return builder
         * 
         */
        public Builder davisMerge(@Nullable Output<Boolean> davisMerge) {
            $.davisMerge = davisMerge;
            return this;
        }

        /**
         * @param davisMerge Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
         * 
         * @return builder
         * 
         */
        public Builder davisMerge(Boolean davisMerge) {
            return davisMerge(Output.of(davisMerge));
        }

        /**
         * @param description The description of the event to trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the event to trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventType The event type to trigger.
         * 
         * @return builder
         * 
         */
        public Builder eventType(Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType The event type to trigger.
         * 
         * @return builder
         * 
         */
        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param metadatas Set of additional key-value properties to be attached to the triggered event.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(@Nullable Output<List<MetricEventsEventTemplateMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Set of additional key-value properties to be attached to the triggered event.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<MetricEventsEventTemplateMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Set of additional key-value properties to be attached to the triggered event.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(MetricEventsEventTemplateMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param title The title of the event to trigger.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the event to trigger.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public MetricEventsEventTemplateArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.eventType = Objects.requireNonNull($.eventType, "expected parameter 'eventType' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
