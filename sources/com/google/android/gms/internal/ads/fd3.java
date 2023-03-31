package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class fd3<V> extends gg3 implements lf3<V> {

    /* renamed from: d */
    static final boolean f9229d;

    /* renamed from: e */
    private static final Logger f9230e = Logger.getLogger(fd3.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final gd3 f9231f;

    /* renamed from: g */
    private static final Object f9232g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile Object f9233a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile jd3 f9234b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile qd3 f9235c;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        gd3 gd3;
        Class<qd3> cls = qd3.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f9229d = z;
        try {
            gd3 = new pd3((C2360a) null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                gd3 = new kd3(AtomicReferenceFieldUpdater.newUpdater(cls, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(cls, cls, "b"), AtomicReferenceFieldUpdater.newUpdater(fd3.class, cls, "c"), AtomicReferenceFieldUpdater.newUpdater(fd3.class, jd3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(fd3.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                gd3 = new md3((C2360a) null);
            }
        }
        f9231f = gd3;
        if (th != null) {
            Logger logger = f9230e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected fd3() {
    }

    /* renamed from: A */
    private final void m12538A(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static void m12539B(fd3<V> fd3) {
        jd3 jd3 = null;
        while (true) {
            for (qd3 b = f9231f.mo10480b(fd3, qd3.f16347c); b != null; b = b.f16349b) {
                Thread thread = b.f16348a;
                if (thread != null) {
                    b.f16348a = null;
                    LockSupport.unpark(thread);
                }
            }
            fd3.mo8330f();
            jd3 jd32 = jd3;
            jd3 a = f9231f.mo10479a(fd3, jd3.f11326d);
            jd3 jd33 = jd32;
            while (a != null) {
                jd3 jd34 = a.f11329c;
                a.f11329c = jd33;
                jd33 = a;
                a = jd34;
            }
            while (true) {
                if (jd33 != null) {
                    jd3 = jd33.f11329c;
                    Runnable runnable = jd33.f11327a;
                    runnable.getClass();
                    if (runnable instanceof ld3) {
                        ld3 ld3 = (ld3) runnable;
                        fd3 = ld3.f12746a;
                        if (fd3.f9233a == ld3) {
                            if (f9231f.mo10484f(fd3, ld3, m12543i(ld3.f12747b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = jd33.f11328b;
                        executor.getClass();
                        m12540C(runnable, executor);
                    }
                    jd33 = jd3;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    private static void m12540C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f9230e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: b */
    private final void m12541b(qd3 qd3) {
        qd3.f16348a = null;
        while (true) {
            qd3 qd32 = this.f9235c;
            if (qd32 != qd3.f16347c) {
                qd3 qd33 = null;
                while (qd32 != null) {
                    qd3 qd34 = qd32.f16349b;
                    if (qd32.f16348a != null) {
                        qd33 = qd32;
                    } else if (qd33 != null) {
                        qd33.f16349b = qd34;
                        if (qd33.f16348a == null) {
                        }
                    } else if (!f9231f.mo10485g(this, qd32, qd34)) {
                    }
                    qd32 = qd34;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: d */
    private static final Object m12542d(Object obj) throws ExecutionException {
        if (obj instanceof hd3) {
            Throwable th = ((hd3) obj).f10289b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof id3) {
            throw new ExecutionException(((id3) obj).f10749a);
        } else if (obj == f9232g) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Object m12543i(lf3 lf3) {
        Throwable a;
        if (lf3 instanceof nd3) {
            Object obj = ((fd3) lf3).f9233a;
            if (obj instanceof hd3) {
                hd3 hd3 = (hd3) obj;
                if (hd3.f10288a) {
                    Throwable th = hd3.f10289b;
                    obj = th != null ? new hd3(false, th) : hd3.f10287d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((lf3 instanceof gg3) && (a = ((gg3) lf3).mo10129a()) != null) {
            return new id3(a);
        } else {
            boolean isCancelled = lf3.isCancelled();
            if ((!f9229d) && isCancelled) {
                hd3 hd32 = hd3.f10287d;
                hd32.getClass();
                return hd32;
            }
            try {
                Object k = m12544k(lf3);
                if (!isCancelled) {
                    return k == null ? f9232g : k;
                }
                return new hd3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + lf3));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new id3(e.getCause());
                }
                lf3.toString();
                return new hd3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(lf3)), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new hd3(false, e2);
                }
                lf3.toString();
                return new id3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(lf3)), e2));
            } catch (Error | RuntimeException e3) {
                return new id3(e3);
            }
        }
    }

    /* renamed from: k */
    private static Object m12544k(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: y */
    private final void m12554y(StringBuilder sb) {
        try {
            Object k = m12544k(this);
            sb.append("SUCCESS, result=[");
            if (k == null) {
                sb.append("null");
            } else if (k == this) {
                sb.append("this future");
            } else {
                sb.append(k.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(k)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: z */
    private final void m12555z(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f9233a;
        if (obj instanceof ld3) {
            sb.append(", setFuture=[");
            m12538A(sb, ((ld3) obj).f12747b);
            sb.append("]");
        } else {
            try {
                str = r83.m19612a(mo8329e());
            } catch (RuntimeException | StackOverflowError e) {
                Class<?> cls = e.getClass();
                cls.toString();
                str = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m12554y(sb);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Throwable mo10129a() {
        if (!(this instanceof nd3)) {
            return null;
        }
        Object obj = this.f9233a;
        if (obj instanceof id3) {
            return ((id3) obj).f10749a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.lf3<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f9233a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.ld3
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f9229d
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.hd3 r3 = new com.google.android.gms.internal.ads.hd3
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.hd3 r3 = com.google.android.gms.internal.ads.hd3.f10286c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.hd3 r3 = com.google.android.gms.internal.ads.hd3.f10287d
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.gd3 r6 = f9231f
            boolean r6 = r6.mo10484f(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.mo10137u()
        L_0x0038:
            m12539B(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.ld3
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.ld3 r0 = (com.google.android.gms.internal.ads.ld3) r0
            com.google.android.gms.internal.ads.lf3<? extends V> r0 = r0.f12747b
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.nd3
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.fd3 r4 = (com.google.android.gms.internal.ads.fd3) r4
            java.lang.Object r0 = r4.f9233a
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.ld3
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = 1
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.f9233a
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.ld3
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fd3.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo8329e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8330f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo9805g(Object obj) {
        if (obj == null) {
            obj = f9232g;
        }
        if (!f9231f.mo10484f(this, (Object) null, obj)) {
            return false;
        }
        m12539B(this);
        return true;
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9233a;
            if ((obj2 != null) && (!(obj2 instanceof ld3))) {
                return m12542d(obj2);
            }
            qd3 qd3 = this.f9235c;
            if (qd3 != qd3.f16347c) {
                qd3 qd32 = new qd3();
                do {
                    gd3 gd3 = f9231f;
                    gd3.mo10481c(qd32, qd3);
                    if (gd3.mo10485g(this, qd3, qd32)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9233a;
                            } else {
                                m12541b(qd32);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof ld3))));
                        return m12542d(obj);
                    }
                    qd3 = this.f9235c;
                } while (qd3 != qd3.f16347c);
            }
            Object obj3 = this.f9233a;
            obj3.getClass();
            return m12542d(obj3);
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo9806h(Throwable th) {
        Objects.requireNonNull(th);
        if (!f9231f.mo10484f(this, (Object) null, new id3(th))) {
            return false;
        }
        m12539B(this);
        return true;
    }

    public boolean isCancelled() {
        return this.f9233a instanceof hd3;
    }

    public boolean isDone() {
        Object obj = this.f9233a;
        return (!(obj instanceof ld3)) & (obj != null);
    }

    /* renamed from: j */
    public void mo10135j(Runnable runnable, Executor executor) {
        jd3 jd3;
        b83.m10239c(runnable, "Runnable was null.");
        b83.m10239c(executor, "Executor was null.");
        if (isDone() || (jd3 = this.f9234b) == jd3.f11326d) {
            m12540C(runnable, executor);
        }
        jd3 jd32 = new jd3(runnable, executor);
        do {
            jd32.f11329c = jd3;
            if (!f9231f.mo10483e(this, jd3, jd32)) {
                jd3 = this.f9234b;
            } else {
                return;
            }
        } while (jd3 != jd3.f11326d);
        m12540C(runnable, executor);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m12554y(sb);
        } else {
            m12555z(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo10137u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo10138v(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo10140x());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo10139w(lf3 lf3) {
        id3 id3;
        Objects.requireNonNull(lf3);
        Object obj = this.f9233a;
        if (obj == null) {
            if (lf3.isDone()) {
                if (!f9231f.mo10484f(this, (Object) null, m12543i(lf3))) {
                    return false;
                }
                m12539B(this);
                return true;
            }
            ld3 ld3 = new ld3(this, lf3);
            if (f9231f.mo10484f(this, (Object) null, ld3)) {
                try {
                    lf3.mo10135j(ld3, pe3.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        id3 = new id3(e);
                    } catch (Error | RuntimeException unused) {
                        id3 = id3.f10748b;
                    }
                    f9231f.mo10484f(this, ld3, id3);
                }
                return true;
            }
            obj = this.f9233a;
        }
        if (obj instanceof hd3) {
            lf3.cancel(((hd3) obj).f10288a);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo10140x() {
        Object obj = this.f9233a;
        return (obj instanceof hd3) && ((hd3) obj).f10288a;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f9233a;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof ld3))) {
                return m12542d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                qd3 qd3 = this.f9235c;
                if (qd3 != qd3.f16347c) {
                    qd3 qd32 = new qd3();
                    do {
                        gd3 gd3 = f9231f;
                        gd3.mo10481c(qd32, qd3);
                        if (gd3.mo10485g(this, qd3, qd32)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9233a;
                                    if ((obj2 != null) && (!(obj2 instanceof ld3))) {
                                        return m12542d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m12541b(qd32);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m12541b(qd32);
                        } else {
                            qd3 = this.f9235c;
                        }
                    } while (qd3 != qd3.f16347c);
                }
                Object obj3 = this.f9233a;
                obj3.getClass();
                return m12542d(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f9233a;
                if ((obj4 != null) && (!(obj4 instanceof ld3))) {
                    return m12542d(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String fd3 = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + fd3);
        }
        throw new InterruptedException();
    }
}
