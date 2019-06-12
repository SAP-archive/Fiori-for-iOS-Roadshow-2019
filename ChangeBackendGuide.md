# Alter the OData Service

If you want to make changes to the provided OData Service, SAP provides a great tool on SAP Cloud Platform to do so.

* [Enable and start Web IDE](#enablewebide)
  * [Enable SAP Web IDE Full-Stack on SAP Cloud Platform](#enablewebide2)
* [Create a project and alter the OData Service](#createproject)
  * [Create a Mobile OData Service Project](#createproject2)
  * [Import the provided CSDL file](#importcsdl)
  * [Alter the OData Service Definition](#alterservice)
* [Generate the Mobile OData Service](#generateservice)
* [Import the sample data](#importsampledata)
* [Build the project and export the WAR file](#buildproject)

<a name="enablewebide"/>

## Enable and start Web IDE

To alter the OData Service you can use SAP's Web IDE to create a **Mobile OData Service Project**. First you have to enable **SAP Web IDE Full-Stack** service on SAP Cloud Platform.

<a name="enablewebide2"/>

### Enable SAP Web IDE Full-Stack on SAP Cloud Platform

Please log in to your [SAP Cloud Platform](http://account.hanatrial.ondemand.com) account and select the **NEO Trial** landscape.

![webide-1](https://user-images.githubusercontent.com/9074514/57007845-8ada1c00-6ba0-11e9-8255-44d12b03d29e.png)

Now click on **Services** on the left hand side navigation.

![webide-2](https://user-images.githubusercontent.com/9074514/57007847-8f063980-6ba0-11e9-8b41-540a9ffcfb4d.png)

In the search field enter **Web** and hit return. The **SAP Web IDE Full-Stack** service should appear. 

![webide-3](https://user-images.githubusercontent.com/9074514/57007857-91689380-6ba0-11e9-95e1-06acb665f48d.png)

Click on the tile to enter the service's details. Click on **Enable** to enable the service for your account. This will take a bit.

![webide-4](https://user-images.githubusercontent.com/9074514/57007858-93325700-6ba0-11e9-8e05-0ceb836265fe.png)

Click on **Go to Service** to access the **SAP Web IDE**. The IDE will open in a new tab.

<a name="createproject"/>

## Create a project and alter the OData Service

<a name="createproject2">
  
### Create a Mobile OData Service Project

To alter the OData Service we first need a **Mobile OData Service Project**. Select your workspace under **Development** on the left hand side of the navigation. 

![createproject-1](https://user-images.githubusercontent.com/9074514/57007860-94fc1a80-6ba0-11e9-99d1-56675fc6e1b9.png)

Now go on **File -> New -> Project from Template**. This will allow us to create a new OData Service project with a template.

![createproject-2](https://user-images.githubusercontent.com/9074514/57008008-c9bca180-6ba1-11e9-9a4f-7b5bf1c8ea48.png)

In the creation process select **All Categories** as a filter and search for **Mobile** in the search field and hit return.

![createproject-3](https://user-images.githubusercontent.com/9074514/57008011-cf19ec00-6ba1-11e9-9832-3bba53aba5c9.png)

You will see different mobile project templates, select the **Mobile OData Service Project**. If you want to you can click on the heart to favorite this template for later use. Click on **Next**

![createproject-4](https://user-images.githubusercontent.com/9074514/57008010-cd502880-6ba1-11e9-9b69-c402ddfda36b.png)

Enter the following information as **Project Name**:

Property | Value
-------- | ---------
Project Name | iOSWorkshop2019

Click on **Next**

Now enter the following information in the form:

Property | Value
-------- | --------
Service App Name | TravelExpense
Service App Version | 0.1.0
Deployment Target | Cloud Foundry
Authentication Method | NONE

Make sure **Use in-memory database (for testing only)** is selected and **Use generated test data** is checked. Click on **Finish**

![createproject-5](https://user-images.githubusercontent.com/9074514/57008012-d0e3af80-6ba1-11e9-8dc2-4d2ee3b26f22.png)

You will now see the **iOSWorkshop2019** project appear in your workspace.

<a name="importcsdl">

### Import the provided CSDL file

The provided repository contains a CSDL file which holds the service definition for the OData Service. We need to import this file to generate the mobile OData service.

Select your project and right click to open the context menu. Click on **Import**.

![importcsdl-1](https://user-images.githubusercontent.com/9074514/57008211-5a47b180-6ba3-11e9-975a-13e1b24ad9f7.png)

Browse for the CSDL file in the repository and click on **OK**.

![importcsdl-2](https://user-images.githubusercontent.com/9074514/57008213-5f0c6580-6ba3-11e9-963b-a47288d6cd64.png)

The CSDL document will open and show you a graphical editor for the OData Service.

![importcsdl-3](https://user-images.githubusercontent.com/9074514/57008214-616ebf80-6ba3-11e9-98b3-fdd61487b027.png)

If you prefer to edit the service definition in a code editor you can do so by clicking on the arrows icon on the top left corner.

![importcsdl-4](https://user-images.githubusercontent.com/9074514/57008215-6469b000-6ba3-11e9-8bda-5548d3c7e4ea.png)

<a name="alterservice">

### Alter the OData Service Definition

**Add property to entity**

In the graphical editor you can now select an entity and click on the **+** icon on the top right corner. A pop up will appear where you can add a new property.

![alterservice-1](https://user-images.githubusercontent.com/9074514/57008321-1b662b80-6ba4-11e9-9dd0-a0c98be342f8.png)

Press **Command + S** to save.

**Alter an existing property**

You can also alter existing properties of an entity by selecting the to alter property. You can now change values on the right side. You can't change the **Type**.

![alterservice-2](https://user-images.githubusercontent.com/9074514/57008324-1f924900-6ba4-11e9-9ce0-bf83d180b0e2.png)

If you want to change the **Type** of an property, you have to delete it by right clicking the property and then selecting **Delete**. Now select the entity and add the same property with a different type.

Press **Command + S** to save.

<a name="generateservice">

## Generate the Mobile OData Service

Now that you changed the OData Service definition you have to generate the Mobile OData Service in order to add initial sample data and generate the WAR file.

Select the CSDL document and right click to open up the context menu. Click on **Generate Mobile OData Service**. The IDE will start verifying the CSDL document and then create the service.

![generateservice-1](https://user-images.githubusercontent.com/9074514/57008422-e0182c80-6ba4-11e9-9187-96fbffe49a76.png)

You will see the **srv** folder is no longer empty. Expand it to see it's contents.

![generateservice-2](https://user-images.githubusercontent.com/9074514/57008426-e4444a00-6ba4-11e9-9c00-94b342ca19f1.png)

<a name="importsampledata">

## Import the sample data

It is possible to add inital sample data to you backend which you can then consume out of your iOS app.

If you now expand **src -> main -> java -> resources -> initial-data** you will see a **README.md** file. If you open that you will see an example on how to create the sample data. No worries you don't have to do this by scratch, we will provide predefined sample data for you.

Right click on the **initial-data** folder and click on **Import -> File or Project** in the context menu.

![importsampledata-1](https://user-images.githubusercontent.com/9074514/57008527-a693f100-6ba5-11e9-9d6f-19cc8e95e203.png)

Start importing the sample data sets from the repository. The sets are:

* ReportStatusSet
* ReportSet
* PaymentTypeSet
* ExpenseTypeSet
* ExpenseSet
* CurrencySet

![importsampledata-2](https://user-images.githubusercontent.com/9074514/57008531-ab58a500-6ba5-11e9-9a08-fecce91f7a5e.png)

If you now open up one of the JSON documents you can see the sample data of that entity. You can now make changes to it like altering values. If you add more data to it make sure the IDs of navigation properties match each other, e.g.: You want to add another **Expense** data to the **ExpenseSet**, now you have the following navigation properties; **CurrencyID, ExpenseTypeID, PaymentTypeID, ReportID**. The IDs have to match a data entry in the **CurrencySet, ExpenseTypeSet, PaymentTypeSet, ReportSet**.

![importsampledata-3](https://user-images.githubusercontent.com/9074514/57008534-ad226880-6ba5-11e9-89f5-0c862d6f17ab.png)

<a name="buildproject">

## Build the project and export the WAR file

Now that you made all your changes in the CSDL document and changed the sample data it is time to build your project to export the needed WAR file.

Select the **srv** folder and right click to open the context menu. From the context menu select **Build -> Build**.

![buildwar-1](https://user-images.githubusercontent.com/9074514/57008659-6bde8880-6ba6-11e9-83ba-41b6c0c00533.png)

It will now take a bit, you can follow the process by opening the console by clicking on the icon on the lower right corner. If the build process was succesful you will get a prompt in the top right corner of your browser.

![buildwar-2](https://user-images.githubusercontent.com/9074514/57008666-700aa600-6ba6-11e9-9472-128693ee32aa.png)

If you expand the **target** folder, you will find the **odata-service-0.1.0.war** listed in the folder. Right click on the .war file and select **Export** from the context menu. You WAR will now be downloaded to your hard drive and can be deployed as application to Cloud Foundry.

![buildwar-3](https://user-images.githubusercontent.com/9074514/57008670-7731b400-6ba6-11e9-9ab1-aaac15ed80c3.png)
