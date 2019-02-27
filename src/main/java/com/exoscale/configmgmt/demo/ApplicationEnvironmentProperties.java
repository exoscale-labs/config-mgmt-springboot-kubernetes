package com.exoscale.configmgmt.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app")
@Component
public class ApplicationEnvironmentProperties {

    private final Env env = new Env();

    public Env getEnv() {
        return env;
    }

    public static final class Env {

        private String label;
        private String color;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}