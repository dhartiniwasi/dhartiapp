package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zx1 {

    /* renamed from: a */
    private final kx1 f21705a;

    /* renamed from: b */
    private final ws1 f21706b;

    /* renamed from: c */
    private final Object f21707c = new Object();

    /* renamed from: d */
    private final List f21708d;

    /* renamed from: e */
    private boolean f21709e;

    zx1(kx1 kx1, ws1 ws1) {
        this.f21705a = kx1;
        this.f21706b = ws1;
        this.f21708d = new ArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m24941d(List list) {
        String str;
        boolean z;
        synchronized (this.f21707c) {
            if (!this.f21709e) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    s70 s70 = (s70) it.next();
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14487Y7)).booleanValue()) {
                        vs1 a = this.f21706b.mo14984a(s70.f17285a);
                        if (a != null) {
                            wd0 wd0 = a.f19231c;
                            if (wd0 != null) {
                                str = wd0.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14496Z7)).booleanValue()) {
                        vs1 a2 = this.f21706b.mo14984a(s70.f17285a);
                        if (a2 != null) {
                            if (a2.f19232d) {
                                z = true;
                                List list2 = this.f21708d;
                                String str3 = s70.f17285a;
                                String c = this.f21706b.mo14986c(str3);
                                boolean z2 = s70.f17286b;
                                list2.add(new yx1(str3, str2, c, z2 ? 1 : 0, s70.f17288d, s70.f17287c, z));
                            }
                        }
                    }
                    z = false;
                    List list22 = this.f21708d;
                    String str32 = s70.f17285a;
                    String c2 = this.f21706b.mo14986c(str32);
                    boolean z22 = s70.f17286b;
                    list22.add(new yx1(str32, str2, c2, z22 ? 1 : 0, s70.f17288d, s70.f17287c, z));
                }
                this.f21709e = true;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray mo15672a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f21707c) {
            if (!this.f21709e) {
                if (this.f21705a.mo11811t()) {
                    m24941d(this.f21705a.mo11802g());
                } else {
                    mo15673c();
                    return jSONArray;
                }
            }
            for (yx1 a : this.f21708d) {
                jSONArray.put(a.mo15512a());
            }
            return jSONArray;
        }
    }

    /* renamed from: c */
    public final void mo15673c() {
        this.f21705a.mo11810s(new xx1(this));
    }
}
