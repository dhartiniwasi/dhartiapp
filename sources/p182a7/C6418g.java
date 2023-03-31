package p182a7;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: a7.g */
/* compiled from: Joiner */
public class C6418g {

    /* renamed from: a */
    private final String f30668a;

    private C6418g(String str) {
        this.f30668a = (String) C6431n.m37561n(str);
    }

    /* renamed from: e */
    public static C6418g m37520e(char c) {
        return new C6418g(String.valueOf(c));
    }

    /* renamed from: a */
    public <A extends Appendable> A mo21834a(A a, Iterator<? extends Object> it) throws IOException {
        C6431n.m37561n(a);
        if (it.hasNext()) {
            a.append(mo21838f(it.next()));
            while (it.hasNext()) {
                a.append(this.f30668a);
                a.append(mo21838f(it.next()));
            }
        }
        return a;
    }

    /* renamed from: b */
    public final StringBuilder mo21835b(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            mo21834a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final String mo21836c(Iterable<? extends Object> iterable) {
        return mo21837d(iterable.iterator());
    }

    /* renamed from: d */
    public final String mo21837d(Iterator<? extends Object> it) {
        return mo21835b(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public CharSequence mo21838f(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
