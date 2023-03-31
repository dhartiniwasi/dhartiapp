package com.onesignal;

import com.onesignal.C8338d3;

/* renamed from: com.onesignal.k1 */
/* compiled from: OSInAppMessagePushPrompt */
public class C8473k1 extends C8460i1 {
    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m46941f(C8338d3.C8400z0 z0Var, boolean z) {
        C8338d3.C8359g1 g1Var;
        if (z) {
            g1Var = C8338d3.C8359g1.PERMISSION_GRANTED;
        } else {
            g1Var = C8338d3.C8359g1.PERMISSION_DENIED;
        }
        z0Var.mo27758a(g1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo27762a() {
        return "push";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27763b(C8338d3.C8400z0 z0Var) {
        C8338d3.m46413D1(true, new C8467j1(z0Var));
    }
}
