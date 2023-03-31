package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zv3 extends bw3 {

    /* renamed from: a */
    private int f21497a = 0;

    /* renamed from: b */
    private final int f21498b;

    /* renamed from: c */
    final /* synthetic */ jw3 f21499c;

    zv3(jw3 jw3) {
        this.f21499c = jw3;
        this.f21498b = jw3.mo9361q();
    }

    public final boolean hasNext() {
        return this.f21497a < this.f21498b;
    }

    public final byte zza() {
        int i = this.f21497a;
        if (i < this.f21498b) {
            this.f21497a = i + 1;
            return this.f21499c.mo9360l(i);
        }
        throw new NoSuchElementException();
    }
}
