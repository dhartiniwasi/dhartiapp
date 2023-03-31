package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u90 extends pn0 {

    /* renamed from: c */
    private final Object f18457c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final z90 f18458d;

    /* renamed from: e */
    private boolean f18459e;

    public u90(z90 z90) {
        this.f18458d = z90;
    }

    /* renamed from: g */
    public final void mo14466g() {
        synchronized (this.f18457c) {
            if (!this.f18459e) {
                this.f18459e = true;
                mo13311e(new r90(this), new ln0());
                mo13311e(new s90(this), new t90(this));
            }
        }
    }
}
