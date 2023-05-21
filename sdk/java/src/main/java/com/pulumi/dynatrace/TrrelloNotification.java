// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.TrrelloNotificationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.TrrelloNotificationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/trrelloNotification:TrrelloNotification")
public class TrrelloNotification extends com.pulumi.resources.CustomResource {
    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * The application key for the Trello account
     * 
     */
    @Export(name="applicationKey", refs={String.class}, tree="[0]")
    private Output<String> applicationKey;

    /**
     * @return The application key for the Trello account
     * 
     */
    public Output<String> applicationKey() {
        return this.applicationKey;
    }
    /**
     * The application token for the Trello account
     * 
     */
    @Export(name="authorizationToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationToken;

    /**
     * @return The application token for the Trello account
     * 
     */
    public Output<Optional<String>> authorizationToken() {
        return Codegen.optional(this.authorizationToken);
    }
    /**
     * The Trello board to which the card should be assigned
     * 
     */
    @Export(name="boardId", refs={String.class}, tree="[0]")
    private Output<String> boardId;

    /**
     * @return The Trello board to which the card should be assigned
     * 
     */
    public Output<String> boardId() {
        return this.boardId;
    }
    /**
     * The description of the Trello card.   You can use same placeholders as in card text
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the Trello card.   You can use same placeholders as in card text
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    @Export(name="legacyId", refs={String.class}, tree="[0]")
    private Output<String> legacyId;

    /**
     * @return The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    public Output<String> legacyId() {
        return this.legacyId;
    }
    /**
     * The Trello list to which the card should be assigned
     * 
     */
    @Export(name="listId", refs={String.class}, tree="[0]")
    private Output<String> listId;

    /**
     * @return The Trello list to which the card should be assigned
     * 
     */
    public Output<String> listId() {
        return this.listId;
    }
    /**
     * The name of the notification configuration
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the associated alerting profile
     * 
     */
    @Export(name="profile", refs={String.class}, tree="[0]")
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }
    /**
     * The Trello list to which the card of the resolved problem should be assigned
     * 
     */
    @Export(name="resolvedListId", refs={String.class}, tree="[0]")
    private Output<String> resolvedListId;

    /**
     * @return The Trello list to which the card of the resolved problem should be assigned
     * 
     */
    public Output<String> resolvedListId() {
        return this.resolvedListId;
    }
    /**
     * The text of the generated Trello card.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    @Export(name="text", refs={String.class}, tree="[0]")
    private Output<String> text;

    /**
     * @return The text of the generated Trello card.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrrelloNotification(String name) {
        this(name, TrrelloNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrrelloNotification(String name, TrrelloNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrrelloNotification(String name, TrrelloNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/trrelloNotification:TrrelloNotification", name, args == null ? TrrelloNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrrelloNotification(String name, Output<String> id, @Nullable TrrelloNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/trrelloNotification:TrrelloNotification", name, state, makeResourceOptions(options, id));
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
    public static TrrelloNotification get(String name, Output<String> id, @Nullable TrrelloNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrrelloNotification(name, id, state, options);
    }
}
