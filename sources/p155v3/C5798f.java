package p155v3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p161w3.C5917a;

/* renamed from: v3.f */
/* compiled from: BandwidthMeter */
public interface C5798f {

    /* renamed from: v3.f$a */
    /* compiled from: BandwidthMeter */
    public interface C5799a {

        /* renamed from: v3.f$a$a */
        /* compiled from: BandwidthMeter */
        public static final class C5800a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C5801a> f28797a = new CopyOnWriteArrayList<>();

            /* renamed from: v3.f$a$a$a */
            /* compiled from: BandwidthMeter */
            private static final class C5801a {
                /* access modifiers changed from: private */

                /* renamed from: a */
                public final Handler f28798a;
                /* access modifiers changed from: private */

                /* renamed from: b */
                public final C5799a f28799b;
                /* access modifiers changed from: private */

                /* renamed from: c */
                public boolean f28800c;

                public C5801a(Handler handler, C5799a aVar) {
                    this.f28798a = handler;
                    this.f28799b = aVar;
                }

                /* renamed from: d */
                public void mo20324d() {
                    this.f28800c = true;
                }
            }

            /* renamed from: b */
            public void mo20321b(Handler handler, C5799a aVar) {
                C5917a.m34872e(handler);
                C5917a.m34872e(aVar);
                mo20323e(aVar);
                this.f28797a.add(new C5801a(handler, aVar));
            }

            /* renamed from: c */
            public void mo20322c(int i, long j, long j2) {
                Iterator<C5801a> it = this.f28797a.iterator();
                while (it.hasNext()) {
                    C5801a next = it.next();
                    if (!next.f28800c) {
                        next.f28798a.post(new C12801e(next, i, j, j2));
                    }
                }
            }

            /* renamed from: e */
            public void mo20323e(C5799a aVar) {
                Iterator<C5801a> it = this.f28797a.iterator();
                while (it.hasNext()) {
                    C5801a next = it.next();
                    if (next.f28799b == aVar) {
                        next.mo20324d();
                        this.f28797a.remove(next);
                    }
                }
            }
        }

        /* renamed from: M */
        void mo152M(int i, long j, long j2);
    }

    /* renamed from: b */
    long mo20316b();

    /* renamed from: c */
    void mo20317c(Handler handler, C5799a aVar);

    /* renamed from: e */
    void mo20318e(C5799a aVar);

    /* renamed from: f */
    C5840p0 mo20319f();

    /* renamed from: g */
    long mo20320g();
}
