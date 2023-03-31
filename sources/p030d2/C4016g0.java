package p030d2;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p004a2.C0079u1;
import p021c2.C1841b;
import p030d2.C4035m;

/* renamed from: d2.g0 */
/* compiled from: ExoMediaDrm */
public interface C4016g0 {

    /* renamed from: d2.g0$a */
    /* compiled from: ExoMediaDrm */
    public static final class C4017a {

        /* renamed from: a */
        private final byte[] f23049a;

        /* renamed from: b */
        private final String f23050b;

        /* renamed from: c */
        private final int f23051c;

        public C4017a(byte[] bArr, String str, int i) {
            this.f23049a = bArr;
            this.f23050b = str;
            this.f23051c = i;
        }

        /* renamed from: a */
        public byte[] mo17200a() {
            return this.f23049a;
        }

        /* renamed from: b */
        public String mo17201b() {
            return this.f23050b;
        }
    }

    /* renamed from: d2.g0$b */
    /* compiled from: ExoMediaDrm */
    public interface C4018b {
        /* renamed from: a */
        void mo17202a(C4016g0 g0Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: d2.g0$c */
    /* compiled from: ExoMediaDrm */
    public interface C4019c {
        /* renamed from: a */
        C4016g0 mo17203a(UUID uuid);
    }

    /* renamed from: d2.g0$d */
    /* compiled from: ExoMediaDrm */
    public static final class C4020d {

        /* renamed from: a */
        private final byte[] f23052a;

        /* renamed from: b */
        private final String f23053b;

        public C4020d(byte[] bArr, String str) {
            this.f23052a = bArr;
            this.f23053b = str;
        }

        /* renamed from: a */
        public byte[] mo17204a() {
            return this.f23052a;
        }

        /* renamed from: b */
        public String mo17205b() {
            return this.f23053b;
        }
    }

    /* renamed from: a */
    void mo17163a();

    /* renamed from: b */
    Map<String, String> mo17164b(byte[] bArr);

    /* renamed from: c */
    C4020d mo17165c();

    /* renamed from: d */
    void mo17166d(byte[] bArr, C0079u1 u1Var);

    /* renamed from: e */
    C1841b mo17167e(byte[] bArr) throws MediaCryptoException;

    /* renamed from: f */
    byte[] mo17168f() throws MediaDrmException;

    /* renamed from: g */
    boolean mo17169g(byte[] bArr, String str);

    /* renamed from: h */
    void mo17170h(byte[] bArr, byte[] bArr2);

    /* renamed from: i */
    void mo17171i(byte[] bArr);

    /* renamed from: j */
    byte[] mo17172j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: k */
    void mo17173k(byte[] bArr) throws DeniedByServerException;

    /* renamed from: l */
    C4017a mo17174l(byte[] bArr, List<C4035m.C4037b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    /* renamed from: m */
    int mo17175m();

    /* renamed from: n */
    void mo17176n(C4018b bVar);
}
