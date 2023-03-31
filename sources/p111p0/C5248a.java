package p111p0;

/* renamed from: p0.a */
/* compiled from: SimpleSQLiteQuery */
public final class C5248a implements C5256e {

    /* renamed from: a */
    private final String f27115a;

    /* renamed from: b */
    private final Object[] f27116b;

    public C5248a(String str, Object[] objArr) {
        this.f27115a = str;
        this.f27116b = objArr;
    }

    /* renamed from: c */
    private static void m32434c(C5255d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.mo18710T0(i);
        } else if (obj instanceof byte[]) {
            dVar.mo18717s0(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo18709T(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo18709T(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo18716m0(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo18716m0(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo18716m0(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo18716m0(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo18708E(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.mo18716m0(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    /* renamed from: d */
    public static void m32435d(C5255d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m32434c(dVar, i, obj);
            }
        }
    }

    /* renamed from: a */
    public String mo18711a() {
        return this.f27115a;
    }

    /* renamed from: b */
    public void mo18712b(C5255d dVar) {
        m32435d(dVar, this.f27116b);
    }

    public C5248a(String str) {
        this(str, (Object[]) null);
    }
}
