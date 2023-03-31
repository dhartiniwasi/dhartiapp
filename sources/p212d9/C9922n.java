package p212d9;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: d9.n */
/* compiled from: Result */
public final class C9922n {

    /* renamed from: a */
    private final String f39812a;

    /* renamed from: b */
    private final byte[] f39813b;

    /* renamed from: c */
    private final int f39814c;

    /* renamed from: d */
    private C9924p[] f39815d;

    /* renamed from: e */
    private final C9909a f39816e;

    /* renamed from: f */
    private Map<C9923o, Object> f39817f;

    /* renamed from: g */
    private final long f39818g;

    public C9922n(String str, byte[] bArr, C9924p[] pVarArr, C9909a aVar) {
        this(str, bArr, pVarArr, aVar, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo32471a(C9924p[] pVarArr) {
        C9924p[] pVarArr2 = this.f39815d;
        if (pVarArr2 == null) {
            this.f39815d = pVarArr;
        } else if (pVarArr != null && pVarArr.length > 0) {
            C9924p[] pVarArr3 = new C9924p[(pVarArr2.length + pVarArr.length)];
            System.arraycopy(pVarArr2, 0, pVarArr3, 0, pVarArr2.length);
            System.arraycopy(pVarArr, 0, pVarArr3, pVarArr2.length, pVarArr.length);
            this.f39815d = pVarArr3;
        }
    }

    /* renamed from: b */
    public C9909a mo32472b() {
        return this.f39816e;
    }

    /* renamed from: c */
    public byte[] mo32473c() {
        return this.f39813b;
    }

    /* renamed from: d */
    public Map<C9923o, Object> mo32474d() {
        return this.f39817f;
    }

    /* renamed from: e */
    public C9924p[] mo32475e() {
        return this.f39815d;
    }

    /* renamed from: f */
    public String mo32476f() {
        return this.f39812a;
    }

    /* renamed from: g */
    public void mo32477g(Map<C9923o, Object> map) {
        if (map != null) {
            Map<C9923o, Object> map2 = this.f39817f;
            if (map2 == null) {
                this.f39817f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo32478h(C9923o oVar, Object obj) {
        if (this.f39817f == null) {
            this.f39817f = new EnumMap(C9923o.class);
        }
        this.f39817f.put(oVar, obj);
    }

    public String toString() {
        return this.f39812a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9922n(String str, byte[] bArr, C9924p[] pVarArr, C9909a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pVarArr, aVar, j);
    }

    public C9922n(String str, byte[] bArr, int i, C9924p[] pVarArr, C9909a aVar, long j) {
        this.f39812a = str;
        this.f39813b = bArr;
        this.f39814c = i;
        this.f39815d = pVarArr;
        this.f39816e = aVar;
        this.f39817f = null;
        this.f39818g = j;
    }
}
