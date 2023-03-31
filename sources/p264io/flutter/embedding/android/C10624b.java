package p264io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
/* renamed from: io.flutter.embedding.android.b */
/* compiled from: DrawableSplashScreen */
public final class C10624b implements C10679x {

    /* renamed from: a */
    private final Drawable f41724a;

    /* renamed from: b */
    private final ImageView.ScaleType f41725b;

    /* renamed from: c */
    private final long f41726c;

    /* renamed from: d */
    private C10626b f41727d;

    /* renamed from: io.flutter.embedding.android.b$a */
    /* compiled from: DrawableSplashScreen */
    class C10625a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f41728a;

        C10625a(Runnable runnable) {
            this.f41728a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f41728a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f41728a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b */
    /* compiled from: DrawableSplashScreen */
    public static class C10626b extends ImageView {
        public C10626b(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        /* renamed from: a */
        public void mo33844a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            mo33844a(drawable, ImageView.ScaleType.FIT_XY);
        }

        public C10626b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public C10624b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    /* renamed from: a */
    public void mo33836a(Runnable runnable) {
        C10626b bVar = this.f41727d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f41726c).setListener(new C10625a(runnable));
        }
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo33837b() {
        return C10678w.m53466a(this);
    }

    /* renamed from: c */
    public View mo33838c(Context context, Bundle bundle) {
        C10626b bVar = new C10626b(context);
        this.f41727d = bVar;
        bVar.mo33844a(this.f41724a, this.f41725b);
        return this.f41727d;
    }

    /* renamed from: d */
    public /* synthetic */ Bundle mo33839d() {
        return C10678w.m53467b(this);
    }

    public C10624b(Drawable drawable, ImageView.ScaleType scaleType, long j) {
        this.f41724a = drawable;
        this.f41725b = scaleType;
        this.f41726c = j;
    }
}
