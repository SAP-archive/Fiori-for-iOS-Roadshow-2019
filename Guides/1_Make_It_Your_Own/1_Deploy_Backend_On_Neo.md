# Deploy the Java Backend to Neo

In the **Release** tab of this GitHub repository you can find the Java Backend Application for the Travel Expense Use Case.

![release-1](https://user-images.githubusercontent.com/9074514/60281608-82cefc00-9905-11e9-8b6c-26ef8b95b720.png)

Click on file ending in .war file to download to any location on your Mac.

![release-2](https://user-images.githubusercontent.com/9074514/60281609-82cefc00-9905-11e9-867b-cb63fb6de870.png)

Log On to account at [SAP Cloud Platform](https://account.hanatrial.ondemand.com/).
![deploy-1](https://user-images.githubusercontent.com/9074514/66821316-8634d480-ef42-11e9-8ea7-e52bb068eefd.png)

Next scroll down a bit until you see **Access Neo Trial**. Click on the **Access Neo Trial** link to open the Neo landscape.

![deploy-2](https://user-images.githubusercontent.com/9074514/66821318-86cd6b00-ef42-11e9-9647-7ace4d9fa860.png)

In the left-hand panel, click on **Applications** to expand it, then click on **Java Applications**. You will see a screen similar to the following:

![deploy-2](https://user-images.githubusercontent.com/9074514/60281890-156f9b00-9906-11e9-8a3b-58c1370be7ef.png)

Now click the **Deploy Application** button. In the **Deploy Application** dialog, click the **browse** button and select teh the .war you downloaded from this repository. Ensure that **Java Web Tomcat 8** is elected as the **Runtime Name**.

![deploy-3](https://user-images.githubusercontent.com/9074514/60282946-654f6180-9908-11e9-9056-fe360a61cb65.png)

Click the **Deploy** button.

When the following screen is displayed, click on **Start** to start the backend service.

![deploy-4](https://user-images.githubusercontent.com/9074514/60282947-654f6180-9908-11e9-95a2-90d346ffff96.png)

You will see now the SAP Cloud Platform is starting the backend service for you.

![deploy-5](https://user-images.githubusercontent.com/9074514/60282948-654f6180-9908-11e9-902f-faaf8fc60b64.png)

After the backend service application has successfully started, you will see a screen similiar the following:

![deploy-6](https://user-images.githubusercontent.com/9074514/60282949-654f6180-9908-11e9-9a92-af77faec8061.png)

Click on the application name to open a window displaying the **Application URL** and other details.

![deploy-7](https://user-images.githubusercontent.com/9074514/60282950-65e7f800-9908-11e9-9851-bba888d46186.png)

Click on the Application URL to open and review the service in Safari. If the service is not displayed as XML, ensure you have checked **Show Develop Menu in menu bar** checkbox at the bottom of the window under Safari>Preferences>Advanced.

![odata-1](https://user-images.githubusercontent.com/9074514/60282952-65e7f800-9908-11e9-8fa2-60fe6d9eef31.png)

Append **/$metadata** to the URL in the Safari address bar to see the metadata definition of the OData Service.

![odata-2](https://user-images.githubusercontent.com/9074514/60282954-65e7f800-9908-11e9-9b73-d9ed4e4d4334.png)

You have succesfully deployed your Java Backend application!
