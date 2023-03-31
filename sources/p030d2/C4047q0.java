package p030d2;

import android.util.Pair;
import java.util.Map;

/* renamed from: d2.q0 */
/* compiled from: WidevineUtil */
public final class C4047q0 {
    /* renamed from: a */
    private static long m27850a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public static Pair<Long, Long> m27851b(C4042o oVar) {
        Map<String, String> e = oVar.mo17181e();
        if (e == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m27850a(e, "LicenseDurationRemaining")), Long.valueOf(m27850a(e, "PlaybackDurationRemaining")));
    }
}
