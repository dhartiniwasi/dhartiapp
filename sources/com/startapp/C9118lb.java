package com.startapp;

import com.startapp.sdk.jobs.C9529b;

/* renamed from: com.startapp.lb */
/* compiled from: Sta */
public class C9118lb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9529b.C9530a f37279a;

    /* renamed from: b */
    public final /* synthetic */ C9529b f37280b;

    /* renamed from: c */
    public final /* synthetic */ C9090kb f37281c;

    public C9118lb(C9090kb kbVar, C9529b.C9530a aVar, C9529b bVar) {
        this.f37281c = kbVar;
        this.f37279a = aVar;
        this.f37280b = bVar;
    }

    public void run() {
        try {
            this.f37281c.f37202j.run();
        } finally {
            this.f37279a.mo31223a(this.f37280b, false);
        }
    }
}
