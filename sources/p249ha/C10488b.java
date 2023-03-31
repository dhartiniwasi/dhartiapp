package p249ha;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: ha.b */
/* compiled from: OSInfluenceChannel.kt */
public enum C10488b {
    IAM("iam"),
    NOTIFICATION("notification");
    

    /* renamed from: e */
    public static final C10489a f41534e = null;

    /* renamed from: a */
    private final String f41535a;

    /* renamed from: ha.b$a */
    /* compiled from: OSInfluenceChannel.kt */
    public static final class C10489a {
        private C10489a() {
        }

        /* renamed from: a */
        public final C10488b mo33621a(String str) {
            C10488b bVar;
            if (str != null) {
                C10488b[] values = C10488b.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        bVar = null;
                        break;
                    }
                    bVar = values[length];
                    if (bVar.mo33619a(str)) {
                        break;
                    }
                }
                if (bVar != null) {
                    return bVar;
                }
            }
            return C10488b.NOTIFICATION;
        }

        public /* synthetic */ C10489a(C11665g gVar) {
            this();
        }
    }

    static {
        f41534e = new C10489a((C11665g) null);
    }

    private C10488b(String str) {
        this.f41535a = str;
    }

    /* renamed from: a */
    public final boolean mo33619a(String str) {
        C11669k.m56787e(str, "otherName");
        return C11669k.m56783a(this.f41535a, str);
    }

    public String toString() {
        return this.f41535a;
    }
}
