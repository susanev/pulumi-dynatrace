// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type CloudappWorkloaddetection struct {
	pulumi.CustomResourceState

	// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
	// Foundry application. * Container resource metrics (Container group instance entities) and [related
	// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	CloudFoundry CloudappWorkloaddetectionCloudFoundryOutput `pulumi:"cloudFoundry"`
	// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	Docker CloudappWorkloaddetectionDockerOutput `pulumi:"docker"`
	// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
	// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
	// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
	// workloads.
	Kubernetes CloudappWorkloaddetectionKubernetesOutput `pulumi:"kubernetes"`
}

// NewCloudappWorkloaddetection registers a new resource with the given unique name, arguments, and options.
func NewCloudappWorkloaddetection(ctx *pulumi.Context,
	name string, args *CloudappWorkloaddetectionArgs, opts ...pulumi.ResourceOption) (*CloudappWorkloaddetection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudFoundry == nil {
		return nil, errors.New("invalid value for required argument 'CloudFoundry'")
	}
	if args.Docker == nil {
		return nil, errors.New("invalid value for required argument 'Docker'")
	}
	if args.Kubernetes == nil {
		return nil, errors.New("invalid value for required argument 'Kubernetes'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource CloudappWorkloaddetection
	err := ctx.RegisterResource("dynatrace:index/cloudappWorkloaddetection:CloudappWorkloaddetection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudappWorkloaddetection gets an existing CloudappWorkloaddetection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudappWorkloaddetection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudappWorkloaddetectionState, opts ...pulumi.ResourceOption) (*CloudappWorkloaddetection, error) {
	var resource CloudappWorkloaddetection
	err := ctx.ReadResource("dynatrace:index/cloudappWorkloaddetection:CloudappWorkloaddetection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudappWorkloaddetection resources.
type cloudappWorkloaddetectionState struct {
	// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
	// Foundry application. * Container resource metrics (Container group instance entities) and [related
	// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	CloudFoundry *CloudappWorkloaddetectionCloudFoundry `pulumi:"cloudFoundry"`
	// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	Docker *CloudappWorkloaddetectionDocker `pulumi:"docker"`
	// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
	// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
	// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
	// workloads.
	Kubernetes *CloudappWorkloaddetectionKubernetes `pulumi:"kubernetes"`
}

type CloudappWorkloaddetectionState struct {
	// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
	// Foundry application. * Container resource metrics (Container group instance entities) and [related
	// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	CloudFoundry CloudappWorkloaddetectionCloudFoundryPtrInput
	// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	Docker CloudappWorkloaddetectionDockerPtrInput
	// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
	// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
	// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
	// workloads.
	Kubernetes CloudappWorkloaddetectionKubernetesPtrInput
}

func (CloudappWorkloaddetectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudappWorkloaddetectionState)(nil)).Elem()
}

type cloudappWorkloaddetectionArgs struct {
	// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
	// Foundry application. * Container resource metrics (Container group instance entities) and [related
	// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	CloudFoundry CloudappWorkloaddetectionCloudFoundry `pulumi:"cloudFoundry"`
	// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	Docker CloudappWorkloaddetectionDocker `pulumi:"docker"`
	// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
	// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
	// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
	// workloads.
	Kubernetes CloudappWorkloaddetectionKubernetes `pulumi:"kubernetes"`
}

// The set of arguments for constructing a CloudappWorkloaddetection resource.
type CloudappWorkloaddetectionArgs struct {
	// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
	// Foundry application. * Container resource metrics (Container group instance entities) and [related
	// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	CloudFoundry CloudappWorkloaddetectionCloudFoundryInput
	// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
	Docker CloudappWorkloaddetectionDockerInput
	// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
	// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
	// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
	// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
	// workloads.
	Kubernetes CloudappWorkloaddetectionKubernetesInput
}

func (CloudappWorkloaddetectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudappWorkloaddetectionArgs)(nil)).Elem()
}

type CloudappWorkloaddetectionInput interface {
	pulumi.Input

	ToCloudappWorkloaddetectionOutput() CloudappWorkloaddetectionOutput
	ToCloudappWorkloaddetectionOutputWithContext(ctx context.Context) CloudappWorkloaddetectionOutput
}

func (*CloudappWorkloaddetection) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudappWorkloaddetection)(nil)).Elem()
}

func (i *CloudappWorkloaddetection) ToCloudappWorkloaddetectionOutput() CloudappWorkloaddetectionOutput {
	return i.ToCloudappWorkloaddetectionOutputWithContext(context.Background())
}

func (i *CloudappWorkloaddetection) ToCloudappWorkloaddetectionOutputWithContext(ctx context.Context) CloudappWorkloaddetectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudappWorkloaddetectionOutput)
}

// CloudappWorkloaddetectionArrayInput is an input type that accepts CloudappWorkloaddetectionArray and CloudappWorkloaddetectionArrayOutput values.
// You can construct a concrete instance of `CloudappWorkloaddetectionArrayInput` via:
//
//	CloudappWorkloaddetectionArray{ CloudappWorkloaddetectionArgs{...} }
type CloudappWorkloaddetectionArrayInput interface {
	pulumi.Input

	ToCloudappWorkloaddetectionArrayOutput() CloudappWorkloaddetectionArrayOutput
	ToCloudappWorkloaddetectionArrayOutputWithContext(context.Context) CloudappWorkloaddetectionArrayOutput
}

type CloudappWorkloaddetectionArray []CloudappWorkloaddetectionInput

func (CloudappWorkloaddetectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudappWorkloaddetection)(nil)).Elem()
}

func (i CloudappWorkloaddetectionArray) ToCloudappWorkloaddetectionArrayOutput() CloudappWorkloaddetectionArrayOutput {
	return i.ToCloudappWorkloaddetectionArrayOutputWithContext(context.Background())
}

func (i CloudappWorkloaddetectionArray) ToCloudappWorkloaddetectionArrayOutputWithContext(ctx context.Context) CloudappWorkloaddetectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudappWorkloaddetectionArrayOutput)
}

// CloudappWorkloaddetectionMapInput is an input type that accepts CloudappWorkloaddetectionMap and CloudappWorkloaddetectionMapOutput values.
// You can construct a concrete instance of `CloudappWorkloaddetectionMapInput` via:
//
//	CloudappWorkloaddetectionMap{ "key": CloudappWorkloaddetectionArgs{...} }
type CloudappWorkloaddetectionMapInput interface {
	pulumi.Input

	ToCloudappWorkloaddetectionMapOutput() CloudappWorkloaddetectionMapOutput
	ToCloudappWorkloaddetectionMapOutputWithContext(context.Context) CloudappWorkloaddetectionMapOutput
}

type CloudappWorkloaddetectionMap map[string]CloudappWorkloaddetectionInput

func (CloudappWorkloaddetectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudappWorkloaddetection)(nil)).Elem()
}

func (i CloudappWorkloaddetectionMap) ToCloudappWorkloaddetectionMapOutput() CloudappWorkloaddetectionMapOutput {
	return i.ToCloudappWorkloaddetectionMapOutputWithContext(context.Background())
}

func (i CloudappWorkloaddetectionMap) ToCloudappWorkloaddetectionMapOutputWithContext(ctx context.Context) CloudappWorkloaddetectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudappWorkloaddetectionMapOutput)
}

type CloudappWorkloaddetectionOutput struct{ *pulumi.OutputState }

func (CloudappWorkloaddetectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudappWorkloaddetection)(nil)).Elem()
}

func (o CloudappWorkloaddetectionOutput) ToCloudappWorkloaddetectionOutput() CloudappWorkloaddetectionOutput {
	return o
}

func (o CloudappWorkloaddetectionOutput) ToCloudappWorkloaddetectionOutputWithContext(ctx context.Context) CloudappWorkloaddetectionOutput {
	return o
}

// Enable this setting to get * Processes of Cloud Foundry application instances merged into process groups by Cloud
// Foundry application. * Container resource metrics (Container group instance entities) and [related
// screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
func (o CloudappWorkloaddetectionOutput) CloudFoundry() CloudappWorkloaddetectionCloudFoundryOutput {
	return o.ApplyT(func(v *CloudappWorkloaddetection) CloudappWorkloaddetectionCloudFoundryOutput { return v.CloudFoundry }).(CloudappWorkloaddetectionCloudFoundryOutput)
}

// Enable this setting for plain Docker environments to get * Container resource metrics (Container group instance
// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups).
func (o CloudappWorkloaddetectionOutput) Docker() CloudappWorkloaddetectionDockerOutput {
	return o.ApplyT(func(v *CloudappWorkloaddetection) CloudappWorkloaddetectionDockerOutput { return v.Docker }).(CloudappWorkloaddetectionDockerOutput)
}

// Enable this setting to get * Insights into your Kubernetes namespaces, workloads and pods (cloud application namespace,
// cloud application and cloud application instance and entities). * Container resource metrics (container group instance
// entities) and [related screens](https://www.dynatrace.com/support/help/shortlink/container-groups). * Similar workloads
// merged into process groups based on defined rules (see below). * Version detection for services that run in Kubernetes
// workloads.
func (o CloudappWorkloaddetectionOutput) Kubernetes() CloudappWorkloaddetectionKubernetesOutput {
	return o.ApplyT(func(v *CloudappWorkloaddetection) CloudappWorkloaddetectionKubernetesOutput { return v.Kubernetes }).(CloudappWorkloaddetectionKubernetesOutput)
}

type CloudappWorkloaddetectionArrayOutput struct{ *pulumi.OutputState }

func (CloudappWorkloaddetectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudappWorkloaddetection)(nil)).Elem()
}

func (o CloudappWorkloaddetectionArrayOutput) ToCloudappWorkloaddetectionArrayOutput() CloudappWorkloaddetectionArrayOutput {
	return o
}

func (o CloudappWorkloaddetectionArrayOutput) ToCloudappWorkloaddetectionArrayOutputWithContext(ctx context.Context) CloudappWorkloaddetectionArrayOutput {
	return o
}

func (o CloudappWorkloaddetectionArrayOutput) Index(i pulumi.IntInput) CloudappWorkloaddetectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudappWorkloaddetection {
		return vs[0].([]*CloudappWorkloaddetection)[vs[1].(int)]
	}).(CloudappWorkloaddetectionOutput)
}

type CloudappWorkloaddetectionMapOutput struct{ *pulumi.OutputState }

func (CloudappWorkloaddetectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudappWorkloaddetection)(nil)).Elem()
}

func (o CloudappWorkloaddetectionMapOutput) ToCloudappWorkloaddetectionMapOutput() CloudappWorkloaddetectionMapOutput {
	return o
}

func (o CloudappWorkloaddetectionMapOutput) ToCloudappWorkloaddetectionMapOutputWithContext(ctx context.Context) CloudappWorkloaddetectionMapOutput {
	return o
}

func (o CloudappWorkloaddetectionMapOutput) MapIndex(k pulumi.StringInput) CloudappWorkloaddetectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudappWorkloaddetection {
		return vs[0].(map[string]*CloudappWorkloaddetection)[vs[1].(string)]
	}).(CloudappWorkloaddetectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudappWorkloaddetectionInput)(nil)).Elem(), &CloudappWorkloaddetection{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudappWorkloaddetectionArrayInput)(nil)).Elem(), CloudappWorkloaddetectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudappWorkloaddetectionMapInput)(nil)).Elem(), CloudappWorkloaddetectionMap{})
	pulumi.RegisterOutputType(CloudappWorkloaddetectionOutput{})
	pulumi.RegisterOutputType(CloudappWorkloaddetectionArrayOutput{})
	pulumi.RegisterOutputType(CloudappWorkloaddetectionMapOutput{})
}
