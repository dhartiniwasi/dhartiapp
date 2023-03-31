package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class xe4 implements hf4 {

    /* renamed from: a */
    public static final /* synthetic */ xe4 f20081a = new xe4();

    private /* synthetic */ xe4() {
    }

    /* renamed from: b */
    public final int mo10808b(Object obj) {
        int i = if4.f10773d;
        String str = ((pe4) obj).f15824a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (gb2.f9812a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
