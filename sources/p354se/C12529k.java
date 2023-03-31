package p354se;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: se.k */
/* compiled from: TaskDbHelper.kt */
public final class C12529k extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final C12530a f46020a = new C12530a((C11665g) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C12529k f46021b;

    /* renamed from: se.k$a */
    /* compiled from: TaskDbHelper.kt */
    public static final class C12530a {
        private C12530a() {
        }

        public /* synthetic */ C12530a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12529k mo37342a(Context context) {
            if (C12529k.f46021b == null) {
                C11669k.m56784b(context);
                Context applicationContext = context.getApplicationContext();
                C11669k.m56786d(applicationContext, "ctx!!.applicationContext");
                C12529k.f46021b = new C12529k(applicationContext, (C11665g) null);
            }
            C12529k a = C12529k.f46021b;
            C11669k.m56784b(a);
            return a;
        }
    }

    private C12529k(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ C12529k(Context context, C11665g gVar) {
        this(context);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C11669k.m56787e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11669k.m56787e(sQLiteDatabase, "db");
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11669k.m56787e(sQLiteDatabase, "db");
        if (i2 == 4) {
            sQLiteDatabase.execSQL("ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1");
        } else if (i == 2 && i2 == 3) {
            sQLiteDatabase.execSQL("ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
            onCreate(sQLiteDatabase);
        }
    }
}
