package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.vm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2963vm {

    /* renamed from: a */
    public final String f19148a;

    /* renamed from: b */
    public final boolean f19149b;

    public C2963vm(String str, boolean z) {
        this.f19148a = str;
        this.f19149b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C2963vm.class) {
            C2963vm vmVar = (C2963vm) obj;
            return TextUtils.equals(this.f19148a, vmVar.f19148a) && this.f19149b == vmVar.f19149b;
        }
    }

    public final int hashCode() {
        String str = this.f19148a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f19149b ? 1237 : 1231);
    }
}
