# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetRequestAttributeResult',
    'AwaitableGetRequestAttributeResult',
    'get_request_attribute',
    'get_request_attribute_output',
]

@pulumi.output_type
class GetRequestAttributeResult:
    """
    A collection of values returned by getRequestAttribute.
    """
    def __init__(__self__, id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetRequestAttributeResult(GetRequestAttributeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRequestAttributeResult(
            id=self.id,
            name=self.name)


def get_request_attribute(name: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRequestAttributeResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dynatrace:index/getRequestAttribute:getRequestAttribute', __args__, opts=opts, typ=GetRequestAttributeResult).value

    return AwaitableGetRequestAttributeResult(
        id=__ret__.id,
        name=__ret__.name)


@_utilities.lift_output_func(get_request_attribute)
def get_request_attribute_output(name: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRequestAttributeResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
