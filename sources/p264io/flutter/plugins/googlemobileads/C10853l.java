package p264io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p179z3.C6334g;

/* renamed from: io.flutter.plugins.googlemobileads.l */
/* compiled from: FlutterAdRequest */
class C10853l {

    /* renamed from: a */
    private final List<String> f42346a;

    /* renamed from: b */
    private final String f42347b;

    /* renamed from: c */
    private final Boolean f42348c;

    /* renamed from: d */
    private final List<String> f42349d;

    /* renamed from: e */
    private final Integer f42350e;

    /* renamed from: f */
    private final String f42351f;

    /* renamed from: g */
    private final C10850j0 f42352g;

    /* renamed from: h */
    private final Map<String, String> f42353h;

    /* renamed from: i */
    private final String f42354i;

    /* renamed from: io.flutter.plugins.googlemobileads.l$a */
    /* compiled from: FlutterAdRequest */
    protected static class C10854a {

        /* renamed from: a */
        private List<String> f42355a;

        /* renamed from: b */
        private String f42356b;

        /* renamed from: c */
        private Boolean f42357c;

        /* renamed from: d */
        private List<String> f42358d;

        /* renamed from: e */
        private Integer f42359e;

        /* renamed from: f */
        private String f42360f;

        /* renamed from: g */
        private C10850j0 f42361g;

        /* renamed from: h */
        private Map<String, String> f42362h;

        /* renamed from: i */
        private String f42363i;

        protected C10854a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10853l mo34545a() {
            return new C10853l(this.f42355a, this.f42356b, this.f42357c, this.f42358d, this.f42359e, this.f42360f, this.f42361g, this.f42362h, this.f42363i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, String> mo34567b() {
            return this.f42362h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo34568c() {
            return this.f42356b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Integer mo34569d() {
            return this.f42359e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public List<String> mo34570e() {
            return this.f42355a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public String mo34571f() {
            return this.f42360f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C10850j0 mo34572g() {
            return this.f42361g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public List<String> mo34573h() {
            return this.f42358d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Boolean mo34574i() {
            return this.f42357c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public String mo34575j() {
            return this.f42363i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C10854a mo34576k(Map<String, String> map) {
            this.f42362h = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C10854a mo34577l(String str) {
            this.f42356b = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C10854a mo34578m(Integer num) {
            this.f42359e = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C10854a mo34579n(List<String> list) {
            this.f42355a = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C10854a mo34580o(String str) {
            this.f42360f = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C10854a mo34581p(C10850j0 j0Var) {
            this.f42361g = j0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C10854a mo34582q(List<String> list) {
            this.f42358d = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public C10854a mo34583r(Boolean bool) {
            this.f42357c = bool;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C10854a mo34584s(String str) {
            this.f42363i = str;
            return this;
        }
    }

    protected C10853l(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, C10850j0 j0Var, Map<String, String> map, String str3) {
        this.f42346a = list;
        this.f42347b = str;
        this.f42348c = bool;
        this.f42349d = list2;
        this.f42350e = num;
        this.f42351f = str2;
        this.f42352g = j0Var;
        this.f42353h = map;
        this.f42354i = str3;
    }

    /* renamed from: a */
    private void m54189a(C6334g.C6335a aVar, String str) {
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        HashMap hashMap = new HashMap();
        C10850j0 j0Var = this.f42352g;
        if (j0Var != null) {
            hashMap.putAll(j0Var.mo34552a(str, this.f42351f));
        }
        Map<String, String> map = this.f42353h;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.f42353h.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            hashMap.put(cls, bundle);
        }
        Boolean bool = this.f42348c;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(cls);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(cls, bundle2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            aVar.mo21654b((Class) entry.getKey(), (Bundle) entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6334g mo34558b(String str) {
        return mo34566j(new C6334g.C6335a(), str).mo230c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo34559c() {
        return this.f42353h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo34560d() {
        return this.f42347b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Integer mo34561e() {
        return this.f42350e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10853l)) {
            return false;
        }
        C10853l lVar = (C10853l) obj;
        if (!Objects.equals(this.f42346a, lVar.f42346a) || !Objects.equals(this.f42347b, lVar.f42347b) || !Objects.equals(this.f42348c, lVar.f42348c) || !Objects.equals(this.f42349d, lVar.f42349d) || !Objects.equals(this.f42350e, lVar.f42350e) || !Objects.equals(this.f42351f, lVar.f42351f) || !Objects.equals(this.f42352g, lVar.f42352g) || !Objects.equals(this.f42353h, lVar.f42353h)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<String> mo34562f() {
        return this.f42346a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo34563g() {
        return this.f42351f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<String> mo34564h() {
        return this.f42349d;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f42346a, this.f42347b, this.f42348c, this.f42349d, this.f42350e, this.f42351f, this.f42352g});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Boolean mo34565i() {
        return this.f42348c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C6334g.C6335a mo34566j(C6334g.C6335a aVar, String str) {
        List<String> list = this.f42346a;
        if (list != null) {
            for (String a : list) {
                aVar.mo21653a(a);
            }
        }
        String str2 = this.f42347b;
        if (str2 != null) {
            aVar.mo21655e(str2);
        }
        m54189a(aVar, str);
        List<String> list2 = this.f42349d;
        if (list2 != null) {
            aVar.mo21657g(list2);
        }
        Integer num = this.f42350e;
        if (num != null) {
            aVar.mo21656f(num.intValue());
        }
        aVar.mo21658h(this.f42354i);
        return aVar;
    }
}
