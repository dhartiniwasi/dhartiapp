package p149u3;

import p161w3.C5953m0;
import p177z1.C6223g3;
import p177z1.C6290v3;

/* renamed from: u3.c0 */
/* compiled from: TrackSelectorResult */
public final class C5720c0 {

    /* renamed from: a */
    public final int f28540a;

    /* renamed from: b */
    public final C6223g3[] f28541b;

    /* renamed from: c */
    public final C5735s[] f28542c;

    /* renamed from: d */
    public final C6290v3 f28543d;

    /* renamed from: e */
    public final Object f28544e;

    public C5720c0(C6223g3[] g3VarArr, C5735s[] sVarArr, C6290v3 v3Var, Object obj) {
        this.f28541b = g3VarArr;
        this.f28542c = (C5735s[]) sVarArr.clone();
        this.f28543d = v3Var;
        this.f28544e = obj;
        this.f28540a = g3VarArr.length;
    }

    /* renamed from: a */
    public boolean mo20158a(C5720c0 c0Var) {
        if (c0Var == null || c0Var.f28542c.length != this.f28542c.length) {
            return false;
        }
        for (int i = 0; i < this.f28542c.length; i++) {
            if (!mo20159b(c0Var, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo20159b(C5720c0 c0Var, int i) {
        if (c0Var != null && C5953m0.m35124c(this.f28541b[i], c0Var.f28541b[i]) && C5953m0.m35124c(this.f28542c[i], c0Var.f28542c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo20160c(int i) {
        return this.f28541b[i] != null;
    }
}
