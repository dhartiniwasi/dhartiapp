package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C6944e9;
import com.google.android.gms.internal.measurement.C6995h9;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C6944e9<MessageType extends C6995h9<MessageType, BuilderType>, BuilderType extends C6944e9<MessageType, BuilderType>> extends C7105o7<MessageType, BuilderType> {

    /* renamed from: a */
    private final C6995h9 f31668a;

    /* renamed from: b */
    protected C6995h9 f31669b;

    protected C6944e9(MessageType messagetype) {
        this.f31668a = messagetype;
        if (!messagetype.mo23498w()) {
            this.f31669b = messagetype.mo23493j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: h */
    private static void m39956h(Object obj, Object obj2) {
        C7220va.m41045a().mo23957b(obj.getClass()).mo23787f(obj, obj2);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C7105o7 mo23353f(byte[] bArr, int i, int i2) throws C7139q9 {
        mo23356j(bArr, 0, i2, C7186t8.f32111c);
        return this;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C7105o7 mo23354g(byte[] bArr, int i, int i2, C7186t8 t8Var) throws C7139q9 {
        mo23356j(bArr, 0, i2, t8Var);
        return this;
    }

    /* renamed from: i */
    public final C6944e9 mo23355i(C6995h9 h9Var) {
        if (!this.f31668a.equals(h9Var)) {
            if (!this.f31669b.mo23498w()) {
                mo23360n();
            }
            m39956h(this.f31669b, h9Var);
        }
        return this;
    }

    /* renamed from: j */
    public final C6944e9 mo23356j(byte[] bArr, int i, int i2, C7186t8 t8Var) throws C7139q9 {
        if (!this.f31669b.mo23498w()) {
            mo23360n();
        }
        try {
            C7220va.m41045a().mo23957b(this.f31669b.getClass()).mo23790i(this.f31669b, bArr, 0, i2, new C7169s7(t8Var));
            return this;
        } catch (C7139q9 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C7139q9.m40667f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo23357k() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.h9 r0 = r5.mo23362q()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo23001B(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.va r3 = com.google.android.gms.internal.measurement.C7220va.m41045a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.ya r3 = r3.mo23957b(r4)
            boolean r3 = r3.mo23785d(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo23001B(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.pb r1 = new com.google.android.gms.internal.measurement.pb
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6944e9.mo23357k():com.google.android.gms.internal.measurement.h9");
    }

    /* renamed from: l */
    public MessageType mo23362q() {
        if (!this.f31669b.mo23498w()) {
            return this.f31669b;
        }
        this.f31669b.mo23494s();
        return this.f31669b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo23359m() {
        if (!this.f31669b.mo23498w()) {
            mo23360n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo23360n() {
        C6995h9 j = this.f31668a.mo23493j();
        m39956h(j, this.f31669b);
        this.f31669b = j;
    }

    /* renamed from: o */
    public final C6944e9 clone() {
        C6944e9 e9Var = (C6944e9) this.f31668a.mo23001B(5, (Object) null, (Object) null);
        e9Var.f31669b = mo23362q();
        return e9Var;
    }
}
