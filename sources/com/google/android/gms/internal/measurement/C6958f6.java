package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p124r.C5413a;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C6958f6 implements C7040k6 {

    /* renamed from: h */
    private static final Map f31677h = new C5413a();

    /* renamed from: i */
    public static final String[] f31678i = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f31679a;

    /* renamed from: b */
    private final Uri f31680b;

    /* renamed from: c */
    private final Runnable f31681c;

    /* renamed from: d */
    private final ContentObserver f31682d;

    /* renamed from: e */
    private final Object f31683e = new Object();

    /* renamed from: f */
    private volatile Map f31684f;

    /* renamed from: g */
    private final List f31685g = new ArrayList();

    private C6958f6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C6941e6 e6Var = new C6941e6(this, (Handler) null);
        this.f31682d = e6Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f31679a = contentResolver;
        this.f31680b = uri;
        this.f31681c = runnable;
        contentResolver.registerContentObserver(uri, false, e6Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C6958f6 m40016a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.f6> r0 = com.google.android.gms.internal.measurement.C6958f6.class
            monitor-enter(r0)
            java.util.Map r1 = f31677h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.f6 r2 = (com.google.android.gms.internal.measurement.C6958f6) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.f6 r3 = new com.google.android.gms.internal.measurement.f6     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6958f6.m40016a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.f6");
    }

    /* renamed from: d */
    static synchronized void m40017d() {
        synchronized (C6958f6.class) {
            for (C6958f6 f6Var : f31677h.values()) {
                f6Var.f31679a.unregisterContentObserver(f6Var.f31682d);
            }
            f31677h.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Map mo23410b() {
        Map map;
        Map map2 = this.f31684f;
        if (map2 == null) {
            synchronized (this.f31683e) {
                map2 = this.f31684f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C7008i6.m40199a(new C6924d6(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f31684f = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map mo23411c() {
        Map map;
        Cursor query = this.f31679a.query(this.f31680b, f31678i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C5413a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void mo23412e() {
        synchronized (this.f31683e) {
            this.f31684f = null;
            this.f31681c.run();
        }
        synchronized (this) {
            for (C6975g6 zza : this.f31685g) {
                zza.zza();
            }
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo23322i(String str) {
        return (String) mo23410b().get(str);
    }
}
