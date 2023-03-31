package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C1556e;
import java.util.ArrayList;
import java.util.List;
import p020c1.C1838c;
import p020c1.C1839d;
import p050g1.C4329p;
import p170y0.C6094j;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: ConstraintsCommandHandler */
class C1554c {

    /* renamed from: e */
    private static final String f4460e = C6094j.m35719f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f4461a;

    /* renamed from: b */
    private final int f4462b;

    /* renamed from: c */
    private final C1556e f4463c;

    /* renamed from: d */
    private final C1839d f4464d;

    C1554c(Context context, int i, C1556e eVar) {
        this.f4461a = context;
        this.f4462b = i;
        this.f4463c = eVar;
        this.f4464d = new C1839d(context, eVar.mo6338f(), (C1838c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6332a() {
        List<C4329p> g = this.f4463c.mo6339g().mo21130q().mo6318B().mo17759g();
        ConstraintProxy.m7192a(this.f4461a, g);
        this.f4464d.mo7026d(g);
        ArrayList<C4329p> arrayList = new ArrayList<>(g.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C4329p next : g) {
            String str = next.f24215a;
            if (currentTimeMillis >= next.mo17743a() && (!next.mo17744b() || this.f4464d.mo7025c(str))) {
                arrayList.add(next);
            }
        }
        for (C4329p pVar : arrayList) {
            String str2 = pVar.f24215a;
            Intent b = C1553b.m7201b(this.f4461a, str2);
            C6094j.m35717c().mo20921a(f4460e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1556e eVar = this.f4463c;
            eVar.mo6342k(new C1556e.C1558b(eVar, b, this.f4462b));
        }
        this.f4464d.mo7027e();
    }
}
