package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oj2 extends kf2 {

    /* renamed from: e */
    private wq2 f15160e;

    /* renamed from: f */
    private byte[] f15161f;

    /* renamed from: g */
    private int f15162g;

    /* renamed from: h */
    private int f15163h;

    public oj2() {
        super(false);
    }

    /* renamed from: b */
    public final void mo8791b() {
        if (this.f15161f != null) {
            this.f15161f = null;
            mo11673m();
        }
        this.f15160e = null;
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f15163h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(gb2.m13171h(this.f15161f), this.f15162g, bArr, i, min);
        this.f15162g += min;
        this.f15163h -= min;
        mo11672f0(min);
        return min;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        wq2 wq2 = this.f15160e;
        if (wq2 != null) {
            return wq2.f19753a;
        }
        return null;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws IOException {
        mo11674n(wq2);
        this.f15160e = wq2;
        Uri uri = wq2.f19753a;
        String scheme = uri.getScheme();
        v91.m22051e(JsonStorageKeyNames.DATA_KEY.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] H = gb2.m13138H(uri.getSchemeSpecificPart(), ",");
        if (H.length == 2) {
            String str = H[1];
            if (H[0].contains(";base64")) {
                try {
                    this.f15161f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ea0.m11991b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.f15161f = gb2.m13132B(URLDecoder.decode(str, o73.f14984a.name()));
            }
            long j = wq2.f19758f;
            int length = this.f15161f.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f15162g = i;
                int i2 = length - i;
                this.f15163h = i2;
                long j2 = wq2.f19759g;
                if (j2 != -1) {
                    this.f15163h = (int) Math.min((long) i2, j2);
                }
                mo11675o(wq2);
                long j3 = wq2.f19759g;
                return j3 != -1 ? j3 : (long) this.f15163h;
            }
            this.f15161f = null;
            throw new rm2(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw ea0.m11991b("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }
}
