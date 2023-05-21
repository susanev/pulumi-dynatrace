// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.NetworkTrafficExcludeIpIpAddressFormArgs;
import java.util.List;
import java.util.Objects;


public final class NetworkTrafficExcludeIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkTrafficExcludeIpArgs Empty = new NetworkTrafficExcludeIpArgs();

    @Import(name="ipAddressForms", required=true)
    private Output<List<NetworkTrafficExcludeIpIpAddressFormArgs>> ipAddressForms;

    public Output<List<NetworkTrafficExcludeIpIpAddressFormArgs>> ipAddressForms() {
        return this.ipAddressForms;
    }

    private NetworkTrafficExcludeIpArgs() {}

    private NetworkTrafficExcludeIpArgs(NetworkTrafficExcludeIpArgs $) {
        this.ipAddressForms = $.ipAddressForms;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkTrafficExcludeIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkTrafficExcludeIpArgs $;

        public Builder() {
            $ = new NetworkTrafficExcludeIpArgs();
        }

        public Builder(NetworkTrafficExcludeIpArgs defaults) {
            $ = new NetworkTrafficExcludeIpArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddressForms(Output<List<NetworkTrafficExcludeIpIpAddressFormArgs>> ipAddressForms) {
            $.ipAddressForms = ipAddressForms;
            return this;
        }

        public Builder ipAddressForms(List<NetworkTrafficExcludeIpIpAddressFormArgs> ipAddressForms) {
            return ipAddressForms(Output.of(ipAddressForms));
        }

        public Builder ipAddressForms(NetworkTrafficExcludeIpIpAddressFormArgs... ipAddressForms) {
            return ipAddressForms(List.of(ipAddressForms));
        }

        public NetworkTrafficExcludeIpArgs build() {
            $.ipAddressForms = Objects.requireNonNull($.ipAddressForms, "expected parameter 'ipAddressForms' to be non-null");
            return $;
        }
    }

}
