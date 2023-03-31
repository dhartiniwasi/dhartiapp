package p025c8;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.C7959y;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p025c8.C6812o0;
import p211d8.C9882f;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10456n;
import p247h8.C10463s;
import p247h8.C10466t;
import p247h8.C10468v;
import p247h8.C10473y;
import p404y7.C13073j;

/* renamed from: c8.x2 */
/* compiled from: SQLitePersistence */
public final class C6831x2 extends C6778c1 {

    /* renamed from: c */
    private final C6834c f31455c;

    /* renamed from: d */
    private final C6810o f31456d;

    /* renamed from: e */
    private final C6779c4 f31457e;

    /* renamed from: f */
    private final C6807l1 f31458f;

    /* renamed from: g */
    private final C6784d3 f31459g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6791f2 f31460h;

    /* renamed from: i */
    private final SQLiteTransactionListener f31461i;

    /* renamed from: j */
    private SQLiteDatabase f31462j;

    /* renamed from: k */
    private boolean f31463k;

    /* renamed from: c8.x2$a */
    /* compiled from: SQLitePersistence */
    class C6832a implements SQLiteTransactionListener {
        C6832a() {
        }

        public void onBegin() {
            C6831x2.this.f31460h.mo22786d();
        }

        public void onCommit() {
            C6831x2.this.f31460h.mo22784b();
        }

        public void onRollback() {
        }
    }

    /* renamed from: c8.x2$c */
    /* compiled from: SQLitePersistence */
    static class C6834c extends SQLiteOpenHelper {

        /* renamed from: a */
        private final C6810o f31471a;

        /* renamed from: b */
        private boolean f31472b;

        /* synthetic */ C6834c(Context context, C6810o oVar, String str, C6832a aVar) {
            this(context, oVar, str);
        }

        /* renamed from: a */
        private void m39349a(SQLiteDatabase sQLiteDatabase) {
            if (!this.f31472b) {
                onConfigure(sQLiteDatabase);
            }
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f31472b = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m39349a(sQLiteDatabase);
            new C6829w3(sQLiteDatabase, this.f31471a).mo22908j0(0);
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            m39349a(sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            m39349a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            m39349a(sQLiteDatabase);
            new C6829w3(sQLiteDatabase, this.f31471a).mo22908j0(i);
        }

        private C6834c(Context context, C6810o oVar, String str) {
            this(context, oVar, str, 16);
        }

        C6834c(Context context, C6810o oVar, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            this.f31471a = oVar;
        }
    }

    /* renamed from: c8.x2$d */
    /* compiled from: SQLitePersistence */
    static class C6835d {

        /* renamed from: a */
        private final SQLiteDatabase f31473a;

        /* renamed from: b */
        private final String f31474b;

        /* renamed from: c */
        private SQLiteDatabase.CursorFactory f31475c;

        C6835d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f31473a = sQLiteDatabase;
            this.f31474b = str;
        }

        /* renamed from: h */
        private Cursor m39352h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f31475c;
            if (cursorFactory != null) {
                return this.f31473a.rawQueryWithFactory(cursorFactory, this.f31474b, (String[]) null, (String) null);
            }
            return this.f31473a.rawQuery(this.f31474b, (String[]) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6835d mo22929b(Object... objArr) {
            this.f31475c = new C1963y2(objArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo22930c(C10456n<Cursor> nVar) {
            Cursor h = m39352h();
            try {
                if (h.moveToFirst()) {
                    nVar.accept(h);
                    h.close();
                    return 1;
                }
                h.close();
                return 0;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T> T mo22931d(C10466t<Cursor, T> tVar) {
            Cursor h = m39352h();
            try {
                if (h.moveToFirst()) {
                    T apply = tVar.apply(h);
                    h.close();
                    return apply;
                }
                h.close();
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo22932e(C10456n<Cursor> nVar) {
            Cursor h = m39352h();
            int i = 0;
            while (h.moveToNext()) {
                try {
                    i++;
                    nVar.accept(h);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            h.close();
            return i;
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo22933f() {
            Cursor h = m39352h();
            try {
                boolean z = !h.moveToFirst();
                h.close();
                return z;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }
    }

    public C6831x2(Context context, String str, C9882f fVar, C6810o oVar, C6812o0.C6814b bVar) {
        this(oVar, bVar, new C6834c(context, oVar, m39321t(str, fVar), (C6832a) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m39319r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            String str = objArr[i];
            if (str == null) {
                sQLiteProgram.bindNull(i + 1);
            } else if (str instanceof String) {
                sQLiteProgram.bindString(i + 1, str);
            } else if (str instanceof Integer) {
                sQLiteProgram.bindLong(i + 1, (long) ((Integer) str).intValue());
            } else if (str instanceof Long) {
                sQLiteProgram.bindLong(i + 1, ((Long) str).longValue());
            } else if (str instanceof Double) {
                sQLiteProgram.bindDouble(i + 1, ((Double) str).doubleValue());
            } else if (str instanceof byte[]) {
                sQLiteProgram.bindBlob(i + 1, (byte[]) str);
            } else {
                throw C10432b.m52645a("Unknown argument %s of type %s", str, str.getClass());
            }
        }
    }

    /* renamed from: s */
    public static void m39320s(Context context, C9882f fVar, String str) throws C7959y {
        String path = context.getDatabasePath(m39321t(str, fVar)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            C10463s.m52763a(file);
            C10463s.m52763a(file2);
            C10463s.m52763a(file3);
        } catch (IOException e) {
            throw new C7959y("Failed to clear persistence." + e, C7959y.C7960a.UNKNOWN);
        }
    }

    /* renamed from: t */
    public static String m39321t(String str, C9882f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.mo32367k(), "utf-8") + "." + URLEncoder.encode(fVar.mo32366j(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: x */
    private long m39322x() {
        return ((Long) mo22912E("PRAGMA page_count").mo22931d(C1957w2.f5638a)).longValue();
    }

    /* renamed from: y */
    private long m39323y() {
        return ((Long) mo22912E("PRAGMA page_size").mo22931d(C1953v2.f5633a)).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C6779c4 mo22747h() {
        return this.f31457e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public SQLiteStatement mo22911D(String str) {
        return this.f31462j.compileStatement(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C6835d mo22912E(String str) {
        return new C6835d(this.f31462j, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6773a mo22740a() {
        return this.f31458f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6775b mo22741b(C13073j jVar) {
        return new C6822s1(this, this.f31456d, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6805l mo22742c(C13073j jVar) {
        return new C6777b2(this, this.f31456d, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6837z0 mo22743d(C13073j jVar, C6805l lVar) {
        return new C6818q2(this, this.f31456d, jVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6774a1 mo22744e() {
        return new C6826u2(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6799i1 mo22746g() {
        return this.f31459g;
    }

    /* renamed from: i */
    public boolean mo22748i() {
        return this.f31463k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public <T> T mo22749j(String str, C10473y<T> yVar) {
        C10468v.m52767a(C6778c1.f31309a, "Starting transaction: %s", str);
        this.f31462j.beginTransactionWithListener(this.f31461i);
        try {
            T t = yVar.get();
            this.f31462j.setTransactionSuccessful();
            return t;
        } finally {
            this.f31462j.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo22750k(String str, Runnable runnable) {
        C10468v.m52767a(C6778c1.f31309a, "Starting transaction: %s", str);
        this.f31462j.beginTransactionWithListener(this.f31461i);
        try {
            runnable.run();
            this.f31462j.setTransactionSuccessful();
        } finally {
            this.f31462j.endTransaction();
        }
    }

    /* renamed from: l */
    public void mo22751l() {
        C10432b.m52648d(this.f31463k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f31463k = false;
        this.f31462j.close();
        this.f31462j = null;
    }

    /* renamed from: m */
    public void mo22752m() {
        C10432b.m52648d(!this.f31463k, "SQLitePersistence double-started!", new Object[0]);
        this.f31463k = true;
        try {
            this.f31462j = this.f31455c.getWritableDatabase();
            this.f31457e.mo22753B();
            this.f31460h.mo22799z(this.f31457e.mo22765r());
        } catch (SQLiteDatabaseLockedException e) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo22913u(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        m39319r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo22914v(String str, Object... objArr) {
        this.f31462j.execSQL(str, objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public long mo22915w() {
        return m39322x() * m39323y();
    }

    /* renamed from: z */
    public C6791f2 mo22745f() {
        return this.f31460h;
    }

    public C6831x2(C6810o oVar, C6812o0.C6814b bVar, C6834c cVar) {
        this.f31461i = new C6832a();
        this.f31455c = cVar;
        this.f31456d = oVar;
        this.f31457e = new C6779c4(this, oVar);
        this.f31458f = new C6807l1(this, oVar);
        this.f31459g = new C6784d3(this, oVar);
        this.f31460h = new C6791f2(this, bVar);
    }

    /* renamed from: c8.x2$b */
    /* compiled from: SQLitePersistence */
    static class C6833b {

        /* renamed from: a */
        private final C6831x2 f31465a;

        /* renamed from: b */
        private final String f31466b;

        /* renamed from: c */
        private final String f31467c;

        /* renamed from: d */
        private final List<Object> f31468d;

        /* renamed from: e */
        private int f31469e = 0;

        /* renamed from: f */
        private final Iterator<Object> f31470f;

        C6833b(C6831x2 x2Var, String str, List<Object> list, String str2) {
            this.f31465a = x2Var;
            this.f31466b = str;
            this.f31468d = Collections.emptyList();
            this.f31467c = str2;
            this.f31470f = list.iterator();
        }

        /* renamed from: b */
        private Object[] m39344b() {
            ArrayList arrayList = new ArrayList(this.f31468d);
            int i = 0;
            while (this.f31470f.hasNext() && i < 900 - this.f31468d.size()) {
                arrayList.add(this.f31470f.next());
                i++;
            }
            return arrayList.toArray();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo22920a() {
            this.f31469e++;
            Object[] b = m39344b();
            this.f31465a.mo22914v(this.f31466b + C10449g0.m52726z("?", b.length, ", ") + this.f31467c, b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo22921c() {
            return this.f31469e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22922d() {
            return this.f31470f.hasNext();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6835d mo22923e() {
            this.f31469e++;
            Object[] b = m39344b();
            return this.f31465a.mo22912E(this.f31466b + C10449g0.m52726z("?", b.length, ", ") + this.f31467c).mo22929b(b);
        }

        C6833b(C6831x2 x2Var, String str, List<Object> list, List<Object> list2, String str2) {
            this.f31465a = x2Var;
            this.f31466b = str;
            this.f31468d = list;
            this.f31467c = str2;
            this.f31470f = list2.iterator();
        }
    }
}
