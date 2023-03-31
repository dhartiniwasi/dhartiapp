package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.cb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6912cb extends C7077mb {
    C6912cb(int i) {
        super(i, (C7061lb) null);
    }

    /* renamed from: b */
    public final void mo23262b() {
        if (!mo23675k()) {
            for (int i = 0; i < mo23665c(); i++) {
                Map.Entry h = mo23673h(i);
                if (((C7250x8) h.getKey()).mo23990e()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo23668d()) {
                if (((C7250x8) entry.getKey()).mo23990e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo23262b();
    }
}
