package p057h1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p050g1.C4310d;
import p111p0.C5249b;

/* renamed from: h1.e */
/* compiled from: PreferenceUtils */
public class C4420e {

    /* renamed from: a */
    private final WorkDatabase f24592a;

    public C4420e(WorkDatabase workDatabase) {
        this.f24592a = workDatabase;
    }

    /* renamed from: b */
    public static void m29372b(Context context, C5249b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            bVar.mo19240u();
            try {
                bVar.mo19238o0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                bVar.mo19238o0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                bVar.mo19237n0();
            } finally {
                bVar.mo19232D0();
            }
        }
    }

    /* renamed from: a */
    public boolean mo17949a() {
        Long a = this.f24592a.mo6321x().mo17726a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    /* renamed from: c */
    public void mo17950c(boolean z) {
        this.f24592a.mo6321x().mo17727b(new C4310d("reschedule_needed", z));
    }
}
