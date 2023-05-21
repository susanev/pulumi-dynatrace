// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class K8sCredentials extends pulumi.CustomResource {
    /**
     * Get an existing K8sCredentials resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: K8sCredentialsState, opts?: pulumi.CustomResourceOptions): K8sCredentials {
        return new K8sCredentials(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/k8sCredentials:K8sCredentials';

    /**
     * Returns true if the given object is an instance of K8sCredentials.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is K8sCredentials {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === K8sCredentials.__pulumiType;
    }

    /**
     * Monitoring is enabled (`true`) or disabled (`false`) for given credentials configuration.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly active!: pulumi.Output<boolean | undefined>;
    /**
     * Active Gate group to filter active gates for this credentials.
     */
    public readonly activeGateGroup!: pulumi.Output<string | undefined>;
    /**
     * The service account bearer token for the Kubernetes API server.  Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as `null`.  If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly authToken!: pulumi.Output<string | undefined>;
    /**
     * The check of SSL certificates is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly certificateCheckEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Inclusion of all Davis relevant events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected
     */
    public readonly davisEventsIntegrationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The URL of the Kubernetes API server.  It must be unique within a Dynatrace environment.  The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed.
     */
    public readonly endpointUrl!: pulumi.Output<string | undefined>;
    /**
     * Event analysis and alerting is (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly eventAnalysisAndAlertingEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Kubernetes event filters based on field-selectors. If set to `null` on creation, no events field selectors are subscribed. If set to `null` on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors.
     */
    public readonly eventsFieldSelectors!: pulumi.Output<outputs.K8sCredentialsEventsFieldSelector[] | undefined>;
    /**
     * Monitoring of events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.  If not set on creation, the `false` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly eventsIntegrationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Verify hostname in certificate against Kubernetes API URL
     */
    public readonly hostnameVerification!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the Kubernetes credentials configuration.  Allowed characters are letters, numbers, whitespaces, and the following characters: `.+-_`. Leading or trailing whitespace is not allowed.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Prometheus exporters integration is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.If the field is omitted during an update, the old value remains unaffected
     */
    public readonly prometheusExporters!: pulumi.Output<boolean | undefined>;
    /**
     * Any attributes that aren't yet supported by this provider
     */
    public readonly unknowns!: pulumi.Output<string | undefined>;
    /**
     * Workload and cloud application processing is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    public readonly workloadIntegrationEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a K8sCredentials resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: K8sCredentialsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: K8sCredentialsArgs | K8sCredentialsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as K8sCredentialsState | undefined;
            resourceInputs["active"] = state ? state.active : undefined;
            resourceInputs["activeGateGroup"] = state ? state.activeGateGroup : undefined;
            resourceInputs["authToken"] = state ? state.authToken : undefined;
            resourceInputs["certificateCheckEnabled"] = state ? state.certificateCheckEnabled : undefined;
            resourceInputs["davisEventsIntegrationEnabled"] = state ? state.davisEventsIntegrationEnabled : undefined;
            resourceInputs["endpointUrl"] = state ? state.endpointUrl : undefined;
            resourceInputs["eventAnalysisAndAlertingEnabled"] = state ? state.eventAnalysisAndAlertingEnabled : undefined;
            resourceInputs["eventsFieldSelectors"] = state ? state.eventsFieldSelectors : undefined;
            resourceInputs["eventsIntegrationEnabled"] = state ? state.eventsIntegrationEnabled : undefined;
            resourceInputs["hostnameVerification"] = state ? state.hostnameVerification : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["prometheusExporters"] = state ? state.prometheusExporters : undefined;
            resourceInputs["unknowns"] = state ? state.unknowns : undefined;
            resourceInputs["workloadIntegrationEnabled"] = state ? state.workloadIntegrationEnabled : undefined;
        } else {
            const args = argsOrState as K8sCredentialsArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            resourceInputs["active"] = args ? args.active : undefined;
            resourceInputs["activeGateGroup"] = args ? args.activeGateGroup : undefined;
            resourceInputs["authToken"] = args?.authToken ? pulumi.secret(args.authToken) : undefined;
            resourceInputs["certificateCheckEnabled"] = args ? args.certificateCheckEnabled : undefined;
            resourceInputs["davisEventsIntegrationEnabled"] = args ? args.davisEventsIntegrationEnabled : undefined;
            resourceInputs["endpointUrl"] = args ? args.endpointUrl : undefined;
            resourceInputs["eventAnalysisAndAlertingEnabled"] = args ? args.eventAnalysisAndAlertingEnabled : undefined;
            resourceInputs["eventsFieldSelectors"] = args ? args.eventsFieldSelectors : undefined;
            resourceInputs["eventsIntegrationEnabled"] = args ? args.eventsIntegrationEnabled : undefined;
            resourceInputs["hostnameVerification"] = args ? args.hostnameVerification : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["prometheusExporters"] = args ? args.prometheusExporters : undefined;
            resourceInputs["unknowns"] = args ? args.unknowns : undefined;
            resourceInputs["workloadIntegrationEnabled"] = args ? args.workloadIntegrationEnabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["authToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(K8sCredentials.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering K8sCredentials resources.
 */
export interface K8sCredentialsState {
    /**
     * Monitoring is enabled (`true`) or disabled (`false`) for given credentials configuration.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Active Gate group to filter active gates for this credentials.
     */
    activeGateGroup?: pulumi.Input<string>;
    /**
     * The service account bearer token for the Kubernetes API server.  Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as `null`.  If the field is omitted during an update, the old value remains unaffected.
     */
    authToken?: pulumi.Input<string>;
    /**
     * The check of SSL certificates is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    certificateCheckEnabled?: pulumi.Input<boolean>;
    /**
     * Inclusion of all Davis relevant events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected
     */
    davisEventsIntegrationEnabled?: pulumi.Input<boolean>;
    /**
     * The URL of the Kubernetes API server.  It must be unique within a Dynatrace environment.  The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed.
     */
    endpointUrl?: pulumi.Input<string>;
    /**
     * Event analysis and alerting is (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    eventAnalysisAndAlertingEnabled?: pulumi.Input<boolean>;
    /**
     * Kubernetes event filters based on field-selectors. If set to `null` on creation, no events field selectors are subscribed. If set to `null` on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors.
     */
    eventsFieldSelectors?: pulumi.Input<pulumi.Input<inputs.K8sCredentialsEventsFieldSelector>[]>;
    /**
     * Monitoring of events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.  If not set on creation, the `false` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    eventsIntegrationEnabled?: pulumi.Input<boolean>;
    /**
     * Verify hostname in certificate against Kubernetes API URL
     */
    hostnameVerification?: pulumi.Input<boolean>;
    /**
     * The name of the Kubernetes credentials configuration.  Allowed characters are letters, numbers, whitespaces, and the following characters: `.+-_`. Leading or trailing whitespace is not allowed.
     */
    label?: pulumi.Input<string>;
    /**
     * Prometheus exporters integration is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.If the field is omitted during an update, the old value remains unaffected
     */
    prometheusExporters?: pulumi.Input<boolean>;
    /**
     * Any attributes that aren't yet supported by this provider
     */
    unknowns?: pulumi.Input<string>;
    /**
     * Workload and cloud application processing is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    workloadIntegrationEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a K8sCredentials resource.
 */
export interface K8sCredentialsArgs {
    /**
     * Monitoring is enabled (`true`) or disabled (`false`) for given credentials configuration.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    active?: pulumi.Input<boolean>;
    /**
     * Active Gate group to filter active gates for this credentials.
     */
    activeGateGroup?: pulumi.Input<string>;
    /**
     * The service account bearer token for the Kubernetes API server.  Submit your token on creation or update of the configuration. For security reasons, GET requests return this field as `null`.  If the field is omitted during an update, the old value remains unaffected.
     */
    authToken?: pulumi.Input<string>;
    /**
     * The check of SSL certificates is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.  If not set on creation, the `true` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    certificateCheckEnabled?: pulumi.Input<boolean>;
    /**
     * Inclusion of all Davis relevant events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected
     */
    davisEventsIntegrationEnabled?: pulumi.Input<boolean>;
    /**
     * The URL of the Kubernetes API server.  It must be unique within a Dynatrace environment.  The URL must valid according to RFC 2396. Leading or trailing whitespaces are not allowed.
     */
    endpointUrl?: pulumi.Input<string>;
    /**
     * Event analysis and alerting is (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    eventAnalysisAndAlertingEnabled?: pulumi.Input<boolean>;
    /**
     * Kubernetes event filters based on field-selectors. If set to `null` on creation, no events field selectors are subscribed. If set to `null` on update, no change of stored events field selectors is applied. Set an empty list to clear all events field selectors.
     */
    eventsFieldSelectors?: pulumi.Input<pulumi.Input<inputs.K8sCredentialsEventsFieldSelector>[]>;
    /**
     * Monitoring of events is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. Event monitoring depends on the active state of this configuration to be true.  If not set on creation, the `false` value is used.  If the field is omitted during an update, the old value remains unaffected.
     */
    eventsIntegrationEnabled?: pulumi.Input<boolean>;
    /**
     * Verify hostname in certificate against Kubernetes API URL
     */
    hostnameVerification?: pulumi.Input<boolean>;
    /**
     * The name of the Kubernetes credentials configuration.  Allowed characters are letters, numbers, whitespaces, and the following characters: `.+-_`. Leading or trailing whitespace is not allowed.
     */
    label: pulumi.Input<string>;
    /**
     * Prometheus exporters integration is enabled (`true`) or disabled (`false`) for the Kubernetes cluster.If the field is omitted during an update, the old value remains unaffected
     */
    prometheusExporters?: pulumi.Input<boolean>;
    /**
     * Any attributes that aren't yet supported by this provider
     */
    unknowns?: pulumi.Input<string>;
    /**
     * Workload and cloud application processing is enabled (`true`) or disabled (`false`) for the Kubernetes cluster. If the field is omitted during an update, the old value remains unaffected.
     */
    workloadIntegrationEnabled?: pulumi.Input<boolean>;
}
