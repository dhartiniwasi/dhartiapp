package com.onesignal;

import android.os.Build;
import p259ia.C10568a;

/* renamed from: com.onesignal.a1 */
/* compiled from: OSInAppMessageControllerFactory */
class C8294a1 {

    /* renamed from: b */
    private static final Object f35314b = new Object();

    /* renamed from: a */
    private C8667z0 f35315a;

    C8294a1() {
    }

    /* renamed from: a */
    public C8667z0 mo27589a(C8475k3 k3Var, C8616t2 t2Var, C8547p1 p1Var, C8507n2 n2Var, C10568a aVar) {
        if (this.f35315a == null) {
            synchronized (f35314b) {
                if (this.f35315a == null) {
                    if (Build.VERSION.SDK_INT <= 18) {
                        this.f35315a = new C8310b1((C8475k3) null, t2Var, p1Var, n2Var, aVar);
                    } else {
                        this.f35315a = new C8667z0(k3Var, t2Var, p1Var, n2Var, aVar);
                    }
                }
            }
        }
        return this.f35315a;
    }
}
