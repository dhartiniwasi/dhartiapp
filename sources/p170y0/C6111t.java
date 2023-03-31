package p170y0;

import android.content.Context;
import androidx.work.C1532a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p176z0.C6191i;

/* renamed from: y0.t */
/* compiled from: WorkManager */
public abstract class C6111t {
    protected C6111t() {
    }

    /* renamed from: g */
    public static C6111t m35740g(Context context) {
        return C6191i.m36023m(context);
    }

    /* renamed from: h */
    public static void m35741h(Context context, C1532a aVar) {
        C6191i.m36021h(context, aVar);
    }

    /* renamed from: a */
    public abstract C6099m mo20937a(String str);

    /* renamed from: b */
    public abstract C6099m mo20938b(UUID uuid);

    /* renamed from: c */
    public abstract C6099m mo20939c(List<? extends C6112u> list);

    /* renamed from: d */
    public final C6099m mo20940d(C6112u uVar) {
        return mo20939c(Collections.singletonList(uVar));
    }

    /* renamed from: e */
    public abstract C6099m mo20941e(String str, C6087d dVar, List<C6097l> list);

    /* renamed from: f */
    public C6099m mo20942f(String str, C6087d dVar, C6097l lVar) {
        return mo20941e(str, dVar, Collections.singletonList(lVar));
    }
}
