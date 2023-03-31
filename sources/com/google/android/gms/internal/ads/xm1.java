package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xm1 implements e20 {

    /* renamed from: a */
    final /* synthetic */ un1 f20213a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f20214b;

    xm1(un1 un1, ViewGroup viewGroup) {
        this.f20213a = un1;
        this.f20214b = viewGroup;
    }

    /* renamed from: a */
    public final void mo9783a(MotionEvent motionEvent) {
        this.f20213a.onTouch((View) null, motionEvent);
    }

    /* renamed from: d */
    public final JSONObject mo9784d() {
        return this.f20213a.mo14094b0();
    }

    /* renamed from: e */
    public final void mo9785e() {
        un1 un1 = this.f20213a;
        ua3 ua3 = um1.f18613v;
        Map c0 = un1.mo14095c0();
        if (c0 != null) {
            int size = ua3.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (c0.get((String) ua3.get(i)) == null) {
                    i = i2;
                } else {
                    this.f20213a.onClick(this.f20214b);
                    return;
                }
            }
        }
    }

    public final JSONObject zza() {
        return this.f20213a.mo14091Y();
    }
}
