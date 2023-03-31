package p170y0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p170y0.C6112u;

/* renamed from: y0.l */
/* compiled from: OneTimeWorkRequest */
public final class C6097l extends C6112u {

    /* renamed from: y0.l$a */
    /* compiled from: OneTimeWorkRequest */
    public static final class C6098a extends C6112u.C6113a<C6098a, C6097l> {
        public C6098a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f29512c.f24218d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C6097l mo20926c() {
            if (!this.f29510a || Build.VERSION.SDK_INT < 23 || !this.f29512c.f24224j.mo20889h()) {
                return new C6097l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C6098a mo20927d() {
            return this;
        }
    }

    C6097l(C6098a aVar) {
        super(aVar.f29511b, aVar.f29512c, aVar.f29513d);
    }

    /* renamed from: e */
    public static C6097l m35730e(Class<? extends ListenableWorker> cls) {
        return (C6097l) new C6098a(cls).mo20948b();
    }
}
