package p218e6;

import p033d5.C4141r;

/* renamed from: e6.y */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9993y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39947a;

    /* renamed from: b */
    final /* synthetic */ C9994z f39948b;

    C9993y(C9994z zVar, C9975i iVar) {
        this.f39948b = zVar;
        this.f39947a = iVar;
    }

    public final void run() {
        synchronized (this.f39948b.f39950b) {
            C9994z zVar = this.f39948b;
            if (zVar.f39951c != null) {
                zVar.f39951c.mo272d((Exception) C4141r.m28221k(this.f39947a.mo26357l()));
            }
        }
    }
}
