package p118q0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p111p0.C5249b;
import p111p0.C5250c;

/* renamed from: q0.b */
/* compiled from: FrameworkSQLiteOpenHelper */
class C5346b implements C5250c {

    /* renamed from: a */
    private final Context f27402a;

    /* renamed from: b */
    private final String f27403b;

    /* renamed from: c */
    private final C5250c.C5251a f27404c;

    /* renamed from: d */
    private final boolean f27405d;

    /* renamed from: e */
    private final Object f27406e = new Object();

    /* renamed from: f */
    private C5347a f27407f;

    /* renamed from: g */
    private boolean f27408g;

    /* renamed from: q0.b$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class C5347a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C5343a[] f27409a;

        /* renamed from: b */
        final C5250c.C5251a f27410b;

        /* renamed from: c */
        private boolean f27411c;

        /* renamed from: q0.b$a$a */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C5348a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C5250c.C5251a f27412a;

            /* renamed from: b */
            final /* synthetic */ C5343a[] f27413b;

            C5348a(C5250c.C5251a aVar, C5343a[] aVarArr) {
                this.f27412a = aVar;
                this.f27413b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f27412a.mo19242c(C5347a.m32777b(this.f27413b, sQLiteDatabase));
            }
        }

        C5347a(Context context, String str, C5343a[] aVarArr, C5250c.C5251a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f27117a, new C5348a(aVar, aVarArr));
            this.f27410b = aVar;
            this.f27409a = aVarArr;
        }

        /* renamed from: b */
        static C5343a m32777b(C5343a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C5343a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo19382a(sQLiteDatabase)) {
                aVarArr[0] = new C5343a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5343a mo19386a(SQLiteDatabase sQLiteDatabase) {
            return m32777b(this.f27409a, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f27409a[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public synchronized C5249b mo19388f() {
            this.f27411c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f27411c) {
                close();
                return mo19388f();
            }
            return mo19386a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f27410b.mo5620b(mo19386a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f27410b.mo5621d(mo19386a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f27411c = true;
            this.f27410b.mo5622e(mo19386a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f27411c) {
                this.f27410b.mo5623f(mo19386a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f27411c = true;
            this.f27410b.mo5624g(mo19386a(sQLiteDatabase), i, i2);
        }
    }

    C5346b(Context context, String str, C5250c.C5251a aVar, boolean z) {
        this.f27402a = context;
        this.f27403b = str;
        this.f27404c = aVar;
        this.f27405d = z;
    }

    /* renamed from: a */
    private C5347a m32775a() {
        C5347a aVar;
        synchronized (this.f27406e) {
            if (this.f27407f == null) {
                C5343a[] aVarArr = new C5343a[1];
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || this.f27403b == null || !this.f27405d) {
                    this.f27407f = new C5347a(this.f27402a, this.f27403b, aVarArr, this.f27404c);
                } else {
                    this.f27407f = new C5347a(this.f27402a, new File(this.f27402a.getNoBackupFilesDir(), this.f27403b).getAbsolutePath(), aVarArr, this.f27404c);
                }
                if (i >= 16) {
                    this.f27407f.setWriteAheadLoggingEnabled(this.f27408g);
                }
            }
            aVar = this.f27407f;
        }
        return aVar;
    }

    public void close() {
        m32775a().close();
    }

    public String getDatabaseName() {
        return this.f27403b;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f27406e) {
            C5347a aVar = this.f27407f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f27408g = z;
        }
    }

    /* renamed from: x0 */
    public C5249b mo5636x0() {
        return m32775a().mo19388f();
    }
}
