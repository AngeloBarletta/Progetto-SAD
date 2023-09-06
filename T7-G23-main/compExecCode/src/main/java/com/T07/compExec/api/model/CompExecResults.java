package com.T07.compExec.api.model;

public class CompExecResults {

    private int idResult;
    private String resMessage;
    private String pathCoverage;

    public CompExecResults () {
        this.idResult = -1;
        this.resMessage = "";
        this.pathCoverage = "";
    }

    public CompExecResults (int idResult, String errMessage, String pathCoverage) {
        this.idResult = idResult;
        this.resMessage = errMessage;
        this.pathCoverage = pathCoverage;
    }

    public int getIdResult () {
        return idResult;
    }

    public void setIdResult (int idResult) {
        this.idResult = idResult;
    }

    public String getResMessage () {
        return resMessage;
    }

    public void setResMessage (String errMessage) {
        this.resMessage = errMessage;
    }

    public String getPathCoverage () {
        return pathCoverage;
    }

    public void setPathCoverage (String pathCoverage) {
        this.pathCoverage = pathCoverage;
    }

}
