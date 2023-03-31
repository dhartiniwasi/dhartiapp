package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum C2603lx implements ux3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: h */
    private static final vx3 f12981h = null;

    /* renamed from: a */
    private final int f12983a;

    static {
        f12981h = new C2529jx();
    }

    private C2603lx(int i) {
        this.f12983a = i;
    }

    /* renamed from: a */
    public static C2603lx m16294a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    /* renamed from: b */
    public static wx3 m16295b() {
        return C2566kx.f12322a;
    }

    public final String toString() {
        return Integer.toString(this.f12983a);
    }

    public final int zza() {
        return this.f12983a;
    }
}
