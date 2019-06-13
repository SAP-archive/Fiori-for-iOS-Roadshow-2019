// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MetricServlet class in the parent folder.

package com.example.backend.travelexpense.base;

import com.sap.cloud.server.odata.*;

public abstract class MetricServletBase extends com.sap.cloud.server.odata.metrics.MetricServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        this.setRequiresAuthentication(false);
        provider = new InMemoryDatabase("TravelExpense.metrics");
        provider.setMetricProvider(true);
        super.init(config, provider);
    }
}
