# How to generate an app with the SAP Cloud Platform for iOS Assistant

In this guide you will learn how to use the assistant to generate a Master-Detail View app connecting to the previously deployed backend. In addition you will learn how to replace the generated UI with your own.

## Use the assistant to generate the app

We can use the SAP Cloud Platform for iOS Assistant to generate a Xcode project stub containing required proxy classes and Onboarding implementation. This is really helpful if you have an OData Service you want to connect to because you don't have to spend time building the dataservice layer nor the data model yourself. Also it will give you a full onboarding flow with authentication code. The generated onboarding flow can be changed at any time or completely stript out if you wish.

When you open up the assistant you can start creating a new app. To do so click on **Create New**.

![create-app-1](https://user-images.githubusercontent.com/9074514/59391714-098eb100-8d2a-11e9-84d0-0585acb3d123.png)

In the upcoming screen you have three different options to choose from.

- **Sample Application**: Will generate an Master-Detail View app connecting to a sample service provided by SAP.
- **Reuse Existing Application**: Application in this context means SAP Mobile Services application definition. If your Cloud admin or yourself create an application definition online in the Mobile Services Cockpit you can now generate an app out of that.
- **Create New Application**: This option gives you the most flexibility. Here you can create a Mobile Services application definition, define a destination pointing to your backend endpoint and define what features your iOS app should have.

For this workshop, please choose the **Create New Application**.

![create-app-2](https://user-images.githubusercontent.com/9074514/59391715-0a274780-8d2a-11e9-9ac0-741dbabafe63.png)

Now you need to make a connection to your Mobile Services account. You can do so by clicking on **Add new...**.
Please enter your information and click on **Save**.

![create-app-3](https://user-images.githubusercontent.com/9074514/59391716-0a274780-8d2a-11e9-91aa-833d860ce686.png)

Now make sure the added account is selected and click on **Next**.

![create-app-4](https://user-images.githubusercontent.com/9074514/59391717-0a274780-8d2a-11e9-800f-4c4dc8749626.png)
<a name="changeui"/>

Next you're going to create your Cloud Application in Mobile Services. Please fill out the fields and select OAuth2 as authentication method. Click on **Next**.

![create-app-5](https://user-images.githubusercontent.com/9074514/59391718-0a274780-8d2a-11e9-8372-771b7d0e1b05.png)

Adding a destination will make sure the assistant can make the right connection to the backend endpoint. Click on **Add new...** to add a new destination.

![create-app-6](https://user-images.githubusercontent.com/9074514/59391719-0a274780-8d2a-11e9-8d4d-41c2ec51bf48.png)

In the upcoming screen fill out the fields. For the Backend URL you want to use the URL you got when you deployed the Java Application Backend to Cloud Foundry. Choose **No Authentication** because we don't need to authentication for this sample backend. If you want to try out different authentication methods, feel free to do so. Click on **Save**.

![create-app-7](https://user-images.githubusercontent.com/9074514/59391720-0a274780-8d2a-11e9-9494-d63d8fd6de97.png)

Make sure the added destination is selected and click on **Next**.

![create-app-8](https://user-images.githubusercontent.com/9074514/59391721-0abfde00-8d2a-11e9-928e-ac2aaf8bb034.png)

In the Features step make sure you selected **Use Offline OData** and let the rest as is. Click on **Next**.

![create-app-9](https://user-images.githubusercontent.com/9074514/59391722-0abfde00-8d2a-11e9-8b21-d84b64d02b70.png)

Now it is time to define the Xcode project configuration. Please fill out the fields as you wish. Be aware that these information will be used to create the Xcode project.

![create-app-10](https://user-images.githubusercontent.com/9074514/59391723-0abfde00-8d2a-11e9-9d41-74cb5c56b3b2.png)

The last step is to configure what the assistant should generate for you. Please leave **Onboarding** and **Master / Detail Screens for Destination** selected and click on **Finish**.

![create-app-11](https://user-images.githubusercontent.com/9074514/59391724-0abfde00-8d2a-11e9-900d-4dd6c5dff4c0.png)

The assistant will now create your application project while fetching the metadata document from your backend and generating the data model and service for you.

Xcode should automatically start and show your project.
