package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.internal.p026firebaseauthapi.C3588o0;
import com.google.android.gms.internal.p026firebaseauthapi.C3621p0;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3621p0<MessageType extends C3621p0<MessageType, BuilderType>, BuilderType extends C3588o0<MessageType, BuilderType>> implements C3591o3 {
    protected int zza = 0;

    /* renamed from: Y */
    public final C3325g1 mo16477Y() {
        try {
            int d0 = mo16201d0();
            C3325g1 g1Var = C3325g1.f22056b;
            byte[] bArr = new byte[d0];
            C3688r1 h = C3688r1.m26672h(bArr);
            mo16199a(h);
            h.mo16663j();
            return new C3193c1(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16200b(C3130a4 a4Var) {
        throw null;
    }

    /* renamed from: c */
    public final void mo16524c(OutputStream outputStream) throws IOException {
        C3688r1 i = C3688r1.m26673i(outputStream, C3688r1.m26667c(mo16201d0()));
        mo16199a(i);
        i.mo16440m();
    }

    /* renamed from: h */
    public final byte[] mo16478h() {
        try {
            byte[] bArr = new byte[mo16201d0()];
            C3688r1 h = C3688r1.m26672h(bArr);
            mo16199a(h);
            h.mo16663j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
