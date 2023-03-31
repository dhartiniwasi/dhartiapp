package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p33 extends C4240a {
    public static final Parcelable.Creator<p33> CREATOR = new q33();

    /* renamed from: a */
    public final int f15670a;

    /* renamed from: b */
    private C2730pc f15671b = null;

    /* renamed from: c */
    private byte[] f15672c;

    p33(int i, byte[] bArr) {
        this.f15670a = i;
        this.f15672c = bArr;
        m18321d();
    }

    /* renamed from: d */
    private final void m18321d() {
        C2730pc pcVar = this.f15671b;
        if (pcVar == null && this.f15672c != null) {
            return;
        }
        if (pcVar != null && this.f15672c == null) {
            return;
        }
        if (pcVar != null && this.f15672c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (pcVar == null && this.f15672c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: I1 */
    public final C2730pc mo13126I1() {
        if (this.f15671b == null) {
            try {
                this.f15671b = C2730pc.m18454C0(this.f15672c, ex3.m12308a());
                this.f15672c = null;
            } catch (ey3 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        m18321d();
        return this.f15671b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f15670a);
        byte[] bArr = this.f15672c;
        if (bArr == null) {
            bArr = this.f15671b.mo9400b();
        }
        C4243c.m28609f(parcel, 2, bArr, false);
        C4243c.m28605b(parcel, a);
    }
}
