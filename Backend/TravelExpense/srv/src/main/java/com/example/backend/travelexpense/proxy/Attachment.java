//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class Attachment
    extends com.sap.cloud.server.odata.EntityValue
{
    public static final com.sap.cloud.server.odata.Property attachmentID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment.getProperty("AttachmentID");

    public static final com.sap.cloud.server.odata.Property expenseID = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment.getProperty("ExpenseID");

    public static final com.sap.cloud.server.odata.Property image = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment.getProperty("Image");

    public static final com.sap.cloud.server.odata.Property expense = com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment.getProperty("Expense");

    public Attachment()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:35:5
        this(true);
    }

    public Attachment(final boolean withDefaults)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:35:5
        super(withDefaults, com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.attachment);
    }

    public com.example.backend.travelexpense.proxy.Attachment copy()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:20:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Attachment.cast(this.copyEntity());
    }

    public long getAttachmentID()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:56:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Attachment.attachmentID));
    }

    public com.example.backend.travelexpense.proxy.Expense getExpense()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:95:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Expense.cast(this.getDataValue(com.example.backend.travelexpense.proxy.Attachment.expense));
    }

    public long getExpenseID()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:69:5
        return com.sap.cloud.server.odata.LongValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Attachment.expenseID));
    }

    public byte[] getImage()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:82:5
        return com.sap.cloud.server.odata.BinaryValue.unwrap(this.getDataValue(com.example.backend.travelexpense.proxy.Attachment.image));
    }

    public com.example.backend.travelexpense.proxy.Attachment getOld()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:15:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Attachment.cast(this.getOldEntity());
    }

    @java.lang.Override public boolean isProxy()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:8:5
        return true;
    }

    public static com.sap.cloud.server.odata.EntityKey key(final long attachmentID)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:25:12
        return new com.sap.cloud.server.odata.EntityKey().with("AttachmentID", com.sap.cloud.server.odata.LongValue.of(attachmentID));
    }

    public static com.example.backend.travelexpense.proxy.AttachmentList list(final com.sap.cloud.server.odata.EntityValueList from)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:30:12
        return com.example.backend.travelexpense.proxy.AttachmentList.share(from);
    }

    public void setAttachmentID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:61:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Attachment.attachmentID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setExpense(final com.example.backend.travelexpense.proxy.Expense value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:100:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Attachment.expense, value);
    }

    public void setExpenseID(final long value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:74:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Attachment.expenseID, com.sap.cloud.server.odata.LongValue.of(value));
    }

    public void setImage(final byte[] value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:87:5
        this.setDataValue(com.example.backend.travelexpense.proxy.Attachment.image, com.sap.cloud.server.odata.BinaryValue.of(value));
    }
}
