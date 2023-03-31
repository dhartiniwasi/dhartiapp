package p211d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: d8.u */
/* compiled from: ResourcePath */
public final class C9903u extends C9881e<C9903u> {

    /* renamed from: b */
    public static final C9903u f39750b = new C9903u(Collections.emptyList());

    private C9903u(List<String> list) {
        super(list);
    }

    /* renamed from: v */
    public static C9903u m50783v(List<String> list) {
        return list.isEmpty() ? f39750b : new C9903u(list);
    }

    /* renamed from: w */
    public static C9903u m50784w(String str) {
        if (!str.contains("//")) {
            String[] split = str.split("/");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                }
            }
            return new C9903u(arrayList);
        }
        throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
    }

    /* renamed from: c */
    public String mo32348c() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f39707a.size(); i++) {
            if (i > 0) {
                sb.append("/");
            }
            sb.append(this.f39707a.get(i));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C9903u mo32353k(List<String> list) {
        return new C9903u(list);
    }
}
