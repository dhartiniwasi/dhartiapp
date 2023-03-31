package p052g3;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p155v3.C5828l;
import p155v3.C5831n;
import p155v3.C5837p;
import p155v3.C5840p0;
import p161w3.C5917a;

/* renamed from: g3.a */
/* compiled from: Aes128DataSource */
class C4360a implements C5828l {

    /* renamed from: a */
    private final C5828l f24308a;

    /* renamed from: b */
    private final byte[] f24309b;

    /* renamed from: c */
    private final byte[] f24310c;

    /* renamed from: d */
    private CipherInputStream f24311d;

    public C4360a(C5828l lVar, byte[] bArr, byte[] bArr2) {
        this.f24308a = lVar;
        this.f24309b = bArr;
        this.f24310c = bArr2;
    }

    public void close() throws IOException {
        if (this.f24311d != null) {
            this.f24311d = null;
            this.f24308a.close();
        }
    }

    /* renamed from: i */
    public final Map<String, List<String>> mo6816i() {
        return this.f24308a.mo6816i();
    }

    /* renamed from: m */
    public final Uri mo6817m() {
        return this.f24308a.mo6817m();
    }

    /* renamed from: n */
    public final void mo6818n(C5840p0 p0Var) {
        C5917a.m34872e(p0Var);
        this.f24308a.mo6818n(p0Var);
    }

    /* renamed from: o */
    public final long mo6819o(C5837p pVar) throws IOException {
        try {
            Cipher q = mo17797q();
            try {
                q.init(2, new SecretKeySpec(this.f24309b, "AES"), new IvParameterSpec(this.f24310c));
                C5831n nVar = new C5831n(this.f24308a, pVar);
                this.f24311d = new CipherInputStream(nVar, q);
                nVar.mo20354b();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Cipher mo17797q() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C5917a.m34872e(this.f24311d);
        int read = this.f24311d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
