package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.startapp.C8837b0;
import com.startapp.C8908d3;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9572u;
import com.startapp.C9591v;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p032d4.C4076a;

/* compiled from: Sta */
public class AdvertisingIdResolver {

    /* renamed from: a */
    public final Context f39009a;

    /* renamed from: b */
    public final ThreadFactory f39010b;

    /* renamed from: c */
    public final C8908d3<AdvertisingIdResolverMetadata> f39011c;

    /* renamed from: d */
    public final Lock f39012d;

    /* renamed from: e */
    public final Condition f39013e;

    /* renamed from: f */
    public final AtomicReference<C9572u> f39014f = new AtomicReference<>();

    /* renamed from: g */
    public volatile boolean f39015g = true;

    /* renamed from: h */
    public volatile int f39016h = 0;

    /* renamed from: i */
    public final double f39017i = Math.random();

    /* renamed from: j */
    public int f39018j;

    /* compiled from: Sta */
    public static class InternalException extends Exception {
        private static final long serialVersionUID = -3951983339713608735L;
        public final int infoEventFlags;

        public InternalException(int i) {
            super(String.valueOf(i));
            this.infoEventFlags = i;
        }
    }

    public AdvertisingIdResolver(Context context, ThreadFactory threadFactory, C8908d3<AdvertisingIdResolverMetadata> d3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f39012d = reentrantLock;
        this.f39013e = reentrantLock.newCondition();
        this.f39009a = context;
        this.f39010b = threadFactory;
        this.f39011c = d3Var;
    }

    /* renamed from: a */
    public boolean mo31159a(int i) {
        AdvertisingIdResolverMetadata call = this.f39011c.call();
        if (call == null || !call.mo30919c()) {
            call = null;
        }
        if (call == null || this.f39017i >= call.mo30918b() || (call.mo30917a() & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo31160b(int i) {
        if (mo31159a(i)) {
            int i2 = this.f39018j;
            if (!((i2 & i) == i)) {
                this.f39018j = i2 | i;
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "AIR";
                i4Var.f36953e = String.valueOf(i);
                i4Var.mo29471a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31158a(boolean r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            java.util.concurrent.locks.Lock r2 = r3.f39012d     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.tryLock()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0025
            r3.f39015g = r4     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x0026
            int r4 = r3.f39016h     // Catch:{ all -> 0x0023 }
            if (r4 != 0) goto L_0x0026
            java.util.concurrent.ThreadFactory r4 = r3.f39010b     // Catch:{ all -> 0x0023 }
            com.startapp.sdk.common.advertisingid.a r1 = new com.startapp.sdk.common.advertisingid.a     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            java.lang.Thread r4 = r4.newThread(r1)     // Catch:{ all -> 0x0023 }
            r4.start()     // Catch:{ all -> 0x0023 }
            r3.f39016h = r0     // Catch:{ all -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r4 = move-exception
            goto L_0x002b
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x003d
            goto L_0x0038
        L_0x0029:
            r4 = move-exception
            r0 = 0
        L_0x002b:
            r1 = 16
            boolean r1 = r3.mo31159a((int) r1)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0036
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r4)     // Catch:{ all -> 0x003e }
        L_0x0036:
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            java.util.concurrent.locks.Lock r4 = r3.f39012d
            r4.unlock()
        L_0x003d:
            return
        L_0x003e:
            r4 = move-exception
            if (r0 == 0) goto L_0x0046
            java.util.concurrent.locks.Lock r0 = r3.f39012d
            r0.unlock()
        L_0x0046:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.AdvertisingIdResolver.mo31158a(boolean):void");
    }

    /* renamed from: b */
    public static C9572u m50242b(Context context) throws Exception {
        C9591v vVar;
        Parcel obtain;
        Parcel obtain2;
        Parcel obtain3;
        Parcel obtain4;
        try {
            boolean z = false;
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            vVar = new C9591v();
            try {
                if (!context.bindService(intent, vVar, 1)) {
                    throw new InternalException(2048);
                } else if (!vVar.f39268b) {
                    IBinder take = vVar.f39267a.take();
                    if (take != null) {
                        vVar.f39268b = true;
                        obtain = Parcel.obtain();
                        obtain2 = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        take.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        String readString = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                        if (readString != null) {
                            obtain3 = Parcel.obtain();
                            obtain4 = Parcel.obtain();
                            obtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            obtain3.writeInt(1);
                            take.transact(2, obtain3, obtain4, 0);
                            obtain4.readException();
                            if (obtain4.readInt() != 0) {
                                z = true;
                            }
                            obtain4.recycle();
                            obtain3.recycle();
                            C9572u uVar = new C9572u(readString, "DEVICE", z);
                            C8837b0.m48299a(context, (ServiceConnection) vVar);
                            return uVar;
                        }
                        throw new RemoteException();
                    }
                    throw new IllegalStateException();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                th = th;
                C8837b0.m48299a(context, (ServiceConnection) vVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = null;
            C8837b0.m48299a(context, (ServiceConnection) vVar);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r9.f39009a.checkSelfPermission("com.google.android.gms.permission.AD_ID") == 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        r2 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.C9572u mo31157a() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<com.startapp.u> r0 = r9.f39014f
            java.lang.Object r0 = r0.get()
            com.startapp.u r0 = (com.startapp.C9572u) r0
            if (r0 != 0) goto L_0x00d6
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            r2 = 1
            if (r0 != r1) goto L_0x001f
            r9.mo31160b((int) r2)
            com.startapp.u r0 = com.startapp.C9572u.f39227d
            return r0
        L_0x001f:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00c8 }
            r3 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.locks.Lock r5 = r9.f39012d     // Catch:{ all -> 0x00c8 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00c8 }
            boolean r5 = r5.tryLock(r3, r6)     // Catch:{ all -> 0x00c8 }
            if (r5 == 0) goto L_0x00c0
            boolean r5 = r9.f39015g     // Catch:{ all -> 0x00b9 }
            if (r5 != 0) goto L_0x003b
            com.startapp.u r0 = com.startapp.C9572u.f39227d     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.locks.Lock r1 = r9.f39012d     // Catch:{ all -> 0x00c8 }
            r1.unlock()     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x003b:
            int r5 = r9.f39016h     // Catch:{ all -> 0x00b9 }
            if (r5 != 0) goto L_0x004f
            java.util.concurrent.ThreadFactory r5 = r9.f39010b     // Catch:{ all -> 0x00b9 }
            com.startapp.sdk.common.advertisingid.a r6 = new com.startapp.sdk.common.advertisingid.a     // Catch:{ all -> 0x00b9 }
            r6.<init>(r9)     // Catch:{ all -> 0x00b9 }
            java.lang.Thread r5 = r5.newThread(r6)     // Catch:{ all -> 0x00b9 }
            r5.start()     // Catch:{ all -> 0x00b9 }
            r9.f39016h = r2     // Catch:{ all -> 0x00b9 }
        L_0x004f:
            int r5 = r9.f39016h     // Catch:{ all -> 0x00b9 }
            r6 = 2
            if (r5 == r6) goto L_0x0072
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00b9 }
            long r7 = r7 - r0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0068
            r9.mo31160b((int) r6)     // Catch:{ all -> 0x00b9 }
            com.startapp.u r0 = com.startapp.C9572u.f39227d     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.locks.Lock r1 = r9.f39012d     // Catch:{ all -> 0x00c8 }
            r1.unlock()     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x0068:
            java.util.concurrent.locks.Condition r5 = r9.f39013e     // Catch:{ all -> 0x00b9 }
            long r6 = r3 - r7
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00b9 }
            r5.await(r6, r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x004f
        L_0x0072:
            java.util.concurrent.atomic.AtomicReference<com.startapp.u> r0 = r9.f39014f     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b9 }
            com.startapp.u r0 = (com.startapp.C9572u) r0     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x0083
            r0 = 4
            r9.mo31160b((int) r0)     // Catch:{ all -> 0x00b9 }
            com.startapp.u r0 = com.startapp.C9572u.f39227d     // Catch:{ all -> 0x00b9 }
            goto L_0x00b3
        L_0x0083:
            java.lang.String r1 = "00000000-0000-0000-0000-000000000000"
            java.lang.String r3 = r0.f39228a     // Catch:{ all -> 0x00b9 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x00b3
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b9 }
            r3 = 31
            if (r1 >= r3) goto L_0x0094
            goto L_0x00ac
        L_0x0094:
            android.content.Context r1 = r9.f39009a     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "com.google.android.gms.permission.AD_ID"
            int r1 = r1.checkSelfPermission(r3)     // Catch:{ all -> 0x009f }
            if (r1 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x009f:
            r1 = move-exception
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r9.mo31159a((int) r2)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00ab
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r1)     // Catch:{ all -> 0x00b9 }
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            if (r2 != 0) goto L_0x00b3
            r1 = 4096(0x1000, float:5.74E-42)
            r9.mo31160b((int) r1)     // Catch:{ all -> 0x00b9 }
        L_0x00b3:
            java.util.concurrent.locks.Lock r1 = r9.f39012d     // Catch:{ all -> 0x00c8 }
            r1.unlock()     // Catch:{ all -> 0x00c8 }
            goto L_0x00d6
        L_0x00b9:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r9.f39012d     // Catch:{ all -> 0x00c8 }
            r1.unlock()     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c0:
            r0 = 8
            r9.mo31160b((int) r0)     // Catch:{ all -> 0x00c8 }
            com.startapp.u r0 = com.startapp.C9572u.f39227d     // Catch:{ all -> 0x00c8 }
            goto L_0x00d6
        L_0x00c8:
            r0 = move-exception
            r1 = 32
            boolean r1 = r9.mo31159a((int) r1)
            if (r1 == 0) goto L_0x00d4
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x00d4:
            com.startapp.u r0 = com.startapp.C9572u.f39227d
        L_0x00d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.advertisingid.AdvertisingIdResolver.mo31157a():com.startapp.u");
    }

    /* renamed from: a */
    public static C9572u m50241a(Context context) throws Exception {
        Object invoke = C4076a.class.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        if (invoke != null) {
            String str = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            if (str == null || str.length() < 1) {
                throw new InternalException(1024);
            }
            return new C9572u(str, "APP", Boolean.TRUE.equals((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])));
        }
        throw new InternalException(512);
    }
}
