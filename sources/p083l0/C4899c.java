package p083l0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p111p0.C5255d;
import p111p0.C5256e;

/* renamed from: l0.c */
/* compiled from: RoomSQLiteQuery */
public class C4899c implements C5256e, C5255d {

    /* renamed from: i */
    static final TreeMap<Integer, C4899c> f25847i = new TreeMap<>();

    /* renamed from: a */
    private volatile String f25848a;

    /* renamed from: b */
    final long[] f25849b;

    /* renamed from: c */
    final double[] f25850c;

    /* renamed from: d */
    final String[] f25851d;

    /* renamed from: e */
    final byte[][] f25852e;

    /* renamed from: f */
    private final int[] f25853f;

    /* renamed from: g */
    final int f25854g;

    /* renamed from: h */
    int f25855h;

    private C4899c(int i) {
        this.f25854g = i;
        int i2 = i + 1;
        this.f25853f = new int[i2];
        this.f25849b = new long[i2];
        this.f25850c = new double[i2];
        this.f25851d = new String[i2];
        this.f25852e = new byte[i2][];
    }

    /* renamed from: f */
    public static C4899c m31103f(String str, int i) {
        TreeMap<Integer, C4899c> treeMap = f25847i;
        synchronized (treeMap) {
            Map.Entry<Integer, C4899c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C4899c value = ceilingEntry.getValue();
                value.mo18714g(str, i);
                return value;
            }
            C4899c cVar = new C4899c(i);
            cVar.mo18714g(str, i);
            return cVar;
        }
    }

    /* renamed from: h */
    private static void m31104h() {
        TreeMap<Integer, C4899c> treeMap = f25847i;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: E */
    public void mo18708E(int i, String str) {
        this.f25853f[i] = 4;
        this.f25851d[i] = str;
    }

    /* renamed from: T */
    public void mo18709T(int i, double d) {
        this.f25853f[i] = 3;
        this.f25850c[i] = d;
    }

    /* renamed from: T0 */
    public void mo18710T0(int i) {
        this.f25853f[i] = 1;
    }

    /* renamed from: a */
    public String mo18711a() {
        return this.f25848a;
    }

    /* renamed from: b */
    public void mo18712b(C5255d dVar) {
        for (int i = 1; i <= this.f25855h; i++) {
            int i2 = this.f25853f[i];
            if (i2 == 1) {
                dVar.mo18710T0(i);
            } else if (i2 == 2) {
                dVar.mo18716m0(i, this.f25849b[i]);
            } else if (i2 == 3) {
                dVar.mo18709T(i, this.f25850c[i]);
            } else if (i2 == 4) {
                dVar.mo18708E(i, this.f25851d[i]);
            } else if (i2 == 5) {
                dVar.mo18717s0(i, this.f25852e[i]);
            }
        }
    }

    public void close() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18714g(String str, int i) {
        this.f25848a = str;
        this.f25855h = i;
    }

    /* renamed from: m */
    public void mo18715m() {
        TreeMap<Integer, C4899c> treeMap = f25847i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f25854g), this);
            m31104h();
        }
    }

    /* renamed from: m0 */
    public void mo18716m0(int i, long j) {
        this.f25853f[i] = 2;
        this.f25849b[i] = j;
    }

    /* renamed from: s0 */
    public void mo18717s0(int i, byte[] bArr) {
        this.f25853f[i] = 5;
        this.f25852e[i] = bArr;
    }
}
