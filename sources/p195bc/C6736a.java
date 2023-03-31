package p195bc;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p417zb.C13502f;

/* renamed from: bc.a */
/* compiled from: LocalizationPlugin */
public class C6736a {

    /* renamed from: a */
    private final C13502f f31240a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f31241b;

    /* renamed from: c */
    final C13502f.C13504b f31242c;

    /* renamed from: bc.a$a */
    /* compiled from: LocalizationPlugin */
    class C6737a implements C13502f.C13504b {
        C6737a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo22654a(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                bc.a r0 = p195bc.C6736a.this
                android.content.Context r0 = r0.f31241b
                r1 = 17
                r2 = 0
                if (r9 == 0) goto L_0x004a
                java.util.Locale r3 = p195bc.C6736a.m38634b(r9)
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r1) goto L_0x0034
                android.content.res.Configuration r0 = new android.content.res.Configuration
                bc.a r4 = p195bc.C6736a.this
                android.content.Context r4 = r4.f31241b
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                r0.<init>(r4)
                r0.setLocale(r3)
                bc.a r3 = p195bc.C6736a.this
                android.content.Context r3 = r3.f31241b
                android.content.Context r0 = r3.createConfigurationContext(r0)
                goto L_0x004a
            L_0x0034:
                bc.a r4 = p195bc.C6736a.this
                android.content.Context r4 = r4.f31241b
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r5 = r4.getConfiguration()
                java.util.Locale r6 = r5.locale
                r5.locale = r3
                r4.updateConfiguration(r5, r2)
                goto L_0x004b
            L_0x004a:
                r6 = r2
            L_0x004b:
                bc.a r3 = p195bc.C6736a.this
                android.content.Context r3 = r3.f31241b
                java.lang.String r3 = r3.getPackageName()
                android.content.res.Resources r4 = r0.getResources()
                java.lang.String r5 = "string"
                int r8 = r4.getIdentifier(r8, r5, r3)
                if (r8 == 0) goto L_0x006a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r8 = r0.getString(r8)
                goto L_0x006b
            L_0x006a:
                r8 = r2
            L_0x006b:
                if (r9 == 0) goto L_0x0084
                int r9 = android.os.Build.VERSION.SDK_INT
                if (r9 >= r1) goto L_0x0084
                bc.a r9 = p195bc.C6736a.this
                android.content.Context r9 = r9.f31241b
                android.content.res.Resources r9 = r9.getResources()
                android.content.res.Configuration r0 = r9.getConfiguration()
                r0.locale = r6
                r9.updateConfiguration(r0, r2)
            L_0x0084:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p195bc.C6736a.C6737a.mo22654a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public C6736a(Context context, C13502f fVar) {
        C6737a aVar = new C6737a();
        this.f31242c = aVar;
        this.f31241b = context;
        this.f31240a = fVar;
        fVar.mo38634c(aVar);
    }

    /* renamed from: b */
    public static Locale m38634b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }

    /* renamed from: c */
    public Locale mo22652c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f31241b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
            return list.get(0);
        } else if (i >= 24) {
            LocaleList locales2 = this.f31241b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales2.size(); i3++) {
                Locale locale2 = locales2.get(i3);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
            return list.get(0);
        } else {
            Locale locale3 = this.f31241b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
            return list.get(0);
        }
    }

    /* renamed from: d */
    public void mo22653d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f31240a.mo38633b(arrayList);
    }
}
