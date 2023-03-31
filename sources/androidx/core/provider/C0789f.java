package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.C0744f;
import androidx.core.provider.C0795g;
import androidx.core.util.C0823a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p124r.C5419e;
import p124r.C5426g;

/* renamed from: androidx.core.provider.f */
/* compiled from: FontRequestWorker */
class C0789f {

    /* renamed from: a */
    static final C5419e<String, Typeface> f2361a = new C5419e<>(16);

    /* renamed from: b */
    private static final ExecutorService f2362b = C0799h.m3585a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f2363c = new Object();

    /* renamed from: d */
    static final C5426g<String, ArrayList<C0823a<C0794e>>> f2364d = new C5426g<>();

    /* renamed from: androidx.core.provider.f$a */
    /* compiled from: FontRequestWorker */
    class C0790a implements Callable<C0794e> {

        /* renamed from: a */
        final /* synthetic */ String f2365a;

        /* renamed from: b */
        final /* synthetic */ Context f2366b;

        /* renamed from: c */
        final /* synthetic */ C0788e f2367c;

        /* renamed from: d */
        final /* synthetic */ int f2368d;

        C0790a(String str, Context context, C0788e eVar, int i) {
            this.f2365a = str;
            this.f2366b = context;
            this.f2367c = eVar;
            this.f2368d = i;
        }

        /* renamed from: a */
        public C0794e call() {
            return C0789f.m3563c(this.f2365a, this.f2366b, this.f2367c, this.f2368d);
        }
    }

    /* renamed from: androidx.core.provider.f$b */
    /* compiled from: FontRequestWorker */
    class C0791b implements C0823a<C0794e> {

        /* renamed from: a */
        final /* synthetic */ C0781a f2369a;

        C0791b(C0781a aVar) {
            this.f2369a = aVar;
        }

        /* renamed from: a */
        public void accept(C0794e eVar) {
            if (eVar == null) {
                eVar = new C0794e(-3);
            }
            this.f2369a.mo3156b(eVar);
        }
    }

    /* renamed from: androidx.core.provider.f$c */
    /* compiled from: FontRequestWorker */
    class C0792c implements Callable<C0794e> {

        /* renamed from: a */
        final /* synthetic */ String f2370a;

        /* renamed from: b */
        final /* synthetic */ Context f2371b;

        /* renamed from: c */
        final /* synthetic */ C0788e f2372c;

        /* renamed from: d */
        final /* synthetic */ int f2373d;

        C0792c(String str, Context context, C0788e eVar, int i) {
            this.f2370a = str;
            this.f2371b = context;
            this.f2372c = eVar;
            this.f2373d = i;
        }

        /* renamed from: a */
        public C0794e call() {
            try {
                return C0789f.m3563c(this.f2370a, this.f2371b, this.f2372c, this.f2373d);
            } catch (Throwable unused) {
                return new C0794e(-3);
            }
        }
    }

    /* renamed from: androidx.core.provider.f$d */
    /* compiled from: FontRequestWorker */
    class C0793d implements C0823a<C0794e> {

        /* renamed from: a */
        final /* synthetic */ String f2374a;

        C0793d(String str) {
            this.f2374a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C0823a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.C0789f.C0794e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C0789f.f2363c
                monitor-enter(r0)
                r.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r1 = androidx.core.provider.C0789f.f2364d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f2374a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f2374a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.C0823a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0789f.C0793d.accept(androidx.core.provider.f$e):void");
        }
    }

    /* renamed from: a */
    private static String m3561a(C0788e eVar, int i) {
        return eVar.mo3162d() + "-" + i;
    }

    /* renamed from: b */
    private static int m3562b(C0795g.C0796a aVar) {
        int i = 1;
        if (aVar.mo3176c() == 0) {
            C0795g.C0797b[] b = aVar.mo3175b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo3177b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (aVar.mo3176c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C0794e m3563c(String str, Context context, C0788e eVar, int i) {
        C5419e<String, Typeface> eVar2 = f2361a;
        Typeface c = eVar2.mo19586c(str);
        if (c != null) {
            return new C0794e(c);
        }
        try {
            C0795g.C0796a e = C0786d.m3549e(context, eVar, (CancellationSignal) null);
            int b = m3562b(e);
            if (b != 0) {
                return new C0794e(b);
            }
            Typeface b2 = C0744f.m3424b(context, (CancellationSignal) null, e.mo3175b(), i);
            if (b2 == null) {
                return new C0794e(-3);
            }
            eVar2.mo19587d(str, b2);
            return new C0794e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0794e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new androidx.core.provider.C0789f.C0792c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f2362b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        androidx.core.provider.C0799h.m3586b(r8, r9, new androidx.core.provider.C0789f.C0793d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m3564d(android.content.Context r5, androidx.core.provider.C0788e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.C0781a r9) {
        /*
            java.lang.String r0 = m3561a(r6, r7)
            r.e<java.lang.String, android.graphics.Typeface> r1 = f2361a
            java.lang.Object r1 = r1.mo19586c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo3156b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f2363c
            monitor-enter(r9)
            r.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<androidx.core.provider.f$e>>> r2 = f2364d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f2362b
        L_0x0044:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.C0799h.m3586b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0789f.m3564d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m3565e(Context context, C0788e eVar, C0781a aVar, int i, int i2) {
        String a = m3561a(eVar, i);
        Typeface c = f2361a.mo19586c(a);
        if (c != null) {
            aVar.mo3156b(new C0794e(c));
            return c;
        } else if (i2 == -1) {
            C0794e c2 = m3563c(a, context, eVar, i);
            aVar.mo3156b(c2);
            return c2.f2375a;
        } else {
            try {
                C0794e eVar2 = (C0794e) C0799h.m3587c(f2362b, new C0790a(a, context, eVar, i), i2);
                aVar.mo3156b(eVar2);
                return eVar2.f2375a;
            } catch (InterruptedException unused) {
                aVar.mo3156b(new C0794e(-3));
                return null;
            }
        }
    }

    /* renamed from: androidx.core.provider.f$e */
    /* compiled from: FontRequestWorker */
    static final class C0794e {

        /* renamed from: a */
        final Typeface f2375a;

        /* renamed from: b */
        final int f2376b;

        C0794e(int i) {
            this.f2375a = null;
            this.f2376b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3174a() {
            return this.f2376b == 0;
        }

        C0794e(Typeface typeface) {
            this.f2375a = typeface;
            this.f2376b = 0;
        }
    }
}
