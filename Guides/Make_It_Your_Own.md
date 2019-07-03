# Change your App UI and get an idea of the used OData query code

<a name="changeui"/>

## Replace generated UI code with your own

Now that you have your app generated you can run it. You will see a more or less satifying UI but what you really want is replace that UI with your own creative UI.

![combined](https://user-images.githubusercontent.com/9074514/59393799-ec5de080-8d31-11e9-930f-19eb04688710.png)

To implement your own UI you have to do some minor changes in the generated code. In your project you can see that there is a **ViewControllers** group which contains all generated UIViewController code. You could delete this folder but for this workshop we just leave it as it is to use it as a reference for OData backend calls.

![xcode-1](https://user-images.githubusercontent.com/9074514/59393925-7c9c2580-8d32-11e9-9c27-6c2e68c6537b.png)

In order to implement your own UI please go to the Main.storyboard file and delete all views defined in the storyboard. 

![xcode-storyboard-1](https://user-images.githubusercontent.com/9074514/59394220-b4579d00-8d33-11e9-9c80-2e62b510bc1f.png)

Now add a new UIViewController from the Object library. Select the added UIViewController and on the right-hand side click on the Attributes Inspector. In the Attributes Inspector check the **Is Initial View Controller**. The added UIViewController is now your initial view controller.

![xcode-storyboard-2](https://user-images.githubusercontent.com/9074514/59394221-b4579d00-8d33-11e9-9cb4-698b6ef4f791.png)

The view controller needs a UIViewController class to back the UI up. Please create a new UIViewController class and name it **MainViewController**.

![xcode-vc-1](https://user-images.githubusercontent.com/9074514/59394463-963e6c80-8d34-11e9-9937-e788f858dea0.png)

Go back to the Main.storyboard and select your view controller. In the Identity Inspector set the class to **MainViewController** and hit return. You now connected the visual representation in storyboard to a Swift class.

![xcode-vc-2](https://user-images.githubusercontent.com/9074514/59394464-963e6c80-8d34-11e9-9e8d-03f666fca7d2.png)

Last step is to change the code in the **ApplicationUIManager.swift** class to initialize the new view controller instead of the generated view code.

Open the **ApplicationUIManager.swift** file.

![xcode-2](https://user-images.githubusercontent.com/9074514/59394562-f2a18c00-8d34-11e9-814f-17ba4918f443.png)

Search for **splitViewController**.

![xcode-3](https://user-images.githubusercontent.com/9074514/59394564-f46b4f80-8d34-11e9-9829-2ec896a73f55.png)

What this code does is initializing the generated code from the Main.storyboard and set it as initial view controller. Change the following code:

```swift
   let appDelegate = (UIApplication.shared.delegate as! AppDelegate)
            let splitViewController = UIStoryboard(name: "Main", bundle: Bundle.main).instantiateViewController(withIdentifier: "MainSplitViewController") as! UISplitViewController
            splitViewController.delegate = appDelegate
            splitViewController.modalPresentationStyle = .currentContext
            splitViewController.preferredDisplayMode = .allVisible
            appViewController = splitViewController

```

to

```swift
let mainViewController = UIStoryboard(name: "Main", bundle: Bundle.main).instantiateInitialViewController() as! MainViewController
            mainViewController.modalPresentationStyle = .currentContext
            appViewController = mainViewController

```

If you run the app now you should just see a white screen instead of the generated UI. To actually see something please go back to the Main.storyboard and add a UILabel to the view.

![add-label-1](https://user-images.githubusercontent.com/9074514/59394784-e669fe80-8d35-11e9-84ba-025fb3d1cb3d.png)

Run the app and you should see your added label appear on the screen.

![add-label-2](https://user-images.githubusercontent.com/9074514/59394785-e669fe80-8d35-11e9-92c4-b1622d9b68cf.png)

Congratulations! You just replaced the generated UI with your own. You have the perfect starting point now to be creative for your own Travel Expense app.
