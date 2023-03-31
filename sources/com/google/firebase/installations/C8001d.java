package com.google.firebase.installations;

import p246h7.C10421l;

/* renamed from: com.google.firebase.installations.d */
/* compiled from: FirebaseInstallationsException */
public class C8001d extends C10421l {

    /* renamed from: a */
    private final C8002a f34561a;

    /* renamed from: com.google.firebase.installations.d$a */
    /* compiled from: FirebaseInstallationsException */
    public enum C8002a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C8001d(C8002a aVar) {
        this.f34561a = aVar;
    }

    public C8001d(String str, C8002a aVar) {
        super(str);
        this.f34561a = aVar;
    }
}
