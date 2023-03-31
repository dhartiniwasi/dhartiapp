package p153v1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: v1.t0 */
/* compiled from: SchemaManager */
final class C5779t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f28754c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: d */
    static int f28755d = 5;

    /* renamed from: e */
    private static final C5780a f28756e;

    /* renamed from: f */
    private static final C5780a f28757f;

    /* renamed from: g */
    private static final C5780a f28758g;

    /* renamed from: h */
    private static final C5780a f28759h;

    /* renamed from: i */
    private static final C5780a f28760i;

    /* renamed from: r */
    private static final List<C5780a> f28761r;

    /* renamed from: a */
    private final int f28762a;

    /* renamed from: b */
    private boolean f28763b = false;

    /* renamed from: v1.t0$a */
    /* compiled from: SchemaManager */
    public interface C5780a {
        /* renamed from: a */
        void mo20289a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C12791r0 r0Var = C12791r0.f46799a;
        f28756e = r0Var;
        C12785o0 o0Var = C12785o0.f46789a;
        f28757f = o0Var;
        C12787p0 p0Var = C12787p0.f46793a;
        f28758g = p0Var;
        C12789q0 q0Var = C12789q0.f46796a;
        f28759h = q0Var;
        C12793s0 s0Var = C12793s0.f46801a;
        f28760i = s0Var;
        f28761r = Arrays.asList(new C5780a[]{r0Var, o0Var, p0Var, q0Var, s0Var});
    }

    C5779t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f28762a = i;
    }

    /* renamed from: D */
    private void m34490D(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<C5780a> list = f28761r;
        if (i2 <= list.size()) {
            while (i < i2) {
                f28761r.get(i).mo20289a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: m */
    private void m34496m(SQLiteDatabase sQLiteDatabase) {
        if (!this.f28763b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m34497n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m34498p(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m34500t(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m34501w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f28754c);
    }

    /* renamed from: x */
    private void m34502x(SQLiteDatabase sQLiteDatabase, int i) {
        m34496m(sQLiteDatabase);
        m34490D(sQLiteDatabase, 0, i);
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f28763b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m34502x(sQLiteDatabase, this.f28762a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m34502x(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m34496m(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m34496m(sQLiteDatabase);
        m34490D(sQLiteDatabase, i, i2);
    }
}
