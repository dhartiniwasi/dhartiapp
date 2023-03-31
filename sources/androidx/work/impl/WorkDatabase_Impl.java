package androidx.work.impl;

import androidx.room.C1428a;
import androidx.room.C1436e;
import androidx.room.C1450h;
import androidx.room.C1455i;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p050g1.C4307b;
import p050g1.C4308c;
import p050g1.C4311e;
import p050g1.C4312f;
import p050g1.C4315h;
import p050g1.C4316i;
import p050g1.C4320k;
import p050g1.C4321l;
import p050g1.C4324n;
import p050g1.C4325o;
import p050g1.C4332q;
import p050g1.C4333r;
import p050g1.C4344t;
import p050g1.C4345u;
import p097n0.C5054c;
import p097n0.C5057f;
import p111p0.C5249b;
import p111p0.C5250c;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m */
    private volatile C4332q f4428m;

    /* renamed from: n */
    private volatile C4307b f4429n;

    /* renamed from: o */
    private volatile C4344t f4430o;

    /* renamed from: p */
    private volatile C4315h f4431p;

    /* renamed from: q */
    private volatile C4320k f4432q;

    /* renamed from: r */
    private volatile C4324n f4433r;

    /* renamed from: s */
    private volatile C4311e f4434s;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1540a extends C1455i.C1456a {
        C1540a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo5625a(C5249b bVar) {
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.mo19231C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.mo19231C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public void mo5626b(C5249b bVar) {
            bVar.mo19231C("DROP TABLE IF EXISTS `Dependency`");
            bVar.mo19231C("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.mo19231C("DROP TABLE IF EXISTS `WorkTag`");
            bVar.mo19231C("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.mo19231C("DROP TABLE IF EXISTS `WorkName`");
            bVar.mo19231C("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.mo19231C("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f4138h != null) {
                int size = WorkDatabase_Impl.this.f4138h.size();
                for (int i = 0; i < size; i++) {
                    ((C1450h.C1452b) WorkDatabase_Impl.this.f4138h.get(i)).mo5615b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo5627c(C5249b bVar) {
            if (WorkDatabase_Impl.this.f4138h != null) {
                int size = WorkDatabase_Impl.this.f4138h.size();
                for (int i = 0; i < size; i++) {
                    ((C1450h.C1452b) WorkDatabase_Impl.this.f4138h.get(i)).mo5614a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo5628d(C5249b bVar) {
            C5249b unused = WorkDatabase_Impl.this.f4131a = bVar;
            bVar.mo19231C("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo5602m(bVar);
            if (WorkDatabase_Impl.this.f4138h != null) {
                int size = WorkDatabase_Impl.this.f4138h.size();
                for (int i = 0; i < size; i++) {
                    ((C1450h.C1452b) WorkDatabase_Impl.this.f4138h.get(i)).mo5616c(bVar);
                }
            }
        }

        /* renamed from: e */
        public void mo5629e(C5249b bVar) {
        }

        /* renamed from: f */
        public void mo5630f(C5249b bVar) {
            C5054c.m31773a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1455i.C1457b mo5631g(C5249b bVar) {
            C5249b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C5057f.C5058a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C5057f.C5058a("prerequisite_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C5057f.C5061d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C5057f.C5061d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C5057f fVar = new C5057f("Dependency", hashMap, hashSet, hashSet2);
            C5057f a = C5057f.m31779a(bVar2, "Dependency");
            if (!fVar.equals(a)) {
                return new C1455i.C1457b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C5057f.C5058a("id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap2.put(AdOperationMetric.INIT_STATE, new C5057f.C5058a(AdOperationMetric.INIT_STATE, "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C5057f.C5058a("worker_class_name", AdPreferences.TYPE_TEXT, true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C5057f.C5058a("input_merger_class_name", AdPreferences.TYPE_TEXT, false, 0, (String) null, 1));
            hashMap2.put("input", new C5057f.C5058a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C5057f.C5058a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C5057f.C5058a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C5057f.C5058a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C5057f.C5058a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C5057f.C5058a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C5057f.C5058a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C5057f.C5058a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new C5057f.C5058a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C5057f.C5058a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C5057f.C5058a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C5057f.C5058a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C5057f.C5058a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new C5057f.C5058a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C5057f.C5058a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C5057f.C5058a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C5057f.C5058a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C5057f.C5058a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C5057f.C5058a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C5057f.C5058a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C5057f.C5058a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C5057f.C5061d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new C5057f.C5061d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            C5057f fVar2 = new C5057f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C5057f a2 = C5057f.m31779a(bVar2, "WorkSpec");
            if (!fVar2.equals(a2)) {
                return new C1455i.C1457b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C5057f.C5058a("tag", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C5057f.C5058a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C5057f.C5061d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C5057f fVar3 = new C5057f("WorkTag", hashMap3, hashSet5, hashSet6);
            C5057f a3 = C5057f.m31779a(bVar2, "WorkTag");
            if (!fVar3.equals(a3)) {
                return new C1455i.C1457b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C5057f.C5058a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap4.put("system_id", new C5057f.C5058a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C5057f fVar4 = new C5057f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C5057f a4 = C5057f.m31779a(bVar2, "SystemIdInfo");
            if (!fVar4.equals(a4)) {
                return new C1455i.C1457b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(MediationMetaData.KEY_NAME, new C5057f.C5058a(MediationMetaData.KEY_NAME, AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C5057f.C5058a("work_spec_id", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C5057f.C5061d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C5057f fVar5 = new C5057f("WorkName", hashMap5, hashSet8, hashSet9);
            C5057f a5 = C5057f.m31779a(bVar2, "WorkName");
            if (!fVar5.equals(a5)) {
                return new C1455i.C1457b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C5057f.C5058a("work_spec_id", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap6.put("progress", new C5057f.C5058a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C5057f.C5059b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C5057f fVar6 = new C5057f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C5057f a6 = C5057f.m31779a(bVar2, "WorkProgress");
            if (!fVar6.equals(a6)) {
                return new C1455i.C1457b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C5057f.C5058a("key", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
            hashMap7.put("long_value", new C5057f.C5058a("long_value", "INTEGER", false, 0, (String) null, 1));
            C5057f fVar7 = new C5057f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C5057f a7 = C5057f.m31779a(bVar2, "Preference");
            if (fVar7.equals(a7)) {
                return new C1455i.C1457b(true, (String) null);
            }
            return new C1455i.C1457b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: A */
    public C4324n mo6317A() {
        C4324n nVar;
        if (this.f4433r != null) {
            return this.f4433r;
        }
        synchronized (this) {
            if (this.f4433r == null) {
                this.f4433r = new C4325o(this);
            }
            nVar = this.f4433r;
        }
        return nVar;
    }

    /* renamed from: B */
    public C4332q mo6318B() {
        C4332q qVar;
        if (this.f4428m != null) {
            return this.f4428m;
        }
        synchronized (this) {
            if (this.f4428m == null) {
                this.f4428m = new C4333r(this);
            }
            qVar = this.f4428m;
        }
        return qVar;
    }

    /* renamed from: C */
    public C4344t mo6319C() {
        C4344t tVar;
        if (this.f4430o != null) {
            return this.f4430o;
        }
        synchronized (this) {
            if (this.f4430o == null) {
                this.f4430o = new C4345u(this);
            }
            tVar = this.f4430o;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1436e mo5594e() {
        return new C1436e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C5250c mo5595f(C1428a aVar) {
        return aVar.f4067a.mo5637a(C5250c.C5252b.m32458a(aVar.f4068b).mo19245c(aVar.f4069c).mo19244b(new C1455i(aVar, new C1540a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).mo19243a());
    }

    /* renamed from: t */
    public C4307b mo6320t() {
        C4307b bVar;
        if (this.f4429n != null) {
            return this.f4429n;
        }
        synchronized (this) {
            if (this.f4429n == null) {
                this.f4429n = new C4308c(this);
            }
            bVar = this.f4429n;
        }
        return bVar;
    }

    /* renamed from: x */
    public C4311e mo6321x() {
        C4311e eVar;
        if (this.f4434s != null) {
            return this.f4434s;
        }
        synchronized (this) {
            if (this.f4434s == null) {
                this.f4434s = new C4312f(this);
            }
            eVar = this.f4434s;
        }
        return eVar;
    }

    /* renamed from: y */
    public C4315h mo6322y() {
        C4315h hVar;
        if (this.f4431p != null) {
            return this.f4431p;
        }
        synchronized (this) {
            if (this.f4431p == null) {
                this.f4431p = new C4316i(this);
            }
            hVar = this.f4431p;
        }
        return hVar;
    }

    /* renamed from: z */
    public C4320k mo6323z() {
        C4320k kVar;
        if (this.f4432q != null) {
            return this.f4432q;
        }
        synchronized (this) {
            if (this.f4432q == null) {
                this.f4432q = new C4321l(this);
            }
            kVar = this.f4432q;
        }
        return kVar;
    }
}
