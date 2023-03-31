package p290ld;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C11669k;
import p353sd.C12514b;
import p353sd.C12516c;

/* renamed from: ld.a */
/* compiled from: PlatformImplementations.kt */
public class C11786a {

    /* renamed from: ld.a$a */
    /* compiled from: PlatformImplementations.kt */
    private static final class C11787a {

        /* renamed from: a */
        public static final C11787a f44433a = new C11787a();

        /* renamed from: b */
        public static final Method f44434b;

        /* renamed from: c */
        public static final Method f44435c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                ld.a$a r0 = new ld.a$a
                r0.<init>()
                f44433a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C11669k.m56786d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C11669k.m56783a(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C11669k.m56786d(r7, r8)
                java.lang.Object r7 = p252hd.C10515f.m52936l(r7)
                boolean r7 = kotlin.jvm.internal.C11669k.m56783a(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = 0
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f44434b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C11669k.m56783a(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f44435c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p290ld.C11786a.C11787a.<clinit>():void");
        }

        private C11787a() {
        }
    }

    /* renamed from: a */
    public void mo36024a(Throwable th, Throwable th2) {
        C11669k.m56787e(th, "cause");
        C11669k.m56787e(th2, "exception");
        Method method = C11787a.f44434b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C12516c mo36025b() {
        return new C12514b();
    }
}
