package p371uc;

import java.io.UnsupportedEncodingException;
import p336qe.C12235f;

/* renamed from: uc.c */
/* compiled from: Credentials */
public final class C12729c {
    /* renamed from: a */
    public static String m60368a(String str, String str2) {
        try {
            String a = C12235f.m58767r((str + ":" + str2).getBytes("ISO-8859-1")).mo36834a();
            return "Basic " + a;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
