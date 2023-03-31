package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7233w7 extends C7265y7 {

    /* renamed from: a */
    private int f32163a = 0;

    /* renamed from: b */
    private final int f32164b;

    /* renamed from: c */
    final /* synthetic */ C6977g8 f32165c;

    C7233w7(C6977g8 g8Var) {
        this.f32165c = g8Var;
        this.f32164b = g8Var.mo23326f();
    }

    public final boolean hasNext() {
        return this.f32163a < this.f32164b;
    }

    public final byte zza() {
        int i = this.f32163a;
        if (i < this.f32164b) {
            this.f32163a = i + 1;
            return this.f32165c.mo23324c(i);
        }
        throw new NoSuchElementException();
    }
}
