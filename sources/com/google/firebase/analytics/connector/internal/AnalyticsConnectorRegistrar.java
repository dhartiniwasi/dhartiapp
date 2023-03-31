package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p246h7.C10412f;
import p256i7.C10548a;
import p302n7.C11934c;
import p302n7.C11966r;
import p367u8.C12707h;
import p395x7.C12980d;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Keep
    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57617c(C10548a.class).mo36256b(C11966r.m57744j(C10412f.class)).mo36256b(C11966r.m57744j(Context.class)).mo36256b(C11966r.m57744j(C12980d.class)).mo36260f(C7773a.f34072a).mo36259e().mo36258d(), C12707h.m60249b("fire-analytics", "21.2.0")});
    }
}
