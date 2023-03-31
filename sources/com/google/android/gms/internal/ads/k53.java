package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class k53 extends e63 {

    /* renamed from: a */
    private IBinder f11912a;

    /* renamed from: b */
    private String f11913b;

    /* renamed from: c */
    private int f11914c;

    /* renamed from: d */
    private float f11915d;

    /* renamed from: e */
    private int f11916e;

    /* renamed from: f */
    private String f11917f;

    /* renamed from: g */
    private byte f11918g;

    k53() {
    }

    /* renamed from: a */
    public final e63 mo9809a(String str) {
        this.f11917f = str;
        return this;
    }

    /* renamed from: b */
    public final e63 mo9810b(String str) {
        this.f11913b = str;
        return this;
    }

    /* renamed from: c */
    public final e63 mo9811c(int i) {
        this.f11918g = (byte) (this.f11918g | 8);
        return this;
    }

    /* renamed from: d */
    public final e63 mo9812d(int i) {
        this.f11914c = i;
        this.f11918g = (byte) (this.f11918g | 2);
        return this;
    }

    /* renamed from: e */
    public final e63 mo9813e(float f) {
        this.f11915d = f;
        this.f11918g = (byte) (this.f11918g | 4);
        return this;
    }

    /* renamed from: f */
    public final e63 mo9814f(boolean z) {
        this.f11918g = (byte) (this.f11918g | 1);
        return this;
    }

    /* renamed from: g */
    public final e63 mo9815g(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.f11912a = iBinder;
        return this;
    }

    /* renamed from: h */
    public final e63 mo9816h(int i) {
        this.f11916e = i;
        this.f11918g = (byte) (this.f11918g | 16);
        return this;
    }

    /* renamed from: i */
    public final f63 mo9817i() {
        IBinder iBinder;
        if (this.f11918g == 31 && (iBinder = this.f11912a) != null) {
            return new m53(iBinder, false, this.f11913b, this.f11914c, this.f11915d, 0, (String) null, this.f11916e, this.f11917f, (l53) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11912a == null) {
            sb.append(" windowToken");
        }
        if ((this.f11918g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f11918g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f11918g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f11918g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f11918g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
