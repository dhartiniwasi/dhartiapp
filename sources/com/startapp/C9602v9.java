package com.startapp;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: com.startapp.v9 */
/* compiled from: Sta */
public class C9602v9 {

    /* renamed from: a */
    private static final String f39298a = "v9";

    /* renamed from: b */
    private static final String f39299b = "SHA-256";

    /* renamed from: c */
    private static final int f39300c = 8192;

    /* renamed from: a */
    public static byte[] m50424a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f39299b);
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m50423a(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance(f39299b);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[f39300c];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return instance.digest();
                }
            }
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return null;
        }
    }
}
