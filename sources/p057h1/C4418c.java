package p057h1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p050g1.C4310d;
import p111p0.C5249b;

/* renamed from: h1.c */
/* compiled from: IdGenerator */
public class C4418c {

    /* renamed from: a */
    private final WorkDatabase f24590a;

    public C4418c(WorkDatabase workDatabase) {
        this.f24590a = workDatabase;
    }

    /* renamed from: a */
    public static void m29366a(Context context, C5249b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.mo19240u();
            try {
                bVar.mo19238o0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                bVar.mo19238o0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                bVar.mo19237n0();
            } finally {
                bVar.mo19232D0();
            }
        }
    }

    /* renamed from: c */
    private int m29367c(String str) {
        this.f24590a.mo5592c();
        try {
            Long a = this.f24590a.mo6321x().mo17726a(str);
            int i = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m29368e(str, i);
            this.f24590a.mo5606r();
            return intValue;
        } finally {
            this.f24590a.mo5596g();
        }
    }

    /* renamed from: e */
    private void m29368e(String str, int i) {
        this.f24590a.mo6321x().mo17727b(new C4310d(str, (long) i));
    }

    /* renamed from: b */
    public int mo17947b() {
        int c;
        synchronized (C4418c.class) {
            c = m29367c("next_alarm_manager_id");
        }
        return c;
    }

    /* renamed from: d */
    public int mo17948d(int i, int i2) {
        synchronized (C4418c.class) {
            int c = m29367c("next_job_scheduler_id");
            if (c >= i) {
                if (c <= i2) {
                    i = c;
                }
            }
            m29368e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
