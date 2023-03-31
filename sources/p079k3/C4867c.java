package p079k3;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import p161w3.C5917a;
import p161w3.C5921c;
import p190b7.C6685q;

/* renamed from: k3.c */
/* compiled from: CueDecoder */
public final class C4867c {
    /* renamed from: a */
    public C6685q<C4864b> mo18643a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return C5921c.m34934b(C4864b.f25756A, (ArrayList) C5917a.m34872e(readBundle.getParcelableArrayList("c")));
    }
}
