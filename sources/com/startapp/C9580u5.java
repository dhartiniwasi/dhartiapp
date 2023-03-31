package com.startapp;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.u5 */
/* compiled from: Sta */
public class C9580u5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f39249a;

    public C9580u5(List3DView list3DView) {
        this.f39249a = list3DView;
    }

    public void run() {
        this.f39249a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f39249a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
