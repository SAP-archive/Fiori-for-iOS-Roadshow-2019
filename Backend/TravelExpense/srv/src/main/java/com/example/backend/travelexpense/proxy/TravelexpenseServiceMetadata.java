//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public abstract class TravelexpenseServiceMetadata
{
    public static final com.sap.cloud.server.odata.csdl.CsdlDocument document = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.resolve();

    private static com.sap.cloud.server.odata.csdl.CsdlDocument resolve()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1066:12
        com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceFactory.registerAll();
        com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.setGeneratedProxies(true);
        return com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed;
    }

    public abstract static class EntityTypes
    {
        public static final com.sap.cloud.server.odata.EntityType attachment = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.Attachment");

        public static final com.sap.cloud.server.odata.EntityType currency = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.Currency");

        public static final com.sap.cloud.server.odata.EntityType expense = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.Expense");

        public static final com.sap.cloud.server.odata.EntityType expenseType = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.ExpenseType");

        public static final com.sap.cloud.server.odata.EntityType paymentType = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.PaymentType");

        public static final com.sap.cloud.server.odata.EntityType report = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.Report");

        public static final com.sap.cloud.server.odata.EntityType reportStatus = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntityType("com.example.backend.travelexpense.ReportStatus");
    }

    public abstract static class EntitySets
    {
        public static final com.sap.cloud.server.odata.EntitySet attachmentSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("AttachmentSet");

        public static final com.sap.cloud.server.odata.EntitySet currencySet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("CurrencySet");

        public static final com.sap.cloud.server.odata.EntitySet expenseSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("ExpenseSet");

        public static final com.sap.cloud.server.odata.EntitySet expenseTypeSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("ExpenseTypeSet");

        public static final com.sap.cloud.server.odata.EntitySet paymentTypeSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("PaymentTypeSet");

        public static final com.sap.cloud.server.odata.EntitySet reportSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("ReportSet");

        public static final com.sap.cloud.server.odata.EntitySet reportStatusSet = com.example.backend.travelexpense.proxy.internal.TravelexpenseServiceMetadataParser.parsed.getEntitySet("ReportStatusSet");
    }
}
