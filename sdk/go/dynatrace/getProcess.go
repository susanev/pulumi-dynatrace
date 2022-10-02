// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The process data source allows the process ID to be retrieved by its name and optionally tags / tag-value pairs.
//
// - `name` queries for all processes with the specified name
// - `tags` (optional) refers to the tags that need to be present for the process (inclusive)
//
// If multiple processes match the given criteria, the first result will be retrieved.
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
//			test, err := dynatrace.GetProcess(ctx, &GetProcessArgs{
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
//						Selector: pulumi.String(fmt.Sprintf("type(\"process_group_instance\"),entityId(\"%v\")", test.Id)),
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
func GetProcess(ctx *pulumi.Context, args *GetProcessArgs, opts ...pulumi.InvokeOption) (*GetProcessResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetProcessResult
	err := ctx.Invoke("dynatrace:index/getProcess:getProcess", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getProcess.
type GetProcessArgs struct {
	Name string `pulumi:"name"`
	// Required tags of the process to find
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getProcess.
type GetProcessResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Required tags of the process to find
	Tags []string `pulumi:"tags"`
}

func GetProcessOutput(ctx *pulumi.Context, args GetProcessOutputArgs, opts ...pulumi.InvokeOption) GetProcessResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetProcessResult, error) {
			args := v.(GetProcessArgs)
			r, err := GetProcess(ctx, &args, opts...)
			var s GetProcessResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetProcessResultOutput)
}

// A collection of arguments for invoking getProcess.
type GetProcessOutputArgs struct {
	Name pulumi.StringInput `pulumi:"name"`
	// Required tags of the process to find
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (GetProcessOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProcessArgs)(nil)).Elem()
}

// A collection of values returned by getProcess.
type GetProcessResultOutput struct{ *pulumi.OutputState }

func (GetProcessResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProcessResult)(nil)).Elem()
}

func (o GetProcessResultOutput) ToGetProcessResultOutput() GetProcessResultOutput {
	return o
}

func (o GetProcessResultOutput) ToGetProcessResultOutputWithContext(ctx context.Context) GetProcessResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetProcessResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProcessResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetProcessResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetProcessResult) string { return v.Name }).(pulumi.StringOutput)
}

// Required tags of the process to find
func (o GetProcessResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProcessResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProcessResultOutput{})
}
