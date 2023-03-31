package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7249x7 implements Comparator {
    C7249x7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C6977g8 g8Var = (C6977g8) obj;
        C6977g8 g8Var2 = (C6977g8) obj2;
        C7233w7 w7Var = new C7233w7(g8Var);
        C7233w7 w7Var2 = new C7233w7(g8Var2);
        while (w7Var.hasNext() && w7Var2.hasNext()) {
            int compareTo = Integer.valueOf(w7Var.zza() & 255).compareTo(Integer.valueOf(w7Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(g8Var.mo23326f()).compareTo(Integer.valueOf(g8Var2.mo23326f()));
    }
}
