package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6883b {

    /* renamed from: a */
    private String f31575a;

    /* renamed from: b */
    private final long f31576b;

    /* renamed from: c */
    private final Map f31577c;

    public C6883b(String str, long j, Map map) {
        this.f31575a = str;
        this.f31576b = j;
        HashMap hashMap = new HashMap();
        this.f31577c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo23024a() {
        return this.f31576b;
    }

    /* renamed from: b */
    public final C6883b clone() {
        return new C6883b(this.f31575a, this.f31576b, new HashMap(this.f31577c));
    }

    /* renamed from: c */
    public final Object mo23026c(String str) {
        if (this.f31577c.containsKey(str)) {
            return this.f31577c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo23028d() {
        return this.f31575a;
    }

    /* renamed from: e */
    public final Map mo23029e() {
        return this.f31577c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6883b)) {
            return false;
        }
        C6883b bVar = (C6883b) obj;
        if (this.f31576b == bVar.f31576b && this.f31575a.equals(bVar.f31575a)) {
            return this.f31577c.equals(bVar.f31577c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo23031f(String str) {
        this.f31575a = str;
    }

    /* renamed from: g */
    public final void mo23032g(String str, Object obj) {
        if (obj == null) {
            this.f31577c.remove(str);
        } else {
            this.f31577c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f31575a.hashCode();
        long j = this.f31576b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f31577c.hashCode();
    }

    public final String toString() {
        String str = this.f31575a;
        long j = this.f31576b;
        String obj = this.f31577c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
