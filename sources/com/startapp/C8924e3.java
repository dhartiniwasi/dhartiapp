package com.startapp;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.startapp.e3 */
/* compiled from: Sta */
public class C8924e3 implements C9663ya {

    /* renamed from: a */
    public final C9623wa f36721a;

    public C8924e3(C9623wa waVar) {
        this.f36721a = waVar;
    }

    /* renamed from: a */
    public String mo29326a(String str) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(str.getBytes());
                C8909d4.m48509a(gZIPOutputStream2);
                String a = this.f36721a.mo31350a(C9546t0.m50352b(byteArrayOutputStream.toByteArray()));
                C8909d4.m48509a(gZIPOutputStream2);
                return a;
            } catch (Exception unused) {
                gZIPOutputStream = gZIPOutputStream2;
                C8909d4.m48509a(gZIPOutputStream);
                return "";
            } catch (Throwable th) {
                C8909d4.m48509a(gZIPOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            C8909d4.m48509a(gZIPOutputStream);
            return "";
        }
    }
}
