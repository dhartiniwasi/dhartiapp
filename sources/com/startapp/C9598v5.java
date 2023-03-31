package com.startapp;

import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.v5 */
/* compiled from: Sta */
public class C9598v5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f39289a;

    public C9598v5(List3DView list3DView) {
        this.f39289a = list3DView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r8 < r9) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f39289a
            com.startapp.u2 r1 = r0.f38346l
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x006e
            com.startapp.sdk.ads.list3d.List3DView r2 = r11.f39289a
            int r0 = r2.mo30130d(r0)
            com.startapp.sdk.ads.list3d.List3DView r3 = r11.f39289a
            int r4 = r3.f38341g
            int r0 = r0 - r4
            r2.f38339e = r0
            com.startapp.u2 r0 = r3.f38346l
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r0.f39245e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            long r4 = r2 - r4
            int r5 = (int) r4
            r4 = 50
            if (r5 <= r4) goto L_0x0032
            r5 = 50
        L_0x0032:
            r4 = r0
            com.startapp.z9 r4 = (com.startapp.C9681z9) r4
            float r6 = r4.f39242b
            r7 = 0
            float r8 = r4.f39241a
            float r9 = r4.f39243c
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            float r9 = r4.f39244d
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x0049
        L_0x0047:
            float r7 = r9 - r8
        L_0x0049:
            float r9 = r4.f39559g
            float r7 = r7 * r9
            float r7 = r7 + r6
            r4.f39242b = r7
            float r5 = (float) r5
            float r5 = r5 * r7
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            float r5 = r5 + r8
            r4.f39241a = r5
            float r5 = r4.f39558f
            float r7 = r7 * r5
            r4.f39242b = r7
        L_0x005f:
            r0.f39245e = r2
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f39289a
            com.startapp.u2 r2 = r0.f38346l
            float r2 = r2.f39241a
            int r2 = (int) r2
            int r3 = r0.f38339e
            int r2 = r2 - r3
            r0.mo30122a((int) r2)
        L_0x006e:
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f39289a
            com.startapp.u2 r0 = r0.f38346l
            r2 = 1053609165(0x3ecccccd, float:0.4)
            float r3 = r0.f39242b
            float r3 = java.lang.Math.abs(r3)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0084
            r3 = 1
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            float r4 = r0.f39241a
            float r6 = r4 - r2
            float r7 = r0.f39243c
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0098
            float r4 = r4 + r2
            float r0 = r0.f39244d
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            r0 = 1
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            if (r3 == 0) goto L_0x009e
            if (r0 == 0) goto L_0x009e
            r1 = 1
        L_0x009e:
            if (r1 != 0) goto L_0x00a7
            com.startapp.sdk.ads.list3d.List3DView r0 = r11.f39289a
            r1 = 16
            r0.postDelayed(r11, r1)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9598v5.run():void");
    }
}
