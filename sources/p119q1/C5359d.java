package p119q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p386w7.C12914d;

/* renamed from: q1.d */
/* compiled from: LogSourceMetrics */
public final class C5359d {

    /* renamed from: c */
    private static final C5359d f27442c = new C5360a().mo19417a();

    /* renamed from: a */
    private final String f27443a;

    /* renamed from: b */
    private final List<C5356c> f27444b;

    /* renamed from: q1.d$a */
    /* compiled from: LogSourceMetrics */
    public static final class C5360a {

        /* renamed from: a */
        private String f27445a = "";

        /* renamed from: b */
        private List<C5356c> f27446b = new ArrayList();

        C5360a() {
        }

        /* renamed from: a */
        public C5359d mo19417a() {
            return new C5359d(this.f27445a, Collections.unmodifiableList(this.f27446b));
        }

        /* renamed from: b */
        public C5360a mo19418b(List<C5356c> list) {
            this.f27446b = list;
            return this;
        }

        /* renamed from: c */
        public C5360a mo19419c(String str) {
            this.f27445a = str;
            return this;
        }
    }

    C5359d(String str, List<C5356c> list) {
        this.f27443a = str;
        this.f27444b = list;
    }

    /* renamed from: c */
    public static C5360a m32810c() {
        return new C5360a();
    }

    @C12914d(tag = 2)
    /* renamed from: a */
    public List<C5356c> mo19415a() {
        return this.f27444b;
    }

    @C12914d(tag = 1)
    /* renamed from: b */
    public String mo19416b() {
        return this.f27443a;
    }
}
