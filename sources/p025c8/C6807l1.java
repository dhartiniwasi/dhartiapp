package p025c8;

import android.database.Cursor;
import com.google.protobuf.C8135e0;
import p211d8.C9905w;
import p246h7.C10428q;
import p247h8.C10432b;
import p396x8.C12981a;
import p413z7.C13468e;
import p413z7.C13473j;

/* renamed from: c8.l1 */
/* compiled from: SQLiteBundleCache */
class C6807l1 implements C6773a {

    /* renamed from: a */
    private final C6831x2 f31386a;

    /* renamed from: b */
    private final C6810o f31387b;

    C6807l1(C6831x2 x2Var, C6810o oVar) {
        this.f31386a = x2Var;
        this.f31387b = oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ C13468e m39036g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C13468e(str, cursor.getInt(0), new C9905w(new C10428q(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C13473j m39037h(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new C13473j(str, this.f31387b.mo22861a(C12981a.m61184i0(cursor.getBlob(2))), new C9905w(new C10428q(cursor.getLong(0), cursor.getInt(1))));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("NamedQuery failed to parse: %s", e);
        }
    }

    /* renamed from: a */
    public void mo22713a(C13468e eVar) {
        this.f31386a.mo22914v("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.mo38564a(), Integer.valueOf(eVar.mo38566c()), Long.valueOf(eVar.mo38565b().mo32439b().mo33499c()), Integer.valueOf(eVar.mo38565b().mo32439b().mo33498b()), Integer.valueOf(eVar.mo38568e()), Long.valueOf(eVar.mo38567d()));
    }

    /* renamed from: b */
    public C13468e mo22714b(String str) {
        return (C13468e) this.f31386a.mo22912E("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").mo22929b(str).mo22931d(new C1912k1(str));
    }

    /* renamed from: c */
    public void mo22715c(C13473j jVar) {
        C12981a j = this.f31387b.mo22867j(jVar.mo38589a());
        this.f31386a.mo22914v("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.mo38590b(), Long.valueOf(jVar.mo38591c().mo32439b().mo33499c()), Integer.valueOf(jVar.mo38591c().mo32439b().mo33498b()), j.mo26773h());
    }

    /* renamed from: d */
    public C13473j mo22716d(String str) {
        return (C13473j) this.f31386a.mo22912E("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").mo22929b(str).mo22931d(new C1909j1(this, str));
    }
}
