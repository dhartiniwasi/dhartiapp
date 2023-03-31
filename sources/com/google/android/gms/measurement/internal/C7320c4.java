package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6931dd;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7320c4 implements C6931dd {

    /* renamed from: a */
    final /* synthetic */ String f32387a;

    /* renamed from: b */
    final /* synthetic */ C7331d4 f32388b;

    C7320c4(C7331d4 d4Var, String str) {
        this.f32388b = d4Var;
        this.f32387a = str;
    }

    /* renamed from: f */
    public final String mo23340f(String str) {
        Map map = (Map) this.f32388b.f32414d.get(this.f32387a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
