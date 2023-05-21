// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type PagerDutyNotification struct {
	pulumi.CustomResourceState

	// The name of the PagerDuty account
	Account pulumi.StringOutput `pulumi:"account"`
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolOutput `pulumi:"active"`
	// The API key to access PagerDuty
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringOutput `pulumi:"legacyId"`
	// The name of the notification configuration
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile pulumi.StringOutput `pulumi:"profile"`
	// The name of the PagerDuty Service
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewPagerDutyNotification registers a new resource with the given unique name, arguments, and options.
func NewPagerDutyNotification(ctx *pulumi.Context,
	name string, args *PagerDutyNotificationArgs, opts ...pulumi.ResourceOption) (*PagerDutyNotification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Account == nil {
		return nil, errors.New("invalid value for required argument 'Account'")
	}
	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.Profile == nil {
		return nil, errors.New("invalid value for required argument 'Profile'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	if args.ApiKey != nil {
		args.ApiKey = pulumi.ToSecret(args.ApiKey).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource PagerDutyNotification
	err := ctx.RegisterResource("dynatrace:index/pagerDutyNotification:PagerDutyNotification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPagerDutyNotification gets an existing PagerDutyNotification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPagerDutyNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PagerDutyNotificationState, opts ...pulumi.ResourceOption) (*PagerDutyNotification, error) {
	var resource PagerDutyNotification
	err := ctx.ReadResource("dynatrace:index/pagerDutyNotification:PagerDutyNotification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PagerDutyNotification resources.
type pagerDutyNotificationState struct {
	// The name of the PagerDuty account
	Account *string `pulumi:"account"`
	// The configuration is enabled (`true`) or disabled (`false`)
	Active *bool `pulumi:"active"`
	// The API key to access PagerDuty
	ApiKey *string `pulumi:"apiKey"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile *string `pulumi:"profile"`
	// The name of the PagerDuty Service
	Service *string `pulumi:"service"`
}

type PagerDutyNotificationState struct {
	// The name of the PagerDuty account
	Account pulumi.StringPtrInput
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolPtrInput
	// The API key to access PagerDuty
	ApiKey pulumi.StringPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringPtrInput
	// The name of the PagerDuty Service
	Service pulumi.StringPtrInput
}

func (PagerDutyNotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*pagerDutyNotificationState)(nil)).Elem()
}

type pagerDutyNotificationArgs struct {
	// The name of the PagerDuty account
	Account string `pulumi:"account"`
	// The configuration is enabled (`true`) or disabled (`false`)
	Active bool `pulumi:"active"`
	// The API key to access PagerDuty
	ApiKey *string `pulumi:"apiKey"`
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId *string `pulumi:"legacyId"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile string `pulumi:"profile"`
	// The name of the PagerDuty Service
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a PagerDutyNotification resource.
type PagerDutyNotificationArgs struct {
	// The name of the PagerDuty account
	Account pulumi.StringInput
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolInput
	// The API key to access PagerDuty
	ApiKey pulumi.StringPtrInput
	// The ID of these settings when referred to from resources requiring the REST API V1 keys
	LegacyId pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringInput
	// The name of the PagerDuty Service
	Service pulumi.StringInput
}

func (PagerDutyNotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pagerDutyNotificationArgs)(nil)).Elem()
}

type PagerDutyNotificationInput interface {
	pulumi.Input

	ToPagerDutyNotificationOutput() PagerDutyNotificationOutput
	ToPagerDutyNotificationOutputWithContext(ctx context.Context) PagerDutyNotificationOutput
}

func (*PagerDutyNotification) ElementType() reflect.Type {
	return reflect.TypeOf((**PagerDutyNotification)(nil)).Elem()
}

func (i *PagerDutyNotification) ToPagerDutyNotificationOutput() PagerDutyNotificationOutput {
	return i.ToPagerDutyNotificationOutputWithContext(context.Background())
}

func (i *PagerDutyNotification) ToPagerDutyNotificationOutputWithContext(ctx context.Context) PagerDutyNotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerDutyNotificationOutput)
}

// PagerDutyNotificationArrayInput is an input type that accepts PagerDutyNotificationArray and PagerDutyNotificationArrayOutput values.
// You can construct a concrete instance of `PagerDutyNotificationArrayInput` via:
//
//	PagerDutyNotificationArray{ PagerDutyNotificationArgs{...} }
type PagerDutyNotificationArrayInput interface {
	pulumi.Input

	ToPagerDutyNotificationArrayOutput() PagerDutyNotificationArrayOutput
	ToPagerDutyNotificationArrayOutputWithContext(context.Context) PagerDutyNotificationArrayOutput
}

type PagerDutyNotificationArray []PagerDutyNotificationInput

func (PagerDutyNotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagerDutyNotification)(nil)).Elem()
}

func (i PagerDutyNotificationArray) ToPagerDutyNotificationArrayOutput() PagerDutyNotificationArrayOutput {
	return i.ToPagerDutyNotificationArrayOutputWithContext(context.Background())
}

func (i PagerDutyNotificationArray) ToPagerDutyNotificationArrayOutputWithContext(ctx context.Context) PagerDutyNotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerDutyNotificationArrayOutput)
}

// PagerDutyNotificationMapInput is an input type that accepts PagerDutyNotificationMap and PagerDutyNotificationMapOutput values.
// You can construct a concrete instance of `PagerDutyNotificationMapInput` via:
//
//	PagerDutyNotificationMap{ "key": PagerDutyNotificationArgs{...} }
type PagerDutyNotificationMapInput interface {
	pulumi.Input

	ToPagerDutyNotificationMapOutput() PagerDutyNotificationMapOutput
	ToPagerDutyNotificationMapOutputWithContext(context.Context) PagerDutyNotificationMapOutput
}

type PagerDutyNotificationMap map[string]PagerDutyNotificationInput

func (PagerDutyNotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagerDutyNotification)(nil)).Elem()
}

func (i PagerDutyNotificationMap) ToPagerDutyNotificationMapOutput() PagerDutyNotificationMapOutput {
	return i.ToPagerDutyNotificationMapOutputWithContext(context.Background())
}

func (i PagerDutyNotificationMap) ToPagerDutyNotificationMapOutputWithContext(ctx context.Context) PagerDutyNotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerDutyNotificationMapOutput)
}

type PagerDutyNotificationOutput struct{ *pulumi.OutputState }

func (PagerDutyNotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PagerDutyNotification)(nil)).Elem()
}

func (o PagerDutyNotificationOutput) ToPagerDutyNotificationOutput() PagerDutyNotificationOutput {
	return o
}

func (o PagerDutyNotificationOutput) ToPagerDutyNotificationOutputWithContext(ctx context.Context) PagerDutyNotificationOutput {
	return o
}

// The name of the PagerDuty account
func (o PagerDutyNotificationOutput) Account() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringOutput { return v.Account }).(pulumi.StringOutput)
}

// The configuration is enabled (`true`) or disabled (`false`)
func (o PagerDutyNotificationOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// The API key to access PagerDuty
func (o PagerDutyNotificationOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// The ID of these settings when referred to from resources requiring the REST API V1 keys
func (o PagerDutyNotificationOutput) LegacyId() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringOutput { return v.LegacyId }).(pulumi.StringOutput)
}

// The name of the notification configuration
func (o PagerDutyNotificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the associated alerting profile
func (o PagerDutyNotificationOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringOutput { return v.Profile }).(pulumi.StringOutput)
}

// The name of the PagerDuty Service
func (o PagerDutyNotificationOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerDutyNotification) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type PagerDutyNotificationArrayOutput struct{ *pulumi.OutputState }

func (PagerDutyNotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagerDutyNotification)(nil)).Elem()
}

func (o PagerDutyNotificationArrayOutput) ToPagerDutyNotificationArrayOutput() PagerDutyNotificationArrayOutput {
	return o
}

func (o PagerDutyNotificationArrayOutput) ToPagerDutyNotificationArrayOutputWithContext(ctx context.Context) PagerDutyNotificationArrayOutput {
	return o
}

func (o PagerDutyNotificationArrayOutput) Index(i pulumi.IntInput) PagerDutyNotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PagerDutyNotification {
		return vs[0].([]*PagerDutyNotification)[vs[1].(int)]
	}).(PagerDutyNotificationOutput)
}

type PagerDutyNotificationMapOutput struct{ *pulumi.OutputState }

func (PagerDutyNotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagerDutyNotification)(nil)).Elem()
}

func (o PagerDutyNotificationMapOutput) ToPagerDutyNotificationMapOutput() PagerDutyNotificationMapOutput {
	return o
}

func (o PagerDutyNotificationMapOutput) ToPagerDutyNotificationMapOutputWithContext(ctx context.Context) PagerDutyNotificationMapOutput {
	return o
}

func (o PagerDutyNotificationMapOutput) MapIndex(k pulumi.StringInput) PagerDutyNotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PagerDutyNotification {
		return vs[0].(map[string]*PagerDutyNotification)[vs[1].(string)]
	}).(PagerDutyNotificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PagerDutyNotificationInput)(nil)).Elem(), &PagerDutyNotification{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagerDutyNotificationArrayInput)(nil)).Elem(), PagerDutyNotificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagerDutyNotificationMapInput)(nil)).Elem(), PagerDutyNotificationMap{})
	pulumi.RegisterOutputType(PagerDutyNotificationOutput{})
	pulumi.RegisterOutputType(PagerDutyNotificationArrayOutput{})
	pulumi.RegisterOutputType(PagerDutyNotificationMapOutput{})
}
