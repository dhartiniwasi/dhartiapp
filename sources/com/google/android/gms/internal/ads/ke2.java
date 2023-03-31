package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ke2 implements sj2 {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f12059a;

    public /* synthetic */ ke2(ArrayList arrayList) {
        this.f12059a = arrayList;
    }

    /* renamed from: e */
    public final void mo8321e(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f12059a);
    }
}
