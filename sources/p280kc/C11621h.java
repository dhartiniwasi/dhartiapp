package p280kc;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6568r;

/* renamed from: kc.h */
/* compiled from: Messages */
public class C11621h {

    /* renamed from: kc.h$a */
    /* compiled from: Messages */
    public interface C11622a {
        /* renamed from: a */
        List<String> mo35783a();

        /* renamed from: b */
        List<String> mo35784b(C11624c cVar);

        /* renamed from: c */
        String mo35785c();

        /* renamed from: d */
        String mo35786d();

        /* renamed from: e */
        String mo35787e();

        /* renamed from: f */
        String mo35788f();
    }

    /* renamed from: kc.h$b */
    /* compiled from: Messages */
    private static class C11623b extends C6568r {

        /* renamed from: d */
        public static final C11623b f44170d = new C11623b();

        private C11623b() {
        }
    }

    /* renamed from: kc.h$c */
    /* compiled from: Messages */
    public enum C11624c {
        root(0),
        music(1),
        podcasts(2),
        ringtones(3),
        alarms(4),
        notifications(5),
        pictures(6),
        movies(7),
        downloads(8),
        dcim(9),
        documents(10);
        

        /* renamed from: a */
        private int f44183a;

        private C11624c(int i) {
            this.f44183a = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m56684b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
