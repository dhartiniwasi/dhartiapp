package p015b3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p161w3.C5917a;
import p161w3.C5921c;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6224h;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: b3.x0 */
/* compiled from: TrackGroup */
public final class C1776x0 implements C6224h {

    /* renamed from: f */
    public static final C6224h.C6225a<C1776x0> f5279f = C1771w0.f5278a;

    /* renamed from: a */
    public final int f5280a;

    /* renamed from: b */
    public final String f5281b;

    /* renamed from: c */
    public final int f5282c;

    /* renamed from: d */
    private final C6272r1[] f5283d;

    /* renamed from: e */
    private int f5284e;

    public C1776x0(C6272r1... r1VarArr) {
        this("", r1VarArr);
    }

    /* renamed from: d */
    private static String m8397d(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C1776x0 m8398e(Bundle bundle) {
        C6685q<C6272r1> qVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m8397d(0));
        if (parcelableArrayList == null) {
            qVar = C6685q.m38445x();
        } else {
            qVar = C5921c.m34934b(C6272r1.f30217P, parcelableArrayList);
        }
        return new C1776x0(bundle.getString(m8397d(1), ""), (C6272r1[]) qVar.toArray(new C6272r1[0]));
    }

    /* renamed from: f */
    private static void m8399f(String str, String str2, String str3, int i) {
        C5961r.m35210d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: g */
    private static String m8400g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: h */
    private static int m8401h(int i) {
        return i | 16384;
    }

    /* renamed from: i */
    private void m8402i() {
        String g = m8400g(this.f5283d[0].f30234c);
        int h = m8401h(this.f5283d[0].f30236e);
        int i = 1;
        while (true) {
            C6272r1[] r1VarArr = this.f5283d;
            if (i >= r1VarArr.length) {
                return;
            }
            if (!g.equals(m8400g(r1VarArr[i].f30234c))) {
                C6272r1[] r1VarArr2 = this.f5283d;
                m8399f("languages", r1VarArr2[0].f30234c, r1VarArr2[i].f30234c, i);
                return;
            } else if (h != m8401h(this.f5283d[i].f30236e)) {
                m8399f("role flags", Integer.toBinaryString(this.f5283d[0].f30236e), Integer.toBinaryString(this.f5283d[i].f30236e), i);
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public C6272r1 mo6897b(int i) {
        return this.f5283d[i];
    }

    /* renamed from: c */
    public int mo6898c(C6272r1 r1Var) {
        int i = 0;
        while (true) {
            C6272r1[] r1VarArr = this.f5283d;
            if (i >= r1VarArr.length) {
                return -1;
            }
            if (r1Var == r1VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1776x0.class != obj.getClass()) {
            return false;
        }
        C1776x0 x0Var = (C1776x0) obj;
        if (!this.f5281b.equals(x0Var.f5281b) || !Arrays.equals(this.f5283d, x0Var.f5283d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f5284e == 0) {
            this.f5284e = ((527 + this.f5281b.hashCode()) * 31) + Arrays.hashCode(this.f5283d);
        }
        return this.f5284e;
    }

    public C1776x0(String str, C6272r1... r1VarArr) {
        C5917a.m34868a(r1VarArr.length > 0);
        this.f5281b = str;
        this.f5283d = r1VarArr;
        this.f5280a = r1VarArr.length;
        int k = C5967v.m35247k(r1VarArr[0].f30243t);
        this.f5282c = k == -1 ? C5967v.m35247k(r1VarArr[0].f30242s) : k;
        m8402i();
    }
}
