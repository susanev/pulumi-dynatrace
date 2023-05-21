# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SloNormalizationArgs', 'SloNormalization']

@pulumi.input_type
class SloNormalizationArgs:
    def __init__(__self__, *,
                 normalize: pulumi.Input[bool]):
        """
        The set of arguments for constructing a SloNormalization resource.
        :param pulumi.Input[bool] normalize: When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        pulumi.set(__self__, "normalize", normalize)

    @property
    @pulumi.getter
    def normalize(self) -> pulumi.Input[bool]:
        """
        When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        return pulumi.get(self, "normalize")

    @normalize.setter
    def normalize(self, value: pulumi.Input[bool]):
        pulumi.set(self, "normalize", value)


@pulumi.input_type
class _SloNormalizationState:
    def __init__(__self__, *,
                 normalize: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SloNormalization resources.
        :param pulumi.Input[bool] normalize: When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        if normalize is not None:
            pulumi.set(__self__, "normalize", normalize)

    @property
    @pulumi.getter
    def normalize(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        return pulumi.get(self, "normalize")

    @normalize.setter
    def normalize(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "normalize", value)


class SloNormalization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 normalize: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Create a SloNormalization resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] normalize: When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SloNormalizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SloNormalization resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SloNormalizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SloNormalizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 normalize: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SloNormalizationArgs.__new__(SloNormalizationArgs)

            if normalize is None and not opts.urn:
                raise TypeError("Missing required property 'normalize'")
            __props__.__dict__["normalize"] = normalize
        super(SloNormalization, __self__).__init__(
            'dynatrace:index/sloNormalization:SloNormalization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            normalize: Optional[pulumi.Input[bool]] = None) -> 'SloNormalization':
        """
        Get an existing SloNormalization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] normalize: When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SloNormalizationState.__new__(_SloNormalizationState)

        __props__.__dict__["normalize"] = normalize
        return SloNormalization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def normalize(self) -> pulumi.Output[bool]:
        """
        When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
        """
        return pulumi.get(self, "normalize")

