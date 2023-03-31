package p417zb;

import p186ac.C6531a;
import p186ac.C6571t;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.e */
/* compiled from: LifecycleChannel */
public class C13501e {

    /* renamed from: a */
    public final C6531a<String> f47900a;

    public C13501e(C12051a aVar) {
        this.f47900a = new C6531a<>(aVar, "flutter/lifecycle", C6571t.f31017b);
    }

    /* renamed from: a */
    public void mo38629a() {
        C11881b.m57388f("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f47900a.mo22127c("AppLifecycleState.detached");
    }

    /* renamed from: b */
    public void mo38630b() {
        C11881b.m57388f("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f47900a.mo22127c("AppLifecycleState.inactive");
    }

    /* renamed from: c */
    public void mo38631c() {
        C11881b.m57388f("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f47900a.mo22127c("AppLifecycleState.paused");
    }

    /* renamed from: d */
    public void mo38632d() {
        C11881b.m57388f("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f47900a.mo22127c("AppLifecycleState.resumed");
    }
}
