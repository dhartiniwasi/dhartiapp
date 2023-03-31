package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7266y8 {

    /* renamed from: d */
    private static final C7266y8 f32211d = new C7266y8(true);

    /* renamed from: a */
    final C7077mb f32212a = new C6912cb(16);

    /* renamed from: b */
    private boolean f32213b;

    /* renamed from: c */
    private boolean f32214c;

    private C7266y8() {
    }

    /* renamed from: a */
    public static C7266y8 m41136a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m41137d(C7250x8 x8Var, Object obj) {
        boolean z;
        C6998hc d = x8Var.mo23989d();
        C7107o9.m40532e(obj);
        C6998hc hcVar = C6998hc.DOUBLE;
        C7014ic icVar = C7014ic.INT;
        switch (d.mo23513a().ordinal()) {
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
                if ((obj instanceof C6977g8) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C7092na) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(x8Var.zza()), x8Var.mo23989d().mo23513a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo24023b() {
        if (!this.f32213b) {
            for (int i = 0; i < this.f32212a.mo23665c(); i++) {
                Map.Entry h = this.f32212a.mo23673h(i);
                if (h.getValue() instanceof C6995h9) {
                    ((C6995h9) h.getValue()).mo23494s();
                }
            }
            this.f32212a.mo23262b();
            this.f32213b = true;
        }
    }

    /* renamed from: c */
    public final void mo24024c(C7250x8 x8Var, Object obj) {
        if (!x8Var.mo23990e()) {
            m41137d(x8Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m41137d(x8Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f32212a.put(x8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C7266y8 y8Var = new C7266y8();
        for (int i = 0; i < this.f32212a.mo23665c(); i++) {
            Map.Entry h = this.f32212a.mo23673h(i);
            y8Var.mo24024c((C7250x8) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f32212a.mo23668d()) {
            y8Var.mo24024c((C7250x8) entry.getKey(), entry.getValue());
        }
        y8Var.f32214c = this.f32214c;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7266y8)) {
            return false;
        }
        return this.f32212a.equals(((C7266y8) obj).f32212a);
    }

    public final int hashCode() {
        return this.f32212a.hashCode();
    }

    private C7266y8(boolean z) {
        mo24023b();
        mo24023b();
    }
}
