package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class aw3 implements Comparator {
    aw3() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        jw3 jw3 = (jw3) obj;
        jw3 jw32 = (jw3) obj2;
        dw3 E = jw3.iterator();
        dw3 E2 = jw32.iterator();
        while (E.hasNext() && E2.hasNext()) {
            int compareTo = Integer.valueOf(E.zza() & 255).compareTo(Integer.valueOf(E2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(jw3.mo9361q()).compareTo(Integer.valueOf(jw32.mo9361q()));
    }
}
