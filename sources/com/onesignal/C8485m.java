package com.onesignal;

import android.os.PersistableBundle;

/* renamed from: com.onesignal.m */
/* compiled from: BundleCompat */
class C8485m implements C8465j<PersistableBundle> {

    /* renamed from: a */
    private PersistableBundle f35690a = new PersistableBundle();

    C8485m() {
    }

    /* renamed from: a */
    public void mo27873a(String str, Long l) {
        this.f35690a.putLong(str, l.longValue());
    }

    /* renamed from: b */
    public Long mo27874b(String str) {
        return Long.valueOf(this.f35690a.getLong(str));
    }

    /* renamed from: d */
    public Integer mo27876d(String str) {
        return Integer.valueOf(this.f35690a.getInt(str));
    }

    /* renamed from: e */
    public String mo27877e(String str) {
        return this.f35690a.getString(str);
    }

    /* renamed from: f */
    public boolean mo27878f(String str) {
        return this.f35690a.containsKey(str);
    }

    /* renamed from: g */
    public PersistableBundle mo27875c() {
        return this.f35690a;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f35690a.getBoolean(str, z);
    }

    public void putString(String str, String str2) {
        this.f35690a.putString(str, str2);
    }
}
