package p243gd;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p372ud.C12752c;

/* renamed from: gd.e */
/* compiled from: KotlinVersion.kt */
public final class C10332e implements Comparable<C10332e> {

    /* renamed from: e */
    public static final C10333a f40949e = new C10333a((C11665g) null);

    /* renamed from: f */
    public static final C10332e f40950f = C10334f.m52233a();

    /* renamed from: a */
    private final int f40951a;

    /* renamed from: b */
    private final int f40952b;

    /* renamed from: c */
    private final int f40953c;

    /* renamed from: d */
    private final int f40954d;

    /* renamed from: gd.e$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C10333a {
        private C10333a() {
        }

        public /* synthetic */ C10333a(C11665g gVar) {
            this();
        }
    }

    public C10332e(int i, int i2, int i3) {
        this.f40951a = i;
        this.f40952b = i2;
        this.f40953c = i3;
        this.f40954d = m52231b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m52231b(int i, int i2, int i3) {
        boolean z = false;
        if (new C12752c(0, 255).mo37683k(i) && new C12752c(0, 255).mo37683k(i2) && new C12752c(0, 255).mo37683k(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(C10332e eVar) {
        C11669k.m56787e(eVar, "other");
        return this.f40954d - eVar.f40954d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10332e eVar = obj instanceof C10332e ? (C10332e) obj : null;
        if (eVar != null && this.f40954d == eVar.f40954d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40954d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40951a);
        sb.append('.');
        sb.append(this.f40952b);
        sb.append('.');
        sb.append(this.f40953c);
        return sb.toString();
    }
}
