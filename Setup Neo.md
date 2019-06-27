# Set up Guide

This document will teach you how to deploy a Java Backend Application on the Neo Landscape.

* [Set up Neo for Mobile Services](#setupneo)
* [Deploy the Java Backend to Neo](#deployapp)

<a name="setupneo"/>

## Enable Mobile Services for Neo

Please complete the following tutorials in the [Set Up the SAP Cloud Platform SDK for iOS](https://developers.sap.com/group.ios-sdk-setup.html) group:

1. [Enable SAP Cloud Platform Mobile Services](https://developers.sap.com/tutorials/fiori-ios-hcpms-setup.html)
2. [Configure Mobile Services in iOS Assistant](https://developers.sap.com/tutorials/fiori-ios-scpms-configure-ms-assistant.html)

<a name="deployapp"/>

## Deploy the Java Backend to Neo
In the **Release** tab of this GitHub repository you can find the Java Backend Application for the Travel Expense Use Case. 

![release-1](https://user-images.githubusercontent.com/9074514/60281608-82cefc00-9905-11e9-8b6c-26ef8b95b720.png)

Click on the .war file to download it.

![release-2](https://user-images.githubusercontent.com/9074514/60281609-82cefc00-9905-11e9-867b-cb63fb6de870.png)

Please go back and login to your [SAP Cloud Platform](https://account.hanatrial.ondemand.com/) account. There please select **Neo** as your landscape.
![deploy-1](https://user-images.githubusercontent.com/9074514/60281889-156f9b00-9906-11e9-885d-a21d0221489d.png)

On the left hand side you will see **Applications**, expand it and select **Java Applications**. You should see the following screen showing up.

![deploy-2](https://user-images.githubusercontent.com/9074514/60281890-156f9b00-9906-11e9-8a3b-58c1370be7ef.png)

Now click on **Deploy Application**. In the upcoming screen please browse for the .war you want to deploy. Also select **Java Web Tomcat 8** as **Runtime Name**.

![deploy-3](https://user-images.githubusercontent.com/9074514/60282946-654f6180-9908-11e9-9056-fe360a61cb65.png)

Click on **Deploy**.

The following screen should show up. Click on **Start** to start the backend service.

![deploy-4](https://user-images.githubusercontent.com/9074514/60282947-654f6180-9908-11e9-95a2-90d346ffff96.png)

You will see now the SAP Cloud Platform is starting the backend service for you.

![deploy-5](https://user-images.githubusercontent.com/9074514/60282948-654f6180-9908-11e9-902f-faaf8fc60b64.png)

If the application was started successfully you should see something similiar like this.

![deploy-6](https://user-images.githubusercontent.com/9074514/60282949-654f6180-9908-11e9-9a92-af77faec8061.png)

Click on the application name to see the **Application URL**.

![deploy-7](https://user-images.githubusercontent.com/9074514/60282950-65e7f800-9908-11e9-9851-bba888d46186.png)

To open the service in your browser click the shown URL. You should see the service document now.

![odata-1](https://user-images.githubusercontent.com/9074514/60282952-65e7f800-9908-11e9-8fa2-60fe6d9eef31.png)

In the url you can add **/$metadata** to see the metadata definition of the OData Service.

![odata-2](https://user-images.githubusercontent.com/9074514/60282954-65e7f800-9908-11e9-9b73-d9ed4e4d4334.png)

You have succesfully deployed your Java Backend application!
