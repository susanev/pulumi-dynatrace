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

__all__ = ['SloV2Args', 'SloV2']

@pulumi.input_type
class SloV2Args:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 error_budget_burn_rate: pulumi.Input['SloV2ErrorBudgetBurnRateArgs'],
                 evaluation_type: pulumi.Input[str],
                 evaluation_window: pulumi.Input[str],
                 filter: pulumi.Input[str],
                 metric_expression: pulumi.Input[str],
                 metric_name: pulumi.Input[str],
                 target_success: pulumi.Input[float],
                 target_warning: pulumi.Input[float],
                 custom_description: Optional[pulumi.Input[str]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SloV2 resource.
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input['SloV2ErrorBudgetBurnRateArgs'] error_budget_burn_rate: ### Error budget burn rate
        :param pulumi.Input[str] evaluation_type: Possible Values: `AGGREGATE`
        :param pulumi.Input[str] evaluation_window: Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        :param pulumi.Input[str] filter: Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        :param pulumi.Input[str] metric_expression: For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        :param pulumi.Input[str] metric_name: Metric name
        :param pulumi.Input[float] target_success: Set the target value of the SLO. A percentage below this value indicates a failure.
        :param pulumi.Input[float] target_warning: Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        :param pulumi.Input[str] custom_description: The description of the SLO
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] name: SLO name
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "error_budget_burn_rate", error_budget_burn_rate)
        pulumi.set(__self__, "evaluation_type", evaluation_type)
        pulumi.set(__self__, "evaluation_window", evaluation_window)
        pulumi.set(__self__, "filter", filter)
        pulumi.set(__self__, "metric_expression", metric_expression)
        pulumi.set(__self__, "metric_name", metric_name)
        pulumi.set(__self__, "target_success", target_success)
        pulumi.set(__self__, "target_warning", target_warning)
        if custom_description is not None:
            pulumi.set(__self__, "custom_description", custom_description)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="errorBudgetBurnRate")
    def error_budget_burn_rate(self) -> pulumi.Input['SloV2ErrorBudgetBurnRateArgs']:
        """
        ### Error budget burn rate
        """
        return pulumi.get(self, "error_budget_burn_rate")

    @error_budget_burn_rate.setter
    def error_budget_burn_rate(self, value: pulumi.Input['SloV2ErrorBudgetBurnRateArgs']):
        pulumi.set(self, "error_budget_burn_rate", value)

    @property
    @pulumi.getter(name="evaluationType")
    def evaluation_type(self) -> pulumi.Input[str]:
        """
        Possible Values: `AGGREGATE`
        """
        return pulumi.get(self, "evaluation_type")

    @evaluation_type.setter
    def evaluation_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "evaluation_type", value)

    @property
    @pulumi.getter(name="evaluationWindow")
    def evaluation_window(self) -> pulumi.Input[str]:
        """
        Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        """
        return pulumi.get(self, "evaluation_window")

    @evaluation_window.setter
    def evaluation_window(self, value: pulumi.Input[str]):
        pulumi.set(self, "evaluation_window", value)

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Input[str]:
        """
        Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input[str]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="metricExpression")
    def metric_expression(self) -> pulumi.Input[str]:
        """
        For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        """
        return pulumi.get(self, "metric_expression")

    @metric_expression.setter
    def metric_expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric_expression", value)

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> pulumi.Input[str]:
        """
        Metric name
        """
        return pulumi.get(self, "metric_name")

    @metric_name.setter
    def metric_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric_name", value)

    @property
    @pulumi.getter(name="targetSuccess")
    def target_success(self) -> pulumi.Input[float]:
        """
        Set the target value of the SLO. A percentage below this value indicates a failure.
        """
        return pulumi.get(self, "target_success")

    @target_success.setter
    def target_success(self, value: pulumi.Input[float]):
        pulumi.set(self, "target_success", value)

    @property
    @pulumi.getter(name="targetWarning")
    def target_warning(self) -> pulumi.Input[float]:
        """
        Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        return pulumi.get(self, "target_warning")

    @target_warning.setter
    def target_warning(self, value: pulumi.Input[float]):
        pulumi.set(self, "target_warning", value)

    @property
    @pulumi.getter(name="customDescription")
    def custom_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the SLO
        """
        return pulumi.get(self, "custom_description")

    @custom_description.setter
    def custom_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_description", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        SLO name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SloV2State:
    def __init__(__self__, *,
                 custom_description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 error_budget_burn_rate: Optional[pulumi.Input['SloV2ErrorBudgetBurnRateArgs']] = None,
                 evaluation_type: Optional[pulumi.Input[str]] = None,
                 evaluation_window: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 metric_expression: Optional[pulumi.Input[str]] = None,
                 metric_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target_success: Optional[pulumi.Input[float]] = None,
                 target_warning: Optional[pulumi.Input[float]] = None):
        """
        Input properties used for looking up and filtering SloV2 resources.
        :param pulumi.Input[str] custom_description: The description of the SLO
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input['SloV2ErrorBudgetBurnRateArgs'] error_budget_burn_rate: ### Error budget burn rate
        :param pulumi.Input[str] evaluation_type: Possible Values: `AGGREGATE`
        :param pulumi.Input[str] evaluation_window: Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        :param pulumi.Input[str] filter: Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] metric_expression: For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        :param pulumi.Input[str] metric_name: Metric name
        :param pulumi.Input[str] name: SLO name
        :param pulumi.Input[float] target_success: Set the target value of the SLO. A percentage below this value indicates a failure.
        :param pulumi.Input[float] target_warning: Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        if custom_description is not None:
            pulumi.set(__self__, "custom_description", custom_description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if error_budget_burn_rate is not None:
            pulumi.set(__self__, "error_budget_burn_rate", error_budget_burn_rate)
        if evaluation_type is not None:
            pulumi.set(__self__, "evaluation_type", evaluation_type)
        if evaluation_window is not None:
            pulumi.set(__self__, "evaluation_window", evaluation_window)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if metric_expression is not None:
            pulumi.set(__self__, "metric_expression", metric_expression)
        if metric_name is not None:
            pulumi.set(__self__, "metric_name", metric_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if target_success is not None:
            pulumi.set(__self__, "target_success", target_success)
        if target_warning is not None:
            pulumi.set(__self__, "target_warning", target_warning)

    @property
    @pulumi.getter(name="customDescription")
    def custom_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the SLO
        """
        return pulumi.get(self, "custom_description")

    @custom_description.setter
    def custom_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="errorBudgetBurnRate")
    def error_budget_burn_rate(self) -> Optional[pulumi.Input['SloV2ErrorBudgetBurnRateArgs']]:
        """
        ### Error budget burn rate
        """
        return pulumi.get(self, "error_budget_burn_rate")

    @error_budget_burn_rate.setter
    def error_budget_burn_rate(self, value: Optional[pulumi.Input['SloV2ErrorBudgetBurnRateArgs']]):
        pulumi.set(self, "error_budget_burn_rate", value)

    @property
    @pulumi.getter(name="evaluationType")
    def evaluation_type(self) -> Optional[pulumi.Input[str]]:
        """
        Possible Values: `AGGREGATE`
        """
        return pulumi.get(self, "evaluation_type")

    @evaluation_type.setter
    def evaluation_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "evaluation_type", value)

    @property
    @pulumi.getter(name="evaluationWindow")
    def evaluation_window(self) -> Optional[pulumi.Input[str]]:
        """
        Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        """
        return pulumi.get(self, "evaluation_window")

    @evaluation_window.setter
    def evaluation_window(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "evaluation_window", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[str]]:
        """
        Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

    @property
    @pulumi.getter(name="metricExpression")
    def metric_expression(self) -> Optional[pulumi.Input[str]]:
        """
        For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        """
        return pulumi.get(self, "metric_expression")

    @metric_expression.setter
    def metric_expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_expression", value)

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> Optional[pulumi.Input[str]]:
        """
        Metric name
        """
        return pulumi.get(self, "metric_name")

    @metric_name.setter
    def metric_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        SLO name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="targetSuccess")
    def target_success(self) -> Optional[pulumi.Input[float]]:
        """
        Set the target value of the SLO. A percentage below this value indicates a failure.
        """
        return pulumi.get(self, "target_success")

    @target_success.setter
    def target_success(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "target_success", value)

    @property
    @pulumi.getter(name="targetWarning")
    def target_warning(self) -> Optional[pulumi.Input[float]]:
        """
        Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        return pulumi.get(self, "target_warning")

    @target_warning.setter
    def target_warning(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "target_warning", value)


class SloV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 error_budget_burn_rate: Optional[pulumi.Input[pulumi.InputType['SloV2ErrorBudgetBurnRateArgs']]] = None,
                 evaluation_type: Optional[pulumi.Input[str]] = None,
                 evaluation_window: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 metric_expression: Optional[pulumi.Input[str]] = None,
                 metric_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target_success: Optional[pulumi.Input[float]] = None,
                 target_warning: Optional[pulumi.Input[float]] = None,
                 __props__=None):
        """
        Create a SloV2 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] custom_description: The description of the SLO
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['SloV2ErrorBudgetBurnRateArgs']] error_budget_burn_rate: ### Error budget burn rate
        :param pulumi.Input[str] evaluation_type: Possible Values: `AGGREGATE`
        :param pulumi.Input[str] evaluation_window: Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        :param pulumi.Input[str] filter: Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] metric_expression: For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        :param pulumi.Input[str] metric_name: Metric name
        :param pulumi.Input[str] name: SLO name
        :param pulumi.Input[float] target_success: Set the target value of the SLO. A percentage below this value indicates a failure.
        :param pulumi.Input[float] target_warning: Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SloV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SloV2 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SloV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SloV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 error_budget_burn_rate: Optional[pulumi.Input[pulumi.InputType['SloV2ErrorBudgetBurnRateArgs']]] = None,
                 evaluation_type: Optional[pulumi.Input[str]] = None,
                 evaluation_window: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 metric_expression: Optional[pulumi.Input[str]] = None,
                 metric_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target_success: Optional[pulumi.Input[float]] = None,
                 target_warning: Optional[pulumi.Input[float]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SloV2Args.__new__(SloV2Args)

            __props__.__dict__["custom_description"] = custom_description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if error_budget_burn_rate is None and not opts.urn:
                raise TypeError("Missing required property 'error_budget_burn_rate'")
            __props__.__dict__["error_budget_burn_rate"] = error_budget_burn_rate
            if evaluation_type is None and not opts.urn:
                raise TypeError("Missing required property 'evaluation_type'")
            __props__.__dict__["evaluation_type"] = evaluation_type
            if evaluation_window is None and not opts.urn:
                raise TypeError("Missing required property 'evaluation_window'")
            __props__.__dict__["evaluation_window"] = evaluation_window
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
            __props__.__dict__["legacy_id"] = legacy_id
            if metric_expression is None and not opts.urn:
                raise TypeError("Missing required property 'metric_expression'")
            __props__.__dict__["metric_expression"] = metric_expression
            if metric_name is None and not opts.urn:
                raise TypeError("Missing required property 'metric_name'")
            __props__.__dict__["metric_name"] = metric_name
            __props__.__dict__["name"] = name
            if target_success is None and not opts.urn:
                raise TypeError("Missing required property 'target_success'")
            __props__.__dict__["target_success"] = target_success
            if target_warning is None and not opts.urn:
                raise TypeError("Missing required property 'target_warning'")
            __props__.__dict__["target_warning"] = target_warning
        super(SloV2, __self__).__init__(
            'dynatrace:index/sloV2:SloV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            error_budget_burn_rate: Optional[pulumi.Input[pulumi.InputType['SloV2ErrorBudgetBurnRateArgs']]] = None,
            evaluation_type: Optional[pulumi.Input[str]] = None,
            evaluation_window: Optional[pulumi.Input[str]] = None,
            filter: Optional[pulumi.Input[str]] = None,
            legacy_id: Optional[pulumi.Input[str]] = None,
            metric_expression: Optional[pulumi.Input[str]] = None,
            metric_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            target_success: Optional[pulumi.Input[float]] = None,
            target_warning: Optional[pulumi.Input[float]] = None) -> 'SloV2':
        """
        Get an existing SloV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] custom_description: The description of the SLO
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['SloV2ErrorBudgetBurnRateArgs']] error_budget_burn_rate: ### Error budget burn rate
        :param pulumi.Input[str] evaluation_type: Possible Values: `AGGREGATE`
        :param pulumi.Input[str] evaluation_window: Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        :param pulumi.Input[str] filter: Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] metric_expression: For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        :param pulumi.Input[str] metric_name: Metric name
        :param pulumi.Input[str] name: SLO name
        :param pulumi.Input[float] target_success: Set the target value of the SLO. A percentage below this value indicates a failure.
        :param pulumi.Input[float] target_warning: Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SloV2State.__new__(_SloV2State)

        __props__.__dict__["custom_description"] = custom_description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["error_budget_burn_rate"] = error_budget_burn_rate
        __props__.__dict__["evaluation_type"] = evaluation_type
        __props__.__dict__["evaluation_window"] = evaluation_window
        __props__.__dict__["filter"] = filter
        __props__.__dict__["legacy_id"] = legacy_id
        __props__.__dict__["metric_expression"] = metric_expression
        __props__.__dict__["metric_name"] = metric_name
        __props__.__dict__["name"] = name
        __props__.__dict__["target_success"] = target_success
        __props__.__dict__["target_warning"] = target_warning
        return SloV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customDescription")
    def custom_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the SLO
        """
        return pulumi.get(self, "custom_description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="errorBudgetBurnRate")
    def error_budget_burn_rate(self) -> pulumi.Output['outputs.SloV2ErrorBudgetBurnRate']:
        """
        ### Error budget burn rate
        """
        return pulumi.get(self, "error_budget_burn_rate")

    @property
    @pulumi.getter(name="evaluationType")
    def evaluation_type(self) -> pulumi.Output[str]:
        """
        Possible Values: `AGGREGATE`
        """
        return pulumi.get(self, "evaluation_type")

    @property
    @pulumi.getter(name="evaluationWindow")
    def evaluation_window(self) -> pulumi.Output[str]:
        """
        Define the timeframe during which the SLO is to be evaluated. For the timeframe you can enter expressions like -1h (last hour), -1w (last week) or complex expressions like -2d to now (last two days), -1d/d to now/d (beginning of yesterday to beginning of today).
        """
        return pulumi.get(self, "evaluation_window")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output[str]:
        """
        Set a filter parameter (entitySelector) on any GET call to evaluate this SLO against specific services only (for example, type("SERVICE")).  For details, see the [Entity Selector documentation](https://dt-url.net/entityselector).
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> pulumi.Output[str]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @property
    @pulumi.getter(name="metricExpression")
    def metric_expression(self) -> pulumi.Output[str]:
        """
        For details, see the [Metrics page](https://www.terraform.io/ui/metrics).
        """
        return pulumi.get(self, "metric_expression")

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> pulumi.Output[str]:
        """
        Metric name
        """
        return pulumi.get(self, "metric_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        SLO name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="targetSuccess")
    def target_success(self) -> pulumi.Output[float]:
        """
        Set the target value of the SLO. A percentage below this value indicates a failure.
        """
        return pulumi.get(self, "target_success")

    @property
    @pulumi.getter(name="targetWarning")
    def target_warning(self) -> pulumi.Output[float]:
        """
        Set the warning value of the SLO. At the warning state the SLO is fulfilled. However, it is getting close to a failure.
        """
        return pulumi.get(self, "target_warning")

