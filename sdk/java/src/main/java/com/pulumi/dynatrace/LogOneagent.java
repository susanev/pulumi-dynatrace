// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.LogOneagentArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.LogOneagentState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/logOneagent:LogOneagent")
public class LogOneagent extends com.pulumi.resources.CustomResource {
    /**
     * Detect container time zones
     * 
     */
    @Export(name="containerTimezoneHeuristicEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> containerTimezoneHeuristicEnabled;

    /**
     * @return Detect container time zones
     * 
     */
    public Output<Boolean> containerTimezoneHeuristicEnabled() {
        return this.containerTimezoneHeuristicEnabled;
    }
    /**
     * Detect logs inside containers
     * 
     */
    @Export(name="containersLogsDetectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> containersLogsDetectionEnabled;

    /**
     * @return Detect logs inside containers
     * 
     */
    public Output<Boolean> containersLogsDetectionEnabled() {
        return this.containersLogsDetectionEnabled;
    }
    /**
     * Defines the number of characters in every log line (starting from the first character in the line) where the timestamp is searched.
     * 
     */
    @Export(name="dateSearchLimitBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> dateSearchLimitBytes;

    /**
     * @return Defines the number of characters in every log line (starting from the first character in the line) where the timestamp is searched.
     * 
     */
    public Output<Integer> dateSearchLimitBytes() {
        return this.dateSearchLimitBytes;
    }
    /**
     * Default timezone for agent if more specific configurations is not defined.
     * 
     */
    @Export(name="defaultTimezone", refs={String.class}, tree="[0]")
    private Output<String> defaultTimezone;

    /**
     * @return Default timezone for agent if more specific configurations is not defined.
     * 
     */
    public Output<String> defaultTimezone() {
        return this.defaultTimezone;
    }
    /**
     * Defines the maximum timeout value, in seconds, for the query extracting Windows Event Logs
     * 
     */
    @Export(name="eventLogQueryTimeoutSec", refs={Integer.class}, tree="[0]")
    private Output<Integer> eventLogQueryTimeoutSec;

    /**
     * @return Defines the maximum timeout value, in seconds, for the query extracting Windows Event Logs
     * 
     */
    public Output<Integer> eventLogQueryTimeoutSec() {
        return this.eventLogQueryTimeoutSec;
    }
    /**
     * Detect IIS logs
     * 
     */
    @Export(name="iisdetectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> iisdetectionEnabled;

    /**
     * @return Detect IIS logs
     * 
     */
    public Output<Boolean> iisdetectionEnabled() {
        return this.iisdetectionEnabled;
    }
    /**
     * Detect logs on Network File Systems (NFS)
     * 
     */
    @Export(name="logScannerLinuxNfsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> logScannerLinuxNfsEnabled;

    /**
     * @return Detect logs on Network File Systems (NFS)
     * 
     */
    public Output<Boolean> logScannerLinuxNfsEnabled() {
        return this.logScannerLinuxNfsEnabled;
    }
    /**
     * Defines the maximum number of log group instances per entity after which, the new automatic ones wouldn&#39;t be added.
     * 
     */
    @Export(name="maxLgisPerEntityCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxLgisPerEntityCount;

    /**
     * @return Defines the maximum number of log group instances per entity after which, the new automatic ones wouldn&#39;t be added.
     * 
     */
    public Output<Integer> maxLgisPerEntityCount() {
        return this.maxLgisPerEntityCount;
    }
    /**
     * Defines the minimum number of bytes in log file required for binary detection.
     * 
     */
    @Export(name="minBinaryDetectionLimitBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> minBinaryDetectionLimitBytes;

    /**
     * @return Defines the minimum number of bytes in log file required for binary detection.
     * 
     */
    public Output<Integer> minBinaryDetectionLimitBytes() {
        return this.minBinaryDetectionLimitBytes;
    }
    /**
     * Enabling this option may affect your DDU consumption. For more details, see [documentation](https://dt-url.net/hp43ef8).
     * 
     */
    @Export(name="monitorOwnLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> monitorOwnLogsEnabled;

    /**
     * @return Enabling this option may affect your DDU consumption. For more details, see [documentation](https://dt-url.net/hp43ef8).
     * 
     */
    public Output<Boolean> monitorOwnLogsEnabled() {
        return this.monitorOwnLogsEnabled;
    }
    /**
     * Detect open log files
     * 
     */
    @Export(name="openLogFilesDetectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> openLogFilesDetectionEnabled;

    /**
     * @return Detect open log files
     * 
     */
    public Output<Boolean> openLogFilesDetectionEnabled() {
        return this.openLogFilesDetectionEnabled;
    }
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Defines the number of characters in every log line (starting from the first character in the line) where severity is searched.
     * 
     */
    @Export(name="severityDetectionLimitBytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> severityDetectionLimitBytes;

    /**
     * @return Defines the number of characters in every log line (starting from the first character in the line) where severity is searched.
     * 
     */
    public Output<Integer> severityDetectionLimitBytes() {
        return this.severityDetectionLimitBytes;
    }
    /**
     * Defines the number of the first lines of every log entry where severity is searched.
     * 
     */
    @Export(name="severityDetectionLinesLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> severityDetectionLinesLimit;

    /**
     * @return Defines the number of the first lines of every log entry where severity is searched.
     * 
     */
    public Output<Integer> severityDetectionLinesLimit() {
        return this.severityDetectionLinesLimit;
    }
    /**
     * (Linux: syslog, message log) (Windows: system, application, security event logs)
     * 
     */
    @Export(name="systemLogsDetectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> systemLogsDetectionEnabled;

    /**
     * @return (Linux: syslog, message log) (Windows: system, application, security event logs)
     * 
     */
    public Output<Boolean> systemLogsDetectionEnabled() {
        return this.systemLogsDetectionEnabled;
    }
    /**
     * Deprecated for OneAgent 1.247+
     * 
     */
    @Export(name="utcasDefaultContainerTimezone", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> utcasDefaultContainerTimezone;

    /**
     * @return Deprecated for OneAgent 1.247+
     * 
     */
    public Output<Boolean> utcasDefaultContainerTimezone() {
        return this.utcasDefaultContainerTimezone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogOneagent(String name) {
        this(name, LogOneagentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogOneagent(String name, LogOneagentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogOneagent(String name, LogOneagentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logOneagent:LogOneagent", name, args == null ? LogOneagentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogOneagent(String name, Output<String> id, @Nullable LogOneagentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logOneagent:LogOneagent", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogOneagent get(String name, Output<String> id, @Nullable LogOneagentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogOneagent(name, id, state, options);
    }
}
