package androidx.lifecycle;

import androidx.lifecycle.C1208j;

class FullLifecycleObserverAdapter implements C1216l {

    /* renamed from: a */
    private final C1190f f3249a;

    /* renamed from: b */
    private final C1216l f3250b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C1167a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3251a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.j$b[] r0 = androidx.lifecycle.C1208j.C1210b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3251a = r0
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f3251a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C1208j.C1210b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C1167a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C1190f fVar, C1216l lVar) {
        this.f3249a = fVar;
        this.f3250b = lVar;
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        switch (C1167a.f3251a[bVar.ordinal()]) {
            case 1:
                this.f3249a.mo3610b(nVar);
                break;
            case 2:
                this.f3249a.mo3614h(nVar);
                break;
            case 3:
                this.f3249a.mo3609a(nVar);
                break;
            case 4:
                this.f3249a.mo3611d(nVar);
                break;
            case 5:
                this.f3249a.mo3612f(nVar);
                break;
            case 6:
                this.f3249a.mo3613g(nVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C1216l lVar = this.f3250b;
        if (lVar != null) {
            lVar.mo752c(nVar, bVar);
        }
    }
}
