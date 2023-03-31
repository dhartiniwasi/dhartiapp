package p264io.flutter.plugins.googlemobileads;

import p046f4.C4279a;

/* renamed from: io.flutter.plugins.googlemobileads.o */
/* compiled from: FlutterAdapterStatus */
class C10862o {

    /* renamed from: a */
    final C10864b f42373a;

    /* renamed from: b */
    final String f42374b;

    /* renamed from: c */
    final Number f42375c;

    /* renamed from: io.flutter.plugins.googlemobileads.o$a */
    /* compiled from: FlutterAdapterStatus */
    static /* synthetic */ class C10863a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f4.a$a[] r0 = p046f4.C4279a.C4280a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42376a = r0
                f4.a$a r1 = p046f4.C4279a.C4280a.NOT_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42376a     // Catch:{ NoSuchFieldError -> 0x001d }
                f4.a$a r1 = p046f4.C4279a.C4280a.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugins.googlemobileads.C10862o.C10863a.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.o$b */
    /* compiled from: FlutterAdapterStatus */
    enum C10864b {
        NOT_READY,
        READY
    }

    C10862o(C10864b bVar, String str, Number number) {
        this.f42373a = bVar;
        this.f42374b = str;
        this.f42375c = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10862o)) {
            return false;
        }
        C10862o oVar = (C10862o) obj;
        if (this.f42373a == oVar.f42373a && this.f42374b.equals(oVar.f42374b)) {
            return this.f42375c.equals(oVar.f42375c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f42373a.hashCode() * 31) + this.f42374b.hashCode()) * 31) + this.f42375c.hashCode();
    }

    C10862o(C4279a aVar) {
        int i = C10863a.f42376a[aVar.mo8257a().ordinal()];
        if (i == 1) {
            this.f42373a = C10864b.NOT_READY;
        } else if (i == 2) {
            this.f42373a = C10864b.READY;
        } else {
            throw new IllegalArgumentException(String.format("Unable to handle state: %s", new Object[]{aVar.mo8257a()}));
        }
        this.f42374b = aVar.getDescription();
        this.f42375c = Integer.valueOf(aVar.mo8258b());
    }
}
