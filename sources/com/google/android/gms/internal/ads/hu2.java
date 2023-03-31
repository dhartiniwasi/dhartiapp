package com.google.android.gms.internal.ads;

import android.content.Context;
import p033d5.C4141r;
import p150u4.C5745a;
import p150u4.C5746b;
import p218e6.C9975i;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hu2 {

    /* renamed from: a */
    static C9975i f10497a;

    /* renamed from: b */
    public static C5746b f10498b;

    /* renamed from: c */
    private static final Object f10499c = new Object();

    /* renamed from: a */
    public static C9975i m14047a(Context context) {
        C9975i iVar;
        m14048b(context, false);
        synchronized (f10499c) {
            iVar = f10497a;
        }
        return iVar;
    }

    /* renamed from: b */
    public static void m14048b(Context context, boolean z) {
        synchronized (f10499c) {
            if (f10498b == null) {
                f10498b = C5745a.m34328a(context);
            }
            C9975i iVar = f10497a;
            if (iVar == null || ((iVar.mo26361p() && !f10497a.mo26362q()) || (z && f10497a.mo26361p()))) {
                f10497a = ((C5746b) C4141r.m28222l(f10498b, "the appSetIdClient shouldn't be null")).mo19226a();
            }
        }
    }
}
