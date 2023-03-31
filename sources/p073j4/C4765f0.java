package p073j4;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j4.f0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4765f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List f25425a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List f25426b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List f25427c = new ArrayList();

    /* renamed from: a */
    public final C4765f0 mo18453a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f25425a.size()) {
            double doubleValue = ((Double) this.f25427c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f25426b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f25425a.add(i, str);
        this.f25427c.add(i, Double.valueOf(d));
        this.f25426b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: b */
    public final C4773h0 mo18454b() {
        return new C4773h0(this, (C4769g0) null);
    }
}
