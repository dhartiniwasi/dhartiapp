package com.startapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.startapp.m9 */
/* compiled from: Sta */
public final class C9134m9 {
    /* renamed from: a */
    public static String m48966a(String str, String str2) {
        Pattern pattern = C8866be.f36550a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        C9542se.m50339a(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        return (!C8866be.m48415b(str2, sb, C8866be.f36551b, str3, iArr2) && !C8866be.m48414a(str2, sb, C8866be.f36550a, str3, iArr2) && !C8866be.m48415b(str2, sb, C8866be.f36553d, str3, iArr2) && !C8866be.m48414a(str2, sb, C8866be.f36552c, str3, iArr2) && !C8866be.m48415b(str2, sb, C8866be.f36555f, str3, iArr2) && !C8866be.m48414a(str2, sb, C8866be.f36554e, str3, iArr2) && !C8866be.m48414a(str2, sb, C8866be.f36556g, str3, iArr2)) ? C9688ze.m50607a(str3, str2) : sb.toString();
    }
}
