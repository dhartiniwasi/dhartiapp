package p146u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0835a0;
import java.util.Map;

/* renamed from: u0.c */
/* compiled from: ChangeBounds */
public class C5624c extends C5666m {

    /* renamed from: c0 */
    private static final String[] f28269c0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: d0 */
    private static final Property<Drawable, PointF> f28270d0 = new C5626b(PointF.class, "boundsOrigin");

    /* renamed from: e0 */
    private static final Property<C5635k, PointF> f28271e0 = new C5627c(PointF.class, "topLeft");

    /* renamed from: f0 */
    private static final Property<C5635k, PointF> f28272f0 = new C5628d(PointF.class, "bottomRight");

    /* renamed from: g0 */
    private static final Property<View, PointF> f28273g0 = new C5629e(PointF.class, "bottomRight");

    /* renamed from: h0 */
    private static final Property<View, PointF> f28274h0 = new C5630f(PointF.class, "topLeft");

    /* renamed from: i0 */
    private static final Property<View, PointF> f28275i0 = new C5631g(PointF.class, "position");

    /* renamed from: j0 */
    private static C5662k f28276j0 = new C5662k();

    /* renamed from: S */
    private int[] f28277S = new int[2];

    /* renamed from: a0 */
    private boolean f28278a0 = false;

    /* renamed from: b0 */
    private boolean f28279b0 = false;

    /* renamed from: u0.c$a */
    /* compiled from: ChangeBounds */
    class C5625a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f28280a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f28281b;

        /* renamed from: c */
        final /* synthetic */ View f28282c;

        /* renamed from: d */
        final /* synthetic */ float f28283d;

        C5625a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f28280a = viewGroup;
            this.f28281b = bitmapDrawable;
            this.f28282c = view;
            this.f28283d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C5636c0.m33740b(this.f28280a).mo19921b(this.f28281b);
            C5636c0.m33745g(this.f28282c, this.f28283d);
        }
    }

    /* renamed from: u0.c$b */
    /* compiled from: ChangeBounds */
    static class C5626b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f28285a = new Rect();

        C5626b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f28285a);
            Rect rect = this.f28285a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f28285a);
            this.f28285a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f28285a);
        }
    }

    /* renamed from: u0.c$c */
    /* compiled from: ChangeBounds */
    static class C5627c extends Property<C5635k, PointF> {
        C5627c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5635k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5635k kVar, PointF pointF) {
            kVar.mo19958c(pointF);
        }
    }

    /* renamed from: u0.c$d */
    /* compiled from: ChangeBounds */
    static class C5628d extends Property<C5635k, PointF> {
        C5628d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C5635k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C5635k kVar, PointF pointF) {
            kVar.mo19957a(pointF);
        }
    }

    /* renamed from: u0.c$e */
    /* compiled from: ChangeBounds */
    static class C5629e extends Property<View, PointF> {
        C5629e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C5636c0.m33744f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: u0.c$f */
    /* compiled from: ChangeBounds */
    static class C5630f extends Property<View, PointF> {
        C5630f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C5636c0.m33744f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: u0.c$g */
    /* compiled from: ChangeBounds */
    static class C5631g extends Property<View, PointF> {
        C5631g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C5636c0.m33744f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: u0.c$h */
    /* compiled from: ChangeBounds */
    class C5632h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5635k f28286a;
        private C5635k mViewBounds;

        C5632h(C5635k kVar) {
            this.f28286a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: u0.c$i */
    /* compiled from: ChangeBounds */
    class C5633i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f28288a;

        /* renamed from: b */
        final /* synthetic */ View f28289b;

        /* renamed from: c */
        final /* synthetic */ Rect f28290c;

        /* renamed from: d */
        final /* synthetic */ int f28291d;

        /* renamed from: e */
        final /* synthetic */ int f28292e;

        /* renamed from: f */
        final /* synthetic */ int f28293f;

        /* renamed from: g */
        final /* synthetic */ int f28294g;

        C5633i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f28289b = view;
            this.f28290c = rect;
            this.f28291d = i;
            this.f28292e = i2;
            this.f28293f = i3;
            this.f28294g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f28288a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f28288a) {
                C0835a0.m3755u0(this.f28289b, this.f28290c);
                C5636c0.m33744f(this.f28289b, this.f28291d, this.f28292e, this.f28293f, this.f28294g);
            }
        }
    }

    /* renamed from: u0.c$j */
    /* compiled from: ChangeBounds */
    class C5634j extends C5674n {

        /* renamed from: a */
        boolean f28296a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f28297b;

        C5634j(ViewGroup viewGroup) {
            this.f28297b = viewGroup;
        }

        /* renamed from: a */
        public void mo19953a(C5666m mVar) {
            C5688x.m33956c(this.f28297b, true);
        }

        /* renamed from: c */
        public void mo19954c(C5666m mVar) {
            C5688x.m33956c(this.f28297b, false);
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            if (!this.f28296a) {
                C5688x.m33956c(this.f28297b, false);
            }
            mVar.mo20009S(this);
        }

        /* renamed from: e */
        public void mo19956e(C5666m mVar) {
            C5688x.m33956c(this.f28297b, false);
            this.f28296a = true;
        }
    }

    /* renamed from: u0.c$k */
    /* compiled from: ChangeBounds */
    private static class C5635k {

        /* renamed from: a */
        private int f28299a;

        /* renamed from: b */
        private int f28300b;

        /* renamed from: c */
        private int f28301c;

        /* renamed from: d */
        private int f28302d;

        /* renamed from: e */
        private View f28303e;

        /* renamed from: f */
        private int f28304f;

        /* renamed from: g */
        private int f28305g;

        C5635k(View view) {
            this.f28303e = view;
        }

        /* renamed from: b */
        private void m33736b() {
            C5636c0.m33744f(this.f28303e, this.f28299a, this.f28300b, this.f28301c, this.f28302d);
            this.f28304f = 0;
            this.f28305g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19957a(PointF pointF) {
            this.f28301c = Math.round(pointF.x);
            this.f28302d = Math.round(pointF.y);
            int i = this.f28305g + 1;
            this.f28305g = i;
            if (this.f28304f == i) {
                m33736b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo19958c(PointF pointF) {
            this.f28299a = Math.round(pointF.x);
            this.f28300b = Math.round(pointF.y);
            int i = this.f28304f + 1;
            this.f28304f = i;
            if (i == this.f28305g) {
                m33736b();
            }
        }
    }

    /* renamed from: g0 */
    private void m33714g0(C5683s sVar) {
        View view = sVar.f28428b;
        if (C0835a0.m3705R(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f28427a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f28427a.put("android:changeBounds:parent", sVar.f28428b.getParent());
            if (this.f28279b0) {
                sVar.f28428b.getLocationInWindow(this.f28277S);
                sVar.f28427a.put("android:changeBounds:windowX", Integer.valueOf(this.f28277S[0]));
                sVar.f28427a.put("android:changeBounds:windowY", Integer.valueOf(this.f28277S[1]));
            }
            if (this.f28278a0) {
                sVar.f28427a.put("android:changeBounds:clip", C0835a0.m3752t(view));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m33715h0(View view, View view2) {
        if (!this.f28279b0) {
            return true;
        }
        C5683s v = mo20036v(view, true);
        if (v == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == v.f28428b) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public String[] mo19922G() {
        return f28269c0;
    }

    /* renamed from: g */
    public void mo19923g(C5683s sVar) {
        m33714g0(sVar);
    }

    /* renamed from: j */
    public void mo19924j(C5683s sVar) {
        m33714g0(sVar);
    }

    /* renamed from: n */
    public Animator mo19925n(ViewGroup viewGroup, C5683s sVar, C5683s sVar2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C5683s sVar3 = sVar;
        C5683s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f28427a;
        Map<String, Object> map2 = sVar4.f28427a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f28428b;
        if (m33715h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f28427a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f28427a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f28427a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f28427a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f28278a0) {
                view = view3;
                C5636c0.m33744f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C5649f.m33789a(view, f28275i0, mo20038y().mo19979a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C5635k kVar = new C5635k(view);
                        ObjectAnimator a = C5649f.m33789a(kVar, f28271e0, mo20038y().mo19979a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C5649f.m33789a(kVar, f28272f0, mo20038y().mo19979a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C5632h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C5649f.m33789a(view, f28273g0, mo20038y().mo19979a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C5649f.m33789a(view, f28274h0, mo20038y().mo19979a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C5636c0.m33744f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C5649f.m33789a(view, f28275i0, mo20038y().mo19979a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0835a0.m3755u0(view, rect);
                    C5662k kVar2 = f28276j0;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new C5633i(view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C5682r.m33944c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C5688x.m33956c(viewGroup4, true);
                mo20015a(new C5634j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f28427a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f28427a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f28427a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f28427a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f28277S);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C5636c0.m33741c(view2);
        C5636c0.m33745g(view2, 0.0f);
        C5636c0.m33740b(viewGroup).mo19920a(bitmapDrawable);
        C5651g y = mo20038y();
        int[] iArr = this.f28277S;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C5655i.m33801a(f28270d0, y.mo19979a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C5625a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
