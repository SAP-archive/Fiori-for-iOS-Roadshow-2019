package com.example.backend.travelexpense.listener;

import com.sap.cloud.server.odata.*;

public class PaymentTypeListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.example.backend.travelexpense.MainServlet servlet;
    private com.example.backend.travelexpense.proxy.TravelexpenseService service;

    public PaymentTypeListener(com.example.backend.travelexpense.MainServlet servlet, com.example.backend.travelexpense.proxy.TravelexpenseService service) {
        super();
        this.servlet = servlet;
        this.service = service;
    }

    @Override public void beforeQuery(DataQuery query) {
    }

    public void beforeSave(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
        // Shared code for beforeCreate / beforeUpdate.
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.example.backend.travelexpense.proxy.PaymentType entity = (com.example.backend.travelexpense.proxy.PaymentType)entityValue;
    }
}
