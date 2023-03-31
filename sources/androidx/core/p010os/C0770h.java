package androidx.core.p010os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.h */
/* compiled from: HandlerCompat */
public final class C0770h {

    /* renamed from: androidx.core.os.h$a */
    /* compiled from: HandlerCompat */
    private static class C0771a {
        /* renamed from: a */
        public static Handler m3523a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m3522a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return C0771a.m3523a(looper);
        }
        if (i >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }
}
