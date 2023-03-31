package p372ud;

import java.util.NoSuchElementException;
import p252hd.C10535w;

/* renamed from: ud.b */
/* compiled from: ProgressionIterators.kt */
public final class C12751b extends C10535w {

    /* renamed from: a */
    private final int f46703a;

    /* renamed from: b */
    private final int f46704b;

    /* renamed from: c */
    private boolean f46705c;

    /* renamed from: d */
    private int f46706d;

    public C12751b(int i, int i2, int i3) {
        this.f46703a = i3;
        this.f46704b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f46705c = z;
        this.f46706d = !z ? i2 : i;
    }

    /* renamed from: a */
    public int mo33733a() {
        int i = this.f46706d;
        if (i != this.f46704b) {
            this.f46706d = this.f46703a + i;
        } else if (this.f46705c) {
            this.f46705c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f46705c;
    }
}
