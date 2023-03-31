package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7232w6 extends C6908c7 {
    C7232w6(C7264y6 y6Var, String str, Double d, boolean z) {
        super(y6Var, "measurement.test.double_flag", d, true, (C6891b7) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23249a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo23251c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
