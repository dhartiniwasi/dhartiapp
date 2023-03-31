package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C2637mu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2749pu f13499a;

    /* renamed from: b */
    public final /* synthetic */ C2414gu f13500b;

    /* renamed from: c */
    public final /* synthetic */ C2451hu f13501c;

    /* renamed from: d */
    public final /* synthetic */ in0 f13502d;

    public /* synthetic */ C2637mu(C2749pu puVar, C2414gu guVar, C2451hu huVar, in0 in0) {
        this.f13499a = puVar;
        this.f13500b = guVar;
        this.f13501c = huVar;
        this.f13502d = in0;
    }

    public final void run() {
        C2302du duVar;
        C2749pu puVar = this.f13499a;
        C2414gu guVar = this.f13500b;
        C2451hu huVar = this.f13501c;
        in0 in0 = this.f13502d;
        try {
            C2526ju o0 = guVar.mo10645o0();
            if (guVar.mo10644n0()) {
                duVar = o0.mo11515r6(huVar);
            } else {
                duVar = o0.mo11513T5(huVar);
            }
            if (!duVar.mo9694M1()) {
                in0.mo11173e(new RuntimeException("No entry contents."));
                C2823ru.m20031e(puVar.f16040c);
                return;
            }
            C2711ou ouVar = new C2711ou(puVar, duVar.mo9692K1(), 1);
            int read = ouVar.read();
            if (read != -1) {
                ouVar.unread(read);
                in0.mo11172d(C2897tu.m21239b(ouVar, duVar.mo9693L1(), duVar.mo9696O1(), duVar.mo9690I1(), duVar.mo9695N1()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            pm0.m18665e("Unable to obtain a cache service instance.", e);
            in0.mo11173e(e);
            C2823ru.m20031e(puVar.f16040c);
        }
    }
}
