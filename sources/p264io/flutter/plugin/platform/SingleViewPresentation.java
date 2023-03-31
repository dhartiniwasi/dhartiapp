package p264io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p297mb.C11881b;

@Keep
/* renamed from: io.flutter.plugin.platform.SingleViewPresentation */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C10722a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private C10716a rootView;
    private boolean startFocused = false;
    private final C10720e state;
    private int viewId;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$a */
    private static class C10716a extends FrameLayout {

        /* renamed from: a */
        private final C10722a f42005a;

        /* renamed from: b */
        private final View f42006b;

        public C10716a(Context context, C10722a aVar, View view) {
            super(context);
            this.f42005a = aVar;
            this.f42006b = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f42005a.mo34237b(this.f42006b, view, accessibilityEvent);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$b */
    static class C10717b extends ViewGroup {

        /* renamed from: a */
        private final Rect f42007a = new Rect();

        /* renamed from: b */
        private final Rect f42008b = new Rect();

        public C10717b(Context context) {
            super(context);
        }

        /* renamed from: a */
        private static int m53632a(int i) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), RecyclerView.UNDEFINED_DURATION);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f42007a.set(i, i2, i3, i4);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f42007a, layoutParams.x, layoutParams.y, this.f42008b);
                Rect rect = this.f42008b;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                getChildAt(i3).measure(m53632a(i), m53632a(i2));
            }
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$c */
    private static class C10718c extends ContextWrapper {

        /* renamed from: a */
        private final InputMethodManager f42009a;

        C10718c(Context context) {
            this(context, (InputMethodManager) null);
        }

        public Context createDisplayContext(Display display) {
            return new C10718c(super.createDisplayContext(display), this.f42009a);
        }

        public Object getSystemService(String str) {
            if ("input_method".equals(str)) {
                return this.f42009a;
            }
            return super.getSystemService(str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C10718c(android.content.Context r1, android.view.inputmethod.InputMethodManager r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                if (r2 == 0) goto L_0x0006
                goto L_0x000f
            L_0x0006:
                java.lang.String r2 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r2)
                r2 = r1
                android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            L_0x000f:
                r0.f42009a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugin.platform.SingleViewPresentation.C10718c.<init>(android.content.Context, android.view.inputmethod.InputMethodManager):void");
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$d */
    private static class C10719d extends ContextWrapper {

        /* renamed from: a */
        private final C10721f f42010a;

        /* renamed from: b */
        private WindowManager f42011b;

        /* renamed from: c */
        private final Context f42012c;

        C10719d(Context context, C10721f fVar, Context context2) {
            super(context);
            this.f42010a = fVar;
            this.f42012c = context2;
        }

        /* renamed from: a */
        private WindowManager m53633a() {
            if (this.f42011b == null) {
                this.f42011b = this.f42010a.mo34234b();
            }
            return this.f42011b;
        }

        /* renamed from: b */
        private boolean m53634b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int i = 0;
            while (i < stackTrace.length && i < 11) {
                if (stackTrace[i].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("<init>")) {
                    return true;
                }
                i++;
            }
            return false;
        }

        public Object getSystemService(String str) {
            if (!"window".equals(str)) {
                return super.getSystemService(str);
            }
            if (m53634b()) {
                return this.f42012c.getSystemService(str);
            }
            return m53633a();
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$e */
    static class C10720e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10731f f42013a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10721f f42014b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10717b f42015c;

        C10720e() {
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$f */
    static class C10721f implements InvocationHandler {

        /* renamed from: a */
        private final WindowManager f42016a;

        /* renamed from: b */
        C10717b f42017b;

        C10721f(WindowManager windowManager, C10717b bVar) {
            this.f42016a = windowManager;
            this.f42017b = bVar;
        }

        /* renamed from: a */
        private void m53641a(Object[] objArr) {
            C10717b bVar = this.f42017b;
            if (bVar == null) {
                C11881b.m57389g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView(objArr[0], objArr[1]);
            }
        }

        /* renamed from: c */
        private void m53642c(Object[] objArr) {
            C10717b bVar = this.f42017b;
            if (bVar == null) {
                C11881b.m57389g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView(objArr[0]);
            }
        }

        /* renamed from: d */
        private void m53643d(Object[] objArr) {
            if (this.f42017b == null) {
                C11881b.m57389g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = objArr[0];
            view.clearAnimation();
            this.f42017b.removeView(view);
        }

        /* renamed from: e */
        private void m53644e(Object[] objArr) {
            C10717b bVar = this.f42017b;
            if (bVar == null) {
                C11881b.m57389g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout(objArr[0], objArr[1]);
            }
        }

        /* renamed from: b */
        public WindowManager mo34234b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            name.hashCode();
            char c = 65535;
            switch (name.hashCode()) {
                case -1148522778:
                    if (name.equals("addView")) {
                        c = 0;
                        break;
                    }
                    break;
                case 542766184:
                    if (name.equals("removeViewImmediate")) {
                        c = 1;
                        break;
                    }
                    break;
                case 931413976:
                    if (name.equals("updateViewLayout")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1098630473:
                    if (name.equals("removeView")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m53641a(objArr);
                    return null;
                case 1:
                    m53643d(objArr);
                    return null;
                case 2:
                    m53644e(objArr);
                    return null;
                case 3:
                    m53642c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f42016a, objArr);
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, C10731f fVar, C10722a aVar, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new C10718c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        C10720e eVar = new C10720e();
        this.state = eVar;
        C10731f unused = eVar.f42013a = fVar;
        getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setType(2030);
        }
    }

    public C10720e detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public C10731f getView() {
        if (this.state.f42013a == null) {
            return null;
        }
        return this.state.f42013a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f42015c == null) {
            C10717b unused = this.state.f42015c = new C10717b(getContext());
        }
        if (this.state.f42014b == null) {
            C10720e eVar = this.state;
            C10721f unused2 = eVar.f42014b = new C10721f((WindowManager) getContext().getSystemService("window"), eVar.f42015c);
        }
        this.container = new FrameLayout(getContext());
        C10719d dVar = new C10719d(getContext(), this.state.f42014b, this.outerContext);
        View view = this.state.f42013a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(dVar);
        } else {
            C11881b.m57389g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        C10716a aVar = new C10716a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f42015c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C10722a aVar, C10720e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z) {
        super(new C10718c(context), display);
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z;
    }
}
