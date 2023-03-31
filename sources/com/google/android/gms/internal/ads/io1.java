package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;
import p060h4.C4596v;
import p067i5.C4691e;
import p073j4.C4794n1;
import p073j4.C4802q0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class io1 {

    /* renamed from: a */
    private final C4802q0 f10894a;

    /* renamed from: b */
    private final C4691e f10895b;

    /* renamed from: c */
    private final Executor f10896c;

    public io1(C4802q0 q0Var, C4691e eVar, Executor executor) {
        this.f10894a = q0Var;
        this.f10895b = eVar;
        this.f10896c = executor;
    }

    /* renamed from: c */
    private final Bitmap m14463c(byte[] bArr, BitmapFactory.Options options) {
        long b = this.f10895b.mo18371b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = this.f10895b.mo18371b();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b2 - b;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            C4794n1.m30693k("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo11181a(double d, boolean z, C2542k9 k9Var) {
        byte[] bArr = k9Var.f11966b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14593j5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m14463c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14603k5)).intValue())) / 2);
            }
        }
        return m14463c(bArr, options);
    }

    /* renamed from: b */
    public final lf3 mo11182b(String str, double d, boolean z) {
        return cf3.m10915m(this.f10894a.mo18524a(str), new ho1(this, d, z), this.f10896c);
    }
}
