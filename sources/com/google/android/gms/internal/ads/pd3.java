package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fd3;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pd3 extends gd3 {

    /* renamed from: a */
    static final Unsafe f15805a;

    /* renamed from: b */
    static final long f15806b;

    /* renamed from: c */
    static final long f15807c;

    /* renamed from: d */
    static final long f15808d;

    /* renamed from: e */
    static final long f15809e;

    /* renamed from: f */
    static final long f15810f;

    /* renamed from: com.google.android.gms.internal.ads.pd3$a */
    /* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
    class C2732a implements PrivilegedExceptionAction<Unsafe> {
        C2732a() {
        }

        /* renamed from: a */
        public static final Unsafe m18574a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m18574a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.pd3.C2732a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.qd3> r0 = com.google.android.gms.internal.ads.qd3.class
            sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            com.google.android.gms.internal.ads.pd3$a r1 = new com.google.android.gms.internal.ads.pd3$a     // Catch:{ PrivilegedActionException -> 0x005c }
            r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005c }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005c }
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005c }
        L_0x0012:
            java.lang.Class<com.google.android.gms.internal.ads.fd3> r2 = com.google.android.gms.internal.ads.fd3.class
            java.lang.String r3 = "c"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15807c = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            java.lang.String r3 = "b"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15806b = r3     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            java.lang.String r3 = "a"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15808d = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            java.lang.String r2 = "a"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15809e = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            java.lang.String r2 = "b"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            long r2 = r1.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15810f = r2     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            f15805a = r1     // Catch:{ NoSuchFieldException -> 0x0055, RuntimeException -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            throw r0
        L_0x0055:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x005c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pd3.<clinit>():void");
    }

    /* synthetic */ pd3(fd3.C2360a aVar) {
        super((fd3.C2360a) null);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    final com.google.android.gms.internal.ads.jd3 mo10479a(com.google.android.gms.internal.ads.fd3 r3, com.google.android.gms.internal.ads.jd3 r4) {
        /*
            r2 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.jd3 r0 = r3.f9234b
            if (r4 != r0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r1 = r2.mo10483e(r3, r0, r4)
            if (r1 == 0) goto L_0x0000
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pd3.mo10479a(com.google.android.gms.internal.ads.fd3, com.google.android.gms.internal.ads.jd3):com.google.android.gms.internal.ads.jd3");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    final com.google.android.gms.internal.ads.qd3 mo10480b(com.google.android.gms.internal.ads.fd3 r3, com.google.android.gms.internal.ads.qd3 r4) {
        /*
            r2 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.qd3 r0 = r3.f9235c
            if (r4 != r0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r1 = r2.mo10485g(r3, r0, r4)
            if (r1 == 0) goto L_0x0000
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pd3.mo10480b(com.google.android.gms.internal.ads.fd3, com.google.android.gms.internal.ads.qd3):com.google.android.gms.internal.ads.qd3");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10481c(qd3 qd3, qd3 qd32) {
        f15805a.putObject(qd3, f15810f, qd32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10482d(qd3 qd3, Thread thread) {
        f15805a.putObject(qd3, f15809e, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo10483e(fd3 fd3, jd3 jd3, jd3 jd32) {
        return td3.m20985a(f15805a, fd3, f15806b, jd3, jd32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10484f(fd3 fd3, Object obj, Object obj2) {
        return td3.m20985a(f15805a, fd3, f15808d, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo10485g(fd3 fd3, qd3 qd3, qd3 qd32) {
        return td3.m20985a(f15805a, fd3, f15807c, qd3, qd32);
    }
}
