package p259ia;

import com.onesignal.C8507n2;

/* renamed from: ia.a */
/* compiled from: LanguageContext */
public class C10568a {

    /* renamed from: b */
    private static C10568a f41609b;

    /* renamed from: a */
    private C10569b f41610a;

    public C10568a(C8507n2 n2Var) {
        f41609b = this;
        if (n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_LANGUAGE", (String) null) != null) {
            this.f41610a = new C10570c(n2Var);
        } else {
            this.f41610a = new C10571d();
        }
    }

    /* renamed from: a */
    public static C10568a m53118a() {
        return f41609b;
    }

    /* renamed from: b */
    public String mo33766b() {
        return this.f41610a.mo33768a();
    }

    /* renamed from: c */
    public void mo33767c(C10569b bVar) {
        this.f41610a = bVar;
    }
}
