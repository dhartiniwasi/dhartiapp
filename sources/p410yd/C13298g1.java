package p410yd;

import java.io.Closeable;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11670l;
import p272jd.C11562b;
import p272jd.C11570g;
import p344rd.C12439l;

/* renamed from: yd.g1 */
/* compiled from: Executors.kt */
public abstract class C13298g1 extends C13282d0 implements Closeable {

    /* renamed from: b */
    public static final C13299a f47620b = new C13299a((C11665g) null);

    /* renamed from: yd.g1$a */
    /* compiled from: Executors.kt */
    public static final class C13299a extends C11562b<C13282d0, C13298g1> {

        /* renamed from: yd.g1$a$a */
        /* compiled from: Executors.kt */
        static final class C13300a extends C11670l implements C12439l<C11570g.C11573b, C13298g1> {

            /* renamed from: a */
            public static final C13300a f47621a = new C13300a();

            C13300a() {
                super(1);
            }

            /* renamed from: a */
            public final C13298g1 invoke(C11570g.C11573b bVar) {
                if (bVar instanceof C13298g1) {
                    return (C13298g1) bVar;
                }
                return null;
            }
        }

        private C13299a() {
            super(C13282d0.f47612a, C13300a.f47621a);
        }

        public /* synthetic */ C13299a(C11665g gVar) {
            this();
        }
    }
}
