package p176z0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p057h1.C4417b;
import p170y0.C6087d;
import p170y0.C6094j;
import p170y0.C6099m;
import p170y0.C6109r;
import p170y0.C6112u;

/* renamed from: z0.g */
/* compiled from: WorkContinuationImpl */
public class C6189g extends C6109r {

    /* renamed from: j */
    private static final String f29692j = C6094j.m35719f("WorkContinuationImpl");

    /* renamed from: a */
    private final C6191i f29693a;

    /* renamed from: b */
    private final String f29694b;

    /* renamed from: c */
    private final C6087d f29695c;

    /* renamed from: d */
    private final List<? extends C6112u> f29696d;

    /* renamed from: e */
    private final List<String> f29697e;

    /* renamed from: f */
    private final List<String> f29698f;

    /* renamed from: g */
    private final List<C6189g> f29699g;

    /* renamed from: h */
    private boolean f29700h;

    /* renamed from: i */
    private C6099m f29701i;

    public C6189g(C6191i iVar, List<? extends C6112u> list) {
        this(iVar, (String) null, C6087d.KEEP, list, (List<C6189g>) null);
    }

    /* renamed from: i */
    private static boolean m36003i(C6189g gVar, Set<String> set) {
        set.addAll(gVar.mo21116c());
        Set<String> l = m36004l(gVar);
        for (String contains : set) {
            if (l.contains(contains)) {
                return true;
            }
        }
        List<C6189g> e = gVar.mo21118e();
        if (e != null && !e.isEmpty()) {
            for (C6189g i : e) {
                if (m36003i(i, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.mo21116c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m36004l(C6189g gVar) {
        HashSet hashSet = new HashSet();
        List<C6189g> e = gVar.mo21118e();
        if (e != null && !e.isEmpty()) {
            for (C6189g c : e) {
                hashSet.addAll(c.mo21116c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public C6099m mo21114a() {
        if (!this.f29700h) {
            C4417b bVar = new C4417b(this);
            this.f29693a.mo21131r().mo18322b(bVar);
            this.f29701i = bVar.mo17944d();
        } else {
            C6094j.m35717c().mo20925h(f29692j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f29697e)}), new Throwable[0]);
        }
        return this.f29701i;
    }

    /* renamed from: b */
    public C6087d mo21115b() {
        return this.f29695c;
    }

    /* renamed from: c */
    public List<String> mo21116c() {
        return this.f29697e;
    }

    /* renamed from: d */
    public String mo21117d() {
        return this.f29694b;
    }

    /* renamed from: e */
    public List<C6189g> mo21118e() {
        return this.f29699g;
    }

    /* renamed from: f */
    public List<? extends C6112u> mo21119f() {
        return this.f29696d;
    }

    /* renamed from: g */
    public C6191i mo21120g() {
        return this.f29693a;
    }

    /* renamed from: h */
    public boolean mo21121h() {
        return m36003i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean mo21122j() {
        return this.f29700h;
    }

    /* renamed from: k */
    public void mo21123k() {
        this.f29700h = true;
    }

    public C6189g(C6191i iVar, String str, C6087d dVar, List<? extends C6112u> list) {
        this(iVar, str, dVar, list, (List<C6189g>) null);
    }

    public C6189g(C6191i iVar, String str, C6087d dVar, List<? extends C6112u> list, List<C6189g> list2) {
        this.f29693a = iVar;
        this.f29694b = str;
        this.f29695c = dVar;
        this.f29696d = list;
        this.f29699g = list2;
        this.f29697e = new ArrayList(list.size());
        this.f29698f = new ArrayList();
        if (list2 != null) {
            for (C6189g gVar : list2) {
                this.f29698f.addAll(gVar.f29698f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String b = ((C6112u) list.get(i)).mo20944b();
            this.f29697e.add(b);
            this.f29698f.add(b);
        }
    }
}
