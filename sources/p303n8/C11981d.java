package p303n8;

import com.google.auto.value.AutoValue;
import p303n8.C11975a;
import p303n8.C11979c;

@AutoValue
/* renamed from: n8.d */
/* compiled from: PersistedInstallationEntry */
public abstract class C11981d {

    /* renamed from: a */
    public static C11981d f44918a = m57794a().mo36323a();

    @AutoValue.Builder
    /* renamed from: n8.d$a */
    /* compiled from: PersistedInstallationEntry */
    public static abstract class C11982a {
        /* renamed from: a */
        public abstract C11981d mo36323a();

        /* renamed from: b */
        public abstract C11982a mo36324b(String str);

        /* renamed from: c */
        public abstract C11982a mo36325c(long j);

        /* renamed from: d */
        public abstract C11982a mo36326d(String str);

        /* renamed from: e */
        public abstract C11982a mo36327e(String str);

        /* renamed from: f */
        public abstract C11982a mo36328f(String str);

        /* renamed from: g */
        public abstract C11982a mo36329g(C11979c.C11980a aVar);

        /* renamed from: h */
        public abstract C11982a mo36330h(long j);
    }

    /* renamed from: a */
    public static C11982a m57794a() {
        return new C11975a.C11977b().mo36330h(0).mo36329g(C11979c.C11980a.ATTEMPT_MIGRATION).mo36325c(0);
    }

    /* renamed from: b */
    public abstract String mo36312b();

    /* renamed from: c */
    public abstract long mo36313c();

    /* renamed from: d */
    public abstract String mo36314d();

    /* renamed from: e */
    public abstract String mo36315e();

    /* renamed from: f */
    public abstract String mo36317f();

    /* renamed from: g */
    public abstract C11979c.C11980a mo36318g();

    /* renamed from: h */
    public abstract long mo36319h();

    /* renamed from: i */
    public boolean mo36335i() {
        return mo36318g() == C11979c.C11980a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo36336j() {
        return mo36318g() == C11979c.C11980a.NOT_GENERATED || mo36318g() == C11979c.C11980a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo36337k() {
        return mo36318g() == C11979c.C11980a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo36338l() {
        return mo36318g() == C11979c.C11980a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo36339m() {
        return mo36318g() == C11979c.C11980a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract C11982a mo36321n();

    /* renamed from: o */
    public C11981d mo36340o(String str, long j, long j2) {
        return mo36321n().mo36324b(str).mo36325c(j).mo36330h(j2).mo36323a();
    }

    /* renamed from: p */
    public C11981d mo36341p() {
        return mo36321n().mo36324b((String) null).mo36323a();
    }

    /* renamed from: q */
    public C11981d mo36342q(String str) {
        return mo36321n().mo36327e(str).mo36329g(C11979c.C11980a.REGISTER_ERROR).mo36323a();
    }

    /* renamed from: r */
    public C11981d mo36343r() {
        return mo36321n().mo36329g(C11979c.C11980a.NOT_GENERATED).mo36323a();
    }

    /* renamed from: s */
    public C11981d mo36344s(String str, String str2, long j, String str3, long j2) {
        return mo36321n().mo36326d(str).mo36329g(C11979c.C11980a.REGISTERED).mo36324b(str3).mo36328f(str2).mo36325c(j2).mo36330h(j).mo36323a();
    }

    /* renamed from: t */
    public C11981d mo36345t(String str) {
        return mo36321n().mo36326d(str).mo36329g(C11979c.C11980a.UNREGISTERED).mo36323a();
    }
}
