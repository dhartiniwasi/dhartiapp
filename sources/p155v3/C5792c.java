package p155v3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.c */
/* compiled from: AssetDataSource */
public final class C5792c extends C5803g {

    /* renamed from: e */
    private final AssetManager f28784e;

    /* renamed from: f */
    private Uri f28785f;

    /* renamed from: g */
    private InputStream f28786g;

    /* renamed from: h */
    private long f28787h;

    /* renamed from: i */
    private boolean f28788i;

    /* renamed from: v3.c$a */
    /* compiled from: AssetDataSource */
    public static final class C5793a extends C5830m {
        public C5793a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C5792c(Context context) {
        super(false);
        this.f28784e = context.getAssets();
    }

    public void close() throws C5793a {
        this.f28785f = null;
        try {
            InputStream inputStream = this.f28786g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f28786g = null;
            if (this.f28788i) {
                this.f28788i = false;
                mo20326r();
            }
        } catch (IOException e) {
            throw new C5793a(e, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f28786g = null;
            if (this.f28788i) {
                this.f28788i = false;
                mo20326r();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28785f;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5793a {
        try {
            Uri uri = pVar.f28881a;
            this.f28785f = uri;
            String str = (String) C5917a.m34872e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            mo20327s(pVar);
            InputStream open = this.f28784e.open(str, 1);
            this.f28786g = open;
            if (open.skip(pVar.f28887g) >= pVar.f28887g) {
                long j = pVar.f28888h;
                if (j != -1) {
                    this.f28787h = j;
                } else {
                    long available = (long) this.f28786g.available();
                    this.f28787h = available;
                    if (available == 2147483647L) {
                        this.f28787h = -1;
                    }
                }
                this.f28788i = true;
                mo20328t(pVar);
                return this.f28787h;
            }
            throw new C5793a((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (C5793a e) {
            throw e;
        } catch (IOException e2) {
            throw new C5793a(e2, e2 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5793a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f28787h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C5793a(e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) C5953m0.m35138j(this.f28786g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f28787h;
        if (j2 != -1) {
            this.f28787h = j2 - ((long) read);
        }
        mo20325q(read);
        return read;
    }
}
