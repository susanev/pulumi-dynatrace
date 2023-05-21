// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type ProcessMonitoring struct {
	pulumi.CustomResourceState

	// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
	// Disabling only works if all installed Agents have version 1.123 or higher.
	AutoMonitoring pulumi.BoolOutput `pulumi:"autoMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrOutput `pulumi:"hostGroupId"`
}

// NewProcessMonitoring registers a new resource with the given unique name, arguments, and options.
func NewProcessMonitoring(ctx *pulumi.Context,
	name string, args *ProcessMonitoringArgs, opts ...pulumi.ResourceOption) (*ProcessMonitoring, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoMonitoring == nil {
		return nil, errors.New("invalid value for required argument 'AutoMonitoring'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ProcessMonitoring
	err := ctx.RegisterResource("dynatrace:index/processMonitoring:ProcessMonitoring", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProcessMonitoring gets an existing ProcessMonitoring resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProcessMonitoring(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProcessMonitoringState, opts ...pulumi.ResourceOption) (*ProcessMonitoring, error) {
	var resource ProcessMonitoring
	err := ctx.ReadResource("dynatrace:index/processMonitoring:ProcessMonitoring", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProcessMonitoring resources.
type processMonitoringState struct {
	// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
	// Disabling only works if all installed Agents have version 1.123 or higher.
	AutoMonitoring *bool `pulumi:"autoMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId *string `pulumi:"hostGroupId"`
}

type ProcessMonitoringState struct {
	// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
	// Disabling only works if all installed Agents have version 1.123 or higher.
	AutoMonitoring pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrInput
}

func (ProcessMonitoringState) ElementType() reflect.Type {
	return reflect.TypeOf((*processMonitoringState)(nil)).Elem()
}

type processMonitoringArgs struct {
	// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
	// Disabling only works if all installed Agents have version 1.123 or higher.
	AutoMonitoring bool `pulumi:"autoMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId *string `pulumi:"hostGroupId"`
}

// The set of arguments for constructing a ProcessMonitoring resource.
type ProcessMonitoringArgs struct {
	// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
	// Disabling only works if all installed Agents have version 1.123 or higher.
	AutoMonitoring pulumi.BoolInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostGroupId pulumi.StringPtrInput
}

func (ProcessMonitoringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*processMonitoringArgs)(nil)).Elem()
}

type ProcessMonitoringInput interface {
	pulumi.Input

	ToProcessMonitoringOutput() ProcessMonitoringOutput
	ToProcessMonitoringOutputWithContext(ctx context.Context) ProcessMonitoringOutput
}

func (*ProcessMonitoring) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcessMonitoring)(nil)).Elem()
}

func (i *ProcessMonitoring) ToProcessMonitoringOutput() ProcessMonitoringOutput {
	return i.ToProcessMonitoringOutputWithContext(context.Background())
}

func (i *ProcessMonitoring) ToProcessMonitoringOutputWithContext(ctx context.Context) ProcessMonitoringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessMonitoringOutput)
}

// ProcessMonitoringArrayInput is an input type that accepts ProcessMonitoringArray and ProcessMonitoringArrayOutput values.
// You can construct a concrete instance of `ProcessMonitoringArrayInput` via:
//
//	ProcessMonitoringArray{ ProcessMonitoringArgs{...} }
type ProcessMonitoringArrayInput interface {
	pulumi.Input

	ToProcessMonitoringArrayOutput() ProcessMonitoringArrayOutput
	ToProcessMonitoringArrayOutputWithContext(context.Context) ProcessMonitoringArrayOutput
}

type ProcessMonitoringArray []ProcessMonitoringInput

func (ProcessMonitoringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcessMonitoring)(nil)).Elem()
}

func (i ProcessMonitoringArray) ToProcessMonitoringArrayOutput() ProcessMonitoringArrayOutput {
	return i.ToProcessMonitoringArrayOutputWithContext(context.Background())
}

func (i ProcessMonitoringArray) ToProcessMonitoringArrayOutputWithContext(ctx context.Context) ProcessMonitoringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessMonitoringArrayOutput)
}

// ProcessMonitoringMapInput is an input type that accepts ProcessMonitoringMap and ProcessMonitoringMapOutput values.
// You can construct a concrete instance of `ProcessMonitoringMapInput` via:
//
//	ProcessMonitoringMap{ "key": ProcessMonitoringArgs{...} }
type ProcessMonitoringMapInput interface {
	pulumi.Input

	ToProcessMonitoringMapOutput() ProcessMonitoringMapOutput
	ToProcessMonitoringMapOutputWithContext(context.Context) ProcessMonitoringMapOutput
}

type ProcessMonitoringMap map[string]ProcessMonitoringInput

func (ProcessMonitoringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcessMonitoring)(nil)).Elem()
}

func (i ProcessMonitoringMap) ToProcessMonitoringMapOutput() ProcessMonitoringMapOutput {
	return i.ToProcessMonitoringMapOutputWithContext(context.Background())
}

func (i ProcessMonitoringMap) ToProcessMonitoringMapOutputWithContext(ctx context.Context) ProcessMonitoringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProcessMonitoringMapOutput)
}

type ProcessMonitoringOutput struct{ *pulumi.OutputState }

func (ProcessMonitoringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProcessMonitoring)(nil)).Elem()
}

func (o ProcessMonitoringOutput) ToProcessMonitoringOutput() ProcessMonitoringOutput {
	return o
}

func (o ProcessMonitoringOutput) ToProcessMonitoringOutputWithContext(ctx context.Context) ProcessMonitoringOutput {
	return o
}

// By disabling automatic deep monitoring the Dynatrace OneAgent will only deep monitor processes that are covered by a respective deep monitoring rule or where monitoring is enabled explicitly.
// Disabling only works if all installed Agents have version 1.123 or higher.
func (o ProcessMonitoringOutput) AutoMonitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v *ProcessMonitoring) pulumi.BoolOutput { return v.AutoMonitoring }).(pulumi.BoolOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o ProcessMonitoringOutput) HostGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProcessMonitoring) pulumi.StringPtrOutput { return v.HostGroupId }).(pulumi.StringPtrOutput)
}

type ProcessMonitoringArrayOutput struct{ *pulumi.OutputState }

func (ProcessMonitoringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProcessMonitoring)(nil)).Elem()
}

func (o ProcessMonitoringArrayOutput) ToProcessMonitoringArrayOutput() ProcessMonitoringArrayOutput {
	return o
}

func (o ProcessMonitoringArrayOutput) ToProcessMonitoringArrayOutputWithContext(ctx context.Context) ProcessMonitoringArrayOutput {
	return o
}

func (o ProcessMonitoringArrayOutput) Index(i pulumi.IntInput) ProcessMonitoringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProcessMonitoring {
		return vs[0].([]*ProcessMonitoring)[vs[1].(int)]
	}).(ProcessMonitoringOutput)
}

type ProcessMonitoringMapOutput struct{ *pulumi.OutputState }

func (ProcessMonitoringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProcessMonitoring)(nil)).Elem()
}

func (o ProcessMonitoringMapOutput) ToProcessMonitoringMapOutput() ProcessMonitoringMapOutput {
	return o
}

func (o ProcessMonitoringMapOutput) ToProcessMonitoringMapOutputWithContext(ctx context.Context) ProcessMonitoringMapOutput {
	return o
}

func (o ProcessMonitoringMapOutput) MapIndex(k pulumi.StringInput) ProcessMonitoringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProcessMonitoring {
		return vs[0].(map[string]*ProcessMonitoring)[vs[1].(string)]
	}).(ProcessMonitoringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessMonitoringInput)(nil)).Elem(), &ProcessMonitoring{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessMonitoringArrayInput)(nil)).Elem(), ProcessMonitoringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProcessMonitoringMapInput)(nil)).Elem(), ProcessMonitoringMap{})
	pulumi.RegisterOutputType(ProcessMonitoringOutput{})
	pulumi.RegisterOutputType(ProcessMonitoringArrayOutput{})
	pulumi.RegisterOutputType(ProcessMonitoringMapOutput{})
}
