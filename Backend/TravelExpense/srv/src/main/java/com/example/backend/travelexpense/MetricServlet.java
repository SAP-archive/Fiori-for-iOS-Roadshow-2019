package com.example.backend.travelexpense;

@javax.servlet.annotation.WebServlet(
    initParams = {
        @javax.servlet.annotation.WebInitParam(name = "historyTableName", value = "xs_data_metrics"),
        @javax.servlet.annotation.WebInitParam(name = "saveMetricsEvery", value = MetricSettings.SAVE_METRICS_EVERY_PERIOD),
        @javax.servlet.annotation.WebInitParam(name = "retainMetricsFor", value = MetricSettings.RETAIN_METRICS_FOR_PERIOD) },
    loadOnStartup = 0,
    urlPatterns = "/admin/metrics/*")
public class MetricServlet extends com.example.backend.travelexpense.base.MetricServletBase {
    private static final long serialVersionUID = 1L;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        // For customization, see also: MetricSettings.
        super.init(config);
    }
}
