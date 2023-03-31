package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.sz */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2865sz {

    /* renamed from: a */
    final BlockingQueue f17784a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap f17785b = new LinkedHashMap();

    /* renamed from: c */
    final Map f17786c = new HashMap();

    /* renamed from: d */
    String f17787d;

    /* renamed from: e */
    Context f17788e;

    /* renamed from: f */
    String f17789f;

    /* renamed from: g */
    private final HashSet f17790g = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h */
    private AtomicBoolean f17791h;

    /* renamed from: i */
    private File f17792i;

    /* renamed from: c */
    public static /* synthetic */ void m20737c(C2865sz szVar) {
        while (true) {
            try {
                c00 c00 = (c00) szVar.f17784a.take();
                b00 a = c00.mo8997a();
                if (!TextUtils.isEmpty(a.mo8639b())) {
                    szVar.m20738g(szVar.mo14169b(szVar.f17785b, c00.mo8998b()), a);
                }
            } catch (InterruptedException e) {
                pm0.m18668h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7 A[SYNTHETIC, Splitter:B:38:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[SYNTHETIC, Splitter:B:44:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20738g(java.util.Map r5, com.google.android.gms.internal.ads.b00 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f17787d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.mo8639b()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.mo8639b()
            r1.append(r5)
        L_0x0055:
            java.lang.String r5 = r6.mo8638a()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.mo8638a()
            r1.append(r5)
        L_0x006b:
            java.lang.String r5 = r1.toString()
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f17791h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00c1
            java.io.File r6 = r4.f17792i
            if (r6 == 0) goto L_0x00bb
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x009f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x009f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
            return
        L_0x0092:
            r5 = move-exception
            com.google.android.gms.internal.ads.pm0.m18668h(r0, r5)
            return
        L_0x0097:
            r5 = move-exception
            r1 = r2
            goto L_0x00b0
        L_0x009a:
            r5 = move-exception
            r1 = r2
            goto L_0x00a0
        L_0x009d:
            r5 = move-exception
            goto L_0x00b0
        L_0x009f:
            r5 = move-exception
        L_0x00a0:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.pm0.m18668h(r6, r5)     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x00af
            r1.close()     // Catch:{ IOException -> 0x00ab }
            return
        L_0x00ab:
            r5 = move-exception
            com.google.android.gms.internal.ads.pm0.m18668h(r0, r5)
        L_0x00af:
            return
        L_0x00b0:
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18668h(r0, r6)
        L_0x00ba:
            throw r5
        L_0x00bb:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.pm0.m18667g(r5)
            return
        L_0x00c1:
            p053g4.C4409t.m29326r()
            android.content.Context r6 = r4.f17788e
            java.lang.String r0 = r4.f17789f
            p073j4.C4751b2.m30613h(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2865sz.m20738g(java.util.Map, com.google.android.gms.internal.ads.b00):void");
    }

    /* renamed from: a */
    public final C3087yz mo14168a(String str) {
        C3087yz yzVar = (C3087yz) this.f17786c.get(str);
        return yzVar != null ? yzVar : C3087yz.f20854a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo14169b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo14168a(str).mo14849a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void mo14170d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f17788e = context;
        this.f17789f = str;
        this.f17787d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f17791h = atomicBoolean;
        atomicBoolean.set(((Boolean) z00.f20899c.mo13438e()).booleanValue());
        if (this.f17791h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f17792i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f17785b.put((String) entry.getKey(), (String) entry.getValue());
        }
        dn0.f8325a.execute(new C2828rz(this));
        Map map2 = this.f17786c;
        C3087yz yzVar = C3087yz.f20855b;
        map2.put("action", yzVar);
        this.f17786c.put("ad_format", yzVar);
        this.f17786c.put("e", C3087yz.f20856c);
    }

    /* renamed from: e */
    public final void mo14171e(String str) {
        if (!this.f17790g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f17789f);
            linkedHashMap.put("ue", str);
            m20738g(mo14169b(this.f17785b, linkedHashMap), (b00) null);
        }
    }

    /* renamed from: f */
    public final boolean mo14172f(c00 c00) {
        return this.f17784a.offer(c00);
    }
}
