package com.onesignal;

class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    /* renamed from: a */
    static void m46147a(C8419f2 f2Var) {
        if (C8338d3.m46581w0().mo27630c(new C8449g2(C8338d3.f35437e0, (C8419f2) f2Var.clone()))) {
            C8419f2 f2Var2 = (C8419f2) f2Var.clone();
            C8338d3.f35437e0 = f2Var2;
            f2Var2.mo27785d();
        }
    }

    /* renamed from: b */
    static void m46148b(C8419f2 f2Var) {
        if (!f2Var.mo27781a()) {
            C8458i.m46864d(0, C8338d3.f35438f);
        }
        C8592r3.m47638y(C8338d3.m46419F());
    }

    /* access modifiers changed from: package-private */
    public void changed(C8419f2 f2Var) {
        m46148b(f2Var);
        m46147a(f2Var);
    }
}
