package p025c8;

import android.database.Cursor;
import java.util.SortedSet;
import p191b8.C6722e;
import p211d8.C9888l;
import p211d8.C9893q;
import p247h8.C10456n;

/* renamed from: c8.z1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1966z1 implements C10456n {

    /* renamed from: a */
    public final /* synthetic */ SortedSet f5652a;

    /* renamed from: b */
    public final /* synthetic */ C9893q f5653b;

    /* renamed from: c */
    public final /* synthetic */ C9888l f5654c;

    public /* synthetic */ C1966z1(SortedSet sortedSet, C9893q qVar, C9888l lVar) {
        this.f5652a = sortedSet;
        this.f5653b = qVar;
        this.f5654c = lVar;
    }

    public final void accept(Object obj) {
        this.f5652a.add(C6722e.m38594b(this.f5653b.mo32325f(), this.f5654c, ((Cursor) obj).getBlob(0), ((Cursor) obj).getBlob(1)));
    }
}
