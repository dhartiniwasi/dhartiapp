package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sv1 {

    /* renamed from: a */
    private final C4691e f17676a;

    public sv1(C4691e eVar) {
        this.f17676a = eVar;
    }

    /* renamed from: a */
    public final void mo14146a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) h10.f10147a.mo13438e()).booleanValue()) {
            long a = this.f17676a.mo18370a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                pm0.m18665e("unable to log", e);
            }
            pm0.m18666f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
