package p164x0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p345re.C12451a;

/* renamed from: x0.v */
/* compiled from: WebViewGlueCommunicator */
public class C6025v {

    /* renamed from: x0.v$a */
    /* compiled from: WebViewGlueCommunicator */
    private static class C6026a {

        /* renamed from: a */
        static final C6005c0 f29292a = new C6005c0(C6025v.m35448d().getWebkitToCompatConverter());
    }

    /* renamed from: x0.v$b */
    /* compiled from: WebViewGlueCommunicator */
    private static class C6027b {

        /* renamed from: a */
        static final C6029x f29293a = C6025v.m35445a();
    }

    /* renamed from: a */
    static C6029x m35445a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new C6012j();
        }
        try {
            return new C6030y((WebViewProviderFactoryBoundaryInterface) C12451a.m59406a(WebViewProviderFactoryBoundaryInterface.class, m35446b()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new C6012j();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m35446b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m35449e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: c */
    public static C6005c0 m35447c() {
        return C6026a.f29292a;
    }

    /* renamed from: d */
    public static C6029x m35448d() {
        return C6027b.f29293a;
    }

    /* renamed from: e */
    public static ClassLoader m35449e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6008f.m35391b();
        }
        return m35450f().getClass().getClassLoader();
    }

    /* renamed from: f */
    private static Object m35450f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
