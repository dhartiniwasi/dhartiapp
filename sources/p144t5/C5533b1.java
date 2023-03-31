package p144t5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t5.b1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5533b1 {

    /* renamed from: a */
    private final Context f28060a;

    /* renamed from: b */
    private final Map<String, SharedPreferences.Editor> f28061b = new HashMap();

    public C5533b1(Context context) {
        this.f28060a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final SharedPreferences.Editor m33588d(String str) {
        if (!this.f28061b.containsKey(str)) {
            this.f28061b.put(str, this.f28060a.getSharedPreferences(str, 0).edit());
        }
        return this.f28061b.get(str);
    }

    /* renamed from: b */
    public final void mo19835b() {
        for (SharedPreferences.Editor apply : this.f28061b.values()) {
            apply.apply();
        }
    }

    /* renamed from: c */
    public final boolean mo19836c(String str, Object obj) {
        C5529a1 a = C5541d1.m33599a(this.f28060a, str);
        if (a == null) {
            return false;
        }
        SharedPreferences.Editor d = m33588d(a.f28052a);
        if (obj instanceof Integer) {
            d.putInt(a.f28053b, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Long) {
            d.putLong(a.f28053b, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof Double) {
            d.putFloat(a.f28053b, ((Double) obj).floatValue());
            return true;
        } else if (obj instanceof Float) {
            d.putFloat(a.f28053b, ((Float) obj).floatValue());
            return true;
        } else if (obj instanceof Boolean) {
            d.putBoolean(a.f28053b, ((Boolean) obj).booleanValue());
            return true;
        } else if (!(obj instanceof String)) {
            return false;
        } else {
            d.putString(a.f28053b, (String) obj);
            return true;
        }
    }
}
