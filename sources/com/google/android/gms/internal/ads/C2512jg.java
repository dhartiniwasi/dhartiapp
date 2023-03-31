package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.jg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2512jg extends C2513jh {

    /* renamed from: j */
    private static final C2550kh f11534j = new C2550kh();

    /* renamed from: i */
    private final Context f11535i;

    public C2512jg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, Context context) {
        super(wfVar, "joxZSCFIfSio2J1Z0g3HMtlcDGNvogfMyrj1e2b+qPNv6DXnDVXfwkgCXW9zFWFC", "iJiFXDBrMwFOGpG8WmWNKc3sGwXbWv8N6fPQac0mMm0=", ybVar, i, 29);
        this.f11535i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        this.f11603e.mo15396m0("E");
        AtomicReference a = f11534j.mo11700a(this.f11535i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f11604f.invoke((Object) null, new Object[]{this.f11535i}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.f11603e) {
            this.f11603e.mo15396m0(C2322ed.m12035a(str.getBytes(), true));
        }
    }
}
