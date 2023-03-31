package p050g1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1450h;
import p083l0.C4897a;
import p083l0.C4899c;
import p097n0.C5054c;
import p111p0.C5257f;

/* renamed from: g1.f */
/* compiled from: PreferenceDao_Impl */
public final class C4312f implements C4311e {

    /* renamed from: a */
    private final C1450h f24189a;

    /* renamed from: b */
    private final C4897a<C4310d> f24190b;

    /* renamed from: g1.f$a */
    /* compiled from: PreferenceDao_Impl */
    class C4313a extends C4897a<C4310d> {
        C4313a(C1450h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo17721d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo17722g(C5257f fVar, C4310d dVar) {
            String str = dVar.f24187a;
            if (str == null) {
                fVar.mo18710T0(1);
            } else {
                fVar.mo18708E(1, str);
            }
            Long l = dVar.f24188b;
            if (l == null) {
                fVar.mo18710T0(2);
            } else {
                fVar.mo18716m0(2, l.longValue());
            }
        }
    }

    public C4312f(C1450h hVar) {
        this.f24189a = hVar;
        this.f24190b = new C4313a(hVar);
    }

    /* renamed from: a */
    public Long mo17726a(String str) {
        C4899c f = C4899c.m31103f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f.mo18710T0(1);
        } else {
            f.mo18708E(1, str);
        }
        this.f24189a.mo5591b();
        Long l = null;
        Cursor b = C5054c.m31774b(this.f24189a, f, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (!b.isNull(0)) {
                    l = Long.valueOf(b.getLong(0));
                }
            }
            return l;
        } finally {
            b.close();
            f.mo18715m();
        }
    }

    /* renamed from: b */
    public void mo17727b(C4310d dVar) {
        this.f24189a.mo5591b();
        this.f24189a.mo5592c();
        try {
            this.f24190b.mo18707h(dVar);
            this.f24189a.mo5606r();
        } finally {
            this.f24189a.mo5596g();
        }
    }
}
