// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.LogStorageMatchersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogStorageState extends com.pulumi.resources.ResourceArgs {

    public static final LogStorageState Empty = new LogStorageState();

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
     * no documentation available
     * 
     */
    @Import(name="matchers")
    private @Nullable Output<LogStorageMatchersArgs> matchers;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<LogStorageMatchersArgs>> matchers() {
        return Optional.ofNullable(this.matchers);
    }

    /**
     * Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
     * 
     */
    @Import(name="sendToStorage")
    private @Nullable Output<Boolean> sendToStorage;

    /**
     * @return If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
     * 
     */
    public Optional<Output<Boolean>> sendToStorage() {
        return Optional.ofNullable(this.sendToStorage);
    }

    private LogStorageState() {}

    private LogStorageState(LogStorageState $) {
        this.enabled = $.enabled;
        this.matchers = $.matchers;
        this.name = $.name;
        this.scope = $.scope;
        this.sendToStorage = $.sendToStorage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStorageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStorageState $;

        public Builder() {
            $ = new LogStorageState();
        }

        public Builder(LogStorageState defaults) {
            $ = new LogStorageState(Objects.requireNonNull(defaults));
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
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(@Nullable Output<LogStorageMatchersArgs> matchers) {
            $.matchers = matchers;
            return this;
        }

        /**
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(LogStorageMatchersArgs matchers) {
            return matchers(Output.of(matchers));
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param sendToStorage If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
         * 
         * @return builder
         * 
         */
        public Builder sendToStorage(@Nullable Output<Boolean> sendToStorage) {
            $.sendToStorage = sendToStorage;
            return this;
        }

        /**
         * @param sendToStorage If `true` matching logs will be included in storage. If `false` matching logs will be excluded from storage.
         * 
         * @return builder
         * 
         */
        public Builder sendToStorage(Boolean sendToStorage) {
            return sendToStorage(Output.of(sendToStorage));
        }

        public LogStorageState build() {
            return $;
        }
    }

}
