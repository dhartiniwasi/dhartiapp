package p172y2;

import p127r2.C5432a;
import p127r2.C5435b;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: y2.b */
/* compiled from: SpliceCommand */
public abstract class C6119b implements C5432a.C5434b {
    /* renamed from: J0 */
    public /* synthetic */ void mo17874J0(C6214e2.C6216b bVar) {
        C5435b.m33284c(this, bVar);
    }

    /* renamed from: c0 */
    public /* synthetic */ C6272r1 mo17875c0() {
        return C5435b.m33283b(this);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }
}
