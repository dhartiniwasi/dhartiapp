package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c00 {

    /* renamed from: a */
    private final List f7540a = new LinkedList();

    /* renamed from: b */
    private final Map f7541b;

    /* renamed from: c */
    private final Object f7542c;

    public c00(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7541b = linkedHashMap;
        this.f7542c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    /* renamed from: f */
    public static final C3124zz m10654f() {
        return new C3124zz(C4409t.m29310b().mo18371b(), (String) null, (C3124zz) null);
    }

    /* renamed from: a */
    public final b00 mo8997a() {
        b00 b00;
        boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f7542c) {
            for (C3124zz zzVar : this.f7540a) {
                long a = zzVar.mo15683a();
                String c = zzVar.mo15685c();
                C3124zz b = zzVar.mo15684b();
                if (b != null && a > 0) {
                    sb.append(c);
                    sb.append('.');
                    sb.append(a - b.mo15683a());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(b.mo15683a()))) {
                            hashMap.put(Long.valueOf(b.mo15683a()), new StringBuilder(c));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(b.mo15683a()));
                            sb2.append('+');
                            sb2.append(c);
                        }
                    }
                }
            }
            this.f7540a.clear();
            String str = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(C4409t.m29310b().mo18370a() + (((Long) entry.getKey()).longValue() - C4409t.m29310b().mo18371b()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            b00 = new b00(sb.toString(), str);
        }
        return b00;
    }

    /* renamed from: b */
    public final Map mo8998b() {
        Map map;
        synchronized (this.f7542c) {
            C4409t.m29325q().mo15115f();
            map = this.f7541b;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo8999c(c00 c00) {
        synchronized (this.f7542c) {
        }
    }

    /* renamed from: d */
    public final void mo9000d(String str, String str2) {
        C2865sz f;
        if (!TextUtils.isEmpty(str2) && (f = C4409t.m29325q().mo15115f()) != null) {
            synchronized (this.f7542c) {
                C3087yz a = f.mo14168a(str);
                Map map = this.f7541b;
                map.put(str, a.mo14849a((String) map.get(str), str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo9001e(C3124zz zzVar, long j, String... strArr) {
        synchronized (this.f7542c) {
            for (int i = 0; i <= 0; i++) {
                this.f7540a.add(new C3124zz(j, strArr[i], zzVar));
            }
        }
        return true;
    }
}
