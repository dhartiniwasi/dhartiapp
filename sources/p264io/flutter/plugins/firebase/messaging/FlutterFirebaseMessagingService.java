package p264io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.C8059o0;
import com.google.firebase.messaging.FirebaseMessagingService;
import p063i0.C4643a;

/* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingService */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    /* renamed from: q */
    public void mo26596q(C8059o0 o0Var) {
    }

    /* renamed from: s */
    public void mo26598s(String str) {
        Intent intent = new Intent("io.flutter.plugins.firebase.messaging.TOKEN");
        intent.putExtra("token", str);
        C4643a.m30235b(getApplicationContext()).mo18317d(intent);
    }
}
