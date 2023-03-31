package p247h8;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.firestore.C7932p;
import com.google.firebase.firestore.C7959y;
import com.google.protobuf.C8153i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import p218e6.C9959a;
import p218e6.C9975i;
import p343rc.C12335j1;
import p343rc.C12345k1;
import p343rc.C12350l1;
import p412z6.C13463a;

/* renamed from: h8.g0 */
/* compiled from: Util */
public class C10449g0 {

    /* renamed from: a */
    private static final Random f41411a = new SecureRandom();

    /* renamed from: b */
    private static final C9959a<Void, Void> f41412b = C10433b0.f41371a;

    /* renamed from: A */
    public static String m52698A(C8153i iVar) {
        int size = iVar.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte i2 = iVar.mo26887i(i) & 255;
            sb.append(Character.forDigit(i2 >>> 4, 16));
            sb.append(Character.forDigit(i2 & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m52699B(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    /* renamed from: C */
    public static C9959a<Void, Void> m52700C() {
        return f41412b;
    }

    /* renamed from: e */
    private static <T> T m52705e(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: f */
    public static List<Object> m52706f(int i, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            Collections.addAll(arrayList, objArr);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                Object obj3 = arrayList.get(i2);
                if ((obj3 instanceof String) || (obj3 instanceof C7932p)) {
                    i2 += 2;
                } else {
                    throw new IllegalArgumentException("Excepted field name at argument position " + (i2 + i + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
    }

    /* renamed from: g */
    public static <T extends Comparable<T>> Comparator<T> m52707g() {
        return C10441f0.f41381a;
    }

    /* renamed from: h */
    public static int m52708h(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* renamed from: i */
    public static int m52709i(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            byte b = bArr[i] & 255;
            byte b2 = bArr2[i] & 255;
            if (b < b2) {
                return -1;
            }
            if (b > b2) {
                return 1;
            }
        }
        return m52712l(bArr.length, bArr2.length);
    }

    /* renamed from: j */
    public static int m52710j(C8153i iVar, C8153i iVar2) {
        int min = Math.min(iVar.size(), iVar2.size());
        for (int i = 0; i < min; i++) {
            byte i2 = iVar.mo26887i(i) & 255;
            byte i3 = iVar2.mo26887i(i) & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        return m52712l(iVar.size(), iVar2.size());
    }

    /* renamed from: k */
    public static int m52711k(double d, double d2) {
        return C13463a.m62493c(d, d2);
    }

    /* renamed from: l */
    public static int m52712l(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: m */
    public static int m52713m(long j, long j2) {
        return C13463a.m62491a(j, j2);
    }

    /* renamed from: n */
    public static int m52714n(double d, long j) {
        return C13463a.m62492b(d, j);
    }

    /* renamed from: o */
    private static Exception m52715o(Exception exc) {
        if (exc instanceof C12345k1) {
            return m52720t(((C12345k1) exc).mo37047a());
        }
        return exc instanceof C12350l1 ? m52720t(((C12350l1) exc).mo37053a()) : exc;
    }

    /* renamed from: p */
    public static void m52716p(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new C10435c0(runtimeException));
    }

    /* renamed from: q */
    public static <T> void m52717q(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, C10456n<T> nVar, C10456n<T> nVar2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        m52718r(arrayList.iterator(), arrayList2.iterator(), comparator, nVar, nVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r4 > 0) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> void m52718r(java.util.Iterator<T> r5, java.util.Iterator<T> r6, java.util.Comparator<? super T> r7, p247h8.C10456n<T> r8, p247h8.C10456n<T> r9) {
        /*
            java.lang.Object r0 = m52705e(r5)
            java.lang.Object r1 = m52705e(r6)
        L_0x0008:
            if (r0 != 0) goto L_0x000e
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            int r4 = r7.compare(r0, r1)
            if (r4 >= 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            if (r4 <= 0) goto L_0x0022
            goto L_0x0021
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r2 = 1
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            r8.accept(r1)
            java.lang.Object r1 = m52705e(r6)
            goto L_0x0008
        L_0x002d:
            if (r3 == 0) goto L_0x0037
            r9.accept(r0)
            java.lang.Object r0 = m52705e(r5)
            goto L_0x0008
        L_0x0037:
            java.lang.Object r0 = m52705e(r5)
            java.lang.Object r1 = m52705e(r6)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p247h8.C10449g0.m52718r(java.util.Iterator, java.util.Iterator, java.util.Comparator, h8.n, h8.n):void");
    }

    /* renamed from: s */
    public static <T extends Comparable<T>> void m52719s(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, C10456n<T> nVar, C10456n<T> nVar2) {
        m52718r(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : C10439e0.f41379a, nVar, nVar2);
    }

    /* renamed from: t */
    public static C7959y m52720t(C12335j1 j1Var) {
        C12345k1 c = j1Var.mo37020c();
        return new C7959y(c.getMessage(), C7959y.C7960a.m43894b(j1Var.mo37026m().mo37033c()), c);
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m52721u(Map<K, V> map, int i, Comparator<V> comparator) {
        if (map.size() <= i) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C10437d0(comparator));
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            hashMap.put(((Map.Entry) arrayList.get(i2)).getKey(), ((Map.Entry) arrayList.get(i2)).getValue());
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m52722v(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ Void m52725y(C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            return (Void) iVar.mo26358m();
        }
        Exception o = m52715o(iVar.mo26357l());
        if (o instanceof C7959y) {
            throw o;
        }
        throw new C7959y(o.getMessage(), C7959y.C7960a.UNKNOWN, o);
    }

    /* renamed from: z */
    public static StringBuilder m52726z(CharSequence charSequence, int i, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            sb.append(charSequence);
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }
}
