//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class Report
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property city = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("City");

    public static final com.sap.cloud.server.odata.Property costCenter = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("CostCenter");

    public static final com.sap.cloud.server.odata.Property country = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("Country");

    public static final com.sap.cloud.server.odata.Property end = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("End");

    public static final com.sap.cloud.server.odata.Property name = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("Name");

    public static final com.sap.cloud.server.odata.Property reportID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("ReportID");

    public static final com.sap.cloud.server.odata.Property reportStatusID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("ReportStatusID");

    public static final com.sap.cloud.server.odata.Property start = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("Start");

    public static final com.sap.cloud.server.odata.Property state = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("State");

    public static final com.sap.cloud.server.odata.Property expenses = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("Expenses");

    public static final com.sap.cloud.server.odata.Property reportStatus = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report.getProperty("ReportStatus");

    public Report()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:745:5
        this(true);
    }

    public Report(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:745:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report);
    }

    public com.example.backend.travelexpense.proxy.Report copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:730:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.copyEntity());
    }

    public String getCity()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:780:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.city));
    }

    public String getCostCenter()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:793:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.costCenter));
    }

    public String getCountry()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:806:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.country));
    }

    public com.sap.cloud.server.odata.LocalDateTime getEnd()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:819:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Report.end));
    }

    public com.example.backend.travelexpense.proxy.ExpenseList getExpenses()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:897:5
        return com.example.backend.travelexpense.proxy.ExpenseList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Report.expenses)));
    }

    public String getName()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:832:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.name));
    }

    public com.example.backend.travelexpense.proxy.Report getOld()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:725:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getOldEntity());
    }

    public long getReportID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:845:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.reportID));
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getReportStatus()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:910:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Report.reportStatus));
    }

    public long getReportStatusID()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:858:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Report.reportStatusID));
    }

    public com.sap.cloud.server.odata.LocalDateTime getStart()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:871:5
        return com.sap.cloud.server.odata.LocalDateTime.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.Report.start));
    }

    public String getState()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:884:5
        return com.sap.cloud.server.odata.StringValue.toNullable(this.getDataValue(com.example.backend.travelexpense.proxy.Report.state));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:718:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long reportID)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:735:12
        return new com.sap.cloud.server.odata.EntityKey().with("ReportID", com.sap.cloud.server.odata.LongValue.of(reportID));
    }

    public static com.example.backend.travelexpense.proxy.ReportList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:740:12
        return com.example.backend.travelexpense.proxy.ReportList.share(from);
    }

    public void setCity(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:785:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.city, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCostCenter(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:798:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.costCenter, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setCountry(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:811:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.country, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setEnd(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:824:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.end, value);
    }

    public void setExpenses(final com.example.backend.travelexpense.proxy.ExpenseList value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:902:5
        com.example.backend.travelexpense.proxy.Report.expenses.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }

    public void setName(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:837:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.name, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setReportID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:850:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.reportID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setReportStatus(final com.example.backend.travelexpense.proxy.ReportStatus value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:915:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.reportStatus, value);
    }

    public void setReportStatusID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:863:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.reportStatusID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setStart(final com.sap.cloud.server.odata.LocalDateTime value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:876:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.start, value);
    }

    public void setState(final String value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:889:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Report.state, com.sap.cloud.server.odata.StringValue.ofNullable(value));
    }
}
