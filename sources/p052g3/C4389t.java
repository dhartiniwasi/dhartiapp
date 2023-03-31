package p052g3;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p142t3.C5523i;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: g3.t */
/* compiled from: WebvttExtractor */
public final class C4389t implements C4215l {

    /* renamed from: g */
    private static final Pattern f24481g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    private static final Pattern f24482h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    private final String f24483a;

    /* renamed from: b */
    private final C5940i0 f24484b;

    /* renamed from: c */
    private final C5918a0 f24485c = new C5918a0();

    /* renamed from: d */
    private C4217n f24486d;

    /* renamed from: e */
    private byte[] f24487e = new byte[1024];

    /* renamed from: f */
    private int f24488f;

    public C4389t(String str, C5940i0 i0Var) {
        this.f24483a = str;
        this.f24484b = i0Var;
    }

    /* renamed from: b */
    private C4200e0 m29208b(long j) {
        C4200e0 f = this.f24486d.mo6778f(0, 3);
        f.mo6845e(new C6272r1.C6274b().mo21517e0("text/vtt").mo21508V(this.f24483a).mo21521i0(j).mo21491E());
        this.f24486d.mo6782n();
        return f;
    }

    /* renamed from: f */
    private void m29209f() throws C6249m2 {
        C5918a0 a0Var = new C5918a0(this.f24487e);
        C5523i.m33576e(a0Var);
        long j = 0;
        long j2 = 0;
        for (String o = a0Var.mo20562o(); !TextUtils.isEmpty(o); o = a0Var.mo20562o()) {
            if (o.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f24481g.matcher(o);
                if (matcher.find()) {
                    Matcher matcher2 = f24482h.matcher(o);
                    if (matcher2.find()) {
                        j2 = C5523i.m33575d((String) C5917a.m34872e(matcher.group(1)));
                        j = C5940i0.m35024f(Long.parseLong((String) C5917a.m34872e(matcher2.group(1))));
                    } else {
                        throw C6249m2.m36661a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + o, (Throwable) null);
                    }
                } else {
                    throw C6249m2.m36661a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + o, (Throwable) null);
                }
            }
        }
        Matcher a = C5523i.m33572a(a0Var);
        if (a == null) {
            m29208b(0);
            return;
        }
        long d = C5523i.m33575d((String) C5917a.m34872e(a.group(1)));
        long b = this.f24484b.mo20622b(C5940i0.m35026j((j + d) - j2));
        C4200e0 b2 = m29208b(b - d);
        this.f24485c.mo20544M(this.f24487e, this.f24488f);
        b2.mo6843d(this.f24485c, this.f24488f);
        b2.mo6838a(b, 1, this.f24488f, 0, (C4200e0.C4201a) null);
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f24486d = nVar;
        nVar.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        int i;
        C5917a.m34872e(this.f24486d);
        int b = (int) mVar.mo17553b();
        int i2 = this.f24488f;
        byte[] bArr = this.f24487e;
        if (i2 == bArr.length) {
            if (b != -1) {
                i = b;
            } else {
                i = bArr.length;
            }
            this.f24487e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f24487e;
        int i3 = this.f24488f;
        int read = mVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.f24488f + read;
            this.f24488f = i4;
            if (b == -1 || i4 != b) {
                return 0;
            }
        }
        m29209f();
        return -1;
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        mVar.mo17556e(this.f24487e, 0, 6, false);
        this.f24485c.mo20544M(this.f24487e, 6);
        if (C5523i.m33573b(this.f24485c)) {
            return true;
        }
        mVar.mo17556e(this.f24487e, 6, 3, false);
        this.f24485c.mo20544M(this.f24487e, 9);
        return C5523i.m33573b(this.f24485c);
    }
}
