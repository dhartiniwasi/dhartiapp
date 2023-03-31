package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class km0 implements nm0 {

    /* renamed from: a */
    public final /* synthetic */ String f12163a;

    public /* synthetic */ km0(String str) {
        this.f12163a = str;
    }

    /* renamed from: a */
    public final void mo11438a(JsonWriter jsonWriter) {
        String str = this.f12163a;
        int i = om0.f15265g;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
