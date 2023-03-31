package p040e5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: e5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4241b {

    /* renamed from: e5.b$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class C4242a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C4242a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040e5.C4241b.C4242a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    private static void m28577A(Parcel parcel, int i, int i2) {
        int w = m28600w(parcel, i);
        if (w != i2) {
            String hexString = Integer.toHexString(w);
            throw new C4242a("Expected size " + i2 + " got " + w + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: a */
    public static Bundle m28578a(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m28579b(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m28580c(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w);
        return createIntArray;
    }

    /* renamed from: d */
    public static ArrayList<Integer> m28581d(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w);
        return arrayList;
    }

    /* renamed from: e */
    public static <T extends Parcelable> T m28582e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w);
        return t;
    }

    /* renamed from: f */
    public static String m28583f(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w);
        return readString;
    }

    /* renamed from: g */
    public static String[] m28584g(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w);
        return createStringArray;
    }

    /* renamed from: h */
    public static ArrayList<String> m28585h(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w);
        return createStringArrayList;
    }

    /* renamed from: i */
    public static <T> T[] m28586i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArray;
    }

    /* renamed from: j */
    public static <T> ArrayList<T> m28587j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m28588k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C4242a("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: l */
    public static int m28589l(int i) {
        return (char) i;
    }

    /* renamed from: m */
    public static boolean m28590m(Parcel parcel, int i) {
        m28577A(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: n */
    public static Boolean m28591n(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        if (w == 0) {
            return null;
        }
        m28603z(parcel, i, w, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: o */
    public static Double m28592o(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        if (w == 0) {
            return null;
        }
        m28603z(parcel, i, w, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static float m28593p(Parcel parcel, int i) {
        m28577A(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: q */
    public static Float m28594q(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        if (w == 0) {
            return null;
        }
        m28603z(parcel, i, w, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: r */
    public static int m28595r(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: s */
    public static IBinder m28596s(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (w == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w);
        return readStrongBinder;
    }

    /* renamed from: t */
    public static int m28597t(Parcel parcel, int i) {
        m28577A(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: u */
    public static long m28598u(Parcel parcel, int i) {
        m28577A(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: v */
    public static Long m28599v(Parcel parcel, int i) {
        int w = m28600w(parcel, i);
        if (w == 0) {
            return null;
        }
        m28603z(parcel, i, w, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: w */
    public static int m28600w(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: x */
    public static void m28601x(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m28600w(parcel, i));
    }

    /* renamed from: y */
    public static int m28602y(Parcel parcel) {
        int r = m28595r(parcel);
        int w = m28600w(parcel, r);
        int dataPosition = parcel.dataPosition();
        if (m28589l(r) == 20293) {
            int i = w + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new C4242a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new C4242a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r))), parcel);
    }

    /* renamed from: z */
    private static void m28603z(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new C4242a("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }
}
