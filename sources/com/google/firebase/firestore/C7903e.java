package com.google.firebase.firestore;

import com.google.protobuf.C8153i;
import p247h8.C10449g0;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.e */
/* compiled from: Blob */
public class C7903e implements Comparable<C7903e> {

    /* renamed from: a */
    private final C8153i f34326a;

    private C7903e(C8153i iVar) {
        this.f34326a = iVar;
    }

    /* renamed from: b */
    public static C7903e m43700b(C8153i iVar) {
        C10472x.m52786c(iVar, "Provided ByteString must not be null.");
        return new C7903e(iVar);
    }

    /* renamed from: c */
    public static C7903e m43701c(byte[] bArr) {
        C10472x.m52786c(bArr, "Provided bytes array must not be null.");
        return new C7903e(C8153i.m44777q(bArr));
    }

    /* renamed from: a */
    public int compareTo(C7903e eVar) {
        return C10449g0.m52710j(this.f34326a, eVar.f34326a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7903e) && this.f34326a.equals(((C7903e) obj).f34326a);
    }

    public int hashCode() {
        return this.f34326a.hashCode();
    }

    /* renamed from: j */
    public C8153i mo26336j() {
        return this.f34326a;
    }

    /* renamed from: k */
    public byte[] mo26337k() {
        return this.f34326a.mo26932K();
    }

    public String toString() {
        return "Blob { bytes=" + C10449g0.m52698A(this.f34326a) + " }";
    }
}
