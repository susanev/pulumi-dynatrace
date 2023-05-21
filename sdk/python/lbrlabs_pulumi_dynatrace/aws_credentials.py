# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AwsCredentialsArgs', 'AwsCredentials']

@pulumi.input_type
class AwsCredentialsArgs:
    def __init__(__self__, *,
                 authentication_data: pulumi.Input['AwsCredentialsAuthenticationDataArgs'],
                 partition_type: pulumi.Input[str],
                 tagged_only: pulumi.Input[bool],
                 label: Optional[pulumi.Input[str]] = None,
                 supporting_services_managed_in_dynatrace: Optional[pulumi.Input[bool]] = None,
                 supporting_services_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]] = None,
                 tags_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AwsCredentials resource.
        :param pulumi.Input['AwsCredentialsAuthenticationDataArgs'] authentication_data: credentials for the AWS authentication
        :param pulumi.Input[str] partition_type: The type of the AWS partition
        :param pulumi.Input[bool] tagged_only: Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        :param pulumi.Input[str] label: The name of the credentials
        :param pulumi.Input[bool] supporting_services_managed_in_dynatrace: If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
               manage them via WebUI without interference by Terraform.
        :param pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]] supporting_services_to_monitors: supporting services to be monitored
        :param pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]] tags_to_monitors: AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        :param pulumi.Input[str] unknowns: Any attributes that aren't yet supported by this provider
        """
        pulumi.set(__self__, "authentication_data", authentication_data)
        pulumi.set(__self__, "partition_type", partition_type)
        pulumi.set(__self__, "tagged_only", tagged_only)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if supporting_services_managed_in_dynatrace is not None:
            pulumi.set(__self__, "supporting_services_managed_in_dynatrace", supporting_services_managed_in_dynatrace)
        if supporting_services_to_monitors is not None:
            pulumi.set(__self__, "supporting_services_to_monitors", supporting_services_to_monitors)
        if tags_to_monitors is not None:
            pulumi.set(__self__, "tags_to_monitors", tags_to_monitors)
        if unknowns is not None:
            pulumi.set(__self__, "unknowns", unknowns)

    @property
    @pulumi.getter(name="authenticationData")
    def authentication_data(self) -> pulumi.Input['AwsCredentialsAuthenticationDataArgs']:
        """
        credentials for the AWS authentication
        """
        return pulumi.get(self, "authentication_data")

    @authentication_data.setter
    def authentication_data(self, value: pulumi.Input['AwsCredentialsAuthenticationDataArgs']):
        pulumi.set(self, "authentication_data", value)

    @property
    @pulumi.getter(name="partitionType")
    def partition_type(self) -> pulumi.Input[str]:
        """
        The type of the AWS partition
        """
        return pulumi.get(self, "partition_type")

    @partition_type.setter
    def partition_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "partition_type", value)

    @property
    @pulumi.getter(name="taggedOnly")
    def tagged_only(self) -> pulumi.Input[bool]:
        """
        Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        """
        return pulumi.get(self, "tagged_only")

    @tagged_only.setter
    def tagged_only(self, value: pulumi.Input[bool]):
        pulumi.set(self, "tagged_only", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the credentials
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="supportingServicesManagedInDynatrace")
    def supporting_services_managed_in_dynatrace(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
        manage them via WebUI without interference by Terraform.
        """
        return pulumi.get(self, "supporting_services_managed_in_dynatrace")

    @supporting_services_managed_in_dynatrace.setter
    def supporting_services_managed_in_dynatrace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "supporting_services_managed_in_dynatrace", value)

    @property
    @pulumi.getter(name="supportingServicesToMonitors")
    def supporting_services_to_monitors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]]:
        """
        supporting services to be monitored
        """
        return pulumi.get(self, "supporting_services_to_monitors")

    @supporting_services_to_monitors.setter
    def supporting_services_to_monitors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]]):
        pulumi.set(self, "supporting_services_to_monitors", value)

    @property
    @pulumi.getter(name="tagsToMonitors")
    def tags_to_monitors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]]:
        """
        AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        """
        return pulumi.get(self, "tags_to_monitors")

    @tags_to_monitors.setter
    def tags_to_monitors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]]):
        pulumi.set(self, "tags_to_monitors", value)

    @property
    @pulumi.getter
    def unknowns(self) -> Optional[pulumi.Input[str]]:
        """
        Any attributes that aren't yet supported by this provider
        """
        return pulumi.get(self, "unknowns")

    @unknowns.setter
    def unknowns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "unknowns", value)


@pulumi.input_type
class _AwsCredentialsState:
    def __init__(__self__, *,
                 authentication_data: Optional[pulumi.Input['AwsCredentialsAuthenticationDataArgs']] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 partition_type: Optional[pulumi.Input[str]] = None,
                 supporting_services_managed_in_dynatrace: Optional[pulumi.Input[bool]] = None,
                 supporting_services_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]] = None,
                 tagged_only: Optional[pulumi.Input[bool]] = None,
                 tags_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AwsCredentials resources.
        :param pulumi.Input['AwsCredentialsAuthenticationDataArgs'] authentication_data: credentials for the AWS authentication
        :param pulumi.Input[str] label: The name of the credentials
        :param pulumi.Input[str] partition_type: The type of the AWS partition
        :param pulumi.Input[bool] supporting_services_managed_in_dynatrace: If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
               manage them via WebUI without interference by Terraform.
        :param pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]] supporting_services_to_monitors: supporting services to be monitored
        :param pulumi.Input[bool] tagged_only: Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        :param pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]] tags_to_monitors: AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        :param pulumi.Input[str] unknowns: Any attributes that aren't yet supported by this provider
        """
        if authentication_data is not None:
            pulumi.set(__self__, "authentication_data", authentication_data)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if partition_type is not None:
            pulumi.set(__self__, "partition_type", partition_type)
        if supporting_services_managed_in_dynatrace is not None:
            pulumi.set(__self__, "supporting_services_managed_in_dynatrace", supporting_services_managed_in_dynatrace)
        if supporting_services_to_monitors is not None:
            pulumi.set(__self__, "supporting_services_to_monitors", supporting_services_to_monitors)
        if tagged_only is not None:
            pulumi.set(__self__, "tagged_only", tagged_only)
        if tags_to_monitors is not None:
            pulumi.set(__self__, "tags_to_monitors", tags_to_monitors)
        if unknowns is not None:
            pulumi.set(__self__, "unknowns", unknowns)

    @property
    @pulumi.getter(name="authenticationData")
    def authentication_data(self) -> Optional[pulumi.Input['AwsCredentialsAuthenticationDataArgs']]:
        """
        credentials for the AWS authentication
        """
        return pulumi.get(self, "authentication_data")

    @authentication_data.setter
    def authentication_data(self, value: Optional[pulumi.Input['AwsCredentialsAuthenticationDataArgs']]):
        pulumi.set(self, "authentication_data", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the credentials
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="partitionType")
    def partition_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the AWS partition
        """
        return pulumi.get(self, "partition_type")

    @partition_type.setter
    def partition_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "partition_type", value)

    @property
    @pulumi.getter(name="supportingServicesManagedInDynatrace")
    def supporting_services_managed_in_dynatrace(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
        manage them via WebUI without interference by Terraform.
        """
        return pulumi.get(self, "supporting_services_managed_in_dynatrace")

    @supporting_services_managed_in_dynatrace.setter
    def supporting_services_managed_in_dynatrace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "supporting_services_managed_in_dynatrace", value)

    @property
    @pulumi.getter(name="supportingServicesToMonitors")
    def supporting_services_to_monitors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]]:
        """
        supporting services to be monitored
        """
        return pulumi.get(self, "supporting_services_to_monitors")

    @supporting_services_to_monitors.setter
    def supporting_services_to_monitors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsSupportingServicesToMonitorArgs']]]]):
        pulumi.set(self, "supporting_services_to_monitors", value)

    @property
    @pulumi.getter(name="taggedOnly")
    def tagged_only(self) -> Optional[pulumi.Input[bool]]:
        """
        Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        """
        return pulumi.get(self, "tagged_only")

    @tagged_only.setter
    def tagged_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tagged_only", value)

    @property
    @pulumi.getter(name="tagsToMonitors")
    def tags_to_monitors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]]:
        """
        AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        """
        return pulumi.get(self, "tags_to_monitors")

    @tags_to_monitors.setter
    def tags_to_monitors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AwsCredentialsTagsToMonitorArgs']]]]):
        pulumi.set(self, "tags_to_monitors", value)

    @property
    @pulumi.getter
    def unknowns(self) -> Optional[pulumi.Input[str]]:
        """
        Any attributes that aren't yet supported by this provider
        """
        return pulumi.get(self, "unknowns")

    @unknowns.setter
    def unknowns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "unknowns", value)


class AwsCredentials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_data: Optional[pulumi.Input[pulumi.InputType['AwsCredentialsAuthenticationDataArgs']]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 partition_type: Optional[pulumi.Input[str]] = None,
                 supporting_services_managed_in_dynatrace: Optional[pulumi.Input[bool]] = None,
                 supporting_services_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsSupportingServicesToMonitorArgs']]]]] = None,
                 tagged_only: Optional[pulumi.Input[bool]] = None,
                 tags_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsTagsToMonitorArgs']]]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a AwsCredentials resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AwsCredentialsAuthenticationDataArgs']] authentication_data: credentials for the AWS authentication
        :param pulumi.Input[str] label: The name of the credentials
        :param pulumi.Input[str] partition_type: The type of the AWS partition
        :param pulumi.Input[bool] supporting_services_managed_in_dynatrace: If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
               manage them via WebUI without interference by Terraform.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsSupportingServicesToMonitorArgs']]]] supporting_services_to_monitors: supporting services to be monitored
        :param pulumi.Input[bool] tagged_only: Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsTagsToMonitorArgs']]]] tags_to_monitors: AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        :param pulumi.Input[str] unknowns: Any attributes that aren't yet supported by this provider
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AwsCredentialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AwsCredentials resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AwsCredentialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsCredentialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_data: Optional[pulumi.Input[pulumi.InputType['AwsCredentialsAuthenticationDataArgs']]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 partition_type: Optional[pulumi.Input[str]] = None,
                 supporting_services_managed_in_dynatrace: Optional[pulumi.Input[bool]] = None,
                 supporting_services_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsSupportingServicesToMonitorArgs']]]]] = None,
                 tagged_only: Optional[pulumi.Input[bool]] = None,
                 tags_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsTagsToMonitorArgs']]]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsCredentialsArgs.__new__(AwsCredentialsArgs)

            if authentication_data is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_data'")
            __props__.__dict__["authentication_data"] = authentication_data
            __props__.__dict__["label"] = label
            if partition_type is None and not opts.urn:
                raise TypeError("Missing required property 'partition_type'")
            __props__.__dict__["partition_type"] = partition_type
            __props__.__dict__["supporting_services_managed_in_dynatrace"] = supporting_services_managed_in_dynatrace
            __props__.__dict__["supporting_services_to_monitors"] = supporting_services_to_monitors
            if tagged_only is None and not opts.urn:
                raise TypeError("Missing required property 'tagged_only'")
            __props__.__dict__["tagged_only"] = tagged_only
            __props__.__dict__["tags_to_monitors"] = tags_to_monitors
            __props__.__dict__["unknowns"] = unknowns
        super(AwsCredentials, __self__).__init__(
            'dynatrace:index/awsCredentials:AwsCredentials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_data: Optional[pulumi.Input[pulumi.InputType['AwsCredentialsAuthenticationDataArgs']]] = None,
            label: Optional[pulumi.Input[str]] = None,
            partition_type: Optional[pulumi.Input[str]] = None,
            supporting_services_managed_in_dynatrace: Optional[pulumi.Input[bool]] = None,
            supporting_services_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsSupportingServicesToMonitorArgs']]]]] = None,
            tagged_only: Optional[pulumi.Input[bool]] = None,
            tags_to_monitors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsTagsToMonitorArgs']]]]] = None,
            unknowns: Optional[pulumi.Input[str]] = None) -> 'AwsCredentials':
        """
        Get an existing AwsCredentials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AwsCredentialsAuthenticationDataArgs']] authentication_data: credentials for the AWS authentication
        :param pulumi.Input[str] label: The name of the credentials
        :param pulumi.Input[str] partition_type: The type of the AWS partition
        :param pulumi.Input[bool] supporting_services_managed_in_dynatrace: If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
               manage them via WebUI without interference by Terraform.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsSupportingServicesToMonitorArgs']]]] supporting_services_to_monitors: supporting services to be monitored
        :param pulumi.Input[bool] tagged_only: Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AwsCredentialsTagsToMonitorArgs']]]] tags_to_monitors: AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        :param pulumi.Input[str] unknowns: Any attributes that aren't yet supported by this provider
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsCredentialsState.__new__(_AwsCredentialsState)

        __props__.__dict__["authentication_data"] = authentication_data
        __props__.__dict__["label"] = label
        __props__.__dict__["partition_type"] = partition_type
        __props__.__dict__["supporting_services_managed_in_dynatrace"] = supporting_services_managed_in_dynatrace
        __props__.__dict__["supporting_services_to_monitors"] = supporting_services_to_monitors
        __props__.__dict__["tagged_only"] = tagged_only
        __props__.__dict__["tags_to_monitors"] = tags_to_monitors
        __props__.__dict__["unknowns"] = unknowns
        return AwsCredentials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticationData")
    def authentication_data(self) -> pulumi.Output['outputs.AwsCredentialsAuthenticationData']:
        """
        credentials for the AWS authentication
        """
        return pulumi.get(self, "authentication_data")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the credentials
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="partitionType")
    def partition_type(self) -> pulumi.Output[str]:
        """
        The type of the AWS partition
        """
        return pulumi.get(self, "partition_type")

    @property
    @pulumi.getter(name="supportingServicesManagedInDynatrace")
    def supporting_services_managed_in_dynatrace(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled (`true`) the attribute `supporting_services` will not get synchronized with Dynatrace. You will be able to
        manage them via WebUI without interference by Terraform.
        """
        return pulumi.get(self, "supporting_services_managed_in_dynatrace")

    @property
    @pulumi.getter(name="supportingServicesToMonitors")
    def supporting_services_to_monitors(self) -> pulumi.Output[Optional[Sequence['outputs.AwsCredentialsSupportingServicesToMonitor']]]:
        """
        supporting services to be monitored
        """
        return pulumi.get(self, "supporting_services_to_monitors")

    @property
    @pulumi.getter(name="taggedOnly")
    def tagged_only(self) -> pulumi.Output[bool]:
        """
        Monitor only resources which have specified AWS tags (`true`) or all resources (`false`)
        """
        return pulumi.get(self, "tagged_only")

    @property
    @pulumi.getter(name="tagsToMonitors")
    def tags_to_monitors(self) -> pulumi.Output[Optional[Sequence['outputs.AwsCredentialsTagsToMonitor']]]:
        """
        AWS tags to be monitored. You can specify up to 10 tags. Only applicable when the **tagged_only** parameter is set to `true`
        """
        return pulumi.get(self, "tags_to_monitors")

    @property
    @pulumi.getter
    def unknowns(self) -> pulumi.Output[Optional[str]]:
        """
        Any attributes that aren't yet supported by this provider
        """
        return pulumi.get(self, "unknowns")

