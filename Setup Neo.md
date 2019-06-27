# Set up Guide

This document will teach you how to setup your development environment, Cloud Foundry landscape and how to deploy and alter the used Java Backend.

* [Set up Neo for Mobile Services](#setupneo)
* [Clone the Fiori-for-iOS-Roadshow-19 repository](#clonerepo)
* [Deploy the Java Backend to Neo](#deployapp)

<a name="setupneo"/>

## Enable Mobile Services for Neo

Please complete the following tutorials in the [Set Up the SAP Cloud Platform SDK for iOS](https://developers.sap.com/group.ios-sdk-setup.html) group:

1. [Enable SAP Cloud Platform Mobile Services](https://developers.sap.com/tutorials/fiori-ios-hcpms-setup.html)
2. [Configure Mobile Services in iOS Assistant](https://developers.sap.com/tutorials/fiori-ios-scpms-configure-ms-assistant.html)

## Clone the Fiori-for-iOS-Roadshow-19 repository
In order to get the sample backends you should clone the repository to your machine. Why cloning the repository instead of downloading it as ZIP? - If you clone the repository rather then just downloading it as ZIP gives you the advantage that you can pull future changes directly without re-downloading the repository as ZIP.

> If you don't have Git installed on your MacBook please follow the instructions on the official [Git Homepage](https://git-scm.com/book/en/v1/Getting-Started-Installing-Git).

After you succesfully cloned the repository please go in the directory and inspect the items in there.

You will find the following folders:

* Backends
* ...

<a name="deployapp"/>

## Deploy the Java Backend to Neo
Now that you have the Java Backends handy we will go ahead an deploy it on the NEO landscape.

Please go back and login to your [SAP Cloud Platform](https://account.hanatrial.ondemand.com/) account. There please select **Neo** as your landscape.
![deploy-1](https://github.wdf.sap.corp/storage/user/16334/files/23b29480-823e-11e9-8380-6710eb5bc6bb)

On the left hand side you will see **Applications** if you expand it now select **Java Applications**. You should see the following screen showing up.

![deploy-2](https://github.wdf.sap.corp/storage/user/16334/files/257c5800-823e-11e9-9a26-30a9bb795ddb)

Now click on **Deploy Application**. In the upcoming screen please brows for the WAR you want to deploy. Also select **Java Web Tomcat 8** as **Runtime Name**.

![deploy-3](https://github.wdf.sap.corp/storage/user/16334/files/26ad8500-823e-11e9-8219-77276e6f077e)

Click on **Deploy**.

The following screen should show up where you have the option to start the Java Application the WAR was deployed succesfully.

![deploy-4](https://github.wdf.sap.corp/storage/user/16334/files/27deb200-823e-11e9-9b2d-15987c4242ce)

If the application was started successfully you should see something similiar like this.

![deploy-5](https://github.wdf.sap.corp/storage/user/16334/files/29a87580-823e-11e9-8805-6b6230778beb)

Click now on the application name to see the **Application URLs**.

![deploy-6](https://github.wdf.sap.corp/storage/user/16334/files/2b723900-823e-11e9-95dd-ef1b5e9154e9)

To open the service in your browser click the shown URL. You should see the service document now.

![deploy-7](https://github.wdf.sap.corp/storage/user/16334/files/2f05c000-823e-11e9-9509-5e5b3bbd5a8e)

In the url you can add **/$metadata** to see the metadata definition of the OData Service.

![deploy-8](https://github.wdf.sap.corp/storage/user/16334/files/3200b080-823e-11e9-8230-b746c7efee77)

You now have succesfully deployed your Java Backend application!
