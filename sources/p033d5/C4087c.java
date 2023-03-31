package p033d5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p007a5.C0105b;
import p180z4.C6362b;
import p180z4.C6366d;
import p180z4.C6370f;

/* renamed from: d5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4087c<T extends IInterface> {

    /* renamed from: L */
    public static final String[] f23237L = {"service_esmobile", "service_googleme"};

    /* renamed from: M */
    private static final C6366d[] f23238M = new C6366d[0];

    /* renamed from: A */
    private C4110h1 f23239A;

    /* renamed from: B */
    private int f23240B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C4088a f23241C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C4089b f23242D;

    /* renamed from: E */
    private final int f23243E;

    /* renamed from: F */
    private final String f23244F;

    /* renamed from: G */
    private volatile String f23245G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C6362b f23246H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f23247I;

    /* renamed from: J */
    private volatile C4120k1 f23248J;

    /* renamed from: K */
    protected AtomicInteger f23249K;

    /* renamed from: a */
    private int f23250a;

    /* renamed from: b */
    private long f23251b;

    /* renamed from: c */
    private long f23252c;

    /* renamed from: d */
    private int f23253d;

    /* renamed from: e */
    private long f23254e;

    /* renamed from: f */
    private volatile String f23255f;

    /* renamed from: g */
    C4155v1 f23256g;

    /* renamed from: h */
    private final Context f23257h;

    /* renamed from: i */
    private final Looper f23258i;

    /* renamed from: r */
    private final C4108h f23259r;

    /* renamed from: s */
    private final C6370f f23260s;

    /* renamed from: t */
    final Handler f23261t;

    /* renamed from: u */
    private final Object f23262u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Object f23263v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C4124m f23264w;

    /* renamed from: x */
    protected C4090c f23265x;

    /* renamed from: y */
    private IInterface f23266y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final ArrayList f23267z;

    /* renamed from: d5.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4088a {
        /* renamed from: P0 */
        void mo8531P0(Bundle bundle);

        /* renamed from: p */
        void mo8532p(int i);
    }

    /* renamed from: d5.c$b */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4089b {
        /* renamed from: B0 */
        void mo8940B0(C6362b bVar);
    }

    /* renamed from: d5.c$c */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4090c {
        /* renamed from: c */
        void mo8121c(C6362b bVar);
    }

    /* renamed from: d5.c$d */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    protected class C4091d implements C4090c {
        public C4091d() {
        }

        /* renamed from: c */
        public final void mo8121c(C6362b bVar) {
            if (bVar.mo21755M1()) {
                C4087c cVar = C4087c.this;
                cVar.mo17347i((C4114j) null, cVar.mo17323G());
            } else if (C4087c.this.f23242D != null) {
                C4087c.this.f23242D.mo8940B0(bVar);
            }
        }
    }

    /* renamed from: d5.c$e */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C4092e {
        /* renamed from: a */
        void mo8096a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C4087c(android.content.Context r10, android.os.Looper r11, int r12, p033d5.C4087c.C4088a r13, p033d5.C4087c.C4089b r14, java.lang.String r15) {
        /*
            r9 = this;
            d5.h r3 = p033d5.C4108h.m28149b(r10)
            z4.f r4 = p180z4.C6370f.m37437h()
            p033d5.C4141r.m28221k(r13)
            p033d5.C4141r.m28221k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033d5.C4087c.<init>(android.content.Context, android.os.Looper, int, d5.c$a, d5.c$b, java.lang.String):void");
    }

    /* renamed from: g0 */
    static /* bridge */ /* synthetic */ void m28039g0(C4087c cVar, C4120k1 k1Var) {
        C4147t tVar;
        cVar.f23248J = k1Var;
        if (cVar.mo17337W()) {
            C4099e eVar = k1Var.f23349d;
            C4144s b = C4144s.m28227b();
            if (eVar == null) {
                tVar = null;
            } else {
                tVar = eVar.mo17381N1();
            }
            b.mo17460c(tVar);
        }
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ void m28040h0(C4087c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f23262u) {
            i2 = cVar.f23240B;
        }
        if (i2 == 3) {
            cVar.f23247I = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f23261t;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f23249K.get(), 16));
    }

    /* renamed from: k0 */
    static /* bridge */ /* synthetic */ boolean m28042k0(C4087c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f23262u) {
            if (cVar.f23240B != i) {
                return false;
            }
            cVar.m28044m0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: l0 */
    static /* bridge */ /* synthetic */ boolean m28043l0(C4087c cVar) {
        if (cVar.f23247I || TextUtils.isEmpty(cVar.mo9818I()) || TextUtils.isEmpty(cVar.mo17322F())) {
            return false;
        }
        try {
            Class.forName(cVar.mo9818I());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m28044m0(int i, IInterface iInterface) {
        C4155v1 v1Var;
        C4155v1 v1Var2;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        C4141r.m28211a(z);
        synchronized (this.f23262u) {
            this.f23240B = i;
            this.f23266y = iInterface;
            if (i == 1) {
                C4110h1 h1Var = this.f23239A;
                if (h1Var != null) {
                    C4108h hVar = this.f23259r;
                    String c = this.f23256g.mo17484c();
                    C4141r.m28221k(c);
                    hVar.mo17398e(c, this.f23256g.mo17483b(), this.f23256g.mo17482a(), h1Var, mo17340b0(), this.f23256g.mo17485d());
                    this.f23239A = null;
                }
            } else if (i == 2 || i == 3) {
                C4110h1 h1Var2 = this.f23239A;
                if (!(h1Var2 == null || (v1Var2 = this.f23256g) == null)) {
                    String c2 = v1Var2.mo17484c();
                    String b = v1Var2.mo17483b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c2 + " on " + b);
                    C4108h hVar2 = this.f23259r;
                    String c3 = this.f23256g.mo17484c();
                    C4141r.m28221k(c3);
                    hVar2.mo17398e(c3, this.f23256g.mo17483b(), this.f23256g.mo17482a(), h1Var2, mo17340b0(), this.f23256g.mo17485d());
                    this.f23249K.incrementAndGet();
                }
                C4110h1 h1Var3 = new C4110h1(this, this.f23249K.get());
                this.f23239A = h1Var3;
                if (this.f23240B != 3 || mo17322F() == null) {
                    v1Var = new C4155v1(mo17325K(), mo9819J(), false, C4108h.m28148a(), mo17327M());
                } else {
                    v1Var = new C4155v1(mo17319C().getPackageName(), mo17322F(), true, C4108h.m28148a(), false);
                }
                this.f23256g = v1Var;
                if (v1Var.mo17485d()) {
                    if (mo12268m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f23256g.mo17484c())));
                    }
                }
                C4108h hVar3 = this.f23259r;
                String c4 = this.f23256g.mo17484c();
                C4141r.m28221k(c4);
                if (!hVar3.mo17399f(new C4132o1(c4, this.f23256g.mo17483b(), this.f23256g.mo17482a(), this.f23256g.mo17485d()), h1Var3, mo17340b0(), mo17317A())) {
                    String c5 = this.f23256g.mo17484c();
                    String b2 = this.f23256g.mo17483b();
                    Log.w("GmsClient", "unable to connect to service: " + c5 + " on " + b2);
                    mo17348i0(16, (Bundle) null, this.f23249K.get());
                }
            } else if (i == 4) {
                C4141r.m28221k(iInterface);
                mo17329O(iInterface);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Executor mo17317A() {
        return null;
    }

    /* renamed from: B */
    public Bundle mo17318B() {
        return null;
    }

    /* renamed from: C */
    public final Context mo17319C() {
        return this.f23257h;
    }

    /* renamed from: D */
    public int mo17320D() {
        return this.f23243E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Bundle mo17321E() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public String mo17322F() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public Set<Scope> mo17323G() {
        return Collections.emptySet();
    }

    /* renamed from: H */
    public final T mo17324H() throws DeadObjectException {
        T t;
        synchronized (this.f23262u) {
            if (this.f23240B != 5) {
                mo17356v();
                t = this.f23266y;
                C4141r.m28222l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract String mo9818I();

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract String mo9819J();

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public String mo17325K() {
        return "com.google.android.gms";
    }

    /* renamed from: L */
    public C4099e mo17326L() {
        C4120k1 k1Var = this.f23248J;
        if (k1Var == null) {
            return null;
        }
        return k1Var.f23349d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo17327M() {
        return mo12268m() >= 211700000;
    }

    /* renamed from: N */
    public boolean mo17328N() {
        return this.f23248J != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo17329O(T t) {
        this.f23252c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo17330P(C6362b bVar) {
        this.f23253d = bVar.mo21751I1();
        this.f23254e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo17331Q(int i) {
        this.f23250a = i;
        this.f23251b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo17332R(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f23261t;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C4113i1(this, i, iBinder, bundle)));
    }

    /* renamed from: S */
    public boolean mo17333S() {
        return false;
    }

    /* renamed from: T */
    public void mo17334T(String str) {
        this.f23245G = str;
    }

    /* renamed from: U */
    public void mo17335U(int i) {
        Handler handler = this.f23261t;
        handler.sendMessage(handler.obtainMessage(6, this.f23249K.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo17336V(C4090c cVar, int i, PendingIntent pendingIntent) {
        C4141r.m28222l(cVar, "Connection progress callbacks cannot be null.");
        this.f23265x = cVar;
        Handler handler = this.f23261t;
        handler.sendMessage(handler.obtainMessage(3, this.f23249K.get(), i, pendingIntent));
    }

    /* renamed from: W */
    public boolean mo17337W() {
        return false;
    }

    /* renamed from: a */
    public boolean mo17338a() {
        boolean z;
        synchronized (this.f23262u) {
            z = this.f23240B == 4;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo17339b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final String mo17340b0() {
        String str = this.f23244F;
        return str == null ? this.f23257h.getClass().getName() : str;
    }

    /* renamed from: d */
    public void mo17341d(String str) {
        this.f23255f = str;
        mo17343e();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        C4124m mVar;
        synchronized (this.f23262u) {
            i = this.f23240B;
            iInterface = this.f23266y;
        }
        synchronized (this.f23263v) {
            mVar = this.f23264w;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo9818I()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f23252c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f23252c;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f23251b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f23250a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f23251b;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f23254e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C0105b.m587a(this.f23253d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f23254e;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    /* renamed from: e */
    public void mo17343e() {
        this.f23249K.incrementAndGet();
        synchronized (this.f23267z) {
            int size = this.f23267z.size();
            for (int i = 0; i < size; i++) {
                ((C4104f1) this.f23267z.get(i)).mo17390d();
            }
            this.f23267z.clear();
        }
        synchronized (this.f23263v) {
            this.f23264w = null;
        }
        m28044m0(1, (IInterface) null);
    }

    /* renamed from: f */
    public boolean mo17344f() {
        boolean z;
        synchronized (this.f23262u) {
            int i = this.f23240B;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public String mo17345g() {
        C4155v1 v1Var;
        if (mo17338a() && (v1Var = this.f23256g) != null) {
            return v1Var.mo17483b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: h */
    public void mo17346h(C4090c cVar) {
        C4141r.m28222l(cVar, "Connection progress callbacks cannot be null.");
        this.f23265x = cVar;
        m28044m0(2, (IInterface) null);
    }

    /* renamed from: i */
    public void mo17347i(C4114j jVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle E = mo17321E();
        int i = this.f23243E;
        String str = this.f23245G;
        int i2 = C6370f.f30608a;
        Scope[] scopeArr = C4102f.f23297w;
        Bundle bundle = new Bundle();
        C6366d[] dVarArr = C4102f.f23298x;
        C4102f fVar = r3;
        C4102f fVar2 = new C4102f(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        C4102f fVar3 = fVar;
        fVar3.f23302d = this.f23257h.getPackageName();
        fVar3.f23305g = E;
        if (set2 != null) {
            fVar3.f23304f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo17354s()) {
            Account y = mo17358y();
            if (y == null) {
                y = new Account("<<default account>>", "com.google");
            }
            fVar3.f23306h = y;
            if (jVar != null) {
                fVar3.f23303e = jVar.asBinder();
            }
        } else if (mo17333S()) {
            fVar3.f23306h = mo17358y();
        }
        fVar3.f23307i = f23238M;
        fVar3.f23308r = mo10646z();
        if (mo17337W()) {
            fVar3.f23311u = true;
        }
        try {
            synchronized (this.f23263v) {
                C4124m mVar = this.f23264w;
                if (mVar != null) {
                    mVar.mo17426D4(new C4107g1(this, this.f23249K.get()), fVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo17335U(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo17332R(8, (IBinder) null, (Bundle) null, this.f23249K.get());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo17348i0(int i, Bundle bundle, int i2) {
        Handler handler = this.f23261t;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C4117j1(this, i, (Bundle) null)));
    }

    /* renamed from: j */
    public void mo17349j(C4092e eVar) {
        eVar.mo8096a();
    }

    /* renamed from: l */
    public boolean mo17350l() {
        return true;
    }

    /* renamed from: m */
    public int mo12268m() {
        return C6370f.f30608a;
    }

    /* renamed from: n */
    public final C6366d[] mo17351n() {
        C4120k1 k1Var = this.f23248J;
        if (k1Var == null) {
            return null;
        }
        return k1Var.f23347b;
    }

    /* renamed from: p */
    public String mo17352p() {
        return this.f23255f;
    }

    /* renamed from: r */
    public Intent mo17353r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: s */
    public boolean mo17354s() {
        return false;
    }

    /* renamed from: u */
    public void mo17355u() {
        int j = this.f23260s.mo21777j(this.f23257h, mo12268m());
        if (j != 0) {
            m28044m0(1, (IInterface) null);
            mo17336V(new C4091d(), j, (PendingIntent) null);
            return;
        }
        mo17346h(new C4091d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo17356v() {
        if (!mo17338a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract T mo9821w(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo17357x() {
        return false;
    }

    /* renamed from: y */
    public Account mo17358y() {
        return null;
    }

    /* renamed from: z */
    public C6366d[] mo10646z() {
        return f23238M;
    }

    protected C4087c(Context context, Looper looper, C4108h hVar, C6370f fVar, int i, C4088a aVar, C4089b bVar, String str) {
        this.f23255f = null;
        this.f23262u = new Object();
        this.f23263v = new Object();
        this.f23267z = new ArrayList();
        this.f23240B = 1;
        this.f23246H = null;
        this.f23247I = false;
        this.f23248J = null;
        this.f23249K = new AtomicInteger(0);
        C4141r.m28222l(context, "Context must not be null");
        this.f23257h = context;
        C4141r.m28222l(looper, "Looper must not be null");
        this.f23258i = looper;
        C4141r.m28222l(hVar, "Supervisor must not be null");
        this.f23259r = hVar;
        C4141r.m28222l(fVar, "API availability must not be null");
        this.f23260s = fVar;
        this.f23261t = new C4101e1(this, looper);
        this.f23243E = i;
        this.f23241C = aVar;
        this.f23242D = bVar;
        this.f23244F = str;
    }
}
