package p180z4;

/* renamed from: z4.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C6390r {
    /* renamed from: a */
    static int m37483a(int i) {
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        while (i2 < 3) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }
}
