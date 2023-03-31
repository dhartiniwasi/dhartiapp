package com.startapp.sdk.adsbase;

import com.startapp.C8870c1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1;
    private String errorMessage = null;
    public Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;

    /* renamed from: a */
    public String mo30487a() {
        return this.errorMessage;
    }

    /* renamed from: b */
    public boolean mo30488b() {
        return this.validResponse;
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("BaseResponse [parameters=");
        a.append(this.parameters);
        a.append(", validResponse=");
        a.append(this.validResponse);
        a.append(", errorMessage=");
        a.append(this.errorMessage);
        a.append("]");
        return a.toString();
    }
}
