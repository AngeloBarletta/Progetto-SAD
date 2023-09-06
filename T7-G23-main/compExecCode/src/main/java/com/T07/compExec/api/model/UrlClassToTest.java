package com.T07.compExec.api.model;

public class UrlClassToTest {

    private String urlClass;
    private String urlTestClass;
/*
    public UrlClassToTest () {
        this.urlClass = "";
        this.urlTestClass = "";
    }
*/
    public UrlClassToTest (String urlClass, String urlTestClass) {
        this.urlClass = urlClass;
        this.urlTestClass = urlTestClass;
    }

    public String getUrlClass () {
        return urlClass;
    }

    public void setUrlClass (String errMessage) {
        this.urlClass = urlClass;
    }

    public String getUrlTestClass () {
        return urlTestClass;
    }

    public void setUrlTestClass (String pathCoverage) {
        this.urlTestClass = urlTestClass;
    }

}
