package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.le */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2584le implements a43 {

    /* renamed from: a */
    final /* synthetic */ z13 f12751a;

    C2584le(C2658ne neVar, z13 z13) {
        this.f12751a = z13;
    }

    /* renamed from: a */
    public final boolean mo8203a(File file) {
        try {
            return this.f12751a.mo15534a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
