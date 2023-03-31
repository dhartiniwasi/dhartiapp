package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3161b2 {

    /* renamed from: d */
    private static final C3161b2 f21767d = new C3161b2(true);

    /* renamed from: a */
    final C3592o4 f21768a = new C3229d4(16);

    /* renamed from: b */
    private boolean f21769b;

    /* renamed from: c */
    private boolean f21770c;

    private C3161b2() {
    }

    /* renamed from: a */
    public static C3161b2 m25057a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m25058d(C3128a2 a2Var, Object obj) {
        boolean z;
        C3428j5 d = a2Var.mo15696d();
        C3623p2.m26441e(obj);
        C3428j5 j5Var = C3428j5.DOUBLE;
        C3461k5 k5Var = C3461k5.INT;
        switch (d.mo16215a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C3325g1) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C3491l2)) {
                    return;
                }
            case 8:
                if (obj instanceof C3591o3) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(a2Var.zza()), a2Var.mo15696d().mo16215a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo15762b() {
        if (!this.f21769b) {
            for (int i = 0; i < this.f21768a.mo16479c(); i++) {
                Map.Entry h = this.f21768a.mo16487h(i);
                if (h.getValue() instanceof C3425j2) {
                    ((C3425j2) h.getValue()).mo16203g();
                }
            }
            this.f21768a.mo15948b();
            this.f21769b = true;
        }
    }

    /* renamed from: c */
    public final void mo15763c(C3128a2 a2Var, Object obj) {
        if (!a2Var.mo15697e()) {
            m25058d(a2Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m25058d(a2Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f21768a.put(a2Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C3161b2 b2Var = new C3161b2();
        for (int i = 0; i < this.f21768a.mo16479c(); i++) {
            Map.Entry h = this.f21768a.mo16487h(i);
            b2Var.mo15763c((C3128a2) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f21768a.mo16482d()) {
            b2Var.mo15763c((C3128a2) entry.getKey(), entry.getValue());
        }
        b2Var.f21770c = this.f21770c;
        return b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3161b2)) {
            return false;
        }
        return this.f21768a.equals(((C3161b2) obj).f21768a);
    }

    public final int hashCode() {
        return this.f21768a.hashCode();
    }

    private C3161b2(boolean z) {
        mo15762b();
        mo15762b();
    }
}
