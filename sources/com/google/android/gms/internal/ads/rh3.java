package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rh3 extends kh3 {

    /* renamed from: a */
    private final String f16951a;

    /* renamed from: b */
    private final int f16952b;

    /* synthetic */ rh3(String str, int i, qh3 qh3) {
        this.f16951a = str;
        this.f16952b = i;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f16951a;
        int i = this.f16952b - 2;
        objArr[1] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
