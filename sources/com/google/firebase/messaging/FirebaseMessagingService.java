package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends C8039h {

    /* renamed from: f */
    private static final Queue<String> f34596f = new ArrayDeque(10);

    /* renamed from: l */
    private boolean m44140l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f34596f;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    /* renamed from: m */
    private void m44141m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C8047j0.m44311t(extras)) {
            C8047j0 j0Var = new C8047j0(extras);
            ExecutorService e = C8054m.m44362e();
            try {
                if (!new C8029e(this, j0Var, e).mo26629a()) {
                    e.shutdown();
                    if (C8041h0.m44270B(intent)) {
                        C8041h0.m44291t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e.shutdown();
            }
        }
        mo26596q(new C8059o0(extras));
    }

    /* renamed from: n */
    private String m44142n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: o */
    private void m44143o(Intent intent) {
        if (!m44140l(intent.getStringExtra("google.message_id"))) {
            m44144u(intent);
        }
    }

    /* renamed from: u */
    private void m44144u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo26595p();
                return;
            case 1:
                C8041h0.m44293v(intent);
                m44141m(intent);
                return;
            case 2:
                mo26599t(m44142n(intent), new C8071s0(intent.getStringExtra("error")));
                return;
            case 3:
                mo26597r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Intent mo26593e(Intent intent) {
        return C8073t0.m44426b().mo26730c();
    }

    /* renamed from: f */
    public void mo26594f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m44143o(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo26598s(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    /* renamed from: p */
    public void mo26595p() {
    }

    /* renamed from: q */
    public void mo26596q(C8059o0 o0Var) {
    }

    /* renamed from: r */
    public void mo26597r(String str) {
    }

    /* renamed from: s */
    public void mo26598s(String str) {
    }

    /* renamed from: t */
    public void mo26599t(String str, Exception exc) {
    }
}
