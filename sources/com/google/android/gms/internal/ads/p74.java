package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class p74 {

    /* renamed from: a */
    private final bb4 f15720a;

    /* renamed from: b */
    private final List f15721b = new ArrayList();

    /* renamed from: c */
    private final IdentityHashMap f15722c = new IdentityHashMap();

    /* renamed from: d */
    private final Map f15723d = new HashMap();

    /* renamed from: e */
    private final o74 f15724e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final vg4 f15725f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ld4 f15726g;

    /* renamed from: h */
    private final HashMap f15727h;

    /* renamed from: i */
    private final Set f15728i;

    /* renamed from: j */
    private boolean f15729j;

    /* renamed from: k */
    private ve3 f15730k;

    /* renamed from: l */
    private gi4 f15731l = new gi4(0);

    public p74(o74 o74, l84 l84, Handler handler, bb4 bb4) {
        this.f15720a = bb4;
        this.f15724e = o74;
        vg4 vg4 = new vg4();
        this.f15725f = vg4;
        ld4 ld4 = new ld4();
        this.f15726g = ld4;
        this.f15727h = new HashMap();
        this.f15728i = new HashSet();
        vg4.mo14752b(handler, l84);
        ld4.mo11981b(handler, l84);
    }

    /* renamed from: p */
    private final void m18369p(int i, int i2) {
        while (i < this.f15721b.size()) {
            ((n74) this.f15721b.get(i)).f13892d += i2;
            i++;
        }
    }

    /* renamed from: q */
    private final void m18370q(n74 n74) {
        m74 m74 = (m74) this.f15727h.get(n74);
        if (m74 != null) {
            m74.f13250a.mo12327e(m74.f13251b);
        }
    }

    /* renamed from: r */
    private final void m18371r() {
        Iterator it = this.f15728i.iterator();
        while (it.hasNext()) {
            n74 n74 = (n74) it.next();
            if (n74.f13891c.isEmpty()) {
                m18370q(n74);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    private final void m18372s(n74 n74) {
        if (n74.f13893e && n74.f13891c.isEmpty()) {
            m74 m74 = (m74) this.f15727h.remove(n74);
            Objects.requireNonNull(m74);
            m74.f13250a.mo12325a(m74.f13251b);
            m74.f13250a.mo12329g(m74.f13252c);
            m74.f13250a.mo12328f(m74.f13252c);
            this.f15728i.remove(n74);
        }
    }

    /* renamed from: t */
    private final void m18373t(n74 n74) {
        hg4 hg4 = n74.f13889a;
        k74 k74 = new k74(this);
        l74 l74 = new l74(this, n74);
        this.f15727h.put(n74, new m74(hg4, k74, l74));
        hg4.mo12326b(new Handler(gb2.m13165e(), (Handler.Callback) null), l74);
        hg4.mo12333l(new Handler(gb2.m13165e(), (Handler.Callback) null), l74);
        hg4.mo12331i(k74, this.f15730k, this.f15720a);
    }

    /* renamed from: u */
    private final void m18374u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                n74 n74 = (n74) this.f15721b.remove(i2);
                this.f15723d.remove(n74.f13890b);
                m18369p(i2, -n74.f13889a.mo10811C().mo8901c());
                n74.f13893e = true;
                if (this.f15729j) {
                    m18372s(n74);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo13148a() {
        return this.f15721b.size();
    }

    /* renamed from: b */
    public final gt0 mo13149b() {
        if (this.f15721b.isEmpty()) {
            return gt0.f10059a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f15721b.size(); i2++) {
            n74 n74 = (n74) this.f15721b.get(i2);
            n74.f13892d = i;
            i += n74.f13889a.mo10811C().mo8901c();
        }
        return new u74(this.f15721b, this.f15731l, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo13150e(og4 og4, gt0 gt0) {
        this.f15724e.mo12858U();
    }

    /* renamed from: f */
    public final void mo13151f(ve3 ve3) {
        v91.m22052f(!this.f15729j);
        this.f15730k = ve3;
        for (int i = 0; i < this.f15721b.size(); i++) {
            n74 n74 = (n74) this.f15721b.get(i);
            m18373t(n74);
            this.f15728i.add(n74);
        }
        this.f15729j = true;
    }

    /* renamed from: g */
    public final void mo13152g() {
        for (m74 m74 : this.f15727h.values()) {
            try {
                m74.f13250a.mo12325a(m74.f13251b);
            } catch (RuntimeException e) {
                ot1.m18058c("MediaSourceList", "Failed to release child source.", e);
            }
            m74.f13250a.mo12329g(m74.f13252c);
            m74.f13250a.mo12328f(m74.f13252c);
        }
        this.f15727h.clear();
        this.f15728i.clear();
        this.f15729j = false;
    }

    /* renamed from: h */
    public final void mo13153h(kg4 kg4) {
        n74 n74 = (n74) this.f15722c.remove(kg4);
        Objects.requireNonNull(n74);
        n74.f13889a.mo9587d(kg4);
        n74.f13891c.remove(((eg4) kg4).f8795a);
        if (!this.f15722c.isEmpty()) {
            m18371r();
        }
        m18372s(n74);
    }

    /* renamed from: i */
    public final boolean mo13154i() {
        return this.f15729j;
    }

    /* renamed from: j */
    public final gt0 mo13155j(int i, List list, gi4 gi4) {
        if (!list.isEmpty()) {
            this.f15731l = gi4;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                n74 n74 = (n74) list.get(i2 - i);
                if (i2 > 0) {
                    n74 n742 = (n74) this.f15721b.get(i2 - 1);
                    n74.mo12540a(n742.f13892d + n742.f13889a.mo10811C().mo8901c());
                } else {
                    n74.mo12540a(0);
                }
                m18369p(i2, n74.f13889a.mo10811C().mo8901c());
                this.f15721b.add(i2, n74);
                this.f15723d.put(n74.f13890b, n74);
                if (this.f15729j) {
                    m18373t(n74);
                    if (this.f15722c.isEmpty()) {
                        this.f15728i.add(n74);
                    } else {
                        m18370q(n74);
                    }
                }
            }
        }
        return mo13149b();
    }

    /* renamed from: k */
    public final gt0 mo13156k(int i, int i2, int i3, gi4 gi4) {
        v91.m22050d(mo13148a() >= 0);
        this.f15731l = null;
        return mo13149b();
    }

    /* renamed from: l */
    public final gt0 mo13157l(int i, int i2, gi4 gi4) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo13148a()) {
            z = true;
        }
        v91.m22050d(z);
        this.f15731l = gi4;
        m18374u(i, i2);
        return mo13149b();
    }

    /* renamed from: m */
    public final gt0 mo13158m(List list, gi4 gi4) {
        m18374u(0, this.f15721b.size());
        return mo13155j(this.f15721b.size(), list, gi4);
    }

    /* renamed from: n */
    public final gt0 mo13159n(gi4 gi4) {
        int a = mo13148a();
        if (gi4.mo10549c() != a) {
            gi4 = gi4.mo10552f().mo10553g(0, a);
        }
        this.f15731l = gi4;
        return mo13149b();
    }

    /* renamed from: o */
    public final kg4 mo13160o(mg4 mg4, nk4 nk4, long j) {
        Object obj = mg4.f12629a;
        Object obj2 = ((Pair) obj).first;
        mg4 c = mg4.mo12346c(((Pair) obj).second);
        n74 n74 = (n74) this.f15723d.get(obj2);
        Objects.requireNonNull(n74);
        this.f15728i.add(n74);
        m74 m74 = (m74) this.f15727h.get(n74);
        if (m74 != null) {
            m74.f13250a.mo12330h(m74.f13251b);
        }
        n74.f13891c.add(c);
        eg4 D = n74.f13889a.mo9589k(c, nk4, j);
        this.f15722c.put(D, n74);
        m18371r();
        return D;
    }
}
