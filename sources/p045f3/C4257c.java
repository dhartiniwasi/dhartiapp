package p045f3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p005a3.C0091a;
import p005a3.C0093c;
import p161w3.C5953m0;

/* renamed from: f3.c */
/* compiled from: DashManifest */
public class C4257c implements C0091a<C4257c> {

    /* renamed from: a */
    public final long f23647a;

    /* renamed from: b */
    public final long f23648b;

    /* renamed from: c */
    public final long f23649c;

    /* renamed from: d */
    public final boolean f23650d;

    /* renamed from: e */
    public final long f23651e;

    /* renamed from: f */
    public final long f23652f;

    /* renamed from: g */
    public final long f23653g;

    /* renamed from: h */
    public final long f23654h;

    /* renamed from: i */
    public final C4278o f23655i;

    /* renamed from: j */
    public final C4275l f23656j;

    /* renamed from: k */
    public final Uri f23657k;

    /* renamed from: l */
    public final C4263h f23658l;

    /* renamed from: m */
    private final List<C4262g> f23659m;

    public C4257c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C4263h hVar, C4278o oVar, C4275l lVar, Uri uri, List<C4262g> list) {
        this.f23647a = j;
        this.f23648b = j2;
        this.f23649c = j3;
        this.f23650d = z;
        this.f23651e = j4;
        this.f23652f = j5;
        this.f23653g = j6;
        this.f23654h = j7;
        this.f23658l = hVar;
        this.f23655i = oVar;
        this.f23657k = uri;
        this.f23656j = lVar;
        this.f23659m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    private static ArrayList<C4255a> m28672c(List<C4255a> list, LinkedList<C0093c> linkedList) {
        C0093c poll = linkedList.poll();
        int i = poll.f255a;
        ArrayList<C4255a> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f256b;
            C4255a aVar = list.get(i2);
            List<C4265j> list2 = aVar.f23639c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f257c));
                poll = linkedList.poll();
                if (!(poll.f255a == i && poll.f256b == i2)) {
                    arrayList.add(new C4255a(aVar.f23637a, aVar.f23638b, arrayList2, aVar.f23640d, aVar.f23641e, aVar.f23642f));
                }
                arrayList2.add(list2.get(poll.f257c));
                poll = linkedList.poll();
                break;
            } while (poll.f256b == i2);
            arrayList.add(new C4255a(aVar.f23637a, aVar.f23638b, arrayList2, aVar.f23640d, aVar.f23641e, aVar.f23642f));
        } while (poll.f255a == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final C4257c mo215a(List<C0093c> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C0093c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= mo17625e()) {
                break;
            }
            if (((C0093c) linkedList.peek()).f255a != i) {
                long f = mo17626f(i);
                if (f != -9223372036854775807L) {
                    j2 += f;
                }
            } else {
                C4262g d = mo17624d(i);
                arrayList.add(new C4262g(d.f23682a, d.f23683b - j2, m28672c(d.f23684c, linkedList), d.f23685d));
            }
            i++;
        }
        long j3 = this.f23648b;
        if (j3 != -9223372036854775807L) {
            j = j3 - j2;
        }
        return new C4257c(this.f23647a, j, this.f23649c, this.f23650d, this.f23651e, this.f23652f, this.f23653g, this.f23654h, this.f23658l, this.f23655i, this.f23656j, this.f23657k, arrayList);
    }

    /* renamed from: d */
    public final C4262g mo17624d(int i) {
        return this.f23659m.get(i);
    }

    /* renamed from: e */
    public final int mo17625e() {
        return this.f23659m.size();
    }

    /* renamed from: f */
    public final long mo17626f(int i) {
        if (i != this.f23659m.size() - 1) {
            return this.f23659m.get(i + 1).f23683b - this.f23659m.get(i).f23683b;
        }
        long j = this.f23648b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - this.f23659m.get(i).f23683b;
    }

    /* renamed from: g */
    public final long mo17627g(int i) {
        return C5953m0.m35071B0(mo17626f(i));
    }
}
