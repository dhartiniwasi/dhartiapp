package p179z3;

import com.google.android.gms.internal.ads.pm0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: z3.u */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C6351u {

    /* renamed from: e */
    public static final List f30548e = Arrays.asList(new String[]{"MA", "T", "PG", "G"});

    /* renamed from: a */
    private final int f30549a;

    /* renamed from: b */
    private final int f30550b;

    /* renamed from: c */
    private final String f30551c;

    /* renamed from: d */
    private final List f30552d;

    /* renamed from: z3.u$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class C6352a {

        /* renamed from: a */
        private int f30553a = -1;

        /* renamed from: b */
        private int f30554b = -1;

        /* renamed from: c */
        private String f30555c = null;

        /* renamed from: d */
        private final List f30556d = new ArrayList();

        /* renamed from: a */
        public C6351u mo21721a() {
            return new C6351u(this.f30553a, this.f30554b, this.f30555c, this.f30556d, (C6336g0) null);
        }

        /* renamed from: b */
        public C6352a mo21722b(String str) {
            if (str == null || "".equals(str)) {
                this.f30555c = null;
            } else if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
                this.f30555c = str;
            } else {
                pm0.m18667g("Invalid value passed to setMaxAdContentRating: ".concat(str));
            }
            return this;
        }

        /* renamed from: c */
        public C6352a mo21723c(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f30553a = i;
            } else {
                pm0.m18667g("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            }
            return this;
        }

        /* renamed from: d */
        public C6352a mo21724d(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f30554b = i;
            } else {
                pm0.m18667g("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            }
            return this;
        }

        /* renamed from: e */
        public C6352a mo21725e(List<String> list) {
            this.f30556d.clear();
            if (list != null) {
                this.f30556d.addAll(list);
            }
            return this;
        }
    }

    /* synthetic */ C6351u(int i, int i2, String str, List list, C6336g0 g0Var) {
        this.f30549a = i;
        this.f30550b = i2;
        this.f30551c = str;
        this.f30552d = list;
    }

    /* renamed from: a */
    public String mo21716a() {
        String str = this.f30551c;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public int mo21717b() {
        return this.f30549a;
    }

    /* renamed from: c */
    public int mo21718c() {
        return this.f30550b;
    }

    /* renamed from: d */
    public List<String> mo21719d() {
        return new ArrayList(this.f30552d);
    }

    /* renamed from: e */
    public C6352a mo21720e() {
        C6352a aVar = new C6352a();
        aVar.mo21723c(this.f30549a);
        aVar.mo21724d(this.f30550b);
        aVar.mo21722b(this.f30551c);
        aVar.mo21725e(this.f30552d);
        return aVar;
    }
}
