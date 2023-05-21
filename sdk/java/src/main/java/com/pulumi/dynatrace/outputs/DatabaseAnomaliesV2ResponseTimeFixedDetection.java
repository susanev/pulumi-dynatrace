// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection;
import com.pulumi.dynatrace.outputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll;
import com.pulumi.dynatrace.outputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseAnomaliesV2ResponseTimeFixedDetection {
    private DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection overAlertingProtection;
    private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll responseTimeAll;
    private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest responseTimeSlowest;
    private String sensitivity;

    private DatabaseAnomaliesV2ResponseTimeFixedDetection() {}
    public DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection overAlertingProtection() {
        return this.overAlertingProtection;
    }
    public DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll responseTimeAll() {
        return this.responseTimeAll;
    }
    public DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest responseTimeSlowest() {
        return this.responseTimeSlowest;
    }
    public String sensitivity() {
        return this.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAnomaliesV2ResponseTimeFixedDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection overAlertingProtection;
        private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll responseTimeAll;
        private DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest responseTimeSlowest;
        private String sensitivity;
        public Builder() {}
        public Builder(DatabaseAnomaliesV2ResponseTimeFixedDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overAlertingProtection = defaults.overAlertingProtection;
    	      this.responseTimeAll = defaults.responseTimeAll;
    	      this.responseTimeSlowest = defaults.responseTimeSlowest;
    	      this.sensitivity = defaults.sensitivity;
        }

        @CustomType.Setter
        public Builder overAlertingProtection(DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection overAlertingProtection) {
            this.overAlertingProtection = Objects.requireNonNull(overAlertingProtection);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeAll(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAll responseTimeAll) {
            this.responseTimeAll = Objects.requireNonNull(responseTimeAll);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeSlowest(DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowest responseTimeSlowest) {
            this.responseTimeSlowest = Objects.requireNonNull(responseTimeSlowest);
            return this;
        }
        @CustomType.Setter
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = Objects.requireNonNull(sensitivity);
            return this;
        }
        public DatabaseAnomaliesV2ResponseTimeFixedDetection build() {
            final var o = new DatabaseAnomaliesV2ResponseTimeFixedDetection();
            o.overAlertingProtection = overAlertingProtection;
            o.responseTimeAll = responseTimeAll;
            o.responseTimeSlowest = responseTimeSlowest;
            o.sensitivity = sensitivity;
            return o;
        }
    }
}
