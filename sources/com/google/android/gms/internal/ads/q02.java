package com.google.android.gms.internal.ads;

import android.os.Binder;
import p033d5.C4087c;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class q02 implements C4087c.C4088a, C4087c.C4089b {

    /* renamed from: a */
    protected final in0 f16110a = new in0();

    /* renamed from: b */
    protected final Object f16111b = new Object();

    /* renamed from: c */
    protected boolean f16112c = false;

    /* renamed from: d */
    protected boolean f16113d = false;

    /* renamed from: e */
    protected yg0 f16114e;

    /* renamed from: f */
    protected ig0 f16115f;

    /* renamed from: B0 */
    public void mo8940B0(C6362b bVar) {
        pm0.m18662b("Disconnected from remote ad request service.");
        this.f16110a.mo11173e(new g12(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13439a() {
        synchronized (this.f16111b) {
            this.f16113d = true;
            if (this.f16115f.mo17338a() || this.f16115f.mo17344f()) {
                this.f16115f.mo17343e();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        pm0.m18662b("Cannot connect to remote service, fallback to local instance.");
    }
}
