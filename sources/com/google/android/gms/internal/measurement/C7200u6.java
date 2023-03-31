package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7200u6 extends C6908c7 {
    C7200u6(C7264y6 y6Var, String str, Long l, boolean z) {
        super(y6Var, str, l, true, (C6891b7) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23249a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo23251c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
