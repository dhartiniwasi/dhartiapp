package com.startapp;

import com.startapp.networkTest.enums.ThreeStateShort;

/* renamed from: com.startapp.f2 */
/* compiled from: Sta */
public class C8942f2 {

    /* renamed from: a */
    private static final char[] f36751a = "0123456789abcdef".toCharArray();

    /* renamed from: com.startapp.f2$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C8943a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36752a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.ThreeStateShort[] r0 = com.startapp.networkTest.enums.ThreeStateShort.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36752a = r0
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.Yes     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36752a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.No     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36752a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.Unknown     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8942f2.C8943a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m48565a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f36751a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m48566a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    /* renamed from: a */
    public static int m48564a(ThreeStateShort threeStateShort) {
        int i = C8943a.f36752a[threeStateShort.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : 0;
        }
        return 1;
    }
}
