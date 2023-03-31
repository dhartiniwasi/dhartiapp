package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class si2 implements tj2 {

    /* renamed from: a */
    private final mf3 f17475a;

    /* renamed from: b */
    private final ScheduledExecutorService f17476b;

    /* renamed from: c */
    private final jb2 f17477c;

    /* renamed from: d */
    private final Context f17478d;

    /* renamed from: e */
    private final et2 f17479e;

    /* renamed from: f */
    private final eb2 f17480f;

    /* renamed from: g */
    private final zs1 f17481g;

    /* renamed from: h */
    final String f17482h;

    public si2(mf3 mf3, ScheduledExecutorService scheduledExecutorService, String str, jb2 jb2, Context context, et2 et2, eb2 eb2, zs1 zs1) {
        this.f17475a = mf3;
        this.f17476b = scheduledExecutorService;
        this.f17482h = str;
        this.f17477c = jb2;
        this.f17478d = context;
        this.f17479e = et2;
        this.f17480f = eb2;
        this.f17481g = zs1;
    }

    /* renamed from: a */
    public static /* synthetic */ lf3 m20382a(si2 si2) {
        String str;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14756z8)).booleanValue()) {
            str = si2.f17479e.f8935f.toLowerCase(Locale.ROOT);
        } else {
            str = si2.f17479e.f8935f;
        }
        Map a = si2.f17477c.mo11375a(si2.f17482h, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((xa3) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = si2.f17479e.f8933d.f24901u;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(si2.m20383c(str2, list, bundle, true, true));
        }
        for (Map.Entry value : ((xa3) si2.f17477c.mo11376b()).entrySet()) {
            nb2 nb2 = (nb2) value.getValue();
            String str3 = nb2.f13934a;
            Bundle bundle3 = si2.f17479e.f8933d.f24901u;
            arrayList.add(si2.m20383c(str3, Collections.singletonList(nb2.f13937d), bundle3 != null ? bundle3.getBundle(str3) : null, nb2.f13935b, nb2.f13936c));
        }
        return cf3.m10905c(arrayList).mo8777a(new pi2(arrayList), si2.f17475a);
    }

    /* renamed from: c */
    private final se3 m20383c(String str, List list, Bundle bundle, boolean z, boolean z2) {
        se3 D = se3.m20287D(cf3.m10914l(new qi2(this, str, list, bundle, z, z2), this.f17475a));
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14679s1)).booleanValue()) {
            D = (se3) cf3.m10917o(D, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14609l1)).longValue(), TimeUnit.MILLISECONDS, this.f17476b);
        }
        return (se3) cf3.m10908f(D, Throwable.class, new ri2(str), this.f17475a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ lf3 mo14019b(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        kd0 kd0;
        kd0 b;
        in0 in0 = new in0();
        if (z2) {
            this.f17480f.mo9871b(str);
            b = this.f17480f.mo9870a(str);
        } else {
            try {
                b = this.f17481g.mo15656b(str);
            } catch (RemoteException e) {
                pm0.m18665e("Couldn't create RTB adapter : ", e);
                kd0 = null;
            }
        }
        kd0 = b;
        if (kd0 == null) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14629n1)).booleanValue()) {
                mb2.m16466I6(str, in0);
            } else {
                throw null;
            }
        } else {
            mb2 mb2 = new mb2(str, kd0, in0);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14679s1)).booleanValue()) {
                this.f17476b.schedule(new oi2(mb2), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14609l1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                kd0.mo11092g5(C4956b.m31385o3(this.f17478d), this.f17482h, bundle, (Bundle) list.get(0), this.f17479e.f8934e, mb2);
            } else {
                mb2.mo12304b();
            }
        }
        return in0;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10914l(new mi2(this), this.f17475a);
    }

    public final int zza() {
        return 32;
    }
}
