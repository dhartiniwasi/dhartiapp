package p155v3;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.net.URLDecoder;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p182a7.C6415d;

/* renamed from: v3.j */
/* compiled from: DataSchemeDataSource */
public final class C5822j extends C5803g {

    /* renamed from: e */
    private C5837p f28841e;

    /* renamed from: f */
    private byte[] f28842f;

    /* renamed from: g */
    private int f28843g;

    /* renamed from: h */
    private int f28844h;

    public C5822j() {
        super(false);
    }

    public void close() {
        if (this.f28842f != null) {
            this.f28842f = null;
            mo20326r();
        }
        this.f28841e = null;
    }

    /* renamed from: m */
    public Uri mo6817m() {
        C5837p pVar = this.f28841e;
        if (pVar != null) {
            return pVar.f28881a;
        }
        return null;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws IOException {
        mo20327s(pVar);
        this.f28841e = pVar;
        Uri uri = pVar.f28881a;
        String scheme = uri.getScheme();
        boolean equals = JsonStorageKeyNames.DATA_KEY.equals(scheme);
        C5917a.m34869b(equals, "Unsupported scheme: " + scheme);
        String[] Q0 = C5953m0.m35101Q0(uri.getSchemeSpecificPart(), ",");
        if (Q0.length == 2) {
            String str = Q0[1];
            if (Q0[0].contains(";base64")) {
                try {
                    this.f28842f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw C6249m2.m36662b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f28842f = C5953m0.m35145m0(URLDecoder.decode(str, C6415d.f30662a.name()));
            }
            long j = pVar.f28887g;
            byte[] bArr = this.f28842f;
            if (j <= ((long) bArr.length)) {
                int i = (int) j;
                this.f28843g = i;
                int length = bArr.length - i;
                this.f28844h = length;
                long j2 = pVar.f28888h;
                if (j2 != -1) {
                    this.f28844h = (int) Math.min((long) length, j2);
                }
                mo20328t(pVar);
                long j3 = pVar.f28888h;
                return j3 != -1 ? j3 : (long) this.f28844h;
            }
            this.f28842f = null;
            throw new C5830m(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw C6249m2.m36662b("Unexpected URI format: " + uri, (Throwable) null);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f28844h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C5953m0.m35138j(this.f28842f), this.f28843g, bArr, i, min);
        this.f28843g += min;
        this.f28844h -= min;
        mo20325q(min);
        return min;
    }
}
