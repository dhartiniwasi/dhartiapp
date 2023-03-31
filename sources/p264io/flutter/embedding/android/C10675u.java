package p264io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.flutter.embedding.android.u */
/* compiled from: MotionEventTracker */
public final class C10675u {

    /* renamed from: c */
    private static C10675u f41862c;

    /* renamed from: a */
    private final LongSparseArray<MotionEvent> f41863a = new LongSparseArray<>();

    /* renamed from: b */
    private final PriorityQueue<Long> f41864b = new PriorityQueue<>();

    /* renamed from: io.flutter.embedding.android.u$a */
    /* compiled from: MotionEventTracker */
    public static class C10676a {

        /* renamed from: b */
        private static final AtomicLong f41865b = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f41866a;

        private C10676a(long j) {
            this.f41866a = j;
        }

        /* renamed from: b */
        public static C10676a m53463b() {
            return m53464c(f41865b.incrementAndGet());
        }

        /* renamed from: c */
        public static C10676a m53464c(long j) {
            return new C10676a(j);
        }

        /* renamed from: d */
        public long mo33996d() {
            return this.f41866a;
        }
    }

    private C10675u() {
    }

    /* renamed from: a */
    public static C10675u m53459a() {
        if (f41862c == null) {
            f41862c = new C10675u();
        }
        return f41862c;
    }

    /* renamed from: b */
    public MotionEvent mo33994b(C10676a aVar) {
        while (!this.f41864b.isEmpty() && this.f41864b.peek().longValue() < aVar.f41866a) {
            this.f41863a.remove(this.f41864b.poll().longValue());
        }
        if (!this.f41864b.isEmpty() && this.f41864b.peek().longValue() == aVar.f41866a) {
            this.f41864b.poll();
        }
        MotionEvent motionEvent = this.f41863a.get(aVar.f41866a);
        this.f41863a.remove(aVar.f41866a);
        return motionEvent;
    }

    /* renamed from: c */
    public C10676a mo33995c(MotionEvent motionEvent) {
        C10676a b = C10676a.m53463b();
        this.f41863a.put(b.f41866a, MotionEvent.obtain(motionEvent));
        this.f41864b.add(Long.valueOf(b.f41866a));
        return b;
    }
}
