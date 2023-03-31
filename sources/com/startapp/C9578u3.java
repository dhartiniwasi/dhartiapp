package com.startapp;

import com.startapp.networkTest.data.TimeInfo;

/* renamed from: com.startapp.u3 */
/* compiled from: Sta */
public class C9578u3 {
    /* renamed from: a */
    public static String m50392a(TimeInfo timeInfo, String str) {
        byte[] bArr;
        if (timeInfo == null || str == null || str.length() == 0) {
            return null;
        }
        StringBuilder a = C8870c1.m48422a(str);
        a.append(timeInfo.TimestampMillis);
        try {
            bArr = C9602v9.m50424a(a.toString().getBytes("UTF-8"));
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return C8942f2.m48565a(bArr);
    }
}
