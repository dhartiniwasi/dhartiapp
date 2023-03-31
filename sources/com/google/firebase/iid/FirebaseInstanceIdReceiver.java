package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C8041h0;
import com.google.firebase.messaging.C8052l;
import java.util.concurrent.ExecutionException;
import p174y4.C6138a;
import p174y4.C6140b;
import p218e6.C9980l;

public final class FirebaseInstanceIdReceiver extends C6140b {
    /* renamed from: g */
    private static Intent m43958g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo20998b(Context context, C6138a aVar) {
        try {
            return ((Integer) C9980l.m51027a(new C8052l(context).mo26676i(aVar.mo20995I1()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20999c(Context context, Bundle bundle) {
        Intent g = m43958g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C8041h0.m44270B(g)) {
            C8041h0.m44290s(g);
        }
    }
}
