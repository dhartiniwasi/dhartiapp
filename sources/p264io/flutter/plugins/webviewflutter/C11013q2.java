package p264io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: io.flutter.plugins.webviewflutter.q2 */
/* compiled from: ThreadedInputConnectionProxyAdapterView */
final class C11013q2 extends View {

    /* renamed from: a */
    final Handler f42586a;

    /* renamed from: b */
    final IBinder f42587b;

    /* renamed from: c */
    final View f42588c;

    /* renamed from: d */
    final View f42589d;

    /* renamed from: e */
    final View f42590e;

    /* renamed from: f */
    private boolean f42591f = true;

    /* renamed from: g */
    private boolean f42592g = false;

    /* renamed from: h */
    private InputConnection f42593h;

    C11013q2(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f42586a = handler;
        this.f42588c = view;
        this.f42590e = view2;
        this.f42587b = view.getWindowToken();
        this.f42589d = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34769a(boolean z) {
        this.f42592g = z;
    }

    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public Handler getHandler() {
        return this.f42586a;
    }

    public View getRootView() {
        return this.f42589d;
    }

    public IBinder getWindowToken() {
        return this.f42587b;
    }

    public boolean hasWindowFocus() {
        return true;
    }

    public boolean isFocused() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f42591f = false;
        InputConnection onCreateInputConnection = this.f42592g ? this.f42593h : this.f42590e.onCreateInputConnection(editorInfo);
        this.f42591f = true;
        this.f42593h = onCreateInputConnection;
        return onCreateInputConnection;
    }
}
