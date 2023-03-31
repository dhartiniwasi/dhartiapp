package p342rb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import p264io.flutter.embedding.android.C10623a;
import p264io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p325pc.C12172h;

/* renamed from: rb.a */
/* compiled from: FlutterMutatorView */
public class C12269a extends FrameLayout {

    /* renamed from: a */
    private FlutterMutatorsStack f45479a;

    /* renamed from: b */
    private float f45480b;

    /* renamed from: c */
    private int f45481c;

    /* renamed from: d */
    private int f45482d;

    /* renamed from: e */
    private int f45483e;

    /* renamed from: f */
    private int f45484f;

    /* renamed from: g */
    private final C10623a f45485g;

    /* renamed from: h */
    ViewTreeObserver.OnGlobalFocusChangeListener f45486h;

    /* renamed from: rb.a$a */
    /* compiled from: FlutterMutatorView */
    class C12270a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ View.OnFocusChangeListener f45487a;

        /* renamed from: b */
        final /* synthetic */ View f45488b;

        C12270a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f45487a = onFocusChangeListener;
            this.f45488b = view;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f45487a;
            View view3 = this.f45488b;
            onFocusChangeListener.onFocusChange(view3, C12172h.m58452c(view3));
        }
    }

    public C12269a(Context context, float f, C10623a aVar) {
        super(context, (AttributeSet) null);
        this.f45480b = f;
        this.f45485g = aVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f45479a.getFinalMatrix());
        float f = this.f45480b;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate((float) (-this.f45481c), (float) (-this.f45482d));
        return matrix;
    }

    /* renamed from: a */
    public void mo36906a(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f45479a = flutterMutatorsStack;
        this.f45481c = i;
        this.f45482d = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public void mo36907b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f45486h) != null) {
            this.f45486h = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f45479a.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f45481c), (float) (-this.f45482d));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45485g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f45481c;
            this.f45483e = i;
            int i2 = this.f45482d;
            this.f45484f = i2;
            matrix.postTranslate((float) i, (float) i2);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f45481c, (float) this.f45482d);
        } else {
            matrix.postTranslate((float) this.f45483e, (float) this.f45484f);
            this.f45483e = this.f45481c;
            this.f45484f = this.f45482d;
        }
        return this.f45485g.mo33835g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        mo36907b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f45486h == null) {
            C12270a aVar = new C12270a(onFocusChangeListener, this);
            this.f45486h = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
