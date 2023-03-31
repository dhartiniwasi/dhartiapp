package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wn3 {

    /* renamed from: a */
    private final bh3 f19727a;

    /* renamed from: b */
    private final int f19728b;

    /* renamed from: c */
    private final kh3 f19729c;

    /* synthetic */ wn3(bh3 bh3, int i, kh3 kh3, vn3 vn3) {
        this.f19727a = bh3;
        this.f19728b = i;
        this.f19729c = kh3;
    }

    /* renamed from: a */
    public final int mo14957a() {
        return this.f19728b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wn3)) {
            return false;
        }
        wn3 wn3 = (wn3) obj;
        if (this.f19727a == wn3.f19727a && this.f19728b == wn3.f19728b && this.f19729c.equals(wn3.f19729c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19727a, Integer.valueOf(this.f19728b), Integer.valueOf(this.f19729c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f19727a, Integer.valueOf(this.f19728b), this.f19729c});
    }
}
