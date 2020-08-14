package com.barco.model;

import com.google.gson.Gson;

public class ResponseMessage {

    private String message;
    private String requestRef;

    public ResponseMessage() { }

    public ResponseMessage(String message, String requestRef) {
        this.message = message;
        this.requestRef = requestRef;
    }

    public String getRequestRef() { return requestRef; }
    public void setRequestRef(String requestRef) { this.requestRef = requestRef; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
