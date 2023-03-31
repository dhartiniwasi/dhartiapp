package p417zb;

import java.util.HashMap;
import java.util.Map;
import p186ac.C6531a;
import p186ac.C6551f;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.m */
/* compiled from: SettingsChannel */
public class C13536m {

    /* renamed from: a */
    public final C6531a<Object> f48011a;

    /* renamed from: zb.m$a */
    /* compiled from: SettingsChannel */
    public static class C13537a {

        /* renamed from: a */
        private final C6531a<Object> f48012a;

        /* renamed from: b */
        private Map<String, Object> f48013b = new HashMap();

        C13537a(C6531a<Object> aVar) {
            this.f48012a = aVar;
        }

        /* renamed from: a */
        public void mo38648a() {
            C11881b.m57388f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f48013b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f48013b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f48013b.get("platformBrightness"));
            this.f48012a.mo22127c(this.f48013b);
        }

        /* renamed from: b */
        public C13537a mo38649b(boolean z) {
            this.f48013b.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: c */
        public C13537a mo38650c(boolean z) {
            this.f48013b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: d */
        public C13537a mo38651d(C13538b bVar) {
            this.f48013b.put("platformBrightness", bVar.f48017a);
            return this;
        }

        /* renamed from: e */
        public C13537a mo38652e(float f) {
            this.f48013b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        /* renamed from: f */
        public C13537a mo38653f(boolean z) {
            this.f48013b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: zb.m$b */
    /* compiled from: SettingsChannel */
    public enum C13538b {
        light("light"),
        dark("dark");
        

        /* renamed from: a */
        public String f48017a;

        private C13538b(String str) {
            this.f48017a = str;
        }
    }

    public C13536m(C12051a aVar) {
        this.f48011a = new C6531a<>(aVar, "flutter/settings", C6551f.f30997a);
    }

    /* renamed from: a */
    public C13537a mo38647a() {
        return new C13537a(this.f48011a);
    }
}
