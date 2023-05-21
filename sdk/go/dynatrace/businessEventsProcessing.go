// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type BusinessEventsProcessing struct {
	pulumi.CustomResourceState

	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// [See our documentation](https://dt-url.net/bp234rv)
	Matcher pulumi.StringOutput `pulumi:"matcher"`
	// Rule name
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// ## Rule testing ### 1. Paste an event sample
	RuleTesting BusinessEventsProcessingRuleTestingOutput `pulumi:"ruleTesting"`
	// [See our documentation](https://dt-url.net/pz030w5)
	Script pulumi.StringOutput `pulumi:"script"`
	// Transformation fields
	TransformationFields BusinessEventsProcessingTransformationFieldsPtrOutput `pulumi:"transformationFields"`
}

// NewBusinessEventsProcessing registers a new resource with the given unique name, arguments, and options.
func NewBusinessEventsProcessing(ctx *pulumi.Context,
	name string, args *BusinessEventsProcessingArgs, opts ...pulumi.ResourceOption) (*BusinessEventsProcessing, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Matcher == nil {
		return nil, errors.New("invalid value for required argument 'Matcher'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	if args.RuleTesting == nil {
		return nil, errors.New("invalid value for required argument 'RuleTesting'")
	}
	if args.Script == nil {
		return nil, errors.New("invalid value for required argument 'Script'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource BusinessEventsProcessing
	err := ctx.RegisterResource("dynatrace:index/businessEventsProcessing:BusinessEventsProcessing", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBusinessEventsProcessing gets an existing BusinessEventsProcessing resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBusinessEventsProcessing(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BusinessEventsProcessingState, opts ...pulumi.ResourceOption) (*BusinessEventsProcessing, error) {
	var resource BusinessEventsProcessing
	err := ctx.ReadResource("dynatrace:index/businessEventsProcessing:BusinessEventsProcessing", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BusinessEventsProcessing resources.
type businessEventsProcessingState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// [See our documentation](https://dt-url.net/bp234rv)
	Matcher *string `pulumi:"matcher"`
	// Rule name
	RuleName *string `pulumi:"ruleName"`
	// ## Rule testing ### 1. Paste an event sample
	RuleTesting *BusinessEventsProcessingRuleTesting `pulumi:"ruleTesting"`
	// [See our documentation](https://dt-url.net/pz030w5)
	Script *string `pulumi:"script"`
	// Transformation fields
	TransformationFields *BusinessEventsProcessingTransformationFields `pulumi:"transformationFields"`
}

type BusinessEventsProcessingState struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// [See our documentation](https://dt-url.net/bp234rv)
	Matcher pulumi.StringPtrInput
	// Rule name
	RuleName pulumi.StringPtrInput
	// ## Rule testing ### 1. Paste an event sample
	RuleTesting BusinessEventsProcessingRuleTestingPtrInput
	// [See our documentation](https://dt-url.net/pz030w5)
	Script pulumi.StringPtrInput
	// Transformation fields
	TransformationFields BusinessEventsProcessingTransformationFieldsPtrInput
}

func (BusinessEventsProcessingState) ElementType() reflect.Type {
	return reflect.TypeOf((*businessEventsProcessingState)(nil)).Elem()
}

type businessEventsProcessingArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// [See our documentation](https://dt-url.net/bp234rv)
	Matcher string `pulumi:"matcher"`
	// Rule name
	RuleName string `pulumi:"ruleName"`
	// ## Rule testing ### 1. Paste an event sample
	RuleTesting BusinessEventsProcessingRuleTesting `pulumi:"ruleTesting"`
	// [See our documentation](https://dt-url.net/pz030w5)
	Script string `pulumi:"script"`
	// Transformation fields
	TransformationFields *BusinessEventsProcessingTransformationFields `pulumi:"transformationFields"`
}

// The set of arguments for constructing a BusinessEventsProcessing resource.
type BusinessEventsProcessingArgs struct {
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// [See our documentation](https://dt-url.net/bp234rv)
	Matcher pulumi.StringInput
	// Rule name
	RuleName pulumi.StringInput
	// ## Rule testing ### 1. Paste an event sample
	RuleTesting BusinessEventsProcessingRuleTestingInput
	// [See our documentation](https://dt-url.net/pz030w5)
	Script pulumi.StringInput
	// Transformation fields
	TransformationFields BusinessEventsProcessingTransformationFieldsPtrInput
}

func (BusinessEventsProcessingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*businessEventsProcessingArgs)(nil)).Elem()
}

type BusinessEventsProcessingInput interface {
	pulumi.Input

	ToBusinessEventsProcessingOutput() BusinessEventsProcessingOutput
	ToBusinessEventsProcessingOutputWithContext(ctx context.Context) BusinessEventsProcessingOutput
}

func (*BusinessEventsProcessing) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessEventsProcessing)(nil)).Elem()
}

func (i *BusinessEventsProcessing) ToBusinessEventsProcessingOutput() BusinessEventsProcessingOutput {
	return i.ToBusinessEventsProcessingOutputWithContext(context.Background())
}

func (i *BusinessEventsProcessing) ToBusinessEventsProcessingOutputWithContext(ctx context.Context) BusinessEventsProcessingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsProcessingOutput)
}

// BusinessEventsProcessingArrayInput is an input type that accepts BusinessEventsProcessingArray and BusinessEventsProcessingArrayOutput values.
// You can construct a concrete instance of `BusinessEventsProcessingArrayInput` via:
//
//	BusinessEventsProcessingArray{ BusinessEventsProcessingArgs{...} }
type BusinessEventsProcessingArrayInput interface {
	pulumi.Input

	ToBusinessEventsProcessingArrayOutput() BusinessEventsProcessingArrayOutput
	ToBusinessEventsProcessingArrayOutputWithContext(context.Context) BusinessEventsProcessingArrayOutput
}

type BusinessEventsProcessingArray []BusinessEventsProcessingInput

func (BusinessEventsProcessingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessEventsProcessing)(nil)).Elem()
}

func (i BusinessEventsProcessingArray) ToBusinessEventsProcessingArrayOutput() BusinessEventsProcessingArrayOutput {
	return i.ToBusinessEventsProcessingArrayOutputWithContext(context.Background())
}

func (i BusinessEventsProcessingArray) ToBusinessEventsProcessingArrayOutputWithContext(ctx context.Context) BusinessEventsProcessingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsProcessingArrayOutput)
}

// BusinessEventsProcessingMapInput is an input type that accepts BusinessEventsProcessingMap and BusinessEventsProcessingMapOutput values.
// You can construct a concrete instance of `BusinessEventsProcessingMapInput` via:
//
//	BusinessEventsProcessingMap{ "key": BusinessEventsProcessingArgs{...} }
type BusinessEventsProcessingMapInput interface {
	pulumi.Input

	ToBusinessEventsProcessingMapOutput() BusinessEventsProcessingMapOutput
	ToBusinessEventsProcessingMapOutputWithContext(context.Context) BusinessEventsProcessingMapOutput
}

type BusinessEventsProcessingMap map[string]BusinessEventsProcessingInput

func (BusinessEventsProcessingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessEventsProcessing)(nil)).Elem()
}

func (i BusinessEventsProcessingMap) ToBusinessEventsProcessingMapOutput() BusinessEventsProcessingMapOutput {
	return i.ToBusinessEventsProcessingMapOutputWithContext(context.Background())
}

func (i BusinessEventsProcessingMap) ToBusinessEventsProcessingMapOutputWithContext(ctx context.Context) BusinessEventsProcessingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessEventsProcessingMapOutput)
}

type BusinessEventsProcessingOutput struct{ *pulumi.OutputState }

func (BusinessEventsProcessingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessEventsProcessing)(nil)).Elem()
}

func (o BusinessEventsProcessingOutput) ToBusinessEventsProcessingOutput() BusinessEventsProcessingOutput {
	return o
}

func (o BusinessEventsProcessingOutput) ToBusinessEventsProcessingOutputWithContext(ctx context.Context) BusinessEventsProcessingOutput {
	return o
}

// This setting is enabled (`true`) or disabled (`false`)
func (o BusinessEventsProcessingOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// [See our documentation](https://dt-url.net/bp234rv)
func (o BusinessEventsProcessingOutput) Matcher() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) pulumi.StringOutput { return v.Matcher }).(pulumi.StringOutput)
}

// Rule name
func (o BusinessEventsProcessingOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

// ## Rule testing ### 1. Paste an event sample
func (o BusinessEventsProcessingOutput) RuleTesting() BusinessEventsProcessingRuleTestingOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) BusinessEventsProcessingRuleTestingOutput { return v.RuleTesting }).(BusinessEventsProcessingRuleTestingOutput)
}

// [See our documentation](https://dt-url.net/pz030w5)
func (o BusinessEventsProcessingOutput) Script() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) pulumi.StringOutput { return v.Script }).(pulumi.StringOutput)
}

// Transformation fields
func (o BusinessEventsProcessingOutput) TransformationFields() BusinessEventsProcessingTransformationFieldsPtrOutput {
	return o.ApplyT(func(v *BusinessEventsProcessing) BusinessEventsProcessingTransformationFieldsPtrOutput {
		return v.TransformationFields
	}).(BusinessEventsProcessingTransformationFieldsPtrOutput)
}

type BusinessEventsProcessingArrayOutput struct{ *pulumi.OutputState }

func (BusinessEventsProcessingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessEventsProcessing)(nil)).Elem()
}

func (o BusinessEventsProcessingArrayOutput) ToBusinessEventsProcessingArrayOutput() BusinessEventsProcessingArrayOutput {
	return o
}

func (o BusinessEventsProcessingArrayOutput) ToBusinessEventsProcessingArrayOutputWithContext(ctx context.Context) BusinessEventsProcessingArrayOutput {
	return o
}

func (o BusinessEventsProcessingArrayOutput) Index(i pulumi.IntInput) BusinessEventsProcessingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BusinessEventsProcessing {
		return vs[0].([]*BusinessEventsProcessing)[vs[1].(int)]
	}).(BusinessEventsProcessingOutput)
}

type BusinessEventsProcessingMapOutput struct{ *pulumi.OutputState }

func (BusinessEventsProcessingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessEventsProcessing)(nil)).Elem()
}

func (o BusinessEventsProcessingMapOutput) ToBusinessEventsProcessingMapOutput() BusinessEventsProcessingMapOutput {
	return o
}

func (o BusinessEventsProcessingMapOutput) ToBusinessEventsProcessingMapOutputWithContext(ctx context.Context) BusinessEventsProcessingMapOutput {
	return o
}

func (o BusinessEventsProcessingMapOutput) MapIndex(k pulumi.StringInput) BusinessEventsProcessingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BusinessEventsProcessing {
		return vs[0].(map[string]*BusinessEventsProcessing)[vs[1].(string)]
	}).(BusinessEventsProcessingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsProcessingInput)(nil)).Elem(), &BusinessEventsProcessing{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsProcessingArrayInput)(nil)).Elem(), BusinessEventsProcessingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessEventsProcessingMapInput)(nil)).Elem(), BusinessEventsProcessingMap{})
	pulumi.RegisterOutputType(BusinessEventsProcessingOutput{})
	pulumi.RegisterOutputType(BusinessEventsProcessingArrayOutput{})
	pulumi.RegisterOutputType(BusinessEventsProcessingMapOutput{})
}
