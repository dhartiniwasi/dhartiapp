package p264io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p183a9.C6517a;
import p183a9.C6519b;

/* renamed from: io.grpc.internal.a1 */
/* compiled from: JsonParser */
public final class C11111a1 {

    /* renamed from: a */
    private static final Logger f42908a = Logger.getLogger(C11111a1.class.getName());

    /* renamed from: io.grpc.internal.a1$a */
    /* compiled from: JsonParser */
    static /* synthetic */ class C11112a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42909a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a9.b[] r0 = p183a9.C6519b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42909a = r0
                a9.b r1 = p183a9.C6519b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42909a     // Catch:{ NoSuchFieldError -> 0x001d }
                a9.b r1 = p183a9.C6519b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42909a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a9.b r1 = p183a9.C6519b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42909a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a9.b r1 = p183a9.C6519b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42909a     // Catch:{ NoSuchFieldError -> 0x003e }
                a9.b r1 = p183a9.C6519b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42909a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a9.b r1 = p183a9.C6519b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11111a1.C11112a.<clinit>():void");
        }
    }

    private C11111a1() {
    }

    /* renamed from: a */
    public static Object m55072a(String str) throws IOException {
        C6517a aVar = new C6517a(new StringReader(str));
        try {
            return m55076e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e) {
                f42908a.log(Level.WARNING, "Failed to close", e);
            }
        }
    }

    /* renamed from: b */
    private static List<?> m55073b(C6517a aVar) throws IOException {
        aVar.mo22103a();
        ArrayList arrayList = new ArrayList();
        while (aVar.mo22109t()) {
            arrayList.add(m55076e(aVar));
        }
        boolean z = aVar.mo22101S() == C6519b.END_ARRAY;
        C6431n.m37568u(z, "Bad token: " + aVar.mo22102Y0());
        aVar.mo22107m();
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static Void m55074c(C6517a aVar) throws IOException {
        aVar.mo22099I();
        return null;
    }

    /* renamed from: d */
    private static Map<String, ?> m55075d(C6517a aVar) throws IOException {
        aVar.mo22104b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.mo22109t()) {
            linkedHashMap.put(aVar.mo22098G(), m55076e(aVar));
        }
        boolean z = aVar.mo22101S() == C6519b.END_OBJECT;
        C6431n.m37568u(z, "Bad token: " + aVar.mo22102Y0());
        aVar.mo22108n();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: e */
    private static Object m55076e(C6517a aVar) throws IOException {
        C6431n.m37568u(aVar.mo22109t(), "unexpected end of JSON");
        switch (C11112a.f42909a[aVar.mo22101S().ordinal()]) {
            case 1:
                return m55073b(aVar);
            case 2:
                return m55075d(aVar);
            case 3:
                return aVar.mo22100L();
            case 4:
                return Double.valueOf(aVar.mo22097F());
            case 5:
                return Boolean.valueOf(aVar.mo22096D());
            case 6:
                return m55074c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.mo22102Y0());
        }
    }
}
