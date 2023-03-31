package p142t3;

import android.text.TextUtils;
import java.util.ArrayList;
import p079k3.C4872g;
import p079k3.C4874h;
import p079k3.C4876j;
import p161w3.C5918a0;
import p177z1.C6249m2;

/* renamed from: t3.h */
/* compiled from: WebvttDecoder */
public final class C5522h extends C4872g {

    /* renamed from: o */
    private final C5918a0 f28037o = new C5918a0();

    /* renamed from: p */
    private final C5513c f28038p = new C5513c();

    public C5522h() {
        super("WebvttDecoder");
    }

    /* renamed from: C */
    private static int m33569C(C5918a0 a0Var) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = a0Var.mo20552e();
            String o = a0Var.mo20562o();
            if (o == null) {
                i = 0;
            } else if ("STYLE".equals(o)) {
                i = 2;
            } else {
                i = o.startsWith("NOTE") ? 1 : 3;
            }
        }
        a0Var.mo20546O(i2);
        return i;
    }

    /* renamed from: D */
    private static void m33570D(C5918a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.mo20562o()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) throws C4876j {
        C5515e n;
        this.f28037o.mo20544M(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            C5523i.m33576e(this.f28037o);
            do {
            } while (!TextUtils.isEmpty(this.f28037o.mo20562o()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = m33569C(this.f28037o);
                if (C == 0) {
                    return new C5524k(arrayList2);
                }
                if (C == 1) {
                    m33570D(this.f28037o);
                } else if (C == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f28037o.mo20562o();
                        arrayList.addAll(this.f28038p.mo19792d(this.f28037o));
                    } else {
                        throw new C4876j("A style block was found after the first cue.");
                    }
                } else if (C == 3 && (n = C5516f.m33544n(this.f28037o, arrayList)) != null) {
                    arrayList2.add(n);
                }
            }
        } catch (C6249m2 e) {
            throw new C4876j((Throwable) e);
        }
    }
}
