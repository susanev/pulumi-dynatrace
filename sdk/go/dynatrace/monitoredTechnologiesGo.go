// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MonitoredTechnologiesGo struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
	EnabledGoStaticMonitoring pulumi.BoolPtrOutput `pulumi:"enabledGoStaticMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrOutput `pulumi:"hostId"`
}

// NewMonitoredTechnologiesGo registers a new resource with the given unique name, arguments, and options.
func NewMonitoredTechnologiesGo(ctx *pulumi.Context,
	name string, args *MonitoredTechnologiesGoArgs, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesGo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource MonitoredTechnologiesGo
	err := ctx.RegisterResource("dynatrace:index/monitoredTechnologiesGo:MonitoredTechnologiesGo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitoredTechnologiesGo gets an existing MonitoredTechnologiesGo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitoredTechnologiesGo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitoredTechnologiesGoState, opts ...pulumi.ResourceOption) (*MonitoredTechnologiesGo, error) {
	var resource MonitoredTechnologiesGo
	err := ctx.ReadResource("dynatrace:index/monitoredTechnologiesGo:MonitoredTechnologiesGo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitoredTechnologiesGo resources.
type monitoredTechnologiesGoState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
	EnabledGoStaticMonitoring *bool `pulumi:"enabledGoStaticMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

type MonitoredTechnologiesGoState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
	EnabledGoStaticMonitoring pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesGoState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesGoState)(nil)).Elem()
}

type monitoredTechnologiesGoArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
	EnabledGoStaticMonitoring *bool `pulumi:"enabledGoStaticMonitoring"`
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId *string `pulumi:"hostId"`
}

// The set of arguments for constructing a MonitoredTechnologiesGo resource.
type MonitoredTechnologiesGoArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
	EnabledGoStaticMonitoring pulumi.BoolPtrInput
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	HostId pulumi.StringPtrInput
}

func (MonitoredTechnologiesGoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitoredTechnologiesGoArgs)(nil)).Elem()
}

type MonitoredTechnologiesGoInput interface {
	pulumi.Input

	ToMonitoredTechnologiesGoOutput() MonitoredTechnologiesGoOutput
	ToMonitoredTechnologiesGoOutputWithContext(ctx context.Context) MonitoredTechnologiesGoOutput
}

func (*MonitoredTechnologiesGo) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesGo)(nil)).Elem()
}

func (i *MonitoredTechnologiesGo) ToMonitoredTechnologiesGoOutput() MonitoredTechnologiesGoOutput {
	return i.ToMonitoredTechnologiesGoOutputWithContext(context.Background())
}

func (i *MonitoredTechnologiesGo) ToMonitoredTechnologiesGoOutputWithContext(ctx context.Context) MonitoredTechnologiesGoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesGoOutput)
}

// MonitoredTechnologiesGoArrayInput is an input type that accepts MonitoredTechnologiesGoArray and MonitoredTechnologiesGoArrayOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesGoArrayInput` via:
//
//	MonitoredTechnologiesGoArray{ MonitoredTechnologiesGoArgs{...} }
type MonitoredTechnologiesGoArrayInput interface {
	pulumi.Input

	ToMonitoredTechnologiesGoArrayOutput() MonitoredTechnologiesGoArrayOutput
	ToMonitoredTechnologiesGoArrayOutputWithContext(context.Context) MonitoredTechnologiesGoArrayOutput
}

type MonitoredTechnologiesGoArray []MonitoredTechnologiesGoInput

func (MonitoredTechnologiesGoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesGo)(nil)).Elem()
}

func (i MonitoredTechnologiesGoArray) ToMonitoredTechnologiesGoArrayOutput() MonitoredTechnologiesGoArrayOutput {
	return i.ToMonitoredTechnologiesGoArrayOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesGoArray) ToMonitoredTechnologiesGoArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesGoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesGoArrayOutput)
}

// MonitoredTechnologiesGoMapInput is an input type that accepts MonitoredTechnologiesGoMap and MonitoredTechnologiesGoMapOutput values.
// You can construct a concrete instance of `MonitoredTechnologiesGoMapInput` via:
//
//	MonitoredTechnologiesGoMap{ "key": MonitoredTechnologiesGoArgs{...} }
type MonitoredTechnologiesGoMapInput interface {
	pulumi.Input

	ToMonitoredTechnologiesGoMapOutput() MonitoredTechnologiesGoMapOutput
	ToMonitoredTechnologiesGoMapOutputWithContext(context.Context) MonitoredTechnologiesGoMapOutput
}

type MonitoredTechnologiesGoMap map[string]MonitoredTechnologiesGoInput

func (MonitoredTechnologiesGoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesGo)(nil)).Elem()
}

func (i MonitoredTechnologiesGoMap) ToMonitoredTechnologiesGoMapOutput() MonitoredTechnologiesGoMapOutput {
	return i.ToMonitoredTechnologiesGoMapOutputWithContext(context.Background())
}

func (i MonitoredTechnologiesGoMap) ToMonitoredTechnologiesGoMapOutputWithContext(ctx context.Context) MonitoredTechnologiesGoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitoredTechnologiesGoMapOutput)
}

type MonitoredTechnologiesGoOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesGoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitoredTechnologiesGo)(nil)).Elem()
}

func (o MonitoredTechnologiesGoOutput) ToMonitoredTechnologiesGoOutput() MonitoredTechnologiesGoOutput {
	return o
}

func (o MonitoredTechnologiesGoOutput) ToMonitoredTechnologiesGoOutputWithContext(ctx context.Context) MonitoredTechnologiesGoOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o MonitoredTechnologiesGoOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesGo) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Learn more about the [known limitations for Go static monitoring](https://www.dynatrace.com/support/help/technology-support/application-software/go/support/go-known-limitations#limitations)
func (o MonitoredTechnologiesGoOutput) EnabledGoStaticMonitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesGo) pulumi.BoolPtrOutput { return v.EnabledGoStaticMonitoring }).(pulumi.BoolPtrOutput)
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o MonitoredTechnologiesGoOutput) HostId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitoredTechnologiesGo) pulumi.StringPtrOutput { return v.HostId }).(pulumi.StringPtrOutput)
}

type MonitoredTechnologiesGoArrayOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesGoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitoredTechnologiesGo)(nil)).Elem()
}

func (o MonitoredTechnologiesGoArrayOutput) ToMonitoredTechnologiesGoArrayOutput() MonitoredTechnologiesGoArrayOutput {
	return o
}

func (o MonitoredTechnologiesGoArrayOutput) ToMonitoredTechnologiesGoArrayOutputWithContext(ctx context.Context) MonitoredTechnologiesGoArrayOutput {
	return o
}

func (o MonitoredTechnologiesGoArrayOutput) Index(i pulumi.IntInput) MonitoredTechnologiesGoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitoredTechnologiesGo {
		return vs[0].([]*MonitoredTechnologiesGo)[vs[1].(int)]
	}).(MonitoredTechnologiesGoOutput)
}

type MonitoredTechnologiesGoMapOutput struct{ *pulumi.OutputState }

func (MonitoredTechnologiesGoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitoredTechnologiesGo)(nil)).Elem()
}

func (o MonitoredTechnologiesGoMapOutput) ToMonitoredTechnologiesGoMapOutput() MonitoredTechnologiesGoMapOutput {
	return o
}

func (o MonitoredTechnologiesGoMapOutput) ToMonitoredTechnologiesGoMapOutputWithContext(ctx context.Context) MonitoredTechnologiesGoMapOutput {
	return o
}

func (o MonitoredTechnologiesGoMapOutput) MapIndex(k pulumi.StringInput) MonitoredTechnologiesGoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitoredTechnologiesGo {
		return vs[0].(map[string]*MonitoredTechnologiesGo)[vs[1].(string)]
	}).(MonitoredTechnologiesGoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesGoInput)(nil)).Elem(), &MonitoredTechnologiesGo{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesGoArrayInput)(nil)).Elem(), MonitoredTechnologiesGoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitoredTechnologiesGoMapInput)(nil)).Elem(), MonitoredTechnologiesGoMap{})
	pulumi.RegisterOutputType(MonitoredTechnologiesGoOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesGoArrayOutput{})
	pulumi.RegisterOutputType(MonitoredTechnologiesGoMapOutput{})
}
