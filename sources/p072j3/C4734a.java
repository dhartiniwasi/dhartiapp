package p072j3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p005a3.C0091a;
import p005a3.C0093c;
import p092m2.C5029p;
import p161w3.C5917a;
import p161w3.C5947k0;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: j3.a */
/* compiled from: SsManifest */
public class C4734a implements C0091a<C4734a> {

    /* renamed from: a */
    public final int f25333a;

    /* renamed from: b */
    public final int f25334b;

    /* renamed from: c */
    public final int f25335c;

    /* renamed from: d */
    public final boolean f25336d;

    /* renamed from: e */
    public final C4735a f25337e;

    /* renamed from: f */
    public final C4736b[] f25338f;

    /* renamed from: g */
    public final long f25339g;

    /* renamed from: h */
    public final long f25340h;

    /* renamed from: j3.a$a */
    /* compiled from: SsManifest */
    public static class C4735a {

        /* renamed from: a */
        public final UUID f25341a;

        /* renamed from: b */
        public final byte[] f25342b;

        /* renamed from: c */
        public final C5029p[] f25343c;

        public C4735a(UUID uuid, byte[] bArr, C5029p[] pVarArr) {
            this.f25341a = uuid;
            this.f25342b = bArr;
            this.f25343c = pVarArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4734a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C4735a aVar, C4736b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : C5953m0.m35095N0(j2, 1000000, j), j3 != 0 ? C5953m0.m35095N0(j3, 1000000, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    /* renamed from: b */
    public final C4734a mo215a(List<C0093c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C4736b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            C0093c cVar = (C0093c) arrayList.get(i);
            C4736b bVar2 = this.f25338f[cVar.f256b];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.mo18396b((C6272r1[]) arrayList3.toArray(new C6272r1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f25353j[cVar.f257c]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.mo18396b((C6272r1[]) arrayList3.toArray(new C6272r1[0])));
        }
        return new C4734a(this.f25333a, this.f25334b, this.f25339g, this.f25340h, this.f25335c, this.f25336d, this.f25337e, (C4736b[]) arrayList2.toArray(new C4736b[0]));
    }

    /* renamed from: j3.a$b */
    /* compiled from: SsManifest */
    public static class C4736b {

        /* renamed from: a */
        public final int f25344a;

        /* renamed from: b */
        public final String f25345b;

        /* renamed from: c */
        public final long f25346c;

        /* renamed from: d */
        public final String f25347d;

        /* renamed from: e */
        public final int f25348e;

        /* renamed from: f */
        public final int f25349f;

        /* renamed from: g */
        public final int f25350g;

        /* renamed from: h */
        public final int f25351h;

        /* renamed from: i */
        public final String f25352i;

        /* renamed from: j */
        public final C6272r1[] f25353j;

        /* renamed from: k */
        public final int f25354k;

        /* renamed from: l */
        private final String f25355l;

        /* renamed from: m */
        private final String f25356m;

        /* renamed from: n */
        private final List<Long> f25357n;

        /* renamed from: o */
        private final long[] f25358o;

        /* renamed from: p */
        private final long f25359p;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C4736b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6272r1[] r1VarArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, r1VarArr, list, C5953m0.m35097O0(list, 1000000, j), C5953m0.m35095N0(j2, 1000000, j));
            String str6 = str;
            String str7 = str2;
            int i6 = i;
        }

        /* renamed from: a */
        public Uri mo18395a(int i, int i2) {
            boolean z = true;
            C5917a.m34873f(this.f25353j != null);
            C5917a.m34873f(this.f25357n != null);
            if (i2 >= this.f25357n.size()) {
                z = false;
            }
            C5917a.m34873f(z);
            String num = Integer.toString(this.f25353j[i].f30239h);
            String l = this.f25357n.get(i2).toString();
            return C5947k0.m35055e(this.f25355l, this.f25356m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public C4736b mo18396b(C6272r1[] r1VarArr) {
            String str = this.f25355l;
            return new C4736b(str, this.f25356m, this.f25344a, this.f25345b, this.f25346c, this.f25347d, this.f25348e, this.f25349f, this.f25350g, this.f25351h, this.f25352i, r1VarArr, this.f25357n, this.f25358o, this.f25359p);
        }

        /* renamed from: c */
        public long mo18397c(int i) {
            if (i == this.f25354k - 1) {
                return this.f25359p;
            }
            long[] jArr = this.f25358o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int mo18398d(long j) {
            return C5953m0.m35136i(this.f25358o, j, true, true);
        }

        /* renamed from: e */
        public long mo18399e(int i) {
            return this.f25358o[i];
        }

        private C4736b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C6272r1[] r1VarArr, List<Long> list, long[] jArr, long j2) {
            this.f25355l = str;
            this.f25356m = str2;
            this.f25344a = i;
            this.f25345b = str3;
            this.f25346c = j;
            this.f25347d = str4;
            this.f25348e = i2;
            this.f25349f = i3;
            this.f25350g = i4;
            this.f25351h = i5;
            this.f25352i = str5;
            this.f25353j = r1VarArr;
            this.f25357n = list;
            this.f25358o = jArr;
            this.f25359p = j2;
            this.f25354k = list.size();
        }
    }

    private C4734a(int i, int i2, long j, long j2, int i3, boolean z, C4735a aVar, C4736b[] bVarArr) {
        this.f25333a = i;
        this.f25334b = i2;
        this.f25339g = j;
        this.f25340h = j2;
        this.f25335c = i3;
        this.f25336d = z;
        this.f25337e = aVar;
        this.f25338f = bVarArr;
    }
}
