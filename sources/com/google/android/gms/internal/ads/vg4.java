package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vg4 {

    /* renamed from: a */
    public final int f19089a;

    /* renamed from: b */
    public final mg4 f19090b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f19091c;

    public vg4() {
        this(new CopyOnWriteArrayList(), 0, (mg4) null, 0);
    }

    private vg4(CopyOnWriteArrayList copyOnWriteArrayList, int i, mg4 mg4, long j) {
        this.f19091c = copyOnWriteArrayList;
        this.f19089a = i;
        this.f19090b = mg4;
    }

    /* renamed from: n */
    private static final long m22218n(long j) {
        long j0 = gb2.m13176j0(j);
        if (j0 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j0;
    }

    /* renamed from: a */
    public final vg4 mo14751a(int i, mg4 mg4, long j) {
        return new vg4(this.f19091c, i, mg4, 0);
    }

    /* renamed from: b */
    public final void mo14752b(Handler handler, wg4 wg4) {
        Objects.requireNonNull(wg4);
        this.f19091c.add(new ug4(handler, wg4));
    }

    /* renamed from: c */
    public final void mo14753c(ig4 ig4) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            gb2.m13191y(ug4.f18530a, new pg4(this, ug4.f18531b, ig4));
        }
    }

    /* renamed from: d */
    public final void mo14754d(int i, C2388g4 g4Var, int i2, Object obj, long j) {
        mo14753c(new ig4(1, i, g4Var, 0, (Object) null, m22218n(j), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo14755e(cg4 cg4, ig4 ig4) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            gb2.m13191y(ug4.f18530a, new qg4(this, ug4.f18531b, cg4, ig4));
        }
    }

    /* renamed from: f */
    public final void mo14756f(cg4 cg4, int i, int i2, C2388g4 g4Var, int i3, Object obj, long j, long j2) {
        cg4 cg42 = cg4;
        mo14755e(cg4, new ig4(1, -1, (C2388g4) null, 0, (Object) null, m22218n(j), m22218n(j2)));
    }

    /* renamed from: g */
    public final void mo14757g(cg4 cg4, ig4 ig4) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            gb2.m13191y(ug4.f18530a, new tg4(this, ug4.f18531b, cg4, ig4));
        }
    }

    /* renamed from: h */
    public final void mo14758h(cg4 cg4, int i, int i2, C2388g4 g4Var, int i3, Object obj, long j, long j2) {
        cg4 cg42 = cg4;
        mo14757g(cg4, new ig4(1, -1, (C2388g4) null, 0, (Object) null, m22218n(j), m22218n(j2)));
    }

    /* renamed from: i */
    public final void mo14759i(cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            gb2.m13191y(ug4.f18530a, new rg4(this, ug4.f18531b, cg4, ig4, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo14760j(cg4 cg4, int i, int i2, C2388g4 g4Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        cg4 cg42 = cg4;
        mo14759i(cg4, new ig4(1, -1, (C2388g4) null, 0, (Object) null, m22218n(j), m22218n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void mo14761k(cg4 cg4, ig4 ig4) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            gb2.m13191y(ug4.f18530a, new sg4(this, ug4.f18531b, cg4, ig4));
        }
    }

    /* renamed from: l */
    public final void mo14762l(cg4 cg4, int i, int i2, C2388g4 g4Var, int i3, Object obj, long j, long j2) {
        cg4 cg42 = cg4;
        mo14761k(cg4, new ig4(1, -1, (C2388g4) null, 0, (Object) null, m22218n(j), m22218n(j2)));
    }

    /* renamed from: m */
    public final void mo14763m(wg4 wg4) {
        Iterator it = this.f19091c.iterator();
        while (it.hasNext()) {
            ug4 ug4 = (ug4) it.next();
            if (ug4.f18531b == wg4) {
                this.f19091c.remove(ug4);
            }
        }
    }
}
