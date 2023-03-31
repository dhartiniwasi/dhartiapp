package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r70 implements C2430h9 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile e70 f16857a;

    /* renamed from: b */
    private final Context f16858b;

    public r70(Context context) {
        this.f16858b = context;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m19599c(r70 r70) {
        if (r70.f16857a != null) {
            r70.f16857a.mo17343e();
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final C2542k9 mo9863a(C2727p9 p9Var) throws C3061y9 {
        Parcelable.Creator<f70> creator = f70.CREATOR;
        Map s = p9Var.mo13185s();
        int size = s.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : s.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        f70 f70 = new f70(p9Var.mo13184r(), strArr, strArr2);
        long b = C4409t.m29310b().mo18371b();
        try {
            in0 in0 = new in0();
            this.f16857a = new e70(this.f16858b, C4409t.m29330v().mo18569b(), new p70(this, in0), new q70(this, in0));
            this.f16857a.mo17355u();
            n70 n70 = new n70(this, f70);
            mf3 mf3 = dn0.f8325a;
            lf3 o = cf3.m10917o(cf3.m10916n(in0, n70, mf3), (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14286E3)).intValue(), TimeUnit.MILLISECONDS, dn0.f8328d);
            o.mo10135j(new o70(this), mf3);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long b2 = C4409t.m29310b().mo18371b();
            C4794n1.m30693k("Http assets remote cache took " + (b2 - b) + "ms");
            h70 h70 = (h70) new wg0(parcelFileDescriptor).mo14922I1(h70.CREATOR);
            if (h70 == null) {
                return null;
            }
            if (h70.f10216a) {
                throw new C3061y9(h70.f10217b);
            } else if (h70.f10220e.length != h70.f10221f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = h70.f10220e;
                    if (i >= strArr3.length) {
                        return new C2542k9(h70.f10218c, h70.f10219d, (Map) hashMap, h70.f10222g, h70.f10223h);
                    }
                    hashMap.put(strArr3[i], h70.f10221f[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long b3 = C4409t.m29310b().mo18371b();
            C4794n1.m30693k("Http assets remote cache took " + (b3 - b) + "ms");
            return null;
        } catch (Throwable th) {
            long b4 = C4409t.m29310b().mo18371b();
            C4794n1.m30693k("Http assets remote cache took " + (b4 - b) + "ms");
            throw th;
        }
    }
}
