package com.startapp;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: com.startapp.d5 */
/* compiled from: Sta */
public class C8910d5 {

    /* renamed from: a */
    public final SharedPreferences f36697a;

    /* renamed from: b */
    public volatile String f36698b;

    public C8910d5(SharedPreferences sharedPreferences) {
        this.f36697a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo29308a() {
        String str = this.f36698b;
        if (str == null) {
            synchronized (this) {
                str = this.f36698b;
                if (str == null) {
                    str = this.f36697a.getString("e695c6d894060903", (String) null);
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        if (!this.f36697a.edit().putString("e695c6d894060903", str).commit()) {
                            str = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f36698b = str;
                }
            }
        }
        return str;
    }
}
