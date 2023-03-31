package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C11692f0;

/* renamed from: kotlinx.coroutines.scheduling.l */
/* compiled from: Tasks.kt */
public final class C11751l {

    /* renamed from: a */
    public static final long f44362a = C11696h0.m56877e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f44363b = C11696h0.m56876d("kotlinx.coroutines.scheduler.core.pool.size", C12756f.m60449a(C11692f0.m56853a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f44364c = C11696h0.m56876d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f44365d = TimeUnit.SECONDS.toNanos(C11696h0.m56877e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C11746g f44366e = C11744e.f44352a;

    /* renamed from: f */
    public static final C11748i f44367f = new C11749j(0);

    /* renamed from: g */
    public static final C11748i f44368g = new C11749j(1);
}
