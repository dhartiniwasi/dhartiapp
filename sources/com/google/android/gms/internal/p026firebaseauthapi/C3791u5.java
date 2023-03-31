package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3791u5 implements C3594o6 {

    /* renamed from: a */
    private final OutputStream f22766a;

    private C3791u5(OutputStream outputStream) {
        this.f22766a = outputStream;
    }

    /* renamed from: c */
    public static C3594o6 m27102c(OutputStream outputStream) {
        return new C3791u5(outputStream);
    }

    /* renamed from: a */
    public final void mo15730a(C3276ei eiVar) throws IOException {
        throw null;
    }

    /* renamed from: b */
    public final void mo15731b(C3902xj xjVar) throws IOException {
        try {
            xjVar.mo16524c(this.f22766a);
        } finally {
            this.f22766a.close();
        }
    }
}
