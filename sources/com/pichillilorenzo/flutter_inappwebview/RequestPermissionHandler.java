package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import androidx.core.app.C0615b;
import androidx.core.content.C0681a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RequestPermissionHandler implements C0615b.C0620e {
    private static Map<Integer, List<Runnable>> actionDictionary = new HashMap();

    public static void checkAndRun(Activity activity, String str, int i, Runnable runnable) {
        if (C0681a.m3145a(activity.getApplicationContext(), str) != 0) {
            if (actionDictionary.containsKey(Integer.valueOf(i))) {
                actionDictionary.get(Integer.valueOf(i)).add(runnable);
            } else {
                actionDictionary.put(Integer.valueOf(i), Arrays.asList(new Runnable[]{runnable}));
            }
            C0615b.m2923u(activity, new String[]{str}, i);
            return;
        }
        runnable.run();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length > 0 && iArr[0] == 0) {
            List<Runnable> list = actionDictionary.get(Integer.valueOf(i));
            for (Runnable runnable : list) {
                runnable.run();
                list.remove(runnable);
            }
        }
    }
}
