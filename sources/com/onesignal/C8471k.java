package com.onesignal;

import android.os.Bundle;

/* renamed from: com.onesignal.k */
/* compiled from: BundleCompat */
class C8471k implements C8465j<Bundle> {

    /* renamed from: a */
    private Bundle f35667a = new Bundle();

    C8471k() {
    }

    /* renamed from: a */
    public void mo27873a(String str, Long l) {
        this.f35667a.putLong(str, l.longValue());
    }

    /* renamed from: b */
    public Long mo27874b(String str) {
        return Long.valueOf(this.f35667a.getLong(str));
    }

    /* renamed from: d */
    public Integer mo27876d(String str) {
        return Integer.valueOf(this.f35667a.getInt(str));
    }

    /* renamed from: e */
    public String mo27877e(String str) {
        return this.f35667a.getString(str);
    }

    /* renamed from: f */
    public boolean mo27878f(String str) {
        return this.f35667a.containsKey(str);
    }

    /* renamed from: g */
    public Bundle mo27875c() {
        return this.f35667a;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f35667a.getBoolean(str, z);
    }

    public void putString(String str, String str2) {
        this.f35667a.putString(str, str2);
    }
}
