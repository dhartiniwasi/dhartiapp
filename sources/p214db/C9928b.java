package p214db;

import p122q4.C5400b;

/* renamed from: db.b */
/* compiled from: QueryInfoMetadata */
public class C9928b {

    /* renamed from: a */
    private String f39839a;

    /* renamed from: b */
    private C5400b f39840b;

    /* renamed from: c */
    private String f39841c;

    public C9928b(String str) {
        this.f39839a = str;
    }

    /* renamed from: a */
    public String mo32486a() {
        return this.f39841c;
    }

    /* renamed from: b */
    public String mo32487b() {
        return this.f39839a;
    }

    /* renamed from: c */
    public C5400b mo32488c() {
        return this.f39840b;
    }

    /* renamed from: d */
    public String mo32489d() {
        C5400b bVar = this.f39840b;
        if (bVar != null) {
            return bVar.mo19524b();
        }
        return null;
    }

    /* renamed from: e */
    public void mo32490e(String str) {
        this.f39841c = str;
    }

    /* renamed from: f */
    public void mo32491f(C5400b bVar) {
        this.f39840b = bVar;
    }
}
