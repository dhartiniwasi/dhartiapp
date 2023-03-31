package p419zd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import kotlin.jvm.internal.C11665g;
import p243gd.C10341m;
import p243gd.C10344n;

/* renamed from: zd.c */
/* compiled from: HandlerDispatcher.kt */
public final class C13592c {

    /* renamed from: a */
    public static final C13591b f48172a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C13591b bVar = null;
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            obj = C10341m.m52240a(new C13590a(m62920a(Looper.getMainLooper(), true), (String) null, 2, (C11665g) null));
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            obj = C10341m.m52240a(C10344n.m52244a(th));
        }
        if (!C10341m.m52242c(obj)) {
            bVar = obj;
        }
        f48172a = bVar;
    }

    /* renamed from: a */
    public static final Handler m62920a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
