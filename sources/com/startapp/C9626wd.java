package com.startapp;

import com.startapp.C8935ee;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.wd */
/* compiled from: Sta */
public abstract class C9626wd extends C8935ee {

    /* renamed from: c */
    public final HashSet<String> f39339c;

    /* renamed from: d */
    public final JSONObject f39340d;

    /* renamed from: e */
    public final long f39341e;

    public C9626wd(C8935ee.C8937b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f39339c = new HashSet<>(hashSet);
        this.f39340d = jSONObject;
        this.f39341e = j;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
