package p091m1;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: m1.n */
/* compiled from: LogResponse */
public abstract class C4996n {
    /* renamed from: a */
    static C4996n m31540a(long j) {
        return new C4984h(j);
    }

    /* renamed from: b */
    public static C4996n m31541b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m31540a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C4996n a = m31540a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo18913c();
}
