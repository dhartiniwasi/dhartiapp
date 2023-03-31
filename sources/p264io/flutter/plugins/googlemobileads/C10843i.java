package p264io.flutter.plugins.googlemobileads;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import p006a4.C0095a;
import p264io.flutter.plugins.googlemobileads.C10853l;

/* renamed from: io.flutter.plugins.googlemobileads.i */
/* compiled from: FlutterAdManagerAdRequest */
class C10843i extends C10853l {

    /* renamed from: j */
    private final Map<String, String> f42325j;

    /* renamed from: k */
    private final Map<String, List<String>> f42326k;

    /* renamed from: l */
    private final String f42327l;

    /* renamed from: io.flutter.plugins.googlemobileads.i$b */
    /* compiled from: FlutterAdManagerAdRequest */
    static class C10845b extends C10853l.C10854a {

        /* renamed from: j */
        private Map<String, String> f42328j;

        /* renamed from: k */
        private Map<String, List<String>> f42329k;

        /* renamed from: l */
        private String f42330l;

        C10845b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public C10843i mo34545a() {
            return new C10843i(mo34570e(), mo34568c(), this.f42328j, this.f42329k, mo34574i(), mo34573h(), mo34569d(), this.f42330l, mo34571f(), mo34572g(), mo34567b(), mo34575j());
        }

        /* renamed from: u */
        public C10845b mo34547u(Map<String, String> map) {
            this.f42328j = map;
            return this;
        }

        /* renamed from: v */
        public C10845b mo34548v(Map<String, List<String>> map) {
            this.f42329k = map;
            return this;
        }

        /* renamed from: w */
        public C10845b mo34549w(String str) {
            this.f42330l = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10843i)) {
            return false;
        }
        C10843i iVar = (C10843i) obj;
        if (!super.equals(obj) || !Objects.equals(this.f42325j, iVar.f42325j) || !Objects.equals(this.f42326k, iVar.f42326k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f42325j, this.f42326k});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0095a mo34541k(String str) {
        C0095a.C0096a aVar = new C0095a.C0096a();
        mo34566j(aVar, str);
        Map<String, String> map = this.f42325j;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                aVar.mo232n((String) next.getKey(), (String) next.getValue());
            }
        }
        Map<String, List<String>> map2 = this.f42326k;
        if (map2 != null) {
            for (Map.Entry next2 : map2.entrySet()) {
                aVar.mo233o((String) next2.getKey(), (List) next2.getValue());
            }
        }
        String str2 = this.f42327l;
        if (str2 != null) {
            aVar.mo236r(str2);
        }
        return aVar.mo230c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Map<String, String> mo34542l() {
        return this.f42325j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<String, List<String>> mo34543m() {
        return this.f42326k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo34544n() {
        return this.f42327l;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10843i(List<String> list, String str, Map<String, String> map, Map<String, List<String>> map2, Boolean bool, List<String> list2, Integer num, String str2, String str3, C10850j0 j0Var, Map<String, String> map3, String str4) {
        super(list, str, bool, list2, num, str3, j0Var, map3, str4);
        this.f42325j = map;
        this.f42326k = map2;
        this.f42327l = str2;
    }
}
