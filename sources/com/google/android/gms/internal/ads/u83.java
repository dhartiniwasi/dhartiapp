package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class u83 extends vc3 {

    /* renamed from: a */
    private final int f18453a;

    /* renamed from: b */
    private int f18454b;

    protected u83(int i, int i2) {
        b83.m10238b(i2, i, "index");
        this.f18453a = i;
        this.f18454b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo13966a(int i);

    public final boolean hasNext() {
        return this.f18454b < this.f18453a;
    }

    public final boolean hasPrevious() {
        return this.f18454b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f18454b;
            this.f18454b = i + 1;
            return mo13966a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f18454b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f18454b - 1;
            this.f18454b = i;
            return mo13966a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f18454b - 1;
    }
}
