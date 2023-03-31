package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import p067i5.C4689c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class mm0 implements nm0 {

    /* renamed from: a */
    public final /* synthetic */ byte[] f13406a;

    public /* synthetic */ mm0(byte[] bArr) {
        this.f13406a = bArr;
    }

    /* renamed from: a */
    public final void mo11438a(JsonWriter jsonWriter) {
        byte[] bArr = this.f13406a;
        int i = om0.f15265g;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String c = C4689c.m30371c(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(c);
        } else {
            String g = im0.m14407g(c);
            if (g != null) {
                jsonWriter.name("bodydigest").value(g);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
