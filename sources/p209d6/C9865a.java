package p209d6;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p033d5.C4141r;
import p067i5.C4691e;
import p067i5.C4694h;
import p067i5.C4703q;
import p067i5.C4705s;
import p374v5.C12808b;
import p374v5.C12809c;
import p374v5.C12814h;
import p374v5.C12815i;

/* renamed from: d6.a */
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class C9865a {

    /* renamed from: r */
    private static final long f39656r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f39657s = null;

    /* renamed from: t */
    private static final Object f39658t = new Object();

    /* renamed from: u */
    private static volatile C9869e f39659u = new C9867c();

    /* renamed from: a */
    private final Object f39660a = new Object();

    /* renamed from: b */
    private final PowerManager.WakeLock f39661b;

    /* renamed from: c */
    private int f39662c = 0;

    /* renamed from: d */
    private Future<?> f39663d;

    /* renamed from: e */
    private long f39664e;

    /* renamed from: f */
    private final Set<C9870f> f39665f = new HashSet();

    /* renamed from: g */
    private boolean f39666g = true;

    /* renamed from: h */
    private int f39667h;

    /* renamed from: i */
    C12808b f39668i;

    /* renamed from: j */
    private C4691e f39669j = C4694h.m30388d();

    /* renamed from: k */
    private WorkSource f39670k;

    /* renamed from: l */
    private final String f39671l;

    /* renamed from: m */
    private final String f39672m;

    /* renamed from: n */
    private final Context f39673n;

    /* renamed from: o */
    private final Map<String, C9868d> f39674o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f39675p = new AtomicInteger(0);

    /* renamed from: q */
    private final ScheduledExecutorService f39676q;

    public C9865a(Context context, int i, String str) {
        String str2;
        String packageName = context.getPackageName();
        C4141r.m28222l(context, "WakeLock: context must not be null");
        C4141r.m28218h(str, "WakeLock: wakeLockName must not be empty");
        this.f39673n = context.getApplicationContext();
        this.f39672m = str;
        this.f39668i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f39671l = str2;
        } else {
            this.f39671l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f39661b = newWakeLock;
            if (C4705s.m30431c(context)) {
                WorkSource b = C4705s.m30430b(context, C4703q.m30426b(packageName) ? context.getPackageName() : packageName);
                this.f39670k = b;
                if (b != null) {
                    m50634i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f39657s;
            if (scheduledExecutorService == null) {
                synchronized (f39658t) {
                    scheduledExecutorService = f39657s;
                    if (scheduledExecutorService == null) {
                        C12814h.m60554a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f39657s = scheduledExecutorService;
                    }
                }
            }
            this.f39676q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new C12815i(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m50630e(C9865a aVar) {
        synchronized (aVar.f39660a) {
            if (aVar.mo32319b()) {
                Log.e("WakeLock", String.valueOf(aVar.f39671l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.m50632g();
                if (aVar.mo32319b()) {
                    aVar.f39662c = 1;
                    aVar.m50633h(0);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m50631f(String str) {
        if (this.f39666g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    /* renamed from: g */
    private final void m50632g() {
        if (!this.f39665f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f39665f);
            this.f39665f.clear();
            if (arrayList.size() > 0) {
                C9870f fVar = (C9870f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    private final void m50633h(int i) {
        synchronized (this.f39660a) {
            if (mo32319b()) {
                if (this.f39666g) {
                    int i2 = this.f39662c - 1;
                    this.f39662c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f39662c = 0;
                }
                m50632g();
                for (C9868d dVar : this.f39674o.values()) {
                    dVar.f39678a = 0;
                }
                this.f39674o.clear();
                Future<?> future = this.f39663d;
                if (future != null) {
                    future.cancel(false);
                    this.f39663d = null;
                    this.f39664e = 0;
                }
                this.f39667h = 0;
                if (this.f39661b.isHeld()) {
                    try {
                        this.f39661b.release();
                        if (this.f39668i != null) {
                            this.f39668i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f39671l).concat(" failed to release!"), e);
                            if (this.f39668i != null) {
                                this.f39668i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f39668i != null) {
                            this.f39668i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f39671l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m50634i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void mo32318a(long j) {
        this.f39675p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f39656r), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f39660a) {
            if (!mo32319b()) {
                this.f39668i = C12808b.m60553a(false, (C12809c) null);
                this.f39661b.acquire();
                this.f39669j.mo18371b();
            }
            this.f39662c++;
            this.f39667h++;
            m50631f((String) null);
            C9868d dVar = this.f39674o.get((Object) null);
            if (dVar == null) {
                dVar = new C9868d((C9867c) null);
                this.f39674o.put((Object) null, dVar);
            }
            dVar.f39678a++;
            long b = this.f39669j.mo18371b();
            if (Long.MAX_VALUE - b > max) {
                j2 = b + max;
            }
            if (j2 > this.f39664e) {
                this.f39664e = j2;
                Future<?> future = this.f39663d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f39663d = this.f39676q.schedule(new C9866b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean mo32319b() {
        boolean z;
        synchronized (this.f39660a) {
            z = this.f39662c > 0;
        }
        return z;
    }

    /* renamed from: c */
    public void mo32320c() {
        if (this.f39675p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f39671l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f39660a) {
            m50631f((String) null);
            if (this.f39674o.containsKey((Object) null)) {
                C9868d dVar = this.f39674o.get((Object) null);
                if (dVar != null) {
                    int i = dVar.f39678a - 1;
                    dVar.f39678a = i;
                    if (i == 0) {
                        this.f39674o.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f39671l).concat(" counter does not exist"));
            }
            m50633h(0);
        }
    }

    /* renamed from: d */
    public void mo32321d(boolean z) {
        synchronized (this.f39660a) {
            this.f39666g = z;
        }
    }
}
