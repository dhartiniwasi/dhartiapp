package p155v3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.y */
/* compiled from: FileDataSource */
public final class C5854y extends C5803g {

    /* renamed from: e */
    private RandomAccessFile f28984e;

    /* renamed from: f */
    private Uri f28985f;

    /* renamed from: g */
    private long f28986g;

    /* renamed from: h */
    private boolean f28987h;

    /* renamed from: v3.y$a */
    /* compiled from: FileDataSource */
    private static final class C5855a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m34731b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: v3.y$b */
    /* compiled from: FileDataSource */
    public static class C5856b extends C5830m {
        public C5856b(Throwable th, int i) {
            super(th, i);
        }

        public C5856b(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C5854y() {
        super(false);
    }

    /* renamed from: u */
    private static RandomAccessFile m34727u(Uri uri) throws C5856b {
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) C5917a.m34872e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C5856b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e, 1004);
            }
            if (C5953m0.f29110a < 21 || !C5855a.m34731b(e.getCause())) {
                i = 2005;
            }
            throw new C5856b(e, i);
        } catch (SecurityException e2) {
            throw new C5856b(e2, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e3) {
            throw new C5856b(e3, AdError.SERVER_ERROR_CODE);
        }
    }

    public void close() throws C5856b {
        this.f28985f = null;
        try {
            RandomAccessFile randomAccessFile = this.f28984e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f28984e = null;
            if (this.f28987h) {
                this.f28987h = false;
                mo20326r();
            }
        } catch (IOException e) {
            throw new C5856b(e, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.f28984e = null;
            if (this.f28987h) {
                this.f28987h = false;
                mo20326r();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28985f;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5856b {
        Uri uri = pVar.f28881a;
        this.f28985f = uri;
        mo20327s(pVar);
        RandomAccessFile u = m34727u(uri);
        this.f28984e = u;
        try {
            u.seek(pVar.f28887g);
            long j = pVar.f28888h;
            if (j == -1) {
                j = this.f28984e.length() - pVar.f28887g;
            }
            this.f28986g = j;
            if (j >= 0) {
                this.f28987h = true;
                mo20328t(pVar);
                return this.f28986g;
            }
            throw new C5856b((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e) {
            throw new C5856b(e, AdError.SERVER_ERROR_CODE);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5856b {
        if (i2 == 0) {
            return 0;
        }
        if (this.f28986g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C5953m0.m35138j(this.f28984e)).read(bArr, i, (int) Math.min(this.f28986g, (long) i2));
            if (read > 0) {
                this.f28986g -= (long) read;
                mo20325q(read);
            }
            return read;
        } catch (IOException e) {
            throw new C5856b(e, AdError.SERVER_ERROR_CODE);
        }
    }
}
