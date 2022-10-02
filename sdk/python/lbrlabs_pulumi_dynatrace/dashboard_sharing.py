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

__all__ = ['DashboardSharingArgs', 'DashboardSharing']

@pulumi.input_type
class DashboardSharingArgs:
    def __init__(__self__, *,
                 dashboard_id: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 permissions: Optional[pulumi.Input['DashboardSharingPermissionsArgs']] = None,
                 preset: Optional[pulumi.Input[bool]] = None,
                 public: Optional[pulumi.Input['DashboardSharingPublicArgs']] = None):
        """
        The set of arguments for constructing a DashboardSharing resource.
        :param pulumi.Input[str] dashboard_id: The Dynatrace entity ID of the dashboard
        :param pulumi.Input[bool] enabled: The dashboard is shared (`true`) or private (`false`)
        :param pulumi.Input['DashboardSharingPermissionsArgs'] permissions: Access permissions of the dashboard
        :param pulumi.Input[bool] preset: If `true` the dashboard will be marked as preset
        :param pulumi.Input['DashboardSharingPublicArgs'] public: Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        pulumi.set(__self__, "dashboard_id", dashboard_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if preset is not None:
            pulumi.set(__self__, "preset", preset)
        if public is not None:
            pulumi.set(__self__, "public", public)

    @property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> pulumi.Input[str]:
        """
        The Dynatrace entity ID of the dashboard
        """
        return pulumi.get(self, "dashboard_id")

    @dashboard_id.setter
    def dashboard_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "dashboard_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The dashboard is shared (`true`) or private (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input['DashboardSharingPermissionsArgs']]:
        """
        Access permissions of the dashboard
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input['DashboardSharingPermissionsArgs']]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter
    def preset(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true` the dashboard will be marked as preset
        """
        return pulumi.get(self, "preset")

    @preset.setter
    def preset(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "preset", value)

    @property
    @pulumi.getter
    def public(self) -> Optional[pulumi.Input['DashboardSharingPublicArgs']]:
        """
        Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        return pulumi.get(self, "public")

    @public.setter
    def public(self, value: Optional[pulumi.Input['DashboardSharingPublicArgs']]):
        pulumi.set(self, "public", value)


@pulumi.input_type
class _DashboardSharingState:
    def __init__(__self__, *,
                 dashboard_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 permissions: Optional[pulumi.Input['DashboardSharingPermissionsArgs']] = None,
                 preset: Optional[pulumi.Input[bool]] = None,
                 public: Optional[pulumi.Input['DashboardSharingPublicArgs']] = None):
        """
        Input properties used for looking up and filtering DashboardSharing resources.
        :param pulumi.Input[str] dashboard_id: The Dynatrace entity ID of the dashboard
        :param pulumi.Input[bool] enabled: The dashboard is shared (`true`) or private (`false`)
        :param pulumi.Input['DashboardSharingPermissionsArgs'] permissions: Access permissions of the dashboard
        :param pulumi.Input[bool] preset: If `true` the dashboard will be marked as preset
        :param pulumi.Input['DashboardSharingPublicArgs'] public: Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        if dashboard_id is not None:
            pulumi.set(__self__, "dashboard_id", dashboard_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if preset is not None:
            pulumi.set(__self__, "preset", preset)
        if public is not None:
            pulumi.set(__self__, "public", public)

    @property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Dynatrace entity ID of the dashboard
        """
        return pulumi.get(self, "dashboard_id")

    @dashboard_id.setter
    def dashboard_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The dashboard is shared (`true`) or private (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input['DashboardSharingPermissionsArgs']]:
        """
        Access permissions of the dashboard
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input['DashboardSharingPermissionsArgs']]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter
    def preset(self) -> Optional[pulumi.Input[bool]]:
        """
        If `true` the dashboard will be marked as preset
        """
        return pulumi.get(self, "preset")

    @preset.setter
    def preset(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "preset", value)

    @property
    @pulumi.getter
    def public(self) -> Optional[pulumi.Input['DashboardSharingPublicArgs']]:
        """
        Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        return pulumi.get(self, "public")

    @public.setter
    def public(self, value: Optional[pulumi.Input['DashboardSharingPublicArgs']]):
        pulumi.set(self, "public", value)


class DashboardSharing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dashboard_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 permissions: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPermissionsArgs']]] = None,
                 preset: Optional[pulumi.Input[bool]] = None,
                 public: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPublicArgs']]] = None,
                 __props__=None):
        """
        ## Dynatrace Documentation

        - Share Dynatrace dashboards - https://www.dynatrace.com/support/help/how-to-use-dynatrace/dashboards-and-charts/dashboards/share-dashboards

        - Dashboards API - https://www.dynatrace.com/support/help/dynatrace-api/configuration-api/dashboards-api

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dashboard_id: The Dynatrace entity ID of the dashboard
        :param pulumi.Input[bool] enabled: The dashboard is shared (`true`) or private (`false`)
        :param pulumi.Input[pulumi.InputType['DashboardSharingPermissionsArgs']] permissions: Access permissions of the dashboard
        :param pulumi.Input[bool] preset: If `true` the dashboard will be marked as preset
        :param pulumi.Input[pulumi.InputType['DashboardSharingPublicArgs']] public: Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DashboardSharingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Dynatrace Documentation

        - Share Dynatrace dashboards - https://www.dynatrace.com/support/help/how-to-use-dynatrace/dashboards-and-charts/dashboards/share-dashboards

        - Dashboards API - https://www.dynatrace.com/support/help/dynatrace-api/configuration-api/dashboards-api

        :param str resource_name: The name of the resource.
        :param DashboardSharingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DashboardSharingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dashboard_id: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 permissions: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPermissionsArgs']]] = None,
                 preset: Optional[pulumi.Input[bool]] = None,
                 public: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPublicArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DashboardSharingArgs.__new__(DashboardSharingArgs)

            if dashboard_id is None and not opts.urn:
                raise TypeError("Missing required property 'dashboard_id'")
            __props__.__dict__["dashboard_id"] = dashboard_id
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["permissions"] = permissions
            __props__.__dict__["preset"] = preset
            __props__.__dict__["public"] = public
        super(DashboardSharing, __self__).__init__(
            'dynatrace:index/dashboardSharing:DashboardSharing',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dashboard_id: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            permissions: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPermissionsArgs']]] = None,
            preset: Optional[pulumi.Input[bool]] = None,
            public: Optional[pulumi.Input[pulumi.InputType['DashboardSharingPublicArgs']]] = None) -> 'DashboardSharing':
        """
        Get an existing DashboardSharing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dashboard_id: The Dynatrace entity ID of the dashboard
        :param pulumi.Input[bool] enabled: The dashboard is shared (`true`) or private (`false`)
        :param pulumi.Input[pulumi.InputType['DashboardSharingPermissionsArgs']] permissions: Access permissions of the dashboard
        :param pulumi.Input[bool] preset: If `true` the dashboard will be marked as preset
        :param pulumi.Input[pulumi.InputType['DashboardSharingPublicArgs']] public: Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DashboardSharingState.__new__(_DashboardSharingState)

        __props__.__dict__["dashboard_id"] = dashboard_id
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["preset"] = preset
        __props__.__dict__["public"] = public
        return DashboardSharing(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dashboardId")
    def dashboard_id(self) -> pulumi.Output[str]:
        """
        The Dynatrace entity ID of the dashboard
        """
        return pulumi.get(self, "dashboard_id")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        The dashboard is shared (`true`) or private (`false`)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output[Optional['outputs.DashboardSharingPermissions']]:
        """
        Access permissions of the dashboard
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter
    def preset(self) -> pulumi.Output[Optional[bool]]:
        """
        If `true` the dashboard will be marked as preset
        """
        return pulumi.get(self, "preset")

    @property
    @pulumi.getter
    def public(self) -> pulumi.Output[Optional['outputs.DashboardSharingPublic']]:
        """
        Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
        """
        return pulumi.get(self, "public")

