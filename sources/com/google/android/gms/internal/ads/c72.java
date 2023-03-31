package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class c72 implements fk1 {

    /* renamed from: b */
    private static final List f7636b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f7637a;

    public c72(Handler handler) {
        this.f7637a = handler;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m10728a(b62 b62) {
        List list = f7636b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(b62);
            }
        }
    }

    /* renamed from: b */
    private static b62 m10729b() {
        b62 b62;
        List list = f7636b;
        synchronized (list) {
            if (list.isEmpty()) {
                b62 = new b62((a52) null);
            } else {
                b62 = (b62) list.remove(list.size() - 1);
            }
        }
        return b62;
    }

    /* renamed from: g */
    public final ej1 mo9034g(int i) {
        b62 b = m10729b();
        b.mo8681a(this.f7637a.obtainMessage(i), this);
        return b;
    }

    /* renamed from: i0 */
    public final boolean mo9035i0(int i) {
        return this.f7637a.sendEmptyMessage(i);
    }

    /* renamed from: n */
    public final void mo9036n(int i) {
        this.f7637a.removeMessages(2);
    }

    /* renamed from: p */
    public final boolean mo9037p(int i) {
        return this.f7637a.hasMessages(0);
    }

    /* renamed from: q */
    public final boolean mo9038q(ej1 ej1) {
        return ((b62) ej1).mo8682b(this.f7637a);
    }

    /* renamed from: r */
    public final boolean mo9039r(Runnable runnable) {
        return this.f7637a.post(runnable);
    }

    /* renamed from: s */
    public final ej1 mo9040s(int i, Object obj) {
        b62 b = m10729b();
        b.mo8681a(this.f7637a.obtainMessage(i, obj), this);
        return b;
    }

    /* renamed from: t */
    public final void mo9041t(Object obj) {
        this.f7637a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: u */
    public final ej1 mo9042u(int i, int i2, int i3) {
        b62 b = m10729b();
        b.mo8681a(this.f7637a.obtainMessage(1, i2, i3), this);
        return b;
    }

    /* renamed from: v */
    public final boolean mo9043v(int i, long j) {
        return this.f7637a.sendEmptyMessageAtTime(2, j);
    }
}
