package p336qe;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: qe.m */
/* compiled from: Options */
public final class C12245m extends AbstractList<C12235f> implements RandomAccess {

    /* renamed from: a */
    final C12235f[] f45403a;

    /* renamed from: b */
    final int[] f45404b;

    private C12245m(C12235f[] fVarArr, int[] iArr) {
        this.f45403a = fVarArr;
        this.f45404b = iArr;
    }

    /* renamed from: b */
    private static void m58821b(long j, C12231c cVar, int i, List<C12235f> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        C12231c cVar2;
        int i6;
        C12231c cVar3 = cVar;
        int i7 = i;
        List<C12235f> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (list3.get(i10).mo36846w() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            C12235f fVar = list.get(i2);
            C12235f fVar2 = list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == fVar.mo36846w()) {
                i11 = list4.get(i8).intValue();
                i8++;
                fVar = list3.get(i8);
            }
            int i12 = i8;
            if (fVar.mo36839p(i7) != fVar2.mo36839p(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (list3.get(i14 - 1).mo36839p(i7) != list3.get(i14).mo36839p(i7)) {
                        i13++;
                    }
                }
                long f = j + ((long) m58822f(cVar)) + 2 + ((long) (i13 * 2));
                cVar3.mo36775O(i13);
                cVar3.mo36775O(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte p = list3.get(i15).mo36839p(i7);
                    if (i15 == i12 || p != list3.get(i15 - 1).mo36839p(i7)) {
                        cVar3.mo36775O(p & 255);
                    }
                }
                C12231c cVar4 = new C12231c();
                int i16 = i12;
                while (i16 < i9) {
                    byte p2 = list3.get(i16).mo36839p(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (p2 != list3.get(i18).mo36839p(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == list3.get(i16).mo36846w()) {
                        cVar3.mo36775O(list4.get(i16).intValue());
                        i6 = i5;
                        cVar2 = cVar4;
                    } else {
                        cVar3.mo36775O((int) ((((long) m58822f(cVar4)) + f) * -1));
                        i6 = i5;
                        cVar2 = cVar4;
                        m58821b(f, cVar4, i7 + 1, list, i16, i5, list2);
                    }
                    cVar4 = cVar2;
                    i16 = i6;
                }
                C12231c cVar5 = cVar4;
                cVar3.mo35694k1(cVar5, cVar5.mo36771I());
                return;
            }
            int i19 = 0;
            int min = Math.min(fVar.mo36846w(), fVar2.mo36846w());
            int i20 = i7;
            while (i20 < min && fVar.mo36839p(i20) == fVar2.mo36839p(i20)) {
                i19++;
                i20++;
            }
            long f2 = 1 + j + ((long) m58822f(cVar)) + 2 + ((long) i19);
            cVar3.mo36775O(-i19);
            cVar3.mo36775O(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i19;
                if (i21 >= i4) {
                    break;
                }
                cVar3.mo36775O(fVar.mo36839p(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                C12231c cVar6 = new C12231c();
                cVar3.mo36775O((int) ((((long) m58822f(cVar6)) + f2) * -1));
                m58821b(f2, cVar6, i4, list, i12, i3, list2);
                cVar3.mo35694k1(cVar6, cVar6.mo36771I());
            } else if (i4 == list3.get(i12).mo36846w()) {
                cVar3.mo36775O(list4.get(i12).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: f */
    private static int m58822f(C12231c cVar) {
        return (int) (cVar.mo36771I() / 4);
    }

    /* renamed from: i */
    public static C12245m m58823i(C12235f... fVarArr) {
        if (fVarArr.length == 0) {
            return new C12245m(new C12235f[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, fVarArr[i2]), Integer.valueOf(i2));
        }
        if (((C12235f) arrayList.get(0)).mo36846w() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                C12235f fVar = (C12235f) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    C12235f fVar2 = (C12235f) arrayList.get(i5);
                    if (!fVar2.mo36847x(fVar)) {
                        continue;
                        break;
                    } else if (fVar2.mo36846w() == fVar.mo36846w()) {
                        throw new IllegalArgumentException("duplicate option: " + fVar2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            C12231c cVar = new C12231c();
            m58821b(0, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int f = m58822f(cVar);
            int[] iArr = new int[f];
            for (int i6 = 0; i6 < f; i6++) {
                iArr[i6] = cVar.readInt();
            }
            if (cVar.mo36784Z()) {
                return new C12245m((C12235f[]) fVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    /* renamed from: c */
    public C12235f get(int i) {
        return this.f45403a[i];
    }

    public final int size() {
        return this.f45403a.length;
    }
}
