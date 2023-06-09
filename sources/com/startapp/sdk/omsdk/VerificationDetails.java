package com.startapp.sdk.omsdk;

import java.io.Serializable;

/* compiled from: Sta */
public class VerificationDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private String javascriptResourceUrl;
    private String vendorKey;
    private String verificationParameters;

    public VerificationDetails() {
    }

    /* renamed from: a */
    public String mo31232a() {
        return this.vendorKey;
    }

    /* renamed from: b */
    public String mo31233b() {
        return this.verificationParameters;
    }

    /* renamed from: c */
    public String mo31234c() {
        return this.javascriptResourceUrl;
    }

    public VerificationDetails(String str, String str2, String str3) {
        this.vendorKey = str;
        this.javascriptResourceUrl = str2;
        this.verificationParameters = str3;
    }
}
