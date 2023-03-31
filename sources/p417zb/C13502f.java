package p417zb;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6552g;
import p186ac.C6555j;
import p186ac.C6556k;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.f */
/* compiled from: LocalizationChannel */
public class C13502f {

    /* renamed from: a */
    public final C6556k f47901a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13504b f47902b;

    /* renamed from: c */
    public final C6556k.C6560c f47903c;

    /* renamed from: zb.f$a */
    /* compiled from: LocalizationChannel */
    class C13503a implements C6556k.C6560c {
        C13503a() {
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            if (C13502f.this.f47902b != null) {
                String str = jVar.f30999a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.mo22157b();
                try {
                    dVar.success(C13502f.this.f47902b.mo22654a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e) {
                    dVar.error("error", e.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: zb.f$b */
    /* compiled from: LocalizationChannel */
    public interface C13504b {
        /* renamed from: a */
        String mo22654a(String str, String str2);
    }

    public C13502f(C12051a aVar) {
        C13503a aVar2 = new C13503a();
        this.f47903c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/localization", C6552g.f30998a);
        this.f47901a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* renamed from: b */
    public void mo38633b(List<Locale> list) {
        C11881b.m57388f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            C11881b.m57388f("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? next.getScript() : "");
            arrayList.add(next.getVariant());
        }
        this.f47901a.mo22159c("setLocale", arrayList);
    }

    /* renamed from: c */
    public void mo38634c(C13504b bVar) {
        this.f47902b = bVar;
    }
}
