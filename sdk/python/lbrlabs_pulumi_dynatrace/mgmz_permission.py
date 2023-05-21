# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MgmzPermissionArgs', 'MgmzPermission']

@pulumi.input_type
class MgmzPermissionArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input[str],
                 group: pulumi.Input[str],
                 management_zone: pulumi.Input[str],
                 permissions: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a MgmzPermission resource.
        :param pulumi.Input[str] environment: The UUID of the environment
        :param pulumi.Input[str] group: The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        :param pulumi.Input[str] management_zone: The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "group", group)
        pulumi.set(__self__, "management_zone", management_zone)
        pulumi.set(__self__, "permissions", permissions)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input[str]:
        """
        The UUID of the environment
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def group(self) -> pulumi.Input[str]:
        """
        The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: pulumi.Input[str]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> pulumi.Input[str]:
        """
        The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "permissions", value)


@pulumi.input_type
class _MgmzPermissionState:
    def __init__(__self__, *,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering MgmzPermission resources.
        :param pulumi.Input[str] environment: The UUID of the environment
        :param pulumi.Input[str] group: The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        :param pulumi.Input[str] management_zone: The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if group is not None:
            pulumi.set(__self__, "group", group)
        if management_zone is not None:
            pulumi.set(__self__, "management_zone", management_zone)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of the environment
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def group(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "permissions", value)


class MgmzPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Create a MgmzPermission resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment: The UUID of the environment
        :param pulumi.Input[str] group: The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        :param pulumi.Input[str] management_zone: The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MgmzPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a MgmzPermission resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param MgmzPermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MgmzPermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MgmzPermissionArgs.__new__(MgmzPermissionArgs)

            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if group is None and not opts.urn:
                raise TypeError("Missing required property 'group'")
            __props__.__dict__["group"] = group
            if management_zone is None and not opts.urn:
                raise TypeError("Missing required property 'management_zone'")
            __props__.__dict__["management_zone"] = management_zone
            if permissions is None and not opts.urn:
                raise TypeError("Missing required property 'permissions'")
            __props__.__dict__["permissions"] = permissions
        super(MgmzPermission, __self__).__init__(
            'dynatrace:index/mgmzPermission:MgmzPermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            environment: Optional[pulumi.Input[str]] = None,
            group: Optional[pulumi.Input[str]] = None,
            management_zone: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'MgmzPermission':
        """
        Get an existing MgmzPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] environment: The UUID of the environment
        :param pulumi.Input[str] group: The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        :param pulumi.Input[str] management_zone: The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] permissions: The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MgmzPermissionState.__new__(_MgmzPermissionState)

        __props__.__dict__["environment"] = environment
        __props__.__dict__["group"] = group
        __props__.__dict__["management_zone"] = management_zone
        __props__.__dict__["permissions"] = permissions
        return MgmzPermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[str]:
        """
        The UUID of the environment
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[str]:
        """
        The ID of the group the permissions are valid for. You may refer to the id of a resource `UserGroup` here
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> pulumi.Output[str]:
        """
        The ID of the management zone the permissions are valid for. When referring to resource `ManagementZoneV2` or data source `ManagementZone` you need to refer to the attribute `legacy_id`.
        """
        return pulumi.get(self, "management_zone")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Sequence[str]]:
        """
        The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
        """
        return pulumi.get(self, "permissions")

