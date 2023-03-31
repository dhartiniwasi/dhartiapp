package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zz3 extends j04 {
    zz3(int i) {
        super(i, (i04) null);
    }

    /* renamed from: b */
    public final void mo11274b() {
        if (!mo11285k()) {
            for (int i = 0; i < mo11275c(); i++) {
                Map.Entry h = mo11283h(i);
                if (((ix3) h.getKey()).mo11252e()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo11278d()) {
                if (((ix3) entry.getKey()).mo11252e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo11274b();
    }
}
