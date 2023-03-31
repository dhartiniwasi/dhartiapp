package p261ic;

import android.content.Context;
import android.util.Log;

/* renamed from: ic.a */
/* compiled from: ContextHolder */
public class C10592a {

    /* renamed from: a */
    private static Context f41649a;

    /* renamed from: a */
    public static Context m53190a() {
        return f41649a;
    }

    /* renamed from: b */
    public static void m53191b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        f41649a = context;
    }
}
