package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p124r.C5426g;

/* renamed from: com.google.android.gms.internal.measurement.h6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C6992h6 {

    /* renamed from: a */
    private final C5426g f31718a;

    C6992h6(C5426g gVar) {
        this.f31718a = gVar;
    }

    /* renamed from: a */
    public final String mo23485a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C5426g gVar = (C5426g) this.f31718a.get(uri.toString());
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get("".concat(String.valueOf(str3)));
    }
}
