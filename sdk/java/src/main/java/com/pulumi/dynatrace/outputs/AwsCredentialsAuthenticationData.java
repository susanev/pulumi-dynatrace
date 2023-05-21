// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsCredentialsAuthenticationData {
    /**
     * @return the access key
     * 
     */
    private @Nullable String accessKey;
    /**
     * @return the ID of the Amazon account
     * 
     */
    private @Nullable String accountId;
    /**
     * @return (Read only) the external ID token for setting an IAM role. You can obtain it with the `GET /aws/iamExternalId` request
     * 
     */
    private @Nullable String externalId;
    /**
     * @return the IAM role to be used by Dynatrace to get monitoring data
     * 
     */
    private @Nullable String iamRole;
    /**
     * @return the secret access key
     * 
     */
    private @Nullable String secretKey;
    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    private @Nullable String unknowns;

    private AwsCredentialsAuthenticationData() {}
    /**
     * @return the access key
     * 
     */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * @return the ID of the Amazon account
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return (Read only) the external ID token for setting an IAM role. You can obtain it with the `GET /aws/iamExternalId` request
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return the IAM role to be used by Dynatrace to get monitoring data
     * 
     */
    public Optional<String> iamRole() {
        return Optional.ofNullable(this.iamRole);
    }
    /**
     * @return the secret access key
     * 
     */
    public Optional<String> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }
    /**
     * @return Any attributes that aren&#39;t yet supported by this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCredentialsAuthenticationData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String accountId;
        private @Nullable String externalId;
        private @Nullable String iamRole;
        private @Nullable String secretKey;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(AwsCredentialsAuthenticationData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountId = defaults.accountId;
    	      this.externalId = defaults.externalId;
    	      this.iamRole = defaults.iamRole;
    	      this.secretKey = defaults.secretKey;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder iamRole(@Nullable String iamRole) {
            this.iamRole = iamRole;
            return this;
        }
        @CustomType.Setter
        public Builder secretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public AwsCredentialsAuthenticationData build() {
            final var o = new AwsCredentialsAuthenticationData();
            o.accessKey = accessKey;
            o.accountId = accountId;
            o.externalId = externalId;
            o.iamRole = iamRole;
            o.secretKey = secretKey;
            o.unknowns = unknowns;
            return o;
        }
    }
}
