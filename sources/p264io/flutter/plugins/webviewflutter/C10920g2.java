package p264io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

/* renamed from: io.flutter.plugins.webviewflutter.g2 */
/* compiled from: InputAwareWebView */
class C10920g2 extends WebView {

    /* renamed from: a */
    private View f42478a;

    /* renamed from: b */
    private C11013q2 f42479b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f42480c;

    /* renamed from: io.flutter.plugins.webviewflutter.g2$a */
    /* compiled from: InputAwareWebView */
    class C10921a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f42481a;

        C10921a(View view) {
            this.f42481a = view;
        }

        public void run() {
            if (C10920g2.this.f42480c == null) {
                Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
                return;
            }
            this.f42481a.onWindowFocusChanged(true);
            ((InputMethodManager) C10920g2.this.getContext().getSystemService("input_method")).isActive(C10920g2.this.f42480c);
        }
    }

    C10920g2(Context context, View view) {
        super(context);
        this.f42480c = view;
    }

    /* renamed from: c */
    private boolean m54393c() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m54394e() {
        if (this.f42479b != null) {
            View view = this.f42480c;
            if (view == null) {
                Log.e("InputAwareWebView", "Can't reset the input connection to the container view because there is none.");
            } else {
                setInputConnectionTarget(view);
            }
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f42478a;
        this.f42478a = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.f42480c;
        if (view3 == null) {
            Log.e("InputAwareWebView", "Can't create a proxy view because there's no container view. Text input may not work.");
            return super.checkInputConnectionProxy(view);
        }
        C11013q2 q2Var = new C11013q2(view3, view, view.getHandler());
        this.f42479b = q2Var;
        setInputConnectionTarget(q2Var);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        m54394e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34655d() {
        C11013q2 q2Var = this.f42479b;
        if (q2Var != null) {
            q2Var.mo34769a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        m54394e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34657f() {
        C11013q2 q2Var = this.f42479b;
        if (q2Var != null) {
            q2Var.mo34769a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !m54393c() || z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    /* access modifiers changed from: package-private */
    public void setContainerView(View view) {
        this.f42480c = view;
        if (this.f42479b != null) {
            Log.w("InputAwareWebView", "The containerView has changed while the proxyAdapterView exists.");
            if (view != null) {
                setInputConnectionTarget(this.f42479b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setInputConnectionTarget(View view) {
        if (this.f42480c == null) {
            Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
            return;
        }
        view.requestFocus();
        this.f42480c.post(new C10921a(view));
    }
}
