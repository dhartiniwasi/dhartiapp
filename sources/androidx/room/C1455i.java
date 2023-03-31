package androidx.room;

import android.database.Cursor;
import java.util.List;
import p083l0.C4898b;
import p090m0.C4961a;
import p111p0.C5248a;
import p111p0.C5249b;
import p111p0.C5250c;

/* renamed from: androidx.room.i */
/* compiled from: RoomOpenHelper */
public class C1455i extends C5250c.C5251a {

    /* renamed from: b */
    private C1428a f4164b;

    /* renamed from: c */
    private final C1456a f4165c;

    /* renamed from: d */
    private final String f4166d;

    /* renamed from: e */
    private final String f4167e;

    /* renamed from: androidx.room.i$a */
    /* compiled from: RoomOpenHelper */
    public static abstract class C1456a {

        /* renamed from: a */
        public final int f4168a;

        public C1456a(int i) {
            this.f4168a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5625a(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo5626b(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo5627c(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo5628d(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo5629e(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo5630f(C5249b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract C1457b mo5631g(C5249b bVar);
    }

    /* renamed from: androidx.room.i$b */
    /* compiled from: RoomOpenHelper */
    public static class C1457b {

        /* renamed from: a */
        public final boolean f4169a;

        /* renamed from: b */
        public final String f4170b;

        public C1457b(boolean z, String str) {
            this.f4169a = z;
            this.f4170b = str;
        }
    }

    public C1455i(C1428a aVar, C1456a aVar2, String str, String str2) {
        super(aVar2.f4168a);
        this.f4164b = aVar;
        this.f4165c = aVar2;
        this.f4166d = str;
        this.f4167e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private void m6807h(C5249b bVar) {
        if (m6810k(bVar)) {
            String str = null;
            Cursor o1 = bVar.mo19239o1(new C5248a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (o1.moveToFirst()) {
                    str = o1.getString(0);
                }
                o1.close();
                if (!this.f4166d.equals(str) && !this.f4167e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                o1.close();
                throw th;
            }
        } else {
            C1457b g = this.f4165c.mo5631g(bVar);
            if (g.f4169a) {
                this.f4165c.mo5629e(bVar);
                m6811l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f4170b);
        }
    }

    /* renamed from: i */
    private void m6808i(C5249b bVar) {
        bVar.mo19231C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m6809j(C5249b bVar) {
        Cursor z0 = bVar.mo19241z0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (z0.moveToFirst() && z0.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            z0.close();
        }
    }

    /* renamed from: k */
    private static boolean m6810k(C5249b bVar) {
        Cursor z0 = bVar.mo19241z0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (z0.moveToFirst() && z0.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            z0.close();
        }
    }

    /* renamed from: l */
    private void m6811l(C5249b bVar) {
        m6808i(bVar);
        bVar.mo19231C(C4898b.m31102a(this.f4166d));
    }

    /* renamed from: b */
    public void mo5620b(C5249b bVar) {
        super.mo5620b(bVar);
    }

    /* renamed from: d */
    public void mo5621d(C5249b bVar) {
        boolean j = m6809j(bVar);
        this.f4165c.mo5625a(bVar);
        if (!j) {
            C1457b g = this.f4165c.mo5631g(bVar);
            if (!g.f4169a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f4170b);
            }
        }
        m6811l(bVar);
        this.f4165c.mo5627c(bVar);
    }

    /* renamed from: e */
    public void mo5622e(C5249b bVar, int i, int i2) {
        mo5624g(bVar, i, i2);
    }

    /* renamed from: f */
    public void mo5623f(C5249b bVar) {
        super.mo5623f(bVar);
        m6807h(bVar);
        this.f4165c.mo5628d(bVar);
        this.f4164b = null;
    }

    /* renamed from: g */
    public void mo5624g(C5249b bVar, int i, int i2) {
        boolean z;
        List<C4961a> c;
        C1428a aVar = this.f4164b;
        if (aVar == null || (c = aVar.f4070d.mo5619c(i, i2)) == null) {
            z = false;
        } else {
            this.f4165c.mo5630f(bVar);
            for (C4961a a : c) {
                a.mo6324a(bVar);
            }
            C1457b g = this.f4165c.mo5631g(bVar);
            if (g.f4169a) {
                this.f4165c.mo5629e(bVar);
                m6811l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f4170b);
            }
        }
        if (!z) {
            C1428a aVar2 = this.f4164b;
            if (aVar2 == null || aVar2.mo5558a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f4165c.mo5626b(bVar);
            this.f4165c.mo5625a(bVar);
        }
    }
}
