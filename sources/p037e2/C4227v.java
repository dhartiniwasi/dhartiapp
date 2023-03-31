package p037e2;

import com.startapp.C8843b4;
import java.util.Collections;
import java.util.List;
import p127r2.C5432a;
import p148u2.C5709a;
import p161w3.C5953m0;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: e2.v */
/* compiled from: FlacStreamMetadata */
public final class C4227v {

    /* renamed from: a */
    public final int f23569a;

    /* renamed from: b */
    public final int f23570b;

    /* renamed from: c */
    public final int f23571c;

    /* renamed from: d */
    public final int f23572d;

    /* renamed from: e */
    public final int f23573e;

    /* renamed from: f */
    public final int f23574f;

    /* renamed from: g */
    public final int f23575g;

    /* renamed from: h */
    public final int f23576h;

    /* renamed from: i */
    public final int f23577i;

    /* renamed from: j */
    public final long f23578j;

    /* renamed from: k */
    public final C4228a f23579k;

    /* renamed from: l */
    private final C5432a f23580l;

    /* renamed from: e2.v$a */
    /* compiled from: FlacStreamMetadata */
    public static class C4228a {

        /* renamed from: a */
        public final long[] f23581a;

        /* renamed from: b */
        public final long[] f23582b;

        public C4228a(long[] jArr, long[] jArr2) {
            this.f23581a = jArr;
            this.f23582b = jArr2;
        }
    }

    public C4227v(byte[] bArr, int i) {
        C5980z zVar = new C5980z(bArr);
        zVar.mo20684p(i * 8);
        this.f23569a = zVar.mo20676h(16);
        this.f23570b = zVar.mo20676h(16);
        this.f23571c = zVar.mo20676h(24);
        this.f23572d = zVar.mo20676h(24);
        int h = zVar.mo20676h(20);
        this.f23573e = h;
        this.f23574f = m28515j(h);
        this.f23575g = zVar.mo20676h(3) + 1;
        int h2 = zVar.mo20676h(5) + 1;
        this.f23576h = h2;
        this.f23577i = m28514e(h2);
        this.f23578j = zVar.mo20678j(36);
        this.f23579k = null;
        this.f23580l = null;
    }

    /* renamed from: e */
    private static int m28514e(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    private static int m28515j(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public C4227v mo17584a(List<C5709a> list) {
        return new C4227v(this.f23569a, this.f23570b, this.f23571c, this.f23572d, this.f23573e, this.f23575g, this.f23576h, this.f23578j, this.f23579k, mo17590h(new C5432a((List<? extends C5432a.C5434b>) list)));
    }

    /* renamed from: b */
    public C4227v mo17585b(C4228a aVar) {
        return new C4227v(this.f23569a, this.f23570b, this.f23571c, this.f23572d, this.f23573e, this.f23575g, this.f23576h, this.f23578j, aVar, this.f23580l);
    }

    /* renamed from: c */
    public C4227v mo17586c(List<String> list) {
        return new C4227v(this.f23569a, this.f23570b, this.f23571c, this.f23572d, this.f23573e, this.f23575g, this.f23576h, this.f23578j, this.f23579k, mo17590h(C4205h0.m28426c(list)));
    }

    /* renamed from: d */
    public long mo17587d() {
        long j;
        long j2;
        int i = this.f23572d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f23571c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f23569a;
            j = ((((i2 != this.f23570b || i2 <= 0) ? 4096 : (long) i2) * ((long) this.f23575g)) * ((long) this.f23576h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: f */
    public long mo17588f() {
        long j = this.f23578j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f23573e);
    }

    /* renamed from: g */
    public C6272r1 mo17589g(byte[] bArr, C5432a aVar) {
        bArr[4] = C8843b4.f36445d;
        int i = this.f23572d;
        if (i <= 0) {
            i = -1;
        }
        return new C6272r1.C6274b().mo21517e0("audio/flac").mo21509W(i).mo21494H(this.f23575g).mo21518f0(this.f23573e).mo21506T(Collections.singletonList(bArr)).mo21510X(mo17590h(aVar)).mo21491E();
    }

    /* renamed from: h */
    public C5432a mo17590h(C5432a aVar) {
        C5432a aVar2 = this.f23580l;
        return aVar2 == null ? aVar : aVar2.mo19694b(aVar);
    }

    /* renamed from: i */
    public long mo17591i(long j) {
        return C5953m0.m35154r((j * ((long) this.f23573e)) / 1000000, 0, this.f23578j - 1);
    }

    private C4227v(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C4228a aVar, C5432a aVar2) {
        this.f23569a = i;
        this.f23570b = i2;
        this.f23571c = i3;
        this.f23572d = i4;
        this.f23573e = i5;
        this.f23574f = m28515j(i5);
        this.f23575g = i6;
        this.f23576h = i7;
        this.f23577i = m28514e(i7);
        this.f23578j = j;
        this.f23579k = aVar;
        this.f23580l = aVar2;
    }
}
