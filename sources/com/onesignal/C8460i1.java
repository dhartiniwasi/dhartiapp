package com.onesignal;

import com.onesignal.C8338d3;

/* renamed from: com.onesignal.i1 */
/* compiled from: OSInAppMessagePrompt */
public abstract class C8460i1 {

    /* renamed from: a */
    private boolean f35662a = false;

    C8460i1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo27762a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo27763b(C8338d3.C8400z0 z0Var);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo27839c() {
        return this.f35662a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27840d(boolean z) {
        this.f35662a = z;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + mo27762a() + " prompted=" + this.f35662a + '}';
    }
}
