package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7502t extends C4240a implements Iterable<String> {
    public static final Parcelable.Creator<C7502t> CREATOR = new C7513u();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f32978a;

    C7502t(Bundle bundle) {
        this.f32978a = bundle;
    }

    /* renamed from: I1 */
    public final int mo24660I1() {
        return this.f32978a.size();
    }

    /* renamed from: K1 */
    public final Bundle mo24661K1() {
        return new Bundle(this.f32978a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L1 */
    public final Double mo24662L1(String str) {
        return Double.valueOf(this.f32978a.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public final Long mo24663M1(String str) {
        return Long.valueOf(this.f32978a.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public final Object mo24664N1(String str) {
        return this.f32978a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public final String mo24665O1(String str) {
        return this.f32978a.getString(str);
    }

    public final Iterator iterator() {
        return new C7491s(this);
    }

    public final String toString() {
        return this.f32978a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28608e(parcel, 2, mo24661K1(), false);
        C4243c.m28605b(parcel, a);
    }
}
