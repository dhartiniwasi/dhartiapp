package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class at0 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ List f6765a;

    /* renamed from: b */
    final /* synthetic */ String f6766b;

    /* renamed from: c */
    final /* synthetic */ Uri f6767c;

    /* renamed from: d */
    final /* synthetic */ ct0 f6768d;

    at0(ct0 ct0, List list, String str, Uri uri) {
        this.f6768d = ct0;
        this.f6765a = list;
        this.f6766b = str;
        this.f6767c = uri;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        pm0.m18667g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f6767c)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        this.f6768d.m11093k((Map) obj, this.f6765a, this.f6766b);
    }
}
