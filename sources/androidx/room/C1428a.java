package androidx.room;

import android.content.Context;
import androidx.room.C1450h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p111p0.C5250c;

/* renamed from: androidx.room.a */
/* compiled from: DatabaseConfiguration */
public class C1428a {

    /* renamed from: a */
    public final C5250c.C5254c f4067a;

    /* renamed from: b */
    public final Context f4068b;

    /* renamed from: c */
    public final String f4069c;

    /* renamed from: d */
    public final C1450h.C1454d f4070d;

    /* renamed from: e */
    public final List<C1450h.C1452b> f4071e;

    /* renamed from: f */
    public final boolean f4072f;

    /* renamed from: g */
    public final C1450h.C1453c f4073g;

    /* renamed from: h */
    public final Executor f4074h;

    /* renamed from: i */
    public final Executor f4075i;

    /* renamed from: j */
    public final boolean f4076j;

    /* renamed from: k */
    public final boolean f4077k;

    /* renamed from: l */
    public final boolean f4078l;

    /* renamed from: m */
    private final Set<Integer> f4079m;

    /* renamed from: n */
    public final String f4080n;

    /* renamed from: o */
    public final File f4081o;

    public C1428a(Context context, String str, C5250c.C5254c cVar, C1450h.C1454d dVar, List<C1450h.C1452b> list, boolean z, C1450h.C1453c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f4067a = cVar;
        this.f4068b = context;
        this.f4069c = str;
        this.f4070d = dVar;
        this.f4071e = list;
        this.f4072f = z;
        this.f4073g = cVar2;
        this.f4074h = executor;
        this.f4075i = executor2;
        this.f4076j = z2;
        this.f4077k = z3;
        this.f4078l = z4;
        this.f4079m = set;
        this.f4080n = str2;
        this.f4081o = file;
    }

    /* renamed from: a */
    public boolean mo5558a(int i, int i2) {
        Set<Integer> set;
        if ((!(i > i2) || !this.f4078l) && this.f4077k && ((set = this.f4079m) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }
}
