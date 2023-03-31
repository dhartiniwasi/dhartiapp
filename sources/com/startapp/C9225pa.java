package com.startapp;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: com.startapp.pa */
/* compiled from: Sta */
public class C9225pa extends TelephonyManager.CellInfoCallback {

    /* renamed from: a */
    public final /* synthetic */ C9246qa f38082a;

    public C9225pa(C9246qa qaVar) {
        this.f38082a = qaVar;
    }

    public void onCellInfo(List<CellInfo> list) {
        this.f38082a.mo29858b(false);
    }
}
