package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p067i5.C4697k;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ts2 {

    /* renamed from: a */
    public final List f18243a;

    /* renamed from: b */
    public final ls2 f18244b;

    /* renamed from: c */
    public final List f18245c;

    ts2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ls2 ls2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new is2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ls2 = new ls2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (MediationMetaData.KEY_NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = C4820w0.m30818h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new ss2(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f18245c = arrayList;
        this.f18243a = emptyList;
        this.f18244b = ls2 == null ? new ls2(new JsonReader(new StringReader("{}"))) : ls2;
    }

    /* renamed from: a */
    public static ts2 m21215a(Reader reader) throws ms2 {
        try {
            ts2 ts2 = new ts2(new JsonReader(reader));
            C4697k.m30405a(reader);
            return ts2;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new ms2("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            C4697k.m30405a(reader);
            throw th;
        }
    }
}
