package p219e7;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p182a7.C6431n;

/* renamed from: e7.d */
/* compiled from: Ints */
public final class C9998d extends C10000e {

    /* renamed from: e7.d$a */
    /* compiled from: Ints */
    private static class C9999a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a */
        final int[] f39952a;

        /* renamed from: b */
        final int f39953b;

        /* renamed from: c */
        final int f39954c;

        C9999a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: b */
        public Integer get(int i) {
            C6431n.m37559l(i, size());
            return Integer.valueOf(this.f39952a[this.f39953b + i]);
        }

        /* renamed from: c */
        public Integer set(int i, Integer num) {
            C6431n.m37559l(i, size());
            int[] iArr = this.f39952a;
            int i2 = this.f39953b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C6431n.m37561n(num)).intValue();
            return Integer.valueOf(i3);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C9998d.m51073h(this.f39952a, ((Integer) obj).intValue(), this.f39953b, this.f39954c) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9999a)) {
                return super.equals(obj);
            }
            C9999a aVar = (C9999a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f39952a[this.f39953b + i] != aVar.f39952a[aVar.f39953b + i]) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int[] mo32559f() {
            return Arrays.copyOfRange(this.f39952a, this.f39953b, this.f39954c);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f39953b; i2 < this.f39954c; i2++) {
                i = (i * 31) + C9998d.m51071f(this.f39952a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = C9998d.m51073h(this.f39952a, ((Integer) obj).intValue(), this.f39953b, this.f39954c)) < 0) {
                return -1;
            }
            return a - this.f39953b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = C9998d.m51074i(this.f39952a, ((Integer) obj).intValue(), this.f39953b, this.f39954c)) < 0) {
                return -1;
            }
            return b - this.f39953b;
        }

        public int size() {
            return this.f39954c - this.f39953b;
        }

        public List<Integer> subList(int i, int i2) {
            C6431n.m37566s(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f39952a;
            int i3 = this.f39953b;
            return new C9999a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f39952a[this.f39953b]);
            int i = this.f39953b;
            while (true) {
                i++;
                if (i < this.f39954c) {
                    sb.append(", ");
                    sb.append(this.f39952a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C9999a(int[] iArr, int i, int i2) {
            this.f39952a = iArr;
            this.f39953b = i;
            this.f39954c = i2;
        }
    }

    /* renamed from: c */
    public static List<Integer> m51068c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C9999a(iArr);
    }

    /* renamed from: d */
    public static int m51069d(long j) {
        int i = (int) j;
        C6431n.m37556i(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: e */
    public static int m51070e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m51071f(int i) {
        return i;
    }

    /* renamed from: g */
    public static int m51072g(int[] iArr, int i) {
        return m51073h(iArr, i, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m51073h(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m51074i(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static int m51075j(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }

    /* renamed from: k */
    public static int[] m51076k(Collection<? extends Number> collection) {
        if (collection instanceof C9999a) {
            return ((C9999a) collection).mo32559f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C6431n.m37561n(array[i])).intValue();
        }
        return iArr;
    }
}
