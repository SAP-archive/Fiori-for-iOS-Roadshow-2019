//# xsc 19.4.0-0adeb1-20190425

package com.example.backend.travelexpense.proxy.internal;

public abstract class Any_as_com_example_backend_travelexpense_proxy_PaymentType
{
    public static com.example.backend.travelexpense.proxy.PaymentType cast(final Object value)
    {
        //# /usr/sap/ljs/xs-temp/11180dad-e520-4efc-8db6-be2ea70cc440/output/target/tmp/proxy-com.example.backend.travelexpense.csdl.xs:2228:39 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:88:16 => /usr/sap/ljs/xs-temp/xs-home/templates/Any.as.xs:7:12
        if (value instanceof com.example.backend.travelexpense.proxy.PaymentType)
        {
            final com.example.backend.travelexpense.proxy.PaymentType var_value = ((com.example.backend.travelexpense.proxy.PaymentType)value);
            return var_value;
        }
        else
        {
            throw com.sap.cloud.server.odata.core.CastException.cannotCast(value, "com.example.backend.travelexpense.proxy.PaymentType");
        }
    }
}
