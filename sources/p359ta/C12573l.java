package p359ta;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashSet;

/* renamed from: ta.l */
/* compiled from: DatabaseWorker */
final class C12573l {

    /* renamed from: a */
    private final String f46115a;

    /* renamed from: b */
    private final int f46116b;

    /* renamed from: c */
    private HandlerThread f46117c;

    /* renamed from: d */
    private Handler f46118d;

    /* renamed from: e */
    private Runnable f46119e;

    /* renamed from: f */
    private C12569i f46120f;

    /* renamed from: g */
    private HashSet<Integer> f46121g = new HashSet<>();

    /* renamed from: h */
    private int f46122h = 0;

    C12573l(String str, int i) {
        this.f46115a = str;
        this.f46116b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m59851e(C12571j jVar) {
        jVar.f46112b.run();
        synchronized (this) {
            this.f46122h--;
            C12569i iVar = this.f46120f;
            if (iVar != null) {
                if (iVar.mo37400D()) {
                    this.f46121g.add(Integer.valueOf(this.f46120f.f46099c));
                } else {
                    this.f46121g.remove(Integer.valueOf(this.f46120f.f46099c));
                }
            }
            if (mo37419d()) {
                this.f46120f = null;
            }
        }
        if (mo37419d()) {
            this.f46119e.run();
        }
    }

    /* renamed from: f */
    private void m59852f(C12571j jVar) {
        synchronized (this) {
            this.f46120f = jVar.f46111a;
            this.f46122h++;
        }
        this.f46118d.post(new C12572k(this, jVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean mo37417b(C12571j jVar) {
        if (jVar.mo37414a(this.f46121g)) {
            return false;
        }
        if (!mo37419d() && !jVar.mo37415b(this.f46120f)) {
            return false;
        }
        m59852f(jVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo37418c() {
        return this.f46122h != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean mo37419d() {
        return this.f46122h == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo37420g() {
        HandlerThread handlerThread = this.f46117c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f46117c = null;
            this.f46118d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized void mo37421h(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f46115a, this.f46116b);
        this.f46117c = handlerThread;
        handlerThread.start();
        this.f46118d = new Handler(this.f46117c.getLooper());
        this.f46119e = runnable;
    }
}
