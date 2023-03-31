package p025c8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.protobuf.C8135e0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import p025c8.C6823t0;
import p025c8.C6831x2;
import p211d8.C9903u;
import p229f8.C10151c;
import p247h8.C10432b;
import p247h8.C10468v;

/* renamed from: c8.w3 */
/* compiled from: SQLiteSchema */
class C6829w3 {

    /* renamed from: a */
    private final SQLiteDatabase f31451a;

    /* renamed from: b */
    private final C6810o f31452b;

    C6829w3(SQLiteDatabase sQLiteDatabase, C6810o oVar) {
        this.f31451a = sQLiteDatabase;
        this.f31452b = oVar;
    }

    /* renamed from: A */
    private void m39242A() {
        m39254N(new String[]{"document_overlays"}, new C1904h3(this));
    }

    /* renamed from: B */
    private void m39243B() {
        m39254N(new String[]{"mutation_queues", "mutations", "document_mutations"}, new C1921m3(this));
    }

    /* renamed from: C */
    private void m39244C() {
        m39254N(new String[]{"remote_documents"}, new C1896f3(this));
    }

    /* renamed from: D */
    private void m39245D() {
        m39254N(new String[]{"targets", "target_globals", "target_documents"}, new C1900g3(this));
    }

    /* renamed from: E */
    private void m39246E() {
        m39254N(new String[]{"collection_parents"}, new C1907i3(this));
        C1894e3 e3Var = new C1894e3(new C6823t0.C6824a(), this.f31451a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        new C6831x2.C6835d(this.f31451a, "SELECT path FROM remote_documents").mo22932e(new C1940r3(e3Var));
        new C6831x2.C6835d(this.f31451a, "SELECT path FROM document_mutations").mo22932e(new C1943s3(e3Var));
    }

    /* renamed from: F */
    private void m39247F() {
        new C6831x2.C6835d(this.f31451a, "SELECT target_id, target_proto FROM targets").mo22932e(new C1925n3(this));
    }

    /* renamed from: G */
    private void m39248G() {
        if (m39290m0("targets")) {
            this.f31451a.execSQL("DROP TABLE targets");
        }
        if (m39290m0("target_globals")) {
            this.f31451a.execSQL("DROP TABLE target_globals");
        }
        if (m39290m0("target_documents")) {
            this.f31451a.execSQL("DROP TABLE target_documents");
        }
    }

    /* renamed from: H */
    private void m39249H() {
        C6831x2.C6835d b = new C6831x2.C6835d(this.f31451a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").mo22929b(100);
        SQLiteStatement compileStatement = this.f31451a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b.mo22932e(new C1947t3(zArr, compileStatement));
        } while (zArr[0]);
    }

    /* renamed from: I */
    private void m39250I() {
        this.f31451a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    /* renamed from: J */
    private void m39251J() {
        Long l = (Long) new C6831x2.C6835d(this.f31451a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").mo22931d(C1954v3.f5634a);
        C10432b.m52648d(l != null, "Missing highest sequence number", new Object[0]);
        long longValue = l.longValue();
        SQLiteStatement compileStatement = this.f31451a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        C6831x2.C6835d b = new C6831x2.C6835d(this.f31451a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").mo22929b(100);
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b.mo22932e(new C1950u3(zArr, compileStatement, longValue));
        } while (zArr[0]);
    }

    /* renamed from: K */
    private void m39252K() {
        if (!(DatabaseUtils.queryNumEntries(this.f31451a, "target_globals") == 1)) {
            this.f31451a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
        }
    }

    /* renamed from: M */
    private boolean m39253M() {
        boolean l0 = m39288l0("remote_documents", "read_time_seconds");
        boolean l02 = m39288l0("remote_documents", "read_time_nanos");
        C10432b.m52648d(l0 == l02, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        if (!l0 || !l02) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private void m39254N(String[] strArr, Runnable runnable) {
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            boolean m0 = m39290m0(str3);
            if (i == 0) {
                z = m0;
            } else if (m0 != z) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z) {
                    str = str4 + strArr[0] + " exists and " + str3 + " does not";
                } else {
                    str = str4 + strArr[0] + " does not exist and " + str3 + " does";
                }
                throw new IllegalStateException(str);
            }
        }
        if (!z) {
            runnable.run();
            return;
        }
        C10468v.m52767a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m39255O() {
        this.f31451a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f31451a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m39256P() {
        this.f31451a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m39257Q() {
        this.f31451a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f31451a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f31451a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f31451a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m39258R() {
        this.f31451a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f31451a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f31451a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m39259S() {
        this.f31451a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f31451a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f31451a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m39260T() {
        this.f31451a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m39261U() {
        this.f31451a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f31451a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f31451a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f31451a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f31451a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m39262V(C6823t0.C6824a aVar, SQLiteStatement sQLiteStatement, C9903u uVar) {
        if (aVar.mo22898a(uVar)) {
            String n = uVar.mo32354n();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, n);
            sQLiteStatement.bindString(2, C6789f.m38862c((C9903u) uVar.mo32360t()));
            sQLiteStatement.execute();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m39265Y() {
        this.f31451a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m39266Z(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            this.f31451a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((C10151c) ((C10151c.C10153b) C10151c.m51520t0(cursor.getBlob(1)).mo27317b()).mo32815D().build()).mo26773h(), Integer.valueOf(i)});
        } catch (C8135e0 unused) {
            throw C10432b.m52645a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m39268a0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        boolean z = true;
        zArr[0] = true;
        String string = cursor.getString(0);
        C9903u b = C6789f.m38861b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, (long) b.mo32358r());
        sQLiteStatement.bindString(2, string);
        if (sQLiteStatement.executeUpdateDelete() == -1) {
            z = false;
        }
        C10432b.m52648d(z, "Failed to update document path", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public static /* synthetic */ void m39272c0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j, Cursor cursor) {
        boolean z = true;
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j);
        if (sQLiteStatement.executeInsert() == -1) {
            z = false;
        }
        C10432b.m52648d(z, "Failed to insert a sentinel row", new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m39274d0(String str, Cursor cursor) {
        m39282h0(str, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m39276e0(Cursor cursor) {
        String string = cursor.getString(0);
        long j = cursor.getLong(1);
        new C6831x2.C6835d(this.f31451a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").mo22929b(string, Long.valueOf(j)).mo22932e(new C1936q3(this, string));
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m39278f0(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            String c = this.f31452b.mo22866h(C10151c.m51520t0(cursor.getBlob(1))).mo22806f().mo21933c();
            this.f31451a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{c, Integer.valueOf(i)});
        } catch (C8135e0 unused) {
            throw C10432b.m52645a("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* renamed from: g0 */
    private void m39280g0() {
        new C6831x2.C6835d(this.f31451a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").mo22932e(new C1933p3(this));
    }

    /* renamed from: h0 */
    private void m39282h0(String str, int i) {
        SQLiteStatement compileStatement = this.f31451a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, (long) i);
        C10432b.m52648d(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i));
        this.f31451a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: i0 */
    private void m39284i0() {
        new C6831x2.C6835d(this.f31451a, "SELECT target_id, target_proto FROM targets").mo22932e(new C1928o3(this));
    }

    /* renamed from: l0 */
    private boolean m39288l0(String str, String str2) {
        return mo22907L(str).indexOf(str2) != -1;
    }

    /* renamed from: m0 */
    private boolean m39290m0(String str) {
        return !new C6831x2.C6835d(this.f31451a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").mo22929b(str).mo22933f();
    }

    /* renamed from: s */
    private void m39296s() {
        if (!m39288l0("remote_documents", "path_length")) {
            this.f31451a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
        }
    }

    /* renamed from: t */
    private void m39297t(String str) {
        this.f31451a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    /* renamed from: u */
    private void m39298u() {
        this.f31451a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f31451a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    /* renamed from: v */
    private void m39299v() {
        if (!m39288l0("target_documents", "sequence_number")) {
            this.f31451a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
    }

    /* renamed from: w */
    private void m39300w() {
        if (!m39288l0("target_globals", "target_count")) {
            this.f31451a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f31451a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f31451a.update("target_globals", contentValues, (String) null, (String[]) null);
    }

    /* renamed from: x */
    private void m39301x() {
        m39254N(new String[]{"bundles", "named_queries"}, new C1914k3(this));
    }

    /* renamed from: y */
    private void m39302y() {
        m39254N(new String[]{"data_migrations"}, new C1911j3(this));
    }

    /* renamed from: z */
    private void m39303z() {
        m39254N(new String[]{"index_configuration", "index_state", "index_entries"}, new C1917l3(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public List<String> mo22907L(String str) {
        ArrayList arrayList = new ArrayList();
        ? r1 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f31451a;
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", r1);
            int columnIndex = rawQuery.getColumnIndex(MediationMetaData.KEY_NAME);
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(columnIndex));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo22908j0(int i) {
        mo22909k0(i, 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo22909k0(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i < 1 && i2 >= 1) {
            m39243B();
            m39245D();
            m39244C();
        }
        if (i < 3 && i2 >= 3 && i != 0) {
            m39248G();
            m39245D();
        }
        if (i < 4 && i2 >= 4) {
            m39252K();
            m39300w();
        }
        if (i < 5 && i2 >= 5) {
            m39299v();
        }
        if (i < 6 && i2 >= 6) {
            m39280g0();
        }
        if (i < 7 && i2 >= 7) {
            m39251J();
        }
        if (i < 8 && i2 >= 8) {
            m39246E();
        }
        if (i < 9 && i2 >= 9) {
            if (!m39253M()) {
                m39298u();
            } else {
                m39247F();
            }
        }
        if (i == 9 && i2 >= 10) {
            m39247F();
        }
        if (i < 11 && i2 >= 11) {
            m39284i0();
        }
        if (i < 12 && i2 >= 12) {
            m39301x();
        }
        if (i < 13 && i2 >= 13) {
            m39296s();
            m39249H();
        }
        if (i < 14 && i2 >= 14) {
            m39242A();
            m39302y();
            m39297t(C6778c1.f31310b);
        }
        if (i < 15 && i2 >= 15) {
            m39250I();
        }
        if (i < 16 && i2 >= 16) {
            m39303z();
        }
        C10468v.m52767a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
