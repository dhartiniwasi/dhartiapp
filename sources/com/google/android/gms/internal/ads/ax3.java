package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ax3 {

    /* renamed from: a */
    private final zw3 f7008a;

    private ax3(zw3 zw3) {
        cy3.m11234f(zw3, "output");
        this.f7008a = zw3;
        zw3.f21505a = this;
    }

    /* renamed from: l */
    public static ax3 m10092l(zw3 zw3) {
        ax3 ax3 = zw3.f21505a;
        return ax3 != null ? ax3 : new ax3(zw3);
    }

    /* renamed from: A */
    public final void mo8586A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14839s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14838r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo8587B(int i, Object obj, wz3 wz3) throws IOException {
        zw3 zw3 = this.f7008a;
        zw3.mo14846z(i, 3);
        wz3.mo10367i((cz3) obj, zw3.f21505a);
        zw3.mo14846z(i, 4);
    }

    /* renamed from: C */
    public final void mo8588C(int i, int i2) throws IOException {
        this.f7008a.mo14842v(i, i2);
    }

    /* renamed from: D */
    public final void mo8589D(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zw3.m24863G(((Integer) list.get(i4)).intValue());
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14843w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14842v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo8590E(int i, long j) throws IOException {
        this.f7008a.mo14829C(i, j);
    }

    /* renamed from: F */
    public final void mo8591F(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zw3.m24870g(((Long) list.get(i4)).longValue());
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14830D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14829C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo8592G(int i, Object obj, wz3 wz3) throws IOException {
        this.f7008a.mo14844x(i, (cz3) obj, wz3);
    }

    /* renamed from: H */
    public final void mo8593H(int i, int i2) throws IOException {
        this.f7008a.mo14838r(i, i2);
    }

    /* renamed from: I */
    public final void mo8594I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14839s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14838r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo8595J(int i, long j) throws IOException {
        this.f7008a.mo14840t(i, j);
    }

    /* renamed from: K */
    public final void mo8596K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14841u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14840t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo8597a(int i, int i2) throws IOException {
        this.f7008a.mo14827A(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo8598b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zw3.m24869f((intValue >> 31) ^ (intValue + intValue));
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                zw3 zw3 = this.f7008a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zw3.mo14828B((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zw3 zw32 = this.f7008a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zw32.mo14827A(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo8599c(int i, long j) throws IOException {
        this.f7008a.mo14829C(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo8600d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zw3.m24870g((longValue >> 63) ^ (longValue + longValue));
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                zw3 zw3 = this.f7008a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zw3.mo14830D((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zw3 zw32 = this.f7008a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zw32.mo14829C(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void mo8601e(int i) throws IOException {
        this.f7008a.mo14846z(i, 3);
    }

    /* renamed from: f */
    public final void mo8602f(int i, String str) throws IOException {
        this.f7008a.mo14845y(i, str);
    }

    /* renamed from: g */
    public final void mo8603g(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof jy3) {
            jy3 jy3 = (jy3) list;
            while (i2 < list.size()) {
                Object p = jy3.mo11262p(i2);
                if (p instanceof String) {
                    this.f7008a.mo14845y(i, (String) p);
                } else {
                    this.f7008a.mo14837p(i, (jw3) p);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14845y(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo8604h(int i, int i2) throws IOException {
        this.f7008a.mo14827A(i, i2);
    }

    /* renamed from: i */
    public final void mo8605i(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zw3.m24869f(((Integer) list.get(i4)).intValue());
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14828B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14827A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo8606j(int i, long j) throws IOException {
        this.f7008a.mo14829C(i, j);
    }

    /* renamed from: k */
    public final void mo8607k(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zw3.m24870g(((Long) list.get(i4)).longValue());
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14830D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14829C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo8608m(int i, boolean z) throws IOException {
        this.f7008a.mo14836o(i, z);
    }

    /* renamed from: n */
    public final void mo8609n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14835n(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14836o(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo8610o(int i, jw3 jw3) throws IOException {
        this.f7008a.mo14837p(i, jw3);
    }

    /* renamed from: p */
    public final void mo8611p(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7008a.mo14837p(i, (jw3) list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo8612q(int i, double d) throws IOException {
        this.f7008a.mo14840t(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo8613r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14841u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14840t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void mo8614s(int i) throws IOException {
        this.f7008a.mo14846z(i, 4);
    }

    /* renamed from: t */
    public final void mo8615t(int i, int i2) throws IOException {
        this.f7008a.mo14842v(i, i2);
    }

    /* renamed from: u */
    public final void mo8616u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zw3.m24863G(((Integer) list.get(i4)).intValue());
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14843w(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14842v(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo8617v(int i, int i2) throws IOException {
        this.f7008a.mo14838r(i, i2);
    }

    /* renamed from: w */
    public final void mo8618w(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14839s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14838r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo8619x(int i, long j) throws IOException {
        this.f7008a.mo14840t(i, j);
    }

    /* renamed from: y */
    public final void mo8620y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f7008a.mo14846z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f7008a.mo14828B(i3);
            while (i2 < list.size()) {
                this.f7008a.mo14841u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f7008a.mo14840t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo8621z(int i, float f) throws IOException {
        this.f7008a.mo14838r(i, Float.floatToRawIntBits(f));
    }
}
