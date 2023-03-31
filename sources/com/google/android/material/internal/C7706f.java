package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p346s6.C12457d;
import p346s6.C12461f;

/* renamed from: com.google.android.material.internal.f */
/* compiled from: TextDrawableHelper */
public class C7706f {

    /* renamed from: a */
    private final TextPaint f33848a = new TextPaint(1);

    /* renamed from: b */
    private final C12461f f33849b = new C7707a();

    /* renamed from: c */
    private float f33850c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f33851d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C7708b> f33852e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C12457d f33853f;

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: TextDrawableHelper */
    class C7707a extends C12461f {
        C7707a() {
        }

        /* renamed from: a */
        public void mo25210a(int i) {
            boolean unused = C7706f.this.f33851d = true;
            C7708b bVar = (C7708b) C7706f.this.f33852e.get();
            if (bVar != null) {
                bVar.mo25298a();
            }
        }

        /* renamed from: b */
        public void mo25211b(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C7706f.this.f33851d = true;
                C7708b bVar = (C7708b) C7706f.this.f33852e.get();
                if (bVar != null) {
                    bVar.mo25298a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: TextDrawableHelper */
    public interface C7708b {
        /* renamed from: a */
        void mo25298a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C7706f(C7708b bVar) {
        mo25740g(bVar);
    }

    /* renamed from: c */
    private float m42941c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f33848a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C12457d mo25737d() {
        return this.f33853f;
    }

    /* renamed from: e */
    public TextPaint mo25738e() {
        return this.f33848a;
    }

    /* renamed from: f */
    public float mo25739f(String str) {
        if (!this.f33851d) {
            return this.f33850c;
        }
        float c = m42941c(str);
        this.f33850c = c;
        this.f33851d = false;
        return c;
    }

    /* renamed from: g */
    public void mo25740g(C7708b bVar) {
        this.f33852e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo25741h(C12457d dVar, Context context) {
        if (this.f33853f != dVar) {
            this.f33853f = dVar;
            if (dVar != null) {
                dVar.mo37212j(context, this.f33848a, this.f33849b);
                C7708b bVar = (C7708b) this.f33852e.get();
                if (bVar != null) {
                    this.f33848a.drawableState = bVar.getState();
                }
                dVar.mo37211i(context, this.f33848a, this.f33849b);
                this.f33851d = true;
            }
            C7708b bVar2 = (C7708b) this.f33852e.get();
            if (bVar2 != null) {
                bVar2.mo25298a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo25742i(boolean z) {
        this.f33851d = z;
    }

    /* renamed from: j */
    public void mo25743j(Context context) {
        this.f33853f.mo37211i(context, this.f33848a, this.f33849b);
    }
}
