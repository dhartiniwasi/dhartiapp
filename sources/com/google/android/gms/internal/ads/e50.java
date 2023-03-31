package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class e50 implements q73 {

    /* renamed from: a */
    public final /* synthetic */ String f8658a;

    public /* synthetic */ e50(String str) {
        this.f8658a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f8658a;
        String str2 = (String) obj;
        e60 e60 = d60.f8078a;
        if (str2 != null) {
            if (((Boolean) d10.f8019f.mo13438e()).booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i = 0;
                while (true) {
                    if (i < 3) {
                        if (host.endsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            String str3 = (String) d10.f8014a.mo13438e();
            String str4 = (String) d10.f8015b.mo13438e();
            if (!TextUtils.isEmpty(str3)) {
                str = str.replace(str3, str2);
            }
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                    return parse.buildUpon().appendQueryParameter(str4, str2).toString();
                }
            }
        }
        return str;
    }
}
