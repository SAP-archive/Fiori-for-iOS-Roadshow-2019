# Customze the user interface of the generated app to make it your own

Now that you have a default app generated you can run it to explore its capabilities. While the UI is probaly not you'll want to stick with, the sample does contain example code for all the functions your custom experience will need such as querying the backend and the necessary logic for adding, deleting, and updating records.

![combined](https://user-images.githubusercontent.com/9074514/59393799-ec5de080-8d31-11e9-930f-19eb04688710.png)

To implement your own UI you make some minor changes to the generated code. In the project file browser you can see that there is a **ViewControllers** group which contains all generated UIViewController code. You could delete this folder but for beginners, it's best to leave it so you can use the geenrated code as a reference for making calls to your OData mobile service.

![xcode-1](https://user-images.githubusercontent.com/9074514/59393925-7c9c2580-8d32-11e9-9c27-6c2e68c6537b.png)

In order to implement your own UI, select the Main.storyboard file and delete all views defined in the storyboard. 

![xcode-storyboard-1](https://user-images.githubusercontent.com/9074514/59394220-b4579d00-8d33-11e9-9c80-2e62b510bc1f.png)

Now add a new UITableViewController from the Xcode Object Library.

![tableVC](https://user-images.githubusercontent.com/9074514/61244047-29850c00-a6fe-11e9-8b5a-83e15003136c.png)

Select the added UITableViewController. Select your just added UITableViewController and in the navigation bar click on **Editor**, then on **Embedd in** and select **Navigation Controller**.

![navcontroller-1](https://user-images.githubusercontent.com/9074514/61244046-29850c00-a6fe-11e9-817b-80adff4e8c32.png)

Xcode will embedd your UITableViewController in a UINavigationController. Select the added UINavigationController and on the right-hand side click on the Attributes Inspector. In the Attributes Inspector check the **Is Initial View Controller**. Your new UINavigationController is now your initial view controller.


![isinitialvc](https://user-images.githubusercontent.com/9074514/61244045-29850c00-a6fe-11e9-8aa1-76117c2c35ac.png)

The UITableViewController in the storybaord needs a UITableViewController subclass to back the UI up. In Xcode, create a new UITableViewController subclass and name it **MainTableViewController**.

![addclass-2](https://user-images.githubusercontent.com/9074514/61244371-ee370d00-a6fe-11e9-8699-02346668df7c.png)

Go back to the Main.storyboard and select your UITableViewController. In the Identity Inspector set the class to **MainTableViewController** and hit return. You've now connected the visual representation in the storyboard to a Swift class.

![addclass](https://user-images.githubusercontent.com/9074514/61244039-29850c00-a6fe-11e9-9950-65b4484a3d90.png)

Last step is to change the code in the **ApplicationUIManager.swift** class to initialize your view controller instead of the provided in the generated project.

Open the **ApplicationUIManager.swift** file.

![xcode-2](https://user-images.githubusercontent.com/9074514/61244428-0f97f900-a6ff-11e9-8e59-b1a053e21a8a.png)

Search for **splitViewController**.

![xcode-3](https://user-images.githubusercontent.com/9074514/61244429-0f97f900-a6ff-11e9-8384-8e35604137e3.png)

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

![emptytv](https://user-images.githubusercontent.com/9074514/61244040-29850c00-a6fe-11e9-83e7-7d1e13865312.png)

To actually see something more interesting, go back to the MainTableViewController swift class and add the following import statements:

```swift

import SAPOData
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
        standardKPI1.colorScheme = .dark
        standardKPI1.isEnabled = true
        
        let standardKPI2 = FUIKPIView()
        standardKPI2.items = [FUIKPIMetricItem(string: "4")]
        standardKPI2.captionlabel.text = "Orders"
        standardKPI2.colorScheme = .dark
        standardKPI2.isEnabled = true
        
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
        
        return cell
    }

```

For it to compile we have to get an instance of the travelexpense service. The service is instantiated in the AppDelegate, to get an instance of the AppDelegate for all of your UITableViewController please add the following lines outside of your closing class bracket.

```swift

   extension UITableViewController {
    var appDelegate: AppDelegate { return (UIApplication.shared.delegate as! AppDelegate) }
   }

```

Run the app and you should see a FUIKPIHeader and the UITableView filled with reports out of the database.

> NOTE: If you're using Online OData replace the `OnlineODataProvider` with `OfflineODataProvicder` in the `travelexpenseService` declaration.

![finalapp](https://user-images.githubusercontent.com/9074514/61244042-29850c00-a6fe-11e9-85be-071239f5b95e.png)

Congratulations! You just replaced the generated UI with your own. You have the perfect starting point now to implement your own Travel Expense app.
