package com.microservices.polarflow.api.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "integration.calendar")
public class CalendarIntegrationConfiguration {

    private String host;
    private String port;
    private String path;
    private String googleCalendarKey;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getGoogleCalendarKey() {
        return googleCalendarKey;
    }

    public void setGoogleCalendarKey(String googleCalendarKey) {
        this.googleCalendarKey = googleCalendarKey;
    }
}