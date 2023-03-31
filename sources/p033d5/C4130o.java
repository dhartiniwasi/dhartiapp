package p033d5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: d5.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4130o extends C4240a {
    public static final Parcelable.Creator<C4130o> CREATOR = new C4125m0();

    /* renamed from: a */
    private final int f23355a;

    /* renamed from: b */
    private final int f23356b;

    /* renamed from: c */
    private final int f23357c;

    /* renamed from: d */
    private final long f23358d;

    /* renamed from: e */
    private final long f23359e;

    /* renamed from: f */
    private final String f23360f;

    /* renamed from: g */
    private final String f23361g;

    /* renamed from: h */
    private final int f23362h;

    /* renamed from: i */
    private final int f23363i;

    public C4130o(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f23355a = i;
        this.f23356b = i2;
        this.f23357c = i3;
        this.f23358d = j;
        this.f23359e = j2;
        this.f23360f = str;
        this.f23361g = str2;
        this.f23362h = i4;
        this.f23363i = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f23355a);
        C4243c.m28614k(parcel, 2, this.f23356b);
        C4243c.m28614k(parcel, 3, this.f23357c);
        C4243c.m28617n(parcel, 4, this.f23358d);
        C4243c.m28617n(parcel, 5, this.f23359e);
        C4243c.m28620q(parcel, 6, this.f23360f, false);
        C4243c.m28620q(parcel, 7, this.f23361g, false);
        C4243c.m28614k(parcel, 8, this.f23362h);
        C4243c.m28614k(parcel, 9, this.f23363i);
        C4243c.m28605b(parcel, a);
    }
}
