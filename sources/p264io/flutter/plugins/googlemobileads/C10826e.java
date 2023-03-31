package p264io.flutter.plugins.googlemobileads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p179z3.C6321a;
import p179z3.C6341k;
import p179z3.C6344n;
import p179z3.C6353v;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: io.flutter.plugins.googlemobileads.e */
/* compiled from: FlutterAd */
abstract class C10826e {

    /* renamed from: a */
    protected final int f42276a;

    /* renamed from: io.flutter.plugins.googlemobileads.e$d */
    /* compiled from: FlutterAd */
    static abstract class C10830d extends C10826e {
        C10830d(int i) {
            super(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo34482c(boolean z);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo34483d();
    }

    C10826e(int i) {
        this.f42276a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo34477a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10731f mo34478b() {
        return null;
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$a */
    /* compiled from: FlutterAd */
    static class C10827a {

        /* renamed from: a */
        final int f42277a;

        /* renamed from: b */
        final String f42278b;

        /* renamed from: c */
        final String f42279c;

        C10827a(C6321a aVar) {
            this.f42277a = aVar.mo21633a();
            this.f42278b = aVar.mo21634b();
            this.f42279c = aVar.mo21635c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10827a)) {
                return false;
            }
            C10827a aVar = (C10827a) obj;
            if (this.f42277a == aVar.f42277a && this.f42278b.equals(aVar.f42278b)) {
                return this.f42279c.equals(aVar.f42279c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f42277a), this.f42278b, this.f42279c});
        }

        C10827a(int i, String str, String str2) {
            this.f42277a = i;
            this.f42278b = str;
            this.f42279c = str2;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$c */
    /* compiled from: FlutterAd */
    static class C10829c {

        /* renamed from: a */
        final int f42289a;

        /* renamed from: b */
        final String f42290b;

        /* renamed from: c */
        final String f42291c;

        /* renamed from: d */
        C10831e f42292d;

        C10829c(C6344n nVar) {
            this.f42289a = nVar.mo21633a();
            this.f42290b = nVar.mo21634b();
            this.f42291c = nVar.mo21635c();
            if (nVar.mo21713f() != null) {
                this.f42292d = new C10831e(nVar.mo21713f());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10829c)) {
                return false;
            }
            C10829c cVar = (C10829c) obj;
            if (this.f42289a == cVar.f42289a && this.f42290b.equals(cVar.f42290b) && Objects.equals(this.f42292d, cVar.f42292d)) {
                return this.f42291c.equals(cVar.f42291c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f42289a), this.f42290b, this.f42291c, this.f42292d});
        }

        C10829c(int i, String str, String str2, C10831e eVar) {
            this.f42289a = i;
            this.f42290b = str;
            this.f42291c = str2;
            this.f42292d = eVar;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$b */
    /* compiled from: FlutterAd */
    static class C10828b {

        /* renamed from: a */
        private final String f42280a;

        /* renamed from: b */
        private final long f42281b;

        /* renamed from: c */
        private final String f42282c;

        /* renamed from: d */
        private final Map<String, String> f42283d;

        /* renamed from: e */
        private C10827a f42284e;

        /* renamed from: f */
        private final String f42285f;

        /* renamed from: g */
        private final String f42286g;

        /* renamed from: h */
        private final String f42287h;

        /* renamed from: i */
        private final String f42288i;

        C10828b(C6341k kVar) {
            this.f42280a = kVar.mo21690f();
            this.f42281b = kVar.mo21692h();
            this.f42282c = kVar.toString();
            if (kVar.mo21691g() != null) {
                this.f42283d = new HashMap();
                for (String str : kVar.mo21691g().keySet()) {
                    this.f42283d.put(str, kVar.mo21691g().get(str).toString());
                }
            } else {
                this.f42283d = new HashMap();
            }
            if (kVar.mo21685a() != null) {
                this.f42284e = new C10827a(kVar.mo21685a());
            }
            this.f42285f = kVar.mo21689e();
            this.f42286g = kVar.mo21686b();
            this.f42287h = kVar.mo21688d();
            this.f42288i = kVar.mo21687c();
        }

        /* renamed from: a */
        public String mo34495a() {
            return this.f42286g;
        }

        /* renamed from: b */
        public String mo34496b() {
            return this.f42288i;
        }

        /* renamed from: c */
        public String mo34497c() {
            return this.f42287h;
        }

        /* renamed from: d */
        public String mo34498d() {
            return this.f42285f;
        }

        /* renamed from: e */
        public Map<String, String> mo34499e() {
            return this.f42283d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10828b)) {
                return false;
            }
            C10828b bVar = (C10828b) obj;
            if (!Objects.equals(this.f42280a, bVar.f42280a) || this.f42281b != bVar.f42281b || !Objects.equals(this.f42282c, bVar.f42282c) || !Objects.equals(this.f42284e, bVar.f42284e) || !Objects.equals(this.f42283d, bVar.f42283d) || !Objects.equals(this.f42285f, bVar.f42285f) || !Objects.equals(this.f42286g, bVar.f42286g) || !Objects.equals(this.f42287h, bVar.f42287h) || !Objects.equals(this.f42288i, bVar.f42288i)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public String mo34501f() {
            return this.f42280a;
        }

        /* renamed from: g */
        public String mo34502g() {
            return this.f42282c;
        }

        /* renamed from: h */
        public C10827a mo34503h() {
            return this.f42284e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f42280a, Long.valueOf(this.f42281b), this.f42282c, this.f42284e, this.f42285f, this.f42286g, this.f42287h, this.f42288i});
        }

        /* renamed from: i */
        public long mo34505i() {
            return this.f42281b;
        }

        C10828b(String str, long j, String str2, Map<String, String> map, C10827a aVar, String str3, String str4, String str5, String str6) {
            this.f42280a = str;
            this.f42281b = j;
            this.f42282c = str2;
            this.f42283d = map;
            this.f42284e = aVar;
            this.f42285f = str3;
            this.f42286g = str4;
            this.f42287h = str5;
            this.f42288i = str6;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.e$e */
    /* compiled from: FlutterAd */
    static class C10831e {

        /* renamed from: a */
        private final String f42293a;

        /* renamed from: b */
        private final String f42294b;

        /* renamed from: c */
        private final List<C10828b> f42295c;

        /* renamed from: d */
        private final C10828b f42296d;

        /* renamed from: e */
        private final Map<String, String> f42297e;

        C10831e(C6353v vVar) {
            this.f42293a = vVar.mo21730e();
            this.f42294b = vVar.mo21728c();
            ArrayList arrayList = new ArrayList();
            for (C6341k bVar : vVar.mo21726a()) {
                arrayList.add(new C10828b(bVar));
            }
            this.f42295c = arrayList;
            if (vVar.mo21727b() != null) {
                this.f42296d = new C10828b(vVar.mo21727b());
            } else {
                this.f42296d = null;
            }
            HashMap hashMap = new HashMap();
            if (vVar.mo21729d() != null) {
                for (String str : vVar.mo21729d().keySet()) {
                    hashMap.put(str, vVar.mo21729d().get(str).toString());
                }
            }
            this.f42297e = hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C10828b> mo34508a() {
            return this.f42295c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C10828b mo34509b() {
            return this.f42296d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo34510c() {
            return this.f42294b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Map<String, String> mo34511d() {
            return this.f42297e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo34512e() {
            return this.f42293a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C10831e)) {
                return false;
            }
            C10831e eVar = (C10831e) obj;
            if (!Objects.equals(this.f42293a, eVar.f42293a) || !Objects.equals(this.f42294b, eVar.f42294b) || !Objects.equals(this.f42295c, eVar.f42295c) || !Objects.equals(this.f42296d, eVar.f42296d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f42293a, this.f42294b, this.f42295c, this.f42296d});
        }

        C10831e(String str, String str2, List<C10828b> list, C10828b bVar, Map<String, String> map) {
            this.f42293a = str;
            this.f42294b = str2;
            this.f42295c = list;
            this.f42296d = bVar;
            this.f42297e = map;
        }
    }
}
