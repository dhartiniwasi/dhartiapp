package com.startapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.startapp.be */
/* compiled from: Sta */
public class C8866be {

    /* renamed from: a */
    public static final Pattern f36550a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    public static final Pattern f36551b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    public static final Pattern f36552c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    public static final Pattern f36553d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    public static final Pattern f36554e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    public static final Pattern f36555f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    public static final Pattern f36556g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    public static boolean m48413a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m48414a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m48413a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m48415b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m48413a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
