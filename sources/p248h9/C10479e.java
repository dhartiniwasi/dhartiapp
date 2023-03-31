package p248h9;

import java.util.List;

/* renamed from: h9.e */
/* compiled from: DecoderResult */
public final class C10479e {

    /* renamed from: a */
    private final byte[] f41500a;

    /* renamed from: b */
    private int f41501b;

    /* renamed from: c */
    private final String f41502c;

    /* renamed from: d */
    private final List<byte[]> f41503d;

    /* renamed from: e */
    private final String f41504e;

    /* renamed from: f */
    private Integer f41505f;

    /* renamed from: g */
    private Integer f41506g;

    /* renamed from: h */
    private Object f41507h;

    /* renamed from: i */
    private final int f41508i;

    /* renamed from: j */
    private final int f41509j;

    public C10479e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> mo33589a() {
        return this.f41503d;
    }

    /* renamed from: b */
    public String mo33590b() {
        return this.f41504e;
    }

    /* renamed from: c */
    public int mo33591c() {
        return this.f41501b;
    }

    /* renamed from: d */
    public Object mo33592d() {
        return this.f41507h;
    }

    /* renamed from: e */
    public byte[] mo33593e() {
        return this.f41500a;
    }

    /* renamed from: f */
    public int mo33594f() {
        return this.f41508i;
    }

    /* renamed from: g */
    public int mo33595g() {
        return this.f41509j;
    }

    /* renamed from: h */
    public String mo33596h() {
        return this.f41502c;
    }

    /* renamed from: i */
    public boolean mo33597i() {
        return this.f41508i >= 0 && this.f41509j >= 0;
    }

    /* renamed from: j */
    public void mo33598j(Integer num) {
        this.f41506g = num;
    }

    /* renamed from: k */
    public void mo33599k(Integer num) {
        this.f41505f = num;
    }

    /* renamed from: l */
    public void mo33600l(int i) {
        this.f41501b = i;
    }

    /* renamed from: m */
    public void mo33601m(Object obj) {
        this.f41507h = obj;
    }

    public C10479e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f41500a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f41501b = i3;
        this.f41502c = str;
        this.f41503d = list;
        this.f41504e = str2;
        this.f41508i = i2;
        this.f41509j = i;
    }
}
