package p402y5;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: y5.b */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C13020b {

    /* renamed from: b */
    public static final C13020b f47279b = new C13020b((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final EnumMap f47280a;

    public C13020b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(C13018a.class);
        this.f47280a = enumMap;
        enumMap.put(C13018a.AD_STORAGE, bool);
        enumMap.put(C13018a.ANALYTICS_STORAGE, bool2);
    }

    /* renamed from: a */
    public static C13020b m61313a(Bundle bundle) {
        if (bundle == null) {
            return f47279b;
        }
        EnumMap enumMap = new EnumMap(C13018a.class);
        for (C13018a aVar : C13018a.values()) {
            enumMap.put(aVar, m61318n(bundle.getString(aVar.f47278a)));
        }
        return new C13020b(enumMap);
    }

    /* renamed from: b */
    public static C13020b m61314b(String str) {
        EnumMap enumMap = new EnumMap(C13018a.class);
        if (str != null) {
            int i = 0;
            while (true) {
                C13018a[] aVarArr = C13018a.f47276d;
                int length = aVarArr.length;
                if (i >= 2) {
                    break;
                }
                C13018a aVar = aVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(aVar, bool);
                }
                i++;
            }
        }
        return new C13020b(enumMap);
    }

    /* renamed from: g */
    public static String m61315g(Bundle bundle) {
        String string;
        for (C13018a aVar : C13018a.values()) {
            if (bundle.containsKey(aVar.f47278a) && (string = bundle.getString(aVar.f47278a)) != null && m61318n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m61316j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    static final int m61317m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    private static Boolean m61318n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C13020b mo38067c(C13020b bVar) {
        EnumMap enumMap = new EnumMap(C13018a.class);
        for (C13018a aVar : C13018a.values()) {
            Boolean bool = (Boolean) this.f47280a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f47280a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(aVar, bool);
        }
        return new C13020b(enumMap);
    }

    /* renamed from: d */
    public final C13020b mo38068d(C13020b bVar) {
        EnumMap enumMap = new EnumMap(C13018a.class);
        for (C13018a aVar : C13018a.values()) {
            Boolean bool = (Boolean) this.f47280a.get(aVar);
            if (bool == null) {
                bool = (Boolean) bVar.f47280a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new C13020b(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo38069e() {
        return (Boolean) this.f47280a.get(C13018a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13020b)) {
            return false;
        }
        C13020b bVar = (C13020b) obj;
        for (C13018a aVar : C13018a.values()) {
            if (m61317m((Boolean) this.f47280a.get(aVar)) != m61317m((Boolean) bVar.f47280a.get(aVar))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo38071f() {
        return (Boolean) this.f47280a.get(C13018a.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo38072h() {
        char c;
        StringBuilder sb = new StringBuilder("G1");
        C13018a[] aVarArr = C13018a.f47276d;
        int length = aVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f47280a.get(aVarArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f47280a.values()) {
            i = (i * 31) + m61317m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo38074i(C13018a aVar) {
        Boolean bool = (Boolean) this.f47280a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo38075k(C13020b bVar) {
        return mo38076l(bVar, (C13018a[]) this.f47280a.keySet().toArray(new C13018a[0]));
    }

    /* renamed from: l */
    public final boolean mo38076l(C13020b bVar, C13018a... aVarArr) {
        for (C13018a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f47280a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f47280a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        C13018a[] values = C13018a.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C13018a aVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(aVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f47280a.get(aVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public C13020b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C13018a.class);
        this.f47280a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
