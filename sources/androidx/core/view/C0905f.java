package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.f */
/* compiled from: KeyEventDispatcher */
public class C0905f {

    /* renamed from: a */
    private static boolean f2552a = false;

    /* renamed from: b */
    private static Method f2553b = null;

    /* renamed from: c */
    private static boolean f2554c = false;

    /* renamed from: d */
    private static Field f2555d;

    /* renamed from: androidx.core.view.f$a */
    /* compiled from: KeyEventDispatcher */
    public interface C0906a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m4103a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2552a) {
            try {
                f2553b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f2552a = true;
        }
        Method method = f2553b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m4104b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m4103a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0835a0.m3730i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m4105c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m4108f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0835a0.m3730i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m4106d(View view, KeyEvent keyEvent) {
        return C0835a0.m3732j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m4107e(C0906a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m4104b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m4105c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C0835a0.m3730i(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m4108f(Dialog dialog) {
        if (!f2554c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2555d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2554c = true;
        }
        Field field = f2555d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
