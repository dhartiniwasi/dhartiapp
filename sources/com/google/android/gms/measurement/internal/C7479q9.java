package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6914cd;
import com.google.android.gms.internal.measurement.C6974g5;
import com.google.android.gms.internal.measurement.C6991h5;
import com.google.android.gms.internal.measurement.C7007i5;
import com.google.android.gms.internal.measurement.C7023j5;
import com.google.android.gms.internal.measurement.C7070m4;
import com.google.android.gms.internal.measurement.C7086n4;
import com.google.android.gms.internal.measurement.C7102o4;
import com.google.android.gms.internal.measurement.C7118p4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p124r.C5413a;
import p402y5.C13025d0;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7479q9 {

    /* renamed from: a */
    private String f32903a;

    /* renamed from: b */
    private boolean f32904b;

    /* renamed from: c */
    private C6991h5 f32905c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f32906d;

    /* renamed from: e */
    private BitSet f32907e;

    /* renamed from: f */
    private Map f32908f;

    /* renamed from: g */
    private Map f32909g;

    /* renamed from: h */
    final /* synthetic */ C7304b f32910h;

    /* synthetic */ C7479q9(C7304b bVar, String str, C13025d0 d0Var) {
        this.f32910h = bVar;
        this.f32903a = str;
        this.f32904b = true;
        this.f32906d = new BitSet();
        this.f32907e = new BitSet();
        this.f32908f = new C5413a();
        this.f32909g = new C5413a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C7086n4 mo24626a(int i) {
        ArrayList arrayList;
        List list;
        C7070m4 D = C7086n4.m40430D();
        D.mo23655p(i);
        D.mo23657s(this.f32904b);
        C6991h5 h5Var = this.f32905c;
        if (h5Var != null) {
            D.mo23658u(h5Var);
        }
        C6974g5 H = C6991h5.m40121H();
        H.mo23431r(C7325c9.m41388H(this.f32906d));
        H.mo23433u(C7325c9.m41388H(this.f32907e));
        Map map = this.f32908f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f32908f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f32908f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C7102o4 E = C7118p4.m40548E();
                    E.mo23722r(intValue2);
                    E.mo23721p(l.longValue());
                    arrayList2.add((C7118p4) E.mo23357k());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            H.mo23430p(arrayList);
        }
        Map map2 = this.f32909g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f32909g.keySet()) {
                C7007i5 F = C7023j5.m40251F();
                F.mo23521r(num.intValue());
                List list2 = (List) this.f32909g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    F.mo23520p(list2);
                }
                arrayList3.add((C7023j5) F.mo23357k());
            }
            list = arrayList3;
        }
        H.mo23432s(list);
        D.mo23656r(H);
        return (C7086n4) D.mo23357k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24627c(C7512t9 t9Var) {
        int a = t9Var.mo24656a();
        Boolean bool = t9Var.f33006c;
        if (bool != null) {
            this.f32907e.set(a, bool.booleanValue());
        }
        Boolean bool2 = t9Var.f33007d;
        if (bool2 != null) {
            this.f32906d.set(a, bool2.booleanValue());
        }
        if (t9Var.f33008e != null) {
            Map map = this.f32908f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = t9Var.f33008e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f32908f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (t9Var.f33009f != null) {
            Map map2 = this.f32909g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f32909g.put(valueOf2, list);
            }
            if (t9Var.mo24658c()) {
                list.clear();
            }
            C6914cd.m39885b();
            C7370h z = this.f32910h.f32389a.mo24443z();
            String str = this.f32903a;
            C7505t2 t2Var = C7516u2.f33036Y;
            if (z.mo24279B(str, t2Var) && t9Var.mo24657b()) {
                list.clear();
            }
            C6914cd.m39885b();
            if (this.f32910h.f32389a.mo24443z().mo24279B(this.f32903a, t2Var)) {
                Long valueOf3 = Long.valueOf(t9Var.f33009f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(t9Var.f33009f.longValue() / 1000));
        }
    }

    /* synthetic */ C7479q9(C7304b bVar, String str, C6991h5 h5Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C13025d0 d0Var) {
        this.f32910h = bVar;
        this.f32903a = str;
        this.f32906d = bitSet;
        this.f32907e = bitSet2;
        this.f32908f = map;
        this.f32909g = new C5413a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f32909g.put(num, arrayList);
        }
        this.f32904b = false;
        this.f32905c = h5Var;
    }
}
