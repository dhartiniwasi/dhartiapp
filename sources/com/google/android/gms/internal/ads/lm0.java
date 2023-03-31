package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class lm0 implements nm0 {

    /* renamed from: a */
    public final /* synthetic */ String f12844a;

    /* renamed from: b */
    public final /* synthetic */ String f12845b;

    /* renamed from: c */
    public final /* synthetic */ Map f12846c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f12847d;

    public /* synthetic */ lm0(String str, String str2, Map map, byte[] bArr) {
        this.f12844a = str;
        this.f12845b = str2;
        this.f12846c = map;
        this.f12847d = bArr;
    }

    /* renamed from: a */
    public final void mo11438a(JsonWriter jsonWriter) {
        om0.m17939a(this.f12844a, this.f12845b, this.f12846c, this.f12847d, jsonWriter);
    }
}
