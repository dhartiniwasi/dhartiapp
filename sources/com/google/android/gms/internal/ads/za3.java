package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class za3 extends pa3 implements Set {

    /* renamed from: b */
    private transient ua3 f21042b;

    za3() {
    }

    /* renamed from: o */
    static int m24503o(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        b83.m10242f(max < 1073741824, "collection too large");
        return 1073741824;
    }

    /* renamed from: r */
    public static ya3 m24504r(int i) {
        return new ya3(i);
    }

    /* renamed from: t */
    public static za3 m24506t(Collection collection) {
        Object[] array = collection.toArray();
        return m24509x(array.length, array);
    }

    @SafeVarargs
    /* renamed from: u */
    public static za3 m24507u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return m24509x(12, objArr2);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static za3 m24509x(int i, Object... objArr) {
        if (i == 0) {
            return kc3.f12017i;
        }
        if (i != 1) {
            int o = m24503o(i);
            Object[] objArr2 = new Object[o];
            int i2 = o - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                bc3.m10302a(obj, i5);
                int hashCode = obj.hashCode();
                int a = ma3.m16460a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new rc3(obj3);
            } else if (m24503o(i4) < o / 2) {
                return m24509x(i4, objArr);
            } else {
                if (m24510y(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new kc3(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new rc3(obj4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static boolean m24510y(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za3) || !mo11658w() || !((za3) obj).mo11658w() || hashCode() == obj.hashCode()) {
            return qc3.m19169c(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return qc3.m19167a(this);
    }

    /* renamed from: i */
    public ua3 mo10475i() {
        ua3 ua3 = this.f21042b;
        if (ua3 != null) {
            return ua3;
        }
        ua3 q = mo10125q();
        this.f21042b = q;
        return q;
    }

    /* renamed from: j */
    public abstract uc3 iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ua3 mo10125q() {
        return ua3.m21503r(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo11658w() {
        return false;
    }
}
