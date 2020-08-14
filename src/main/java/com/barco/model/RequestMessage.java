package com.barco.model;

import com.google.gson.Gson;


public class RequestMessage {

    private String ref;

    public RequestMessage() { }

    public RequestMessage(String ref) { this.ref = ref; }

    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
