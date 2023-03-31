package p015b3;

import android.os.Bundle;
import java.util.ArrayList;
import p161w3.C5921c;
import p161w3.C5961r;
import p177z1.C6224h;
import p190b7.C6685q;

/* renamed from: b3.z0 */
/* compiled from: TrackGroupArray */
public final class C1780z0 implements C6224h {

    /* renamed from: d */
    public static final C1780z0 f5294d = new C1780z0(new C1776x0[0]);

    /* renamed from: e */
    public static final C6224h.C6225a<C1780z0> f5295e = C1778y0.f5289a;

    /* renamed from: a */
    public final int f5296a;

    /* renamed from: b */
    private final C6685q<C1776x0> f5297b;

    /* renamed from: c */
    private int f5298c;

    public C1780z0(C1776x0... x0VarArr) {
        this.f5297b = C6685q.m38444u(x0VarArr);
        this.f5296a = x0VarArr.length;
        m8409f();
    }

    /* renamed from: d */
    private static String m8407d(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ C1780z0 m8408e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m8407d(0));
        if (parcelableArrayList == null) {
            return new C1780z0(new C1776x0[0]);
        }
        return new C1780z0((C1776x0[]) C5921c.m34934b(C1776x0.f5279f, parcelableArrayList).toArray(new C1776x0[0]));
    }

    /* renamed from: f */
    private void m8409f() {
        int i = 0;
        while (i < this.f5297b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f5297b.size(); i3++) {
                if (this.f5297b.get(i).equals(this.f5297b.get(i3))) {
                    C5961r.m35210d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public C1776x0 mo6903b(int i) {
        return this.f5297b.get(i);
    }

    /* renamed from: c */
    public int mo6904c(C1776x0 x0Var) {
        int indexOf = this.f5297b.indexOf(x0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1780z0.class != obj.getClass()) {
            return false;
        }
        C1780z0 z0Var = (C1780z0) obj;
        if (this.f5296a != z0Var.f5296a || !this.f5297b.equals(z0Var.f5297b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f5298c == 0) {
            this.f5298c = this.f5297b.hashCode();
        }
        return this.f5298c;
    }
}
