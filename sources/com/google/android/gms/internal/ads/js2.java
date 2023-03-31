package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class js2 {

    /* renamed from: a */
    public final int f11783a;

    /* renamed from: b */
    public final int f11784b;

    /* renamed from: c */
    public final boolean f11785c;

    public js2(int i, int i2, boolean z) {
        this.f11783a = i;
        this.f11784b = i2;
        this.f11785c = z;
    }

    /* renamed from: a */
    static List m15057a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new js2(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
