//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy.internal;

public abstract class TravelexpenseServiceFactory
{
    public static void registerAll()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1076:12
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateAttachment());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateCurrency());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateExpense());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateExpenseType());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreatePaymentType());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateReport());
        com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus.registerFactory(new com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.CreateReportStatus());
    }

    public static class CreateAttachment
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1126:9
            return new com.example.backend.travelexpense.proxy.Attachment(false);
        }
    }

    public static class CreateCurrency
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1136:9
            return new com.example.backend.travelexpense.proxy.Currency(false);
        }
    }

    public static class CreateExpense
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1146:9
            return new com.example.backend.travelexpense.proxy.Expense(false);
        }
    }

    public static class CreateExpenseType
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1156:9
            return new com.example.backend.travelexpense.proxy.ExpenseType(false);
        }
    }

    public static class CreatePaymentType
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1166:9
            return new com.example.backend.travelexpense.proxy.PaymentType(false);
        }
    }

    public static class CreateReport
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1176:9
            return new com.example.backend.travelexpense.proxy.Report(false);
        }
    }

    public static class CreateReportStatus
    extends com.sap.cloud.server.odata.core.ObjectFactory
    {
        @java.lang.Override public Object create()
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1186:9
            return new com.example.backend.travelexpense.proxy.ReportStatus(false);
        }
    }
}
