//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class ExpenseType
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property expenseTypeID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType.getProperty("ExpenseTypeID");

    public static final com.sap.cloud.server.odata.Property expenses = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType.getProperty("Expenses");

    public ExpenseType()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:563:5
        this(true);
    }

    public ExpenseType(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:563:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expenseType);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:548:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ExpenseType.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:582:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.ExpenseType.description));
    }

    public long getExpenseTypeID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:595:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.ExpenseType.expenseTypeID));
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenses()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:608:5
        return com.example.backend.travelexpense.proxy.ExpenseList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.ExpenseType.expenses)));
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getOld()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:543:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ExpenseType.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:536:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long expenseTypeID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:553:12
        return new com.sap.cloud.server.odata.EntityKey().with("ExpenseTypeID", com.sap.cloud.server.odata.LongValue.of(expenseTypeID));
    }

    public static com.example.backend.travelexpense.proxy.ExpenseTypeList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:558:12
        return com.example.backend.travelexpense.proxy.ExpenseTypeList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:587:5
        this.setDataValue(com.example.backend.travelexpense.proxy.ExpenseType.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setExpenseTypeID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:600:5
        this.setDataValue(com.example.backend.travelexpense.proxy.ExpenseType.expenseTypeID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setExpenses(final com.example.backend.travelexpense.proxy.ExpenseList value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:613:5
        com.example.backend.travelexpense.proxy.ExpenseType.expenses.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
