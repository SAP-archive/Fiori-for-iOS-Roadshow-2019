//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class Currency
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property abbreviation = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency.getProperty("Abbreviation");

    public static final com.sap.cloud.server.odata.Property currencyID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency.getProperty("CurrencyID");

    public static final com.sap.cloud.server.odata.Property description = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property expenses = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency.getProperty("Expenses");

    public Currency()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:141:5
        this(true);
    }

    public Currency(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:141:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.currency);
    }

    public com.example.backend.travelexpense.proxy.Currency copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:126:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Currency.cast(this.copyEntity());
    }

    public String getAbbreviation()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:162:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Currency.abbreviation));
    }

    public long getCurrencyID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:175:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Currency.currencyID));
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:188:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Currency.description));
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenses()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:201:5
        return com.example.backend.travelexpense.proxy.ExpenseList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Currency.expenses)));
    }

    public com.example.backend.travelexpense.proxy.Currency getOld()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:121:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Currency.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:114:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long currencyID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:131:12
        return new com.sap.cloud.server.odata.EntityKey().with("CurrencyID", com.sap.cloud.server.odata.LongValue.of(currencyID));
    }

    public static com.example.backend.travelexpense.proxy.CurrencyList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:136:12
        return com.example.backend.travelexpense.proxy.CurrencyList.share(from);
    }

    public void setAbbreviation(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:167:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Currency.abbreviation, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCurrencyID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:180:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Currency.currencyID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:193:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Currency.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setExpenses(final com.example.backend.travelexpense.proxy.ExpenseList value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:206:5
        com.example.backend.travelexpense.proxy.Currency.expenses.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
