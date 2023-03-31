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

/* renamed from: g1.u */
/* compiled from: WorkTagDao_Impl */
public final class C4345u implements C4344t {

    /* renamed from: a */
    private final C1450h f24256a;

    /* renamed from: b */
    private final C4897a<C4343s> f24257b;

    /* renamed from: g1.u$a */
    /* compiled from: WorkTagDao_Impl */
    class C4346a extends C4897a<C4343s> {
        C4346a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4343s sVar) {
            String str = sVar.f24254a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            String str2 = sVar.f24255b;
            if (str2 == null) {
                fVar.mo18710T0(2);
            } else {
                fVar.mo18708E(2, str2);
            }
        }
    }

    public C4345u(C1450h hVar) {
        this.f24256a = hVar;
        this.f24257b = new C4346a(hVar);
    }

    /* renamed from: a */
    public List<String> mo17775a(String str) {
        C4899c f = C4899c.m31103f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24256a.mo5591b();
        Cursor b = C5054c.m31774b(this.f24256a, f, false, (CancellationSignal) null);
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
    public void mo17776b(C4343s sVar) {
        this.f24256a.mo5591b();
        this.f24256a.mo5592c();
        try {
            this.f24257b.mo18707h(sVar);
            this.f24256a.mo5606r();
        } finally {
            this.f24256a.mo5596g();
        }
    }
}
