package p059h3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p005a3.C0093c;
import p030d2.C4035m;
import p177z1.C6272r1;

/* renamed from: h3.h */
/* compiled from: HlsMultivariantPlaylist */
public class C4456h extends C4459i {

    /* renamed from: n */
    public static final C4456h f24736n = new C4456h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C6272r1) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f24737d;

    /* renamed from: e */
    public final List<C4458b> f24738e;

    /* renamed from: f */
    public final List<C4457a> f24739f;

    /* renamed from: g */
    public final List<C4457a> f24740g;

    /* renamed from: h */
    public final List<C4457a> f24741h;

    /* renamed from: i */
    public final List<C4457a> f24742i;

    /* renamed from: j */
    public final C6272r1 f24743j;

    /* renamed from: k */
    public final List<C6272r1> f24744k;

    /* renamed from: l */
    public final Map<String, String> f24745l;

    /* renamed from: m */
    public final List<C4035m> f24746m;

    /* renamed from: h3.h$a */
    /* compiled from: HlsMultivariantPlaylist */
    public static final class C4457a {

        /* renamed from: a */
        public final Uri f24747a;

        /* renamed from: b */
        public final C6272r1 f24748b;

        /* renamed from: c */
        public final String f24749c;

        /* renamed from: d */
        public final String f24750d;

        public C4457a(Uri uri, C6272r1 r1Var, String str, String str2) {
            this.f24747a = uri;
            this.f24748b = r1Var;
            this.f24749c = str;
            this.f24750d = str2;
        }
    }

    /* renamed from: h3.h$b */
    /* compiled from: HlsMultivariantPlaylist */
    public static final class C4458b {

        /* renamed from: a */
        public final Uri f24751a;

        /* renamed from: b */
        public final C6272r1 f24752b;

        /* renamed from: c */
        public final String f24753c;

        /* renamed from: d */
        public final String f24754d;

        /* renamed from: e */
        public final String f24755e;

        /* renamed from: f */
        public final String f24756f;

        public C4458b(Uri uri, C6272r1 r1Var, String str, String str2, String str3, String str4) {
            this.f24751a = uri;
            this.f24752b = r1Var;
            this.f24753c = str;
            this.f24754d = str2;
            this.f24755e = str3;
            this.f24756f = str4;
        }

        /* renamed from: b */
        public static C4458b m29496b(Uri uri) {
            return new C4458b(uri, new C6272r1.C6274b().mo21505S("0").mo21497K("application/x-mpegURL").mo21491E(), (String) null, (String) null, (String) null, (String) null);
        }

        /* renamed from: a */
        public C4458b mo18006a(C6272r1 r1Var) {
            return new C4458b(this.f24751a, r1Var, this.f24753c, this.f24754d, this.f24755e, this.f24756f);
        }
    }

    public C4456h(String str, List<String> list, List<C4458b> list2, List<C4457a> list3, List<C4457a> list4, List<C4457a> list5, List<C4457a> list6, C6272r1 r1Var, List<C6272r1> list7, boolean z, Map<String, String> map, List<C4035m> list8) {
        super(str, list, z);
        this.f24737d = Collections.unmodifiableList(m29493f(list2, list3, list4, list5, list6));
        this.f24738e = Collections.unmodifiableList(list2);
        this.f24739f = Collections.unmodifiableList(list3);
        this.f24740g = Collections.unmodifiableList(list4);
        this.f24741h = Collections.unmodifiableList(list5);
        this.f24742i = Collections.unmodifiableList(list6);
        this.f24743j = r1Var;
        this.f24744k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f24745l = Collections.unmodifiableMap(map);
        this.f24746m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    private static void m29490b(List<C4457a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f24747a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    private static <T> List<T> m29491d(List<T> list, int i, List<C0093c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                C0093c cVar = list2.get(i3);
                if (cVar.f256b == i && cVar.f257c == i2) {
                    arrayList.add(t);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C4456h m29492e(String str) {
        return new C4456h("", Collections.emptyList(), Collections.singletonList(C4458b.m29496b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (C6272r1) null, (List<C6272r1>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    private static List<Uri> m29493f(List<C4458b> list, List<C4457a> list2, List<C4457a> list3, List<C4457a> list4, List<C4457a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f24751a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m29490b(list2, arrayList);
        m29490b(list3, arrayList);
        m29490b(list4, arrayList);
        m29490b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public C4456h mo215a(List<C0093c> list) {
        return new C4456h(this.f24757a, this.f24758b, m29491d(this.f24738e, 0, list), Collections.emptyList(), m29491d(this.f24740g, 1, list), m29491d(this.f24741h, 2, list), Collections.emptyList(), this.f24743j, this.f24744k, this.f24759c, this.f24745l, this.f24746m);
    }
}
