//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class ReportList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.example.backend.travelexpense.proxy.Report>
{
    public static final com.example.backend.travelexpense.proxy.ReportList empty = new com.example.backend.travelexpense.proxy.ReportList(java.lang.Integer.MIN_VALUE);

    public ReportList()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public ReportList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.example.backend.travelexpense.proxy.ReportList list)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.example.backend.travelexpense.proxy.ReportList addThis(final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.example.backend.travelexpense.proxy.ReportList copy()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.example.backend.travelexpense.proxy.Report first()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getUntypedList().first());
    }

    public static com.example.backend.travelexpense.proxy.ReportList from(final java.util.List<com.example.backend.travelexpense.proxy.Report> list)
    {
        return ReportList.share(new com.sap.cloud.server.odata.core.GenericList<com.example.backend.travelexpense.proxy.Report>(list).toAnyList());
    }

    public com.example.backend.travelexpense.proxy.Report get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.example.backend.travelexpense.proxy.Report item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.example.backend.travelexpense.proxy.ReportList list)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.example.backend.travelexpense.proxy.Report> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.example.backend.travelexpense.proxy.Report last()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.example.backend.travelexpense.proxy.Report item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.example.backend.travelexpense.proxy.Report item)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.example.backend.travelexpense.proxy.ReportList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.example.backend.travelexpense.proxy.ReportList result = new com.example.backend.travelexpense.proxy.ReportList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.example.backend.travelexpense.proxy.Report)
                {
                    final com.example.backend.travelexpense.proxy.Report var_item = ((com.example.backend.travelexpense.proxy.Report)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public com.example.backend.travelexpense.proxy.Report single()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_Report.cast(this.getUntypedList().single());
    }

    public com.example.backend.travelexpense.proxy.ReportList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.example.backend.travelexpense.proxy.ReportList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2227:34 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.example.backend.travelexpense.proxy.ReportList result = new com.example.backend.travelexpense.proxy.ReportList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2229:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2234:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.report);
    }

    public java.util.List<com.example.backend.travelexpense.proxy.Report> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.example.backend.travelexpense.proxy.Report>(this);
    }
}
