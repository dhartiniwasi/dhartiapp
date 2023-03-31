package com.onesignal;

import com.onesignal.C8338d3;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.onesignal.r0 */
/* compiled from: OSDynamicTriggerTimer */
class C8584r0 {
    /* renamed from: a */
    static void m47592a(TimerTask timerTask, String str, long j) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "scheduleTrigger: " + str + " delay: " + j);
        StringBuilder sb = new StringBuilder();
        sb.append("trigger_timer:");
        sb.append(str);
        new Timer(sb.toString()).schedule(timerTask, j);
    }
}
