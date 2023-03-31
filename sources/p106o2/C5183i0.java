package p106o2;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import p037e2.C4217n;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p177z1.C6249m2;

/* renamed from: o2.i0 */
/* compiled from: TsPayloadReader */
public interface C5183i0 {

    /* renamed from: o2.i0$a */
    /* compiled from: TsPayloadReader */
    public static final class C5184a {

        /* renamed from: a */
        public final String f26835a;

        /* renamed from: b */
        public final int f26836b;

        /* renamed from: c */
        public final byte[] f26837c;

        public C5184a(String str, int i, byte[] bArr) {
            this.f26835a = str;
            this.f26836b = i;
            this.f26837c = bArr;
        }
    }

    /* renamed from: o2.i0$b */
    /* compiled from: TsPayloadReader */
    public static final class C5185b {

        /* renamed from: a */
        public final int f26838a;

        /* renamed from: b */
        public final String f26839b;

        /* renamed from: c */
        public final List<C5184a> f26840c;

        /* renamed from: d */
        public final byte[] f26841d;

        public C5185b(int i, String str, List<C5184a> list, byte[] bArr) {
            List<C5184a> list2;
            this.f26838a = i;
            this.f26839b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f26840c = list2;
            this.f26841d = bArr;
        }
    }

    /* renamed from: o2.i0$c */
    /* compiled from: TsPayloadReader */
    public interface C5186c {
        /* renamed from: a */
        C5183i0 mo19162a(int i, C5185b bVar);

        /* renamed from: b */
        SparseArray<C5183i0> mo19163b();
    }

    /* renamed from: o2.i0$d */
    /* compiled from: TsPayloadReader */
    public static final class C5187d {

        /* renamed from: a */
        private final String f26842a;

        /* renamed from: b */
        private final int f26843b;

        /* renamed from: c */
        private final int f26844c;

        /* renamed from: d */
        private int f26845d;

        /* renamed from: e */
        private String f26846e;

        public C5187d(int i, int i2) {
            this(RecyclerView.UNDEFINED_DURATION, i, i2);
        }

        /* renamed from: d */
        private void m32224d() {
            if (this.f26845d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo19164a() {
            int i = this.f26845d;
            this.f26845d = i == Integer.MIN_VALUE ? this.f26843b : i + this.f26844c;
            this.f26846e = this.f26842a + this.f26845d;
        }

        /* renamed from: b */
        public String mo19165b() {
            m32224d();
            return this.f26846e;
        }

        /* renamed from: c */
        public int mo19166c() {
            m32224d();
            return this.f26845d;
        }

        public C5187d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f26842a = str;
            this.f26843b = i2;
            this.f26844c = i3;
            this.f26845d = RecyclerView.UNDEFINED_DURATION;
            this.f26846e = "";
        }
    }

    /* renamed from: a */
    void mo19152a(C5918a0 a0Var, int i) throws C6249m2;

    /* renamed from: b */
    void mo19153b();

    /* renamed from: c */
    void mo19154c(C5940i0 i0Var, C4217n nVar, C5187d dVar);
}
