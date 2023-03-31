package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C1429b;
import androidx.room.C1432c;
import androidx.room.C1436e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.f */
/* compiled from: MultiInstanceInvalidationClient */
class C1441f {

    /* renamed from: a */
    final Context f4110a;

    /* renamed from: b */
    final String f4111b;

    /* renamed from: c */
    int f4112c;

    /* renamed from: d */
    final C1436e f4113d;

    /* renamed from: e */
    final C1436e.C1439c f4114e;

    /* renamed from: f */
    C1432c f4115f;

    /* renamed from: g */
    final Executor f4116g;

    /* renamed from: h */
    final C1429b f4117h = new C1442a();

    /* renamed from: i */
    final AtomicBoolean f4118i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f4119j;

    /* renamed from: k */
    final Runnable f4120k;

    /* renamed from: l */
    final Runnable f4121l;

    /* renamed from: m */
    private final Runnable f4122m;

    /* renamed from: androidx.room.f$a */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1442a extends C1429b.C1430a {

        /* renamed from: androidx.room.f$a$a */
        /* compiled from: MultiInstanceInvalidationClient */
        class C1443a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String[] f4124a;

            C1443a(String[] strArr) {
                this.f4124a = strArr;
            }

            public void run() {
                C1441f.this.f4113d.mo5569e(this.f4124a);
            }
        }

        C1442a() {
        }

        /* renamed from: Q1 */
        public void mo5559Q1(String[] strArr) {
            C1441f.this.f4116g.execute(new C1443a(strArr));
        }
    }

    /* renamed from: androidx.room.f$b */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1444b implements ServiceConnection {
        C1444b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1441f.this.f4115f = C1432c.C1433a.m6741p(iBinder);
            C1441f fVar = C1441f.this;
            fVar.f4116g.execute(fVar.f4120k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1441f fVar = C1441f.this;
            fVar.f4116g.execute(fVar.f4121l);
            C1441f.this.f4115f = null;
        }
    }

    /* renamed from: androidx.room.f$c */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1445c implements Runnable {
        C1445c() {
        }

        public void run() {
            try {
                C1441f fVar = C1441f.this;
                C1432c cVar = fVar.f4115f;
                if (cVar != null) {
                    fVar.f4112c = cVar.mo5556u2(fVar.f4117h, fVar.f4111b);
                    C1441f fVar2 = C1441f.this;
                    fVar2.f4113d.mo5566a(fVar2.f4114e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.f$d */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1446d implements Runnable {
        C1446d() {
        }

        public void run() {
            C1441f fVar = C1441f.this;
            fVar.f4113d.mo5571g(fVar.f4114e);
        }
    }

    /* renamed from: androidx.room.f$e */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1447e implements Runnable {
        C1447e() {
        }

        public void run() {
            C1441f fVar = C1441f.this;
            fVar.f4113d.mo5571g(fVar.f4114e);
            try {
                C1441f fVar2 = C1441f.this;
                C1432c cVar = fVar2.f4115f;
                if (cVar != null) {
                    cVar.mo5557u6(fVar2.f4117h, fVar2.f4112c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C1441f fVar3 = C1441f.this;
            fVar3.f4110a.unbindService(fVar3.f4119j);
        }
    }

    /* renamed from: androidx.room.f$f */
    /* compiled from: MultiInstanceInvalidationClient */
    class C1448f extends C1436e.C1439c {
        C1448f(String[] strArr) {
            super(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5580a() {
            return true;
        }

        /* renamed from: b */
        public void mo5581b(Set<String> set) {
            if (!C1441f.this.f4118i.get()) {
                try {
                    C1441f fVar = C1441f.this;
                    C1432c cVar = fVar.f4115f;
                    if (cVar != null) {
                        cVar.mo5555b6(fVar.f4112c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    C1441f(Context context, String str, C1436e eVar, Executor executor) {
        C1444b bVar = new C1444b();
        this.f4119j = bVar;
        this.f4120k = new C1445c();
        this.f4121l = new C1446d();
        this.f4122m = new C1447e();
        Context applicationContext = context.getApplicationContext();
        this.f4110a = applicationContext;
        this.f4111b = str;
        this.f4113d = eVar;
        this.f4116g = executor;
        this.f4114e = new C1448f((String[]) eVar.f4087a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }
}
