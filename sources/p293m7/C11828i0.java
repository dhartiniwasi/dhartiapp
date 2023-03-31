package p293m7;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: m7.i0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11828i0 {

    /* renamed from: a */
    private boolean f44510a;

    /* renamed from: b */
    private String f44511b;

    private C11828i0() {
    }

    /* renamed from: a */
    public static C11828i0 m57232a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map b = C11810c0.m57201b(str);
        try {
            C11828i0 i0Var = new C11828i0();
            Object obj = b.get("basicIntegrity");
            boolean z = false;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z = true;
            }
            i0Var.f44510a = z;
            String str2 = (String) b.get("advice");
            if (str2 == null) {
                str2 = "";
            }
            i0Var.f44511b = str2;
            return i0Var;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String mo36054b() {
        return this.f44511b;
    }

    /* renamed from: c */
    public final boolean mo36055c() {
        return this.f44510a;
    }
}
