package com.onesignal;

import java.io.File;

/* renamed from: com.onesignal.b4 */
/* compiled from: RootToolsInternalMethods */
class C8316b4 {
    /* renamed from: a */
    static boolean m46332a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        int i = 0;
        while (i < 8) {
            try {
                String str = strArr[i];
                if (new File(str + "su").exists()) {
                    return true;
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
