package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8687z2;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/* renamed from: com.onesignal.q0 */
/* compiled from: OSDynamicTriggerController */
class C8571q0 {

    /* renamed from: c */
    private static Date f35913c = new Date();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8574c f35914a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ArrayList<String> f35915b = new ArrayList<>();

    /* renamed from: com.onesignal.q0$a */
    /* compiled from: OSDynamicTriggerController */
    class C8572a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ String f35916a;

        C8572a(String str) {
            this.f35916a = str;
        }

        public void run() {
            C8571q0.this.f35915b.remove(this.f35916a);
            C8571q0.this.f35914a.mo27621a();
        }
    }

    /* renamed from: com.onesignal.q0$b */
    /* compiled from: OSDynamicTriggerController */
    static /* synthetic */ class C8573b {

        /* renamed from: a */
        static final /* synthetic */ int[] f35918a;

        /* renamed from: b */
        static final /* synthetic */ int[] f35919b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.onesignal.z2$b[] r0 = com.onesignal.C8687z2.C8689b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35919b = r0
                r1 = 1
                com.onesignal.z2$b r2 = com.onesignal.C8687z2.C8689b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35919b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.z2$b r3 = com.onesignal.C8687z2.C8689b.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f35919b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.z2$b r3 = com.onesignal.C8687z2.C8689b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f35919b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.z2$b r3 = com.onesignal.C8687z2.C8689b.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f35919b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onesignal.z2$b r3 = com.onesignal.C8687z2.C8689b.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f35919b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onesignal.z2$b r3 = com.onesignal.C8687z2.C8689b.NOT_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.onesignal.z2$a[] r2 = com.onesignal.C8687z2.C8688a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f35918a = r2
                com.onesignal.z2$a r3 = com.onesignal.C8687z2.C8688a.SESSION_TIME     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f35918a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.onesignal.z2$a r2 = com.onesignal.C8687z2.C8688a.TIME_SINCE_LAST_IN_APP     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8571q0.C8573b.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.q0$c */
    /* compiled from: OSDynamicTriggerController */
    interface C8574c {
        /* renamed from: a */
        void mo27621a();

        /* renamed from: b */
        void mo28088b(String str);
    }

    C8571q0(C8574c cVar) {
        this.f35914a = cVar;
    }

    /* renamed from: d */
    private static boolean m47440d(double d, double d2, C8687z2.C8689b bVar) {
        switch (C8573b.f35919b[bVar.ordinal()]) {
            case 1:
                if (d2 < d) {
                    return true;
                }
                return false;
            case 2:
                if (d2 <= d || m47442f(d, d2)) {
                    return true;
                }
                return false;
            case 3:
                if (d2 >= d) {
                    return true;
                }
                return false;
            case 4:
                if (d2 >= d || m47442f(d, d2)) {
                    return true;
                }
                return false;
            case 5:
                return m47442f(d, d2);
            case 6:
                return !m47442f(d, d2);
            default:
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                C8338d3.m46594z1(r0Var, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar.toString());
                return false;
        }
    }

    /* renamed from: e */
    static void m47441e() {
        f35913c = new Date();
    }

    /* renamed from: f */
    private static boolean m47442f(double d, double d2) {
        return Math.abs(d - d2) < 0.3d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28086c(com.onesignal.C8687z2 r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r15.f36248e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.ArrayList<java.lang.String> r0 = r14.f35915b
            monitor-enter(r0)
            java.lang.Object r2 = r15.f36248e     // Catch:{ all -> 0x009e }
            boolean r2 = r2 instanceof java.lang.Number     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0011:
            int[] r2 = com.onesignal.C8571q0.C8573b.f35918a     // Catch:{ all -> 0x009e }
            com.onesignal.z2$a r3 = r15.f36245b     // Catch:{ all -> 0x009e }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x009e }
            r2 = r2[r3]     // Catch:{ all -> 0x009e }
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x004b
            r6 = 2
            if (r2 == r6) goto L_0x0025
            r6 = r4
            goto L_0x005b
        L_0x0025:
            com.onesignal.z0 r2 = com.onesignal.C8338d3.m46541m0()     // Catch:{ all -> 0x009e }
            boolean r2 = r2.mo27620Y()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0031:
            com.onesignal.z0 r2 = com.onesignal.C8338d3.m46541m0()     // Catch:{ all -> 0x009e }
            java.util.Date r2 = r2.f36203u     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x003d
            r6 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x005b
        L_0x003d:
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x009e }
            r6.<init>()     // Catch:{ all -> 0x009e }
            long r6 = r6.getTime()     // Catch:{ all -> 0x009e }
            long r8 = r2.getTime()     // Catch:{ all -> 0x009e }
            goto L_0x005a
        L_0x004b:
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x009e }
            r2.<init>()     // Catch:{ all -> 0x009e }
            long r6 = r2.getTime()     // Catch:{ all -> 0x009e }
            java.util.Date r2 = f35913c     // Catch:{ all -> 0x009e }
            long r8 = r2.getTime()     // Catch:{ all -> 0x009e }
        L_0x005a:
            long r6 = r6 - r8
        L_0x005b:
            java.lang.String r2 = r15.f36244a     // Catch:{ all -> 0x009e }
            java.lang.Object r8 = r15.f36248e     // Catch:{ all -> 0x009e }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x009e }
            double r8 = r8.doubleValue()     // Catch:{ all -> 0x009e }
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch:{ all -> 0x009e }
            double r10 = (double) r8     // Catch:{ all -> 0x009e }
            double r12 = (double) r6     // Catch:{ all -> 0x009e }
            com.onesignal.z2$b r15 = r15.f36247d     // Catch:{ all -> 0x009e }
            boolean r15 = m47440d(r10, r12, r15)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x007e
            com.onesignal.q0$c r15 = r14.f35914a     // Catch:{ all -> 0x009e }
            r15.mo28088b(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r3
        L_0x007e:
            long r8 = r8 - r6
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 > 0) goto L_0x0085
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x0085:
            java.util.ArrayList<java.lang.String> r15 = r14.f35915b     // Catch:{ all -> 0x009e }
            boolean r15 = r15.contains(r2)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x008f
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x008f:
            com.onesignal.q0$a r15 = new com.onesignal.q0$a     // Catch:{ all -> 0x009e }
            r15.<init>(r2)     // Catch:{ all -> 0x009e }
            com.onesignal.C8584r0.m47592a(r15, r2, r8)     // Catch:{ all -> 0x009e }
            java.util.ArrayList<java.lang.String> r15 = r14.f35915b     // Catch:{ all -> 0x009e }
            r15.add(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r1
        L_0x009e:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8571q0.mo28086c(com.onesignal.z2):boolean");
    }
}
