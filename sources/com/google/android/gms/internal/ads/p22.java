package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p22 implements mw2 {

    /* renamed from: d */
    private static final Pattern f15663d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a */
    private final String f15664a;

    /* renamed from: b */
    private final ny2 f15665b;

    /* renamed from: c */
    private final yy2 f15666c;

    public p22(String str, yy2 yy2, ny2 ny2) {
        this.f15664a = str;
        this.f15666c = yy2;
        this.f15665b = ny2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo9017b(Object obj) throws Exception {
        String str;
        o22 o22 = (o22) obj;
        int optInt = o22.f14806a.optInt("http_timeout_millis", 60000);
        bh0 a = o22.f14807b;
        String str2 = "";
        if (a.mo8796a() == -2) {
            HashMap hashMap = new HashMap();
            if (o22.f14807b.mo8803h() && !TextUtils.isEmpty(this.f15664a)) {
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14323I0)).booleanValue()) {
                    String str3 = this.f15664a;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = f15663d.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.f15664a);
                }
            }
            if (o22.f14807b.mo8804i()) {
                JSONObject optJSONObject = o22.f14806a.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    C4794n1.m30693k("DSID signal does not exist.");
                }
            }
            if (o22.f14807b != null && !TextUtils.isEmpty(o22.f14807b.mo8799d())) {
                str2 = o22.f14807b.mo8799d();
            }
            yy2 yy2 = this.f15666c;
            ny2 ny2 = this.f15665b;
            ny2.mo11826G(true);
            yy2.mo15515a(ny2);
            return new k22(o22.f14807b.mo8800e(), optInt, hashMap, str2.getBytes(o73.f14986c), "");
        }
        yy2 yy22 = this.f15666c;
        ny2 ny22 = this.f15665b;
        ny22.mo11826G(false);
        yy22.mo15515a(ny22);
        if (a.mo8796a() == 1) {
            if (a.mo8801f() != null) {
                str2 = TextUtils.join(", ", a.mo8801f());
                pm0.m18664d(str2);
            }
            throw new cz1(2, "Error building request URL: ".concat(String.valueOf(str2)));
        }
        throw new cz1(1);
    }
}
