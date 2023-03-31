package com.startapp;

import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;

/* renamed from: com.startapp.mb */
/* compiled from: Sta */
public class C9137mb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TriggeredLinksMetadata f37302a;

    /* renamed from: b */
    public final /* synthetic */ String f37303b;

    /* renamed from: c */
    public final /* synthetic */ String f37304c;

    /* renamed from: d */
    public final /* synthetic */ int f37305d;

    /* renamed from: e */
    public final /* synthetic */ C9090kb f37306e;

    public C9137mb(C9090kb kbVar, TriggeredLinksMetadata triggeredLinksMetadata, String str, String str2, int i) {
        this.f37306e = kbVar;
        this.f37302a = triggeredLinksMetadata;
        this.f37303b = str;
        this.f37304c = str2;
        this.f37305d = i;
    }

    public void run() {
        try {
            this.f37306e.mo29614a(this.f37302a, "Periodic", this.f37303b, this.f37304c);
        } catch (Throwable th) {
            if (this.f37306e.mo29618a(1)) {
                C9023i4.m48681a(th);
            }
        } finally {
            this.f37306e.mo29616a(this.f37303b, this.f37305d);
            this.f37306e.mo29613a(0);
        }
    }
}
