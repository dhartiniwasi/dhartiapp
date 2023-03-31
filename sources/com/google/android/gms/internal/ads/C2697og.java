package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p032d4.C4076a;

/* renamed from: com.google.android.gms.internal.ads.og */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2697og extends C2513jh {
    public C2697og(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ybVar, i, 24);
    }

    /* renamed from: c */
    private final void m17751c() {
        C4076a h = this.f11600b.mo14907h();
        if (h != null) {
            try {
                C4076a.C4077a b = h.mo17302b();
                String d = C3104zf.m24568d(b.mo17308a());
                if (d != null) {
                    synchronized (this.f11603e) {
                        this.f11603e.mo15403r0(d);
                        this.f11603e.mo15401q0(b.mo17309b());
                        this.f11603e.mo15379U(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (!this.f11600b.mo14914q()) {
            synchronized (this.f11603e) {
                this.f11603e.mo15403r0((String) this.f11604f.invoke((Object) null, new Object[]{this.f11600b.mo14902b()}));
            }
            return;
        }
        m17751c();
    }

    /* renamed from: b */
    public final Void mo11400b() throws Exception {
        if (this.f11600b.mo14915r()) {
            super.mo11400b();
            return null;
        }
        if (this.f11600b.mo14914q()) {
            m17751c();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo11400b();
        return null;
    }
}
