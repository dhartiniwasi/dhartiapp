package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.core.app.r */
/* compiled from: RemoteInput */
public final class C0676r {

    /* renamed from: androidx.core.app.r$a */
    /* compiled from: RemoteInput */
    static class C0677a {
        /* renamed from: a */
        static void m3136a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m3137b(C0676r rVar) {
            throw null;
        }

        /* renamed from: c */
        static Bundle m3138c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    static RemoteInput m3134a(C0676r rVar) {
        return C0677a.m3137b(rVar);
    }

    /* renamed from: b */
    static RemoteInput[] m3135b(C0676r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i = 0; i < rVarArr.length; i++) {
            remoteInputArr[i] = m3134a(rVarArr[i]);
        }
        return remoteInputArr;
    }
}
