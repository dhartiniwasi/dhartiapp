package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007a5.C0105b;
import p007a5.C0111g;
import p033d5.C4133p;
import p040e5.C4240a;
import p040e5.C4243c;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends C4240a implements C0111g, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C2067e();

    /* renamed from: f */
    public static final Status f6033f = new Status(-1);

    /* renamed from: g */
    public static final Status f6034g = new Status(0);

    /* renamed from: h */
    public static final Status f6035h = new Status(14);

    /* renamed from: i */
    public static final Status f6036i = new Status(8);

    /* renamed from: r */
    public static final Status f6037r = new Status(15);

    /* renamed from: s */
    public static final Status f6038s = new Status(16);

    /* renamed from: t */
    public static final Status f6039t = new Status(18);

    /* renamed from: u */
    public static final Status f6040u = new Status(17);

    /* renamed from: a */
    final int f6041a;

    /* renamed from: b */
    private final int f6042b;

    /* renamed from: c */
    private final String f6043c;

    /* renamed from: d */
    private final PendingIntent f6044d;

    /* renamed from: e */
    private final C6362b f6045e;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent, C6362b bVar) {
        this.f6041a = i;
        this.f6042b = i2;
        this.f6043c = str;
        this.f6044d = pendingIntent;
        this.f6045e = bVar;
    }

    /* renamed from: I1 */
    public C6362b mo7949I1() {
        return this.f6045e;
    }

    /* renamed from: J1 */
    public int mo7950J1() {
        return this.f6042b;
    }

    /* renamed from: K1 */
    public String mo7951K1() {
        return this.f6043c;
    }

    /* renamed from: L1 */
    public boolean mo7952L1() {
        return this.f6044d != null;
    }

    /* renamed from: M1 */
    public boolean mo7953M1() {
        return this.f6042b <= 0;
    }

    /* renamed from: d1 */
    public Status mo259d1() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f6041a != status.f6041a || this.f6042b != status.f6042b || !C4133p.m28193a(this.f6043c, status.f6043c) || !C4133p.m28193a(this.f6044d, status.f6044d) || !C4133p.m28193a(this.f6045e, status.f6045e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4133p.m28194b(Integer.valueOf(this.f6041a), Integer.valueOf(this.f6042b), this.f6043c, this.f6044d, this.f6045e);
    }

    public String toString() {
        C4133p.C4134a c = C4133p.m28195c(this);
        c.mo17442a("statusCode", zza());
        c.mo17442a("resolution", this.f6044d);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, mo7950J1());
        C4243c.m28620q(parcel, 2, mo7951K1(), false);
        C4243c.m28619p(parcel, 3, this.f6044d, i, false);
        C4243c.m28619p(parcel, 4, mo7949I1(), i, false);
        C4243c.m28614k(parcel, AdError.NETWORK_ERROR_CODE, this.f6041a);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        String str = this.f6043c;
        return str != null ? str : C0105b.m587a(this.f6042b);
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null, (C6362b) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (C6362b) null);
    }

    public Status(C6362b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(C6362b bVar, String str, int i) {
        this(1, i, str, bVar.mo21753K1(), bVar);
    }
}
