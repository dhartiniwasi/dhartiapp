package p040e5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4141r;
import p067i5.C4689c;

/* renamed from: e5.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4245e {
    /* renamed from: a */
    public static <T extends C4244d> T m28629a(byte[] bArr, Parcelable.Creator<T> creator) {
        C4141r.m28221k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (C4244d) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: b */
    public static <T extends C4244d> T m28630b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m28629a(byteArrayExtra, creator);
    }

    /* renamed from: c */
    public static <T extends C4244d> T m28631c(String str, Parcelable.Creator<T> creator) {
        return m28629a(C4689c.m30369a(str), creator);
    }

    /* renamed from: d */
    public static <T extends C4244d> byte[] m28632d(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: e */
    public static <T extends C4244d> void m28633e(T t, Intent intent, String str) {
        intent.putExtra(str, m28632d(t));
    }

    /* renamed from: f */
    public static <T extends C4244d> String m28634f(T t) {
        return C4689c.m30372d(m28632d(t));
    }
}
