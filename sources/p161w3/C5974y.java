package p161w3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: w3.y */
/* compiled from: NetworkTypeObserver */
public final class C5974y {

    /* renamed from: e */
    private static C5974y f29181e;

    /* renamed from: a */
    private final Handler f29182a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<C5978c>> f29183b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f29184c = new Object();

    /* renamed from: d */
    private int f29185d = 0;

    /* renamed from: w3.y$b */
    /* compiled from: NetworkTypeObserver */
    private static final class C5976b {

        /* renamed from: w3.y$b$a */
        /* compiled from: NetworkTypeObserver */
        private static final class C5977a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            private final C5974y f29186a;

            public C5977a(C5974y yVar) {
                this.f29186a = yVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i = 5;
                boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
                C5974y yVar = this.f29186a;
                if (z) {
                    i = 10;
                }
                yVar.m35283k(i);
            }
        }

        /* renamed from: a */
        public static void m35286a(Context context, C5974y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C5917a.m34872e((TelephonyManager) context.getSystemService("phone"));
                C5977a aVar = new C5977a(yVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.m35283k(5);
            }
        }
    }

    /* renamed from: w3.y$c */
    /* compiled from: NetworkTypeObserver */
    public interface C5978c {
        /* renamed from: a */
        void mo20668a(int i);
    }

    /* renamed from: w3.y$d */
    /* compiled from: NetworkTypeObserver */
    private final class C5979d extends BroadcastReceiver {
        private C5979d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b = C5974y.m35280g(context);
            if (C5953m0.f29110a < 31 || b != 5) {
                C5974y.this.m35283k(b);
            } else {
                C5976b.m35286a(context, C5974y.this);
            }
        }
    }

    private C5974y(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C5979d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized C5974y m35278d(Context context) {
        C5974y yVar;
        synchronized (C5974y.class) {
            if (f29181e == null) {
                f29181e = new C5974y(context);
            }
            yVar = f29181e;
        }
        return yVar;
    }

    /* renamed from: e */
    private static int m35279e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return C5953m0.f29110a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m35280g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m35279e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m35281h(C5978c cVar) {
        cVar.mo20668a(mo20665f());
    }

    /* renamed from: j */
    private void m35282j() {
        Iterator<WeakReference<C5978c>> it = this.f29183b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f29183b.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (p161w3.C5974y.C5978c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.mo20668a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f29183b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f29183b.iterator();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m35283k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f29184c
            monitor-enter(r0)
            int r1 = r3.f29185d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f29185d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<w3.y$c>> r0 = r3.f29183b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            w3.y$c r2 = (p161w3.C5974y.C5978c) r2
            if (r2 == 0) goto L_0x002a
            r2.mo20668a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<w3.y$c>> r2 = r3.f29183b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5974y.m35283k(int):void");
    }

    /* renamed from: f */
    public int mo20665f() {
        int i;
        synchronized (this.f29184c) {
            i = this.f29185d;
        }
        return i;
    }

    /* renamed from: i */
    public void mo20666i(C5978c cVar) {
        m35282j();
        this.f29183b.add(new WeakReference(cVar));
        this.f29182a.post(new C12906x(this, cVar));
    }
}
