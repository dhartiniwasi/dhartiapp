package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rd2 implements tj2 {

    /* renamed from: a */
    private final mf3 f16920a;

    /* renamed from: b */
    private final mf3 f16921b;

    /* renamed from: c */
    private final Context f16922c;

    /* renamed from: d */
    private final et2 f16923d;

    /* renamed from: e */
    private final View f16924e;

    public rd2(mf3 mf3, mf3 mf32, Context context, et2 et2, ViewGroup viewGroup) {
        this.f16920a = mf3;
        this.f16921b = mf32;
        this.f16922c = context;
        this.f16923d = et2;
        this.f16924e = viewGroup;
    }

    /* renamed from: c */
    private final List m19792c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f16924e;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ sd2 mo13782a() throws Exception {
        return new sd2(this.f16922c, this.f16923d.f8934e, m19792c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ sd2 mo13783b() throws Exception {
        return new sd2(this.f16922c, this.f16923d.f8934e, m19792c());
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        C2679nz.m17343c(this.f16922c);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14301F8)).booleanValue()) {
            return this.f16921b.mo12324a(new pd2(this));
        }
        return this.f16920a.mo12324a(new qd2(this));
    }

    public final int zza() {
        return 3;
    }
}
