package p413z7;

import android.util.Base64;
import com.google.protobuf.C8137e1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p008a8.C6450a1;
import p008a8.C6452b1;
import p008a8.C6469g1;
import p008a8.C6473i;
import p008a8.C6489q;
import p008a8.C6494r;
import p200c9.C6838a;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9899s;
import p211d8.C9902t;
import p211d8.C9903u;
import p211d8.C9905w;
import p211d8.C9907y;
import p238g8.C10250k0;
import p246h7.C10428q;
import p405y8.C13085b;
import p405y8.C13088b0;
import p405y8.C13161s;

/* renamed from: z7.g */
/* compiled from: BundleSerializer */
public class C13470g {

    /* renamed from: a */
    private final SimpleDateFormat f47830a;

    /* renamed from: b */
    private final C10250k0 f47831b;

    public C13470g(C10250k0 k0Var) {
        this.f47831b = k0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f47830a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    /* renamed from: A */
    private void m62518A(List<C6494r> list, JSONObject jSONObject) throws JSONException {
        C9898r j = m62531j(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.hashCode();
        char c = 65535;
        switch (string.hashCode()) {
            case -2125479834:
                if (string.equals("IS_NAN")) {
                    c = 0;
                    break;
                }
                break;
            case -1465346180:
                if (string.equals("IS_NULL")) {
                    c = 1;
                    break;
                }
                break;
            case -244195494:
                if (string.equals("IS_NOT_NAN")) {
                    c = 2;
                    break;
                }
                break;
            case 1019893512:
                if (string.equals("IS_NOT_NULL")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                list.add(C6489q.m37894f(j, C6489q.C6491b.EQUAL, C9907y.f39757a));
                return;
            case 1:
                list.add(C6489q.m37894f(j, C6489q.C6491b.EQUAL, C9907y.f39758b));
                return;
            case 2:
                list.add(C6489q.m37894f(j, C6489q.C6491b.NOT_EQUAL, C9907y.f39757a));
                return;
            case 3:
                list.add(C6489q.m37894f(j, C6489q.C6491b.NOT_EQUAL, C9907y.f39758b));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    /* renamed from: B */
    private C13088b0 m62519B(JSONObject jSONObject) throws JSONException {
        C13088b0.C13090b y0 = C13088b0.m61490y0();
        if (jSONObject.has("nullValue")) {
            y0.mo38133N(C8137e1.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            y0.mo38126G(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            y0.mo38130K(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            y0.mo38128I(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            m62545y(y0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            y0.mo38135P(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            y0.mo38127H(C8153i.m44777q(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            y0.mo38134O(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            m62533l(y0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            m62525a(y0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else if (jSONObject.has("mapValue")) {
            m62536o(y0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        } else {
            throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
        }
        return (C13088b0) y0.build();
    }

    /* renamed from: C */
    private List<C6494r> m62520C(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            m62532k(arrayList, jSONObject);
        }
        return arrayList;
    }

    /* renamed from: D */
    private static int m62521D(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i *= 10;
            if (i2 < str.length()) {
                if (str.charAt(i2) < '0' || str.charAt(i2) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i += str.charAt(i2) - '0';
            }
        }
        return i;
    }

    /* renamed from: E */
    private void m62522E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    /* renamed from: F */
    private void m62523F(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    /* renamed from: G */
    private void m62524G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    /* renamed from: a */
    private void m62525a(C13088b0.C13090b bVar, JSONArray jSONArray) throws JSONException {
        C13085b.C13087b k0 = C13085b.m61455k0();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                k0.mo38108E(m62519B(jSONArray.getJSONObject(i)));
            }
        }
        bVar.mo38124E(k0);
    }

    /* renamed from: d */
    private C13472i m62526d(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        m62524G(jSONObject2);
        C9903u p = m62537p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        m62522E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            str = jSONObject3.getString("collectionId");
        } else {
            p = (C9903u) p.mo32347b(jSONObject3.getString("collectionId"));
            str = null;
        }
        List<C6494r> C = m62520C(jSONObject2.optJSONObject("where"));
        List<C6450a1> r = m62538r(jSONObject2.optJSONArray("orderBy"));
        C6473i u = m62541u(jSONObject2.optJSONObject("startAt"));
        C6473i g = m62528g(jSONObject2.optJSONObject("endAt"));
        m62523F(jSONObject2);
        int m = m62534m(jSONObject2);
        return new C13472i(new C6469g1(p, str, C, r, (long) m, u, g), m62535n(jSONObject));
    }

    /* renamed from: e */
    private void m62527e(List<C6494r> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.getString("op").equals("AND")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    m62532k(list, optJSONArray.getJSONObject(i));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
    }

    /* renamed from: g */
    private C6473i m62528g(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new C6473i(m62539s(jSONObject), !jSONObject.optBoolean("before", false));
    }

    /* renamed from: h */
    private void m62529h(List<C6494r> list, JSONObject jSONObject) throws JSONException {
        list.add(C6489q.m37894f(m62531j(jSONObject.getJSONObject("field")), m62530i(jSONObject.getString("op")), m62519B(jSONObject.getJSONObject("value"))));
    }

    /* renamed from: i */
    private C6489q.C6491b m62530i(String str) {
        return C6489q.C6491b.valueOf(str);
    }

    /* renamed from: j */
    private C9898r m62531j(JSONObject jSONObject) throws JSONException {
        return C9898r.m50742w(jSONObject.getString("fieldPath"));
    }

    /* renamed from: k */
    private void m62532k(List<C6494r> list, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("compositeFilter")) {
            m62527e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            m62529h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            m62518A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    /* renamed from: l */
    private void m62533l(C13088b0.C13090b bVar, JSONObject jSONObject) {
        bVar.mo38129J(C6838a.m39385g0().mo22938D(jSONObject.optDouble("latitude")).mo22939E(jSONObject.optDouble("longitude")));
    }

    /* renamed from: m */
    private int m62534m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        if (optJSONObject != null) {
            return optJSONObject.optInt("value", -1);
        }
        return jSONObject.optInt("limit", -1);
    }

    /* renamed from: n */
    private C6452b1.C6453a m62535n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return C6452b1.C6453a.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return C6452b1.C6453a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    /* renamed from: o */
    private void m62536o(C13088b0.C13090b bVar, JSONObject jSONObject) throws JSONException {
        C13161s.C13163b k0 = C13161s.m61758k0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                k0.mo38232F(next, m62519B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.mo38131L(k0);
    }

    /* renamed from: p */
    private C9903u m62537p(String str) {
        C9903u w = C9903u.m50784w(str);
        if (this.f47831b.mo32986b0(w)) {
            return (C9903u) w.mo32359s(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    /* renamed from: r */
    private List<C6450a1> m62538r(JSONArray jSONArray) throws JSONException {
        C6450a1.C6451a aVar;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C9898r j = m62531j(jSONObject.getJSONObject("field"));
                if (jSONObject.optString("direction", "ASCENDING").equals("ASCENDING")) {
                    aVar = C6450a1.C6451a.ASCENDING;
                } else {
                    aVar = C6450a1.C6451a.DESCENDING;
                }
                arrayList.add(C6450a1.m37613d(aVar, j));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private List<C13088b0> m62539s(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(m62519B(optJSONArray.getJSONObject(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private C9905w m62540t(Object obj) throws JSONException {
        return new C9905w(m62542v(obj));
    }

    /* renamed from: u */
    private C6473i m62541u(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new C6473i(m62539s(jSONObject), jSONObject.optBoolean("before", false));
    }

    /* renamed from: v */
    private C10428q m62542v(Object obj) throws JSONException {
        if (obj instanceof String) {
            return m62543w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return m62544x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    /* renamed from: w */
    private C10428q m62543w(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf != -1) {
                int indexOf2 = str.indexOf(90, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(43, indexOf);
                }
                if (indexOf2 == -1) {
                    indexOf2 = str.indexOf(45, indexOf);
                }
                if (indexOf2 != -1) {
                    int i = 0;
                    String substring = str.substring(0, indexOf2);
                    String str2 = "";
                    int indexOf3 = substring.indexOf(46);
                    if (indexOf3 != -1) {
                        String substring2 = substring.substring(0, indexOf3);
                        str2 = substring.substring(indexOf3 + 1);
                        substring = substring2;
                    }
                    long time = this.f47830a.parse(substring).getTime() / 1000;
                    if (!str2.isEmpty()) {
                        i = m62521D(str2);
                    }
                    if (str.charAt(indexOf2) != 'Z') {
                        long z = m62546z(str.substring(indexOf2 + 1));
                        time = str.charAt(indexOf2) == '+' ? time - z : time + z;
                    } else if (str.length() != indexOf2 + 1) {
                        throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
                    }
                    return new C10428q(time, i);
                }
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            throw new IllegalArgumentException("Invalid timestamp: " + str);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Failed to parse timestamp", e);
        }
    }

    /* renamed from: x */
    private C10428q m62544x(JSONObject jSONObject) {
        return new C10428q(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    /* renamed from: y */
    private void m62545y(C13088b0.C13090b bVar, Object obj) throws JSONException {
        C10428q v = m62542v(obj);
        bVar.mo38136Q(C8234t1.m45639g0().mo27293E(v.mo33499c()).mo27292D(v.mo33498b()));
    }

    /* renamed from: z */
    private static long m62546z(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    /* renamed from: b */
    public C13468e mo38575b(JSONObject jSONObject) throws JSONException {
        return new C13468e(jSONObject.getString("id"), jSONObject.getInt(MediationMetaData.KEY_VERSION), m62540t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    /* renamed from: c */
    public C13471h mo38576c(JSONObject jSONObject) throws JSONException {
        C9888l n = C9888l.m50697n(m62537p(jSONObject.getString(MediationMetaData.KEY_NAME)));
        C9905w t = m62540t(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        return new C13471h(n, t, optBoolean, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C13465b mo38577f(JSONObject jSONObject) throws JSONException {
        C9888l n = C9888l.m50697n(m62537p(jSONObject.getString(MediationMetaData.KEY_NAME)));
        C9905w t = m62540t(jSONObject.get("updateTime"));
        C13088b0.C13090b y0 = C13088b0.m61490y0();
        m62536o(y0, jSONObject.getJSONObject("fields"));
        return new C13465b(C9899s.m50749o(n, t, C9902t.m50774g(y0.mo38123D().mo38227e0())));
    }

    /* renamed from: q */
    public C13473j mo38578q(JSONObject jSONObject) throws JSONException {
        return new C13473j(jSONObject.getString(MediationMetaData.KEY_NAME), m62526d(jSONObject.getJSONObject("bundledQuery")), m62540t(jSONObject.get("readTime")));
    }
}
