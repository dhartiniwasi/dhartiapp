package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C6907c6 extends C7280z6 {

    /* renamed from: a */
    private final Context f31615a;

    /* renamed from: b */
    private final C7025j7 f31616b;

    C6907c6(Context context, C7025j7 j7Var) {
        Objects.requireNonNull(context, "Null context");
        this.f31615a = context;
        this.f31616b = j7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo23244a() {
        return this.f31615a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7025j7 mo23245b() {
        return this.f31616b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f31616b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.C7280z6
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.z6 r5 = (com.google.android.gms.internal.measurement.C7280z6) r5
            android.content.Context r1 = r4.f31615a
            android.content.Context r3 = r5.mo23244a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.j7 r1 = r4.f31616b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.j7 r5 = r5.mo23245b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.gms.internal.measurement.j7 r5 = r5.mo23245b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6907c6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f31615a.hashCode() ^ 1000003) * 1000003;
        C7025j7 j7Var = this.f31616b;
        if (j7Var == null) {
            i = 0;
        } else {
            i = j7Var.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f31615a.toString();
        String valueOf = String.valueOf(this.f31616b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
