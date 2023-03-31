package p359ta;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p351sb.C12502a;
import p369ua.C12722a;

/* renamed from: ta.a0 */
/* compiled from: SqflitePlugin */
public class C12557a0 implements C12502a, C6556k.C6560c {

    /* renamed from: c */
    static final Map<String, Integer> f46063c = new HashMap();

    /* renamed from: d */
    static final Map<Integer, C12569i> f46064d = new HashMap();

    /* renamed from: e */
    private static final Object f46065e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f46066f = new Object();

    /* renamed from: g */
    static int f46067g = 0;

    /* renamed from: h */
    static String f46068h;

    /* renamed from: i */
    private static int f46069i = 0;

    /* renamed from: r */
    private static int f46070r = 1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static int f46071s = 0;

    /* renamed from: t */
    private static C12575n f46072t;

    /* renamed from: a */
    private Context f46073a;

    /* renamed from: b */
    private C6556k f46074b;

    /* renamed from: ta.a0$a */
    /* compiled from: SqflitePlugin */
    class C12558a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12569i f46075a;

        /* renamed from: b */
        final /* synthetic */ C6556k.C6561d f46076b;

        C12558a(C12569i iVar, C6556k.C6561d dVar) {
            this.f46075a = iVar;
            this.f46076b = dVar;
        }

        public void run() {
            synchronized (C12557a0.f46066f) {
                C12557a0.this.m59779k(this.f46075a);
            }
            this.f46076b.success((Object) null);
        }
    }

    /* renamed from: ta.a0$b */
    /* compiled from: SqflitePlugin */
    class C12559b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12569i f46078a;

        /* renamed from: b */
        final /* synthetic */ String f46079b;

        /* renamed from: c */
        final /* synthetic */ C6556k.C6561d f46080c;

        C12559b(C12569i iVar, String str, C6556k.C6561d dVar) {
            this.f46078a = iVar;
            this.f46079b = str;
            this.f46080c = dVar;
        }

        public void run() {
            synchronized (C12557a0.f46066f) {
                C12569i iVar = this.f46078a;
                if (iVar != null) {
                    C12557a0.this.m59779k(iVar);
                }
                try {
                    if (C12578q.m59869c(C12557a0.f46067g)) {
                        Log.d("Sqflite", "delete database " + this.f46079b);
                    }
                    C12569i.m59824n(this.f46079b);
                } catch (Exception e) {
                    Log.e("Sqflite", "error " + e + " while closing database " + C12557a0.f46071s);
                }
            }
            this.f46080c.success((Object) null);
        }
    }

    /* renamed from: A */
    private void m59760A(C6555j jVar, C6556k.C6561d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.mo22156a("cmd"))) {
            int i = f46067g;
            if (i > 0) {
                hashMap.put("logLevel", Integer.valueOf(i));
            }
            Map<Integer, C12569i> map = f46064d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    C12569i iVar = (C12569i) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", iVar.f46098b);
                    hashMap3.put("singleInstance", Boolean.valueOf(iVar.f46097a));
                    int i2 = iVar.f46100d;
                    if (i2 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i2));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.success(hashMap);
    }

    /* renamed from: B */
    private void m59761B(C6555j jVar, C6556k.C6561d dVar) {
        C12722a.f46520a = Boolean.TRUE.equals(jVar.mo22157b());
        C12722a.f46522c = C12722a.f46521b && C12722a.f46520a;
        if (!C12722a.f46520a) {
            f46067g = 0;
        } else if (C12722a.f46522c) {
            f46067g = 2;
        } else if (C12722a.f46520a) {
            f46067g = 1;
        }
        dVar.success((Object) null);
    }

    /* renamed from: C */
    private void m59762C(C6555j jVar, C6556k.C6561d dVar) {
        C12569i iVar;
        Map<Integer, C12569i> map;
        String str = (String) jVar.mo22156a("path");
        synchronized (f46065e) {
            if (C12578q.m59869c(f46067g)) {
                Log.d("Sqflite", "Look for " + str + " in " + f46063c.keySet());
            }
            Map<String, Integer> map2 = f46063c;
            Integer num = map2.get(str);
            if (num == null || (iVar = map.get(num)) == null || !iVar.f46105i.isOpen()) {
                iVar = null;
            } else {
                if (C12578q.m59869c(f46067g)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iVar.mo37411y());
                    sb.append("found single instance ");
                    sb.append(iVar.mo37400D() ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                (map = f46064d).remove(num);
                map2.remove(str);
            }
        }
        C12559b bVar = new C12559b(iVar, str, dVar);
        C12575n nVar = f46072t;
        if (nVar != null) {
            nVar.mo37422a(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: D */
    private void m59763D(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12584w(jVar, dVar, m));
        }
    }

    /* renamed from: F */
    private void m59764F(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12583v(jVar, dVar, m));
        }
    }

    /* renamed from: G */
    private void m59765G(C6555j jVar, C6556k.C6561d dVar) {
        int i;
        C12569i iVar;
        C6555j jVar2 = jVar;
        String str = (String) jVar2.mo22156a("path");
        Boolean bool = (Boolean) jVar2.mo22156a("readOnly");
        boolean n = m59782n(str);
        boolean z = !Boolean.FALSE.equals(jVar2.mo22156a("singleInstance")) && !n;
        if (z) {
            synchronized (f46065e) {
                if (C12578q.m59869c(f46067g)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f46063c.keySet());
                }
                Integer num = f46063c.get(str);
                if (!(num == null || (iVar = f46064d.get(num)) == null)) {
                    if (iVar.f46105i.isOpen()) {
                        if (C12578q.m59869c(f46067g)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iVar.mo37411y());
                            sb.append("re-opened single instance ");
                            sb.append(iVar.mo37400D() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.success(m59790v(num.intValue(), true, iVar.mo37400D()));
                        return;
                    } else if (C12578q.m59869c(f46067g)) {
                        Log.d("Sqflite", iVar.mo37411y() + "single instance database of " + str + " not opened");
                    }
                }
                C6556k.C6561d dVar2 = dVar;
            }
        } else {
            C6556k.C6561d dVar3 = dVar;
        }
        Object obj = f46065e;
        synchronized (obj) {
            i = f46071s + 1;
            f46071s = i;
        }
        C12569i iVar2 = new C12569i(this.f46073a, str, i, z, f46067g);
        synchronized (obj) {
            if (f46072t == null) {
                C12575n a = C12574m.m59858a("Sqflite", f46070r, f46069i);
                f46072t = a;
                a.start();
                if (C12578q.m59868b(iVar2.f46100d)) {
                    Log.d("Sqflite", iVar2.mo37411y() + "starting worker pool with priority " + f46069i);
                }
            }
            iVar2.f46104h = f46072t;
            if (C12578q.m59868b(iVar2.f46100d)) {
                Log.d("Sqflite", iVar2.mo37411y() + "opened " + i + " " + str);
            }
            C12587z zVar = r1;
            C12575n nVar = f46072t;
            C12587z zVar2 = new C12587z(n, str, dVar, bool, iVar2, jVar, z, i);
            nVar.mo37422a(iVar2, zVar);
        }
    }

    /* renamed from: I */
    private void m59766I(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12581t(jVar, dVar, m));
        }
    }

    /* renamed from: J */
    private void m59767J(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12585x(jVar, dVar, m));
        }
    }

    /* renamed from: K */
    private void m59768K(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12582u(jVar, dVar, m));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m59779k(C12569i iVar) {
        try {
            if (C12578q.m59868b(iVar.f46100d)) {
                Log.d("Sqflite", iVar.mo37411y() + "closing database ");
            }
            iVar.mo37407j();
        } catch (Exception e) {
            Log.e("Sqflite", "error " + e + " while closing database " + f46071s);
        }
        synchronized (f46065e) {
            if (f46064d.isEmpty() && f46072t != null) {
                if (C12578q.m59868b(iVar.f46100d)) {
                    Log.d("Sqflite", iVar.mo37411y() + "stopping thread");
                }
                f46072t.mo37423b();
                f46072t = null;
            }
        }
    }

    /* renamed from: l */
    private C12569i m59780l(int i) {
        return f46064d.get(Integer.valueOf(i));
    }

    /* renamed from: m */
    private C12569i m59781m(C6555j jVar, C6556k.C6561d dVar) {
        int intValue = ((Integer) jVar.mo22156a("id")).intValue();
        C12569i l = m59780l(intValue);
        if (l != null) {
            return l;
        }
        dVar.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    /* renamed from: n */
    static boolean m59782n(String str) {
        return str == null || str.equals(":memory:");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r4.success(m59790v(r9, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r6.mo37398B(r2, new p379va.C12862d(r7, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m59786r(boolean r2, java.lang.String r3, p186ac.C6556k.C6561d r4, java.lang.Boolean r5, p359ta.C12569i r6, p186ac.C6555j r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = f46066f
            monitor-enter(r0)
            if (r2 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009f }
            r2.<init>(r3)     // Catch:{ all -> 0x009f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            r5 = 0
            r4.error(r2, r3, r5)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00a1 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x00a1 }
            if (r2 == 0) goto L_0x004a
            r6.mo37402L()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x004d
        L_0x004a:
            r6.mo37401K()     // Catch:{ Exception -> 0x00a1 }
        L_0x004d:
            java.lang.Object r2 = f46065e     // Catch:{ all -> 0x009f }
            monitor-enter(r2)     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f46063c     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r3, r7)     // Catch:{ all -> 0x009c }
        L_0x005b:
            java.util.Map<java.lang.Integer, ta.i> r5 = f46064d     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r7, r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            int r2 = r6.f46100d     // Catch:{ all -> 0x009f }
            boolean r2 = p359ta.C12578q.m59868b(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.mo37411y()     // Catch:{ all -> 0x009f }
            r5.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r9)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x009f }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            r2 = 0
            java.util.Map r2 = m59790v(r9, r2, r2)
            r4.success(r2)
            return
        L_0x009c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r2 = move-exception
            goto L_0x00ac
        L_0x00a1:
            r2 = move-exception
            va.d r3 = new va.d     // Catch:{ all -> 0x009f }
            r3.<init>(r7, r4)     // Catch:{ all -> 0x009f }
            r6.mo37398B(r2, r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ta.C12557a0.m59786r(boolean, java.lang.String, ac.k$d, java.lang.Boolean, ta.i, ac.j, boolean, int):void");
    }

    /* renamed from: v */
    static Map m59790v(int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* renamed from: w */
    private void m59791w(Context context, C6539c cVar) {
        this.f46073a = context;
        C6556k kVar = new C6556k(cVar, "com.tekartik.sqflite", C6570s.f31014b, cVar.mo22135b());
        this.f46074b = kVar;
        kVar.mo22161e(this);
    }

    /* renamed from: x */
    private void m59792x(C6555j jVar, C6556k.C6561d dVar) {
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            f46072t.mo37422a(m, new C12586y(m, jVar, dVar));
        }
    }

    /* renamed from: y */
    private void m59793y(C6555j jVar, C6556k.C6561d dVar) {
        int intValue = ((Integer) jVar.mo22156a("id")).intValue();
        C12569i m = m59781m(jVar, dVar);
        if (m != null) {
            if (C12578q.m59868b(m.f46100d)) {
                Log.d("Sqflite", m.mo37411y() + "closing " + intValue + " " + m.f46098b);
            }
            String str = m.f46098b;
            synchronized (f46065e) {
                f46064d.remove(Integer.valueOf(intValue));
                if (m.f46097a) {
                    f46063c.remove(str);
                }
            }
            f46072t.mo37422a(m, new C12558a(m, dVar));
        }
    }

    /* renamed from: z */
    private void m59794z(C6555j jVar, C6556k.C6561d dVar) {
        dVar.success(Boolean.valueOf(C12569i.m59831w((String) jVar.mo22156a("path"))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo37379E(C6555j jVar, C6556k.C6561d dVar) {
        if (f46068h == null) {
            f46068h = this.f46073a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.success(f46068h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo37380H(C6555j jVar, C6556k.C6561d dVar) {
        Object a = jVar.mo22156a("androidThreadPriority");
        if (a != null) {
            f46069i = ((Integer) a).intValue();
        }
        Object a2 = jVar.mo22156a("androidThreadCount");
        if (a2 != null && !a2.equals(Integer.valueOf(f46070r))) {
            f46070r = ((Integer) a2).intValue();
            C12575n nVar = f46072t;
            if (nVar != null) {
                nVar.mo37423b();
                f46072t = null;
            }
        }
        Integer a3 = C12578q.m59867a(jVar);
        if (a3 != null) {
            f46067g = a3.intValue();
        }
        dVar.success((Object) null);
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m59791w(bVar.mo37292a(), bVar.mo37293b());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f46073a = null;
        this.f46074b.mo22161e((C6556k.C6560c) null);
        this.f46074b = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c = 4;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c = 5;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c = 6;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c = 7;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c = 8;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c = 9;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c = 10;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c = 11;
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c = 12;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c = 13;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m59763D(jVar, dVar);
                return;
            case 1:
                m59793y(jVar, dVar);
                return;
            case 2:
                mo37380H(jVar, dVar);
                return;
            case 3:
                m59764F(jVar, dVar);
                return;
            case 4:
                m59768K(jVar, dVar);
                return;
            case 5:
                m59762C(jVar, dVar);
                return;
            case 6:
                m59761B(jVar, dVar);
                return;
            case 7:
                m59765G(jVar, dVar);
                return;
            case 8:
                m59792x(jVar, dVar);
                return;
            case 9:
                m59760A(jVar, dVar);
                return;
            case 10:
                m59766I(jVar, dVar);
                return;
            case 11:
                m59794z(jVar, dVar);
                return;
            case 12:
                m59767J(jVar, dVar);
                return;
            case 13:
                dVar.success("Android " + Build.VERSION.RELEASE);
                return;
            case 14:
                mo37379E(jVar, dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
