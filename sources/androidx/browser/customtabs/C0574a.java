package androidx.browser.customtabs;

import android.os.Bundle;

/* renamed from: androidx.browser.customtabs.a */
/* compiled from: CustomTabColorSchemeParams */
public final class C0574a {

    /* renamed from: a */
    public final Integer f1884a;

    /* renamed from: b */
    public final Integer f1885b;

    /* renamed from: c */
    public final Integer f1886c;

    /* renamed from: d */
    public final Integer f1887d;

    /* renamed from: androidx.browser.customtabs.a$a */
    /* compiled from: CustomTabColorSchemeParams */
    public static final class C0575a {

        /* renamed from: a */
        private Integer f1888a;

        /* renamed from: b */
        private Integer f1889b;

        /* renamed from: c */
        private Integer f1890c;

        /* renamed from: d */
        private Integer f1891d;

        /* renamed from: a */
        public C0574a mo2665a() {
            return new C0574a(this.f1888a, this.f1889b, this.f1890c, this.f1891d);
        }

        /* renamed from: b */
        public C0575a mo2666b(int i) {
            this.f1888a = Integer.valueOf(i | -16777216);
            return this;
        }
    }

    C0574a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1884a = num;
        this.f1885b = num2;
        this.f1886c = num3;
        this.f1887d = num4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo2664a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1884a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1885b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1886c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1887d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
