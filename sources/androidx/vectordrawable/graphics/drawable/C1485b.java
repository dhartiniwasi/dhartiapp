package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0719k;
import androidx.core.graphics.drawable.C0732a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p124r.C5413a;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
/* compiled from: AnimatedVectorDrawableCompat */
public class C1485b extends C1494g implements Animatable {

    /* renamed from: b */
    private C1487b f4257b;

    /* renamed from: c */
    private Context f4258c;

    /* renamed from: d */
    private ArgbEvaluator f4259d;

    /* renamed from: e */
    private Animator.AnimatorListener f4260e;

    /* renamed from: f */
    ArrayList<Object> f4261f;

    /* renamed from: g */
    final Drawable.Callback f4262g;

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    /* compiled from: AnimatedVectorDrawableCompat */
    class C1486a implements Drawable.Callback {
        C1486a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1485b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1485b.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1485b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1487b extends Drawable.ConstantState {

        /* renamed from: a */
        int f4264a;

        /* renamed from: b */
        C1495h f4265b;

        /* renamed from: c */
        AnimatorSet f4266c;

        /* renamed from: d */
        ArrayList<Animator> f4267d;

        /* renamed from: e */
        C5413a<Animator, String> f4268e;

        public C1487b(Context context, C1487b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4264a = bVar.f4264a;
                C1495h hVar = bVar.f4265b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f4265b = (C1495h) constantState.newDrawable(resources);
                    } else {
                        this.f4265b = (C1495h) constantState.newDrawable();
                    }
                    C1495h hVar2 = (C1495h) this.f4265b.mutate();
                    this.f4265b = hVar2;
                    hVar2.setCallback(callback);
                    this.f4265b.setBounds(bVar.f4265b.getBounds());
                    this.f4265b.mo5842h(false);
                }
                ArrayList<Animator> arrayList = bVar.f4267d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4267d = new ArrayList<>(size);
                    this.f4268e = new C5413a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f4267d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f4268e.get(animator);
                        clone.setTarget(this.f4265b.mo5833d(str));
                        this.f4267d.add(clone);
                        this.f4268e.put(clone, str);
                    }
                    mo5819a();
                }
            }
        }

        /* renamed from: a */
        public void mo5819a() {
            if (this.f4266c == null) {
                this.f4266c = new AnimatorSet();
            }
            this.f4266c.playTogether(this.f4267d);
        }

        public int getChangingConfigurations() {
            return this.f4264a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1485b() {
        this((Context) null, (C1487b) null, (Resources) null);
    }

    /* renamed from: a */
    public static C1485b m6887a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1485b bVar = new C1485b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    /* renamed from: b */
    private void m6888b(String str, Animator animator) {
        animator.setTarget(this.f4257b.f4265b.mo5833d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m6889c(animator);
        }
        C1487b bVar = this.f4257b;
        if (bVar.f4267d == null) {
            bVar.f4267d = new ArrayList<>();
            this.f4257b.f4268e = new C5413a<>();
        }
        this.f4257b.f4267d.add(animator);
        this.f4257b.f4268e.put(animator, str);
    }

    /* renamed from: c */
    private void m6889c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m6889c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4259d == null) {
                    this.f4259d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4259d);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3363a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3364b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4257b.f4265b.draw(canvas);
        if (this.f4257b.f4266c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3366d(drawable);
        }
        return this.f4257b.f4265b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4257b.f4264a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3367e(drawable);
        }
        return this.f4257b.f4265b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4274a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1488c(this.f4274a.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4257b.f4265b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4257b.f4265b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4257b.f4265b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3369g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C1484a.f4249e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1495h b = C1495h.m6919b(resources, resourceId, theme);
                        b.mo5842h(false);
                        b.setCallback(this.f4262g);
                        C1495h hVar = this.f4257b.f4265b;
                        if (hVar != null) {
                            hVar.setCallback((Drawable.Callback) null);
                        }
                        this.f4257b.f4265b = b;
                    }
                    k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1484a.f4250f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4258c;
                        if (context != null) {
                            m6888b(string, C1490d.m6901i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4257b.mo5819a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return C0732a.m3370h(drawable);
        }
        return this.f4257b.f4265b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4257b.f4266c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4257b.f4265b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4257b.f4265b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f4257b.f4265b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4257b.f4265b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4257b.f4265b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3372j(drawable, z);
        } else {
            this.f4257b.f4265b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3376n(drawable, i);
        } else {
            this.f4257b.f4265b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3377o(drawable, colorStateList);
        } else {
            this.f4257b.f4265b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            C0732a.m3378p(drawable, mode);
        } else {
            this.f4257b.f4265b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4257b.f4265b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4257b.f4266c.isStarted()) {
            this.f4257b.f4266c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4257b.f4266c.end();
        }
    }

    private C1485b(Context context) {
        this(context, (C1487b) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4274a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4257b.f4265b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$c */
    /* compiled from: AnimatedVectorDrawableCompat */
    private static class C1488c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4269a;

        public C1488c(Drawable.ConstantState constantState) {
            this.f4269a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4269a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4269a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1485b bVar = new C1485b();
            Drawable newDrawable = this.f4269a.newDrawable();
            bVar.f4274a = newDrawable;
            newDrawable.setCallback(bVar.f4262g);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1485b bVar = new C1485b();
            Drawable newDrawable = this.f4269a.newDrawable(resources);
            bVar.f4274a = newDrawable;
            newDrawable.setCallback(bVar.f4262g);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1485b bVar = new C1485b();
            Drawable newDrawable = this.f4269a.newDrawable(resources, theme);
            bVar.f4274a = newDrawable;
            newDrawable.setCallback(bVar.f4262g);
            return bVar;
        }
    }

    private C1485b(Context context, C1487b bVar, Resources resources) {
        this.f4259d = null;
        this.f4260e = null;
        this.f4261f = null;
        C1486a aVar = new C1486a();
        this.f4262g = aVar;
        this.f4258c = context;
        if (bVar != null) {
            this.f4257b = bVar;
        } else {
            this.f4257b = new C1487b(context, bVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
