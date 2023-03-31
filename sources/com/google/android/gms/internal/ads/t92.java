package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class t92 implements uj1 {

    /* renamed from: a */
    public final /* synthetic */ g52 f17904a;

    public /* synthetic */ t92(g52 g52) {
        this.f17904a = g52;
    }

    /* renamed from: a */
    public final void mo10408a(boolean z, Context context, ja1 ja1) {
        g52 g52 = this.f17904a;
        try {
            ((au2) g52.f9705b).mo8560x(z);
            ((au2) g52.f9705b).mo8535B();
        } catch (jt2 e) {
            pm0.m18668h("Cannot show rewarded video.", e);
            throw new tj1(e.getCause());
        }
    }
}
