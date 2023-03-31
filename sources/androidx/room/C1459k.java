package androidx.room;

import java.io.File;
import p111p0.C5250c;

/* renamed from: androidx.room.k */
/* compiled from: SQLiteCopyOpenHelperFactory */
class C1459k implements C5250c.C5254c {

    /* renamed from: a */
    private final String f4178a;

    /* renamed from: b */
    private final File f4179b;

    /* renamed from: c */
    private final C5250c.C5254c f4180c;

    C1459k(String str, File file, C5250c.C5254c cVar) {
        this.f4178a = str;
        this.f4179b = file;
        this.f4180c = cVar;
    }

    /* renamed from: a */
    public C5250c mo5637a(C5250c.C5252b bVar) {
        return new C1458j(bVar.f27118a, this.f4178a, this.f4179b, bVar.f27120c.f27117a, this.f4180c.mo5637a(bVar));
    }
}
