package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class gz3 implements wz3 {

    /* renamed from: a */
    private final cz3 f10126a;

    /* renamed from: b */
    private final n04 f10127b;

    /* renamed from: c */
    private final boolean f10128c;

    /* renamed from: d */
    private final fx3 f10129d;

    private gz3(n04 n04, fx3 fx3, cz3 cz3) {
        this.f10127b = n04;
        this.f10128c = fx3.mo10348h(cz3);
        this.f10129d = fx3;
        this.f10126a = cz3;
    }

    /* renamed from: k */
    static gz3 m13635k(n04 n04, fx3 fx3, cz3 cz3) {
        return new gz3(n04, fx3, cz3);
    }

    /* renamed from: a */
    public final Object mo10359a() {
        return this.f10126a.mo9401d().mo8995t0();
    }

    /* renamed from: b */
    public final int mo10360b(Object obj) {
        n04 n04 = this.f10127b;
        int b = n04.mo12488b(n04.mo12490d(obj));
        if (!this.f10128c) {
            return b;
        }
        this.f10129d.mo10341a(obj);
        throw null;
    }

    /* renamed from: c */
    public final int mo10361c(Object obj) {
        int hashCode = this.f10127b.mo12490d(obj).hashCode();
        if (!this.f10128c) {
            return hashCode;
        }
        this.f10129d.mo10341a(obj);
        throw null;
    }

    /* renamed from: d */
    public final boolean mo10362d(Object obj) {
        this.f10129d.mo10341a(obj);
        throw null;
    }

    /* renamed from: e */
    public final void mo10363e(Object obj) {
        this.f10127b.mo12499m(obj);
        this.f10129d.mo10345e(obj);
    }

    /* renamed from: f */
    public final void mo10364f(Object obj, Object obj2) {
        yz3.m24291f(this.f10127b, obj, obj2);
        if (this.f10128c) {
            yz3.m24290e(this.f10129d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo10365g(Object obj, Object obj2) {
        if (!this.f10127b.mo12490d(obj).equals(this.f10127b.mo12490d(obj2))) {
            return false;
        }
        if (!this.f10128c) {
            return true;
        }
        this.f10129d.mo10341a(obj);
        this.f10129d.mo10341a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo10366h(Object obj, nz3 nz3, ex3 ex3) throws IOException {
        boolean z;
        n04 n04 = this.f10127b;
        fx3 fx3 = this.f10129d;
        Object c = n04.mo12489c(obj);
        jx3 b = fx3.mo10342b(obj);
        while (nz3.mo12750e() != Integer.MAX_VALUE) {
            int b2 = nz3.mo12745b();
            if (b2 != 11) {
                if ((b2 & 7) == 2) {
                    Object c2 = fx3.mo10343c(ex3, this.f10126a, b2 >>> 3);
                    if (c2 != null) {
                        fx3.mo10346f(nz3, c2, ex3, b);
                    } else {
                        z = n04.mo12502p(c, nz3);
                    }
                } else {
                    z = nz3.mo12754i();
                }
                if (!z) {
                    n04.mo12500n(obj, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                jw3 jw3 = null;
                while (true) {
                    try {
                        if (nz3.mo12750e() == Integer.MAX_VALUE) {
                            break;
                        }
                        int b3 = nz3.mo12745b();
                        if (b3 == 16) {
                            i = nz3.mo12739W();
                            obj2 = fx3.mo10343c(ex3, this.f10126a, i);
                        } else if (b3 == 26) {
                            if (obj2 != null) {
                                fx3.mo10346f(nz3, obj2, ex3, b);
                            } else {
                                jw3 = nz3.mo12746b0();
                            }
                        } else if (!nz3.mo12754i()) {
                            break;
                        }
                    } catch (Throwable th) {
                        n04.mo12500n(obj, c);
                        throw th;
                    }
                }
                if (nz3.mo12745b() != 12) {
                    throw ey3.m12338b();
                } else if (jw3 != null) {
                    if (obj2 != null) {
                        fx3.mo10347g(jw3, obj2, ex3, b);
                    } else {
                        n04.mo12497k(c, i, jw3);
                    }
                }
            }
        }
        n04.mo12500n(obj, c);
    }

    /* renamed from: i */
    public final void mo10367i(Object obj, ax3 ax3) throws IOException {
        this.f10129d.mo10341a(obj);
        throw null;
    }

    /* renamed from: j */
    public final void mo10368j(Object obj, byte[] bArr, int i, int i2, vv3 vv3) throws IOException {
        sx3 sx3 = (sx3) obj;
        if (sx3.zzc == o04.m17404c()) {
            sx3.zzc = o04.m17406e();
        }
        qx3 qx3 = (qx3) obj;
        throw null;
    }
}
