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
    'GetMobileApplicationResult',
    'AwaitableGetMobileApplicationResult',
    'get_mobile_application',
    'get_mobile_application_output',
]

@pulumi.output_type
class GetMobileApplicationResult:
    """
    A collection of values returned by getMobileApplication.
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


class AwaitableGetMobileApplicationResult(GetMobileApplicationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMobileApplicationResult(
            id=self.id,
            name=self.name)


def get_mobile_application(name: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMobileApplicationResult:
    """
    The `MobileApplication` data source allows the mobile application ID to be retrieved by its name.

    - `name` (String) - The name of the dashboard

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dynatrace as dynatrace

    example = dynatrace.get_mobile_application(name="Terraform")
    pulumi.export("id", example.id)
    ```
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dynatrace:index/getMobileApplication:getMobileApplication', __args__, opts=opts, typ=GetMobileApplicationResult).value

    return AwaitableGetMobileApplicationResult(
        id=__ret__.id,
        name=__ret__.name)


@_utilities.lift_output_func(get_mobile_application)
def get_mobile_application_output(name: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMobileApplicationResult]:
    """
    The `MobileApplication` data source allows the mobile application ID to be retrieved by its name.

    - `name` (String) - The name of the dashboard

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dynatrace as dynatrace

    example = dynatrace.get_mobile_application(name="Terraform")
    pulumi.export("id", example.id)
    ```
    """
    ...
