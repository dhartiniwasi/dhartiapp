package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q63 {

    /* renamed from: a */
    private final String f16217a;

    public q63(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f16217a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m19088f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int mo13476a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m19088f(this.f16217a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo13477b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m19088f(this.f16217a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo13478c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m19088f(this.f16217a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo13479d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m19088f(this.f16217a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo13480e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m19088f(this.f16217a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
