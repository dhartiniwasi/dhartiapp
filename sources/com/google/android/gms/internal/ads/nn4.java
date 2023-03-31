package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nn4 {

    /* renamed from: a */
    private static final int[] f14132a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f14133b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f14134c = {64, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f14135d = 0;

    /* renamed from: a */
    public static C2388g4 m17200a(byte[] bArr, String str, String str2, fl4 fl4) {
        x12 x12;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            x12 = new x12(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            int length = copyOf.length;
            x12 = new x12(copyOf, length);
            if (copyOf[0] == 31) {
                x12 x122 = new x12(copyOf, length);
                while (x122.mo15032a() >= 16) {
                    x122.mo15041j(2);
                    x12.mo15036e(x122.mo15034c(14), 14);
                }
            }
            x12.mo15038g(copyOf, copyOf.length);
        }
        x12.mo15041j(60);
        int i5 = f14132a[x12.mo15034c(6)];
        int i6 = f14133b[x12.mo15034c(4)];
        int c = x12.mo15034c(5);
        if (c < 29) {
            i2 = (f14134c[c] * AdError.NETWORK_ERROR_CODE) / 2;
        }
        x12.mo15041j(10);
        if (x12.mo15034c(2) > 0) {
            i = 1;
        }
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9764h(str);
        e2Var.mo9776s("audio/vnd.dts");
        e2Var.mo9757d0(i2);
        e2Var.mo9759e0(i5 + i);
        e2Var.mo9777t(i6);
        e2Var.mo9753b((fl4) null);
        e2Var.mo9768k(str2);
        return e2Var.mo9782y();
    }
}
