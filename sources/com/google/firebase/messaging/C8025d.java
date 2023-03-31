package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p124r.C5413a;

/* renamed from: com.google.firebase.messaging.d */
/* compiled from: Constants */
public final class C8025d {

    /* renamed from: a */
    public static final long f34651a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.d$a */
    /* compiled from: Constants */
    public static final class C8026a {
        /* renamed from: a */
        public static C5413a<String, String> m44216a(Bundle bundle) {
            C5413a<String, String> aVar = new C5413a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
