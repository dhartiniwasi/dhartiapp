package p060h4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.im0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p122q4.C5399a;
import p143t4.C5525a;
import p179z3.C6351u;

/* renamed from: h4.q2 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4569q2 {

    /* renamed from: a */
    private final Date f24953a;

    /* renamed from: b */
    private final String f24954b;

    /* renamed from: c */
    private final List f24955c;

    /* renamed from: d */
    private final int f24956d;

    /* renamed from: e */
    private final Set f24957e;

    /* renamed from: f */
    private final Bundle f24958f;

    /* renamed from: g */
    private final Map f24959g;

    /* renamed from: h */
    private final String f24960h;

    /* renamed from: i */
    private final String f24961i;

    /* renamed from: j */
    private final C5525a f24962j;

    /* renamed from: k */
    private final int f24963k;

    /* renamed from: l */
    private final Set f24964l;

    /* renamed from: m */
    private final Bundle f24965m;

    /* renamed from: n */
    private final Set f24966n;

    /* renamed from: o */
    private final boolean f24967o;

    /* renamed from: p */
    private final C5399a f24968p;

    /* renamed from: q */
    private final String f24969q;

    /* renamed from: r */
    private final int f24970r;

    public C4569q2(C4563p2 p2Var, C5525a aVar) {
        this.f24953a = p2Var.f24936g;
        this.f24954b = p2Var.f24937h;
        this.f24955c = p2Var.f24938i;
        this.f24956d = p2Var.f24939j;
        this.f24957e = Collections.unmodifiableSet(p2Var.f24930a);
        this.f24958f = p2Var.f24931b;
        this.f24959g = Collections.unmodifiableMap(p2Var.f24932c);
        this.f24960h = p2Var.f24940k;
        this.f24961i = p2Var.f24941l;
        this.f24963k = p2Var.f24942m;
        this.f24964l = Collections.unmodifiableSet(p2Var.f24933d);
        this.f24965m = p2Var.f24934e;
        this.f24966n = Collections.unmodifiableSet(p2Var.f24935f);
        this.f24967o = p2Var.f24943n;
        this.f24968p = p2Var.f24944o;
        this.f24969q = p2Var.f24945p;
        this.f24970r = p2Var.f24946q;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo18107a() {
        return this.f24956d;
    }

    /* renamed from: b */
    public final int mo18108b() {
        return this.f24970r;
    }

    /* renamed from: c */
    public final int mo18109c() {
        return this.f24963k;
    }

    /* renamed from: d */
    public final Bundle mo18110d() {
        return this.f24965m;
    }

    /* renamed from: e */
    public final Bundle mo18111e(Class cls) {
        return this.f24958f.getBundle(cls.getName());
    }

    /* renamed from: f */
    public final Bundle mo18112f() {
        return this.f24958f;
    }

    /* renamed from: g */
    public final C5399a mo18113g() {
        return this.f24968p;
    }

    /* renamed from: h */
    public final C5525a mo18114h() {
        return this.f24962j;
    }

    /* renamed from: i */
    public final String mo18115i() {
        return this.f24969q;
    }

    /* renamed from: j */
    public final String mo18116j() {
        return this.f24954b;
    }

    /* renamed from: k */
    public final String mo18117k() {
        return this.f24960h;
    }

    /* renamed from: l */
    public final String mo18118l() {
        return this.f24961i;
    }

    @Deprecated
    /* renamed from: m */
    public final Date mo18119m() {
        return this.f24953a;
    }

    /* renamed from: n */
    public final List mo18120n() {
        return new ArrayList(this.f24955c);
    }

    /* renamed from: o */
    public final Set mo18121o() {
        return this.f24966n;
    }

    /* renamed from: p */
    public final Set mo18122p() {
        return this.f24957e;
    }

    @Deprecated
    /* renamed from: q */
    public final boolean mo18123q() {
        return this.f24967o;
    }

    /* renamed from: r */
    public final boolean mo18124r(Context context) {
        C6351u b = C4492d3.m29601e().mo18027b();
        C4584t.m30036b();
        String z = im0.m14419z(context);
        return this.f24964l.contains(z) || b.mo21719d().contains(z);
    }
}
