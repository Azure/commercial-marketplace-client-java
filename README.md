
# Readme

This project welcomes contributions and suggestions.  Most contributions require you to agree to a
Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us
the rights to use your contribution. For details, visit https://cla.opensource.microsoft.com.

When you submit a pull request, a CLA bot will automatically determine whether you need to provide
a CLA and decorate the PR appropriately (e.g., status check, comment). Simply follow the instructions
provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/).
For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or
contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.


# Azure Commericial Marketplace SaaS Client SDK for Java

This repository is for active development of the Azure Commericial Marketplace SaaS Client SDK for Java. For consumers of the SDK we recommend visiting our versioned [developer docs](./sdk/README.md).

## Getting started

To get started with a the library, see the **README.md** file located in the [sdk project folder](./sdk/README.md). 

For samples of how to use the methods, look to the [test code](./sdk/src/test/java/com/microsoft/azure/marketplace/tests).

### Prerequisites

Java 8 or later is required to use this library.

### Client

Microsoft release Java packages follow the [Azure SDK Design Guidelines for Java](https://azure.github.io/azure-sdk/java/guidelines/) and share a number of core features such as HTTP retries, logging, transport protocols, authentication protocols, etc., so that once you learn how to use these features in one client library, you will know how to use them in other client libraries. You can learn about these shared features [here](https://github.com/Azure/azure-sdk-for-java/blob/master/sdk/core/azure-core/README.md).

> NOTE: If you need to ensure your code is ready for production use one of the stable, non-preview libraries.

## Need help?

- For reference documentation visit the [Azure Marketplace SDK for Java documentation](./sdk/README.md).
- For tutorials, samples, quick starts and other documentation, review the [test code](./sdk/src/test/java/com/microsoft/azure/marketplace/tests).
- File an issue via [Github Issues](https://github.com/Azure/commercial-marketplace-saas-sdk-client-java/issues/new/choose).

## Navigating the repository

### Master branch

The master branch has the most recent code with new features and bug fixes. It does **not** represent latest released **GA** SDK.

### Release branches (Release tagging)

For each package we release there will be a unique git tag created that contains the name and the version of the package to mark the commit of the code that produced the package. This tag will be used for servicing via hotfix branches as well as debugging the code for a particular preview or stable release version.
Format of the release tags are `<package-name>_<package-version>`. For more information please see [our branching strategy](https://github.com/Azure/azure-sdk/blob/master/docs/policies/repobranching.md#release-tagging).

## Contributing

For details on contributing to this repository, see the [contributing guide](CONTRIBUTING.md).

This project welcomes contributions and suggestions. Most contributions require you to agree to a Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us the rights to use your contribution. For details, view [Microsoft's CLA](https://cla.microsoft.com).

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions provided by the bot. You will only need to do this once across all repositories using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/). For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.

### Additional Helpful Links for Contributors

Many people all over the world have helped make this project better.  You'll want to check out:

- [What are some good first issues for new contributors to the repo?](https://github.com/azure/azure-sdk-for-java/issues?q=is%3Aopen+is%3Aissue+label%3A%22up+for+grabs%22)
- [How to build and test your change](CONTRIBUTING.md#developer-guide)
- [How you can make a change happen!](CONTRIBUTING.md#pull-requests)
- Frequently Asked Questions (FAQ) and Conceptual Topics in the detailed [Azure SDK for Java wiki](https://github.com/azure/azure-sdk-for-java/wiki).

### Reporting security issues and security bugs

Security issues and bugs should be reported privately, via email, to the Microsoft Security Response Center (MSRC) <secure@microsoft.com>. You should receive a response within 24 hours. If for some reason you do not, please follow up via email to ensure we received your original message. Further information, including the MSRC PGP key, can be found in the [Security TechCenter](https://www.microsoft.com/msrc/faqs-report-an-issue).

### License

Azure Marketplace SDK for Java is licensed under the [MIT](LICENSE.txt) license.

<!-- Links -->
[java_guidelines](https://azure.github.io/azure-sdk/java_introduction.html)

![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/commercial-marketplace-saas-sdk-client-java%2FREADME.png)
