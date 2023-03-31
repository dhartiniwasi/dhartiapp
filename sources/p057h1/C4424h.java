package p057h1;

import androidx.work.WorkerParameters;
import p176z0.C6191i;

/* renamed from: h1.h */
/* compiled from: StartWorkRunnable */
public class C4424h implements Runnable {

    /* renamed from: a */
    private C6191i f24600a;

    /* renamed from: b */
    private String f24601b;

    /* renamed from: c */
    private WorkerParameters.C1531a f24602c;

    public C4424h(C6191i iVar, String str, WorkerParameters.C1531a aVar) {
        this.f24600a = iVar;
        this.f24601b = str;
        this.f24602c = aVar;
    }

    public void run() {
        this.f24600a.mo21128o().mo21109k(this.f24601b, this.f24602c);
    }
}
