package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4761e0;
import p073j4.C4765f0;
import p073j4.C4773h0;
import p073j4.C4794n1;
import p073j4.C4812t1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bp0 {

    /* renamed from: a */
    private final Context f7387a;

    /* renamed from: b */
    private final String f7388b;

    /* renamed from: c */
    private final vm0 f7389c;

    /* renamed from: d */
    private final C3124zz f7390d;

    /* renamed from: e */
    private final c00 f7391e;

    /* renamed from: f */
    private final C4773h0 f7392f;

    /* renamed from: g */
    private final long[] f7393g;

    /* renamed from: h */
    private final String[] f7394h;

    /* renamed from: i */
    private boolean f7395i = false;

    /* renamed from: j */
    private boolean f7396j = false;

    /* renamed from: k */
    private boolean f7397k = false;

    /* renamed from: l */
    private boolean f7398l = false;

    /* renamed from: m */
    private boolean f7399m;

    /* renamed from: n */
    private go0 f7400n;

    /* renamed from: o */
    private boolean f7401o;

    /* renamed from: p */
    private boolean f7402p;

    /* renamed from: q */
    private long f7403q = -1;

    public bp0(Context context, vm0 vm0, String str, c00 c00, C3124zz zzVar) {
        C4765f0 f0Var = new C4765f0();
        C4765f0 f0Var2 = f0Var;
        f0Var2.mo18453a("min_1", Double.MIN_VALUE, 1.0d);
        f0Var2.mo18453a("1_5", 1.0d, 5.0d);
        f0Var2.mo18453a("5_10", 5.0d, 10.0d);
        f0Var2.mo18453a("10_20", 10.0d, 20.0d);
        f0Var2.mo18453a("20_30", 20.0d, 30.0d);
        f0Var2.mo18453a("30_max", 30.0d, Double.MAX_VALUE);
        this.f7392f = f0Var.mo18454b();
        this.f7387a = context;
        this.f7389c = vm0;
        this.f7388b = str;
        this.f7391e = c00;
        this.f7390d = zzVar;
        String str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14737y);
        if (str2 == null) {
            this.f7394h = new String[0];
            this.f7393g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f7394h = new String[length];
        this.f7393g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f7393g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                pm0.m18668h("Unable to parse frame hash target time number.", e);
                this.f7393g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo8910a(go0 go0) {
        C2939uz.m21908a(this.f7391e, this.f7390d, "vpc2");
        this.f7395i = true;
        this.f7391e.mo9000d("vpn", go0.mo9968p());
        this.f7400n = go0;
    }

    /* renamed from: b */
    public final void mo8911b() {
        if (this.f7395i && !this.f7396j) {
            C2939uz.m21908a(this.f7391e, this.f7390d, "vfr2");
            this.f7396j = true;
        }
    }

    /* renamed from: c */
    public final void mo8912c() {
        this.f7399m = true;
        if (this.f7396j && !this.f7397k) {
            C2939uz.m21908a(this.f7391e, this.f7390d, "vfp2");
            this.f7397k = true;
        }
    }

    /* renamed from: d */
    public final void mo8913d() {
        if (((Boolean) t10.f17807a.mo13438e()).booleanValue() && !this.f7401o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f7388b);
            bundle.putString("player", this.f7400n.mo9968p());
            for (C4761e0 e0Var : this.f7392f.mo18460a()) {
                bundle.putString("fps_c_".concat(String.valueOf(e0Var.f25419a)), Integer.toString(e0Var.f25423e));
                bundle.putString("fps_p_".concat(String.valueOf(e0Var.f25419a)), Double.toString(e0Var.f25422d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f7393g;
                if (i < jArr.length) {
                    String str = this.f7394h[i];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str);
                    }
                    i++;
                } else {
                    C4409t.m29326r();
                    Context context = this.f7387a;
                    String str2 = this.f7389c.f19150a;
                    C4409t.m29326r();
                    bundle.putString("device", C4751b2.m30596N());
                    bundle.putString("eids", TextUtils.join(",", C2679nz.m17341a()));
                    C4584t.m30036b();
                    im0.m14417x(context, str2, "gmob-apps", bundle, true, new C4812t1(context, str2));
                    this.f7401o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo8914e() {
        this.f7399m = false;
    }

    /* renamed from: f */
    public final void mo8915f(go0 go0) {
        if (this.f7397k && !this.f7398l) {
            if (C4794n1.m30695m() && !this.f7398l) {
                C4794n1.m30693k("VideoMetricsMixin first frame");
            }
            C2939uz.m21908a(this.f7391e, this.f7390d, "vff2");
            this.f7398l = true;
        }
        long c = C4409t.m29310b().mo18372c();
        if (this.f7399m && this.f7402p && this.f7403q != -1) {
            this.f7392f.mo18461b(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f7403q)));
        }
        this.f7402p = this.f7399m;
        this.f7403q = c;
        long longValue = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14747z)).longValue();
        long h = (long) go0.mo9948h();
        int i = 0;
        while (true) {
            String[] strArr = this.f7394h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(h - this.f7393g[i])) {
                String[] strArr2 = this.f7394h;
                int i2 = 8;
                Bitmap bitmap = go0.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            go0 go02 = go0;
            i++;
        }
    }
}
