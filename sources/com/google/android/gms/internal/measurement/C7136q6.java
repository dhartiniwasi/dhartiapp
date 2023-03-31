package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p124r.C5413a;

/* renamed from: com.google.android.gms.internal.measurement.q6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7136q6 {

    /* renamed from: a */
    private static final C5413a f31972a = new C5413a();

    /* renamed from: a */
    public static synchronized Uri m40654a(String str) {
        synchronized (C7136q6.class) {
            C5413a aVar = f31972a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
