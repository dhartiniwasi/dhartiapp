package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fl1 implements b44 {

    /* renamed from: a */
    private final o44 f9316a;

    /* renamed from: b */
    private final o44 f9317b;

    public fl1(o44 o44, o44 o442) {
        this.f9316a = o44;
        this.f9317b = o442;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        vm0 a = ((jv0) this.f9316a).mo11523a();
        C4409t.m29326r();
        return new C2746pr(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
