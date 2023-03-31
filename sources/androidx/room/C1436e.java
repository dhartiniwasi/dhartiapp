package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p082l.C4890b;
import p111p0.C5248a;
import p111p0.C5249b;
import p111p0.C5257f;

/* renamed from: androidx.room.e */
/* compiled from: InvalidationTracker */
public class C1436e {

    /* renamed from: m */
    private static final String[] f4086m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f4087a;

    /* renamed from: b */
    final String[] f4088b;

    /* renamed from: c */
    private Map<String, Set<String>> f4089c;

    /* renamed from: d */
    final C1450h f4090d;

    /* renamed from: e */
    AtomicBoolean f4091e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f4092f = false;

    /* renamed from: g */
    volatile C5257f f4093g;

    /* renamed from: h */
    private C1438b f4094h;

    /* renamed from: i */
    private final C1435d f4095i;

    /* renamed from: j */
    final C4890b<C1439c, C1440d> f4096j = new C4890b<>();

    /* renamed from: k */
    private C1441f f4097k;

    /* renamed from: l */
    Runnable f4098l = new C1437a();

    /* renamed from: androidx.room.e$a */
    /* compiled from: InvalidationTracker */
    class C1437a implements Runnable {
        C1437a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m6758a() {
            HashSet hashSet = new HashSet();
            Cursor p = C1436e.this.f4090d.mo5604p(new C5248a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p.getInt(0)));
                } catch (Throwable th) {
                    p.close();
                    throw th;
                }
            }
            p.close();
            if (!hashSet.isEmpty()) {
                C1436e.this.f4093g.mo19248M();
            }
            return hashSet;
        }

        public void run() {
            C5249b x0;
            Lock h = C1436e.this.f4090d.mo5597h();
            Set<Integer> set = null;
            try {
                h.lock();
                if (!C1436e.this.mo5567c()) {
                    h.unlock();
                } else if (!C1436e.this.f4091e.compareAndSet(true, false)) {
                    h.unlock();
                } else if (C1436e.this.f4090d.mo5600k()) {
                    h.unlock();
                } else {
                    C1450h hVar = C1436e.this.f4090d;
                    if (hVar.f4137g) {
                        x0 = hVar.mo5598i().mo5636x0();
                        x0.mo19240u();
                        set = m6758a();
                        x0.mo19237n0();
                        x0.mo19232D0();
                    } else {
                        set = m6758a();
                    }
                    h.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C1436e.this.f4096j) {
                            Iterator<Map.Entry<C1439c, C1440d>> it = C1436e.this.f4096j.iterator();
                            while (it.hasNext()) {
                                ((C1440d) it.next().getValue()).mo5582a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    h.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                x0.mo19232D0();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.e$b */
    /* compiled from: InvalidationTracker */
    static class C1438b {

        /* renamed from: a */
        final long[] f4100a;

        /* renamed from: b */
        final boolean[] f4101b;

        /* renamed from: c */
        final int[] f4102c;

        /* renamed from: d */
        boolean f4103d;

        /* renamed from: e */
        boolean f4104e;

        C1438b(int i) {
            long[] jArr = new long[i];
            this.f4100a = jArr;
            boolean[] zArr = new boolean[i];
            this.f4101b = zArr;
            this.f4102c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo5576a() {
            synchronized (this) {
                if (this.f4103d) {
                    if (!this.f4104e) {
                        int length = this.f4100a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f4100a[i] > 0;
                                boolean[] zArr = this.f4101b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f4102c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f4102c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f4104e = true;
                                this.f4103d = false;
                                int[] iArr2 = this.f4102c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5577b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4100a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f4103d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5578c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4100a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f4103d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5579d() {
            synchronized (this) {
                this.f4104e = false;
            }
        }
    }

    /* renamed from: androidx.room.e$c */
    /* compiled from: InvalidationTracker */
    public static abstract class C1439c {

        /* renamed from: a */
        final String[] f4105a;

        public C1439c(String[] strArr) {
            this.f4105a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5580a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo5581b(Set<String> set);
    }

    /* renamed from: androidx.room.e$d */
    /* compiled from: InvalidationTracker */
    static class C1440d {

        /* renamed from: a */
        final int[] f4106a;

        /* renamed from: b */
        private final String[] f4107b;

        /* renamed from: c */
        final C1439c f4108c;

        /* renamed from: d */
        private final Set<String> f4109d;

        C1440d(C1439c cVar, int[] iArr, String[] strArr) {
            this.f4108c = cVar;
            this.f4106a = iArr;
            this.f4107b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f4109d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f4109d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5582a(Set<Integer> set) {
            int length = this.f4106a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f4106a[i]))) {
                    if (length == 1) {
                        set2 = this.f4109d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f4107b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f4108c.mo5581b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5583b(String[] strArr) {
            Set<String> set = null;
            if (this.f4107b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f4107b[0])) {
                        set = this.f4109d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4107b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4108c.mo5581b(set);
            }
        }
    }

    public C1436e(C1450h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4090d = hVar;
        this.f4094h = new C1438b(strArr.length);
        this.f4087a = new HashMap<>();
        this.f4089c = map2;
        this.f4095i = new C1435d(hVar);
        int length = strArr.length;
        this.f4088b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4087a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f4088b[i] = str2.toLowerCase(locale);
            } else {
                this.f4088b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f4087a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4087a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private static void m6745b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: h */
    private String[] m6746h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4089c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4089c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: j */
    private void m6747j(C5249b bVar, int i) {
        bVar.mo19231C("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f4088b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4086m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m6745b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.mo19231C(sb.toString());
        }
    }

    /* renamed from: k */
    private void m6748k(C5249b bVar, int i) {
        String str = this.f4088b[i];
        StringBuilder sb = new StringBuilder();
        for (String b : f4086m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m6745b(sb, str, b);
            bVar.mo19231C(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo5566a(C1439c cVar) {
        C1440d k;
        String[] h = m6746h(cVar.f4105a);
        int[] iArr = new int[h.length];
        int length = h.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f4087a.get(h[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + h[i]);
            }
        }
        C1440d dVar = new C1440d(cVar, iArr, h);
        synchronized (this.f4096j) {
            k = this.f4096j.mo18679k(cVar, dVar);
        }
        if (k == null && this.f4094h.mo5577b(iArr)) {
            mo5573l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5567c() {
        if (!this.f4090d.mo5603o()) {
            return false;
        }
        if (!this.f4092f) {
            this.f4090d.mo5598i().mo5636x0();
        }
        if (this.f4092f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5568d(C5249b bVar) {
        synchronized (this) {
            if (this.f4092f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.mo19231C("PRAGMA temp_store = MEMORY;");
            bVar.mo19231C("PRAGMA recursive_triggers='ON';");
            bVar.mo19231C("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo5574m(bVar);
            this.f4093g = bVar.mo19233N("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4092f = true;
        }
    }

    /* renamed from: e */
    public void mo5569e(String... strArr) {
        synchronized (this.f4096j) {
            Iterator<Map.Entry<C1439c, C1440d>> it = this.f4096j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C1439c) next.getKey()).mo5580a()) {
                    ((C1440d) next.getValue()).mo5583b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo5570f() {
        if (this.f4091e.compareAndSet(false, true)) {
            this.f4090d.mo5599j().execute(this.f4098l);
        }
    }

    /* renamed from: g */
    public void mo5571g(C1439c cVar) {
        C1440d l;
        synchronized (this.f4096j) {
            l = this.f4096j.mo18680l(cVar);
        }
        if (l != null && this.f4094h.mo5578c(l.f4106a)) {
            mo5573l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5572i(Context context, String str) {
        this.f4097k = new C1441f(context, str, this, this.f4090d.mo5599j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5573l() {
        if (this.f4090d.mo5603o()) {
            mo5574m(this.f4090d.mo5598i().mo5636x0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5574m(C5249b bVar) {
        if (!bVar.mo19235a1()) {
            while (true) {
                try {
                    Lock h = this.f4090d.mo5597h();
                    h.lock();
                    try {
                        int[] a = this.f4094h.mo5576a();
                        if (a == null) {
                            h.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.mo19240u();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m6747j(bVar, i);
                            } else if (i2 == 2) {
                                m6748k(bVar, i);
                            }
                        }
                        bVar.mo19237n0();
                        bVar.mo19232D0();
                        this.f4094h.mo5579d();
                        h.unlock();
                    } catch (Throwable th) {
                        h.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }
}
