package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.List;
import p008a8.C6480n;
import p008a8.C6514y1;
import p211d8.C9885i;
import p211d8.C9890n;
import p247h8.C10432b;

/* renamed from: com.google.firebase.firestore.g */
/* compiled from: DocumentChange */
public class C7907g {

    /* renamed from: a */
    private final C7909b f34329a;

    /* renamed from: b */
    private final C7933p0 f34330b;

    /* renamed from: c */
    private final int f34331c;

    /* renamed from: d */
    private final int f34332d;

    /* renamed from: com.google.firebase.firestore.g$a */
    /* compiled from: DocumentChange */
    static /* synthetic */ class C7908a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34333a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                a8.n$a[] r0 = p008a8.C6480n.C6481a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34333a = r0
                a8.n$a r1 = p008a8.C6480n.C6481a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34333a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.n$a r1 = p008a8.C6480n.C6481a.METADATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34333a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.n$a r1 = p008a8.C6480n.C6481a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34333a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.n$a r1 = p008a8.C6480n.C6481a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.C7907g.C7908a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.firestore.g$b */
    /* compiled from: DocumentChange */
    public enum C7909b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    C7907g(C7933p0 p0Var, C7909b bVar, int i, int i2) {
        this.f34329a = bVar;
        this.f34330b = p0Var;
        this.f34331c = i;
        this.f34332d = i2;
    }

    /* renamed from: a */
    static List<C7907g> m43705a(FirebaseFirestore firebaseFirestore, C7916i0 i0Var, C6514y1 y1Var) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (y1Var.mo22089g().isEmpty()) {
            C9885i iVar = null;
            int i3 = 0;
            for (C6480n next : y1Var.mo22085d()) {
                C9885i b = next.mo22007b();
                C7933p0 h = C7933p0.m43833h(firebaseFirestore, b, y1Var.mo22094k(), y1Var.mo22088f().contains(b.getKey()));
                C10432b.m52648d(next.mo22008c() == C6480n.C6481a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                C10432b.m52648d(iVar == null || y1Var.mo22090h().mo21874c().compare(iVar, b) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new C7907g(h, C7909b.ADDED, -1, i3));
                iVar = b;
                i3++;
            }
        } else {
            C9890n g = y1Var.mo22089g();
            for (C6480n next2 : y1Var.mo22085d()) {
                if (i0Var != C7916i0.EXCLUDE || next2.mo22008c() != C6480n.C6481a.METADATA) {
                    C9885i b2 = next2.mo22007b();
                    C7933p0 h2 = C7933p0.m43833h(firebaseFirestore, b2, y1Var.mo22094k(), y1Var.mo22088f().contains(b2.getKey()));
                    C7909b f = m43706f(next2);
                    if (f != C7909b.ADDED) {
                        i = g.mo32402l(b2.getKey());
                        C10432b.m52648d(i >= 0, "Index for document not found", new Object[0]);
                        g = g.mo32403q(b2.getKey());
                    } else {
                        i = -1;
                    }
                    if (f != C7909b.REMOVED) {
                        g = g.mo32394c(b2);
                        i2 = g.mo32402l(b2.getKey());
                        C10432b.m52648d(i2 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        i2 = -1;
                    }
                    arrayList.add(new C7907g(h2, f, i, i2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static C7909b m43706f(C6480n nVar) {
        int i = C7908a.f34333a[nVar.mo22008c().ordinal()];
        if (i == 1) {
            return C7909b.ADDED;
        }
        if (i == 2 || i == 3) {
            return C7909b.MODIFIED;
        }
        if (i == 4) {
            return C7909b.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + nVar.mo22008c());
    }

    /* renamed from: b */
    public C7933p0 mo26340b() {
        return this.f34330b;
    }

    /* renamed from: c */
    public int mo26341c() {
        return this.f34332d;
    }

    /* renamed from: d */
    public int mo26342d() {
        return this.f34331c;
    }

    /* renamed from: e */
    public C7909b mo26343e() {
        return this.f34329a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7907g)) {
            return false;
        }
        C7907g gVar = (C7907g) obj;
        if (!this.f34329a.equals(gVar.f34329a) || !this.f34330b.equals(gVar.f34330b) || this.f34331c != gVar.f34331c || this.f34332d != gVar.f34332d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f34329a.hashCode() * 31) + this.f34330b.hashCode()) * 31) + this.f34331c) * 31) + this.f34332d;
    }
}
