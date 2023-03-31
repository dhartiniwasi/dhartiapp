package com.ryanheise.audioservice;

import com.ryanheise.audioservice.C8796a;
import java.util.Map;
import p186ac.C6556k;

/* renamed from: com.ryanheise.audioservice.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8809f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8796a.C8799c f36359a;

    /* renamed from: b */
    public final /* synthetic */ Map f36360b;

    /* renamed from: c */
    public final /* synthetic */ C6556k.C6561d f36361c;

    public /* synthetic */ C8809f(C8796a.C8799c cVar, Map map, C6556k.C6561d dVar) {
        this.f36359a = cVar;
        this.f36360b = map;
        this.f36361c = dVar;
    }

    public final void run() {
        this.f36359a.m48175S(this.f36360b, this.f36361c);
    }
}
