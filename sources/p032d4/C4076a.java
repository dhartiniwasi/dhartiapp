package p032d4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p061h5.C4626a;
import p102n5.C5129e;
import p102n5.C5130f;
import p180z4.C6360a;
import p180z4.C6370f;
import p180z4.C6372g;
import p180z4.C6374h;
import p180z4.C6378j;

/* renamed from: d4.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C4076a {

    /* renamed from: a */
    C6360a f23219a;

    /* renamed from: b */
    C5130f f23220b;

    /* renamed from: c */
    boolean f23221c;

    /* renamed from: d */
    final Object f23222d;

    /* renamed from: e */
    C4079c f23223e;

    /* renamed from: f */
    private final Context f23224f;

    /* renamed from: g */
    final long f23225g;

    /* renamed from: d4.a$a */
    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class C4077a {

        /* renamed from: a */
        private final String f23226a;

        /* renamed from: b */
        private final boolean f23227b;

        @Deprecated
        public C4077a(String str, boolean z) {
            this.f23226a = str;
            this.f23227b = z;
        }

        /* renamed from: a */
        public String mo17308a() {
            return this.f23226a;
        }

        /* renamed from: b */
        public boolean mo17309b() {
            return this.f23227b;
        }

        public String toString() {
            String str = this.f23226a;
            boolean z = this.f23227b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public C4076a(Context context) {
        this(context, 30000, false, false);
    }

    /* renamed from: a */
    public static C4077a m28009a(Context context) throws IOException, IllegalStateException, C6372g, C6374h {
        C4076a aVar = new C4076a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo17306g(false);
            C4077a i = aVar.m28012i(-1);
            aVar.mo17307h(i, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.mo17304f();
            return i;
        } catch (Throwable th) {
            aVar.mo17304f();
            throw th;
        }
    }

    /* renamed from: c */
    public static boolean m28010c(Context context) throws IOException, C6372g, C6374h {
        boolean b;
        C4076a aVar = new C4076a(context, -1, false, false);
        try {
            aVar.mo17306g(false);
            C4141r.m28220j("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                if (!aVar.f23221c) {
                    synchronized (aVar.f23222d) {
                        C4079c cVar = aVar.f23223e;
                        if (cVar == null || !cVar.f23232d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        aVar.mo17306g(false);
                        if (!aVar.f23221c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                C4141r.m28221k(aVar.f23219a);
                C4141r.m28221k(aVar.f23220b);
                b = aVar.f23220b.mo19097b();
            }
            aVar.m28013j();
            return b;
        } finally {
            aVar.mo17304f();
        }
    }

    /* renamed from: d */
    public static void m28011d(boolean z) {
    }

    /* renamed from: i */
    private final C4077a m28012i(int i) throws IOException {
        C4077a aVar;
        C4141r.m28220j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f23221c) {
                synchronized (this.f23222d) {
                    C4079c cVar = this.f23223e;
                    if (cVar == null || !cVar.f23232d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo17306g(false);
                    if (!this.f23221c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C4141r.m28221k(this.f23219a);
            C4141r.m28221k(this.f23220b);
            aVar = new C4077a(this.f23220b.mo19098e(), this.f23220b.mo19096G(true));
        }
        m28013j();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m28013j() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f23222d
            monitor-enter(r0)
            d4.c r1 = r6.f23223e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f23231c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            d4.c r1 = r6.f23223e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f23225g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            d4.c r3 = new d4.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f23223e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p032d4.C4076a.m28013j():void");
    }

    /* renamed from: b */
    public C4077a mo17302b() throws IOException {
        return m28012i(-1);
    }

    /* renamed from: e */
    public void mo17303e() throws IOException, IllegalStateException, C6372g, C6374h {
        mo17306g(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17304f() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p033d5.C4141r.m28220j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f23224f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            z4.a r0 = r3.f23219a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f23221c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            h5.a r0 = p061h5.C4626a.m30143b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f23224f     // Catch:{ all -> 0x001f }
            z4.a r2 = r3.f23219a     // Catch:{ all -> 0x001f }
            r0.mo18192c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f23221c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f23220b = r0     // Catch:{ all -> 0x0033 }
            r3.f23219a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032d4.C4076a.mo17304f():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        mo17304f();
        super.finalize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo17306g(boolean z) throws IOException, IllegalStateException, C6372g, C6374h {
        C4141r.m28220j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f23221c) {
                mo17304f();
            }
            Context context = this.f23224f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C6370f.m37437h().mo21777j(context, C6378j.f30617a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C6360a aVar = new C6360a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C4626a.m30143b().mo18191a(context, intent, aVar, 1)) {
                    this.f23219a = aVar;
                    this.f23220b = C5129e.m32017p(aVar.mo21748a(10000, TimeUnit.MILLISECONDS));
                    this.f23221c = true;
                    if (z) {
                        m28013j();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C6372g(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo17307h(C4077a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo17309b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo17308a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C4078b(this, hashMap).start();
        return true;
    }

    public C4076a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f23222d = new Object();
        C4141r.m28221k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f23224f = context;
        this.f23221c = false;
        this.f23225g = j;
    }
}
