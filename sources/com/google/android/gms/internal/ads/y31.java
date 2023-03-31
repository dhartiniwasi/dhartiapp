package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class y31 {

    /* renamed from: a */
    private final t51 f20455a;

    /* renamed from: b */
    private final View f20456b;

    /* renamed from: c */
    private final js2 f20457c;

    /* renamed from: d */
    private final vs0 f20458d;

    public y31(View view, vs0 vs0, t51 t51, js2 js2) {
        this.f20456b = view;
        this.f20458d = vs0;
        this.f20455a = t51;
        this.f20457c = js2;
    }

    /* renamed from: f */
    public static final jh1 m23735f(Context context, vm0 vm0, is2 is2, et2 et2) {
        return new jh1(new w31(context, vm0, is2, et2), dn0.f8330f);
    }

    /* renamed from: g */
    public static final Set m23736g(j51 j51) {
        return Collections.singleton(new jh1(j51, dn0.f8330f));
    }

    /* renamed from: h */
    public static final jh1 m23737h(h51 h51) {
        return new jh1(h51, dn0.f8329e);
    }

    /* renamed from: a */
    public final View mo15320a() {
        return this.f20456b;
    }

    /* renamed from: b */
    public final vs0 mo15321b() {
        return this.f20458d;
    }

    /* renamed from: c */
    public final t51 mo15322c() {
        return this.f20455a;
    }

    /* renamed from: d */
    public jb1 mo12302d(Set set) {
        return new jb1(set);
    }

    /* renamed from: e */
    public final js2 mo15323e() {
        return this.f20457c;
    }
}
