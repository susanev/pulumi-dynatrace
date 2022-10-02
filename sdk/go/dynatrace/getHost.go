// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The host data source allows the host ID to be retrieved by its name and optionally tags / tag-value pairs.
//
// - `name` queries for all hosts with the specified name
// - `tags` (optional) refers to the tags that need to be present for the host (inclusive)
//
// If multiple hosts match the given criteria, the first result will be retrieved.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-dynatrace/sdk/go/dynatrace"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := dynatrace.GetHost(ctx, &GetHostArgs{
//				Name: "Example",
//				Tags: []string{
//					"TerraformKeyTest",
//					"TerraformKeyValueTest=TestValue",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = dynatrace.NewManagementZone(ctx, "#name#", &dynatrace.ManagementZoneArgs{
//				EntitySelectorBasedRules: ManagementZoneEntitySelectorBasedRuleArray{
//					&ManagementZoneEntitySelectorBasedRuleArgs{
//						Enabled:  pulumi.Bool(true),
//						Selector: pulumi.String(fmt.Sprintf("type(\"host\"),entityId(\"%v\")", test.Id)),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetHost(ctx *pulumi.Context, args *GetHostArgs, opts ...pulumi.InvokeOption) (*GetHostResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetHostResult
	err := ctx.Invoke("dynatrace:index/getHost:getHost", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHost.
type GetHostArgs struct {
	Name string `pulumi:"name"`
	// Required tags of the host to find
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getHost.
type GetHostResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Required tags of the host to find
	Tags []string `pulumi:"tags"`
}

func GetHostOutput(ctx *pulumi.Context, args GetHostOutputArgs, opts ...pulumi.InvokeOption) GetHostResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHostResult, error) {
			args := v.(GetHostArgs)
			r, err := GetHost(ctx, &args, opts...)
			var s GetHostResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHostResultOutput)
}

// A collection of arguments for invoking getHost.
type GetHostOutputArgs struct {
	Name pulumi.StringInput `pulumi:"name"`
	// Required tags of the host to find
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (GetHostOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostArgs)(nil)).Elem()
}

// A collection of values returned by getHost.
type GetHostResultOutput struct{ *pulumi.OutputState }

func (GetHostResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostResult)(nil)).Elem()
}

func (o GetHostResultOutput) ToGetHostResultOutput() GetHostResultOutput {
	return o
}

func (o GetHostResultOutput) ToGetHostResultOutputWithContext(ctx context.Context) GetHostResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostResult) string { return v.Name }).(pulumi.StringOutput)
}

// Required tags of the host to find
func (o GetHostResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostResultOutput{})
}
