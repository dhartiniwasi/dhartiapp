package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class s33 implements i23 {

    /* renamed from: a */
    private final Object f17211a;

    /* renamed from: b */
    private final t33 f17212b;

    /* renamed from: c */
    private final e43 f17213c;

    /* renamed from: d */
    private final e23 f17214d;

    s33(Object obj, t33 t33, e43 e43, e23 e23) {
        this.f17211a = obj;
        this.f17212b = t33;
        this.f17213c = e43;
        this.f17214d = e23;
    }

    /* renamed from: i */
    private static String m20151i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C2211bd G = C2248cd.m10847G();
        G.mo8748s(5);
        G.mo8746p(jw3.m15086K(bArr));
        return Base64.encodeToString(((C2248cd) G.mo13423m()).mo9400b(), 11);
    }

    /* renamed from: j */
    private final synchronized byte[] m20152j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f17214d.mo9788c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f17211a.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.f17211a, new Object[]{null, map2});
    }

    /* renamed from: a */
    public final synchronized String mo11009a(Context context, String str) {
        Map d;
        d = this.f17213c.mo9797d();
        d.put("f", "q");
        d.put("ctx", context);
        d.put("aid", (Object) null);
        return m20151i(m20152j((Map) null, d));
    }

    /* renamed from: b */
    public final synchronized void mo11010b(String str, MotionEvent motionEvent) throws c43 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.f17211a.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.f17211a, new Object[]{hashMap});
            this.f17214d.mo9789d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new c43(2005, (Throwable) e);
        }
    }

    /* renamed from: c */
    public final synchronized String mo11011c(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.f17213c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", (Object) null);
        zza.put("view", view);
        zza.put("act", activity);
        return m20151i(m20152j((Map) null, zza));
    }

    /* renamed from: d */
    public final synchronized String mo11012d(Context context, String str, View view, Activity activity) {
        Map e;
        e = this.f17213c.mo9798e();
        e.put("f", "v");
        e.put("ctx", context);
        e.put("aid", (Object) null);
        e.put("view", view);
        e.put("act", activity);
        return m20151i(m20152j((Map) null, e));
    }

    /* renamed from: e */
    public final synchronized int mo13944e() throws c43 {
        try {
        } catch (Exception e) {
            throw new c43((int) AdError.INTERNAL_ERROR_2006, (Throwable) e);
        }
        return ((Integer) this.f17211a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f17211a, new Object[0])).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final t33 mo13945f() {
        return this.f17212b;
    }

    /* renamed from: g */
    public final synchronized void mo13946g() throws c43 {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f17211a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f17211a, new Object[0]);
            this.f17214d.mo9789d(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new c43((int) AdError.INTERNAL_ERROR_2003, (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo13947h() throws c43 {
        try {
        } catch (Exception e) {
            throw new c43((int) AdError.INTERNAL_ERROR_CODE, (Throwable) e);
        }
        return ((Boolean) this.f17211a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f17211a, new Object[0])).booleanValue();
    }
}
