package com.example.backend.travelexpense.handler;

import com.sap.cloud.server.odata.*;

public class ExpenseTypeHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.example.backend.travelexpense.MainServlet servlet;
    private com.example.backend.travelexpense.proxy.TravelexpenseService service;

    public ExpenseTypeHandler(com.example.backend.travelexpense.MainServlet servlet, com.example.backend.travelexpense.proxy.TravelexpenseService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.ExpenseType entity = (com.example.backend.travelexpense.proxy.ExpenseType)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.ExpenseType entity = (com.example.backend.travelexpense.proxy.ExpenseType)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.ExpenseType entity = (com.example.backend.travelexpense.proxy.ExpenseType)entityValue;
        service.deleteEntity(entity);
    }
}
