package p240ga;

import com.onesignal.C8338d3;
import com.onesignal.C8507n2;
import com.onesignal.C8508n3;
import com.onesignal.C8547p1;
import com.onesignal.C8642w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;
import p231fa.C10164a;
import p249ha.C10487a;

/* renamed from: ga.f */
/* compiled from: OSTrackerFactory.kt */
public final class C10306f {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C10301a> f40909a;

    /* renamed from: b */
    private final C10303c f40910b;

    public C10306f(C8507n2 n2Var, C8547p1 p1Var, C8642w2 w2Var) {
        C11669k.m56787e(n2Var, "preferences");
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(w2Var, "timeProvider");
        ConcurrentHashMap<String, C10301a> concurrentHashMap = new ConcurrentHashMap<>();
        this.f40909a = concurrentHashMap;
        C10303c cVar = new C10303c(n2Var);
        this.f40910b = cVar;
        C10164a aVar = C10164a.f40562c;
        concurrentHashMap.put(aVar.mo32838a(), new C10302b(cVar, p1Var, w2Var));
        concurrentHashMap.put(aVar.mo32839b(), new C10304d(cVar, p1Var, w2Var));
    }

    /* renamed from: a */
    public final void mo33143a(JSONObject jSONObject, List<C10487a> list) {
        C11669k.m56787e(jSONObject, "jsonObject");
        C11669k.m56787e(list, "influences");
        for (C10487a aVar : list) {
            if (C10305e.f40908a[aVar.mo33611c().ordinal()] == 1) {
                mo33149g().mo33100a(jSONObject, aVar);
            }
        }
    }

    /* renamed from: b */
    public final C10301a mo33144b(C8338d3.C8364i0 i0Var) {
        C11669k.m56787e(i0Var, "entryAction");
        if (i0Var.mo27726c()) {
            return mo33149g();
        }
        return null;
    }

    /* renamed from: c */
    public final List<C10301a> mo33145c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo33149g());
        arrayList.add(mo33147e());
        return arrayList;
    }

    /* renamed from: d */
    public final List<C10301a> mo33146d(C8338d3.C8364i0 i0Var) {
        C11669k.m56787e(i0Var, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (i0Var.mo27724a()) {
            return arrayList;
        }
        C10301a g = i0Var.mo27725b() ? mo33149g() : null;
        if (g != null) {
            arrayList.add(g);
        }
        arrayList.add(mo33147e());
        return arrayList;
    }

    /* renamed from: e */
    public final C10301a mo33147e() {
        C10301a aVar = this.f40909a.get(C10164a.f40562c.mo32838a());
        C11669k.m56784b(aVar);
        return aVar;
    }

    /* renamed from: f */
    public final List<C10487a> mo33148f() {
        Collection<C10301a> values = this.f40909a.values();
        C11669k.m56786d(values, "trackers.values");
        ArrayList arrayList = new ArrayList(C10523k.m52973i(values, 10));
        for (C10301a e : values) {
            arrayList.add(e.mo33104e());
        }
        return arrayList;
    }

    /* renamed from: g */
    public final C10301a mo33149g() {
        C10301a aVar = this.f40909a.get(C10164a.f40562c.mo32839b());
        C11669k.m56784b(aVar);
        return aVar;
    }

    /* renamed from: h */
    public final List<C10487a> mo33150h() {
        Collection<C10301a> values = this.f40909a.values();
        C11669k.m56786d(values, "trackers.values");
        ArrayList<C10301a> arrayList = new ArrayList<>();
        for (T next : values) {
            if (!C11669k.m56783a(((C10301a) next).mo33108h(), C10164a.f40562c.mo32838a())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10523k.m52973i(arrayList, 10));
        for (C10301a e : arrayList) {
            arrayList2.add(e.mo33104e());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void mo33151i() {
        Collection<C10301a> values = this.f40909a.values();
        C11669k.m56786d(values, "trackers.values");
        for (C10301a p : values) {
            p.mo33117p();
        }
    }

    /* renamed from: j */
    public final void mo33152j(C8508n3.C8514e eVar) {
        C11669k.m56787e(eVar, "influenceParams");
        this.f40910b.mo33141q(eVar);
    }
}
