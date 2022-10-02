// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The AWS IAM external data source allows the AWS IAM external ID to be retrieved.
func GetAwsIamExternal(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAwsIamExternalResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetAwsIamExternalResult
	err := ctx.Invoke("dynatrace:index/getAwsIamExternal:getAwsIamExternal", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAwsIamExternal.
type GetAwsIamExternalResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
