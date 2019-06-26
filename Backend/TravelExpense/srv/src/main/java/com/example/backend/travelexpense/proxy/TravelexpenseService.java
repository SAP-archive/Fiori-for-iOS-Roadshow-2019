//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class TravelexpenseService
    extends com.sap.cloud.server.odata.DataService
{
    public TravelexpenseService()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1214:5
        this(null);
    }

    public TravelexpenseService(final com.sap.cloud.server.odata.DataServiceProvider provider)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1214:5
        super(com.sap.cloud.server.odata.MetadataOnlyProvider.newIfNull(provider, "TravelexpenseService"));
        this.getProvider().setMetadata(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.document);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachment(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1226:5
        return this.getAttachment(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachment(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1226:5
        return this.getAttachment(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachment(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1226:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Attachment.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.attachmentSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.AttachmentList getAttachmentSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1241:5
        return this.getAttachmentSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.AttachmentList getAttachmentSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1241:5
        return this.getAttachmentSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.AttachmentList getAttachmentSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1241:5
        return this.getAttachmentSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.AttachmentList getAttachmentSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1241:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.Attachment.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.attachmentSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachmentWithKey(final long attachmentID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1234:5
        return this.getAttachmentWithKey(attachmentID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachmentWithKey(final long attachmentID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1234:5
        return this.getAttachmentWithKey(attachmentID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachmentWithKey(final long attachmentID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1234:5
        return this.getAttachmentWithKey(attachmentID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Attachment getAttachmentWithKey(final long attachmentID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1234:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getAttachment(var_query.withKey(com.example.backend.travelexpense.proxy.Attachment.key(attachmentID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrency(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1361:5
        return this.getCurrency(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrency(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1361:5
        return this.getCurrency(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrency(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1361:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Currency.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.currencySet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.CurrencyList getCurrencySet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1376:5
        return this.getCurrencySet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.CurrencyList getCurrencySet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1376:5
        return this.getCurrencySet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.CurrencyList getCurrencySet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1376:5
        return this.getCurrencySet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.CurrencyList getCurrencySet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1376:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.Currency.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.currencySet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrencyWithKey(final long currencyID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1369:5
        return this.getCurrencyWithKey(currencyID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrencyWithKey(final long currencyID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1369:5
        return this.getCurrencyWithKey(currencyID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrencyWithKey(final long currencyID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1369:5
        return this.getCurrencyWithKey(currencyID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Currency getCurrencyWithKey(final long currencyID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1369:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getCurrency(var_query.withKey(com.example.backend.travelexpense.proxy.Currency.key(currencyID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpense(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1496:5
        return this.getExpense(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpense(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1496:5
        return this.getExpense(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpense(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1496:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Expense.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.expenseSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenseSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1511:5
        return this.getExpenseSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenseSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1511:5
        return this.getExpenseSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenseSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1511:5
        return this.getExpenseSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenseSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1511:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.Expense.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.expenseSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseType(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1631:5
        return this.getExpenseType(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1631:5
        return this.getExpenseType(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1631:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ExpenseType.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.expenseTypeSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.ExpenseTypeList getExpenseTypeSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1646:5
        return this.getExpenseTypeSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseTypeList getExpenseTypeSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1646:5
        return this.getExpenseTypeSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseTypeList getExpenseTypeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1646:5
        return this.getExpenseTypeSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseTypeList getExpenseTypeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1646:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.ExpenseType.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.expenseTypeSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseTypeWithKey(final long expenseTypeID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1639:5
        return this.getExpenseTypeWithKey(expenseTypeID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseTypeWithKey(final long expenseTypeID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1639:5
        return this.getExpenseTypeWithKey(expenseTypeID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseTypeWithKey(final long expenseTypeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1639:5
        return this.getExpenseTypeWithKey(expenseTypeID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ExpenseType getExpenseTypeWithKey(final long expenseTypeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1639:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getExpenseType(var_query.withKey(com.example.backend.travelexpense.proxy.ExpenseType.key(expenseTypeID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpenseWithKey(final long expenseID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1504:5
        return this.getExpenseWithKey(expenseID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpenseWithKey(final long expenseID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1504:5
        return this.getExpenseWithKey(expenseID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpenseWithKey(final long expenseID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1504:5
        return this.getExpenseWithKey(expenseID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Expense getExpenseWithKey(final long expenseID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1504:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getExpense(var_query.withKey(com.example.backend.travelexpense.proxy.Expense.key(expenseID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentType(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1766:5
        return this.getPaymentType(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1766:5
        return this.getPaymentType(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentType(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1766:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_PaymentType.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.paymentTypeSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.PaymentTypeList getPaymentTypeSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1781:5
        return this.getPaymentTypeSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentTypeList getPaymentTypeSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1781:5
        return this.getPaymentTypeSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentTypeList getPaymentTypeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1781:5
        return this.getPaymentTypeSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentTypeList getPaymentTypeSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1781:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.PaymentType.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.paymentTypeSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentTypeWithKey(final long paymentTypeID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1774:5
        return this.getPaymentTypeWithKey(paymentTypeID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentTypeWithKey(final long paymentTypeID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1774:5
        return this.getPaymentTypeWithKey(paymentTypeID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentTypeWithKey(final long paymentTypeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1774:5
        return this.getPaymentTypeWithKey(paymentTypeID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.PaymentType getPaymentTypeWithKey(final long paymentTypeID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1774:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getPaymentType(var_query.withKey(com.example.backend.travelexpense.proxy.PaymentType.key(paymentTypeID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.Report getReport(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1901:5
        return this.getReport(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Report getReport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1901:5
        return this.getReport(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Report getReport(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1901:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.reportSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.ReportList getReportSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1916:5
        return this.getReportSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportList getReportSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1916:5
        return this.getReportSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportList getReportSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1916:5
        return this.getReportSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ReportList getReportSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1916:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.Report.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.reportSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatus(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2036:5
        return this.getReportStatus(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2036:5
        return this.getReportStatus(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatus(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2036:5
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.executeQuery(query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.reportStatusSet), var_headers, var_options).getRequiredEntity());
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList getReportStatusSet()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2051:5
        return this.getReportStatusSet(null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList getReportStatusSet(final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2051:5
        return this.getReportStatusSet(query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList getReportStatusSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2051:5
        return this.getReportStatusSet(query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList getReportStatusSet(final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2051:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        final com.sap.cloud.server.odata.http.HttpHeaders var_headers = com.sap.cloud.server.odata.http.HttpHeaders.emptyIfNull(headers);
        final com.sap.cloud.server.odata.RequestOptions var_options = com.sap.cloud.server.odata.RequestOptions.noneIfNull(options);
        return com.example.backend.travelexpense.proxy.ReportStatus.list(this.executeQuery(var_query.fromDefault(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntitySets.reportStatusSet), var_headers, var_options).getEntityList());
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatusWithKey(final long reportStatusID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2044:5
        return this.getReportStatusWithKey(reportStatusID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatusWithKey(final long reportStatusID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2044:5
        return this.getReportStatusWithKey(reportStatusID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatusWithKey(final long reportStatusID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2044:5
        return this.getReportStatusWithKey(reportStatusID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatusWithKey(final long reportStatusID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2044:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getReportStatus(var_query.withKey(com.example.backend.travelexpense.proxy.ReportStatus.key(reportStatusID)), headers, options);
    }

    public com.example.backend.travelexpense.proxy.Report getReportWithKey(final long reportID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1909:5
        return this.getReportWithKey(reportID, null, null, null);
    }

    public com.example.backend.travelexpense.proxy.Report getReportWithKey(final long reportID, final com.sap.cloud.server.odata.DataQuery query)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1909:5
        return this.getReportWithKey(reportID, query, null, null);
    }

    public com.example.backend.travelexpense.proxy.Report getReportWithKey(final long reportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1909:5
        return this.getReportWithKey(reportID, query, headers, null);
    }

    public com.example.backend.travelexpense.proxy.Report getReportWithKey(final long reportID, final com.sap.cloud.server.odata.DataQuery query, final com.sap.cloud.server.odata.http.HttpHeaders headers, final com.sap.cloud.server.odata.RequestOptions options)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1909:5
        final com.sap.cloud.server.odata.DataQuery var_query = com.sap.cloud.server.odata.DataQuery.newIfNull(query);
        return this.getReport(var_query.withKey(com.example.backend.travelexpense.proxy.Report.key(reportID)), headers, options);
    }

    @java.lang.Override public void refreshMetadata()
    {
        synchronized (this)
        {
            //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:1220:19
            com.sap.cloud.server.odata.ProxyInternal.noRefreshMetadata();
        }
    }
}
