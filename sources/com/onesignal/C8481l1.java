package com.onesignal;

import com.onesignal.C8338d3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.l1 */
/* compiled from: OSInAppMessageRedisplayStats */
class C8481l1 {

    /* renamed from: a */
    private long f35683a;

    /* renamed from: b */
    private int f35684b;

    /* renamed from: c */
    private int f35685c;

    /* renamed from: d */
    private long f35686d;

    /* renamed from: e */
    private boolean f35687e;

    C8481l1() {
        this.f35683a = -1;
        this.f35684b = 0;
        this.f35685c = 1;
        this.f35686d = 0;
        this.f35687e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo27922a() {
        return this.f35684b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo27923b() {
        return this.f35683a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27924c() {
        this.f35684b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo27925d() {
        if (this.f35683a < 0) {
            return true;
        }
        long b = C8338d3.m46448M0().mo28281b() / 1000;
        long j = b - this.f35683a;
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OSInAppMessage lastDisplayTime: " + this.f35683a + " currentTimeInSeconds: " + b + " diffInSeconds: " + j + " displayDelay: " + this.f35686d);
        if (j >= this.f35686d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo27926e() {
        return this.f35687e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo27927f(int i) {
        this.f35684b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27928g(C8481l1 l1Var) {
        mo27929h(l1Var.mo27923b());
        mo27927f(l1Var.mo27922a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27929h(long j) {
        this.f35683a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo27930i() {
        boolean z = this.f35684b < this.f35685c;
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OSInAppMessage shouldDisplayAgain: " + z);
        return z;
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.f35683a + ", displayQuantity=" + this.f35684b + ", displayLimit=" + this.f35685c + ", displayDelay=" + this.f35686d + '}';
    }

    C8481l1(int i, long j) {
        this.f35683a = -1;
        this.f35684b = 0;
        this.f35685c = 1;
        this.f35686d = 0;
        this.f35687e = false;
        this.f35684b = i;
        this.f35683a = j;
    }

    C8481l1(JSONObject jSONObject) throws JSONException {
        this.f35683a = -1;
        this.f35684b = 0;
        this.f35685c = 1;
        this.f35686d = 0;
        this.f35687e = false;
        this.f35687e = true;
        Object obj = jSONObject.get("limit");
        Object obj2 = jSONObject.get("delay");
        if (obj instanceof Integer) {
            this.f35685c = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.f35686d = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.f35686d = (long) ((Integer) obj2).intValue();
        }
    }
}
