package p079k3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p161w3.C5921c;
import p177z1.C6224h;
import p190b7.C6685q;

/* renamed from: k3.e */
/* compiled from: CueGroup */
public final class C4868e implements C6224h {

    /* renamed from: b */
    public static final C4868e f25792b = new C4868e(C6685q.m38445x());

    /* renamed from: c */
    public static final C6224h.C6225a<C4868e> f25793c = C11595d.f44137a;

    /* renamed from: a */
    public final C6685q<C4864b> f25794a;

    public C4868e(List<C4864b> list) {
        this.f25794a = C6685q.m38443t(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C4868e m30997b(Bundle bundle) {
        C6685q<C4864b> qVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m30998c(0));
        if (parcelableArrayList == null) {
            qVar = C6685q.m38445x();
        } else {
            qVar = C5921c.m34934b(C4864b.f25756A, parcelableArrayList);
        }
        return new C4868e(qVar);
    }

    /* renamed from: c */
    private static String m30998c(int i) {
        return Integer.toString(i, 36);
    }
}
