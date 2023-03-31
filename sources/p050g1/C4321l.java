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

/* renamed from: g1.l */
/* compiled from: WorkNameDao_Impl */
public final class C4321l implements C4320k {

    /* renamed from: a */
    private final C1450h f24201a;

    /* renamed from: b */
    private final C4897a<C4319j> f24202b;

    /* renamed from: g1.l$a */
    /* compiled from: WorkNameDao_Impl */
    class C4322a extends C4897a<C4319j> {
        C4322a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4319j jVar) {
            String str = jVar.f24199a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            String str2 = jVar.f24200b;
            if (str2 == null) {
                fVar.mo18710T0(2);
            } else {
                fVar.mo18708E(2, str2);
            }
        }
    }

    public C4321l(C1450h hVar) {
        this.f24201a = hVar;
        this.f24202b = new C4322a(hVar);
    }

    /* renamed from: a */
    public void mo17736a(C4319j jVar) {
        this.f24201a.mo5591b();
        this.f24201a.mo5592c();
        try {
            this.f24202b.mo18707h(jVar);
            this.f24201a.mo5606r();
        } finally {
            this.f24201a.mo5596g();
        }
    }

    /* renamed from: b */
    public List<String> mo17737b(String str) {
        C4899c f = C4899c.m31103f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24201a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24201a, f, false, (CancellationSignal) null);
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
}
