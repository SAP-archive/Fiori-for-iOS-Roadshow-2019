//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy;

public class ReportStatusList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<com.example.backend.travelexpense.proxy.ReportStatus>
{
    public static final com.example.backend.travelexpense.proxy.ReportStatusList empty = new com.example.backend.travelexpense.proxy.ReportStatusList(java.lang.Integer.MIN_VALUE);

    public ReportStatusList()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public ReportStatusList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final com.example.backend.travelexpense.proxy.ReportStatusList list)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList addThis(final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList copy()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public com.example.backend.travelexpense.proxy.ReportStatus first()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getUntypedList().first());
    }

    public static com.example.backend.travelexpense.proxy.ReportStatusList from(final java.util.List<com.example.backend.travelexpense.proxy.ReportStatus> list)
    {
        return ReportStatusList.share(new com.sap.cloud.server.odata.core.GenericList<com.example.backend.travelexpense.proxy.ReportStatus>(list).toAnyList());
    }

    public com.example.backend.travelexpense.proxy.ReportStatus get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final com.example.backend.travelexpense.proxy.ReportStatus item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final com.example.backend.travelexpense.proxy.ReportStatusList list)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<com.example.backend.travelexpense.proxy.ReportStatus> iterator()
    {
        return this.toGeneric().iterator();
    }

    public com.example.backend.travelexpense.proxy.ReportStatus last()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final com.example.backend.travelexpense.proxy.ReportStatus item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final com.example.backend.travelexpense.proxy.ReportStatus item)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static com.example.backend.travelexpense.proxy.ReportStatusList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final com.example.backend.travelexpense.proxy.ReportStatusList result = new com.example.backend.travelexpense.proxy.ReportStatusList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof com.example.backend.travelexpense.proxy.ReportStatus)
                {
                    final com.example.backend.travelexpense.proxy.ReportStatus var_item = ((com.example.backend.travelexpense.proxy.ReportStatus)item);
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

    public com.example.backend.travelexpense.proxy.ReportStatus single()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return com.example.backend.travelexpense.proxy.internal.Any_as_com_example_backend_travelexpense_proxy_ReportStatus.cast(this.getUntypedList().single());
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public com.example.backend.travelexpense.proxy.ReportStatusList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2256:40 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final com.example.backend.travelexpense.proxy.ReportStatusList result = new com.example.backend.travelexpense.proxy.ReportStatusList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2258:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2263:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(com.example.backend.travelexpense.proxy.TravelexpenseServiceMetadata.EntityTypes.reportStatus);
    }

    public java.util.List<com.example.backend.travelexpense.proxy.ReportStatus> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<com.example.backend.travelexpense.proxy.ReportStatus>(this);
    }
}
