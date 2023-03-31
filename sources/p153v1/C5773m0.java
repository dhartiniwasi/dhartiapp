package p153v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p084l1.C4902b;
import p084l1.C4904d;
import p098n1.C5084h;
import p098n1.C5085i;
import p098n1.C5095o;
import p119q1.C5352a;
import p119q1.C5354b;
import p119q1.C5356c;
import p119q1.C5359d;
import p119q1.C5361e;
import p119q1.C5363f;
import p126r1.C5431a;
import p159w1.C5888a;
import p159w1.C5889b;
import p165x1.C6034a;
import p171y1.C6116a;
import p234fd.C10201a;

/* renamed from: v1.m0 */
/* compiled from: SQLiteEventStore */
public class C5773m0 implements C5761d, C5889b, C5760c {

    /* renamed from: f */
    private static final C4902b f28741f = C4902b.m31123b("proto");

    /* renamed from: a */
    private final C5779t0 f28742a;

    /* renamed from: b */
    private final C6034a f28743b;

    /* renamed from: c */
    private final C6034a f28744c;

    /* renamed from: d */
    private final C5762e f28745d;

    /* renamed from: e */
    private final C10201a<String> f28746e;

    /* renamed from: v1.m0$b */
    /* compiled from: SQLiteEventStore */
    interface C5775b<T, U> {
        U apply(T t);
    }

    /* renamed from: v1.m0$c */
    /* compiled from: SQLiteEventStore */
    private static class C5776c {

        /* renamed from: a */
        final String f28747a;

        /* renamed from: b */
        final String f28748b;

        private C5776c(String str, String str2) {
            this.f28747a = str;
            this.f28748b = str2;
        }
    }

    /* renamed from: v1.m0$d */
    /* compiled from: SQLiteEventStore */
    interface C5777d<T> {
        /* renamed from: a */
        T mo20282a();
    }

    C5773m0(C6034a aVar, C6034a aVar2, C5762e eVar, C5779t0 t0Var, C10201a<String> aVar3) {
        this.f28742a = t0Var;
        this.f28743b = aVar;
        this.f28744c = aVar2;
        this.f28745d = eVar;
        this.f28746e = aVar3;
    }

    /* renamed from: B0 */
    private C5354b m34401B0() {
        return C5354b.m32799b().mo19408b(C5361e.m32816c().mo19423b(mo20279v0()).mo19424c(C5762e.f28736a.mo20245f()).mo19422a()).mo19407a();
    }

    /* renamed from: E0 */
    private long m34403E0() {
        return mo20280y0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: F0 */
    private long m34405F0() {
        return mo20280y0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ Long m34406F1(C5085i iVar, C5095o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m34419M0()) {
            mo20262g(1, C5356c.C5358b.CACHE_FULL, iVar.mo18999j());
            return -1L;
        }
        long u0 = m34464u0(sQLiteDatabase, oVar);
        int e = this.f28745d.mo20243e();
        byte[] a = iVar.mo18995e().mo19038a();
        boolean z = a.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(u0));
        contentValues.put("transport_name", iVar.mo18999j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.mo18997f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.mo19000k()));
        contentValues.put("payload_encoding", iVar.mo18995e().mo19039b().mo18727a());
        contentValues.put("code", iVar.mo18994d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.mo19046i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(MediationMetaData.KEY_NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: H0 */
    private C5363f m34409H0() {
        return (C5363f) mo20276J0(new C12797w(this.f28743b.mo20745a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static /* synthetic */ byte[] m34410H1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: I0 */
    private Long m34412I0(SQLiteDatabase sQLiteDatabase, C5095o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.mo19024b(), String.valueOf(C6116a.m35764a(oVar.mo19026d()))}));
        if (oVar.mo19025c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.mo19025c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m34439W1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C12796v.f46804a);
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public /* synthetic */ Object m34413I1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo20262g((long) i, C5356c.C5358b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public /* synthetic */ Object m34414J1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m34439W1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C12777i0(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static /* synthetic */ Boolean m34416K1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static /* synthetic */ Object m34418L1(String str, C5356c.C5358b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m34439W1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo19414f())}), C12798x.f46806a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo19414f()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo19414f())});
        }
        return null;
    }

    /* renamed from: M0 */
    private boolean m34419M0() {
        return m34403E0() * m34405F0() >= this.f28745d.mo20245f();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static /* synthetic */ Object m34420M1(long j, C5095o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.mo19024b(), String.valueOf(C6116a.m35764a(oVar.mo19026d()))}) < 1) {
            contentValues.put("backend_name", oVar.mo19024b());
            contentValues.put("priority", Integer.valueOf(C6116a.m35764a(oVar.mo19026d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: N0 */
    private List<C5772k> m34421N0(List<C5772k> list, Map<Long, Set<C5776c>> map) {
        ListIterator<C5772k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C5772k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo20255c()))) {
                C5085i.C5086a l = next.mo20254b().mo19047l();
                for (C5776c cVar : map.get(Long.valueOf(next.mo20255c()))) {
                    l.mo19050c(cVar.f28747a, cVar.f28748b);
                }
                listIterator.set(C5772k.m34397a(next.mo20255c(), next.mo20256d(), l.mo19002d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public /* synthetic */ Object m34422N1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f28743b.mo20745a()).execute();
        return null;
    }

    /* renamed from: O1 */
    private List<C5772k> m34423O1(SQLiteDatabase sQLiteDatabase, C5095o oVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long I0 = m34412I0(sQLiteDatabase, oVar);
        if (I0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m34439W1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{I0.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new C12783n(this, arrayList, oVar));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ Object m34424P0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo20262g((long) i, C5356c.C5358b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: P1 */
    private Map<Long, Set<C5776c>> m34425P1(SQLiteDatabase sQLiteDatabase, List<C5772k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo20255c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m34439W1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C12775g0(hashMap));
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ Integer m34427Q0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m34439W1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C12776h0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: Q1 */
    private static byte[] m34428Q1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: R1 */
    private void m34430R1(C5352a.C5353a aVar, Map<String, List<C5356c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.mo19401a(C5359d.m32810c().mo19419c((String) next.getKey()).mo19418b((List) next.getValue()).mo19417a());
        }
    }

    /* renamed from: S1 */
    private byte[] m34432S1(long j) {
        return (byte[]) m34439W1(mo20280y0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), C12792s.f46800a);
    }

    /* renamed from: T1 */
    private <T> T m34433T1(C5777d<T> dVar, C5775b<Throwable, T> bVar) {
        long a = this.f28744c.mo20745a();
        while (true) {
            try {
                return dVar.mo20282a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f28744c.mo20745a() >= ((long) this.f28745d.mo20240b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ Object m34435U0(Throwable th) {
        throw new C5888a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: U1 */
    private static C4902b m34436U1(String str) {
        if (str == null) {
            return f28741f;
        }
        return C4902b.m31123b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ SQLiteDatabase m34437V0(Throwable th) {
        throw new C5888a("Timed out while trying to open db.", th);
    }

    /* renamed from: V1 */
    private static String m34438V1(Iterable<C5772k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C5772k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo20255c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: W1 */
    static <T> T m34439W1(Cursor cursor, C5775b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public static /* synthetic */ Long m34443c1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public static /* synthetic */ C5363f m34447f1(long j, SQLiteDatabase sQLiteDatabase) {
        return (C5363f) m34439W1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C12780l(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public static /* synthetic */ Long m34448g1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ Boolean m34450h1(C5095o oVar, SQLiteDatabase sQLiteDatabase) {
        Long I0 = m34412I0(sQLiteDatabase, oVar);
        if (I0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m34439W1(mo20280y0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{I0.toString()}), C12799y.f46807a);
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ List m34452j1(SQLiteDatabase sQLiteDatabase) {
        return (List) m34439W1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C12794t.f46802a);
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static /* synthetic */ List m34455m1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C5095o.m31889a().mo19030b(cursor.getString(1)).mo19032d(C6116a.m35765b(cursor.getInt(2))).mo19031c(m34428Q1(cursor.getString(3))).mo19029a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ List m34458p1(C5095o oVar, SQLiteDatabase sQLiteDatabase) {
        List<C5772k> O1 = m34423O1(sQLiteDatabase, oVar, this.f28745d.mo20242d());
        for (C4904d dVar : C4904d.values()) {
            if (dVar != oVar.mo19026d()) {
                int d = this.f28745d.mo20242d() - O1.size();
                if (d <= 0) {
                    break;
                }
                O1.addAll(m34423O1(sQLiteDatabase, oVar.mo19058f(dVar), d));
            }
        }
        return m34421N0(O1, m34425P1(sQLiteDatabase, O1));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ C5352a m34460q1(Map map, C5352a.C5353a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C5356c.C5358b r0 = m34461r0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C5356c.m32803c().mo19413c(r0).mo19412b(j).mo19411a());
        }
        m34430R1(aVar, map);
        aVar.mo19405e(m34409H0());
        aVar.mo19404d(m34401B0());
        aVar.mo19403c(this.f28746e.get());
        return aVar.mo19402b();
    }

    /* renamed from: r0 */
    private C5356c.C5358b m34461r0(int i) {
        C5356c.C5358b bVar = C5356c.C5358b.REASON_UNKNOWN;
        if (i == bVar.mo19414f()) {
            return bVar;
        }
        C5356c.C5358b bVar2 = C5356c.C5358b.MESSAGE_TOO_OLD;
        if (i == bVar2.mo19414f()) {
            return bVar2;
        }
        C5356c.C5358b bVar3 = C5356c.C5358b.CACHE_FULL;
        if (i == bVar3.mo19414f()) {
            return bVar3;
        }
        C5356c.C5358b bVar4 = C5356c.C5358b.PAYLOAD_TOO_BIG;
        if (i == bVar4.mo19414f()) {
            return bVar4;
        }
        C5356c.C5358b bVar5 = C5356c.C5358b.MAX_RETRIES_REACHED;
        if (i == bVar5.mo19414f()) {
            return bVar5;
        }
        C5356c.C5358b bVar6 = C5356c.C5358b.INVALID_PAYLOD;
        if (i == bVar6.mo19414f()) {
            return bVar6;
        }
        C5356c.C5358b bVar7 = C5356c.C5358b.SERVER_ERROR;
        if (i == bVar7.mo19414f()) {
            return bVar7;
        }
        C5431a.m33267b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: t0 */
    private void m34463t0(SQLiteDatabase sQLiteDatabase) {
        m34433T1(new C12771c0(sQLiteDatabase), C12770b0.f46761a);
    }

    /* renamed from: u0 */
    private long m34464u0(SQLiteDatabase sQLiteDatabase, C5095o oVar) {
        Long I0 = m34412I0(sQLiteDatabase, oVar);
        if (I0 != null) {
            return I0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.mo19024b());
        contentValues.put("priority", Integer.valueOf(C6116a.m35764a(oVar.mo19026d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.mo19025c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.mo19025c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ C5352a m34465u1(String str, Map map, C5352a.C5353a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C5352a) m34439W1(sQLiteDatabase.rawQuery(str, new String[0]), new C12784o(this, map, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ Object m34466v1(List list, C5095o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C5085i.C5086a k = C5085i.m31846a().mo19008j(cursor.getString(1)).mo19007i(cursor.getLong(2)).mo19009k(cursor.getLong(3));
            if (z) {
                k.mo19006h(new C5084h(m34436U1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo19006h(new C5084h(m34436U1(cursor.getString(4)), m34432S1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo19005g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C5772k.m34397a(j, oVar, k.mo19002d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static /* synthetic */ Object m34469x1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C5776c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: C0 */
    public long mo20263C0(C5095o oVar) {
        return ((Long) m34439W1(mo20280y0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.mo19024b(), String.valueOf(C6116a.m35764a(oVar.mo19026d()))}), C12795u.f46803a)).longValue();
    }

    /* renamed from: D1 */
    public Iterable<C5772k> mo20264D1(C5095o oVar) {
        return (Iterable) mo20276J0(new C12788q(this, oVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public <T> T mo20276J0(C5775b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase y0 = mo20280y0();
        y0.beginTransaction();
        try {
            T apply = bVar.apply(y0);
            y0.setTransactionSuccessful();
            return apply;
        } finally {
            y0.endTransaction();
        }
    }

    /* renamed from: R */
    public boolean mo20265R(C5095o oVar) {
        return ((Boolean) mo20276J0(new C12790r(this, oVar))).booleanValue();
    }

    /* renamed from: a */
    public void mo20260a() {
        mo20276J0(new C12778j0(this));
    }

    /* renamed from: b */
    public C5352a mo20261b() {
        return (C5352a) mo20276J0(new C12782m(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C5352a.m32788e()));
    }

    public void close() {
        this.f28742a.close();
    }

    /* renamed from: e0 */
    public Iterable<C5095o> mo20266e0() {
        return (Iterable) mo20276J0(C12800z.f46808a);
    }

    /* renamed from: f */
    public <T> T mo20278f(C5889b.C5890a<T> aVar) {
        SQLiteDatabase y0 = mo20280y0();
        m34463t0(y0);
        try {
            T t = aVar.mo20450t();
            y0.setTransactionSuccessful();
            return t;
        } finally {
            y0.endTransaction();
        }
    }

    /* renamed from: g */
    public void mo20262g(long j, C5356c.C5358b bVar, String str) {
        mo20276J0(new C12774f0(str, bVar, j));
    }

    /* renamed from: g0 */
    public void mo20267g0(C5095o oVar, long j) {
        mo20276J0(new C12773e0(j, oVar));
    }

    /* renamed from: p0 */
    public C5772k mo20268p0(C5095o oVar, C5085i iVar) {
        C5431a.m33268c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.mo19026d(), iVar.mo18999j(), oVar.mo19024b());
        long longValue = ((Long) mo20276J0(new C12786p(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C5772k.m34397a(longValue, oVar, iVar);
    }

    /* renamed from: s1 */
    public void mo20269s1(Iterable<C5772k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo20276J0(new C12781l0(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m34438V1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: v */
    public int mo20270v() {
        return ((Integer) mo20276J0(new C12779k0(this, this.f28743b.mo20745a() - this.f28745d.mo20241c()))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public long mo20279v0() {
        return m34403E0() * m34405F0();
    }

    /* renamed from: y */
    public void mo20271y(Iterable<C5772k> iterable) {
        if (iterable.iterator().hasNext()) {
            mo20280y0().compileStatement("DELETE FROM events WHERE _id in " + m34438V1(iterable)).execute();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public SQLiteDatabase mo20280y0() {
        C5779t0 t0Var = this.f28742a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m34433T1(new C12772d0(t0Var), C12769a0.f46760a);
    }
}
