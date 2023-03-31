package p161w3;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p161w3.C5954n;

/* renamed from: w3.g0 */
/* compiled from: SystemHandlerWrapper */
final class C5934g0 implements C5954n {

    /* renamed from: b */
    private static final List<C5936b> f29078b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f29079a;

    /* renamed from: w3.g0$b */
    /* compiled from: SystemHandlerWrapper */
    private static final class C5936b implements C5954n.C5955a {

        /* renamed from: a */
        private Message f29080a;

        /* renamed from: b */
        private C5934g0 f29081b;

        private C5936b() {
        }

        /* renamed from: b */
        private void m35005b() {
            this.f29080a = null;
            this.f29081b = null;
            C5934g0.m34993n(this);
        }

        /* renamed from: a */
        public void mo20608a() {
            ((Message) C5917a.m34872e(this.f29080a)).sendToTarget();
            m35005b();
        }

        /* renamed from: c */
        public boolean mo20609c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C5917a.m34872e(this.f29080a));
            m35005b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public C5936b mo20610d(Message message, C5934g0 g0Var) {
            this.f29080a = message;
            this.f29081b = g0Var;
            return this;
        }
    }

    public C5934g0(Handler handler) {
        this.f29079a = handler;
    }

    /* renamed from: m */
    private static C5936b m34992m() {
        C5936b bVar;
        List<C5936b> list = f29078b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new C5936b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m34993n(C5936b bVar) {
        List<C5936b> list = f29078b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public C5954n.C5955a mo20597a(int i, int i2, int i3) {
        return m34992m().mo20610d(this.f29079a.obtainMessage(i, i2, i3), this);
    }

    /* renamed from: b */
    public boolean mo20598b(Runnable runnable) {
        return this.f29079a.post(runnable);
    }

    /* renamed from: c */
    public C5954n.C5955a mo20599c(int i) {
        return m34992m().mo20610d(this.f29079a.obtainMessage(i), this);
    }

    /* renamed from: d */
    public boolean mo20600d(int i) {
        return this.f29079a.hasMessages(i);
    }

    /* renamed from: e */
    public boolean mo20601e(int i) {
        return this.f29079a.sendEmptyMessage(i);
    }

    /* renamed from: f */
    public C5954n.C5955a mo20602f(int i, int i2, int i3, Object obj) {
        return m34992m().mo20610d(this.f29079a.obtainMessage(i, i2, i3, obj), this);
    }

    /* renamed from: g */
    public boolean mo20603g(C5954n.C5955a aVar) {
        return ((C5936b) aVar).mo20609c(this.f29079a);
    }

    /* renamed from: h */
    public boolean mo20604h(int i, long j) {
        return this.f29079a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: i */
    public void mo20605i(int i) {
        this.f29079a.removeMessages(i);
    }

    /* renamed from: j */
    public C5954n.C5955a mo20606j(int i, Object obj) {
        return m34992m().mo20610d(this.f29079a.obtainMessage(i, obj), this);
    }

    /* renamed from: k */
    public void mo20607k(Object obj) {
        this.f29079a.removeCallbacksAndMessages(obj);
    }
}
