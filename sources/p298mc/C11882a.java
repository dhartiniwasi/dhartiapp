package p298mc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: mc.a */
/* compiled from: MethodCallHandlerImpl */
class C11882a implements C6556k.C6560c {

    /* renamed from: a */
    private final SharedPreferences f44621a;

    /* renamed from: b */
    private final ExecutorService f44622b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f44623c = new Handler(Looper.getMainLooper());

    /* renamed from: mc.a$a */
    /* compiled from: MethodCallHandlerImpl */
    class C11883a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SharedPreferences.Editor f44624a;

        /* renamed from: b */
        final /* synthetic */ C6556k.C6561d f44625b;

        /* renamed from: mc.a$a$a */
        /* compiled from: MethodCallHandlerImpl */
        class C11884a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f44627a;

            C11884a(boolean z) {
                this.f44627a = z;
            }

            public void run() {
                C11883a.this.f44625b.success(Boolean.valueOf(this.f44627a));
            }
        }

        C11883a(SharedPreferences.Editor editor, C6556k.C6561d dVar) {
            this.f44624a = editor;
            this.f44625b = dVar;
        }

        public void run() {
            C11882a.this.f44623c.post(new C11884a(this.f44624a.commit()));
        }
    }

    C11882a(Context context) {
        this.f44621a = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    /* renamed from: b */
    private void m57393b(SharedPreferences.Editor editor, C6556k.C6561d dVar) {
        this.f44622b.execute(new C11883a(editor, dVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> m57394c(java.lang.String r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            r3 = 0
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r2.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.lang.Object r5 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            r1.close()
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x001d:
            r5 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            goto L_0x0029
        L_0x0022:
            r5 = move-exception
        L_0x0023:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0020 }
            r1.<init>(r5)     // Catch:{ all -> 0x0020 }
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()
        L_0x002e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p298mc.C11882a.m57394c(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m57395d(java.util.List<java.lang.String> r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            r2.writeObject(r4)     // Catch:{ all -> 0x001e }
            r2.flush()     // Catch:{ all -> 0x001e }
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x001e }
            r0 = 0
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ all -> 0x001e }
            r2.close()
            return r4
        L_0x001e:
            r4 = move-exception
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r4 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p298mc.C11882a.m57395d(java.util.List):java.lang.String");
    }

    /* renamed from: e */
    private Map<String, Object> m57396e() throws IOException {
        BigInteger bigInteger;
        Map<String, ?> all = this.f44621a.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith("flutter.")) {
                Object obj = all.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj = m57394c(str.substring(40));
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str.substring(44), 36);
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj = Double.valueOf(str.substring(40));
                    }
                    hashMap.put(next, obj);
                } else {
                    if (obj instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        SharedPreferences.Editor remove = this.f44621a.edit().remove(next);
                        bigInteger = arrayList;
                        if (!remove.putString(next, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m57395d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                    }
                    hashMap.put(next, obj);
                }
                obj = bigInteger;
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public void mo36138f() {
        this.f44623c.removeCallbacksAndMessages((Object) null);
        this.f44622b.shutdown();
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("key");
        try {
            String str2 = jVar.f30999a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = 8;
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m57393b(this.f44621a.edit().putBoolean(str, ((Boolean) jVar.mo22156a("value")).booleanValue()), dVar);
                    return;
                case 1:
                    String d = Double.toString(((Number) jVar.mo22156a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f44621a.edit();
                    m57393b(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d), dVar);
                    return;
                case 2:
                    Number number = (Number) jVar.mo22156a("value");
                    if (number instanceof BigInteger) {
                        SharedPreferences.Editor edit2 = this.f44621a.edit();
                        m57393b(edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36)), dVar);
                        return;
                    }
                    m57393b(this.f44621a.edit().putLong(str, number.longValue()), dVar);
                    return;
                case 3:
                    String str3 = (String) jVar.mo22156a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                            m57393b(this.f44621a.edit().putString(str, str3), dVar);
                            return;
                        }
                    }
                    dVar.error("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", (Object) null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f44621a.edit();
                    m57393b(edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m57395d((List) jVar.mo22156a("value"))), dVar);
                    return;
                case 5:
                    dVar.success(Boolean.TRUE);
                    return;
                case 6:
                    dVar.success(m57396e());
                    return;
                case 7:
                    m57393b(this.f44621a.edit().remove(str), dVar);
                    return;
                case 8:
                    Set<String> keySet = m57396e().keySet();
                    SharedPreferences.Editor edit4 = this.f44621a.edit();
                    for (String remove : keySet) {
                        edit4.remove(remove);
                    }
                    m57393b(edit4, dVar);
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
        } catch (IOException e) {
            dVar.error("IOException encountered", jVar.f30999a, e);
        }
        dVar.error("IOException encountered", jVar.f30999a, e);
    }
}
