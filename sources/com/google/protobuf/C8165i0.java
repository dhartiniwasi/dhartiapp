package com.google.protobuf;

/* renamed from: com.google.protobuf.i0 */
/* compiled from: LazyFieldLite */
public class C8165i0 {

    /* renamed from: e */
    private static final C8210q f34920e = C8210q.m45546b();

    /* renamed from: a */
    private C8153i f34921a;

    /* renamed from: b */
    private C8210q f34922b;

    /* renamed from: c */
    protected volatile C8243v0 f34923c;

    /* renamed from: d */
    private volatile C8153i f34924d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f34923c = r4;
        r3.f34924d = com.google.protobuf.C8153i.f34908b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26955a(com.google.protobuf.C8243v0 r4) {
        /*
            r3 = this;
            com.google.protobuf.v0 r0 = r3.f34923c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.v0 r0 = r3.f34923c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.i r0 = r3.f34921a     // Catch:{ e0 -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.f1 r0 = r4.mo27321j()     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r1 = r3.f34921a     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.q r2 = r3.f34922b     // Catch:{ e0 -> 0x002c }
            java.lang.Object r0 = r0.mo26795a(r1, r2)     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.v0 r0 = (com.google.protobuf.C8243v0) r0     // Catch:{ e0 -> 0x002c }
            r3.f34923c = r0     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r0 = r3.f34921a     // Catch:{ e0 -> 0x002c }
            r3.f34924d = r0     // Catch:{ e0 -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f34923c = r4     // Catch:{ e0 -> 0x002c }
            com.google.protobuf.i r0 = com.google.protobuf.C8153i.f34908b     // Catch:{ e0 -> 0x002c }
            r3.f34924d = r0     // Catch:{ e0 -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f34923c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.i r4 = com.google.protobuf.C8153i.f34908b     // Catch:{ all -> 0x0034 }
            r3.f34924d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8165i0.mo26955a(com.google.protobuf.v0):void");
    }

    /* renamed from: b */
    public int mo26956b() {
        if (this.f34924d != null) {
            return this.f34924d.size();
        }
        C8153i iVar = this.f34921a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f34923c != null) {
            return this.f34923c.mo27319f();
        }
        return 0;
    }

    /* renamed from: c */
    public C8243v0 mo26957c(C8243v0 v0Var) {
        mo26955a(v0Var);
        return this.f34923c;
    }

    /* renamed from: d */
    public C8243v0 mo26958d(C8243v0 v0Var) {
        C8243v0 v0Var2 = this.f34923c;
        this.f34921a = null;
        this.f34924d = null;
        this.f34923c = v0Var;
        return v0Var2;
    }

    /* renamed from: e */
    public C8153i mo26959e() {
        if (this.f34924d != null) {
            return this.f34924d;
        }
        C8153i iVar = this.f34921a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f34924d != null) {
                C8153i iVar2 = this.f34924d;
                return iVar2;
            }
            if (this.f34923c == null) {
                this.f34924d = C8153i.f34908b;
            } else {
                this.f34924d = this.f34923c.mo26772e();
            }
            C8153i iVar3 = this.f34924d;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8165i0)) {
            return false;
        }
        C8165i0 i0Var = (C8165i0) obj;
        C8243v0 v0Var = this.f34923c;
        C8243v0 v0Var2 = i0Var.f34923c;
        if (v0Var == null && v0Var2 == null) {
            return mo26959e().equals(i0Var.mo26959e());
        }
        if (v0Var != null && v0Var2 != null) {
            return v0Var.equals(v0Var2);
        }
        if (v0Var != null) {
            return v0Var.equals(i0Var.mo26957c(v0Var.mo27346a()));
        }
        return mo26957c(v0Var2.mo27346a()).equals(v0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
