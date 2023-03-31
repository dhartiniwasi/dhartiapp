package com.startapp;

import android.app.Activity;
import com.startapp.C9219p7;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.startapp.n */
/* compiled from: Sta */
public class C9141n {

    /* renamed from: m */
    public static Pattern f37314m;

    /* renamed from: a */
    public final String f37315a;

    /* renamed from: b */
    public final C9219p7.C9220a f37316b;

    /* renamed from: c */
    public final boolean f37317c;

    /* renamed from: d */
    public final boolean f37318d;

    /* renamed from: e */
    public boolean f37319e;

    /* renamed from: f */
    public boolean f37320f;

    /* renamed from: g */
    public long f37321g;

    /* renamed from: h */
    public long f37322h;

    /* renamed from: i */
    public long f37323i;

    /* renamed from: j */
    public long f37324j;

    /* renamed from: k */
    public int f37325k;

    /* renamed from: l */
    public boolean f37326l;

    public C9141n(String str, C9219p7.C9220a aVar, boolean z, boolean z2) {
        this.f37315a = str;
        this.f37316b = aVar;
        this.f37317c = z;
        this.f37318d = z2;
    }

    /* renamed from: a */
    public static void m48981a(StringBuilder sb, String str, String str2, boolean z) {
        if (str != null) {
            sb.append(str);
            sb.append('=');
        }
        if (z) {
            sb.append('(');
            sb.append(str2);
            sb.append(')');
        } else {
            sb.append(str2);
        }
        sb.append(", ");
    }

    /* renamed from: a */
    public static void m48980a(StringBuilder sb) {
        if (sb.length() >= 2 && sb.substring(sb.length() - 2, sb.length()).equals(", ")) {
            sb.delete(sb.length() - 2, sb.length());
        }
    }

    /* renamed from: a */
    public static String m48979a(long j) {
        boolean z = true;
        String format = String.format(Locale.ENGLISH, "%.3f", new Object[]{Float.valueOf(((float) j) / 1000000.0f)});
        Map<Activity, Integer> map = C9605vb.f39316a;
        int length = format.length() - 1;
        int i = 0;
        while (length >= 0) {
            char charAt = format.charAt(length);
            if (charAt == '0') {
                if (z) {
                    i++;
                }
            } else if (charAt == '.') {
                if (!z) {
                    length = format.length() - i;
                }
                return format.substring(0, length);
            } else {
                z = false;
            }
            length--;
        }
        return format;
    }
}
