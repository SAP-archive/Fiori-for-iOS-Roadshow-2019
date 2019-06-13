//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy.internal;

public abstract class Any_as_com_example_backend_travelexpense_proxy_Currency
{
    public static com.example.backend.travelexpense.proxy.Currency cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/0f924fe5-cc65-4d37-90d6-72e0a58bb8dd/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2171:36 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.example.backend.travelexpense.proxy.Currency)
        {
            final com.example.backend.travelexpense.proxy.Currency var_value = ((com.example.backend.travelexpense.proxy.Currency)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.example.backend.travelexpense.proxy.Currency");
        }
    }
}
