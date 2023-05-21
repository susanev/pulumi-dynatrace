// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/credentials:Credentials")]
    public partial class Credentials : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The certificate in the string format.
        /// </summary>
        [Output("certificate")]
        public Output<string?> Certificate { get; private set; } = null!;

        /// <summary>
        /// The list contains summary data related to the use of credentials
        /// </summary>
        [Output("credentialUsageSummaries")]
        public Output<ImmutableArray<Outputs.CredentialsCredentialUsageSummary>> CredentialUsageSummaries { get; private set; } = null!;

        /// <summary>
        /// A short description of the credentials set
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// External Vault Configuration
        /// </summary>
        [Output("external")]
        public Output<Outputs.CredentialsExternal?> External { get; private set; } = null!;

        /// <summary>
        /// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
        /// </summary>
        [Output("format")]
        public Output<string?> Format { get; private set; } = null!;

        /// <summary>
        /// The name of the credentials set
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The credentials set is available to every user (`false`) or to owner only (`true`)
        /// </summary>
        [Output("ownerAccessOnly")]
        public Output<bool?> OwnerAccessOnly { get; private set; } = null!;

        /// <summary>
        /// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
        /// you want to set an empty password, use the value `--empty--`.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
        /// </summary>
        [Output("public")]
        public Output<bool?> Public { get; private set; } = null!;

        /// <summary>
        /// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;

        /// <summary>
        /// Token in the string format. Specifying a token implies `Token Authentication`.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;

        /// <summary>
        /// The username of the credentials set.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Credentials resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Credentials(string name, CredentialsArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/credentials:Credentials", name, args ?? new CredentialsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Credentials(string name, Input<string> id, CredentialsState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/credentials:Credentials", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
                AdditionalSecretOutputs =
                {
                    "password",
                    "token",
                    "username",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Credentials resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Credentials Get(string name, Input<string> id, CredentialsState? state = null, CustomResourceOptions? options = null)
        {
            return new Credentials(name, id, state, options);
        }
    }

    public sealed class CredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate in the string format.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("credentialUsageSummaries")]
        private InputList<Inputs.CredentialsCredentialUsageSummaryArgs>? _credentialUsageSummaries;

        /// <summary>
        /// The list contains summary data related to the use of credentials
        /// </summary>
        [Obsolete(@"`credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data")]
        public InputList<Inputs.CredentialsCredentialUsageSummaryArgs> CredentialUsageSummaries
        {
            get => _credentialUsageSummaries ?? (_credentialUsageSummaries = new InputList<Inputs.CredentialsCredentialUsageSummaryArgs>());
            set => _credentialUsageSummaries = value;
        }

        /// <summary>
        /// A short description of the credentials set
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External Vault Configuration
        /// </summary>
        [Input("external")]
        public Input<Inputs.CredentialsExternalArgs>? External { get; set; }

        /// <summary>
        /// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The name of the credentials set
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The credentials set is available to every user (`false`) or to owner only (`true`)
        /// </summary>
        [Input("ownerAccessOnly")]
        public Input<bool>? OwnerAccessOnly { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
        /// you want to set an empty password, use the value `--empty--`.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Token in the string format. Specifying a token implies `Token Authentication`.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("username")]
        private Input<string>? _username;

        /// <summary>
        /// The username of the credentials set.
        /// </summary>
        public Input<string>? Username
        {
            get => _username;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _username = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CredentialsArgs()
        {
        }
        public static new CredentialsArgs Empty => new CredentialsArgs();
    }

    public sealed class CredentialsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate in the string format.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("credentialUsageSummaries")]
        private InputList<Inputs.CredentialsCredentialUsageSummaryGetArgs>? _credentialUsageSummaries;

        /// <summary>
        /// The list contains summary data related to the use of credentials
        /// </summary>
        [Obsolete(@"`credential_usage_summary` will be removed in future versions. It's not getting filled anymore, because it's runtime data")]
        public InputList<Inputs.CredentialsCredentialUsageSummaryGetArgs> CredentialUsageSummaries
        {
            get => _credentialUsageSummaries ?? (_credentialUsageSummaries = new InputList<Inputs.CredentialsCredentialUsageSummaryGetArgs>());
            set => _credentialUsageSummaries = value;
        }

        /// <summary>
        /// A short description of the credentials set
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// External Vault Configuration
        /// </summary>
        [Input("external")]
        public Input<Inputs.CredentialsExternalGetArgs>? External { get; set; }

        /// <summary>
        /// The certificate format. Possible values are `PEM`, `PKCS12` and `UNKNOWN`.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// The name of the credentials set
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The credentials set is available to every user (`false`) or to owner only (`true`)
        /// </summary>
        [Input("ownerAccessOnly")]
        public Input<bool>? OwnerAccessOnly { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password of the credential. Note: Terraform treats an empty string for a value as if the attribute was absent. If
        /// you want to set an empty password, use the value `--empty--`.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// For certificate authentication specifies whether it's public certificate auth (`true`) or not (`false`).
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The scope of the credentials set. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Token in the string format. Specifying a token implies `Token Authentication`.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("username")]
        private Input<string>? _username;

        /// <summary>
        /// The username of the credentials set.
        /// </summary>
        public Input<string>? Username
        {
            get => _username;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _username = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public CredentialsState()
        {
        }
        public static new CredentialsState Empty => new CredentialsState();
    }
}
