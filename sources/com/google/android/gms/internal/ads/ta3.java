package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ta3 extends ua3 {

    /* renamed from: c */
    final transient int f17920c;

    /* renamed from: d */
    final transient int f17921d;

    /* renamed from: e */
    final /* synthetic */ ua3 f17922e;

    ta3(ua3 ua3, int i, int i2) {
        this.f17922e = ua3;
        this.f17920c = i;
        this.f17921d = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo9536c() {
        return this.f17922e.mo9537f() + this.f17920c + this.f17921d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo9537f() {
        return this.f17922e.mo9537f() + this.f17920c;
    }

    public final Object get(int i) {
        b83.m10237a(i, this.f17921d, "index");
        return this.f17922e.get(i + this.f17920c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo9539k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object[] mo9540l() {
        return this.f17922e.mo9540l();
    }

    /* renamed from: o */
    public final ua3 mo14266o(int i, int i2) {
        b83.m10243g(i, i2, this.f17921d);
        ua3 ua3 = this.f17922e;
        int i3 = this.f17920c;
        return ua3.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f17921d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
