// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BusinessEventsOneagentEventCategory;
import com.pulumi.dynatrace.outputs.BusinessEventsOneagentEventData;
import com.pulumi.dynatrace.outputs.BusinessEventsOneagentEventProvider;
import com.pulumi.dynatrace.outputs.BusinessEventsOneagentEventType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BusinessEventsOneagentEvent {
    /**
     * @return Event category
     * 
     */
    private BusinessEventsOneagentEventCategory category;
    /**
     * @return Additional attributes for the business event.
     * 
     */
    private @Nullable BusinessEventsOneagentEventData data;
    /**
     * @return Event provider
     * 
     */
    private BusinessEventsOneagentEventProvider provider;
    /**
     * @return Event type
     * 
     */
    private BusinessEventsOneagentEventType type;

    private BusinessEventsOneagentEvent() {}
    /**
     * @return Event category
     * 
     */
    public BusinessEventsOneagentEventCategory category() {
        return this.category;
    }
    /**
     * @return Additional attributes for the business event.
     * 
     */
    public Optional<BusinessEventsOneagentEventData> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return Event provider
     * 
     */
    public BusinessEventsOneagentEventProvider provider() {
        return this.provider;
    }
    /**
     * @return Event type
     * 
     */
    public BusinessEventsOneagentEventType type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessEventsOneagentEvent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BusinessEventsOneagentEventCategory category;
        private @Nullable BusinessEventsOneagentEventData data;
        private BusinessEventsOneagentEventProvider provider;
        private BusinessEventsOneagentEventType type;
        public Builder() {}
        public Builder(BusinessEventsOneagentEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.data = defaults.data;
    	      this.provider = defaults.provider;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder category(BusinessEventsOneagentEventCategory category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder data(@Nullable BusinessEventsOneagentEventData data) {
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder provider(BusinessEventsOneagentEventProvider provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        @CustomType.Setter
        public Builder type(BusinessEventsOneagentEventType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BusinessEventsOneagentEvent build() {
            final var o = new BusinessEventsOneagentEvent();
            o.category = category;
            o.data = data;
            o.provider = provider;
            o.type = type;
            return o;
        }
    }
}
