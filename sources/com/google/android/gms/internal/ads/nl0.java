package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import p032d4.C4076a;
import p180z4.C6372g;
import p180z4.C6374h;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nl0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f14101a;

    /* renamed from: b */
    final /* synthetic */ in0 f14102b;

    nl0(ol0 ol0, Context context, in0 in0) {
        this.f14101a = context;
        this.f14102b = in0;
    }

    public final void run() {
        try {
            this.f14102b.mo11172d(C4076a.m28009a(this.f14101a));
        } catch (IOException | IllegalStateException | C6372g | C6374h e) {
            this.f14102b.mo11173e(e);
            pm0.m18665e("Exception while getting advertising Id info", e);
        }
    }
}
