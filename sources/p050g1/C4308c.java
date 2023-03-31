package p050g1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1450h;
import java.util.ArrayList;
import java.util.List;
import p083l0.C4897a;
import p083l0.C4899c;
import p097n0.C5054c;
import p111p0.C5257f;

/* renamed from: g1.c */
/* compiled from: DependencyDao_Impl */
public final class C4308c implements C4307b {

    /* renamed from: a */
    private final C1450h f24184a;

    /* renamed from: b */
    private final C4897a<C4306a> f24185b;

    /* renamed from: g1.c$a */
    /* compiled from: DependencyDao_Impl */
    class C4309a extends C4897a<C4306a> {
        C4309a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4306a aVar) {
            String str = aVar.f24182a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            String str2 = aVar.f24183b;
            if (str2 == null) {
                fVar.mo18710T0(2);
            } else {
                fVar.mo18708E(2, str2);
            }
        }
    }

    public C4308c(C1450h hVar) {
        this.f24184a = hVar;
        this.f24185b = new C4309a(hVar);
    }

    /* renamed from: a */
    public List<String> mo17717a(String str) {
        C4899c f = C4899c.m31103f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24184a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24184a, f, false, (CancellationSignal) null);
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
    public boolean mo17718b(String str) {
        boolean z = true;
        C4899c f = C4899c.m31103f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24184a.mo5591b();
        boolean z2 = false;
        Cursor b = C5054c.m31774b(this.f24184a, f, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: c */
    public boolean mo17719c(String str) {
        boolean z = true;
        C4899c f = C4899c.m31103f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24184a.mo5591b();
        boolean z2 = false;
        Cursor b = C5054c.m31774b(this.f24184a, f, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: d */
    public void mo17720d(C4306a aVar) {
        this.f24184a.mo5591b();
        this.f24184a.mo5592c();
        try {
            this.f24185b.mo18707h(aVar);
            this.f24184a.mo5606r();
        } finally {
            this.f24184a.mo5596g();
        }
    }
}
