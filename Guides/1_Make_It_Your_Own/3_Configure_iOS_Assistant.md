# Configure the SAP Cloud Platform SDK for iOS Assistant with your account information

> If you have already configured the SAP Cloud Platform SDK for iOS Assistant, you can skip this guide.

The SAP Cloud Platform SDK for iOS is designed to work seamlessly with a set of services provided by the SAP Cloud Platform that are optimized for communication with mobile devices, known collectively as Mobile Services. These include not only data services, but also features like analytics, push notifications, and app configuration.

Go to `https://account.hanatrial.ondemand.com/cockpit/#/acc/` + YOUR_P_NUMBER +`trial/service/mobileplatform2/overview` – replacing 'YOUR_P_NUMBER' with your trial account number.

> NOTE: Once loaded, you might want to bookmark this link!

The SAP Cloud Platform SDK for iOS includes an Assistant app for macOS that generates and manages your iOS apps that use the Mobile Services. To get started with the Assistant, you'll need to configure it for your account. Part of this configuration can be imported automatically.

Once you're logged in to **SAP Cloud Platform Mobile Services**, click the **Important Links** item in the lower section of the left panel to open **Important Links** section. 

Locate the tile **SAP Cloud Platform SDK for iOS Assistant** and click the **Importing URLs directly into Assistant** link:

![configure1](https://user-images.githubusercontent.com/9074514/60555618-98239c00-9cf2-11e9-81e6-f2d750178fc0.png)

You should now see the following pop-up:

![configure2](https://user-images.githubusercontent.com/9074514/60555619-98239c00-9cf2-11e9-9970-141dca777506.png)

Click **Allow** to launch the SAP Cloud Platform SDK for iOS Assistant app. The **Add Mobile Services Account** settings dialog will open, and both **API URL** and **UI URL** parameters will be pre-populated automatically:

![configure3](https://user-images.githubusercontent.com/9074514/60555620-98239c00-9cf2-11e9-8565-5202c24f44c3.png)

Provide the following additional details:

| Field | Value |
|----|----|
| Name | A descriptive name for the configuration, for instance `SAP Cloud Platform Mobile Services` |
| Authentication Type | `Basic Authentication` |
| User | Your trial account user id |
| Password | Password for your trial account user |

![configure4](https://user-images.githubusercontent.com/9074514/60555621-98bc3280-9cf2-11e9-8f06-91d1c02749c5.png)

Click the **Save** button when finished. Your account is now added to the SDK Assistant:

![configure5](https://user-images.githubusercontent.com/9074514/60555622-98bc3280-9cf2-11e9-8313-b5cf8d326b1a.png)

Click the **Back** button to return to the main screen of the **SAP Cloud Platform SDK for iOS Assistant**.
