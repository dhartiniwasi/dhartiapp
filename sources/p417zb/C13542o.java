package p417zb;

import java.util.HashMap;
import p186ac.C6531a;
import p186ac.C6551f;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.o */
/* compiled from: SystemChannel */
public class C13542o {

    /* renamed from: a */
    public final C6531a<Object> f48022a;

    public C13542o(C12051a aVar) {
        this.f48022a = new C6531a<>(aVar, "flutter/system", C6551f.f30997a);
    }

    /* renamed from: a */
    public void mo38655a() {
        C11881b.m57388f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f48022a.mo22127c(hashMap);
    }
}
