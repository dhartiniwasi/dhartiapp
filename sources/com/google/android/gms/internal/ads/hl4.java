package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hl4 {

    /* renamed from: g */
    private static final Comparator f10383g = cl4.f7822a;

    /* renamed from: h */
    private static final Comparator f10384h = dl4.f8311a;

    /* renamed from: a */
    private final ArrayList f10385a = new ArrayList();

    /* renamed from: b */
    private final gl4[] f10386b = new gl4[5];

    /* renamed from: c */
    private int f10387c = -1;

    /* renamed from: d */
    private int f10388d;

    /* renamed from: e */
    private int f10389e;

    /* renamed from: f */
    private int f10390f;

    public hl4(int i) {
    }

    /* renamed from: a */
    public final float mo10836a(float f) {
        if (this.f10387c != 0) {
            Collections.sort(this.f10385a, f10384h);
            this.f10387c = 0;
        }
        float f2 = ((float) this.f10389e) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f10385a.size(); i2++) {
            gl4 gl4 = (gl4) this.f10385a.get(i2);
            i += gl4.f9967b;
            if (((float) i) >= f2) {
                return gl4.f9968c;
            }
        }
        if (this.f10385a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f10385a;
        return ((gl4) arrayList.get(arrayList.size() - 1)).f9968c;
    }

    /* renamed from: b */
    public final void mo10837b(int i, float f) {
        gl4 gl4;
        if (this.f10387c != 1) {
            Collections.sort(this.f10385a, f10383g);
            this.f10387c = 1;
        }
        int i2 = this.f10390f;
        if (i2 > 0) {
            gl4[] gl4Arr = this.f10386b;
            int i3 = i2 - 1;
            this.f10390f = i3;
            gl4 = gl4Arr[i3];
        } else {
            gl4 = new gl4((el4) null);
        }
        int i4 = this.f10388d;
        this.f10388d = i4 + 1;
        gl4.f9966a = i4;
        gl4.f9967b = i;
        gl4.f9968c = f;
        this.f10385a.add(gl4);
        this.f10389e += i;
        while (true) {
            int i5 = this.f10389e;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                gl4 gl42 = (gl4) this.f10385a.get(0);
                int i7 = gl42.f9967b;
                if (i7 <= i6) {
                    this.f10389e -= i7;
                    this.f10385a.remove(0);
                    int i8 = this.f10390f;
                    if (i8 < 5) {
                        gl4[] gl4Arr2 = this.f10386b;
                        this.f10390f = i8 + 1;
                        gl4Arr2[i8] = gl42;
                    }
                } else {
                    gl42.f9967b = i7 - i6;
                    this.f10389e -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo10838c() {
        this.f10385a.clear();
        this.f10387c = -1;
        this.f10388d = 0;
        this.f10389e = 0;
    }
}
