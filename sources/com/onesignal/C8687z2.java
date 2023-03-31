package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.z2 */
/* compiled from: OSTrigger */
class C8687z2 {

    /* renamed from: a */
    String f36244a;

    /* renamed from: b */
    public C8688a f36245b;

    /* renamed from: c */
    public String f36246c;

    /* renamed from: d */
    public C8689b f36247d;

    /* renamed from: e */
    public Object f36248e;

    /* renamed from: com.onesignal.z2$a */
    /* compiled from: OSTrigger */
    public enum C8688a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");
        

        /* renamed from: a */
        private String f36254a;

        private C8688a(String str) {
            this.f36254a = str;
        }

        /* renamed from: a */
        public static C8688a m48011a(String str) {
            for (C8688a aVar : values()) {
                if (aVar.f36254a.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        public String toString() {
            return this.f36254a;
        }
    }

    /* renamed from: com.onesignal.z2$b */
    /* compiled from: OSTrigger */
    public enum C8689b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        

        /* renamed from: a */
        private String f36265a;

        private C8689b(String str) {
            this.f36265a = str;
        }

        /* renamed from: b */
        public static C8689b m48012b(String str) {
            for (C8689b bVar : values()) {
                if (bVar.f36265a.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        /* renamed from: a */
        public boolean mo28365a() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        public String toString() {
            return this.f36265a;
        }
    }

    C8687z2(JSONObject jSONObject) throws JSONException {
        this.f36244a = jSONObject.getString("id");
        this.f36245b = C8688a.m48011a(jSONObject.getString("kind"));
        this.f36246c = jSONObject.optString("property", (String) null);
        this.f36247d = C8689b.m48012b(jSONObject.getString("operator"));
        this.f36248e = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.f36244a + '\'' + ", kind=" + this.f36245b + ", property='" + this.f36246c + '\'' + ", operatorType=" + this.f36247d + ", value=" + this.f36248e + '}';
    }
}
