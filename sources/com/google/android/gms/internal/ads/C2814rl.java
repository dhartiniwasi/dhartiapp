package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rl */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2814rl extends C2888tl {

    /* renamed from: P0 */
    public final long f16995P0;

    /* renamed from: Q0 */
    public final List f16996Q0 = new ArrayList();

    /* renamed from: R0 */
    public final List f16997R0 = new ArrayList();

    public C2814rl(int i, long j) {
        super(i);
        this.f16995P0 = j;
    }

    /* renamed from: d */
    public final C2814rl mo13836d(int i) {
        int size = this.f16997R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2814rl rlVar = (C2814rl) this.f16997R0.get(i2);
            if (rlVar.f18129a == i) {
                return rlVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C2851sl mo13837e(int i) {
        int size = this.f16996Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2851sl slVar = (C2851sl) this.f16996Q0.get(i2);
            if (slVar.f18129a == i) {
                return slVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo13838f(C2814rl rlVar) {
        this.f16997R0.add(rlVar);
    }

    /* renamed from: g */
    public final void mo13839g(C2851sl slVar) {
        this.f16996Q0.add(slVar);
    }

    public final String toString() {
        String c = C2888tl.m21068c(this.f18129a);
        String arrays = Arrays.toString(this.f16996Q0.toArray());
        String arrays2 = Arrays.toString(this.f16997R0.toArray());
        return c + " leaves: " + arrays + " containers: " + arrays2;
    }
}
