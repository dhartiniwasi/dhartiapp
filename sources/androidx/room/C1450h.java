package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p075k.C4834a;
import p090m0.C4961a;
import p111p0.C5249b;
import p111p0.C5250c;
import p111p0.C5256e;
import p111p0.C5257f;
import p118q0.C5349c;

/* renamed from: androidx.room.h */
/* compiled from: RoomDatabase */
public abstract class C1450h {
    @Deprecated

    /* renamed from: a */
    protected volatile C5249b f4131a;

    /* renamed from: b */
    private Executor f4132b;

    /* renamed from: c */
    private Executor f4133c;

    /* renamed from: d */
    private C5250c f4134d;

    /* renamed from: e */
    private final C1436e f4135e = mo5594e();

    /* renamed from: f */
    private boolean f4136f;

    /* renamed from: g */
    boolean f4137g;
    @Deprecated

    /* renamed from: h */
    protected List<C1452b> f4138h;

    /* renamed from: i */
    private final ReentrantReadWriteLock f4139i = new ReentrantReadWriteLock();

    /* renamed from: j */
    private final ThreadLocal<Integer> f4140j = new ThreadLocal<>();

    /* renamed from: k */
    private final Map<String, Object> f4141k = new ConcurrentHashMap();

    /* renamed from: androidx.room.h$a */
    /* compiled from: RoomDatabase */
    public static class C1451a<T extends C1450h> {

        /* renamed from: a */
        private final Class<T> f4142a;

        /* renamed from: b */
        private final String f4143b;

        /* renamed from: c */
        private final Context f4144c;

        /* renamed from: d */
        private ArrayList<C1452b> f4145d;

        /* renamed from: e */
        private Executor f4146e;

        /* renamed from: f */
        private Executor f4147f;

        /* renamed from: g */
        private C5250c.C5254c f4148g;

        /* renamed from: h */
        private boolean f4149h;

        /* renamed from: i */
        private C1453c f4150i = C1453c.AUTOMATIC;

        /* renamed from: j */
        private boolean f4151j;

        /* renamed from: k */
        private boolean f4152k = true;

        /* renamed from: l */
        private boolean f4153l;

        /* renamed from: m */
        private final C1454d f4154m = new C1454d();

        /* renamed from: n */
        private Set<Integer> f4155n;

        /* renamed from: o */
        private Set<Integer> f4156o;

        /* renamed from: p */
        private String f4157p;

        /* renamed from: q */
        private File f4158q;

        C1451a(Context context, Class<T> cls, String str) {
            this.f4144c = context;
            this.f4142a = cls;
            this.f4143b = str;
        }

        /* renamed from: a */
        public C1451a<T> mo5607a(C1452b bVar) {
            if (this.f4145d == null) {
                this.f4145d = new ArrayList<>();
            }
            this.f4145d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C1451a<T> mo5608b(C4961a... aVarArr) {
            if (this.f4156o == null) {
                this.f4156o = new HashSet();
            }
            for (C4961a aVar : aVarArr) {
                this.f4156o.add(Integer.valueOf(aVar.f26039a));
                this.f4156o.add(Integer.valueOf(aVar.f26040b));
            }
            this.f4154m.mo5618b(aVarArr);
            return this;
        }

        /* renamed from: c */
        public C1451a<T> mo5609c() {
            this.f4149h = true;
            return this;
        }

        /* renamed from: d */
        public T mo5610d() {
            Executor executor;
            if (this.f4144c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4142a != null) {
                Executor executor2 = this.f4146e;
                if (executor2 == null && this.f4147f == null) {
                    Executor d = C4834a.m30859d();
                    this.f4147f = d;
                    this.f4146e = d;
                } else if (executor2 != null && this.f4147f == null) {
                    this.f4147f = executor2;
                } else if (executor2 == null && (executor = this.f4147f) != null) {
                    this.f4146e = executor;
                }
                Set<Integer> set = this.f4156o;
                if (!(set == null || this.f4155n == null)) {
                    for (Integer next : set) {
                        if (this.f4155n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f4148g == null) {
                    this.f4148g = new C5349c();
                }
                String str = this.f4157p;
                if (!(str == null && this.f4158q == null)) {
                    if (this.f4143b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f4158q == null) {
                        this.f4148g = new C1459k(str, this.f4158q, this.f4148g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f4144c;
                String str2 = this.f4143b;
                C5250c.C5254c cVar = this.f4148g;
                C1454d dVar = this.f4154m;
                ArrayList<C1452b> arrayList = this.f4145d;
                boolean z = this.f4149h;
                C1453c b = this.f4150i.mo5617b(context);
                Executor executor3 = this.f4146e;
                Executor executor4 = this.f4147f;
                boolean z2 = this.f4151j;
                boolean z3 = this.f4152k;
                boolean z4 = this.f4153l;
                boolean z5 = z3;
                boolean z6 = z4;
                C1428a aVar = new C1428a(context, str2, cVar, dVar, arrayList, z, b, executor3, executor4, z2, z5, z6, this.f4155n, this.f4157p, this.f4158q);
                T t = (C1450h) C1449g.m6771b(this.f4142a, "_Impl");
                t.mo5601l(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: e */
        public C1451a<T> mo5611e() {
            this.f4152k = false;
            this.f4153l = true;
            return this;
        }

        /* renamed from: f */
        public C1451a<T> mo5612f(C5250c.C5254c cVar) {
            this.f4148g = cVar;
            return this;
        }

        /* renamed from: g */
        public C1451a<T> mo5613g(Executor executor) {
            this.f4146e = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.h$b */
    /* compiled from: RoomDatabase */
    public static abstract class C1452b {
        /* renamed from: a */
        public void mo5614a(C5249b bVar) {
        }

        /* renamed from: b */
        public void mo5615b(C5249b bVar) {
        }

        /* renamed from: c */
        public void mo5616c(C5249b bVar) {
        }
    }

    /* renamed from: androidx.room.h$c */
    /* compiled from: RoomDatabase */
    public enum C1453c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: a */
        private static boolean m6801a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1453c mo5617b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m6801a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.h$d */
    /* compiled from: RoomDatabase */
    public static class C1454d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C4961a>> f4163a = new HashMap<>();

        /* renamed from: a */
        private void m6803a(C4961a aVar) {
            int i = aVar.f26039a;
            int i2 = aVar.f26040b;
            TreeMap treeMap = this.f4163a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f4163a.put(Integer.valueOf(i), treeMap);
            }
            C4961a aVar2 = (C4961a) treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* renamed from: d */
        private List<C4961a> m6804d(List<C4961a> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f4163a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        /* renamed from: b */
        public void mo5618b(C4961a... aVarArr) {
            for (C4961a a : aVarArr) {
                m6803a(a);
            }
        }

        /* renamed from: c */
        public List<C4961a> mo5619c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m6804d(new ArrayList(), i2 > i, i, i2);
        }
    }

    /* renamed from: n */
    private static boolean m6773n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public void mo5590a() {
        if (!this.f4136f && m6773n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void mo5591b() {
        if (!mo5600k() && this.f4140j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo5592c() {
        mo5590a();
        C5249b x0 = this.f4134d.mo5636x0();
        this.f4135e.mo5574m(x0);
        x0.mo19240u();
    }

    /* renamed from: d */
    public C5257f mo5593d(String str) {
        mo5590a();
        mo5591b();
        return this.f4134d.mo5636x0().mo19233N(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C1436e mo5594e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C5250c mo5595f(C1428a aVar);

    @Deprecated
    /* renamed from: g */
    public void mo5596g() {
        this.f4134d.mo5636x0().mo19232D0();
        if (!mo5600k()) {
            this.f4135e.mo5570f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Lock mo5597h() {
        return this.f4139i.readLock();
    }

    /* renamed from: i */
    public C5250c mo5598i() {
        return this.f4134d;
    }

    /* renamed from: j */
    public Executor mo5599j() {
        return this.f4132b;
    }

    /* renamed from: k */
    public boolean mo5600k() {
        return this.f4134d.mo5636x0().mo19235a1();
    }

    /* renamed from: l */
    public void mo5601l(C1428a aVar) {
        C5250c f = mo5595f(aVar);
        this.f4134d = f;
        if (f instanceof C1458j) {
            ((C1458j) f).mo5632b(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f4073g == C1453c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f4134d.setWriteAheadLoggingEnabled(z);
        }
        this.f4138h = aVar.f4071e;
        this.f4132b = aVar.f4074h;
        this.f4133c = new C1460l(aVar.f4075i);
        this.f4136f = aVar.f4072f;
        this.f4137g = z;
        if (aVar.f4076j) {
            this.f4135e.mo5572i(aVar.f4068b, aVar.f4069c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5602m(C5249b bVar) {
        this.f4135e.mo5568d(bVar);
    }

    /* renamed from: o */
    public boolean mo5603o() {
        C5249b bVar = this.f4131a;
        return bVar != null && bVar.isOpen();
    }

    /* renamed from: p */
    public Cursor mo5604p(C5256e eVar) {
        return mo5605q(eVar, (CancellationSignal) null);
    }

    /* renamed from: q */
    public Cursor mo5605q(C5256e eVar, CancellationSignal cancellationSignal) {
        mo5590a();
        mo5591b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f4134d.mo5636x0().mo19239o1(eVar);
        }
        return this.f4134d.mo5636x0().mo19230A1(eVar, cancellationSignal);
    }

    @Deprecated
    /* renamed from: r */
    public void mo5606r() {
        this.f4134d.mo5636x0().mo19237n0();
    }
}
