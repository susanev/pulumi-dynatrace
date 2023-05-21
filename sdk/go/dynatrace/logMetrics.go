// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type LogMetrics struct {
	pulumi.CustomResourceState

	// no documentation available
	Dimensions pulumi.StringArrayOutput `pulumi:"dimensions"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Metric key
	Key pulumi.StringOutput `pulumi:"key"`
	// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
	Measure pulumi.StringOutput `pulumi:"measure"`
	// Attribute
	MeasureAttribute pulumi.StringPtrOutput `pulumi:"measureAttribute"`
	// Matcher
	Query pulumi.StringOutput `pulumi:"query"`
}

// NewLogMetrics registers a new resource with the given unique name, arguments, and options.
func NewLogMetrics(ctx *pulumi.Context,
	name string, args *LogMetricsArgs, opts ...pulumi.ResourceOption) (*LogMetrics, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Measure == nil {
		return nil, errors.New("invalid value for required argument 'Measure'")
	}
	if args.Query == nil {
		return nil, errors.New("invalid value for required argument 'Query'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource LogMetrics
	err := ctx.RegisterResource("dynatrace:index/logMetrics:LogMetrics", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogMetrics gets an existing LogMetrics resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogMetrics(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogMetricsState, opts ...pulumi.ResourceOption) (*LogMetrics, error) {
	var resource LogMetrics
	err := ctx.ReadResource("dynatrace:index/logMetrics:LogMetrics", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogMetrics resources.
type logMetricsState struct {
	// no documentation available
	Dimensions []string `pulumi:"dimensions"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled *bool `pulumi:"enabled"`
	// Metric key
	Key *string `pulumi:"key"`
	// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
	Measure *string `pulumi:"measure"`
	// Attribute
	MeasureAttribute *string `pulumi:"measureAttribute"`
	// Matcher
	Query *string `pulumi:"query"`
}

type LogMetricsState struct {
	// no documentation available
	Dimensions pulumi.StringArrayInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolPtrInput
	// Metric key
	Key pulumi.StringPtrInput
	// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
	Measure pulumi.StringPtrInput
	// Attribute
	MeasureAttribute pulumi.StringPtrInput
	// Matcher
	Query pulumi.StringPtrInput
}

func (LogMetricsState) ElementType() reflect.Type {
	return reflect.TypeOf((*logMetricsState)(nil)).Elem()
}

type logMetricsArgs struct {
	// no documentation available
	Dimensions []string `pulumi:"dimensions"`
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled bool `pulumi:"enabled"`
	// Metric key
	Key string `pulumi:"key"`
	// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
	Measure string `pulumi:"measure"`
	// Attribute
	MeasureAttribute *string `pulumi:"measureAttribute"`
	// Matcher
	Query string `pulumi:"query"`
}

// The set of arguments for constructing a LogMetrics resource.
type LogMetricsArgs struct {
	// no documentation available
	Dimensions pulumi.StringArrayInput
	// This setting is enabled (`true`) or disabled (`false`)
	Enabled pulumi.BoolInput
	// Metric key
	Key pulumi.StringInput
	// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
	Measure pulumi.StringInput
	// Attribute
	MeasureAttribute pulumi.StringPtrInput
	// Matcher
	Query pulumi.StringInput
}

func (LogMetricsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logMetricsArgs)(nil)).Elem()
}

type LogMetricsInput interface {
	pulumi.Input

	ToLogMetricsOutput() LogMetricsOutput
	ToLogMetricsOutputWithContext(ctx context.Context) LogMetricsOutput
}

func (*LogMetrics) ElementType() reflect.Type {
	return reflect.TypeOf((**LogMetrics)(nil)).Elem()
}

func (i *LogMetrics) ToLogMetricsOutput() LogMetricsOutput {
	return i.ToLogMetricsOutputWithContext(context.Background())
}

func (i *LogMetrics) ToLogMetricsOutputWithContext(ctx context.Context) LogMetricsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogMetricsOutput)
}

// LogMetricsArrayInput is an input type that accepts LogMetricsArray and LogMetricsArrayOutput values.
// You can construct a concrete instance of `LogMetricsArrayInput` via:
//
//	LogMetricsArray{ LogMetricsArgs{...} }
type LogMetricsArrayInput interface {
	pulumi.Input

	ToLogMetricsArrayOutput() LogMetricsArrayOutput
	ToLogMetricsArrayOutputWithContext(context.Context) LogMetricsArrayOutput
}

type LogMetricsArray []LogMetricsInput

func (LogMetricsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogMetrics)(nil)).Elem()
}

func (i LogMetricsArray) ToLogMetricsArrayOutput() LogMetricsArrayOutput {
	return i.ToLogMetricsArrayOutputWithContext(context.Background())
}

func (i LogMetricsArray) ToLogMetricsArrayOutputWithContext(ctx context.Context) LogMetricsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogMetricsArrayOutput)
}

// LogMetricsMapInput is an input type that accepts LogMetricsMap and LogMetricsMapOutput values.
// You can construct a concrete instance of `LogMetricsMapInput` via:
//
//	LogMetricsMap{ "key": LogMetricsArgs{...} }
type LogMetricsMapInput interface {
	pulumi.Input

	ToLogMetricsMapOutput() LogMetricsMapOutput
	ToLogMetricsMapOutputWithContext(context.Context) LogMetricsMapOutput
}

type LogMetricsMap map[string]LogMetricsInput

func (LogMetricsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogMetrics)(nil)).Elem()
}

func (i LogMetricsMap) ToLogMetricsMapOutput() LogMetricsMapOutput {
	return i.ToLogMetricsMapOutputWithContext(context.Background())
}

func (i LogMetricsMap) ToLogMetricsMapOutputWithContext(ctx context.Context) LogMetricsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogMetricsMapOutput)
}

type LogMetricsOutput struct{ *pulumi.OutputState }

func (LogMetricsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogMetrics)(nil)).Elem()
}

func (o LogMetricsOutput) ToLogMetricsOutput() LogMetricsOutput {
	return o
}

func (o LogMetricsOutput) ToLogMetricsOutputWithContext(ctx context.Context) LogMetricsOutput {
	return o
}

// no documentation available
func (o LogMetricsOutput) Dimensions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.StringArrayOutput { return v.Dimensions }).(pulumi.StringArrayOutput)
}

// This setting is enabled (`true`) or disabled (`false`)
func (o LogMetricsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Metric key
func (o LogMetricsOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Possible Values: `OCCURRENCE`, `ATTRIBUTE`
func (o LogMetricsOutput) Measure() pulumi.StringOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.StringOutput { return v.Measure }).(pulumi.StringOutput)
}

// Attribute
func (o LogMetricsOutput) MeasureAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.StringPtrOutput { return v.MeasureAttribute }).(pulumi.StringPtrOutput)
}

// Matcher
func (o LogMetricsOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v *LogMetrics) pulumi.StringOutput { return v.Query }).(pulumi.StringOutput)
}

type LogMetricsArrayOutput struct{ *pulumi.OutputState }

func (LogMetricsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogMetrics)(nil)).Elem()
}

func (o LogMetricsArrayOutput) ToLogMetricsArrayOutput() LogMetricsArrayOutput {
	return o
}

func (o LogMetricsArrayOutput) ToLogMetricsArrayOutputWithContext(ctx context.Context) LogMetricsArrayOutput {
	return o
}

func (o LogMetricsArrayOutput) Index(i pulumi.IntInput) LogMetricsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogMetrics {
		return vs[0].([]*LogMetrics)[vs[1].(int)]
	}).(LogMetricsOutput)
}

type LogMetricsMapOutput struct{ *pulumi.OutputState }

func (LogMetricsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogMetrics)(nil)).Elem()
}

func (o LogMetricsMapOutput) ToLogMetricsMapOutput() LogMetricsMapOutput {
	return o
}

func (o LogMetricsMapOutput) ToLogMetricsMapOutputWithContext(ctx context.Context) LogMetricsMapOutput {
	return o
}

func (o LogMetricsMapOutput) MapIndex(k pulumi.StringInput) LogMetricsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogMetrics {
		return vs[0].(map[string]*LogMetrics)[vs[1].(string)]
	}).(LogMetricsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogMetricsInput)(nil)).Elem(), &LogMetrics{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogMetricsArrayInput)(nil)).Elem(), LogMetricsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogMetricsMapInput)(nil)).Elem(), LogMetricsMap{})
	pulumi.RegisterOutputType(LogMetricsOutput{})
	pulumi.RegisterOutputType(LogMetricsArrayOutput{})
	pulumi.RegisterOutputType(LogMetricsMapOutput{})
}
