package p147u1;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p084l1.C4904d;
import p147u1.C5695d;
import p165x1.C6034a;

@AutoValue
/* renamed from: u1.g */
/* compiled from: SchedulerConfig */
public abstract class C5699g {

    /* renamed from: u1.g$a */
    /* compiled from: SchedulerConfig */
    public static class C5700a {

        /* renamed from: a */
        private C6034a f28464a;

        /* renamed from: b */
        private Map<C4904d, C5701b> f28465b = new HashMap();

        /* renamed from: a */
        public C5700a mo20094a(C4904d dVar, C5701b bVar) {
            this.f28465b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C5699g mo20095b() {
            Objects.requireNonNull(this.f28464a, "missing required property: clock");
            if (this.f28465b.keySet().size() >= C4904d.values().length) {
                Map<C4904d, C5701b> map = this.f28465b;
                this.f28465b = new HashMap();
                return C5699g.m33988d(this.f28464a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C5700a mo20096c(C6034a aVar) {
            this.f28464a = aVar;
            return this;
        }
    }

    @AutoValue
    /* renamed from: u1.g$b */
    /* compiled from: SchedulerConfig */
    public static abstract class C5701b {

        @AutoValue.Builder
        /* renamed from: u1.g$b$a */
        /* compiled from: SchedulerConfig */
        public static abstract class C5702a {
            /* renamed from: a */
            public abstract C5701b mo20087a();

            /* renamed from: b */
            public abstract C5702a mo20088b(long j);

            /* renamed from: c */
            public abstract C5702a mo20089c(Set<C5703c> set);

            /* renamed from: d */
            public abstract C5702a mo20090d(long j);
        }

        /* renamed from: a */
        public static C5702a m33999a() {
            return new C5695d.C5697b().mo20089c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo20081b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C5703c> mo20082c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo20083d();
    }

    /* renamed from: u1.g$c */
    /* compiled from: SchedulerConfig */
    public enum C5703c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m33986a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    /* renamed from: b */
    public static C5700a m33987b() {
        return new C5700a();
    }

    /* renamed from: d */
    static C5699g m33988d(C6034a aVar, Map<C4904d, C5701b> map) {
        return new C5694c(aVar, map);
    }

    /* renamed from: f */
    public static C5699g m33989f(C6034a aVar) {
        return m33987b().mo20094a(C4904d.DEFAULT, C5701b.m33999a().mo20088b(30000).mo20090d(86400000).mo20087a()).mo20094a(C4904d.HIGHEST, C5701b.m33999a().mo20088b(1000).mo20090d(86400000).mo20087a()).mo20094a(C4904d.VERY_LOW, C5701b.m33999a().mo20088b(86400000).mo20090d(86400000).mo20089c(m33990i(C5703c.DEVICE_IDLE)).mo20087a()).mo20096c(aVar).mo20095b();
    }

    /* renamed from: i */
    private static <T> Set<T> m33990i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m33991j(JobInfo.Builder builder, Set<C5703c> set) {
        if (set.contains(C5703c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C5703c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C5703c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder mo20092c(JobInfo.Builder builder, C4904d dVar, long j, int i) {
        builder.setMinimumLatency(mo20093g(dVar, j, i));
        m33991j(builder, mo20078h().get(dVar).mo20082c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C6034a mo20076e();

    /* renamed from: g */
    public long mo20093g(C4904d dVar, long j, int i) {
        long a = j - mo20076e().mo20745a();
        C5701b bVar = mo20078h().get(dVar);
        return Math.min(Math.max(m33986a(i, bVar.mo20081b()), a), bVar.mo20083d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<C4904d, C5701b> mo20078h();
}
