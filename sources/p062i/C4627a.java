package p062i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0541q0;
import androidx.core.content.res.C0719k;
import androidx.core.graphics.drawable.C0736b;
import androidx.vectordrawable.graphics.drawable.C1485b;
import androidx.vectordrawable.graphics.drawable.C1495h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p062i.C4635b;
import p062i.C4641d;
import p068j.C4709b;
import p068j.C4710c;
import p068j.C4712e;
import p124r.C5418d;
import p124r.C5427h;

/* renamed from: i.a */
/* compiled from: AnimatedStateListDrawableCompat */
public class C4627a extends C4641d implements C0736b {

    /* renamed from: B */
    private static final String f25071B = C4627a.class.getSimpleName();

    /* renamed from: A */
    private boolean f25072A;

    /* renamed from: w */
    private C4630c f25073w;

    /* renamed from: x */
    private C4634g f25074x;

    /* renamed from: y */
    private int f25075y;

    /* renamed from: z */
    private int f25076z;

    /* renamed from: i.a$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4629b extends C4634g {

        /* renamed from: a */
        private final Animatable f25077a;

        C4629b(Animatable animatable) {
            super();
            this.f25077a = animatable;
        }

        /* renamed from: c */
        public void mo18229c() {
            this.f25077a.start();
        }

        /* renamed from: d */
        public void mo18230d() {
            this.f25077a.stop();
        }
    }

    /* renamed from: i.a$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    static class C4630c extends C4641d.C4642a {

        /* renamed from: K */
        C5418d<Long> f25078K;

        /* renamed from: L */
        C5427h<Integer> f25079L;

        C4630c(C4630c cVar, C4627a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f25078K = cVar.f25078K;
                this.f25079L = cVar.f25079L;
                return;
            }
            this.f25078K = new C5418d<>();
            this.f25079L = new C5427h<>();
        }

        /* renamed from: D */
        private static long m30165D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public int mo18231B(int[] iArr, Drawable drawable, int i) {
            int z = super.mo18314z(iArr, drawable);
            this.f25079L.mo19689i(z, Integer.valueOf(i));
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public int mo18232C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo18259a(drawable);
            long D = m30165D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f25078K.mo19570a(D, Long.valueOf(j2 | j));
            if (z) {
                this.f25078K.mo19570a(m30165D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public int mo18233E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f25079L.mo19686f(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo18234F(int[] iArr) {
            int A = super.mo18313A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.mo18313A(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public int mo18235G(int i, int i2) {
            return (int) this.f25078K.mo19575f(m30165D(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public boolean mo18236H(int i, int i2) {
            return (this.f25078K.mo19575f(m30165D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo18237I(int i, int i2) {
            return (this.f25078K.mo19575f(m30165D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        public Drawable newDrawable() {
            return new C4627a(this, (Resources) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo18240r() {
            this.f25078K = this.f25078K.clone();
            this.f25079L = this.f25079L.clone();
        }

        public Drawable newDrawable(Resources resources) {
            return new C4627a(this, resources);
        }
    }

    /* renamed from: i.a$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4631d extends C4634g {

        /* renamed from: a */
        private final C1485b f25080a;

        C4631d(C1485b bVar) {
            super();
            this.f25080a = bVar;
        }

        /* renamed from: c */
        public void mo18229c() {
            this.f25080a.start();
        }

        /* renamed from: d */
        public void mo18230d() {
            this.f25080a.stop();
        }
    }

    /* renamed from: i.a$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4632e extends C4634g {

        /* renamed from: a */
        private final ObjectAnimator f25081a;

        /* renamed from: b */
        private final boolean f25082b;

        C4632e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C4633f fVar = new C4633f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                C4709b.m30435a(ofInt, true);
            }
            ofInt.setDuration((long) fVar.mo18243a());
            ofInt.setInterpolator(fVar);
            this.f25082b = z2;
            this.f25081a = ofInt;
        }

        /* renamed from: a */
        public boolean mo18241a() {
            return this.f25082b;
        }

        /* renamed from: b */
        public void mo18242b() {
            this.f25081a.reverse();
        }

        /* renamed from: c */
        public void mo18229c() {
            this.f25081a.start();
        }

        /* renamed from: d */
        public void mo18230d() {
            this.f25081a.cancel();
        }
    }

    /* renamed from: i.a$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class C4633f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f25083a;

        /* renamed from: b */
        private int f25084b;

        /* renamed from: c */
        private int f25085c;

        C4633f(AnimationDrawable animationDrawable, boolean z) {
            mo18244b(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo18243a() {
            return this.f25085c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo18244b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f25084b = numberOfFrames;
            int[] iArr = this.f25083a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f25083a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f25083a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f25085c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f25085c)) + 0.5f);
            int i2 = this.f25084b;
            int[] iArr = this.f25083a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f25085c) : 0.0f);
        }
    }

    /* renamed from: i.a$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static abstract class C4634g {
        private C4634g() {
        }

        /* renamed from: a */
        public boolean mo18241a() {
            return false;
        }

        /* renamed from: b */
        public void mo18242b() {
        }

        /* renamed from: c */
        public abstract void mo18229c();

        /* renamed from: d */
        public abstract void mo18230d();
    }

    public C4627a() {
        this((C4630c) null, (Resources) null);
    }

    /* renamed from: m */
    public static C4627a m30151m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4627a aVar = new C4627a();
            aVar.mo18217n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m30152o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m30154q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m30155r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m30153p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m30154q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C4712e.f25281h);
        int resourceId = k.getResourceId(C4712e.f25282i, 0);
        int resourceId2 = k.getResourceId(C4712e.f25283j, -1);
        Drawable j = resourceId2 > 0 ? C0541q0.m2634h().mo2548j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = mo18312k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("vector")) {
                j = C1495h.m6920c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = C4710c.m30436a(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.f25073w.mo18231B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m30155r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C4712e.f25284k);
        int resourceId = k.getResourceId(C4712e.f25287n, -1);
        int resourceId2 = k.getResourceId(C4712e.f25286m, -1);
        int resourceId3 = k.getResourceId(C4712e.f25285l, -1);
        Drawable j = resourceId3 > 0 ? C0541q0.m2634h().mo2548j(context, resourceId3) : null;
        boolean z = k.getBoolean(C4712e.f25288o, false);
        k.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                j = C1485b.m6887a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = C4710c.m30436a(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f25073w.mo18232C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m30156s(int i) {
        int i2;
        int G;
        C4634g gVar;
        C4634g gVar2 = this.f25074x;
        if (gVar2 == null) {
            i2 = mo18247c();
        } else if (i == this.f25075y) {
            return true;
        } else {
            if (i != this.f25076z || !gVar2.mo18241a()) {
                i2 = this.f25075y;
                gVar2.mo18230d();
            } else {
                gVar2.mo18242b();
                this.f25075y = this.f25076z;
                this.f25076z = i;
                return true;
            }
        }
        this.f25074x = null;
        this.f25076z = -1;
        this.f25075y = -1;
        C4630c cVar = this.f25073w;
        int E = cVar.mo18233E(i2);
        int E2 = cVar.mo18233E(i);
        if (E2 == 0 || E == 0 || (G = cVar.mo18235G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.mo18237I(E, E2);
        mo18248g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C4632e((AnimationDrawable) current, cVar.mo18236H(E, E2), I);
        } else if (current instanceof C1485b) {
            gVar = new C4631d((C1485b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C4629b((Animatable) current);
            }
            return false;
        }
        gVar.mo18229c();
        this.f25074x = gVar;
        this.f25076z = i2;
        this.f25075y = i;
        return true;
    }

    /* renamed from: t */
    private void m30157t(TypedArray typedArray) {
        C4630c cVar = this.f25073w;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f25112d |= C4710c.m30437b(typedArray);
        }
        cVar.mo18281x(typedArray.getBoolean(C4712e.f25277d, cVar.f25117i));
        cVar.mo18277t(typedArray.getBoolean(C4712e.f25278e, cVar.f25120l));
        cVar.mo18278u(typedArray.getInt(C4712e.f25279f, cVar.f25100A));
        cVar.mo18279v(typedArray.getInt(C4712e.f25280g, cVar.f25101B));
        setDither(typedArray.getBoolean(C4712e.f25275b, cVar.f25132x));
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo18209h(C4635b.C4639d dVar) {
        super.mo18209h(dVar);
        if (dVar instanceof C4630c) {
            this.f25073w = (C4630c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C4634g gVar = this.f25074x;
        if (gVar != null) {
            gVar.mo18230d();
            this.f25074x = null;
            mo18248g(this.f25075y);
            this.f25075y = -1;
            this.f25076z = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C4630c mo18213j() {
        return new C4630c(this.f25073w, this, (Resources) null);
    }

    public Drawable mutate() {
        if (!this.f25072A && super.mutate() == this) {
            this.f25073w.mo18240r();
            this.f25072A = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo18217n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = C0719k.m3295k(resources, theme, attributeSet, C4712e.f25274a);
        setVisible(k.getBoolean(C4712e.f25276c, true), true);
        m30157t(k);
        mo18250i(resources);
        k.recycle();
        m30152o(context, resources, xmlPullParser, attributeSet, theme);
        m30153p();
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int F = this.f25073w.mo18234F(iArr);
        boolean z = F != mo18247c() && (m30156s(F) || mo18248g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C4634g gVar = this.f25074x;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo18229c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C4627a(C4630c cVar, Resources resources) {
        super((C4641d.C4642a) null);
        this.f25075y = -1;
        this.f25076z = -1;
        mo18209h(new C4630c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
