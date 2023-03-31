package p128r3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p079k3.C4864b;
import p161w3.C5917a;

/* renamed from: r3.d */
/* compiled from: TtmlNode */
final class C5449d {

    /* renamed from: a */
    public final String f27729a;

    /* renamed from: b */
    public final String f27730b;

    /* renamed from: c */
    public final boolean f27731c;

    /* renamed from: d */
    public final long f27732d;

    /* renamed from: e */
    public final long f27733e;

    /* renamed from: f */
    public final C5452g f27734f;

    /* renamed from: g */
    private final String[] f27735g;

    /* renamed from: h */
    public final String f27736h;

    /* renamed from: i */
    public final String f27737i;

    /* renamed from: j */
    public final C5449d f27738j;

    /* renamed from: k */
    private final HashMap<String, Integer> f27739k;

    /* renamed from: l */
    private final HashMap<String, Integer> f27740l;

    /* renamed from: m */
    private List<C5449d> f27741m;

    private C5449d(String str, String str2, long j, long j2, C5452g gVar, String[] strArr, String str3, String str4, C5449d dVar) {
        this.f27729a = str;
        this.f27730b = str2;
        this.f27737i = str4;
        this.f27734f = gVar;
        this.f27735g = strArr;
        this.f27731c = str2 != null;
        this.f27732d = j;
        this.f27733e = j2;
        this.f27736h = (String) C5917a.m34872e(str3);
        this.f27738j = dVar;
        this.f27739k = new HashMap<>();
        this.f27740l = new HashMap<>();
    }

    /* renamed from: b */
    private void m33323b(Map<String, C5452g> map, C4864b.C4866b bVar, int i, int i2, int i3) {
        C5452g f = C5451f.m33344f(this.f27734f, this.f27735g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.mo18628e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.mo18638o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f != null) {
            C5451f.m33339a(spannableStringBuilder2, i, i2, f, this.f27738j, map, i3);
            if ("p".equals(this.f27729a)) {
                if (f.mo19740k() != Float.MAX_VALUE) {
                    bVar.mo18636m((f.mo19740k() * -90.0f) / 100.0f);
                }
                if (f.mo19742m() != null) {
                    bVar.mo18639p(f.mo19742m());
                }
                if (f.mo19737h() != null) {
                    bVar.mo18633j(f.mo19737h());
                }
            }
        }
    }

    /* renamed from: c */
    public static C5449d m33324c(String str, long j, long j2, C5452g gVar, String[] strArr, String str2, String str3, C5449d dVar) {
        return new C5449d(str, (String) null, j, j2, gVar, strArr, str2, str3, dVar);
    }

    /* renamed from: d */
    public static C5449d m33325d(String str) {
        return new C5449d((String) null, C5451f.m33340b(str), -9223372036854775807L, -9223372036854775807L, (C5452g) null, (String[]) null, "", (String) null, (C5449d) null);
    }

    /* renamed from: e */
    private static void m33326e(SpannableStringBuilder spannableStringBuilder) {
        for (C5443a aVar : (C5443a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5443a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == 10) {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == 10) {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: i */
    private void m33327i(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f27729a);
        boolean equals2 = "div".equals(this.f27729a);
        if (z || equals || (equals2 && this.f27737i != null)) {
            long j = this.f27732d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f27733e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f27741m != null) {
            for (int i = 0; i < this.f27741m.size(); i++) {
                this.f27741m.get(i).m33327i(treeSet, z || equals);
            }
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m33328k(String str, Map<String, C4864b.C4866b> map) {
        if (!map.containsKey(str)) {
            C4864b.C4866b bVar = new C4864b.C4866b();
            bVar.mo18638o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C5917a.m34872e(map.get(str).mo18628e());
    }

    /* renamed from: n */
    private void m33329n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f27736h)) {
            str = this.f27736h;
        }
        if (!mo19718m(j) || !"div".equals(this.f27729a) || this.f27737i == null) {
            for (int i = 0; i < mo19714g(); i++) {
                mo19713f(i).m33329n(j, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f27737i));
    }

    /* renamed from: o */
    private void m33330o(long j, Map<String, C5452g> map, Map<String, C5450e> map2, String str, Map<String, C4864b.C4866b> map3) {
        int i;
        if (mo19718m(j)) {
            String str2 = "".equals(this.f27736h) ? str : this.f27736h;
            Iterator<Map.Entry<String, Integer>> it = this.f27740l.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                int intValue = this.f27739k.containsKey(str3) ? this.f27739k.get(str3).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    m33323b(map, (C4864b.C4866b) C5917a.m34872e(map3.get(str3)), intValue, intValue2, ((C5450e) C5917a.m34872e(map2.get(str2))).f27751j);
                } else {
                    Map<String, C5450e> map4 = map2;
                    Map<String, C4864b.C4866b> map5 = map3;
                }
            }
            Map<String, C5450e> map6 = map2;
            Map<String, C4864b.C4866b> map7 = map3;
            while (i < mo19714g()) {
                mo19713f(i).m33330o(j, map, map2, str2, map3);
                i++;
                Map<String, C5450e> map8 = map2;
            }
        }
    }

    /* renamed from: p */
    private void m33331p(long j, boolean z, String str, Map<String, C4864b.C4866b> map) {
        this.f27739k.clear();
        this.f27740l.clear();
        if (!"metadata".equals(this.f27729a)) {
            if (!"".equals(this.f27736h)) {
                str = this.f27736h;
            }
            if (this.f27731c && z) {
                m33328k(str, map).append((CharSequence) C5917a.m34872e(this.f27730b));
            } else if ("br".equals(this.f27729a) && z) {
                m33328k(str, map).append(10);
            } else if (mo19718m(j)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f27739k.put((String) next.getKey(), Integer.valueOf(((CharSequence) C5917a.m34872e(((C4864b.C4866b) next.getValue()).mo18628e())).length()));
                }
                boolean equals = "p".equals(this.f27729a);
                for (int i = 0; i < mo19714g(); i++) {
                    mo19713f(i).m33331p(j, z || equals, str, map);
                }
                if (equals) {
                    C5451f.m33341c(m33328k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f27740l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) C5917a.m34872e(((C4864b.C4866b) next2.getValue()).mo18628e())).length()));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19712a(C5449d dVar) {
        if (this.f27741m == null) {
            this.f27741m = new ArrayList();
        }
        this.f27741m.add(dVar);
    }

    /* renamed from: f */
    public C5449d mo19713f(int i) {
        List<C5449d> list = this.f27741m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo19714g() {
        List<C5449d> list = this.f27741m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C4864b> mo19715h(long j, Map<String, C5452g> map, Map<String, C5450e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        m33329n(j, this.f27736h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        m33331p(j2, false, this.f27736h, treeMap);
        m33330o(j2, map, map2, this.f27736h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C5450e eVar = (C5450e) C5917a.m34872e(map2.get(pair.first));
                arrayList2.add(new C4864b.C4866b().mo18629f(decodeByteArray).mo18634k(eVar.f27743b).mo18635l(0).mo18631h(eVar.f27744c, 0).mo18632i(eVar.f27746e).mo18637n(eVar.f27747f).mo18630g(eVar.f27748g).mo18641r(eVar.f27751j).mo18624a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C5450e eVar2 = (C5450e) C5917a.m34872e(map2.get(entry.getKey()));
            C4864b.C4866b bVar = (C4864b.C4866b) entry.getValue();
            m33326e((SpannableStringBuilder) C5917a.m34872e(bVar.mo18628e()));
            bVar.mo18631h(eVar2.f27744c, eVar2.f27745d);
            bVar.mo18632i(eVar2.f27746e);
            bVar.mo18634k(eVar2.f27743b);
            bVar.mo18637n(eVar2.f27747f);
            bVar.mo18640q(eVar2.f27750i, eVar2.f27749h);
            bVar.mo18641r(eVar2.f27751j);
            arrayList2.add(bVar.mo18624a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public long[] mo19716j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m33327i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] mo19717l() {
        return this.f27735g;
    }

    /* renamed from: m */
    public boolean mo19718m(long j) {
        long j2 = this.f27732d;
        return (j2 == -9223372036854775807L && this.f27733e == -9223372036854775807L) || (j2 <= j && this.f27733e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f27733e) || (j2 <= j && j < this.f27733e));
    }
}
