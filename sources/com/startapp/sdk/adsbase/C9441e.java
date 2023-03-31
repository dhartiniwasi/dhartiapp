package com.startapp.sdk.adsbase;

import android.content.SharedPreferences;
import android.os.Build;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.C9516s;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.sdk.adsbase.e */
/* compiled from: Sta */
public class C9441e implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f38871a;

    /* renamed from: b */
    public final C9443b f38872b;

    /* renamed from: com.startapp.sdk.adsbase.e$b */
    /* compiled from: Sta */
    public interface C9443b {
    }

    public C9441e(SharedPreferences sharedPreferences) {
        this(sharedPreferences, (C9443b) null);
    }

    /* renamed from: a */
    public C9442a edit() {
        return new C9442a(this.f38871a.edit(), this.f38871a.getAll(), this.f38872b);
    }

    public boolean contains(String str) {
        try {
            return this.f38871a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Map<String, ?> getAll() {
        try {
            return this.f38871a.getAll();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return this.f38871a.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    public float getFloat(String str, float f) {
        try {
            return this.f38871a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.f38871a.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    public long getLong(String str, long j) {
        try {
            return this.f38871a.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f38871a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        try {
            return this.f38871a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f38871a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f38871a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public C9441e(SharedPreferences sharedPreferences, C9443b bVar) {
        this.f38871a = sharedPreferences;
        this.f38872b = bVar;
    }

    /* renamed from: com.startapp.sdk.adsbase.e$a */
    /* compiled from: Sta */
    public static class C9442a implements SharedPreferences.Editor {

        /* renamed from: a */
        public final SharedPreferences.Editor f38873a;

        /* renamed from: b */
        public final Map<String, ?> f38874b;

        /* renamed from: c */
        public final C9443b f38875c;

        /* renamed from: d */
        public boolean f38876d;

        public C9442a(SharedPreferences.Editor editor, Map<String, ?> map, C9443b bVar) {
            this.f38873a = editor;
            this.f38874b = map;
            this.f38875c = bVar;
        }

        /* renamed from: a */
        public final <T> void mo30812a(String str, T t) {
            if (this.f38875c != null && !C9605vb.m50465a(this.f38874b.get(str), t)) {
                this.f38876d = true;
            }
        }

        public void apply() {
            if (Build.VERSION.SDK_INT < 9) {
                this.f38873a.commit();
            } else {
                this.f38873a.apply();
            }
            C9443b bVar = this.f38875c;
            if (bVar != null && this.f38876d) {
                this.f38876d = false;
                C9584u9.f39253d.mo31309a(((C9516s) bVar).f39111a.f39064a, MetaDataRequest.RequestReason.EXTRAS);
            }
        }

        public SharedPreferences.Editor clear() {
            if (!this.f38874b.isEmpty()) {
                this.f38876d = true;
            }
            this.f38873a.clear();
            return this;
        }

        public boolean commit() {
            return this.f38873a.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            mo30812a(str, Boolean.valueOf(z));
            this.f38873a.putBoolean(str, z);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            mo30812a(str, Float.valueOf(f));
            this.f38873a.putFloat(str, f);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            mo30812a(str, Integer.valueOf(i));
            this.f38873a.putInt(str, i);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            mo30812a(str, Long.valueOf(j));
            this.f38873a.putLong(str, j);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            mo30812a(str, str2);
            this.f38873a.putString(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set set) {
            mo30812a(str, set);
            this.f38873a.putStringSet(str, set);
            return this;
        }

        /* renamed from: a */
        public C9442a mo30811a(String str, String str2) {
            mo30812a(str, str2);
            this.f38873a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C9442a mo30809a(String str, int i) {
            mo30812a(str, Integer.valueOf(i));
            this.f38873a.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public C9442a mo30810a(String str, long j) {
            mo30812a(str, Long.valueOf(j));
            this.f38873a.putLong(str, j);
            return this;
        }

        /* renamed from: a */
        public C9442a remove(String str) {
            if (this.f38874b.containsKey(str)) {
                this.f38876d = true;
            }
            this.f38873a.remove(str);
            return this;
        }
    }
}
