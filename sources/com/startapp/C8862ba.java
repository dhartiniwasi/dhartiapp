package com.startapp;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* renamed from: com.startapp.ba */
/* compiled from: Sta */
public class C8862ba implements Comparator<PackageInfo> {
    public int compare(Object obj, Object obj2) {
        int i = (((PackageInfo) obj).firstInstallTime > ((PackageInfo) obj2).firstInstallTime ? 1 : (((PackageInfo) obj).firstInstallTime == ((PackageInfo) obj2).firstInstallTime ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }
}
