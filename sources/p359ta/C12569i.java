package p359ta;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;
import p379va.C12860c;
import p379va.C12862d;
import p379va.C12864e;
import p379va.C12866g;
import p379va.C12867h;

/* renamed from: ta.i */
/* compiled from: Database */
class C12569i {

    /* renamed from: n */
    private static Boolean f46096n;

    /* renamed from: a */
    final boolean f46097a;

    /* renamed from: b */
    final String f46098b;

    /* renamed from: c */
    final int f46099c;

    /* renamed from: d */
    final int f46100d;

    /* renamed from: e */
    final Context f46101e;

    /* renamed from: f */
    final List<C12866g> f46102f = new ArrayList();

    /* renamed from: g */
    final Map<Integer, C12580s> f46103g = new HashMap();

    /* renamed from: h */
    public C12575n f46104h;

    /* renamed from: i */
    SQLiteDatabase f46105i;

    /* renamed from: j */
    private int f46106j = 0;

    /* renamed from: k */
    private int f46107k = 0;

    /* renamed from: l */
    private Integer f46108l;

    /* renamed from: m */
    private int f46109m = 0;

    /* renamed from: ta.i$a */
    /* compiled from: Database */
    class C12570a implements DatabaseErrorHandler {
        C12570a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    C12569i(Context context, String str, int i, boolean z, int i2) {
        this.f46101e = context;
        this.f46098b = str;
        this.f46097a = z;
        this.f46099c = i;
        this.f46100d = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m59806F(C12864e eVar) {
        Boolean h = eVar.mo37873h();
        boolean z = Boolean.TRUE.equals(h) && eVar.mo37872e();
        if (z) {
            int i = this.f46107k + 1;
            this.f46107k = i;
            this.f46108l = Integer.valueOf(i);
        }
        if (!m59830v(eVar)) {
            if (z) {
                this.f46108l = null;
            }
        } else if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f46108l);
            eVar.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(h)) {
                this.f46108l = null;
            }
            eVar.success((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m59811O() {
        while (!this.f46102f.isEmpty() && this.f46108l == null) {
            this.f46102f.get(0).mo37884a();
            this.f46102f.remove(0);
        }
    }

    /* renamed from: Q */
    private void m59812Q(C12864e eVar, Runnable runnable) {
        Integer d = eVar.mo37871d();
        Integer num = this.f46108l;
        if (num == null) {
            runnable.run();
        } else if (d == null || (!d.equals(num) && d.intValue() != -1)) {
            this.f46102f.add(new C12866g(eVar, runnable));
        } else {
            runnable.run();
            if (this.f46108l == null && !this.f46102f.isEmpty()) {
                this.f46104h.mo37422a(this, new C12562c(this));
            }
        }
    }

    /* renamed from: i */
    protected static boolean m59820i(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m59821k(int i) {
        C12580s sVar = this.f46103g.get(Integer.valueOf(i));
        if (sVar != null) {
            m59822l(sVar);
        }
    }

    /* renamed from: l */
    private void m59822l(C12580s sVar) {
        try {
            int i = sVar.f46135a;
            if (C12578q.m59869c(this.f46100d)) {
                Log.d("Sqflite", mo37411y() + "closing cursor " + i);
            }
            this.f46103g.remove(Integer.valueOf(i));
            sVar.f46137c.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    private Map<String, Object> m59823m(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                HashMap hashMap3 = hashMap2;
                arrayList = arrayList2;
                hashMap = hashMap3;
            }
            arrayList.add(C12563c0.m59803a(cursor, i));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    /* renamed from: n */
    static void m59824n(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: o */
    private boolean m59825o(C12864e eVar) {
        if (!m59830v(eVar)) {
            return false;
        }
        eVar.success((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m59807G(p379va.C12864e r10) {
        /*
            r9 = this;
            boolean r0 = r9.m59830v(r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.mo37870c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.mo37397A()     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0099 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0099 }
            if (r5 != 0) goto L_0x0067
            int r5 = r9.f46100d     // Catch:{ Exception -> 0x0099 }
            boolean r5 = p359ta.C12578q.m59868b(r5)     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.mo37411y()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0099 }
        L_0x0060:
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0067:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            int r2 = r9.f46100d     // Catch:{ Exception -> 0x0099 }
            boolean r2 = p359ta.C12578q.m59868b(r2)     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = r9.mo37411y()     // Catch:{ Exception -> 0x0099 }
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            r2.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0099 }
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0099 }
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0099:
            r2 = move-exception
            goto L_0x00c2
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.mo37411y()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r10 = move-exception
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c2:
            r9.mo37398B(r2, r10)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            r10 = move-exception
            r2 = r0
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ta.C12569i.m59807G(va.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ all -> 0x00a3 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m59808H(p379va.C12864e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r10.mo37876a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            ta.b0 r1 = r10.mo37869b()
            int r2 = r9.f46100d
            boolean r2 = p359ta.C12578q.m59868b(r2)
            if (r2 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.mo37411y()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Sqflite"
            android.util.Log.d(r3, r2)
        L_0x002c:
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r9.mo37410x()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            ta.b r5 = new ta.b     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String r1 = r1.mo37386c()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String[] r6 = p359ta.C12556a.f46062a     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r1, r6, r2)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.util.Map r4 = r9.m59823m(r1, r0)     // Catch:{ Exception -> 0x008c }
            r5 = 1
            if (r0 == 0) goto L_0x0056
            boolean r6 = r1.isLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.isAfterLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            r6 = 1
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x0081
            int r6 = r9.f46109m     // Catch:{ Exception -> 0x008c }
            int r6 = r6 + r5
            r9.f46109m = r6     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "cursorId"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x008c }
            ta.s r7 = new ta.s     // Catch:{ Exception -> 0x008c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x008c }
            r7.<init>(r6, r0, r1)     // Catch:{ Exception -> 0x008c }
            java.util.Map<java.lang.Integer, ta.s> r0 = r9.f46103g     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2 = r7
            goto L_0x0081
        L_0x007b:
            r10 = move-exception
            r2 = r7
            goto L_0x00a4
        L_0x007e:
            r0 = move-exception
            r2 = r7
            goto L_0x0093
        L_0x0081:
            r10.success(r4)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r5
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r10 = move-exception
            r1 = r2
            goto L_0x00a4
        L_0x0091:
            r0 = move-exception
            r1 = r2
        L_0x0093:
            r9.mo37398B(r0, r10)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x009b
            r9.m59822l(r2)     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r3
        L_0x00a3:
            r10 = move-exception
        L_0x00a4:
            if (r2 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ta.C12569i.m59808H(va.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m59809I(p379va.C12864e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorId"
            java.lang.Object r1 = r10.mo37876a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cancel"
            java.lang.Object r3 = r10.mo37876a(r3)
            boolean r2 = r2.equals(r3)
            int r3 = r9.f46100d
            boolean r3 = p359ta.C12578q.m59869c(r3)
            if (r3 == 0) goto L_0x0047
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.mo37411y()
            r3.append(r4)
            java.lang.String r4 = "cursor "
            r3.append(r4)
            r3.append(r1)
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = " cancel"
            goto L_0x003b
        L_0x0039:
            java.lang.String r4 = " next"
        L_0x003b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Sqflite"
            android.util.Log.d(r4, r3)
        L_0x0047:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0052
            r9.m59821k(r1)
            r10.success(r3)
            return r4
        L_0x0052:
            java.util.Map<java.lang.Integer, ta.s> r2 = r9.f46103g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            ta.s r2 = (p359ta.C12580s) r2
            r5 = 0
            if (r2 == 0) goto L_0x0095
            android.database.Cursor r6 = r2.f46137c     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            int r7 = r2.f46136b     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.util.Map r7 = r9.m59823m(r6, r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            boolean r8 = r6.isLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r8 != 0) goto L_0x007b
            boolean r6 = r6.isAfterLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r6 != 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x008e }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x008e }
        L_0x0085:
            r10.success(r7)     // Catch:{ Exception -> 0x008e }
            if (r6 != 0) goto L_0x008d
            r9.m59822l(r2)
        L_0x008d:
            return r4
        L_0x008e:
            r0 = move-exception
            goto L_0x00b1
        L_0x0090:
            r10 = move-exception
            goto L_0x00c5
        L_0x0092:
            r0 = move-exception
            r6 = 0
            goto L_0x00b1
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r6 = "Cursor "
            r4.append(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = " not found"
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            throw r0     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
        L_0x00b1:
            r9.mo37398B(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00ba
            r9.m59822l(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            if (r6 != 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            r9.m59822l(r3)
        L_0x00c2:
            return r5
        L_0x00c3:
            r10 = move-exception
            r5 = r6
        L_0x00c5:
            if (r5 != 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00cc
            r9.m59822l(r2)
        L_0x00cc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ta.C12569i.m59809I(va.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m59810J(p379va.C12864e r8) {
        /*
            r7 = this;
            boolean r0 = r7.m59830v(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.mo37870c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.success(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.mo37397A()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0066
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 <= 0) goto L_0x0066
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0066
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r5 = r7.f46100d     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r5 = p359ta.C12578q.m59868b(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.mo37411y()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.success(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r0.close()
            return r2
        L_0x0060:
            r8 = move-exception
            r3 = r0
            goto L_0x0093
        L_0x0063:
            r2 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.mo37411y()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.success(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 == 0) goto L_0x0086
            r0.close()
        L_0x0086:
            return r2
        L_0x0087:
            r8 = move-exception
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            r7.mo37398B(r2, r8)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            return r1
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r3.close()
        L_0x0098:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p359ta.C12569i.m59810J(va.e):boolean");
    }

    /* renamed from: v */
    private boolean m59830v(C12864e eVar) {
        C12561b0 b = eVar.mo37869b();
        if (C12578q.m59868b(this.f46100d)) {
            Log.d("Sqflite", mo37411y() + b);
        }
        Boolean h = eVar.mo37873h();
        try {
            mo37397A().execSQL(b.mo37386c(), b.mo37387d());
            mo37408t(h);
            return true;
        } catch (Exception e) {
            mo37398B(e, eVar);
            return false;
        }
    }

    /* renamed from: w */
    public static boolean m59831w(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: A */
    public SQLiteDatabase mo37397A() {
        return this.f46105i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo37398B(Exception exc, C12864e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.error("sqlite_error", "open_failed " + this.f46098b, (Object) null);
        } else if (exc instanceof SQLException) {
            eVar.error("sqlite_error", exc.getMessage(), C12867h.m60857a(eVar));
        } else {
            eVar.error("sqlite_error", exc.getMessage(), C12867h.m60857a(eVar));
        }
    }

    /* renamed from: C */
    public void mo37399C(C12864e eVar) {
        m59812Q(eVar, new C12564d(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized boolean mo37400D() {
        return this.f46106j > 0;
    }

    /* renamed from: K */
    public void mo37401K() {
        if (f46096n == null) {
            Boolean valueOf = Boolean.valueOf(m59820i(this.f46101e));
            f46096n = valueOf;
            if (valueOf.booleanValue() && C12578q.m59869c(this.f46100d)) {
                Log.d("Sqflite", mo37411y() + "[sqflite] WAL enabled");
            }
        }
        this.f46105i = SQLiteDatabase.openDatabase(this.f46098b, (SQLiteDatabase.CursorFactory) null, f46096n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: L */
    public void mo37402L() {
        this.f46105i = SQLiteDatabase.openDatabase(this.f46098b, (SQLiteDatabase.CursorFactory) null, 1, new C12570a());
    }

    /* renamed from: M */
    public void mo37403M(C12864e eVar) {
        m59812Q(eVar, new C12566f(this, eVar));
    }

    /* renamed from: N */
    public void mo37404N(C12864e eVar) {
        m59812Q(eVar, new C12565e(this, eVar));
    }

    /* renamed from: P */
    public void mo37405P(C12864e eVar) {
        m59812Q(eVar, new C12567g(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo37406h(C6555j jVar, C6556k.C6561d dVar) {
        C12862d dVar2 = new C12862d(jVar, dVar);
        boolean c = dVar2.mo37870c();
        boolean j = dVar2.mo37874j();
        ArrayList arrayList = new ArrayList();
        for (Map cVar : (List) dVar2.mo37876a("operations")) {
            C12860c cVar2 = new C12860c(cVar, c);
            String f = cVar2.mo37877f();
            f.hashCode();
            char c2 = 65535;
            switch (f.hashCode()) {
                case -1319569547:
                    if (f.equals("execute")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1183792455:
                    if (f.equals("insert")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -838846263:
                    if (f.equals("update")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 107944136:
                    if (f.equals("query")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    if (m59825o(cVar2)) {
                        cVar2.mo37883r(arrayList);
                        break;
                    } else if (j) {
                        cVar2.mo37882q(arrayList);
                        break;
                    } else {
                        cVar2.mo37881p(dVar);
                        return;
                    }
                case 1:
                    if (m59807G(cVar2)) {
                        cVar2.mo37883r(arrayList);
                        break;
                    } else if (j) {
                        cVar2.mo37882q(arrayList);
                        break;
                    } else {
                        cVar2.mo37881p(dVar);
                        return;
                    }
                case 2:
                    if (m59810J(cVar2)) {
                        cVar2.mo37883r(arrayList);
                        break;
                    } else if (j) {
                        cVar2.mo37882q(arrayList);
                        break;
                    } else {
                        cVar2.mo37881p(dVar);
                        return;
                    }
                case 3:
                    if (m59808H(cVar2)) {
                        cVar2.mo37883r(arrayList);
                        break;
                    } else if (j) {
                        cVar2.mo37882q(arrayList);
                        break;
                    } else {
                        cVar2.mo37881p(dVar);
                        return;
                    }
                default:
                    dVar.error("bad_param", "Batch method '" + f + "' not supported", (Object) null);
                    return;
            }
        }
        if (c) {
            dVar.success((Object) null);
        } else {
            dVar.success(arrayList);
        }
    }

    /* renamed from: j */
    public void mo37407j() {
        if (!this.f46103g.isEmpty() && C12578q.m59868b(this.f46100d)) {
            Log.d("Sqflite", mo37411y() + this.f46103g.size() + " cursor(s) are left opened");
        }
        this.f46105i.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized void mo37408t(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f46106j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f46106j--;
        }
    }

    /* renamed from: u */
    public void mo37409u(C12864e eVar) {
        m59812Q(eVar, new C12568h(this, eVar));
    }

    /* renamed from: x */
    public SQLiteDatabase mo37410x() {
        return this.f46105i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo37411y() {
        return "[" + mo37412z() + "] ";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo37412z() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f46099c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }
}
