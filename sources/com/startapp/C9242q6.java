package com.startapp;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;

/* renamed from: com.startapp.q6 */
/* compiled from: Sta */
public class C9242q6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9214p6 f38115a;

    public C9242q6(C9214p6 p6Var) {
        this.f38115a = p6Var;
    }

    public void run() {
        long j = 1000;
        long uptimeMillis = (((long) this.f38115a.f36772s) * 1000) - SystemClock.uptimeMillis();
        C9214p6 p6Var = this.f38115a;
        long j2 = uptimeMillis + p6Var.f36825A;
        TextView textView = p6Var.f38058O;
        if (textView != null) {
            long j3 = j2 / 1000;
            if (j3 > 0 && j2 % 1000 < 100) {
                j3--;
            }
            textView.setText(String.valueOf(j3));
        }
        if (j2 >= 1000) {
            Handler handler = this.f38115a.f38062S;
            long j4 = j2 % 1000;
            if (j4 != 0) {
                j = j4;
            }
            handler.postDelayed(this, j);
            return;
        }
        C9214p6 p6Var2 = this.f38115a;
        if (p6Var2.f38058O != null) {
            p6Var2.f38059P.setVisibility(8);
            this.f38115a.f38058O.setVisibility(8);
        }
        this.f38115a.mo29409u();
    }
}
