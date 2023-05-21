// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.UpdateWindowsWeeklyRecurrenceRecurrenceRange;
import com.pulumi.dynatrace.outputs.UpdateWindowsWeeklyRecurrenceSelectedWeekDays;
import com.pulumi.dynatrace.outputs.UpdateWindowsWeeklyRecurrenceUpdateTime;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class UpdateWindowsWeeklyRecurrence {
    private Integer every;
    private UpdateWindowsWeeklyRecurrenceRecurrenceRange recurrenceRange;
    private UpdateWindowsWeeklyRecurrenceSelectedWeekDays selectedWeekDays;
    private UpdateWindowsWeeklyRecurrenceUpdateTime updateTime;

    private UpdateWindowsWeeklyRecurrence() {}
    public Integer every() {
        return this.every;
    }
    public UpdateWindowsWeeklyRecurrenceRecurrenceRange recurrenceRange() {
        return this.recurrenceRange;
    }
    public UpdateWindowsWeeklyRecurrenceSelectedWeekDays selectedWeekDays() {
        return this.selectedWeekDays;
    }
    public UpdateWindowsWeeklyRecurrenceUpdateTime updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateWindowsWeeklyRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer every;
        private UpdateWindowsWeeklyRecurrenceRecurrenceRange recurrenceRange;
        private UpdateWindowsWeeklyRecurrenceSelectedWeekDays selectedWeekDays;
        private UpdateWindowsWeeklyRecurrenceUpdateTime updateTime;
        public Builder() {}
        public Builder(UpdateWindowsWeeklyRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.every = defaults.every;
    	      this.recurrenceRange = defaults.recurrenceRange;
    	      this.selectedWeekDays = defaults.selectedWeekDays;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder every(Integer every) {
            this.every = Objects.requireNonNull(every);
            return this;
        }
        @CustomType.Setter
        public Builder recurrenceRange(UpdateWindowsWeeklyRecurrenceRecurrenceRange recurrenceRange) {
            this.recurrenceRange = Objects.requireNonNull(recurrenceRange);
            return this;
        }
        @CustomType.Setter
        public Builder selectedWeekDays(UpdateWindowsWeeklyRecurrenceSelectedWeekDays selectedWeekDays) {
            this.selectedWeekDays = Objects.requireNonNull(selectedWeekDays);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(UpdateWindowsWeeklyRecurrenceUpdateTime updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public UpdateWindowsWeeklyRecurrence build() {
            final var o = new UpdateWindowsWeeklyRecurrence();
            o.every = every;
            o.recurrenceRange = recurrenceRange;
            o.selectedWeekDays = selectedWeekDays;
            o.updateTime = updateTime;
            return o;
        }
    }
}
