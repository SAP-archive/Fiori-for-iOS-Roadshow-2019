// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of listener registration in the ProviderSettings class.

package com.example.backend.travelexpense.base;

import com.sap.cloud.server.odata.*;

class RegisterListeners {
    private static EntityListener attachmentListener;
    private static EntityListener currencyListener;
    private static EntityListener expenseListener;
    private static EntityListener expenseTypeListener;
    private static EntityListener paymentTypeListener;
    private static EntityListener reportListener;
    private static EntityListener reportStatusListener;

    public static void withServlet(com.example.backend.travelexpense.MainServlet servlet) {
        com.example.backend.travelexpense.proxy.TravelexpenseService service = (com.example.backend.travelexpense.proxy.TravelexpenseService)servlet.getDataService();
        attachmentListener = new com.example.backend.travelexpense.listener.AttachmentListener(servlet, service);
        currencyListener = new com.example.backend.travelexpense.listener.CurrencyListener(servlet, service);
        expenseListener = new com.example.backend.travelexpense.listener.ExpenseListener(servlet, service);
        expenseTypeListener = new com.example.backend.travelexpense.listener.ExpenseTypeListener(servlet, service);
        paymentTypeListener = new com.example.backend.travelexpense.listener.PaymentTypeListener(servlet, service);
        reportListener = new com.example.backend.travelexpense.listener.ReportListener(servlet, service);
        reportStatusListener = new com.example.backend.travelexpense.listener.ReportStatusListener(servlet, service);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment, attachmentListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency, currencyListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense, expenseListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType, expenseTypeListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType, paymentTypeListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report, reportListener);
        servlet.registerEntityListener(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus, reportStatusListener);
    }
}
