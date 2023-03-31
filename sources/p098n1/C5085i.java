package p098n1;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p098n1.C5070b;

@AutoValue
/* renamed from: n1.i */
/* compiled from: EventInternal */
public abstract class C5085i {

    @AutoValue.Builder
    /* renamed from: n1.i$a */
    /* compiled from: EventInternal */
    public static abstract class C5086a {
        /* renamed from: a */
        public final C5086a mo19048a(String str, int i) {
            mo19003e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C5086a mo19049b(String str, long j) {
            mo19003e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C5086a mo19050c(String str, String str2) {
            mo19003e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C5085i mo19002d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo19003e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C5086a mo19004f(Map<String, String> map);

        /* renamed from: g */
        public abstract C5086a mo19005g(Integer num);

        /* renamed from: h */
        public abstract C5086a mo19006h(C5084h hVar);

        /* renamed from: i */
        public abstract C5086a mo19007i(long j);

        /* renamed from: j */
        public abstract C5086a mo19008j(String str);

        /* renamed from: k */
        public abstract C5086a mo19009k(long j);
    }

    /* renamed from: a */
    public static C5086a m31846a() {
        return new C5070b.C5072b().mo19004f(new HashMap());
    }

    /* renamed from: b */
    public final String mo19043b(String str) {
        String str2 = mo18993c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo18993c();

    /* renamed from: d */
    public abstract Integer mo18994d();

    /* renamed from: e */
    public abstract C5084h mo18995e();

    /* renamed from: f */
    public abstract long mo18997f();

    /* renamed from: g */
    public final int mo19044g(String str) {
        String str2 = mo18993c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo19045h(String str) {
        String str2 = mo18993c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo19046i() {
        return Collections.unmodifiableMap(mo18993c());
    }

    /* renamed from: j */
    public abstract String mo18999j();

    /* renamed from: k */
    public abstract long mo19000k();

    /* renamed from: l */
    public C5086a mo19047l() {
        return new C5070b.C5072b().mo19008j(mo18999j()).mo19005g(mo18994d()).mo19006h(mo18995e()).mo19007i(mo18997f()).mo19009k(mo19000k()).mo19004f(new HashMap(mo18993c()));
    }
}
