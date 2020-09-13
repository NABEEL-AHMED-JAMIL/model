package com.barco.model.wsm;

import com.google.gson.Gson;

public class ResponseMessage {

    private Object message;
    // possible reference service-1,service-2,service-3
    private String requestRef;

    public ResponseMessage() { }

    public ResponseMessage(String message, String requestRef) {
        this.message = message;
        this.requestRef = requestRef;
    }

    public String getRequestRef() { return requestRef; }
    public void setRequestRef(String requestRef) { this.requestRef = requestRef; }

    public Object getMessage() { return message; }
    public void setMessage(Object message) { this.message = message; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
