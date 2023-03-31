package p050g1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1450h;
import java.util.ArrayList;
import java.util.List;
import p083l0.C4897a;
import p083l0.C4899c;
import p083l0.C4900d;
import p097n0.C5053b;
import p097n0.C5054c;
import p111p0.C5257f;

/* renamed from: g1.i */
/* compiled from: SystemIdInfoDao_Impl */
public final class C4316i implements C4315h {

    /* renamed from: a */
    private final C1450h f24194a;

    /* renamed from: b */
    private final C4897a<C4314g> f24195b;

    /* renamed from: c */
    private final C4900d f24196c;

    /* renamed from: g1.i$a */
    /* compiled from: SystemIdInfoDao_Impl */
    class C4317a extends C4897a<C4314g> {
        C4317a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4314g gVar) {
            String str = gVar.f24192a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            fVar.mo18716m0(2, (long) gVar.f24193b);
        }
    }

    /* renamed from: g1.i$b */
    /* compiled from: SystemIdInfoDao_Impl */
    class C4318b extends C4900d {
        C4318b(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C4316i(C1450h hVar) {
        this.f24194a = hVar;
        this.f24195b = new C4317a(hVar);
        this.f24196c = new C4318b(hVar);
    }

    /* renamed from: a */
    public List<String> mo17731a() {
        C4899c f = C4899c.m31103f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f24194a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24194a, f, false, (CancellationSignal) null);
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

    /* renamed from: b */
    public void mo17732b(C4314g gVar) {
        this.f24194a.mo5591b();
        this.f24194a.mo5592c();
        try {
            this.f24195b.mo18707h(gVar);
            this.f24194a.mo5606r();
        } finally {
            this.f24194a.mo5596g();
        }
    }

    /* renamed from: c */
    public C4314g mo17733c(String str) {
        C4899c f = C4899c.m31103f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24194a.mo5591b();
        C4314g gVar = null;
        Cursor b = C5054c.m31774b(this.f24194a, f, false, (CancellationSignal) null);
        try {
            int b2 = C5053b.m31772b(b, "work_spec_id");
            int b3 = C5053b.m31772b(b, "system_id");
            if (b.moveToFirst()) {
                gVar = new C4314g(b.getString(b2), b.getInt(b3));
            }
            return gVar;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: d */
    public void mo17734d(String str) {
        this.f24194a.mo5591b();
        C5257f a = this.f24196c.mo18718a();
        if (str == null) {
            a.mo18710T0(1);
        } else {
            a.mo18708E(1, str);
        }
        this.f24194a.mo5592c();
        try {
            a.mo19248M();
            this.f24194a.mo5606r();
        } finally {
            this.f24194a.mo5596g();
            this.f24196c.mo18720f(a);
        }
    }
}
