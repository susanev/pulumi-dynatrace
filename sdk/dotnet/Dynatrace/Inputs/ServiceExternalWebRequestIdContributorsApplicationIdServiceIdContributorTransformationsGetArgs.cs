// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("transformations", required: true)]
        private InputList<Inputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs>? _transformations;
        public InputList<Inputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs> Transformations
        {
            get => _transformations ?? (_transformations = new InputList<Inputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs>());
            set => _transformations = value;
        }

        public ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs()
        {
        }
        public static new ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs Empty => new ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsGetArgs();
    }
}
