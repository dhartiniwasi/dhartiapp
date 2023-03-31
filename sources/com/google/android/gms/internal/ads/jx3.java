package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jx3 {

    /* renamed from: d */
    private static final jx3 f11838d = new jx3(true);

    /* renamed from: a */
    final j04 f11839a = new zz3(16);

    /* renamed from: b */
    private boolean f11840b;

    /* renamed from: c */
    private boolean f11841c;

    private jx3() {
    }

    /* renamed from: a */
    public static jx3 m15119a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m15120d(ix3 ix3, Object obj) {
        boolean z;
        e14 d = ix3.mo11251d();
        cy3.m11233e(obj);
        e14 e14 = e14.DOUBLE;
        f14 f14 = f14.INT;
        switch (d.mo9751a().ordinal()) {
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
                if ((obj instanceof jw3) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof ux3)) {
                    return;
                }
            case 8:
                if (obj instanceof cz3) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(ix3.zza()), ix3.mo11251d().mo9751a(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo11535b() {
        if (!this.f11840b) {
            this.f11839a.mo11274b();
            this.f11840b = true;
        }
    }

    /* renamed from: c */
    public final void mo11536c(ix3 ix3, Object obj) {
        if (!ix3.mo11252e()) {
            m15120d(ix3, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m15120d(ix3, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f11839a.put(ix3, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        jx3 jx3 = new jx3();
        for (int i = 0; i < this.f11839a.mo11275c(); i++) {
            Map.Entry h = this.f11839a.mo11283h(i);
            jx3.mo11536c((ix3) h.getKey(), h.getValue());
        }
        for (Map.Entry entry : this.f11839a.mo11278d()) {
            jx3.mo11536c((ix3) entry.getKey(), entry.getValue());
        }
        jx3.f11841c = this.f11841c;
        return jx3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx3)) {
            return false;
        }
        return this.f11839a.equals(((jx3) obj).f11839a);
    }

    public final int hashCode() {
        return this.f11839a.hashCode();
    }

    private jx3(boolean z) {
        mo11535b();
        mo11535b();
    }
}
