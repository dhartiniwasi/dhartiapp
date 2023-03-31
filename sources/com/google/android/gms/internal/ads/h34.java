package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class h34 implements C2283db {

    /* renamed from: r */
    private static final t34 f10177r = t34.m20792b(h34.class);

    /* renamed from: a */
    protected final String f10178a;

    /* renamed from: b */
    private C2320eb f10179b;

    /* renamed from: c */
    boolean f10180c;

    /* renamed from: d */
    boolean f10181d;

    /* renamed from: e */
    private ByteBuffer f10182e;

    /* renamed from: f */
    long f10183f;

    /* renamed from: g */
    long f10184g = -1;

    /* renamed from: h */
    m34 f10185h;

    /* renamed from: i */
    private ByteBuffer f10186i = null;

    protected h34(String str) {
        this.f10178a = str;
        this.f10181d = true;
        this.f10180c = true;
    }

    /* renamed from: b */
    private final synchronized void m13698b() {
        String str;
        if (!this.f10181d) {
            try {
                t34 t34 = f10177r;
                String str2 = this.f10178a;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                t34.mo12523a(str);
                this.f10182e = this.f10185h.mo12270B1(this.f10183f, this.f10184g);
                this.f10181d = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo9498a(m34 m34, ByteBuffer byteBuffer, long j, C2172ab abVar) throws IOException {
        this.f10183f = m34.mo12271d();
        byteBuffer.remaining();
        this.f10184g = j;
        this.f10185h = m34;
        m34.mo12273l(m34.mo12271d() + j);
        this.f10181d = false;
        this.f10180c = false;
        mo10728d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo10451c(ByteBuffer byteBuffer);

    /* renamed from: d */
    public final synchronized void mo10728d() {
        String str;
        m13698b();
        t34 t34 = f10177r;
        String str2 = this.f10178a;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        t34.mo12523a(str);
        ByteBuffer byteBuffer = this.f10182e;
        if (byteBuffer != null) {
            this.f10180c = true;
            byteBuffer.rewind();
            mo10451c(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f10186i = byteBuffer.slice();
            }
            this.f10182e = null;
        }
    }

    /* renamed from: f */
    public final void mo9499f(C2320eb ebVar) {
        this.f10179b = ebVar;
    }

    public final String zza() {
        return this.f10178a;
    }
}
