//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class ReportStatus
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property description = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus.getProperty("Description");

    public static final com.sap.cloud.server.odata.Property reportStatusID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus.getProperty("ReportStatusID");

    public static final com.sap.cloud.server.odata.Property reports = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus.getProperty("Reports");

    public ReportStatus()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:941:5
        this(true);
    }

    public ReportStatus(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:941:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus copy()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:926:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.copyEntity());
    }

    public String getDescription()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:960:5
        return com.sap.cloud.server.odata.StringValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.ReportStatus.description));
    }

    public com.example.backend.travelexpense.proxy.ReportStatus getOld()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:921:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getOldEntity());
    }

    public long getReportStatusID()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:973:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.ReportStatus.reportStatusID));
    }

    public com.example.backend.travelexpense.proxy.ReportList getReports()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:986:5
        return com.example.backend.travelexpense.proxy.ReportList.share(com.sap.cloud.server.odata.EntityValueList.castRequired(this.getDataValue(com.example.backend.travelexpense.proxy.ReportStatus.reports)));
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:914:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long reportStatusID)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:931:12
        return new com.sap.cloud.server.odata.EntityKey().with("ReportStatusID", com.sap.cloud.server.odata.LongValue.of(reportStatusID));
    }

    public static com.example.backend.travelexpense.proxy.ReportStatusList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:936:12
        return com.example.backend.travelexpense.proxy.ReportStatusList.share(from);
    }

    public void setDescription(final String value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:965:5
        this.setDataValue(com.example.backend.travelexpense.proxy.ReportStatus.description, com.sap.cloud.server.odata.StringValue.of(value));
    }

    public void setReportStatusID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:978:5
        this.setDataValue(com.example.backend.travelexpense.proxy.ReportStatus.reportStatusID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setReports(final com.example.backend.travelexpense.proxy.ReportList value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:991:5
        com.example.backend.travelexpense.proxy.ReportStatus.reports.setEntityList(this, com.sap.cloud.server.odata.EntityValueList.share(value));
    }
}
