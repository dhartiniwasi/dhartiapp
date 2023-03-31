package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ys2 implements ql2 {

    /* renamed from: a */
    private final Context f20802a;

    /* renamed from: b */
    private final List f20803b = new ArrayList();

    /* renamed from: c */
    private final ql2 f20804c;

    /* renamed from: d */
    private ql2 f20805d;

    /* renamed from: e */
    private ql2 f20806e;

    /* renamed from: f */
    private ql2 f20807f;

    /* renamed from: g */
    private ql2 f20808g;

    /* renamed from: h */
    private ql2 f20809h;

    /* renamed from: i */
    private ql2 f20810i;

    /* renamed from: j */
    private ql2 f20811j;

    /* renamed from: k */
    private ql2 f20812k;

    public ys2(Context context, ql2 ql2) {
        this.f20802a = context.getApplicationContext();
        this.f20804c = ql2;
    }

    /* renamed from: m */
    private final ql2 m24178m() {
        if (this.f20806e == null) {
            je2 je2 = new je2(this.f20802a);
            this.f20806e = je2;
            m24179n(je2);
        }
        return this.f20806e;
    }

    /* renamed from: n */
    private final void m24179n(ql2 ql2) {
        for (int i = 0; i < this.f20803b.size(); i++) {
            ql2.mo8795k((ve3) this.f20803b.get(i));
        }
    }

    /* renamed from: o */
    private static final void m24180o(ql2 ql2, ve3 ve3) {
        if (ql2 != null) {
            ql2.mo8795k(ve3);
        }
    }

    /* renamed from: a */
    public final Map mo8790a() {
        ql2 ql2 = this.f20812k;
        return ql2 == null ? Collections.emptyMap() : ql2.mo8790a();
    }

    /* renamed from: b */
    public final void mo8791b() throws IOException {
        ql2 ql2 = this.f20812k;
        if (ql2 != null) {
            try {
                ql2.mo8791b();
            } finally {
                this.f20812k = null;
            }
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        ql2 ql2 = this.f20812k;
        Objects.requireNonNull(ql2);
        return ql2.mo8792c(bArr, i, i2);
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        ql2 ql2 = this.f20812k;
        if (ql2 == null) {
            return null;
        }
        return ql2.mo8793e();
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws IOException {
        ql2 ql2;
        v91.m22052f(this.f20812k == null);
        String scheme = wq2.f19753a.getScheme();
        if (gb2.m13189w(wq2.f19753a)) {
            String path = wq2.f19753a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20805d == null) {
                    h23 h23 = new h23();
                    this.f20805d = h23;
                    m24179n(h23);
                }
                this.f20812k = this.f20805d;
            } else {
                this.f20812k = m24178m();
            }
        } else if ("asset".equals(scheme)) {
            this.f20812k = m24178m();
        } else if ("content".equals(scheme)) {
            if (this.f20807f == null) {
                ni2 ni2 = new ni2(this.f20802a);
                this.f20807f = ni2;
                m24179n(ni2);
            }
            this.f20812k = this.f20807f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f20808g == null) {
                try {
                    ql2 ql22 = (ql2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f20808g = ql22;
                    m24179n(ql22);
                } catch (ClassNotFoundException unused) {
                    ot1.m18060e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f20808g == null) {
                    this.f20808g = this.f20804c;
                }
            }
            this.f20812k = this.f20808g;
        } else if ("udp".equals(scheme)) {
            if (this.f20809h == null) {
                yg3 yg3 = new yg3(AdError.SERVER_ERROR_CODE);
                this.f20809h = yg3;
                m24179n(yg3);
            }
            this.f20812k = this.f20809h;
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            if (this.f20810i == null) {
                oj2 oj2 = new oj2();
                this.f20810i = oj2;
                m24179n(oj2);
            }
            this.f20812k = this.f20810i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f20811j == null) {
                    hc3 hc3 = new hc3(this.f20802a);
                    this.f20811j = hc3;
                    m24179n(hc3);
                }
                ql2 = this.f20811j;
            } else {
                ql2 = this.f20804c;
            }
            this.f20812k = ql2;
        }
        return this.f20812k.mo8794f(wq2);
    }

    /* renamed from: k */
    public final void mo8795k(ve3 ve3) {
        Objects.requireNonNull(ve3);
        this.f20804c.mo8795k(ve3);
        this.f20803b.add(ve3);
        m24180o(this.f20805d, ve3);
        m24180o(this.f20806e, ve3);
        m24180o(this.f20807f, ve3);
        m24180o(this.f20808g, ve3);
        m24180o(this.f20809h, ve3);
        m24180o(this.f20810i, ve3);
        m24180o(this.f20811j, ve3);
    }
}
