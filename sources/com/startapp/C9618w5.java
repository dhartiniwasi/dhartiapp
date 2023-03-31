package com.startapp;

import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.ads.list3d.List3DView;

/* renamed from: com.startapp.w5 */
/* compiled from: Sta */
public class C9618w5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List3DView f39329a;

    public C9618w5(List3DView list3DView) {
        this.f39329a = list3DView;
    }

    public void run() {
        int b;
        List3DView list3DView = this.f39329a;
        if (list3DView.f38336b == 1 && (b = list3DView.mo30127b(list3DView.f38337c, list3DView.f38338d)) != -1) {
            List3DView list3DView2 = this.f39329a;
            View childAt = list3DView2.getChildAt(b);
            int i = list3DView2.f38343i + b;
            long itemId = list3DView2.f38335a.getItemId(i);
            AdapterView.OnItemLongClickListener onItemLongClickListener = list3DView2.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                onItemLongClickListener.onItemLongClick(list3DView2, childAt, i, itemId);
            }
        }
    }
}
