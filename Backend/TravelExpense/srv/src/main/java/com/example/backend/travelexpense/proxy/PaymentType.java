//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class PaymentType
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property paymentTypeID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType.getProperty("PaymentTypeID");

    public static final com.sap.cloud.server.odata.Property expenses = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType.getProperty("Expenses");

    public PaymentType()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:654:5
        this(true);
    }

    public PaymentType(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:654:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.paymentType);
    }

    public com.example.backend.travelexpense.proxy.PaymentType copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:639:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_PaymentType.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:673:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.PaymentType.description));
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenses()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:699:5
        return com.example.backend.travelexpense.proxy.ExpenseList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.PaymentType.expenses)));
    }

    public com.example.backend.travelexpense.proxy.PaymentType getOld()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:634:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_PaymentType.cast(this.getOldEntity());
    }

    public long getPaymentTypeID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:686:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.PaymentType.paymentTypeID));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:627:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long paymentTypeID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:644:12
        return new com.sap.cloud.server.odata.EntityKey().with("PaymentTypeID", com.sap.cloud.server.odata.LongValue.of(paymentTypeID));
    }

    public static com.example.backend.travelexpense.proxy.PaymentTypeList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:649:12
        return com.example.backend.travelexpense.proxy.PaymentTypeList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:678:5
        this.setDataValue(com.example.backend.travelexpense.proxy.PaymentType.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setExpenses(final com.example.backend.travelexpense.proxy.ExpenseList value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:704:5
        com.example.backend.travelexpense.proxy.PaymentType.expenses.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setPaymentTypeID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:691:5
        this.setDataValue(com.example.backend.travelexpense.proxy.PaymentType.paymentTypeID, com.sap.cloud.server.odata.LongValue.of(value));
    }
}
