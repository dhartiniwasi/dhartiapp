package com.startapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* renamed from: com.startapp.u2 */
/* compiled from: Sta */
public abstract class C9577u2 implements Parcelable {

    /* renamed from: a */
    public float f39241a;

    /* renamed from: b */
    public float f39242b;

    /* renamed from: c */
    public float f39243c = Float.MAX_VALUE;

    /* renamed from: d */
    public float f39244d = -3.4028235E38f;

    /* renamed from: e */
    public long f39245e = 0;

    public C9577u2() {
    }

    public String toString() {
        StringBuilder a = C8870c1.m48422a("Position: [");
        a.append(this.f39241a);
        a.append("], Velocity:[");
        a.append(this.f39242b);
        a.append("], MaxPos: [");
        a.append(this.f39243c);
        a.append("], mMinPos: [");
        a.append(this.f39244d);
        a.append("] LastTime:[");
        a.append(this.f39245e);
        a.append("]");
        return a.toString();
    }

    public C9577u2(Parcel parcel) {
        this.f39241a = parcel.readFloat();
        this.f39242b = parcel.readFloat();
        this.f39243c = parcel.readFloat();
        this.f39244d = parcel.readFloat();
        this.f39245e = AnimationUtils.currentAnimationTimeMillis();
    }
}
