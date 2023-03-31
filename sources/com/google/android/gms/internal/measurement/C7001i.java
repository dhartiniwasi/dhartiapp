package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7001i implements C7129q {

    /* renamed from: a */
    private final Double f31742a;

    public C7001i(Double d) {
        if (d == null) {
            this.f31742a = Double.valueOf(Double.NaN);
        } else {
            this.f31742a = d;
        }
    }

    /* renamed from: U */
    public final Double mo23368U() {
        return this.f31742a;
    }

    /* renamed from: V */
    public final String mo23369V() {
        int i;
        if (Double.isNaN(this.f31742a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f31742a.doubleValue())) {
            return this.f31742a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f31742a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i = stripTrailingZeros.precision();
        } else {
            i = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return null;
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        return new C7001i(this.f31742a);
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        boolean z = false;
        if (!Double.isNaN(this.f31742a.doubleValue()) && this.f31742a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7001i)) {
            return false;
        }
        return this.f31742a.equals(((C7001i) obj).f31742a);
    }

    public final int hashCode() {
        return this.f31742a.hashCode();
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        if ("toString".equals(str)) {
            return new C7193u(mo23369V());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo23369V(), str}));
    }

    public final String toString() {
        return mo23369V();
    }
}
