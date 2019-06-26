# Setup Guide

This document will teach you how to setup your development environment, Cloud Foundry landscape and how to deploy and alter the used Java Backend.

* [Set up Cloud Foundry for Mobile Services](#setupcf)
  * [Create a new Subaccount in the Europe (Frankfurt) region](#createsubaccount)
  * [Enable Mobile Entitlements to use Mobile Services](#enableentitlements)
  * [Enable Cloud Foundry for your Subaccount](#enablecf)
* [Clone the Fiori-for-iOS-Roadshow-19 repository](#clonerepo)
* [Deploy the Java Backend to Cloud Foundry](#deployapp)
  * [Set up a new Space](#setupspace)
  * [Deploy the Java Backend application](#deploywar)

<a name="setupcf"/>

## Set up Cloud Foundry for Mobile Services
SAP has a Cloud Foundry implementation in the SAP Cloud Platform which allows us to have more control abourt our cloud services and applications deployed in the cloud. To use Cloud Foundry on SAP Cloud Platform we need to set it up first.

> If you're interested in the architectual concepts of Cloud Foundry please see the [Reference document](References.md) in this repository.

<a name="createsubaccount"/>

### Create a new Subaccount in the Europe (Frankfurt) region

Go to the [SAP Cloud Platform](http://account.hanatrial.ondemand.com) and log in.

> If you don't have an account yet please go ahead and follow the following tutorial: [Get a Free Trial Account on SAP Cloud Platform](https://developers.sap.com/tutorials/hcp-create-trial-account.html).

After you successfully logged into your cloud account you will see this overview:

![setup-1](https://user-images.githubusercontent.com/9074514/59389323-e6143800-8d22-11e9-8c6b-009845dd4380.png)

Please go ahead and click on **Cloud Foundry Trial** to go to the Cloud Foundry landscape. You should see a subdomain and on top you should see the Region listed in the breadcrumbs. Depending what your home location is this will show a different region as the one shown in the Screenshot.

![setup-2](https://user-images.githubusercontent.com/9074514/59389324-e6acce80-8d22-11e9-99bd-742e3f9cc7a1.png)

At the moment SAP Cloud Platform Mobile Services, which is used for administrating, monitoring and configuring your app, is only available in the region **Europe (Frankfurt)    CF/AWS** for trial. Please go ahead and select the region and choose **Europe (Frankfurt)    CF/AWS**.

![setup-3](https://user-images.githubusercontent.com/9074514/59389325-e6acce80-8d22-11e9-93ae-804741be9d54.png)

Now select your **Global Account** tile.

![setup-4](https://user-images.githubusercontent.com/9074514/56997320-3e6ced00-6b5c-11e9-9cbf-9c74ca2636ac.png)

We now have to create a new Subaccount in this region. Click on **New Subaccount**.

![setup-5](https://user-images.githubusercontent.com/9074514/56997321-3e6ced00-6b5c-11e9-9bb2-435e7abd9c1f.png)

Enter the following information in the upcoming popup and click on **Create**:

Property | Value
-------- | ---------
Display Name | *iOS Workshop 2019*
Subdomain | *iOSWorkshop2019*

You should see your new Subaccount as tile listed on the screen.

![setup-6](https://user-images.githubusercontent.com/9074514/56997322-3e6ced00-6b5c-11e9-9474-0b9cfaa3b968.png)

<a name="enableentitlements"/>

### Enable Mobile Entitlements to use Mobile Services

To be able to use SAP Cloud Platform Mobile Service on Cloud Foundry we have to assign certain mobile entitlements to your account. To do so please click on **Entitlements** on the right hand navigation.

![entitlements-1](https://user-images.githubusercontent.com/9074514/57001563-3453ea00-6b6e-11e9-8ca7-725bc95dc038.png)

You will see a list with different entitlements. Some will be already enabled and some are not. If you now click on **Edit** you're able to enable new entitlements for your account. Search for Mobile in the search field to see all mobile entitlements. Enable them by assigning the number 1 to each of them and click on **Save** when you're done. The following entitlements need to be assigned:

* Mobile App Lab Service provides access to mobile applications uploaded from Mobile Services cockpit
* Mobile App Update Service is used to update new versions of an App Modeler application
* Mobile Client Log Upload Service is used by mobile applications to upload technical log files
* Mobile Client Usage Service allows mobile application to upload client usage information and to analyze them on the server
* Mobile Cloud Build enables customized builds of SAP mobile applications
* Mobile Connectivity Service is used in the context of a Mobile application to connect to back-ends
* Mobile Content to Go Service, the back-end for the corresponding iPhone application
* Mobile Discovery service stores and facilitates retrieval of application configuration data
* Mobile Network Trace collects network trace information from mobile applications for debugging
* Mobile Offline Service enables secure offline access to data on the mobile device
* Mobile Push Notification Service is used to send out push messages to mobile devices
* Mobile Sample OData v2 ESPM Service is a sample OData service used for development and testing
* Mobile Settings Exchange Service is used for device registrations and general access to JSON data

![entitlements-2](https://user-images.githubusercontent.com/9074514/56997569-1467fa80-6b5d-11e9-8828-5e57aff3d3c4.png)

<a name="enablecf"/>

### Enable Cloud Foundry for your Subaccount

Please go back to the Subaccounts overview in the region **Europe (Frankfurt)** and select your created **iOS Workshop 2019** subaccount.

In the next screen please click on **Enable Cloud Foundry**.

![enable-cf-1](https://user-images.githubusercontent.com/9074514/57001866-f8218900-6b6f-11e9-9632-b486e550aa4f.png)

You can leave the prefilled organization name in the pop up. Click on **Create**.

![enable-cf-2](https://user-images.githubusercontent.com/9074514/56998352-d6200a80-6b5f-11e9-8861-31cbf85edb00.png)

Your Subaccount information should look like this:

![enable-cf-3](https://user-images.githubusercontent.com/9074514/56998350-d6200a80-6b5f-11e9-8c99-05fab0031334.png)

Your Cloud Foundry instance is now fully enabled and functional for future mobile development.

<a name="clonerepo"/>

## Clone the Fiori-for-iOS-Roadshow-19 repository
In order to get all the needed ressource artifacts for this workshop you have to clone this repository to your local machine. Why cloning the repository instead of downloading it as ZIP? - If you clone the repository rather then just downloading it as ZIP brings you the advantage that you can pull future changes directly without re-downloading the repository as ZIP.

> If you don't have Git installed on your MacBook please follow the instructions on the official [Git Homepage](https://git-scm.com/book/en/v1/Getting-Started-Installing-Git).

After you succesfully cloned the repository please go in the directory and inspect the items in there.

You will find the following folders:

* Backend
* ...

Under the **Release** tab in the repository you can find the WAR file. Please go ahead and download it to later the deploy it to Cloud Foundry.

<a name="deployapp"/>

## Deploy the Java Backend to Cloud Foundry
Now that you have the prepared Java Backend we now want to deploy the WAR file. You can deploy applications in different ways to Cloud Foundry. For a developer the most common way would be with the CLI tool or out of Eclipse with help of a custom plugin. For this workshop we will use the easiest way and use the Web UI on SAP Cloud Platform.

> If you're interested in how to install the CLI and Eclipse tool or on how to deploy applications, see the [Reference document](www.google.com).

<a name="setupspace"/>

### Set up a new Space
Please go back to your [SAP Cloud Platform](http://account.hanatrial.ondemand.com) and log in. Change the region to **Europe (Frankfurt)** and select your Global Account and then your subaccount **iOS Workshop 2019**.

In your subaccount click on **Spaces** on the right hand side navigation.

![spaces-1](https://user-images.githubusercontent.com/9074514/57001196-3fa61600-6b6c-11e9-81c1-84e2e8a1ad2b.png)

Now we have to create a new Space where we can deploy applications like backends, microservices and more. Click on **New Space**.

![spaces-2](https://user-images.githubusercontent.com/9074514/57001197-403eac80-6b6c-11e9-88bc-aa9c3800a9cc.png)

Now enter the following information in the pop up and click on **Save**:

Property | Value
-------- | --------
Space Name | iOSWorkshop2019

Leave the roles as they are.

<a name="deploywar"/>

### Deploy the Java Backend application

To deploy a new application please click on the created space.

![deploy-1](https://user-images.githubusercontent.com/9074514/57001198-403eac80-6b6c-11e9-9a3a-2fd692d681f1.png)

Cloud Foundry uses the manifest.yml to create & configure a Docker instance with the correct runtime, memory and disk space. To understand what you could configurePlease open the manifest.yml with a text editor of your choice. You should see the following:

![manifest](https://user-images.githubusercontent.com/9074514/57001193-3d43bc00-6b6c-11e9-80a1-a916d8c16b03.png)

Property | Meaning
-------- | --------
applications | Definition of different application configurations
name | The name of the application
memory | Physical memory allocation
disk_quota | Physical disk space
instances | How many instances of this application are needed, generell the more instances -> the less downtime
buildpack | What buildpack is needed to deploy the application
path | Path to the WAR file

Go back to your Browser to deploy the Java Backend application. Click on **Deploy Application**.

![deploy-2](https://user-images.githubusercontent.com/9074514/57001182-3a48cb80-6b6c-11e9-9cd9-d49ce5ec91af.png)

For **File Location** please browse for the WAR file, make sure **Use Manifest** is checked and **Manifest Location** is the manifest.yml file. Click on **Deploy**.

![deploy-3](https://user-images.githubusercontent.com/9074514/57001184-3a48cb80-6b6c-11e9-8023-6113d6b4f5b6.png)

Your application should start automatically.

![deploy-4](https://user-images.githubusercontent.com/9074514/57001185-3a48cb80-6b6c-11e9-98b2-dbd0dc273fc6.png)

When the application is started please click on the application name to navigate into the application details.

![deploy-5](https://user-images.githubusercontent.com/9074514/57001187-3a48cb80-6b6c-11e9-836a-d24ffd67b16b.png)

In the application details you can see the url to your deployed Java Backend OData Service. Click on the link to access your OData Service. You should see the Service definition now.

![deploy-6](https://user-images.githubusercontent.com/9074514/57001189-3ae16200-6b6c-11e9-8ab3-c8881c20fc99.png)

In the url you can add **/$metadata** to see the metadata definition of the OData Service.

You now have succesfully deployed your Java Backend application, and you're now able to access the OData Service.
