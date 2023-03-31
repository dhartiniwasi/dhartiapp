package com.startapp;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.tb */
/* compiled from: Sta */
public abstract class C9565tb<T> implements C9248qb<List<T>> {
    private static final String LOG_TAG = "tb";
    private final Class<T> itemClass;

    /* renamed from: com.startapp.tb$a */
    /* compiled from: Sta */
    public class C9566a implements C8842b3<Integer, JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ Object f39213a;

        public C9566a(C9565tb tbVar, Object obj) {
            this.f39213a = obj;
        }

        /* renamed from: a */
        public Object mo29129a(Object obj) {
            try {
                return ((JSONArray) this.f39213a).getJSONObject(((Integer) obj).intValue());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.startapp.tb$b */
    /* compiled from: Sta */
    public class C9567b implements C8842b3<Integer, JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ Object f39214a;

        public C9567b(C9565tb tbVar, Object obj) {
            this.f39214a = obj;
        }

        /* renamed from: a */
        public Object mo29129a(Object obj) {
            try {
                return ((JSONObject) this.f39214a).getJSONObject(((Integer) obj).toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public C9565tb(Class<T> cls) {
        this.itemClass = cls;
    }

    public List<T> parse(Class<List<T>> cls, Object obj) {
        int i;
        C8842b3 b3Var;
        if (obj instanceof JSONArray) {
            i = ((JSONArray) obj).length();
            b3Var = new C9566a(this, obj);
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            i = ((JSONObject) obj).length();
            b3Var = new C9567b(this, obj);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C9024i5.m48685a(this.itemClass, (JSONObject) b3Var.mo29129a(Integer.valueOf(i2))));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
