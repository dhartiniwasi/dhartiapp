package p045f3;

import java.util.Collections;
import java.util.List;

/* renamed from: f3.g */
/* compiled from: Period */
public class C4262g {

    /* renamed from: a */
    public final String f23682a;

    /* renamed from: b */
    public final long f23683b;

    /* renamed from: c */
    public final List<C4255a> f23684c;

    /* renamed from: d */
    public final List<C4261f> f23685d;

    /* renamed from: e */
    public final C4260e f23686e;

    public C4262g(String str, long j, List<C4255a> list, List<C4261f> list2) {
        this(str, j, list, list2, (C4260e) null);
    }

    /* renamed from: a */
    public int mo17678a(int i) {
        int size = this.f23684c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f23684c.get(i2).f23638b == i) {
                return i2;
            }
        }
        return -1;
    }

    public C4262g(String str, long j, List<C4255a> list, List<C4261f> list2, C4260e eVar) {
        this.f23682a = str;
        this.f23683b = j;
        this.f23684c = Collections.unmodifiableList(list);
        this.f23685d = Collections.unmodifiableList(list2);
        this.f23686e = eVar;
    }
}
