package com.startapp;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* renamed from: com.startapp.a */
/* compiled from: Sta */
public class C8811a {

    /* renamed from: a */
    public static final byte[] f36365a = {10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};

    /* renamed from: b */
    public static final String f36366b = "ts";

    /* renamed from: c */
    public static final String f36367c = "tsh";

    /* renamed from: d */
    public static final String f36368d = "afh";

    /* renamed from: e */
    public static final String f36369e = "MD5";

    /* renamed from: f */
    public static final String f36370f = "UTF-8";

    /* renamed from: g */
    public static final byte[] f36371g = {12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};

    static {
        C8837b0.m48296a((Class<?>) C8811a.class);
    }

    /* renamed from: a */
    public static String m48222a() {
        int hashCode = f36365a.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if (((-hashCode) & hashCode) != hashCode) {
                int i2 = i % hashCode;
            }
        }
        return new Long(System.currentTimeMillis()).toString();
    }

    /* renamed from: b */
    public static String m48226b(String str) {
        return Base64.encodeToString(m48224a(str.getBytes()), 2);
    }

    /* renamed from: c */
    public static String m48227c(String str) {
        String str2 = "";
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f36370f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String a = m48222a();
        StringBuilder a2 = C8870c1.m48422a("&");
        a2.append(f36366b);
        a2.append("=");
        a2.append(a);
        a2.append("&");
        a2.append(f36368d);
        a2.append("=");
        a2.append(m48223a(str2 + a));
        return a2.toString();
    }

    /* renamed from: a */
    public static String m48223a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f36365a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            byte b2 = bArr[i];
        }
        byte[] bytes2 = str.getBytes();
        byte b3 = f36365a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, b3)];
        for (int i2 = 0; i2 < bytes2.length; i2++) {
            int i3 = i2 % b3;
            bArr2[i3] = (byte) (bArr2[i3] ^ bytes2[i2]);
        }
        byte[] bArr3 = f36365a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f36369e).digest(m48225a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f36370f);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static byte[] m48224a(byte[] bArr) {
        byte[] bArr2 = f36371g;
        int hashCode = bArr2.hashCode();
        long hashCode2 = (long) bArr.hashCode();
        if (((long) hashCode) > hashCode2) {
            int i = (int) ((((hashCode2 * 29509871405L) + 11) & 16777215) >>> 17);
            if (hashCode >= 1000) {
                int i2 = i % hashCode;
            }
        }
        return m48225a(m48225a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    /* renamed from: a */
    public static byte[] m48225a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
