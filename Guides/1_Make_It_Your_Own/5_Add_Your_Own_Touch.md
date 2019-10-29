# Customze the user interface of the generated app to make it your own

Now that you have a default app generated you can run it to explore its capabilities. While the UI is probaly not you'll want to stick with, the sample does contain example code for all the functions your custom experience will need such as querying the backend and the necessary logic for adding, deleting, and updating records.

![app-alternation-1](https://user-images.githubusercontent.com/9074514/66823747-2987e880-ef47-11e9-92c5-2eaeb6bbd129.png)

To implement your own UI you make some minor changes to the generated code. In the project file browser you can see that there is a **ViewControllers** group which contains all generated UIViewController code. You could delete this folder but for beginners, it's best to leave it so you can use the geenrated code as a reference for making calls to your OData mobile service.

![xcode-1](https://user-images.githubusercontent.com/9074514/66823790-3c9ab880-ef47-11e9-9ced-cc781f4eaf85.png)

In order to implement your own UI, select the Main.storyboard file and delete all views defined in the storyboard. 

![xcode-storyboard-1](https://user-images.githubusercontent.com/9074514/66823845-53d9a600-ef47-11e9-86c8-18d02dcb1da7.png)

Now add a new UITableViewController from the Xcode Library.

![tableVC](https://user-images.githubusercontent.com/9074514/66823975-9e5b2280-ef47-11e9-83e9-3f59f2ca76ff.png)

Select your just added UITableViewController and in the navigation bar click on **Editor**, then on **Embedd in** and select **Navigation Controller**.

![navcontroller-1](https://user-images.githubusercontent.com/9074514/66824253-38bb6600-ef48-11e9-9254-90d4c28e0240.png)

Xcode will embedd your UITableViewController in a UINavigationController. Select the added UINavigationController and on the right-hand side click on the Attributes Inspector. In the Attributes Inspector check the **Is Initial View Controller**. Your new UINavigationController is now your initial view controller.

![isinitialvc](https://user-images.githubusercontent.com/9074514/66824399-7b7d3e00-ef48-11e9-8ee7-a5adae611df2.png)

The UITableViewController in the storybaord needs a UITableViewController subclass to back the UI up. In Xcode, select the **TravelExpense** group in the Project Navigator, right-click or control-click to create a **New File...**.

![newFile](https://user-images.githubusercontent.com/9074514/66824519-bed7ac80-ef48-11e9-9a9a-6d755ff773f8.png)

Next select **Cocoa Touch Class** and click on **Next**.

![cocoaTouch](https://user-images.githubusercontent.com/9074514/66824789-43c2c600-ef49-11e9-95bb-9235573184b4.png)

Create a new UITableViewController subclass and name it **MainTableViewController**. Click on **Next** and complete the file creation.

![createFile](https://user-images.githubusercontent.com/9074514/66824920-81bfea00-ef49-11e9-97c7-4cb4aa06bbd9.png)

Go back to the Main.storyboard and select your UITableViewController. In the Identity Inspector set the class to **MainTableViewController** and hit return. You've now connected the visual representation in the storyboard to a Swift class.

![setClass](https://user-images.githubusercontent.com/9074514/66825169-fe52c880-ef49-11e9-9b56-f1103993c2fa.png)

Last step is to change the code in the **ApplicationUIManager.swift** class to initialize your view controller instead of the provided in the generated project.

Open the **ApplicationUIManager.swift** file.

![xcode-2](https://user-images.githubusercontent.com/9074514/66825225-24786880-ef4a-11e9-805f-1c0cf80cc58b.png)

Use the dropdown selection to locate the **showApplicationScreen(completionHandler:) method**. Alternatively you can also search for the method instead.

![xcode-3](https://user-images.githubusercontent.com/9074514/66825463-98b30c00-ef4a-11e9-99a7-375651805e52.png)

This code initializes the generated views from the Main.storyboard and sets configures the default view controller. For your custom UI, change the following code:

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
            let navController = UIStoryboard(name: "Main", bundle: Bundle.main).instantiateInitialViewController() as! UINavigationController
            appViewController = navController

```

If you run the app now you should just see a white screen instead of the generated UI.

![emptytv](https://user-images.githubusercontent.com/9074514/66825540-bb452500-ef4a-11e9-9410-f2be866d6caa.png)

The dataservice is instantiated in the AppDelegate, to get an instance of the AppDelegate for all of your UITableViewController please add the following lines outside of your closing class brackets of the AppDelegate.swift class.

```Swift

   extension UITableViewController {
    var appDelegate: AppDelegate { return (UIApplication.shared.delegate as! AppDelegate) }
   }

```

If you're using the Offline OData instead of the Online OData you have to use a different OData provider.

For the Online OData use:

```Swift
var travelexpenseService: TravelexpenseService<OnlineODataProvider>?

```

For the Offline OData use:

```Swift
var travelexpenseService: TravelexpenseService<OfflineODataProvider>?

```

To actually see something more interesting then an empty Table View, add the following import statements to the **MainTableViewController:

Online OData:

```Swift

import SAPOData
import SAPFiori

```

Offline OData:

```Swift

import SAPOData
import SAPOfflineOData
import SAPFiori

```

Also replace everything in the class with the following code (right below the delegate declaration):

```swift

var travelexpenseService: TravelexpenseService<OnlineODataProvider>?
    var reports = [Report]()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        tableView.backgroundColor = UIColor.preferredFioriColor(forStyle: .backgroundBase)
        tableView.separatorStyle = .none
        
        tableView.register(FUIObjectTableViewCell.self, forCellReuseIdentifier: FUIObjectTableViewCell.reuseIdentifier)
        setupKPIHeader()
        
        guard let travelexpenseService = appDelegate.sessionManager.onboardingSession?.odataController.travelexpenseService else {
            AlertHelper.displayAlert(with: "OData service is not reachable, please onboard again.", error: nil, viewController: self)
            return
        }
        self.travelexpenseService = travelexpenseService
        
        loadData()
    }
    
    private func loadData() {
        let query = DataQuery().orderBy(Report.end, .descending).expand(Report.reportStatus)
        
        // Fetch all expense reports, using the query parameters defined above.
        travelexpenseService?.fetchReportSet(matching: query) { [weak self] reports, error in
            if let error = error {
                NSLog("Error: %@", error.localizedDescription)
                return
            }
            self?.reports = reports!
            self?.tableView.reloadData()
        }
    }
    
    private func setupKPIHeader() {
        
        let kpiHeader = FUIKPIHeader()
        
        let standardKPI1 = FUIKPIView()
        standardKPI1.items = [FUIKPIMetricItem(string: "2")]
        standardKPI1.captionlabel.text = "Customers Assisted"
        standardKPI1.isEnabled = false
        
        let standardKPI2 = FUIKPIView()
        standardKPI2.items = [FUIKPIMetricItem(string: "4")]
        standardKPI2.captionlabel.text = "Orders"
        standardKPI2.isEnabled = false
        
        kpiHeader.items = [standardKPI1, standardKPI2]
        tableView.tableHeaderView = kpiHeader
    }
    
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // return 0 as we display only the header
        return reports.count
    }
    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let report = reports[indexPath.row]
        let cell = tableView.dequeueReusableCell(withIdentifier: FUIObjectTableViewCell.reuseIdentifier) as! FUIObjectTableViewCell
        cell.headlineText = report.name
        cell.subheadlineText = report.city
        cell.statusText = report.reportStatus?.description
        cell.accessoryType = .disclosureIndicator
        
        return cell
    }

```

![finalapp](https://user-images.githubusercontent.com/9074514/66825956-9ac99a80-ef4b-11e9-8c1c-dd7f5abaa506.png)

Congratulations! You just replaced the generated UI with your own. You have the perfect starting point now to implement your own Travel Expense app.
