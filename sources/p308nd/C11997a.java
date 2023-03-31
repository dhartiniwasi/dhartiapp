package p308nd;

import p299md.C11886a;
import p353sd.C12516c;
import p362td.C12639a;

/* renamed from: nd.a */
/* compiled from: JDK8PlatformImplementations.kt */
public class C11997a extends C11886a {

    /* renamed from: nd.a$a */
    /* compiled from: JDK8PlatformImplementations.kt */
    private static final class C11998a {

        /* renamed from: a */
        public static final C11998a f44946a = new C11998a();

        /* renamed from: b */
        public static final Integer f44947b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                nd.a$a r0 = new nd.a$a
                r0.<init>()
                f44946a = r0
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
                f44947b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p308nd.C11997a.C11998a.<clinit>():void");
        }

        private C11998a() {
        }
    }

    /* renamed from: c */
    private final boolean m57844c(int i) {
        Integer num = C11998a.f44947b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: b */
    public C12516c mo36025b() {
        return m57844c(34) ? new C12639a() : super.mo36025b();
    }
}
