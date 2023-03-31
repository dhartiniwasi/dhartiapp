package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xb4 extends Exception {

    /* renamed from: a */
    public final int f20065a;

    /* renamed from: b */
    public final boolean f20066b;

    /* renamed from: c */
    public final C2388g4 f20067c;

    public xb4(int i, C2388g4 g4Var, boolean z) {
        super("AudioTrack write failed: " + i);
        this.f20066b = z;
        this.f20065a = i;
        this.f20067c = g4Var;
    }
}
