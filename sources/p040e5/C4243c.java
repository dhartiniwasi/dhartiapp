package p040e5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: e5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4243c {
    /* renamed from: a */
    public static int m28604a(Parcel parcel) {
        return m28625v(parcel, 20293);
    }

    /* renamed from: b */
    public static void m28605b(Parcel parcel, int i) {
        m28626w(parcel, i);
    }

    /* renamed from: c */
    public static void m28606c(Parcel parcel, int i, boolean z) {
        m28627x(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m28607d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m28627x(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m28608e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int v = m28625v(parcel, i);
            parcel.writeBundle(bundle);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m28609f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int v = m28625v(parcel, i);
            parcel.writeByteArray(bArr);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m28610g(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m28627x(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m28611h(Parcel parcel, int i, float f) {
        m28627x(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: i */
    public static void m28612i(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m28627x(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m28613j(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int v = m28625v(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m28614k(Parcel parcel, int i, int i2) {
        m28627x(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: l */
    public static void m28615l(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int v = m28625v(parcel, i);
            parcel.writeIntArray(iArr);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m28616m(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list != null) {
            int v = m28625v(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m28617n(Parcel parcel, int i, long j) {
        m28627x(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m28618o(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m28627x(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m28619p(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int v = m28625v(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m28620q(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int v = m28625v(parcel, i);
            parcel.writeString(str);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m28621r(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int v = m28625v(parcel, i);
            parcel.writeStringArray(strArr);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m28622s(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int v = m28625v(parcel, i);
            parcel.writeStringList(list);
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static <T extends Parcelable> void m28623t(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int v = m28625v(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m28628y(parcel, t, i2);
                }
            }
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static <T extends Parcelable> void m28624u(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int v = m28625v(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m28628y(parcel, parcelable, 0);
                }
            }
            m28626w(parcel, v);
        } else if (z) {
            m28627x(parcel, i, 0);
        }
    }

    /* renamed from: v */
    private static int m28625v(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: w */
    private static void m28626w(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: x */
    private static void m28627x(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: y */
    private static void m28628y(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
