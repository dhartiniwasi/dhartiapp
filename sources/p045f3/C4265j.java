package p045f3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p038e3.C4235f;
import p045f3.C4269k;
import p161w3.C5917a;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: f3.j */
/* compiled from: Representation */
public abstract class C4265j {

    /* renamed from: a */
    public final long f23696a;

    /* renamed from: b */
    public final C6272r1 f23697b;

    /* renamed from: c */
    public final C6685q<C4256b> f23698c;

    /* renamed from: d */
    public final long f23699d;

    /* renamed from: e */
    public final List<C4260e> f23700e;

    /* renamed from: f */
    public final List<C4260e> f23701f;

    /* renamed from: g */
    public final List<C4260e> f23702g;

    /* renamed from: h */
    private final C4264i f23703h;

    /* renamed from: f3.j$b */
    /* compiled from: Representation */
    public static class C4267b extends C4265j implements C4235f {

        /* renamed from: i */
        final C4269k.C4270a f23704i;

        public C4267b(long j, C6272r1 r1Var, List<C4256b> list, C4269k.C4270a aVar, List<C4260e> list2, List<C4260e> list3, List<C4260e> list4) {
            super(j, r1Var, list, aVar, list2, list3, list4);
            this.f23704i = aVar;
        }

        /* renamed from: a */
        public String mo17687a() {
            return null;
        }

        /* renamed from: b */
        public long mo17600b(long j) {
            return this.f23704i.mo17700j(j);
        }

        /* renamed from: c */
        public long mo17601c(long j, long j2) {
            return this.f23704i.mo17698h(j, j2);
        }

        /* renamed from: d */
        public long mo17602d(long j, long j2) {
            return this.f23704i.mo17694d(j, j2);
        }

        /* renamed from: e */
        public long mo17603e(long j, long j2) {
            return this.f23704i.mo17696f(j, j2);
        }

        /* renamed from: f */
        public C4264i mo17604f(long j) {
            return this.f23704i.mo17701k(this, j);
        }

        /* renamed from: g */
        public long mo17605g(long j, long j2) {
            return this.f23704i.mo17699i(j, j2);
        }

        /* renamed from: h */
        public boolean mo17606h() {
            return this.f23704i.mo17702l();
        }

        /* renamed from: i */
        public long mo17607i() {
            return this.f23704i.mo17695e();
        }

        /* renamed from: j */
        public long mo17608j(long j) {
            return this.f23704i.mo17697g(j);
        }

        /* renamed from: k */
        public long mo17609k(long j, long j2) {
            return this.f23704i.mo17693c(j, j2);
        }

        /* renamed from: l */
        public C4235f mo17688l() {
            return this;
        }

        /* renamed from: m */
        public C4264i mo17689m() {
            return null;
        }
    }

    /* renamed from: f3.j$c */
    /* compiled from: Representation */
    public static class C4268c extends C4265j {

        /* renamed from: i */
        public final Uri f23705i;

        /* renamed from: j */
        public final long f23706j;

        /* renamed from: k */
        private final String f23707k;

        /* renamed from: l */
        private final C4264i f23708l;

        /* renamed from: m */
        private final C4276m f23709m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4268c(long j, C6272r1 r1Var, List<C4256b> list, C4269k.C4274e eVar, List<C4260e> list2, List<C4260e> list3, List<C4260e> list4, String str, long j2) {
            super(j, r1Var, list, eVar, list2, list3, list4);
            C4276m mVar;
            List<C4256b> list5 = list;
            this.f23705i = Uri.parse(list.get(0).f23643a);
            C4264i c = eVar.mo17705c();
            this.f23708l = c;
            this.f23707k = str;
            this.f23706j = j2;
            if (c != null) {
                mVar = null;
            } else {
                mVar = new C4276m(new C4264i((String) null, 0, j2));
            }
            this.f23709m = mVar;
        }

        /* renamed from: a */
        public String mo17687a() {
            return this.f23707k;
        }

        /* renamed from: l */
        public C4235f mo17688l() {
            return this.f23709m;
        }

        /* renamed from: m */
        public C4264i mo17689m() {
            return this.f23708l;
        }
    }

    /* renamed from: o */
    public static C4265j m28758o(long j, C6272r1 r1Var, List<C4256b> list, C4269k kVar, List<C4260e> list2, List<C4260e> list3, List<C4260e> list4, String str) {
        C4269k kVar2 = kVar;
        if (kVar2 instanceof C4269k.C4274e) {
            return new C4268c(j, r1Var, list, (C4269k.C4274e) kVar2, list2, list3, list4, str, -1);
        } else if (kVar2 instanceof C4269k.C4270a) {
            return new C4267b(j, r1Var, list, (C4269k.C4270a) kVar2, list2, list3, list4);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    /* renamed from: a */
    public abstract String mo17687a();

    /* renamed from: l */
    public abstract C4235f mo17688l();

    /* renamed from: m */
    public abstract C4264i mo17689m();

    /* renamed from: n */
    public C4264i mo17690n() {
        return this.f23703h;
    }

    private C4265j(long j, C6272r1 r1Var, List<C4256b> list, C4269k kVar, List<C4260e> list2, List<C4260e> list3, List<C4260e> list4) {
        List<C4260e> list5;
        C5917a.m34868a(!list.isEmpty());
        this.f23696a = j;
        this.f23697b = r1Var;
        this.f23698c = C6685q.m38443t(list);
        if (list2 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list2);
        }
        this.f23700e = list5;
        this.f23701f = list3;
        this.f23702g = list4;
        this.f23703h = kVar.mo17691a(this);
        this.f23699d = kVar.mo17692b();
    }
}
