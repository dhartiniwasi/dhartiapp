package com.google.android.gms.internal.ads;

import p218e6.C9965d;
import p218e6.C9975i;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class d53 implements C9965d {

    /* renamed from: a */
    public final /* synthetic */ e53 f8064a;

    public /* synthetic */ d53(e53 e53) {
        this.f8064a = e53;
    }

    /* renamed from: a */
    public final void mo283a(C9975i iVar) {
        e53 e53 = this.f8064a;
        if (iVar.mo26360o()) {
            e53.cancel(false);
        } else if (iVar.mo26362q()) {
            e53.mo9805g(iVar.mo26358m());
        } else {
            Exception l = iVar.mo26357l();
            if (l != null) {
                e53.mo9806h(l);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
