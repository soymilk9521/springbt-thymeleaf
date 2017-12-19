package com.example.springbthyme.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "com.config.database")
@PropertySource("classpath:config/config.properties")
public class DBConfigBean {
    public String url;
    public String driver;
    public String username;
    public String password;
    public String urlscheme;

    public String getUrlscheme() {
        return urlscheme;
    }

    public void setUrlscheme(String urlscheme) {
        this.urlscheme = urlscheme;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
