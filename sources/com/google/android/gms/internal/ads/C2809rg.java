package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.rg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2809rg extends C2513jh {

    /* renamed from: i */
    private static volatile Long f16939i;

    /* renamed from: j */
    private static final Object f16940j = new Object();

    public C2809rg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", ybVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (f16939i == null) {
            synchronized (f16940j) {
                if (f16939i == null) {
                    f16939i = (Long) this.f11604f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f11603e) {
            this.f11603e.mo15414y0(f16939i.longValue());
        }
    }
}
