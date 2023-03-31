package p103o;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.C0574a;
import androidx.browser.customtabs.C0584d;
import androidx.browser.customtabs.C0588f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p103o.C5134a;

/* renamed from: o.c */
/* compiled from: TrustedWebActivityIntentBuilder */
public class C5138c {

    /* renamed from: a */
    private final Uri f26653a;

    /* renamed from: b */
    private final C0584d.C0585a f26654b = new C0584d.C0585a();

    /* renamed from: c */
    private List<String> f26655c;

    /* renamed from: d */
    private Bundle f26656d;

    /* renamed from: e */
    private C5134a f26657e = new C5134a.C5135a();

    /* renamed from: f */
    private int f26658f = 0;

    public C5138c(Uri uri) {
        this.f26653a = uri;
    }

    /* renamed from: a */
    public C5137b mo19101a(C0588f fVar) {
        Objects.requireNonNull(fVar, "CustomTabsSession is required for launching a TWA");
        this.f26654b.mo2692f(fVar);
        Intent intent = this.f26654b.mo2688b().f1914a;
        intent.setData(this.f26653a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f26655c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f26655c));
        }
        Bundle bundle = this.f26656d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f26657e.mo19099a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f26658f);
        return new C5137b(intent, emptyList);
    }

    /* renamed from: b */
    public C5138c mo19102b(List<String> list) {
        this.f26655c = list;
        return this;
    }

    /* renamed from: c */
    public C5138c mo19103c(C0574a aVar) {
        this.f26654b.mo2690d(aVar);
        return this;
    }

    /* renamed from: d */
    public C5138c mo19104d(C5134a aVar) {
        this.f26657e = aVar;
        return this;
    }

    /* renamed from: e */
    public C5138c mo19105e(int i) {
        this.f26658f = i;
        return this;
    }
}
