package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7468p9 {

    /* renamed from: a */
    private final C7397j4 f32874a;

    public C7468p9(C7397j4 j4Var) {
        this.f32874a = j4Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24610a(String str, Bundle bundle) {
        String str2;
        this.f32874a.mo24143s().mo24189f();
        if (!this.f32874a.mo24436n()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f32874a.mo24416F().f32964v.mo24632b(str2);
                this.f32874a.mo24416F().f32965w.mo24605b(this.f32874a.mo24116a().mo18370a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24611b() {
        String str;
        this.f32874a.mo24143s().mo24189f();
        if (mo24613d()) {
            if (mo24614e()) {
                this.f32874a.mo24416F().f32964v.mo24632b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f32874a.mo24418I().mo24356u("auto", "_cmpx", bundle);
            } else {
                String a = this.f32874a.mo24416F().f32964v.mo24631a();
                if (TextUtils.isEmpty(a)) {
                    this.f32874a.mo24135l().mo24258t().mo24208a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f32874a.mo24416F().f32965w.mo24604a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f32874a.mo24418I().mo24356u(str, "_cmp", (Bundle) pair.second);
                }
                this.f32874a.mo24416F().f32964v.mo24632b((String) null);
            }
            this.f32874a.mo24416F().f32965w.mo24605b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24612c() {
        if (mo24613d() && mo24614e()) {
            this.f32874a.mo24416F().f32964v.mo24632b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo24613d() {
        return this.f32874a.mo24416F().f32965w.mo24604a() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo24614e() {
        if (mo24613d() && this.f32874a.mo24116a().mo18370a() - this.f32874a.mo24416F().f32965w.mo24604a() > this.f32874a.mo24443z().mo24293q((String) null, C7516u2.f33030S)) {
            return true;
        }
        return false;
    }
}
