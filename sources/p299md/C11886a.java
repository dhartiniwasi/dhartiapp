package p299md;

import kotlin.jvm.internal.C11669k;
import p290ld.C11786a;

/* renamed from: md.a */
/* compiled from: JDK7PlatformImplementations.kt */
public class C11886a extends C11786a {

    /* renamed from: md.a$a */
    /* compiled from: JDK7PlatformImplementations.kt */
    private static final class C11887a {

        /* renamed from: a */
        public static final C11887a f44631a = new C11887a();

        /* renamed from: b */
        public static final Integer f44632b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                md.a$a r0 = new md.a$a
                r0.<init>()
                f44631a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f44632b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299md.C11886a.C11887a.<clinit>():void");
        }

        private C11887a() {
        }
    }

    /* renamed from: c */
    private final boolean m57400c(int i) {
        Integer num = C11887a.f44632b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo36024a(Throwable th, Throwable th2) {
        C11669k.m56787e(th, "cause");
        C11669k.m56787e(th2, "exception");
        if (m57400c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo36024a(th, th2);
        }
    }
}
