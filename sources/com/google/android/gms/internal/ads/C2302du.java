package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.ads.du */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2302du extends C4240a {
    public static final Parcelable.Creator<C2302du> CREATOR = new C2339eu();

    /* renamed from: a */
    private ParcelFileDescriptor f8420a;

    /* renamed from: b */
    private final boolean f8421b;

    /* renamed from: c */
    private final boolean f8422c;

    /* renamed from: d */
    private final long f8423d;

    /* renamed from: e */
    private final boolean f8424e;

    public C2302du() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    /* renamed from: I1 */
    public final synchronized long mo9690I1() {
        return this.f8423d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public final synchronized ParcelFileDescriptor mo9691J1() {
        return this.f8420a;
    }

    /* renamed from: K1 */
    public final synchronized InputStream mo9692K1() {
        if (this.f8420a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f8420a);
        this.f8420a = null;
        return autoCloseInputStream;
    }

    /* renamed from: L1 */
    public final synchronized boolean mo9693L1() {
        return this.f8421b;
    }

    /* renamed from: M1 */
    public final synchronized boolean mo9694M1() {
        return this.f8420a != null;
    }

    /* renamed from: N1 */
    public final synchronized boolean mo9695N1() {
        return this.f8422c;
    }

    /* renamed from: O1 */
    public final synchronized boolean mo9696O1() {
        return this.f8424e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 2, mo9691J1(), i, false);
        C4243c.m28606c(parcel, 3, mo9693L1());
        C4243c.m28606c(parcel, 4, mo9695N1());
        C4243c.m28617n(parcel, 5, mo9690I1());
        C4243c.m28606c(parcel, 6, mo9696O1());
        C4243c.m28605b(parcel, a);
    }

    public C2302du(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f8420a = parcelFileDescriptor;
        this.f8421b = z;
        this.f8422c = z2;
        this.f8423d = j;
        this.f8424e = z3;
    }
}
