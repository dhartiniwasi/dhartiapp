package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.C0574a;
import java.util.List;
import p103o.C5134a;
import p103o.C5137b;
import p103o.C5138c;

public class TrustedWebActivity extends ChromeCustomTabsActivity {
    protected static final String LOG_TAG = "TrustedWebActivity";
    public C5138c builder;

    private void prepareCustomTabs() {
        String str = this.options.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.builder.mo19103c(new C0574a.C0575a().mo2666b(Color.parseColor(this.options.toolbarBackgroundColor)).mo2665a());
        }
        List<String> list = this.options.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.mo19102b(this.options.additionalTrustedOrigins);
        }
        C5134a aVar = this.options.displayMode;
        if (aVar != null) {
            this.builder.mo19104d(aVar);
        }
        this.builder.mo19105e(this.options.screenOrientation.intValue());
    }

    private void prepareCustomTabsIntent(C5137b bVar) {
        Intent a = bVar.mo19100a();
        String str = this.options.packageName;
        if (str != null) {
            a.setPackage(str);
        } else {
            a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.options.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, a);
        }
    }

    public void customTabsConnected() {
        this.customTabsSession = this.customTabActivityHelper.getSession();
        Uri parse = Uri.parse(this.initialUrl);
        this.customTabActivityHelper.mayLaunchUrl(parse, (Bundle) null, (List<Bundle>) null);
        this.builder = new C5138c(parse);
        prepareCustomTabs();
        C5137b a = this.builder.mo19101a(this.customTabsSession);
        prepareCustomTabsIntent(a);
        CustomTabActivityHelper.openCustomTab((Activity) this, a, parse, 100);
    }
}
