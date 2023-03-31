package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.onesignal.u */
/* compiled from: GoogleApiClientCompatProxy */
class C8621u {

    /* renamed from: a */
    private final GoogleApiClient f36060a;

    /* renamed from: b */
    private final Class f36061b;

    C8621u(GoogleApiClient googleApiClient) {
        this.f36060a = googleApiClient;
        this.f36061b = googleApiClient.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28231a() {
        try {
            this.f36061b.getMethod("connect", new Class[0]).invoke(this.f36060a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28232b() {
        try {
            this.f36061b.getMethod("disconnect", new Class[0]).invoke(this.f36060a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public GoogleApiClient mo28233c() {
        return this.f36060a;
    }
}
