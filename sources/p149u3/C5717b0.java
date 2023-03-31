package p149u3;

import p014b2.C1624e;
import p015b3.C1772x;
import p015b3.C1780z0;
import p155v3.C5798f;
import p161w3.C5917a;
import p177z1.C6220f3;
import p177z1.C6264q;
import p177z1.C6266q3;

/* renamed from: u3.b0 */
/* compiled from: TrackSelector */
public abstract class C5717b0 {

    /* renamed from: a */
    private C5718a f28531a;

    /* renamed from: b */
    private C5798f f28532b;

    /* renamed from: u3.b0$a */
    /* compiled from: TrackSelector */
    public interface C5718a {
        /* renamed from: c */
        void mo20141c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C5798f mo20133a() {
        return (C5798f) C5917a.m34875h(this.f28532b);
    }

    /* renamed from: b */
    public void mo20134b(C5718a aVar, C5798f fVar) {
        this.f28531a = aVar;
        this.f28532b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20135c() {
        C5718a aVar = this.f28531a;
        if (aVar != null) {
            aVar.mo20141c();
        }
    }

    /* renamed from: d */
    public boolean mo20136d() {
        return false;
    }

    /* renamed from: e */
    public abstract void mo20137e(Object obj);

    /* renamed from: f */
    public void mo20138f() {
        this.f28531a = null;
        this.f28532b = null;
    }

    /* renamed from: g */
    public abstract C5720c0 mo20139g(C6220f3[] f3VarArr, C1780z0 z0Var, C1772x.C1774b bVar, C6266q3 q3Var) throws C6264q;

    /* renamed from: h */
    public void mo20140h(C1624e eVar) {
    }
}
