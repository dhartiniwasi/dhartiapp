package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b21 implements b44 {

    /* renamed from: a */
    private final o44 f7075a;

    /* renamed from: b */
    private final o44 f7076b;

    /* renamed from: c */
    private final o44 f7077c;

    /* renamed from: d */
    private final o44 f7078d;

    public b21(o44 o44, o44 o442, o44 o443, o44 o444) {
        this.f7075a = o44;
        this.f7076b = o442;
        this.f7077c = o443;
        this.f7078d = o444;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        ((l61) this.f7075a).mo11902a();
        String str = (String) this.f7078d.mo8155d();
        boolean equals = "native".equals(str);
        C4409t.m29326r();
        return new C2746pr(UUID.randomUUID().toString(), ((jv0) this.f7076b).mo11523a(), str, (JSONObject) this.f7077c.mo8155d(), false, equals);
    }
}
