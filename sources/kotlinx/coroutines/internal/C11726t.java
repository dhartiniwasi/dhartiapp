package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C11665g;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.internal.t */
/* compiled from: LockFreeTaskQueue.kt */
public final class C11726t<E> {

    /* renamed from: e */
    public static final C11727a f44304e = new C11727a((C11665g) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44305f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f44306g;

    /* renamed from: h */
    public static final C11690e0 f44307h = new C11690e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f44308a;

    /* renamed from: b */
    private final boolean f44309b;

    /* renamed from: c */
    private final int f44310c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f44311d;

    /* renamed from: kotlinx.coroutines.internal.t$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C11727a {
        private C11727a() {
        }

        public /* synthetic */ C11727a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo35950a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo35951b(long j, int i) {
            return mo35953d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo35952c(long j, int i) {
            return mo35953d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo35953d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.t$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C11728b {

        /* renamed from: a */
        public final int f44312a;

        public C11728b(int i) {
            this.f44312a = i;
        }
    }

    static {
        Class<C11726t> cls = C11726t.class;
        f44305f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f44306g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C11726t(int i, boolean z) {
        this.f44308a = i;
        this.f44309b = z;
        int i2 = i - 1;
        this.f44310c = i2;
        this.f44311d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C11726t<E> m56958b(long j) {
        C11726t<E> tVar = new C11726t<>(this.f44308a * 2, this.f44309b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f44310c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f44311d.get(i3 & i);
                if (obj == null) {
                    obj = new C11728b(i);
                }
                tVar.f44311d.set(tVar.f44310c & i, obj);
                i++;
            } else {
                tVar._state = f44304e.mo35953d(j, 1152921504606846976L);
                return tVar;
            }
        }
    }

    /* renamed from: c */
    private final C11726t<E> m56959c(long j) {
        while (true) {
            C11726t<E> tVar = (C11726t) this._next;
            if (tVar != null) {
                return tVar;
            }
            C0600b.m2800a(f44305f, this, (Object) null, m56958b(j));
        }
    }

    /* renamed from: e */
    private final C11726t<E> m56960e(int i, E e) {
        Object obj = this.f44311d.get(this.f44310c & i);
        if (!(obj instanceof C11728b) || ((C11728b) obj).f44312a != i) {
            return null;
        }
        this.f44311d.set(i & this.f44310c, e);
        return this;
    }

    /* renamed from: h */
    private final long m56961h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f44306g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C11726t<E> m56962k(int i, int i2) {
        long j;
        C11727a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f44304e;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C13330n0.m62281a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo35948i();
            }
        } while (!f44306g.compareAndSet(this, j, aVar.mo35951b(j, i2)));
        this.f44311d.set(this.f44310c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v7 kotlinx.coroutines.internal.t) = (r0v6 kotlinx.coroutines.internal.t), (r0v9 kotlinx.coroutines.internal.t) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35944a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.t$a r14 = f44304e
            int r14 = r14.mo35950a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.t$a r0 = f44304e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f44310c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f44309b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f44311d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f44308a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f44306g
            long r11 = r0.mo35952c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f44311d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            kotlinx.coroutines.internal.t r0 = r0.mo35948i()
            kotlinx.coroutines.internal.t r0 = r0.m56960e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11726t.mo35944a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo35945d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f44306g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo35946f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo35947g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C11726t<E> mo35948i() {
        return m56959c(m56961h());
    }

    /* renamed from: j */
    public final Object mo35949j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f44307h;
            }
            C11727a aVar = f44304e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f44310c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f44311d.get(i3 & i);
            if (obj == null) {
                if (this.f44309b) {
                    return null;
                }
            } else if (obj instanceof C11728b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f44306g.compareAndSet(this, j, aVar.mo35951b(j, i4))) {
                    this.f44311d.set(this.f44310c & i, (Object) null);
                    return obj;
                } else if (this.f44309b) {
                    C11726t tVar = this;
                    do {
                        tVar = tVar.m56962k(i, i4);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
