package p249ha;

import kotlin.jvm.internal.C11665g;

/* renamed from: ha.c */
/* compiled from: OSInfluenceType.kt */
public enum C10490c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;
    

    /* renamed from: f */
    public static final C10491a f41541f = null;

    /* renamed from: ha.c$a */
    /* compiled from: OSInfluenceType.kt */
    public static final class C10491a {
        private C10491a() {
        }

        /* renamed from: a */
        public final C10490c mo33627a(String str) {
            C10490c cVar;
            if (str != null) {
                C10490c[] values = C10490c.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        cVar = null;
                        break;
                    }
                    cVar = values[length];
                    if (C13010n.m61256j(cVar.name(), str, true)) {
                        break;
                    }
                }
                if (cVar != null) {
                    return cVar;
                }
            }
            return C10490c.UNATTRIBUTED;
        }

        public /* synthetic */ C10491a(C11665g gVar) {
            this();
        }
    }

    static {
        f41541f = new C10491a((C11665g) null);
    }

    /* renamed from: a */
    public final boolean mo33622a() {
        return mo33623b() || mo33625j();
    }

    /* renamed from: b */
    public final boolean mo33623b() {
        return this == DIRECT;
    }

    /* renamed from: c */
    public final boolean mo33624c() {
        return this == DISABLED;
    }

    /* renamed from: j */
    public final boolean mo33625j() {
        return this == INDIRECT;
    }

    /* renamed from: k */
    public final boolean mo33626k() {
        return this == UNATTRIBUTED;
    }
}
