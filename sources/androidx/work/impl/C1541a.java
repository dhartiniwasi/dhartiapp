package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import p057h1.C4418c;
import p057h1.C4420e;
import p090m0.C4961a;
import p111p0.C5249b;

/* renamed from: androidx.work.impl.a */
/* compiled from: WorkDatabaseMigrations */
public class C1541a {

    /* renamed from: a */
    public static C4961a f4436a = new C1542a(1, 2);

    /* renamed from: b */
    public static C4961a f4437b = new C1543b(3, 4);

    /* renamed from: c */
    public static C4961a f4438c = new C1544c(4, 5);

    /* renamed from: d */
    public static C4961a f4439d = new C1545d(6, 7);

    /* renamed from: e */
    public static C4961a f4440e = new C1546e(7, 8);

    /* renamed from: f */
    public static C4961a f4441f = new C1547f(8, 9);

    /* renamed from: g */
    public static C4961a f4442g = new C1548g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    /* compiled from: WorkDatabaseMigrations */
    class C1542a extends C4961a {
        C1542a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo19231C("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo19231C("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    /* compiled from: WorkDatabaseMigrations */
    class C1543b extends C4961a {
        C1543b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.mo19231C("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    /* compiled from: WorkDatabaseMigrations */
    class C1544c extends C4961a {
        C1544c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.mo19231C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    /* compiled from: WorkDatabaseMigrations */
    class C1545d extends C4961a {
        C1545d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    /* compiled from: WorkDatabaseMigrations */
    class C1546e extends C4961a {
        C1546e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    /* compiled from: WorkDatabaseMigrations */
    class C1547f extends C4961a {
        C1547f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    /* compiled from: WorkDatabaseMigrations */
    class C1548g extends C4961a {
        C1548g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1549h extends C4961a {

        /* renamed from: c */
        final Context f4443c;

        public C1549h(Context context, int i, int i2) {
            super(i, i2);
            this.f4443c = context;
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            if (this.f26040b >= 10) {
                bVar.mo19238o0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f4443c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    /* compiled from: WorkDatabaseMigrations */
    public static class C1550i extends C4961a {

        /* renamed from: c */
        final Context f4444c;

        public C1550i(Context context) {
            super(9, 10);
            this.f4444c = context;
        }

        /* renamed from: a */
        public void mo6324a(C5249b bVar) {
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C4420e.m29372b(this.f4444c, bVar);
            C4418c.m29366a(this.f4444c, bVar);
        }
    }
}
