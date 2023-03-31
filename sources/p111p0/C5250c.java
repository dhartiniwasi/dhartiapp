package p111p0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* renamed from: p0.c */
/* compiled from: SupportSQLiteOpenHelper */
public interface C5250c extends Closeable {

    /* renamed from: p0.c$a */
    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class C5251a {

        /* renamed from: a */
        public final int f27117a;

        public C5251a(int i) {
            this.f27117a = i;
        }

        /* renamed from: a */
        private void m32451a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        /* renamed from: b */
        public void mo5620b(C5249b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m32451a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m32451a(r3.mo19234Y0());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19242c(p111p0.C5249b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.mo19234Y0()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.mo19234Y0()
                r2.m32451a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.mo19229A()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m32451a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.mo19234Y0()
                r2.m32451a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m32451a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.mo19234Y0()
                r2.m32451a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111p0.C5250c.C5251a.mo19242c(p0.b):void");
        }

        /* renamed from: d */
        public abstract void mo5621d(C5249b bVar);

        /* renamed from: e */
        public abstract void mo5622e(C5249b bVar, int i, int i2);

        /* renamed from: f */
        public void mo5623f(C5249b bVar) {
        }

        /* renamed from: g */
        public abstract void mo5624g(C5249b bVar, int i, int i2);
    }

    /* renamed from: p0.c$b */
    /* compiled from: SupportSQLiteOpenHelper */
    public static class C5252b {

        /* renamed from: a */
        public final Context f27118a;

        /* renamed from: b */
        public final String f27119b;

        /* renamed from: c */
        public final C5251a f27120c;

        /* renamed from: d */
        public final boolean f27121d;

        /* renamed from: p0.c$b$a */
        /* compiled from: SupportSQLiteOpenHelper */
        public static class C5253a {

            /* renamed from: a */
            Context f27122a;

            /* renamed from: b */
            String f27123b;

            /* renamed from: c */
            C5251a f27124c;

            /* renamed from: d */
            boolean f27125d;

            C5253a(Context context) {
                this.f27122a = context;
            }

            /* renamed from: a */
            public C5252b mo19243a() {
                if (this.f27124c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f27122a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f27125d || !TextUtils.isEmpty(this.f27123b)) {
                    return new C5252b(this.f27122a, this.f27123b, this.f27124c, this.f27125d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            /* renamed from: b */
            public C5253a mo19244b(C5251a aVar) {
                this.f27124c = aVar;
                return this;
            }

            /* renamed from: c */
            public C5253a mo19245c(String str) {
                this.f27123b = str;
                return this;
            }

            /* renamed from: d */
            public C5253a mo19246d(boolean z) {
                this.f27125d = z;
                return this;
            }
        }

        C5252b(Context context, String str, C5251a aVar, boolean z) {
            this.f27118a = context;
            this.f27119b = str;
            this.f27120c = aVar;
            this.f27121d = z;
        }

        /* renamed from: a */
        public static C5253a m32458a(Context context) {
            return new C5253a(context);
        }
    }

    /* renamed from: p0.c$c */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C5254c {
        /* renamed from: a */
        C5250c mo5637a(C5252b bVar);
    }

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);

    /* renamed from: x0 */
    C5249b mo5636x0();
}
