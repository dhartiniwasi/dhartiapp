package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.google.android.material.datepicker.l */
/* compiled from: Month */
final class C7657l implements Comparable<C7657l>, Parcelable {
    public static final Parcelable.Creator<C7657l> CREATOR = new C7658a();

    /* renamed from: a */
    private final Calendar f33637a;

    /* renamed from: b */
    private final String f33638b;

    /* renamed from: c */
    final int f33639c;

    /* renamed from: d */
    final int f33640d;

    /* renamed from: e */
    final int f33641e;

    /* renamed from: f */
    final int f33642f;

    /* renamed from: g */
    final long f33643g;

    /* renamed from: com.google.android.material.datepicker.l$a */
    /* compiled from: Month */
    static class C7658a implements Parcelable.Creator<C7657l> {
        C7658a() {
        }

        /* renamed from: a */
        public C7657l createFromParcel(Parcel parcel) {
            return C7657l.m42647b(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C7657l[] newArray(int i) {
            return new C7657l[i];
        }
    }

    private C7657l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C7667r.m42687d(calendar);
        this.f33637a = d;
        this.f33639c = d.get(2);
        this.f33640d = d.get(1);
        this.f33641e = d.getMaximum(7);
        this.f33642f = d.getActualMaximum(5);
        this.f33638b = C7667r.m42697n().format(d.getTime());
        this.f33643g = d.getTimeInMillis();
    }

    /* renamed from: b */
    static C7657l m42647b(int i, int i2) {
        Calendar k = C7667r.m42694k();
        k.set(1, i);
        k.set(2, i2);
        return new C7657l(k);
    }

    /* renamed from: c */
    static C7657l m42648c(long j) {
        Calendar k = C7667r.m42694k();
        k.setTimeInMillis(j);
        return new C7657l(k);
    }

    /* renamed from: r */
    static C7657l m42649r() {
        return new C7657l(C7667r.m42692i());
    }

    /* renamed from: a */
    public int compareTo(C7657l lVar) {
        return this.f33637a.compareTo(lVar.f33637a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7657l)) {
            return false;
        }
        C7657l lVar = (C7657l) obj;
        if (this.f33639c == lVar.f33639c && this.f33640d == lVar.f33640d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33639c), Integer.valueOf(this.f33640d)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo25439j() {
        int firstDayOfWeek = this.f33637a.get(7) - this.f33637a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f33641e : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public long mo25440k(int i) {
        Calendar d = C7667r.m42687d(this.f33637a);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo25441n() {
        return this.f33638b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo25442o() {
        return this.f33637a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C7657l mo25443p(int i) {
        Calendar d = C7667r.m42687d(this.f33637a);
        d.add(2, i);
        return new C7657l(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo25444q(C7657l lVar) {
        if (this.f33637a instanceof GregorianCalendar) {
            return ((lVar.f33640d - this.f33640d) * 12) + (lVar.f33639c - this.f33639c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33640d);
        parcel.writeInt(this.f33639c);
    }
}
