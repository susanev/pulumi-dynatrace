// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type SpanEntryPoint struct {
	pulumi.CustomResourceState

	// Whether to create an entry point or not
	Action pulumi.StringOutput `pulumi:"action"`
	// Matching strategies for the Span
	Matches SpanEntryPointMatchesOutput `pulumi:"matches"`
	// The name of the rule
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewSpanEntryPoint registers a new resource with the given unique name, arguments, and options.
func NewSpanEntryPoint(ctx *pulumi.Context,
	name string, args *SpanEntryPointArgs, opts ...pulumi.ResourceOption) (*SpanEntryPoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Matches == nil {
		return nil, errors.New("invalid value for required argument 'Matches'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SpanEntryPoint
	err := ctx.RegisterResource("dynatrace:index/spanEntryPoint:SpanEntryPoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpanEntryPoint gets an existing SpanEntryPoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpanEntryPoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpanEntryPointState, opts ...pulumi.ResourceOption) (*SpanEntryPoint, error) {
	var resource SpanEntryPoint
	err := ctx.ReadResource("dynatrace:index/spanEntryPoint:SpanEntryPoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpanEntryPoint resources.
type spanEntryPointState struct {
	// Whether to create an entry point or not
	Action *string `pulumi:"action"`
	// Matching strategies for the Span
	Matches *SpanEntryPointMatches `pulumi:"matches"`
	// The name of the rule
	Name *string `pulumi:"name"`
}

type SpanEntryPointState struct {
	// Whether to create an entry point or not
	Action pulumi.StringPtrInput
	// Matching strategies for the Span
	Matches SpanEntryPointMatchesPtrInput
	// The name of the rule
	Name pulumi.StringPtrInput
}

func (SpanEntryPointState) ElementType() reflect.Type {
	return reflect.TypeOf((*spanEntryPointState)(nil)).Elem()
}

type spanEntryPointArgs struct {
	// Whether to create an entry point or not
	Action string `pulumi:"action"`
	// Matching strategies for the Span
	Matches SpanEntryPointMatches `pulumi:"matches"`
	// The name of the rule
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a SpanEntryPoint resource.
type SpanEntryPointArgs struct {
	// Whether to create an entry point or not
	Action pulumi.StringInput
	// Matching strategies for the Span
	Matches SpanEntryPointMatchesInput
	// The name of the rule
	Name pulumi.StringPtrInput
}

func (SpanEntryPointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spanEntryPointArgs)(nil)).Elem()
}

type SpanEntryPointInput interface {
	pulumi.Input

	ToSpanEntryPointOutput() SpanEntryPointOutput
	ToSpanEntryPointOutputWithContext(ctx context.Context) SpanEntryPointOutput
}

func (*SpanEntryPoint) ElementType() reflect.Type {
	return reflect.TypeOf((**SpanEntryPoint)(nil)).Elem()
}

func (i *SpanEntryPoint) ToSpanEntryPointOutput() SpanEntryPointOutput {
	return i.ToSpanEntryPointOutputWithContext(context.Background())
}

func (i *SpanEntryPoint) ToSpanEntryPointOutputWithContext(ctx context.Context) SpanEntryPointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanEntryPointOutput)
}

// SpanEntryPointArrayInput is an input type that accepts SpanEntryPointArray and SpanEntryPointArrayOutput values.
// You can construct a concrete instance of `SpanEntryPointArrayInput` via:
//
//	SpanEntryPointArray{ SpanEntryPointArgs{...} }
type SpanEntryPointArrayInput interface {
	pulumi.Input

	ToSpanEntryPointArrayOutput() SpanEntryPointArrayOutput
	ToSpanEntryPointArrayOutputWithContext(context.Context) SpanEntryPointArrayOutput
}

type SpanEntryPointArray []SpanEntryPointInput

func (SpanEntryPointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpanEntryPoint)(nil)).Elem()
}

func (i SpanEntryPointArray) ToSpanEntryPointArrayOutput() SpanEntryPointArrayOutput {
	return i.ToSpanEntryPointArrayOutputWithContext(context.Background())
}

func (i SpanEntryPointArray) ToSpanEntryPointArrayOutputWithContext(ctx context.Context) SpanEntryPointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanEntryPointArrayOutput)
}

// SpanEntryPointMapInput is an input type that accepts SpanEntryPointMap and SpanEntryPointMapOutput values.
// You can construct a concrete instance of `SpanEntryPointMapInput` via:
//
//	SpanEntryPointMap{ "key": SpanEntryPointArgs{...} }
type SpanEntryPointMapInput interface {
	pulumi.Input

	ToSpanEntryPointMapOutput() SpanEntryPointMapOutput
	ToSpanEntryPointMapOutputWithContext(context.Context) SpanEntryPointMapOutput
}

type SpanEntryPointMap map[string]SpanEntryPointInput

func (SpanEntryPointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpanEntryPoint)(nil)).Elem()
}

func (i SpanEntryPointMap) ToSpanEntryPointMapOutput() SpanEntryPointMapOutput {
	return i.ToSpanEntryPointMapOutputWithContext(context.Background())
}

func (i SpanEntryPointMap) ToSpanEntryPointMapOutputWithContext(ctx context.Context) SpanEntryPointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanEntryPointMapOutput)
}

type SpanEntryPointOutput struct{ *pulumi.OutputState }

func (SpanEntryPointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpanEntryPoint)(nil)).Elem()
}

func (o SpanEntryPointOutput) ToSpanEntryPointOutput() SpanEntryPointOutput {
	return o
}

func (o SpanEntryPointOutput) ToSpanEntryPointOutputWithContext(ctx context.Context) SpanEntryPointOutput {
	return o
}

// Whether to create an entry point or not
func (o SpanEntryPointOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *SpanEntryPoint) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// Matching strategies for the Span
func (o SpanEntryPointOutput) Matches() SpanEntryPointMatchesOutput {
	return o.ApplyT(func(v *SpanEntryPoint) SpanEntryPointMatchesOutput { return v.Matches }).(SpanEntryPointMatchesOutput)
}

// The name of the rule
func (o SpanEntryPointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SpanEntryPoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type SpanEntryPointArrayOutput struct{ *pulumi.OutputState }

func (SpanEntryPointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpanEntryPoint)(nil)).Elem()
}

func (o SpanEntryPointArrayOutput) ToSpanEntryPointArrayOutput() SpanEntryPointArrayOutput {
	return o
}

func (o SpanEntryPointArrayOutput) ToSpanEntryPointArrayOutputWithContext(ctx context.Context) SpanEntryPointArrayOutput {
	return o
}

func (o SpanEntryPointArrayOutput) Index(i pulumi.IntInput) SpanEntryPointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpanEntryPoint {
		return vs[0].([]*SpanEntryPoint)[vs[1].(int)]
	}).(SpanEntryPointOutput)
}

type SpanEntryPointMapOutput struct{ *pulumi.OutputState }

func (SpanEntryPointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpanEntryPoint)(nil)).Elem()
}

func (o SpanEntryPointMapOutput) ToSpanEntryPointMapOutput() SpanEntryPointMapOutput {
	return o
}

func (o SpanEntryPointMapOutput) ToSpanEntryPointMapOutputWithContext(ctx context.Context) SpanEntryPointMapOutput {
	return o
}

func (o SpanEntryPointMapOutput) MapIndex(k pulumi.StringInput) SpanEntryPointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpanEntryPoint {
		return vs[0].(map[string]*SpanEntryPoint)[vs[1].(string)]
	}).(SpanEntryPointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpanEntryPointInput)(nil)).Elem(), &SpanEntryPoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpanEntryPointArrayInput)(nil)).Elem(), SpanEntryPointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpanEntryPointMapInput)(nil)).Elem(), SpanEntryPointMap{})
	pulumi.RegisterOutputType(SpanEntryPointOutput{})
	pulumi.RegisterOutputType(SpanEntryPointArrayOutput{})
	pulumi.RegisterOutputType(SpanEntryPointMapOutput{})
}
