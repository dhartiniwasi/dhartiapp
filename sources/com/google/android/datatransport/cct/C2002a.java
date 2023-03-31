package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p084l1.C4902b;
import p098n1.C5083g;

/* renamed from: com.google.android.datatransport.cct.a */
/* compiled from: CCTDestination */
public final class C2002a implements C5083g {

    /* renamed from: c */
    static final String f5704c;

    /* renamed from: d */
    static final String f5705d;

    /* renamed from: e */
    private static final String f5706e;

    /* renamed from: f */
    private static final Set<C4902b> f5707f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C4902b[]{C4902b.m31123b("proto"), C4902b.m31123b("json")})));

    /* renamed from: g */
    public static final C2002a f5708g;

    /* renamed from: h */
    public static final C2002a f5709h;

    /* renamed from: a */
    private final String f5710a;

    /* renamed from: b */
    private final String f5711b;

    static {
        String a = C2008e.m8736a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5704c = a;
        String a2 = C2008e.m8736a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f5705d = a2;
        String a3 = C2008e.m8736a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5706e = a3;
        f5708g = new C2002a(a, (String) null);
        f5709h = new C2002a(a2, a3);
    }

    public C2002a(String str, String str2) {
        this.f5710a = str;
        this.f5711b = str2;
    }

    /* renamed from: d */
    public static C2002a m8713d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2002a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: M0 */
    public byte[] mo7709M0() {
        return mo7712c();
    }

    /* renamed from: a */
    public Set<C4902b> mo7710a() {
        return f5707f;
    }

    /* renamed from: b */
    public String mo7711b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] mo7712c() {
        String str = this.f5711b;
        if (str == null && this.f5710a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5710a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String mo7713e() {
        return this.f5711b;
    }

    /* renamed from: f */
    public String mo7714f() {
        return this.f5710a;
    }
}
