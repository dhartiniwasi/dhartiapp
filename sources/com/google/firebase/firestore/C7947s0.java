package com.google.firebase.firestore;

import java.util.HashSet;
import java.util.List;
import p220e8.C10007d;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.s0 */
/* compiled from: SetOptions */
public final class C7947s0 {

    /* renamed from: c */
    static final C7947s0 f34410c = new C7947s0(false, (C10007d) null);

    /* renamed from: d */
    private static final C7947s0 f34411d = new C7947s0(true, (C10007d) null);

    /* renamed from: a */
    private final boolean f34412a;

    /* renamed from: b */
    private final C10007d f34413b;

    private C7947s0(boolean z, C10007d dVar) {
        C10472x.m52784a(dVar == null || z, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f34412a = z;
        this.f34413b = dVar;
    }

    /* renamed from: c */
    public static C7947s0 m43874c() {
        return f34411d;
    }

    /* renamed from: d */
    public static C7947s0 m43875d(List<C7932p> list) {
        HashSet hashSet = new HashSet();
        for (C7932p c : list) {
            hashSet.add(c.mo26428c());
        }
        return new C7947s0(true, C10007d.m51096b(hashSet));
    }

    /* renamed from: a */
    public C10007d mo26452a() {
        return this.f34413b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo26453b() {
        return this.f34412a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7947s0.class != obj.getClass()) {
            return false;
        }
        C7947s0 s0Var = (C7947s0) obj;
        if (this.f34412a != s0Var.f34412a) {
            return false;
        }
        C10007d dVar = this.f34413b;
        C10007d dVar2 = s0Var.f34413b;
        if (dVar != null) {
            return dVar.equals(dVar2);
        }
        if (dVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f34412a ? 1 : 0) * true;
        C10007d dVar = this.f34413b;
        return i + (dVar != null ? dVar.hashCode() : 0);
    }
}
