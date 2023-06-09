package com.startapp;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: com.startapp.p8 */
/* compiled from: Sta */
public class C9221p8 {

    /* renamed from: a */
    public final Context f38072a;

    public C9221p8(Context context) {
        this.f38072a = context;
    }

    /* renamed from: a */
    public boolean mo29819a(String str) {
        boolean z = false;
        for (String file : C9244q8.f38118c) {
            if (new File(file, str).exists()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo29821b() {
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
        }
        boolean z = false;
        for (String split : strArr) {
            String[] split2 = split.split(" ");
            if (split2.length >= 4) {
                String str = split2[1];
                String str2 = split2[3];
                for (String equalsIgnoreCase : C9244q8.f38119d) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        String[] split3 = str2.split(",");
                        int length = split3.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (split3[i].equalsIgnoreCase("rw")) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29822c() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "which"
            java.lang.String r3 = "su"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x002c }
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ all -> 0x002c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
            java.lang.String r2 = r2.readLine()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0026
            r0 = 1
        L_0x0026:
            r1.destroy()
            return r0
        L_0x002a:
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.destroy()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9221p8.mo29822c():boolean");
    }

    /* renamed from: a */
    public final boolean mo29820a(List<String> list) {
        PackageManager packageManager = this.f38072a.getPackageManager();
        boolean z = false;
        for (String packageInfo : list) {
            try {
                packageManager.getPackageInfo(packageInfo, 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo29818a() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] strArr = new String[0];
        try {
            strArr = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
        }
        boolean z = false;
        for (String str : strArr) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    if (str.contains("[" + ((String) hashMap.get(str2)) + "]")) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
