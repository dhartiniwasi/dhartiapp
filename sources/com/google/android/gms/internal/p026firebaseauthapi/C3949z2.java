package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3949z2 extends C3162b3 {
    /* synthetic */ C3949z2(C3917y2 y2Var) {
        super((C3129a3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo15767a(Object obj, long j) {
        C3590o2 o2Var = (C3590o2) C3197c5.m25303k(obj, j);
        if (o2Var.mo16476e()) {
            return o2Var;
        }
        int size = o2Var.size();
        C3590o2 h = o2Var.mo15892h(size == 0 ? 10 : size + size);
        C3197c5.m25316x(obj, j, h);
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15768b(Object obj, long j) {
        ((C3590o2) C3197c5.m25303k(obj, j)).mo16475d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15769c(Object obj, Object obj2, long j) {
        C3590o2 o2Var = (C3590o2) C3197c5.m25303k(obj, j);
        C3590o2 o2Var2 = (C3590o2) C3197c5.m25303k(obj2, j);
        int size = o2Var.size();
        int size2 = o2Var2.size();
        if (size > 0 && size2 > 0) {
            if (!o2Var.mo16476e()) {
                o2Var = o2Var.mo15892h(size2 + size);
            }
            o2Var.addAll(o2Var2);
        }
        if (size > 0) {
            o2Var2 = o2Var;
        }
        C3197c5.m25316x(obj, j, o2Var2);
    }
}
