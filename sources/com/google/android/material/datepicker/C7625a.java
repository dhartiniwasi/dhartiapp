package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: CalendarConstraints */
public final class C7625a implements Parcelable {
    public static final Parcelable.Creator<C7625a> CREATOR = new C7626a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7657l f33545a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7657l f33546b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7657l f33547c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7628c f33548d;

    /* renamed from: e */
    private final int f33549e;

    /* renamed from: f */
    private final int f33550f;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* compiled from: CalendarConstraints */
    static class C7626a implements Parcelable.Creator<C7625a> {
        C7626a() {
        }

        /* renamed from: a */
        public C7625a createFromParcel(Parcel parcel) {
            return new C7625a((C7657l) parcel.readParcelable(C7657l.class.getClassLoader()), (C7657l) parcel.readParcelable(C7657l.class.getClassLoader()), (C7657l) parcel.readParcelable(C7657l.class.getClassLoader()), (C7628c) parcel.readParcelable(C7628c.class.getClassLoader()), (C7626a) null);
        }

        /* renamed from: b */
        public C7625a[] newArray(int i) {
            return new C7625a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* compiled from: CalendarConstraints */
    public static final class C7627b {

        /* renamed from: e */
        static final long f33551e = C7667r.m42684a(C7657l.m42647b(1900, 0).f33643g);

        /* renamed from: f */
        static final long f33552f = C7667r.m42684a(C7657l.m42647b(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f33643g);

        /* renamed from: a */
        private long f33553a = f33551e;

        /* renamed from: b */
        private long f33554b = f33552f;

        /* renamed from: c */
        private Long f33555c;

        /* renamed from: d */
        private C7628c f33556d = C7633f.m42577a(Long.MIN_VALUE);

        C7627b(C7625a aVar) {
            this.f33553a = aVar.f33545a.f33643g;
            this.f33554b = aVar.f33546b.f33643g;
            this.f33555c = Long.valueOf(aVar.f33547c.f33643g);
            this.f33556d = aVar.f33548d;
        }

        /* renamed from: a */
        public C7625a mo25387a() {
            if (this.f33555c == null) {
                long l2 = C7649i.m42629l2();
                long j = this.f33553a;
                if (j > l2 || l2 > this.f33554b) {
                    l2 = j;
                }
                this.f33555c = Long.valueOf(l2);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f33556d);
            return new C7625a(C7657l.m42648c(this.f33553a), C7657l.m42648c(this.f33554b), C7657l.m42648c(this.f33555c.longValue()), (C7628c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), (C7626a) null);
        }

        /* renamed from: b */
        public C7627b mo25388b(long j) {
            this.f33555c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    /* compiled from: CalendarConstraints */
    public interface C7628c extends Parcelable {
        /* renamed from: Q0 */
        boolean mo25389Q0(long j);
    }

    /* synthetic */ C7625a(C7657l lVar, C7657l lVar2, C7657l lVar3, C7628c cVar, C7626a aVar) {
        this(lVar, lVar2, lVar3, cVar);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C7628c mo25374e() {
        return this.f33548d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7625a)) {
            return false;
        }
        C7625a aVar = (C7625a) obj;
        if (!this.f33545a.equals(aVar.f33545a) || !this.f33546b.equals(aVar.f33546b) || !this.f33547c.equals(aVar.f33547c) || !this.f33548d.equals(aVar.f33548d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7657l mo25376f() {
        return this.f33546b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo25377g() {
        return this.f33550f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C7657l mo25378h() {
        return this.f33547c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33545a, this.f33546b, this.f33547c, this.f33548d});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7657l mo25380i() {
        return this.f33545a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo25381j() {
        return this.f33549e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f33545a, 0);
        parcel.writeParcelable(this.f33546b, 0);
        parcel.writeParcelable(this.f33547c, 0);
        parcel.writeParcelable(this.f33548d, 0);
    }

    private C7625a(C7657l lVar, C7657l lVar2, C7657l lVar3, C7628c cVar) {
        this.f33545a = lVar;
        this.f33546b = lVar2;
        this.f33547c = lVar3;
        this.f33548d = cVar;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (lVar3.compareTo(lVar2) <= 0) {
            this.f33550f = lVar.mo25444q(lVar2) + 1;
            this.f33549e = (lVar2.f33640d - lVar.f33640d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
