// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MonitoredTechnologiesNodejs struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrOutput `pulumi:"hostId"`
}

// NewMonitoredTechnologiesNodejs registers a new resource with the given unique name, arguments, and options.
func NewMonitoredTechnologiesNodejs(ctx *pulumi.Context,
	name string, args *MonitoredTechnologiesNodejsArgs, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesNodejs, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource MonitoredTechnologiesNodejs
	err := ctx.RegisterResource("dynatrace:index/monitoredTechnologiesNodejs:MonitoredTechnologiesNodejs", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitoredTechnologiesNodejs gets an existing MonitoredTechnologiesNodejs resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitoredTechnologiesNodejs(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitoredTechnologiesNodejsState, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesNodejs, error) {
	var resource MonitoredTechnologiesNodejs
	err := ctx.ReadResource("dynatrace:index/monitoredTechnologiesNodejs:MonitoredTechnologiesNodejs", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitoredTechnologiesNodejs resources.
type monitoredTechnologiesNodejsState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

type MonitoredTechnologiesNodejsState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesNodejsState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesNodejsState)(nil)).Elem()
}

type monitoredTechnologiesNodejsArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

// The set of arguments for constructing a MonitoredTechnologiesNodejs resource.
type MonitoredTechnologiesNodejsArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesNodejsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesNodejsArgs)(nil)).Elem()
}

type MonitoredTechnologiesNodejsInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNodejsOutput() MonitoredTechnologiesNodejsOutput
	ToMonitoredTechnologiesNodejsOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsOutput
}

func (*MonitoredTechnologiesNodejs) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (i *MonitoredTechnologiesNodejs) ToMonitoredTechnologiesNodejsOutput() MonitoredTechnologiesNodejsOutput {
	return i.ToMonitoredTechnologiesNodejsOutputWithContext(context.Background())
}

func (i *MonitoredTechnologiesNodejs) ToMonitoredTechnologiesNodejsOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNodejsOutput)
}

// MonitoredTechnologiesNodejsArrayInput is an input type that accepts MonitoredTechnologiesNodejsArray and MonitoredTechnologiesNodejsArrayOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesNodejsArrayInput` via:
//
//	MonitoredTechnologiesNodejsArray{ MonitoredTechnologiesNodejsArgs{...} }
type MonitoredTechnologiesNodejsArrayInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNodejsArrayOutput() MonitoredTechnologiesNodejsArrayOutput
	ToMonitoredTechnologiesNodejsArrayOutputWithContext(context.Context) MonitoredTechnologiesNodejsArrayOutput
}

type MonitoredTechnologiesNodejsArray []MonitoredTechnologiesNodejsInput

func (MonitoredTechnologiesNodejsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (i MonitoredTechnologiesNodejsArray) ToMonitoredTechnologiesNodejsArrayOutput() MonitoredTechnologiesNodejsArrayOutput {
	return i.ToMonitoredTechnologiesNodejsArrayOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesNodejsArray) ToMonitoredTechnologiesNodejsArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNodejsArrayOutput)
}

// MonitoredTechnologiesNodejsMapInput is an input type that accepts MonitoredTechnologiesNodejsMap and MonitoredTechnologiesNodejsMapOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesNodejsMapInput` via:
//
//	MonitoredTechnologiesNodejsMap{ "key": MonitoredTechnologiesNodejsArgs{...} }
type MonitoredTechnologiesNodejsMapInput interface {
	pulumi.Input

	ToMonitoredTechnologiesNodejsMapOutput() MonitoredTechnologiesNodejsMapOutput
	ToMonitoredTechnologiesNodejsMapOutputWithContext(context.Context) MonitoredTechnologiesNodejsMapOutput
}

type MonitoredTechnologiesNodejsMap map[string]MonitoredTechnologiesNodejsInput

func (MonitoredTechnologiesNodejsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (i MonitoredTechnologiesNodejsMap) ToMonitoredTechnologiesNodejsMapOutput() MonitoredTechnologiesNodejsMapOutput {
	return i.ToMonitoredTechnologiesNodejsMapOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesNodejsMap) ToMonitoredTechnologiesNodejsMapOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesNodejsMapOutput)
}

type MonitoredTechnologiesNodejsOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNodejsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (o MonitoredTechnologiesNodejsOutput) ToMonitoredTechnologiesNodejsOutput() MonitoredTechnologiesNodejsOutput {
	return o
}

func (o MonitoredTechnologiesNodejsOutput) ToMonitoredTechnologiesNodejsOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o MonitoredTechnologiesNodejsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesNodejs) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o MonitoredTechnologiesNodejsOutput) HostId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesNodejs) pulumi.StringPtrOutput { return v.HostId }).(pulumi.StringPtrOutput)
}

type MonitoredTechnologiesNodejsArrayOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNodejsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (o MonitoredTechnologiesNodejsArrayOutput) ToMonitoredTechnologiesNodejsArrayOutput() MonitoredTechnologiesNodejsArrayOutput {
	return o
}

func (o MonitoredTechnologiesNodejsArrayOutput) ToMonitoredTechnologiesNodejsArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsArrayOutput {
	return o
}

func (o MonitoredTechnologiesNodejsArrayOutput) Index(i pulumi.IntInput) MonitoredTechnologiesNodejsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitoredTechnologiesNodejs {
		return vs[0].([]*MonitoredTechnologiesNodejs)[vs[1].(int)]
	}).(MonitoredTechnologiesNodejsOutput)
}

type MonitoredTechnologiesNodejsMapOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesNodejsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesNodejs)(nil)).Elem()
}

func (o MonitoredTechnologiesNodejsMapOutput) ToMonitoredTechnologiesNodejsMapOutput() MonitoredTechnologiesNodejsMapOutput {
	return o
}

func (o MonitoredTechnologiesNodejsMapOutput) ToMonitoredTechnologiesNodejsMapOutputWithContext(ctx context.Context) MonitoredTechnologiesNodejsMapOutput {
	return o
}

func (o MonitoredTechnologiesNodejsMapOutput) MapIndex(k pulumi.StringInput) MonitoredTechnologiesNodejsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitoredTechnologiesNodejs {
		return vs[0].(map[string]*MonitoredTechnologiesNodejs)[vs[1].(string)]
	}).(MonitoredTechnologiesNodejsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNodejsInput)(nil)).Elem(), &MonitoredTechnologiesNodejs{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNodejsArrayInput)(nil)).Elem(), MonitoredTechnologiesNodejsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesNodejsMapInput)(nil)).Elem(), MonitoredTechnologiesNodejsMap{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNodejsOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNodejsArrayOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesNodejsMapOutput{})
}
