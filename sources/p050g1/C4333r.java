package p050g1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1450h;
import androidx.work.C1536b;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.List;
import p050g1.C4329p;
import p083l0.C4897a;
import p083l0.C4899c;
import p083l0.C4900d;
import p097n0.C5053b;
import p097n0.C5054c;
import p097n0.C5056e;
import p111p0.C5257f;
import p170y0.C6083b;
import p170y0.C6110s;

/* renamed from: g1.r */
/* compiled from: WorkSpecDao_Impl */
public final class C4333r implements C4332q {

    /* renamed from: a */
    private final C1450h f24235a;

    /* renamed from: b */
    private final C4897a<C4329p> f24236b;

    /* renamed from: c */
    private final C4900d f24237c;

    /* renamed from: d */
    private final C4900d f24238d;

    /* renamed from: e */
    private final C4900d f24239e;

    /* renamed from: f */
    private final C4900d f24240f;

    /* renamed from: g */
    private final C4900d f24241g;

    /* renamed from: h */
    private final C4900d f24242h;

    /* renamed from: i */
    private final C4900d f24243i;

    /* renamed from: j */
    private final C4900d f24244j;

    /* renamed from: g1.r$a */
    /* compiled from: WorkSpecDao_Impl */
    class C4334a extends C4897a<C4329p> {
        C4334a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4329p pVar) {
            String str = pVar.f24215a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            fVar.mo18716m0(2, (long) C4347v.m28959j(pVar.f24216b));
            String str2 = pVar.f24217c;
            if (str2 == null) {
                fVar.mo18710T0(3);
            } else {
                fVar.mo18708E(3, str2);
            }
            String str3 = pVar.f24218d;
            if (str3 == null) {
                fVar.mo18710T0(4);
            } else {
                fVar.mo18708E(4, str3);
            }
            byte[] n = C1536b.m7128n(pVar.f24219e);
            if (n == null) {
                fVar.mo18710T0(5);
            } else {
                fVar.mo18717s0(5, n);
            }
            byte[] n2 = C1536b.m7128n(pVar.f24220f);
            if (n2 == null) {
                fVar.mo18710T0(6);
            } else {
                fVar.mo18717s0(6, n2);
            }
            fVar.mo18716m0(7, pVar.f24221g);
            fVar.mo18716m0(8, pVar.f24222h);
            fVar.mo18716m0(9, pVar.f24223i);
            fVar.mo18716m0(10, (long) pVar.f24225k);
            fVar.mo18716m0(11, (long) C4347v.m28950a(pVar.f24226l));
            fVar.mo18716m0(12, pVar.f24227m);
            fVar.mo18716m0(13, pVar.f24228n);
            fVar.mo18716m0(14, pVar.f24229o);
            fVar.mo18716m0(15, pVar.f24230p);
            fVar.mo18716m0(16, pVar.f24231q ? 1 : 0);
            fVar.mo18716m0(17, (long) C4347v.m28958i(pVar.f24232r));
            C6083b bVar = pVar.f24224j;
            if (bVar != null) {
                fVar.mo18716m0(18, (long) C4347v.m28957h(bVar.mo20882b()));
                fVar.mo18716m0(19, bVar.mo20888g() ? 1 : 0);
                fVar.mo18716m0(20, bVar.mo20889h() ? 1 : 0);
                fVar.mo18716m0(21, bVar.mo20887f() ? 1 : 0);
                fVar.mo18716m0(22, bVar.mo20891i() ? 1 : 0);
                fVar.mo18716m0(23, bVar.mo20883c());
                fVar.mo18716m0(24, bVar.mo20884d());
                byte[] c = C4347v.m28952c(bVar.mo20881a());
                if (c == null) {
                    fVar.mo18710T0(25);
                } else {
                    fVar.mo18717s0(25, c);
                }
            } else {
                fVar.mo18710T0(18);
                fVar.mo18710T0(19);
                fVar.mo18710T0(20);
                fVar.mo18710T0(21);
                fVar.mo18710T0(22);
                fVar.mo18710T0(23);
                fVar.mo18710T0(24);
                fVar.mo18710T0(25);
            }
        }
    }

    /* renamed from: g1.r$b */
    /* compiled from: WorkSpecDao_Impl */
    class C4335b extends C4900d {
        C4335b(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: g1.r$c */
    /* compiled from: WorkSpecDao_Impl */
    class C4336c extends C4900d {
        C4336c(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: g1.r$d */
    /* compiled from: WorkSpecDao_Impl */
    class C4337d extends C4900d {
        C4337d(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: g1.r$e */
    /* compiled from: WorkSpecDao_Impl */
    class C4338e extends C4900d {
        C4338e(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: g1.r$f */
    /* compiled from: WorkSpecDao_Impl */
    class C4339f extends C4900d {
        C4339f(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: g1.r$g */
    /* compiled from: WorkSpecDao_Impl */
    class C4340g extends C4900d {
        C4340g(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: g1.r$h */
    /* compiled from: WorkSpecDao_Impl */
    class C4341h extends C4900d {
        C4341h(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: g1.r$i */
    /* compiled from: WorkSpecDao_Impl */
    class C4342i extends C4900d {
        C4342i(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C4333r(C1450h hVar) {
        this.f24235a = hVar;
        this.f24236b = new C4334a(hVar);
        this.f24237c = new C4335b(hVar);
        this.f24238d = new C4336c(hVar);
        this.f24239e = new C4337d(hVar);
        this.f24240f = new C4338e(hVar);
        this.f24241g = new C4339f(hVar);
        this.f24242h = new C4340g(hVar);
        this.f24243i = new C4341h(hVar);
        this.f24244j = new C4342i(hVar);
    }

    /* renamed from: a */
    public void mo17753a(String str) {
        this.f24235a.mo5591b();
        C5257f a = this.f24237c.mo18718a();
        if (str == null) {
            a.mo18710T0(1);
        } else {
            a.mo18708E(1, str);
        }
        this.f24235a.mo5592c();
        try {
            a.mo19248M();
            this.f24235a.mo5606r();
        } finally {
            this.f24235a.mo5596g();
            this.f24237c.mo18720f(a);
        }
    }

    /* renamed from: b */
    public int mo17754b(C6110s sVar, String... strArr) {
        this.f24235a.mo5591b();
        StringBuilder b = C5056e.m31778b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        C5056e.m31777a(b, strArr.length);
        b.append(")");
        C5257f d = this.f24235a.mo5593d(b.toString());
        d.mo18716m0(1, (long) C4347v.m28959j(sVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                d.mo18710T0(i);
            } else {
                d.mo18708E(i, str);
            }
            i++;
        }
        this.f24235a.mo5592c();
        try {
            int M = d.mo19248M();
            this.f24235a.mo5606r();
            return M;
        } finally {
            this.f24235a.mo5596g();
        }
    }

    /* renamed from: c */
    public int mo17755c(String str, long j) {
        this.f24235a.mo5591b();
        C5257f a = this.f24242h.mo18718a();
        a.mo18716m0(1, j);
        if (str == null) {
            a.mo18710T0(2);
        } else {
            a.mo18708E(2, str);
        }
        this.f24235a.mo5592c();
        try {
            int M = a.mo19248M();
            this.f24235a.mo5606r();
            return M;
        } finally {
            this.f24235a.mo5596g();
            this.f24242h.mo18720f(a);
        }
    }

    /* renamed from: d */
    public List<C4329p.C4331b> mo17756d(String str) {
        C4899c f = C4899c.m31103f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "id");
            int b3 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C4329p.C4331b bVar = new C4329p.C4331b();
                bVar.f24233a = b.getString(b2);
                bVar.f24234b = C4347v.m28956g(b.getInt(b3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: e */
    public List<C4329p> mo17757e(long j) {
        C4899c cVar;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        f.mo18716m0(1, j);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C6083b bVar = new C6083b();
                    int i4 = b2;
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar = new C4329p(string, string2);
                    pVar.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar.f24218d = b.getString(b13);
                    pVar.f24219e = C1536b.m7127g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f24220f = C1536b.m7127g(b.getBlob(i7));
                    int i8 = b16;
                    int i9 = i5;
                    i = i7;
                    pVar.f24221g = b.getLong(i8);
                    int i10 = b13;
                    int i11 = b17;
                    pVar.f24222h = b.getLong(i11);
                    int i12 = i8;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f24223i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f24225k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f24226l = C4347v.m28953d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f24227m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f24228n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f24229o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f24230p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f24231q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f24232r = C4347v.m28955f(b.getInt(i28));
                    pVar.f24224j = bVar;
                    arrayList.add(pVar);
                    b3 = i9;
                    b26 = i28;
                    b13 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo18715m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: f */
    public List<C4329p> mo17758f(int i) {
        C4899c cVar;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f.mo18716m0(1, (long) i);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                int i2 = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i3 = b10;
                    String string2 = b.getString(b12);
                    int i4 = b12;
                    C6083b bVar = new C6083b();
                    int i5 = b2;
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    int i6 = b3;
                    int i7 = b4;
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar = new C4329p(string, string2);
                    pVar.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar.f24218d = b.getString(b13);
                    pVar.f24219e = C1536b.m7127g(b.getBlob(b14));
                    int i8 = i2;
                    pVar.f24220f = C1536b.m7127g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = b16;
                    pVar.f24221g = b.getLong(i10);
                    int i11 = b13;
                    int i12 = b17;
                    pVar.f24222h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = b5;
                    int i15 = b18;
                    pVar.f24223i = b.getLong(i15);
                    int i16 = b19;
                    pVar.f24225k = b.getInt(i16);
                    int i17 = b20;
                    int i18 = i12;
                    pVar.f24226l = C4347v.m28953d(b.getInt(i17));
                    b18 = i15;
                    int i19 = i14;
                    int i20 = b21;
                    pVar.f24227m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = b22;
                    pVar.f24228n = b.getLong(i23);
                    int i24 = i20;
                    b22 = i23;
                    int i25 = b23;
                    pVar.f24229o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = b24;
                    pVar.f24230p = b.getLong(i27);
                    int i28 = b25;
                    pVar.f24231q = b.getInt(i28) != 0;
                    int i29 = b26;
                    int i30 = i27;
                    pVar.f24232r = C4347v.m28955f(b.getInt(i29));
                    pVar.f24224j = bVar;
                    arrayList.add(pVar);
                    b26 = i29;
                    b3 = i9;
                    b13 = i11;
                    b16 = i13;
                    b17 = i18;
                    b19 = i26;
                    b24 = i30;
                    b10 = i3;
                    b12 = i4;
                    b2 = i5;
                    b25 = i28;
                    b23 = i25;
                    b4 = i7;
                    int i31 = i22;
                    b21 = i24;
                    b5 = i19;
                    b20 = i31;
                }
                b.close();
                cVar.mo18715m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: g */
    public List<C4329p> mo17759g() {
        C4899c cVar;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C6083b bVar = new C6083b();
                    int i4 = b2;
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar = new C4329p(string, string2);
                    pVar.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar.f24218d = b.getString(b13);
                    pVar.f24219e = C1536b.m7127g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f24220f = C1536b.m7127g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = b16;
                    pVar.f24221g = b.getLong(i9);
                    int i10 = b14;
                    int i11 = b17;
                    pVar.f24222h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f24223i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f24225k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f24226l = C4347v.m28953d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f24227m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f24228n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f24229o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f24230p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f24231q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f24232r = C4347v.m28955f(b.getInt(i28));
                    pVar.f24224j = bVar;
                    arrayList.add(pVar);
                    b26 = i28;
                    b3 = i8;
                    b14 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo18715m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: h */
    public void mo17760h(String str, C1536b bVar) {
        this.f24235a.mo5591b();
        C5257f a = this.f24238d.mo18718a();
        byte[] n = C1536b.m7128n(bVar);
        if (n == null) {
            a.mo18710T0(1);
        } else {
            a.mo18717s0(1, n);
        }
        if (str == null) {
            a.mo18710T0(2);
        } else {
            a.mo18708E(2, str);
        }
        this.f24235a.mo5592c();
        try {
            a.mo19248M();
            this.f24235a.mo5606r();
        } finally {
            this.f24235a.mo5596g();
            this.f24238d.mo18720f(a);
        }
    }

    /* renamed from: i */
    public void mo17761i(C4329p pVar) {
        this.f24235a.mo5591b();
        this.f24235a.mo5592c();
        try {
            this.f24236b.mo18707h(pVar);
            this.f24235a.mo5606r();
        } finally {
            this.f24235a.mo5596g();
        }
    }

    /* renamed from: j */
    public List<C4329p> mo17762j() {
        C4899c cVar;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C6083b bVar = new C6083b();
                    int i4 = b2;
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar = new C4329p(string, string2);
                    pVar.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar.f24218d = b.getString(b13);
                    pVar.f24219e = C1536b.m7127g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f24220f = C1536b.m7127g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = b16;
                    pVar.f24221g = b.getLong(i9);
                    int i10 = b14;
                    int i11 = b17;
                    pVar.f24222h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f24223i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f24225k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f24226l = C4347v.m28953d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f24227m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f24228n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f24229o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f24230p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f24231q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f24232r = C4347v.m28955f(b.getInt(i28));
                    pVar.f24224j = bVar;
                    arrayList.add(pVar);
                    b26 = i28;
                    b3 = i8;
                    b14 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo18715m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: k */
    public boolean mo17763k() {
        boolean z = false;
        C4899c f = C4899c.m31103f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: l */
    public List<String> mo17764l(String str) {
        C4899c f = C4899c.m31103f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: m */
    public C6110s mo17765m(String str) {
        C4899c f = C4899c.m31103f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24235a.mo5591b();
        C6110s sVar = null;
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                sVar = C4347v.m28956g(b.getInt(0));
            }
            return sVar;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: n */
    public C4329p mo17766n(String str) {
        C4899c cVar;
        C4329p pVar;
        String str2 = str;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str2);
        }
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                if (b.moveToFirst()) {
                    String string = b.getString(b10);
                    String string2 = b.getString(b12);
                    int i = b26;
                    C6083b bVar = new C6083b();
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar2 = new C4329p(string, string2);
                    pVar2.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar2.f24218d = b.getString(b13);
                    pVar2.f24219e = C1536b.m7127g(b.getBlob(b14));
                    pVar2.f24220f = C1536b.m7127g(b.getBlob(b15));
                    pVar2.f24221g = b.getLong(b16);
                    pVar2.f24222h = b.getLong(b17);
                    pVar2.f24223i = b.getLong(b18);
                    pVar2.f24225k = b.getInt(b19);
                    pVar2.f24226l = C4347v.m28953d(b.getInt(b20));
                    pVar2.f24227m = b.getLong(b21);
                    pVar2.f24228n = b.getLong(b22);
                    pVar2.f24229o = b.getLong(b23);
                    pVar2.f24230p = b.getLong(b24);
                    pVar2.f24231q = b.getInt(b25) != 0;
                    pVar2.f24232r = C4347v.m28955f(b.getInt(i));
                    pVar2.f24224j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b.close();
                cVar.mo18715m();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: o */
    public int mo17767o(String str) {
        this.f24235a.mo5591b();
        C5257f a = this.f24241g.mo18718a();
        if (str == null) {
            a.mo18710T0(1);
        } else {
            a.mo18708E(1, str);
        }
        this.f24235a.mo5592c();
        try {
            int M = a.mo19248M();
            this.f24235a.mo5606r();
            return M;
        } finally {
            this.f24235a.mo5596g();
            this.f24241g.mo18720f(a);
        }
    }

    /* renamed from: p */
    public List<String> mo17768p(String str) {
        C4899c f = C4899c.m31103f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: q */
    public List<C1536b> mo17769q(String str) {
        C4899c f = C4899c.m31103f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(C1536b.m7127g(b.getBlob(0)));
            }
            return arrayList;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: r */
    public int mo17770r(String str) {
        this.f24235a.mo5591b();
        C5257f a = this.f24240f.mo18718a();
        if (str == null) {
            a.mo18710T0(1);
        } else {
            a.mo18708E(1, str);
        }
        this.f24235a.mo5592c();
        try {
            int M = a.mo19248M();
            this.f24235a.mo5606r();
            return M;
        } finally {
            this.f24235a.mo5596g();
            this.f24240f.mo18720f(a);
        }
    }

    /* renamed from: s */
    public void mo17771s(String str, long j) {
        this.f24235a.mo5591b();
        C5257f a = this.f24239e.mo18718a();
        a.mo18716m0(1, j);
        if (str == null) {
            a.mo18710T0(2);
        } else {
            a.mo18708E(2, str);
        }
        this.f24235a.mo5592c();
        try {
            a.mo19248M();
            this.f24235a.mo5606r();
        } finally {
            this.f24235a.mo5596g();
            this.f24239e.mo18720f(a);
        }
    }

    /* renamed from: t */
    public List<C4329p> mo17772t(int i) {
        C4899c cVar;
        C4899c f = C4899c.m31103f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        f.mo18716m0(1, (long) i);
        this.f24235a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24235a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "required_network_type");
            int b3 = C5053b.m31772b(b, "requires_charging");
            int b4 = C5053b.m31772b(b, "requires_device_idle");
            int b5 = C5053b.m31772b(b, "requires_battery_not_low");
            int b6 = C5053b.m31772b(b, "requires_storage_not_low");
            int b7 = C5053b.m31772b(b, "trigger_content_update_delay");
            int b8 = C5053b.m31772b(b, "trigger_max_content_delay");
            int b9 = C5053b.m31772b(b, "content_uri_triggers");
            int b10 = C5053b.m31772b(b, "id");
            int b11 = C5053b.m31772b(b, AdOperationMetric.INIT_STATE);
            int b12 = C5053b.m31772b(b, "worker_class_name");
            int b13 = C5053b.m31772b(b, "input_merger_class_name");
            int b14 = C5053b.m31772b(b, "input");
            int b15 = C5053b.m31772b(b, "output");
            cVar = f;
            try {
                int b16 = C5053b.m31772b(b, "initial_delay");
                int b17 = C5053b.m31772b(b, "interval_duration");
                int b18 = C5053b.m31772b(b, "flex_duration");
                int b19 = C5053b.m31772b(b, "run_attempt_count");
                int b20 = C5053b.m31772b(b, "backoff_policy");
                int b21 = C5053b.m31772b(b, "backoff_delay_duration");
                int b22 = C5053b.m31772b(b, "period_start_time");
                int b23 = C5053b.m31772b(b, "minimum_retention_duration");
                int b24 = C5053b.m31772b(b, "schedule_requested_at");
                int b25 = C5053b.m31772b(b, "run_in_foreground");
                int b26 = C5053b.m31772b(b, "out_of_quota_policy");
                int i2 = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i3 = b10;
                    String string2 = b.getString(b12);
                    int i4 = b12;
                    C6083b bVar = new C6083b();
                    int i5 = b2;
                    bVar.mo20893k(C4347v.m28954e(b.getInt(b2)));
                    bVar.mo20895m(b.getInt(b3) != 0);
                    bVar.mo20896n(b.getInt(b4) != 0);
                    bVar.mo20894l(b.getInt(b5) != 0);
                    bVar.mo20897o(b.getInt(b6) != 0);
                    int i6 = b3;
                    int i7 = b4;
                    bVar.mo20898p(b.getLong(b7));
                    bVar.mo20899q(b.getLong(b8));
                    bVar.mo20892j(C4347v.m28951b(b.getBlob(b9)));
                    C4329p pVar = new C4329p(string, string2);
                    pVar.f24216b = C4347v.m28956g(b.getInt(b11));
                    pVar.f24218d = b.getString(b13);
                    pVar.f24219e = C1536b.m7127g(b.getBlob(b14));
                    int i8 = i2;
                    pVar.f24220f = C1536b.m7127g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = b16;
                    pVar.f24221g = b.getLong(i10);
                    int i11 = b13;
                    int i12 = b17;
                    pVar.f24222h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = b5;
                    int i15 = b18;
                    pVar.f24223i = b.getLong(i15);
                    int i16 = b19;
                    pVar.f24225k = b.getInt(i16);
                    int i17 = b20;
                    int i18 = i12;
                    pVar.f24226l = C4347v.m28953d(b.getInt(i17));
                    b18 = i15;
                    int i19 = i14;
                    int i20 = b21;
                    pVar.f24227m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = b22;
                    pVar.f24228n = b.getLong(i23);
                    int i24 = i20;
                    b22 = i23;
                    int i25 = b23;
                    pVar.f24229o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = b24;
                    pVar.f24230p = b.getLong(i27);
                    int i28 = b25;
                    pVar.f24231q = b.getInt(i28) != 0;
                    int i29 = b26;
                    int i30 = i27;
                    pVar.f24232r = C4347v.m28955f(b.getInt(i29));
                    pVar.f24224j = bVar;
                    arrayList.add(pVar);
                    b26 = i29;
                    b3 = i9;
                    b13 = i11;
                    b16 = i13;
                    b17 = i18;
                    b19 = i26;
                    b24 = i30;
                    b10 = i3;
                    b12 = i4;
                    b2 = i5;
                    b25 = i28;
                    b23 = i25;
                    b4 = i7;
                    int i31 = i22;
                    b21 = i24;
                    b5 = i19;
                    b20 = i31;
                }
                b.close();
                cVar.mo18715m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo18715m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f;
            b.close();
            cVar.mo18715m();
            throw th;
        }
    }

    /* renamed from: u */
    public int mo17773u() {
        this.f24235a.mo5591b();
        C5257f a = this.f24243i.mo18718a();
        this.f24235a.mo5592c();
        try {
            int M = a.mo19248M();
            this.f24235a.mo5606r();
            return M;
        } finally {
            this.f24235a.mo5596g();
            this.f24243i.mo18720f(a);
        }
    }
}
