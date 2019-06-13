// Note: Customizations placed in this file might be lost if the OData service is regenerated!
// Please place your customizations in the MainServlet class in the parent folder.

package com.example.backend.travelexpense.base;

import com.sap.cloud.server.odata.*;

public abstract class MainServletBase extends DataServlet {
    private static final long serialVersionUID = 1L;

    public InMemoryDatabase provider;

    public com.example.backend.travelexpense.proxy.TravelexpenseService service;

    public org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(com.example.backend.travelexpense.LogSettings.LOGGER_NAME);

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        super.init(config);
        this.setTraceRequests(logger.isDebugEnabled() | com.example.backend.travelexpense.LogSettings.LOG_DEBUG | com.example.backend.travelexpense.LogSettings.LOG_TRACE);
        this.setTraceWithData(logger.isTraceEnabled() | com.example.backend.travelexpense.LogSettings.LOG_TRACE);
        this.setPrettyTracing(com.example.backend.travelexpense.LogSettings.PRETTY_TRACING);
        this.setDefaultPageSize(1000);
        this.setMaximumGraphSize(10000);
        this.setAllowNestedPaging(false);
        this.setAllowNonPatchUpdates(false);
        this.setTrackChangesByDefault(true);
        this.setRequiresAuthentication(false);
        this.setSupportsRepeatability(true);
        this.setSupportsTransaction(false);
        provider = new InMemoryDatabase("TravelexpenseService");
        com.example.backend.travelexpense.ProviderSettings.init((com.example.backend.travelexpense.MainServlet)this);
        com.example.backend.travelexpense.ProviderSettings.init(provider);
        service = new com.example.backend.travelexpense.proxy.TravelexpenseService(provider);
        RegisterHandlers.withServlet((com.example.backend.travelexpense.MainServlet)this);
        RegisterListeners.withServlet((com.example.backend.travelexpense.MainServlet)this);
        service.getMetadata().addRepeatability();
        service.getMetadata().inheritAnnotations();
        service.getMetadata().applyAnnotations();
        service.getMetadata().removeServerOnly("SQL");
        service.getMetadata().removeReferences("SQL");
        provider.createSchema();
        this.loadInitialData(com.example.backend.travelexpense.TestSettings.TEST_MODE);
        logger.info("Started " + service.getName());
    }

    public void destroy() {
        logger.info("Stopped " + service.getName());
    }

    public DataService getDataService() {
        return service;
    }
}
