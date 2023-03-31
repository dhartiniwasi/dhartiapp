package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ah4 implements kg4, jg4 {

    /* renamed from: a */
    private final kg4[] f6565a;

    /* renamed from: b */
    private final IdentityHashMap f6566b;

    /* renamed from: c */
    private final ArrayList f6567c = new ArrayList();

    /* renamed from: d */
    private final HashMap f6568d = new HashMap();

    /* renamed from: e */
    private jg4 f6569e;

    /* renamed from: f */
    private ki4 f6570f;

    /* renamed from: g */
    private kg4[] f6571g;

    /* renamed from: h */
    private fi4 f6572h;

    /* renamed from: i */
    private final wf4 f6573i;

    public ah4(wf4 wf4, long[] jArr, kg4[] kg4Arr, byte... bArr) {
        this.f6573i = wf4;
        this.f6565a = kg4Arr;
        this.f6572h = new vf4(new fi4[0]);
        this.f6566b = new IdentityHashMap();
        this.f6571g = new kg4[0];
        for (int i = 0; i < kg4Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f6565a[i] = new yg4(kg4Arr[i], j);
            }
        }
    }

    /* renamed from: U */
    public final ki4 mo8348U() {
        ki4 ki4 = this.f6570f;
        Objects.requireNonNull(ki4);
        return ki4;
    }

    /* renamed from: X */
    public final void mo8349X() throws IOException {
        for (kg4 X : this.f6565a) {
            X.mo8349X();
        }
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        if (this.f6567c.isEmpty()) {
            return this.f6572h.mo8350a(j);
        }
        int size = this.f6567c.size();
        for (int i = 0; i < size; i++) {
            ((kg4) this.f6567c.get(i)).mo8350a(j);
        }
        return false;
    }

    /* renamed from: b */
    public final long mo8351b() {
        long j = -9223372036854775807L;
        for (kg4 kg4 : this.f6571g) {
            long b = kg4.mo8351b();
            if (b != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    kg4[] kg4Arr = this.f6571g;
                    int length = kg4Arr.length;
                    int i = 0;
                    while (i < length) {
                        kg4 kg42 = kg4Arr[i];
                        if (kg42 == kg4) {
                            break;
                        } else if (kg42.mo8362l(b) == b) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = b;
                } else if (b != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || kg4.mo8362l(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        return this.f6572h.mo8352b0();
    }

    /* renamed from: c */
    public final long mo8353c(xj4[] xj4Arr, boolean[] zArr, ci4[] ci4Arr, boolean[] zArr2, long j) {
        int length;
        Integer num;
        int i;
        xj4[] xj4Arr2 = xj4Arr;
        ci4[] ci4Arr2 = ci4Arr;
        int length2 = xj4Arr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = xj4Arr2.length;
            num = 0;
            if (i2 >= length) {
                break;
            }
            ci4 ci4 = ci4Arr2[i2];
            if (ci4 != null) {
                num = (Integer) this.f6566b.get(ci4);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            xj4 xj4 = xj4Arr2[i2];
            if (xj4 != null) {
                gv0 gv0 = (gv0) this.f6568d.get(xj4.mo8851a());
                Objects.requireNonNull(gv0);
                int i3 = 0;
                while (true) {
                    kg4[] kg4Arr = this.f6565a;
                    if (i3 >= kg4Arr.length) {
                        break;
                    } else if (kg4Arr[i3].mo8348U().mo11710a(gv0) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f6566b.clear();
        ci4[] ci4Arr3 = new ci4[length];
        ci4[] ci4Arr4 = new ci4[length];
        xj4[] xj4Arr3 = new xj4[length];
        ArrayList arrayList = new ArrayList(this.f6565a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f6565a.length) {
            for (int i5 = 0; i5 < xj4Arr2.length; i5++) {
                ci4Arr4[i5] = iArr[i5] == i4 ? ci4Arr2[i5] : num;
                if (iArr2[i5] == i4) {
                    xj4 xj42 = xj4Arr2[i5];
                    Objects.requireNonNull(xj42);
                    gv0 gv02 = (gv0) this.f6568d.get(xj42.mo8851a());
                    Objects.requireNonNull(gv02);
                    xj4Arr3[i5] = new xg4(xj42, gv02);
                } else {
                    xj4Arr3[i5] = num;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            ci4[] ci4Arr5 = ci4Arr4;
            xj4[] xj4Arr4 = xj4Arr3;
            long c = this.f6565a[i4].mo8353c(xj4Arr3, zArr, ci4Arr4, zArr2, j2);
            if (i6 == 0) {
                j2 = c;
            } else if (c != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < xj4Arr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    ci4 ci42 = ci4Arr5[i7];
                    Objects.requireNonNull(ci42);
                    ci4Arr3[i7] = ci42;
                    this.f6566b.put(ci42, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (ci4Arr5[i7] != null) {
                        z2 = false;
                    }
                    v91.m22052f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f6565a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            ci4Arr4 = ci4Arr5;
            xj4Arr3 = xj4Arr4;
            num = null;
        }
        System.arraycopy(ci4Arr3, 0, ci4Arr2, 0, length);
        kg4[] kg4Arr2 = (kg4[]) arrayList.toArray(new kg4[0]);
        this.f6571g = kg4Arr2;
        this.f6572h = new vf4(kg4Arr2);
        return j2;
    }

    /* renamed from: d */
    public final long mo8354d() {
        return this.f6572h.mo8354d();
    }

    /* renamed from: e */
    public final long mo8355e() {
        return this.f6572h.mo8355e();
    }

    /* renamed from: f */
    public final long mo8356f(long j, a84 a84) {
        kg4 kg4;
        kg4[] kg4Arr = this.f6571g;
        if (kg4Arr.length > 0) {
            kg4 = kg4Arr[0];
        } else {
            kg4 = this.f6565a[0];
        }
        return kg4.mo8356f(j, a84);
    }

    /* renamed from: g */
    public final void mo8357g(long j, boolean z) {
        for (kg4 g : this.f6571g) {
            g.mo8357g(j, false);
        }
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8358h(fi4 fi4) {
        kg4 kg4 = (kg4) fi4;
        jg4 jg4 = this.f6569e;
        Objects.requireNonNull(jg4);
        jg4.mo8358h(this);
    }

    /* renamed from: i */
    public final void mo8359i(kg4 kg4) {
        this.f6567c.remove(kg4);
        if (this.f6567c.isEmpty()) {
            int i = 0;
            for (kg4 U : this.f6565a) {
                i += U.mo8348U().f12116a;
            }
            gv0[] gv0Arr = new gv0[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                kg4[] kg4Arr = this.f6565a;
                if (i2 < kg4Arr.length) {
                    ki4 U2 = kg4Arr[i2].mo8348U();
                    int i4 = U2.f12116a;
                    int i5 = 0;
                    while (i5 < i4) {
                        gv0 b = U2.mo11711b(i5);
                        gv0 c = b.mo10650c(i2 + ":" + b.f10064b);
                        this.f6568d.put(c, b);
                        gv0Arr[i3] = c;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.f6570f = new ki4(gv0Arr);
                    jg4 jg4 = this.f6569e;
                    Objects.requireNonNull(jg4);
                    jg4.mo8359i(this);
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public final kg4 mo8360j(int i) {
        kg4 kg4 = this.f6565a[i];
        return kg4 instanceof yg4 ? ((yg4) kg4).f20615a : kg4;
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
        this.f6572h.mo8361j0(j);
    }

    /* renamed from: l */
    public final long mo8362l(long j) {
        long l = this.f6571g[0].mo8362l(j);
        int i = 1;
        while (true) {
            kg4[] kg4Arr = this.f6571g;
            if (i >= kg4Arr.length) {
                return l;
            }
            if (kg4Arr[i].mo8362l(l) == l) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: o */
    public final void mo8363o(jg4 jg4, long j) {
        this.f6569e = jg4;
        Collections.addAll(this.f6567c, this.f6565a);
        for (kg4 o : this.f6565a) {
            o.mo8363o(this, j);
        }
    }
}
