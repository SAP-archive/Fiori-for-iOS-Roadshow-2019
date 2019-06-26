//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class Expense
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property amount = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Amount");

    public static final com.sap.cloud.server.odata.Property city = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("City");

    public static final com.sap.cloud.server.odata.Property country = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property currencyID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("CurrencyID");

    public static final com.sap.cloud.server.odata.Property date = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Date");

    public static final com.sap.cloud.server.odata.Property expenseID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("ExpenseID");

    public static final com.sap.cloud.server.odata.Property expenseTypeID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("ExpenseTypeID");

    public static final com.sap.cloud.server.odata.Property notes = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Notes");

    public static final com.sap.cloud.server.odata.Property paymentTypeID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("PaymentTypeID");

    public static final com.sap.cloud.server.odata.Property personal = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Personal");

    public static final com.sap.cloud.server.odata.Property postalCode = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("PostalCode");

    public static final com.sap.cloud.server.odata.Property reportID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("ReportID");

    public static final com.sap.cloud.server.odata.Property state = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("State");

    public static final com.sap.cloud.server.odata.Property attachments = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Attachments");

    public static final com.sap.cloud.server.odata.Property currency = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Currency");

    public static final com.sap.cloud.server.odata.Property expenseType = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("ExpenseType");

    public static final com.sap.cloud.server.odata.Property paymentType = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("PaymentType");

    public static final com.sap.cloud.server.odata.Property report = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense.getProperty("Report");

    public Expense()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:247:5
        this(true);
    }

    public Expense(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:247:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.expense);
    }

    public com.example.backend.travelexpense.proxy.Expense copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:232:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Expense.cast(this.copyEntity());
    }

    public java.math.BigDecimal getAmount()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:296:5
        return com.sap.cloud.server.odata.DecimalValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.amount));
    }

    public com.example.backend.travelexpense.proxy.AttachmentList getAttachments()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:465:5
        return com.example.backend.travelexpense.proxy.AttachmentList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.attachments)));
    }

    public String getCity()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:309:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.city));
    }

    public String getCountry()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:322:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.country));
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrency()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:478:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Currency.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.currency));
    }

    public long getCurrencyID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:335:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.currencyID));
    }

    public com.sap.cloud.server.odata.LocalDateTime getDate()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:348:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.date));
    }

    public long getExpenseID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:361:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.expenseID));
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseType()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:491:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ExpenseType.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.expenseType));
    }

    public long getExpenseTypeID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:374:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.expenseTypeID));
    }

    public String getNotes()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:387:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.notes));
    }

    public com.example.backend.travelexpense.proxy.Expense getOld()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:227:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Expense.cast(this.getOldEntity());
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentType()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:504:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_PaymentType.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.paymentType));
    }

    public long getPaymentTypeID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:400:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.paymentTypeID));
    }

    public boolean getPersonal()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:413:5
        return com.sap.cloud.server.odata.BooleanValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.personal));
    }

    public String getPostalCode()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:426:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.postalCode));
    }

    public com.example.backend.travelexpense.proxy.Report getReport()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:517:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.report));
    }

    public long getReportID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:439:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.reportID));
    }

    public String getState()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:452:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.example.backend.travelexpense.proxy.Expense.state));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:220:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long expenseID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:237:12
        return new com.sap.cloud.server.odata.EntityKey().with("ExpenseID", com.sap.cloud.server.odata.LongValue.of(expenseID));
    }

    public static com.example.backend.travelexpense.proxy.ExpenseList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:242:12
        return com.example.backend.travelexpense.proxy.ExpenseList.share(from);
    }

    public void setAmount(final java.math.BigDecimal value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:301:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.amount, com.sap.cloud.server.odata.DecimalValue.of(value));
    }

    public void setAttachments(final com.example.backend.travelexpense.proxy.AttachmentList value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:470:5
        com.example.backend.travelexpense.proxy.Expense.attachments.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setCity(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:314:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:327:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCurrency(final com.example.backend.travelexpense.proxy.Currency value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:483:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.currency, value);
    }

    public void setCurrencyID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:340:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.currencyID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setDate(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:353:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.date, value);
    }

    public void setExpenseID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:366:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.expenseID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setExpenseType(final com.example.backend.travelexpense.proxy.ExpenseType value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:496:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.expenseType, value);
    }

    public void setExpenseTypeID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:379:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.expenseTypeID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setNotes(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:392:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.notes, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setPaymentType(final com.example.backend.travelexpense.proxy.PaymentType value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:509:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.paymentType, value);
    }

    public void setPaymentTypeID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:405:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.paymentTypeID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setPersonal(final boolean value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:418:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.personal, com.sap.cloud.server.odata.BooleanValue.of(value));
    }

    public void setPostalCode(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:431:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.postalCode, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }

    public void setReport(final com.example.backend.travelexpense.proxy.Report value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:522:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.report, value);
    }

    public void setReportID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:444:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.reportID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setState(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:457:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Expense.state, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
