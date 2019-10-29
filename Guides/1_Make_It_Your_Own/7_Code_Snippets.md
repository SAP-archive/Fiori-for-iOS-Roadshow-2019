# Collection of Useful Code Snippets

## Dates

The assumption is that the object representing a date in an OData backend is of type LocalDateTime.
The LocalDateTime type is referenced here: 

### Formatting a date from the backend with the DateFormatter

```swift
var report: Report?

let dateFormatter = DateFormatter()

// ...

dateFormatter.dateFormat = "yyyy-MM-dd'T'HH:mm:ss" // String Date Format
dateFormatter.timeZone = TimeZone.current
dateFormatter.locale = Locale.current
let convertedDate = dateFormatter.date(from: report.start?.utc())

```

### Setting a date from the backend as display value of a FUIDatePickerFormCell

```swift

var report: Report?

var startDatePicker: FUIDatePickerFormCell?
var endDatePicker: FUIDatePickerFormCell?

// ...

startDatePicker.keyName = "Start"
let startDate = report.start?.utc()

if let startDate = fromDate {
    startDatePicker.value = fromDate
}

endDatePicker.keyName = "End"
let endDate = report.end?.utc()

if let endDate = toDate {
    endDatePicker.value = toDate
}

```

### Formatting back to LocalDateTime to set on entity

```swift

var report: Report?

var startDatePicker: FUIDatePickerFormCell?
var endDatePicker: FUIDatePickerFormCell?

// ...

report.start = LocalDateTime.from(utc: startDatePicker.value)
report.end = LocalDateTime.from(utc: endDatePicker.value)

```

## Currency

### Formatting a double using NumberFormatter

```swift
func formatDoubleToCurrency(amount: Double) -> String{
    let numberFormatter = NumberFormatter()
    numberFormatter.numberStyle = .currency
    numberFormatter.locale = Locale.current
    return numberFormatter.string(from: NSNumber(value: amount))!
}
```

### Formatting a double using NumberFormatter back

```swift
func formatCurrencyToDouble(input: String) -> Double? {
     let numberFormatter = NumberFormatter()
     numberFormatter.numberStyle = .currency
     numberFormatter.locale = Locale.current
     return numberFormatter.number(from: input)?.doubleValue
}
```

## Prepare for Segue

Assuming you created a segue in storyboard from one UI element to another View Controller, set the segue identifier and now want to pass data to the destination View Controller, you can implement the prepare(for:sender:) method. This method will allow you to do any setup code inbetween navigation from one View Controller to the other.

```swift
// MARK: - Navigation

override func prepare(for segue: UIStoryboardSegue, sender _: Any?) {

    guard let path = tableView.indexPathForSelectedRow else { return }
    guard let segueID = segue.identifier else {return}

    switch segueID {
        case "showExpenses" :
            let selectedEntity = self.reports[indexPath.row]
            let detailViewController = segue.destination as! DetailReportViewController
            detailViewController.report = selectedEntity
        default: return
    }
}


```
