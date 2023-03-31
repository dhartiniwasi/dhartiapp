package p025c8;

import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import p247h8.C10442g;
import p247h8.C10468v;

/* renamed from: c8.o0 */
/* compiled from: LruGarbageCollector */
public class C6812o0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final long f31397c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final long f31398d;

    /* renamed from: a */
    private final C6804k0 f31399a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6814b f31400b;

    /* renamed from: c8.o0$a */
    /* compiled from: LruGarbageCollector */
    public class C6813a implements C6785d4 {

        /* renamed from: a */
        private final C10442g f31401a;

        /* renamed from: b */
        private final C6795i0 f31402b;

        /* renamed from: c */
        private boolean f31403c = false;

        /* renamed from: d */
        private C10442g.C10444b f31404d;

        public C6813a(C10442g gVar, C6795i0 i0Var) {
            this.f31401a = gVar;
            this.f31402b = i0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m39091b() {
            this.f31402b.mo22844y(C6812o0.this);
            this.f31403c = true;
            m39092c();
        }

        /* renamed from: c */
        private void m39092c() {
            this.f31404d = this.f31401a.mo33520k(C10442g.C10448d.GARBAGE_COLLECTION, this.f31403c ? C6812o0.f31398d : C6812o0.f31397c, new C1922n0(this));
        }

        public void start() {
            if (C6812o0.this.f31400b.f31406a != -1) {
                m39092c();
            }
        }

        public void stop() {
            C10442g.C10444b bVar = this.f31404d;
            if (bVar != null) {
                bVar.mo33528c();
            }
        }
    }

    /* renamed from: c8.o0$b */
    /* compiled from: LruGarbageCollector */
    public static class C6814b {

        /* renamed from: a */
        final long f31406a;

        /* renamed from: b */
        final int f31407b;

        /* renamed from: c */
        final int f31408c;

        C6814b(long j, int i, int i2) {
            this.f31406a = j;
            this.f31407b = i;
            this.f31408c = i2;
        }

        /* renamed from: a */
        public static C6814b m39093a(long j) {
            return new C6814b(j, 10, AdError.NETWORK_ERROR_CODE);
        }
    }

    /* renamed from: c8.o0$c */
    /* compiled from: LruGarbageCollector */
    public static class C6815c {

        /* renamed from: a */
        private final boolean f31409a;

        /* renamed from: b */
        private final int f31410b;

        /* renamed from: c */
        private final int f31411c;

        /* renamed from: d */
        private final int f31412d;

        C6815c(boolean z, int i, int i2, int i3) {
            this.f31409a = z;
            this.f31410b = i;
            this.f31411c = i2;
            this.f31412d = i3;
        }

        /* renamed from: a */
        static C6815c m39094a() {
            return new C6815c(false, 0, 0, 0);
        }
    }

    /* renamed from: c8.o0$d */
    /* compiled from: LruGarbageCollector */
    private static class C6816d {

        /* renamed from: c */
        private static final Comparator<Long> f31413c = C1930p0.f5590a;

        /* renamed from: a */
        private final PriorityQueue<Long> f31414a;

        /* renamed from: b */
        private final int f31415b;

        C6816d(int i) {
            this.f31415b = i;
            this.f31414a = new PriorityQueue<>(i, f31413c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22880b(Long l) {
            if (this.f31414a.size() < this.f31415b) {
                this.f31414a.add(l);
            } else if (l.longValue() < this.f31414a.peek().longValue()) {
                this.f31414a.poll();
                this.f31414a.add(l);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo22881c() {
            return this.f31414a.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f31397c = timeUnit.toMillis(1);
        f31398d = timeUnit.toMillis(5);
    }

    C6812o0(C6804k0 k0Var, C6814b bVar) {
        this.f31399a = k0Var;
        this.f31400b = bVar;
    }

    /* renamed from: m */
    private C6815c m39082m(SparseArray<?> sparseArray) {
        long currentTimeMillis = System.currentTimeMillis();
        int e = mo22873e(this.f31400b.f31407b);
        if (e > this.f31400b.f31408c) {
            C10468v.m52767a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f31400b.f31408c + " from " + e, new Object[0]);
            e = this.f31400b.f31408c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long h = mo22876h(e);
        long currentTimeMillis3 = System.currentTimeMillis();
        int l = mo22879l(h, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int k = mo22878k(h);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (C10468v.m52769c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n" + "\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", new Object[]{Integer.valueOf(e), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)}));
            C10468v.m52767a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", new Object[]{Integer.valueOf(l), Long.valueOf(currentTimeMillis4 - currentTimeMillis3)})) + String.format(locale, "\tRemoved %d documents in %dms\n", new Object[]{Integer.valueOf(k), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)})) + String.format(locale, "Total Duration: %dms", new Object[]{Long.valueOf(currentTimeMillis5 - currentTimeMillis)}), new Object[0]);
        }
        return new C6815c(true, e, l, k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo22873e(int i) {
        return (int) ((((float) i) / 100.0f) * ((float) this.f31399a.mo22789g()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6815c mo22874f(SparseArray<?> sparseArray) {
        if (this.f31400b.f31406a == -1) {
            C10468v.m52767a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return C6815c.m39094a();
        }
        long g = mo22875g();
        if (g >= this.f31400b.f31406a) {
            return m39082m(sparseArray);
        }
        C10468v.m52767a("LruGarbageCollector", "Garbage collection skipped; Cache size " + g + " is lower than threshold " + this.f31400b.f31406a, new Object[0]);
        return C6815c.m39094a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo22875g() {
        return this.f31399a.mo22793k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public long mo22876h(int i) {
        if (i == 0) {
            return -1;
        }
        C6816d dVar = new C6816d(i);
        this.f31399a.mo22797o(new C1915l0(dVar));
        this.f31399a.mo22790h(new C1918m0(dVar));
        return dVar.mo22881c();
    }

    /* renamed from: j */
    public C6813a mo22877j(C10442g gVar, C6795i0 i0Var) {
        return new C6813a(gVar, i0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo22878k(long j) {
        return this.f31399a.mo22791i(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo22879l(long j, SparseArray<?> sparseArray) {
        return this.f31399a.mo22783a(j, sparseArray);
    }
}
