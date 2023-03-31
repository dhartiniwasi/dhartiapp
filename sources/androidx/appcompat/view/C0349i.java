package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: androidx.appcompat.view.i */
/* compiled from: WindowCallbackWrapper */
public class C0349i implements Window.Callback {

    /* renamed from: a */
    final Window.Callback f999a;

    /* renamed from: androidx.appcompat.view.i$a */
    /* compiled from: WindowCallbackWrapper */
    static class C0350a {
        /* renamed from: a */
        static boolean m1702a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* renamed from: b */
        static ActionMode m1703b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$b */
    /* compiled from: WindowCallbackWrapper */
    static class C0351b {
        /* renamed from: a */
        static void m1704a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$c */
    /* compiled from: WindowCallbackWrapper */
    static class C0352c {
        /* renamed from: a */
        static void m1705a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public C0349i(Window.Callback callback) {
        if (callback != null) {
            this.f999a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo1159a() {
        return this.f999a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f999a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f999a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f999a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f999a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f999a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f999a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f999a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f999a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f999a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f999a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f999a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f999a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f999a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f999a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f999a.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        C0352c.m1705a(this.f999a, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f999a.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C0351b.m1704a(this.f999a, list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C0350a.m1702a(this.f999a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f999a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f999a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f999a.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f999a.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0350a.m1703b(this.f999a, callback, i);
    }
}
