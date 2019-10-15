# Generating an app with the SAP Cloud Platform for iOS Assistant

In this guide you will learn how to use the assistant to generate a Master-Detail app connecting to the previously deployed backend.

We can use the SAP Cloud Platform for iOS Assistant to generate a Xcode project containing Swift proxy classes for a given OData service and a defualt onboarding implementation. This is really helpful if you have an OData service you want to connect to because you don't have to spend time building the dataservice layer nor the data model yourself. Also, it will give you a full onboarding flow with authentication screens including integration with native iOS biometric authentication mechanisms sucha as Touch ID and Face ID. Of course this default onboarding flow can be cusmtomized at any time or completely removed if you wish.

To generate a new Xcode template app for a mobile service, launch the assistant and click the **Create New** button.

![create-app-1](https://user-images.githubusercontent.com/9074514/66822345-61d9f780-ef44-11e9-9f59-807eacbb502a.png)

In the following screen you have three app creation options to choose from including:

- **Sample Application**: Generates an Master-Detail View app connecting to a sample service provided by SAP.
- **Reuse Existing Application**: Application in this context means SAP Mobile Services application definition. If your Cloud admin or yourself create an application definition online in the Mobile Services Cockpit you can now generate an app out of that.
- **Create New Application**: This option gives you the most flexibility. Here you can create a Mobile Services application definition, define a destination pointing to your backend endpoint and define what features your iOS app should have.

For this workshop, please choose the **Create New Application**.

![create-app-2](https://user-images.githubusercontent.com/9074514/59391715-0a274780-8d2a-11e9-9ac0-741dbabafe63.png)

Select the Mobile Services account you connected to the assistant in the previous exercisevand click the **Next** button.

![create-app-4](https://user-images.githubusercontent.com/9074514/59391717-0a274780-8d2a-11e9-800f-4c4dc8749626.png)
<a name="changeui"/>

The next step creates a Cloud Application in Mobile Services. Please fill out the fields and select **OAuth2** as authentication method then click the **Next** button.

![create-app-5](https://user-images.githubusercontent.com/9074514/59391718-0a274780-8d2a-11e9-8372-771b7d0e1b05.png)

Adding a destination will make sure the assistant can make the right connection to the service endpoint. Click the **Add new...** button to add a new destination.

![create-app-6](https://user-images.githubusercontent.com/9074514/59391719-0a274780-8d2a-11e9-8d4d-41c2ec51bf48.png)

Complete the fields in the next screen by providing the backend URL shown after you deployed the Java Application Backend to your Neo Trial account. Then choose **No Authentication** because we don't need to authentication for this sample backend. If you want to try out different authentication methods, feel free to do so then click the **Save** button.

![create-app-7](https://user-images.githubusercontent.com/9074514/59391720-0a274780-8d2a-11e9-9494-d63d8fd6de97.png)

Make sure the added destination is selected and click the **Next** button.

![create-app-8](https://user-images.githubusercontent.com/9074514/59391721-0abfde00-8d2a-11e9-928e-ac2aaf8bb034.png)

For the Features step, make sure you select **Use Offline OData**, leave the rest of the options as the default the click the **Next** button.

![create-app-9](https://user-images.githubusercontent.com/9074514/59391722-0abfde00-8d2a-11e9-8b21-d84b64d02b70.png)

Now it is time to define the Xcode project configuration. Please fill out the fields as you wish. Be aware that the values entered will define the same details for the generated Xcode project.

![create-app-10](https://user-images.githubusercontent.com/9074514/59391723-0abfde00-8d2a-11e9-9d41-74cb5c56b3b2.png)

The last step is to configure what features the assistant will include in the generated project. Please leave **Onboarding** and **Master / Detail Screens for Destination** selected and click the **Finish** button.

![create-app-11](https://user-images.githubusercontent.com/9074514/66822564-c39a6180-ef44-11e9-8fbe-ad790064c49f.png)

The assistant will now fetch the metadata document from your backend, generate the data model as avset of Swift proxy classes, create sample views and query logic, then wrap it all in a Xcode project you can use to explore your data and customize to fit your own design.

Xcode should automatically start and show your project.
