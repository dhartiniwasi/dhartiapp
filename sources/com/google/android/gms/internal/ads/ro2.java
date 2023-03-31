package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ro2 implements ie3 {

    /* renamed from: a */
    public final /* synthetic */ vo2 f17036a;

    /* renamed from: b */
    public final /* synthetic */ zu2 f17037b;

    /* renamed from: c */
    public final /* synthetic */ a71 f17038c;

    public /* synthetic */ ro2(vo2 vo2, zu2 zu2, a71 a71) {
        this.f17036a = vo2;
        this.f17037b = zu2;
        this.f17038c = a71;
    }

    /* renamed from: b */
    public final lf3 mo8156b(Object obj) {
        zu2 zu2 = this.f17037b;
        a71 a71 = this.f17038c;
        us2 us2 = (us2) obj;
        zu2.f21281b = us2;
        Iterator it = us2.f18723b.f18243a.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((is2) it.next()).f10968a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return a71.mo8237h(cf3.m10911i(us2));
            }
        }
        return cf3.m10911i((Object) null);
    }
}
