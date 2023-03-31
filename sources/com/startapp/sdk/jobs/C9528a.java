package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C9058k0;
import com.startapp.sdk.jobs.C9529b;
import java.lang.reflect.Constructor;

/* renamed from: com.startapp.sdk.jobs.a */
/* compiled from: Sta */
public abstract class C9528a {
    /* renamed from: a */
    public abstract void mo31222a(C9529b bVar);

    /* renamed from: a */
    public boolean mo31224a(Context context, String[] strArr, C9529b.C9530a aVar, Bundle bundle) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (String cls : strArr) {
            Class<? extends U> cls2 = null;
            try {
                cls2 = Class.forName(cls).asSubclass(C9529b.class);
            } catch (ClassNotFoundException unused) {
            }
            if (cls2 != null) {
                try {
                    Constructor<? extends U> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{Context.class, C9529b.C9530a.class, Bundle.class});
                    declaredConstructor.setAccessible(true);
                    Context a = C9058k0.m48718a(context);
                    if (a == null) {
                        a = context;
                    }
                    mo31222a((C9529b) declaredConstructor.newInstance(new Object[]{a, aVar, bundle}));
                    z = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z;
    }
}
