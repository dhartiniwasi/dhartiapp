package androidx.work;

import android.content.Context;
import androidx.work.C1532a;
import java.util.Collections;
import java.util.List;
import p125r0.C5428a;
import p170y0.C6094j;
import p170y0.C6111t;

public final class WorkManagerInitializer implements C5428a<C6111t> {

    /* renamed from: a */
    private static final String f4380a = C6094j.m35719f("WrkMgrInitializer");

    /* renamed from: a */
    public List<Class<? extends C5428a<?>>> mo3604a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C6111t mo3605b(Context context) {
        C6094j.m35717c().mo20921a(f4380a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C6111t.m35741h(context, new C1532a.C1534b().mo6297a());
        return C6111t.m35740g(context);
    }
}
