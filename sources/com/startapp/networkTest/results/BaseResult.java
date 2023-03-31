package com.startapp.networkTest.results;

import com.startapp.C8821a5;

/* compiled from: Sta */
public class BaseResult implements Cloneable {
    public String GUID = "";
    public String ProjectId = "";
    public String Version = C8821a5.f36404i;

    public BaseResult(String str, String str2) {
        this.ProjectId = str;
        this.GUID = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
