// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place any customizations of handler registration in the ProviderSettings class.

package com.example.backend.travelexpense.base;

import com.sap.cloud.server.odata.*;

class RegisterHandlers {
    private static EntityHandler handler_Attachment;
    private static EntityHandler handler_Currency;
    private static EntityHandler handler_Expense;
    private static EntityHandler handler_ExpenseType;
    private static EntityHandler handler_PaymentType;
    private static EntityHandler handler_Report;
    private static EntityHandler handler_ReportStatus;

    public static void withServlet(com.example.backend.travelexpense.MainServlet servlet) {
        com.example.backend.travelexpense.proxy.TravelexpenseService service = (com.example.backend.travelexpense.proxy.TravelexpenseService)servlet.getDataService();
        handler_Attachment = new com.example.backend.travelexpense.handler.AttachmentHandler(servlet, service);
        handler_Currency = new com.example.backend.travelexpense.handler.CurrencyHandler(servlet, service);
        handler_Expense = new com.example.backend.travelexpense.handler.ExpenseHandler(servlet, service);
        handler_ExpenseType = new com.example.backend.travelexpense.handler.ExpenseTypeHandler(servlet, service);
        handler_PaymentType = new com.example.backend.travelexpense.handler.PaymentTypeHandler(servlet, service);
        handler_Report = new com.example.backend.travelexpense.handler.ReportHandler(servlet, service);
        handler_ReportStatus = new com.example.backend.travelexpense.handler.ReportStatusHandler(servlet, service);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment, handler_Attachment);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency, handler_Currency);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense, handler_Expense);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType, handler_ExpenseType);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType, handler_PaymentType);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report, handler_Report);
        servlet.registerEntityHandler(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus, handler_ReportStatus);
    }
}
