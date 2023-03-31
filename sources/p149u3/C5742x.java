package p149u3;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p015b3.C1776x0;
import p161w3.C5917a;
import p177z1.C6224h;
import p190b7.C6685q;
import p219e7.C9998d;

/* renamed from: u3.x */
/* compiled from: TrackSelectionOverride */
public final class C5742x implements C6224h {

    /* renamed from: c */
    public static final C6224h.C6225a<C5742x> f28657c = C12678w.f46447a;

    /* renamed from: a */
    public final C1776x0 f28658a;

    /* renamed from: b */
    public final C6685q<Integer> f28659b;

    public C5742x(C1776x0 x0Var, List<Integer> list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < x0Var.f5280a)) {
            this.f28658a = x0Var;
            this.f28659b = C6685q.m38443t(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    private static String m34289c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C5742x m34290d(Bundle bundle) {
        return new C5742x(C1776x0.f5279f.mo6454a((Bundle) C5917a.m34872e(bundle.getBundle(m34289c(0)))), C9998d.m51068c((int[]) C5917a.m34872e(bundle.getIntArray(m34289c(1)))));
    }

    /* renamed from: b */
    public int mo20226b() {
        return this.f28658a.f5282c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5742x.class != obj.getClass()) {
            return false;
        }
        C5742x xVar = (C5742x) obj;
        if (!this.f28658a.equals(xVar.f28658a) || !this.f28659b.equals(xVar.f28659b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f28658a.hashCode() + (this.f28659b.hashCode() * 31);
    }
}
