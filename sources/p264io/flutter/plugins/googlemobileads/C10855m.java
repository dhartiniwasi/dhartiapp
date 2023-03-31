package p264io.flutter.plugins.googlemobileads;

import android.content.Context;
import p179z3.C6337h;

/* renamed from: io.flutter.plugins.googlemobileads.m */
/* compiled from: FlutterAdSize */
class C10855m {

    /* renamed from: a */
    final C6337h f42364a;

    /* renamed from: b */
    final int f42365b;

    /* renamed from: c */
    final int f42366c;

    /* renamed from: io.flutter.plugins.googlemobileads.m$a */
    /* compiled from: FlutterAdSize */
    static class C10856a {
        C10856a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6337h mo34588a(Context context, int i) {
            return C6337h.m37301a(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6337h mo34589b(Context context, int i) {
            return C6337h.m37302b(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6337h mo34590c(int i, int i2) {
            return C6337h.m37303e(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6337h mo34591d(Context context, int i) {
            return C6337h.m37304f(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6337h mo34592e(Context context, int i) {
            return C6337h.m37305g(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6337h mo34593f(Context context, int i) {
            return C6337h.m37306h(context, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C6337h mo34594g(Context context, int i) {
            return C6337h.m37307i(context, i);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$b */
    /* compiled from: FlutterAdSize */
    static class C10857b extends C10855m {

        /* renamed from: d */
        final String f42367d;

        C10857b(Context context, C10856a aVar, String str, int i) {
            super(m54226b(context, aVar, str, i));
            this.f42367d = str;
        }

        /* renamed from: b */
        private static C6337h m54226b(Context context, C10856a aVar, String str, int i) {
            if (str == null) {
                return aVar.mo34588a(context, i);
            }
            if (str.equals("portrait")) {
                return aVar.mo34593f(context, i);
            }
            if (str.equals("landscape")) {
                return aVar.mo34591d(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$c */
    /* compiled from: FlutterAdSize */
    static class C10858c extends C10855m {
        C10858c() {
            super(C6337h.f30525p);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$d */
    /* compiled from: FlutterAdSize */
    static class C10859d extends C10855m {

        /* renamed from: d */
        final Integer f42368d;

        /* renamed from: e */
        final Integer f42369e;

        C10859d(C10856a aVar, Context context, int i, Integer num, Integer num2) {
            super(m54227b(aVar, context, i, num, num2));
            this.f42368d = num;
            this.f42369e = num2;
        }

        /* renamed from: b */
        private static C6337h m54227b(C10856a aVar, Context context, int i, Integer num, Integer num2) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return aVar.mo34594g(context, i);
                }
                return aVar.mo34592e(context, i);
            } else if (num2 != null) {
                return aVar.mo34590c(i, num2.intValue());
            } else {
                return aVar.mo34589b(context, i);
            }
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.m$e */
    /* compiled from: FlutterAdSize */
    static class C10860e extends C10855m {
        C10860e() {
            super(C6337h.f30524o);
        }
    }

    C10855m(int i, int i2) {
        this(new C6337h(i, i2));
    }

    /* renamed from: a */
    public C6337h mo34585a() {
        return this.f42364a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10855m)) {
            return false;
        }
        C10855m mVar = (C10855m) obj;
        if (this.f42365b == mVar.f42365b && this.f42366c == mVar.f42366c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f42365b * 31) + this.f42366c;
    }

    C10855m(C6337h hVar) {
        this.f42364a = hVar;
        this.f42365b = hVar.mo21668j();
        this.f42366c = hVar.mo21664c();
    }
}
