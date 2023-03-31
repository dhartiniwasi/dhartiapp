package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends C4240a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2066d();

    /* renamed from: a */
    final int f6031a;

    /* renamed from: b */
    private final String f6032b;

    Scope(int i, String str) {
        C4141r.m28218h(str, "scopeUri must not be null or empty");
        this.f6031a = i;
        this.f6032b = str;
    }

    /* renamed from: I1 */
    public String mo7944I1() {
        return this.f6032b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6032b.equals(((Scope) obj).f6032b);
    }

    public int hashCode() {
        return this.f6032b.hashCode();
    }

    public String toString() {
        return this.f6032b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f6031a);
        C4243c.m28620q(parcel, 2, mo7944I1(), false);
        C4243c.m28605b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
