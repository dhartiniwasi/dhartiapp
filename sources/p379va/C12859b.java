package p379va;

import java.util.List;
import p359ta.C12561b0;

/* renamed from: va.b */
/* compiled from: BaseReadOperation */
public abstract class C12859b implements C12864e {
    /* renamed from: i */
    private Boolean m60825i(String str) {
        Object a = mo37876a(str);
        if (a instanceof Boolean) {
            return (Boolean) a;
        }
        return null;
    }

    /* renamed from: k */
    private String m60826k() {
        return (String) mo37876a("sql");
    }

    /* renamed from: l */
    private List<Object> m60827l() {
        return (List) mo37876a("arguments");
    }

    /* renamed from: b */
    public C12561b0 mo37869b() {
        return new C12561b0(m60826k(), m60827l());
    }

    /* renamed from: c */
    public boolean mo37870c() {
        return Boolean.TRUE.equals(mo37876a("noResult"));
    }

    /* renamed from: d */
    public Integer mo37871d() {
        return (Integer) mo37876a("transactionId");
    }

    /* renamed from: e */
    public boolean mo37872e() {
        return mo37878g("transactionId") && mo37871d() == null;
    }

    /* renamed from: h */
    public Boolean mo37873h() {
        return m60825i("inTransaction");
    }

    /* renamed from: j */
    public boolean mo37874j() {
        return Boolean.TRUE.equals(mo37876a("continueOnError"));
    }

    public String toString() {
        return "" + mo37877f() + " " + m60826k() + " " + m60827l();
    }
}
