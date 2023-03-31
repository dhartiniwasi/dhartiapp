package p177z1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p015b3.C1776x0;
import p161w3.C5917a;
import p161w3.C5921c;
import p177z1.C6224h;
import p190b7.C6685q;
import p219e7.C9995a;

/* renamed from: z1.v3 */
/* compiled from: Tracks */
public final class C6290v3 implements C6224h {

    /* renamed from: b */
    public static final C6290v3 f30357b = new C6290v3(C6685q.m38445x());

    /* renamed from: c */
    public static final C6224h.C6225a<C6290v3> f30358c = C13427t3.f47765a;

    /* renamed from: a */
    private final C6685q<C6291a> f30359a;

    /* renamed from: z1.v3$a */
    /* compiled from: Tracks */
    public static final class C6291a implements C6224h {

        /* renamed from: f */
        public static final C6224h.C6225a<C6291a> f30360f = C13430u3.f47769a;

        /* renamed from: a */
        public final int f30361a;

        /* renamed from: b */
        private final C1776x0 f30362b;

        /* renamed from: c */
        private final boolean f30363c;

        /* renamed from: d */
        private final int[] f30364d;

        /* renamed from: e */
        private final boolean[] f30365e;

        public C6291a(C1776x0 x0Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = x0Var.f5280a;
            this.f30361a = i;
            boolean z2 = false;
            C5917a.m34868a(i == iArr.length && i == zArr.length);
            this.f30362b = x0Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.f30363c = z2;
            this.f30364d = (int[]) iArr.clone();
            this.f30365e = (boolean[]) zArr.clone();
        }

        /* renamed from: g */
        private static String m37097g(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public C1776x0 mo21559b() {
            return this.f30362b;
        }

        /* renamed from: c */
        public C6272r1 mo21560c(int i) {
            return this.f30362b.mo6897b(i);
        }

        /* renamed from: d */
        public int mo21561d() {
            return this.f30362b.f5282c;
        }

        /* renamed from: e */
        public boolean mo21562e() {
            return C9995a.m51064b(this.f30365e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6291a.class != obj.getClass()) {
                return false;
            }
            C6291a aVar = (C6291a) obj;
            if (this.f30363c != aVar.f30363c || !this.f30362b.equals(aVar.f30362b) || !Arrays.equals(this.f30364d, aVar.f30364d) || !Arrays.equals(this.f30365e, aVar.f30365e)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo21564f(int i) {
            return this.f30365e[i];
        }

        public int hashCode() {
            return (((((this.f30362b.hashCode() * 31) + (this.f30363c ? 1 : 0)) * 31) + Arrays.hashCode(this.f30364d)) * 31) + Arrays.hashCode(this.f30365e);
        }
    }

    public C6290v3(List<C6291a> list) {
        this.f30359a = C6685q.m38443t(list);
    }

    /* renamed from: d */
    private static String m37092d(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C6290v3 m37093e(Bundle bundle) {
        C6685q<C6291a> qVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m37092d(0));
        if (parcelableArrayList == null) {
            qVar = C6685q.m38445x();
        } else {
            qVar = C5921c.m34934b(C6291a.f30360f, parcelableArrayList);
        }
        return new C6290v3(qVar);
    }

    /* renamed from: b */
    public C6685q<C6291a> mo21555b() {
        return this.f30359a;
    }

    /* renamed from: c */
    public boolean mo21556c(int i) {
        for (int i2 = 0; i2 < this.f30359a.size(); i2++) {
            C6291a aVar = this.f30359a.get(i2);
            if (aVar.mo21562e() && aVar.mo21561d() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6290v3.class != obj.getClass()) {
            return false;
        }
        return this.f30359a.equals(((C6290v3) obj).f30359a);
    }

    public int hashCode() {
        return this.f30359a.hashCode();
    }
}
