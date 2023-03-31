package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p010os.C0777m;
import androidx.core.util.C0831h;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.C0894c0;
import androidx.core.view.C0946n;
import androidx.core.view.C0947o;
import androidx.core.view.C0948p;
import androidx.core.view.accessibility.C0860b;
import androidx.core.view.accessibility.C0862c;
import androidx.recyclerview.widget.C1379a;
import androidx.recyclerview.widget.C1382b;
import androidx.recyclerview.widget.C1401e;
import androidx.recyclerview.widget.C1413k;
import androidx.recyclerview.widget.C1420o;
import androidx.recyclerview.widget.C1423p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p076k0.C4840a;
import p076k0.C4841b;
import p076k0.C4842c;
import p169y.C6079a;

public class RecyclerView extends ViewGroup implements C0947o {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new C1333c();
    C1413k mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C1339g mAdapter;
    C1379a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C1342j mChildDrawingOrderCallback;
    C1382b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C1343k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C1401e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C1358s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C1344l mItemAnimator;
    private C1344l.C1346b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C1349n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    C1350o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1364x mObserver;
    private List<C1356q> mOnChildAttachStateListeners;
    private C1357r mOnFlingListener;
    private final ArrayList<C1358s> mOnItemTouchListeners;
    final List<C1336d0> mPendingAccessibilityImportanceChange;
    private C1365y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C1401e.C1403b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1362v mRecycler;
    C1363w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C1359t mScrollListener;
    private List<C1359t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0948p mScrollingChildHelper;
    final C1330a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C1334c0 mViewFlinger;
    private final C1423p.C1425b mViewInfoProcessCallback;
    final C1423p mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1329a implements Runnable {
        C1329a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C1330a0 {

        /* renamed from: a */
        int f3720a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3721b;

        /* renamed from: c */
        int f3722c = 0;

        /* renamed from: d */
        int f3723d = 0;

        /* renamed from: e */
        int f3724e = 1;

        /* renamed from: f */
        int f3725f = 0;

        /* renamed from: g */
        boolean f3726g = false;

        /* renamed from: h */
        boolean f3727h = false;

        /* renamed from: i */
        boolean f3728i = false;

        /* renamed from: j */
        boolean f3729j = false;

        /* renamed from: k */
        boolean f3730k = false;

        /* renamed from: l */
        boolean f3731l = false;

        /* renamed from: m */
        int f3732m;

        /* renamed from: n */
        long f3733n;

        /* renamed from: o */
        int f3734o;

        /* renamed from: p */
        int f3735p;

        /* renamed from: q */
        int f3736q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4981a(int i) {
            if ((this.f3724e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3724e));
            }
        }

        /* renamed from: b */
        public int mo4982b() {
            return this.f3727h ? this.f3722c - this.f3723d : this.f3725f;
        }

        /* renamed from: c */
        public int mo4983c() {
            return this.f3720a;
        }

        /* renamed from: d */
        public boolean mo4984d() {
            return this.f3720a != -1;
        }

        /* renamed from: e */
        public boolean mo4985e() {
            return this.f3727h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4986f(C1339g gVar) {
            this.f3724e = 1;
            this.f3725f = gVar.mo5060c();
            this.f3727h = false;
            this.f3728i = false;
            this.f3729j = false;
        }

        /* renamed from: g */
        public boolean mo4987g() {
            return this.f3731l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3720a + ", mData=" + this.f3721b + ", mItemCount=" + this.f3725f + ", mIsMeasuring=" + this.f3729j + ", mPreviousLayoutItemCount=" + this.f3722c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3723d + ", mStructureChanged=" + this.f3726g + ", mInPreLayout=" + this.f3727h + ", mRunSimpleAnimations=" + this.f3730k + ", mRunPredictiveAnimations=" + this.f3731l + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1331b implements Runnable {
        C1331b() {
        }

        public void run() {
            C1344l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo5102u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C1332b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C1333c implements Interpolator {
        C1333c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C1334c0 implements Runnable {

        /* renamed from: a */
        private int f3738a;

        /* renamed from: b */
        private int f3739b;

        /* renamed from: c */
        OverScroller f3740c;

        /* renamed from: d */
        Interpolator f3741d;

        /* renamed from: e */
        private boolean f3742e = false;

        /* renamed from: f */
        private boolean f3743f = false;

        C1334c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3741d = interpolator;
            this.f3740c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m5904a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float b = f2 + (m5905b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m5905b(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: d */
        private void m5906d() {
            RecyclerView.this.removeCallbacks(this);
            C0835a0.m3725f0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void mo4991c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3739b = 0;
            this.f3738a = 0;
            Interpolator interpolator = this.f3741d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3741d = interpolator2;
                this.f3740c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3740c.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            mo4992e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4992e() {
            if (this.f3742e) {
                this.f3743f = true;
            } else {
                m5906d();
            }
        }

        /* renamed from: f */
        public void mo4993f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m5904a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3741d != interpolator) {
                this.f3741d = interpolator;
                this.f3740c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3739b = 0;
            this.f3738a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3740c.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3740c.computeScrollOffset();
            }
            mo4992e();
        }

        /* renamed from: g */
        public void mo4994g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3740c.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo4994g();
                return;
            }
            this.f3743f = false;
            this.f3742e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3740c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3738a;
                int i4 = currY - this.f3739b;
                this.f3738a = currX;
                this.f3739b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1367z zVar = recyclerView4.mLayout.f3786g;
                    if (zVar != null && !zVar.mo5285g() && zVar.mo5286h()) {
                        int b = RecyclerView.this.mState.mo4982b();
                        if (b == 0) {
                            zVar.mo5296r();
                        } else if (zVar.mo5284f() >= b) {
                            zVar.mo5294p(b - 1);
                            zVar.mo5288j(i, i2);
                        } else {
                            zVar.mo5288j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1367z zVar2 = RecyclerView.this.mLayout.f3786g;
                if ((zVar2 != null && zVar2.mo5285g()) || !z) {
                    mo4992e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C1401e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.mo5459f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.mo5465b();
                    }
                }
            }
            C1367z zVar3 = RecyclerView.this.mLayout.f3786g;
            if (zVar3 != null && zVar3.mo5285g()) {
                zVar3.mo5288j(0, 0);
            }
            this.f3742e = false;
            if (this.f3743f) {
                m5906d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1335d implements C1423p.C1425b {
        C1335d() {
        }

        /* renamed from: a */
        public void mo4996a(C1336d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo5184m1(d0Var.f3747a, recyclerView.mRecycler);
        }

        /* renamed from: b */
        public void mo4997b(C1336d0 d0Var, C1344l.C1347c cVar, C1344l.C1347c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4998c(C1336d0 d0Var, C1344l.C1347c cVar, C1344l.C1347c cVar2) {
            RecyclerView.this.mRecycler.mo5244J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4999d(C1336d0 d0Var, C1344l.C1347c cVar, C1344l.C1347c cVar2) {
            d0Var.mo5006G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo5084b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo5086d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C1336d0 {

        /* renamed from: s */
        private static final List<Object> f3746s = Collections.emptyList();

        /* renamed from: a */
        public final View f3747a;

        /* renamed from: b */
        WeakReference<RecyclerView> f3748b;

        /* renamed from: c */
        int f3749c = -1;

        /* renamed from: d */
        int f3750d = -1;

        /* renamed from: e */
        long f3751e = -1;

        /* renamed from: f */
        int f3752f = -1;

        /* renamed from: g */
        int f3753g = -1;

        /* renamed from: h */
        C1336d0 f3754h = null;

        /* renamed from: i */
        C1336d0 f3755i = null;

        /* renamed from: j */
        int f3756j;

        /* renamed from: k */
        List<Object> f3757k = null;

        /* renamed from: l */
        List<Object> f3758l = null;

        /* renamed from: m */
        private int f3759m = 0;

        /* renamed from: n */
        C1362v f3760n = null;

        /* renamed from: o */
        boolean f3761o = false;

        /* renamed from: p */
        private int f3762p = 0;

        /* renamed from: q */
        int f3763q = -1;

        /* renamed from: r */
        RecyclerView f3764r;

        public C1336d0(View view) {
            if (view != null) {
                this.f3747a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m5915g() {
            if (this.f3757k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3757k = arrayList;
                this.f3758l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5000A(int i, boolean z) {
            if (this.f3750d == -1) {
                this.f3750d = this.f3749c;
            }
            if (this.f3753g == -1) {
                this.f3753g = this.f3749c;
            }
            if (z) {
                this.f3753g += i;
            }
            this.f3749c += i;
            if (this.f3747a.getLayoutParams() != null) {
                ((C1355p) this.f3747a.getLayoutParams()).f3806c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo5001B(RecyclerView recyclerView) {
            int i = this.f3763q;
            if (i != -1) {
                this.f3762p = i;
            } else {
                this.f3762p = C0835a0.m3764z(this.f3747a);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo5002C(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f3762p);
            this.f3762p = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo5003D() {
            this.f3756j = 0;
            this.f3749c = -1;
            this.f3750d = -1;
            this.f3751e = -1;
            this.f3753g = -1;
            this.f3759m = 0;
            this.f3754h = null;
            this.f3755i = null;
            mo5015d();
            this.f3762p = 0;
            this.f3763q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5004E() {
            if (this.f3750d == -1) {
                this.f3750d = this.f3749c;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo5005F(int i, int i2) {
            this.f3756j = (i & i2) | (this.f3756j & (~i2));
        }

        /* renamed from: G */
        public final void mo5006G(boolean z) {
            int i = this.f3759m;
            int i2 = z ? i - 1 : i + 1;
            this.f3759m = i2;
            if (i2 < 0) {
                this.f3759m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.f3756j |= 16;
            } else if (z && i2 == 0) {
                this.f3756j &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo5007H(C1362v vVar, boolean z) {
            this.f3760n = vVar;
            this.f3761o = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public boolean mo5008I() {
            return (this.f3756j & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo5009J() {
            return (this.f3756j & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo5010K() {
            this.f3760n.mo5244J(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo5011L() {
            return (this.f3756j & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5012a(Object obj) {
            if (obj == null) {
                mo5013b(1024);
            } else if ((1024 & this.f3756j) == 0) {
                m5915g();
                this.f3757k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5013b(int i) {
            this.f3756j = i | this.f3756j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5014c() {
            this.f3750d = -1;
            this.f3753g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5015d() {
            List<Object> list = this.f3757k;
            if (list != null) {
                list.clear();
            }
            this.f3756j &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5016e() {
            this.f3756j &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5017f() {
            this.f3756j &= -257;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo5018h() {
            return (this.f3756j & 16) == 0 && C0835a0.m3702O(this.f3747a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo5019i(int i, int i2, boolean z) {
            mo5013b(8);
            mo5000A(i2, z);
            this.f3749c = i;
        }

        /* renamed from: j */
        public final int mo5020j() {
            RecyclerView recyclerView = this.f3764r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: k */
        public final long mo5021k() {
            return this.f3751e;
        }

        /* renamed from: l */
        public final int mo5022l() {
            return this.f3752f;
        }

        /* renamed from: m */
        public final int mo5023m() {
            int i = this.f3753g;
            return i == -1 ? this.f3749c : i;
        }

        /* renamed from: n */
        public final int mo5024n() {
            return this.f3750d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public List<Object> mo5025o() {
            if ((this.f3756j & 1024) != 0) {
                return f3746s;
            }
            List<Object> list = this.f3757k;
            if (list == null || list.size() == 0) {
                return f3746s;
            }
            return this.f3758l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo5026p(int i) {
            return (i & this.f3756j) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo5027q() {
            return (this.f3756j & 512) != 0 || mo5030t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo5028r() {
            return (this.f3747a.getParent() == null || this.f3747a.getParent() == this.f3764r) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo5029s() {
            return (this.f3756j & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo5030t() {
            return (this.f3756j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3749c + " id=" + this.f3751e + ", oldPos=" + this.f3750d + ", pLpos:" + this.f3753g);
            if (mo5034w()) {
                sb.append(" scrap ");
                sb.append(this.f3761o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo5030t()) {
                sb.append(" invalid");
            }
            if (!mo5029s()) {
                sb.append(" unbound");
            }
            if (mo5037z()) {
                sb.append(" update");
            }
            if (mo5033v()) {
                sb.append(" removed");
            }
            if (mo5009J()) {
                sb.append(" ignored");
            }
            if (mo5035x()) {
                sb.append(" tmpDetached");
            }
            if (!mo5032u()) {
                sb.append(" not recyclable(" + this.f3759m + ")");
            }
            if (mo5027q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3747a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public final boolean mo5032u() {
            return (this.f3756j & 16) == 0 && !C0835a0.m3702O(this.f3747a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo5033v() {
            return (this.f3756j & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public boolean mo5034w() {
            return this.f3760n != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo5035x() {
            return (this.f3756j & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public boolean mo5036y() {
            return (this.f3756j & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public boolean mo5037z() {
            return (this.f3756j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1337e implements C1382b.C1384b {
        C1337e() {
        }

        /* renamed from: a */
        public View mo5038a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public void addView(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        /* renamed from: b */
        public void mo5040b(View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo5001B(RecyclerView.this);
            }
        }

        /* renamed from: c */
        public int mo5041c() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: d */
        public void mo5042d() {
            int c = mo5041c();
            for (int i = 0; i < c; i++) {
                View a = mo5038a(i);
                RecyclerView.this.dispatchChildDetached(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: e */
        public int mo5043e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: f */
        public C1336d0 mo5044f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: g */
        public void mo5045g(int i) {
            C1336d0 childViewHolderInt;
            View a = mo5038a(i);
            if (!(a == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(a)) == null)) {
                if (!childViewHolderInt.mo5035x() || childViewHolderInt.mo5009J()) {
                    childViewHolderInt.mo5013b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: h */
        public void mo5046h(View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo5002C(RecyclerView.this);
            }
        }

        /* renamed from: i */
        public void mo5047i(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: j */
        public void mo5048j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo5035x() || childViewHolderInt.mo5009J()) {
                    childViewHolderInt.mo5017f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1338f implements C1379a.C1380a {
        C1338f() {
        }

        /* renamed from: a */
        public void mo5049a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: b */
        public void mo5050b(C1379a.C1381b bVar) {
            mo5057i(bVar);
        }

        /* renamed from: c */
        public void mo5051c(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: d */
        public void mo5052d(C1379a.C1381b bVar) {
            mo5057i(bVar);
        }

        /* renamed from: e */
        public C1336d0 mo5053e(int i) {
            C1336d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo5406n(findViewHolderForPosition.f3747a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: f */
        public void mo5054f(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: g */
        public void mo5055g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: h */
        public void mo5056h(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3723d += i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo5057i(C1379a.C1381b bVar) {
            int i = bVar.f3903a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo4705R0(recyclerView, bVar.f3904b, bVar.f3906d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo4708U0(recyclerView2, bVar.f3904b, bVar.f3906d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo4709W0(recyclerView3, bVar.f3904b, bVar.f3906d, bVar.f3905c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo4707T0(recyclerView4, bVar.f3904b, bVar.f3906d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1339g<VH extends C1336d0> {

        /* renamed from: a */
        private final C1340h f3767a = new C1340h();

        /* renamed from: b */
        private boolean f3768b = false;

        /* renamed from: a */
        public final void mo5058a(VH vh, int i) {
            vh.f3749c = i;
            if (mo5064g()) {
                vh.f3751e = mo5061d(i);
            }
            vh.mo5005F(1, 519);
            C0777m.m3535a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo5068k(vh, i, vh.mo5025o());
            vh.mo5015d();
            ViewGroup.LayoutParams layoutParams = vh.f3747a.getLayoutParams();
            if (layoutParams instanceof C1355p) {
                ((C1355p) layoutParams).f3806c = true;
            }
            C0777m.m3536b();
        }

        /* renamed from: b */
        public final VH mo5059b(ViewGroup viewGroup, int i) {
            try {
                C0777m.m3535a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH l = mo5069l(viewGroup, i);
                if (l.f3747a.getParent() == null) {
                    l.f3752f = i;
                    return l;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0777m.m3536b();
            }
        }

        /* renamed from: c */
        public abstract int mo5060c();

        /* renamed from: d */
        public long mo5061d(int i) {
            return -1;
        }

        /* renamed from: e */
        public int mo5062e(int i) {
            return 0;
        }

        /* renamed from: f */
        public final boolean mo5063f() {
            return this.f3767a.mo5078a();
        }

        /* renamed from: g */
        public final boolean mo5064g() {
            return this.f3768b;
        }

        /* renamed from: h */
        public final void mo5065h() {
            this.f3767a.mo5079b();
        }

        /* renamed from: i */
        public void mo5066i(RecyclerView recyclerView) {
        }

        /* renamed from: j */
        public abstract void mo5067j(VH vh, int i);

        /* renamed from: k */
        public void mo5068k(VH vh, int i, List<Object> list) {
            mo5067j(vh, i);
        }

        /* renamed from: l */
        public abstract VH mo5069l(ViewGroup viewGroup, int i);

        /* renamed from: m */
        public void mo5070m(RecyclerView recyclerView) {
        }

        /* renamed from: n */
        public boolean mo5071n(VH vh) {
            return false;
        }

        /* renamed from: o */
        public void mo5072o(VH vh) {
        }

        /* renamed from: p */
        public void mo5073p(VH vh) {
        }

        /* renamed from: q */
        public void mo5074q(VH vh) {
        }

        /* renamed from: r */
        public void mo5075r(C1341i iVar) {
            this.f3767a.registerObserver(iVar);
        }

        /* renamed from: s */
        public void mo5076s(boolean z) {
            if (!mo5063f()) {
                this.f3768b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: t */
        public void mo5077t(C1341i iVar) {
            this.f3767a.unregisterObserver(iVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C1340h extends Observable<C1341i> {
        C1340h() {
        }

        /* renamed from: a */
        public boolean mo5078a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo5079b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1341i) this.mObservers.get(size)).mo5080a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1341i {
        /* renamed from: a */
        public void mo5080a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C1342j {
        /* renamed from: a */
        int mo5081a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C1343k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo5082a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1344l {

        /* renamed from: a */
        private C1346b f3769a = null;

        /* renamed from: b */
        private ArrayList<C1345a> f3770b = new ArrayList<>();

        /* renamed from: c */
        private long f3771c = 120;

        /* renamed from: d */
        private long f3772d = 120;

        /* renamed from: e */
        private long f3773e = 250;

        /* renamed from: f */
        private long f3774f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C1345a {
            /* renamed from: a */
            void mo5104a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C1346b {
            /* renamed from: a */
            void mo5105a(C1336d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C1347c {

            /* renamed from: a */
            public int f3775a;

            /* renamed from: b */
            public int f3776b;

            /* renamed from: c */
            public int f3777c;

            /* renamed from: d */
            public int f3778d;

            /* renamed from: a */
            public C1347c mo5106a(C1336d0 d0Var) {
                return mo5107b(d0Var, 0);
            }

            /* renamed from: b */
            public C1347c mo5107b(C1336d0 d0Var, int i) {
                View view = d0Var.f3747a;
                this.f3775a = view.getLeft();
                this.f3776b = view.getTop();
                this.f3777c = view.getRight();
                this.f3778d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5997e(C1336d0 d0Var) {
            int i = d0Var.f3756j & 14;
            if (d0Var.mo5030t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int n = d0Var.mo5024n();
            int j = d0Var.mo5020j();
            return (n == -1 || j == -1 || n == j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo5083a(C1336d0 d0Var, C1347c cVar, C1347c cVar2);

        /* renamed from: b */
        public abstract boolean mo5084b(C1336d0 d0Var, C1336d0 d0Var2, C1347c cVar, C1347c cVar2);

        /* renamed from: c */
        public abstract boolean mo5085c(C1336d0 d0Var, C1347c cVar, C1347c cVar2);

        /* renamed from: d */
        public abstract boolean mo5086d(C1336d0 d0Var, C1347c cVar, C1347c cVar2);

        /* renamed from: f */
        public abstract boolean mo5087f(C1336d0 d0Var);

        /* renamed from: g */
        public boolean mo5088g(C1336d0 d0Var, List<Object> list) {
            return mo5087f(d0Var);
        }

        /* renamed from: h */
        public final void mo5089h(C1336d0 d0Var) {
            mo5099r(d0Var);
            C1346b bVar = this.f3769a;
            if (bVar != null) {
                bVar.mo5105a(d0Var);
            }
        }

        /* renamed from: i */
        public final void mo5090i() {
            int size = this.f3770b.size();
            for (int i = 0; i < size; i++) {
                this.f3770b.get(i).mo5104a();
            }
            this.f3770b.clear();
        }

        /* renamed from: j */
        public abstract void mo5091j(C1336d0 d0Var);

        /* renamed from: k */
        public abstract void mo5092k();

        /* renamed from: l */
        public long mo5093l() {
            return this.f3771c;
        }

        /* renamed from: m */
        public long mo5094m() {
            return this.f3774f;
        }

        /* renamed from: n */
        public long mo5095n() {
            return this.f3773e;
        }

        /* renamed from: o */
        public long mo5096o() {
            return this.f3772d;
        }

        /* renamed from: p */
        public abstract boolean mo5097p();

        /* renamed from: q */
        public C1347c mo5098q() {
            return new C1347c();
        }

        /* renamed from: r */
        public void mo5099r(C1336d0 d0Var) {
        }

        /* renamed from: s */
        public C1347c mo5100s(C1330a0 a0Var, C1336d0 d0Var) {
            return mo5098q().mo5106a(d0Var);
        }

        /* renamed from: t */
        public C1347c mo5101t(C1330a0 a0Var, C1336d0 d0Var, int i, List<Object> list) {
            return mo5098q().mo5106a(d0Var);
        }

        /* renamed from: u */
        public abstract void mo5102u();

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5103v(C1346b bVar) {
            this.f3769a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C1348m implements C1344l.C1346b {
        C1348m() {
        }

        /* renamed from: a */
        public void mo5105a(C1336d0 d0Var) {
            d0Var.mo5006G(true);
            if (d0Var.f3754h != null && d0Var.f3755i == null) {
                d0Var.f3754h = null;
            }
            d0Var.f3755i = null;
            if (!d0Var.mo5008I() && !RecyclerView.this.removeAnimatingView(d0Var.f3747a) && d0Var.mo5035x()) {
                RecyclerView.this.removeDetachedView(d0Var.f3747a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1349n {
        @Deprecated
        /* renamed from: d */
        public void mo5108d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void mo5109e(Rect rect, View view, RecyclerView recyclerView, C1330a0 a0Var) {
            mo5108d(rect, ((C1355p) view.getLayoutParams()).mo5213a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void mo5110f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo5111g(Canvas canvas, RecyclerView recyclerView, C1330a0 a0Var) {
            mo5110f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void mo5112h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5113i(Canvas canvas, RecyclerView recyclerView, C1330a0 a0Var) {
            mo5112h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1350o {

        /* renamed from: a */
        C1382b f3780a;

        /* renamed from: b */
        RecyclerView f3781b;

        /* renamed from: c */
        private final C1420o.C1422b f3782c;

        /* renamed from: d */
        private final C1420o.C1422b f3783d;

        /* renamed from: e */
        C1420o f3784e;

        /* renamed from: f */
        C1420o f3785f;

        /* renamed from: g */
        C1367z f3786g;

        /* renamed from: h */
        boolean f3787h = false;

        /* renamed from: i */
        boolean f3788i = false;

        /* renamed from: j */
        boolean f3789j = false;

        /* renamed from: k */
        private boolean f3790k = true;

        /* renamed from: l */
        private boolean f3791l = true;

        /* renamed from: m */
        int f3792m;

        /* renamed from: n */
        boolean f3793n;

        /* renamed from: o */
        private int f3794o;

        /* renamed from: p */
        private int f3795p;

        /* renamed from: q */
        private int f3796q;

        /* renamed from: r */
        private int f3797r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C1351a implements C1420o.C1422b {
            C1351a() {
            }

            /* renamed from: a */
            public View mo5207a(int i) {
                return C1350o.this.mo5132I(i);
            }

            /* renamed from: b */
            public int mo5208b(View view) {
                return C1350o.this.mo5143Q(view) - ((C1355p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: c */
            public int mo5209c() {
                return C1350o.this.mo5166e0();
            }

            /* renamed from: d */
            public int mo5210d() {
                return C1350o.this.mo5187o0() - C1350o.this.mo5168f0();
            }

            /* renamed from: e */
            public int mo5211e(View view) {
                return C1350o.this.mo5147T(view) + ((C1355p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C1352b implements C1420o.C1422b {
            C1352b() {
            }

            /* renamed from: a */
            public View mo5207a(int i) {
                return C1350o.this.mo5132I(i);
            }

            /* renamed from: b */
            public int mo5208b(View view) {
                return C1350o.this.mo5148U(view) - ((C1355p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: c */
            public int mo5209c() {
                return C1350o.this.mo5170g0();
            }

            /* renamed from: d */
            public int mo5210d() {
                return C1350o.this.mo5151W() - C1350o.this.mo5164d0();
            }

            /* renamed from: e */
            public int mo5211e(View view) {
                return C1350o.this.mo5140O(view) + ((C1355p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C1353c {
            /* renamed from: a */
            void mo5212a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C1354d {

            /* renamed from: a */
            public int f3800a;

            /* renamed from: b */
            public int f3801b;

            /* renamed from: c */
            public boolean f3802c;

            /* renamed from: d */
            public boolean f3803d;
        }

        public C1350o() {
            C1351a aVar = new C1351a();
            this.f3782c = aVar;
            C1352b bVar = new C1352b();
            this.f3783d = bVar;
            this.f3784e = new C1420o(aVar);
            this.f3785f = new C1420o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m6030K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1350o.m6030K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m6031L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e0 = mo5166e0();
            int g0 = mo5170g0();
            int o0 = mo5187o0() - mo5168f0();
            int W = mo5151W() - mo5164d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - e0;
            int min = Math.min(0, i);
            int i2 = top - g0;
            int min2 = Math.min(0, i2);
            int i3 = width - o0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - W);
            if (mo5154Z() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m6032f(View view, int i, boolean z) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo5033v()) {
                this.f3781b.mViewInfoStore.mo5537b(childViewHolderInt);
            } else {
                this.f3781b.mViewInfoStore.mo5550p(childViewHolderInt);
            }
            C1355p pVar = (C1355p) view.getLayoutParams();
            if (childViewHolderInt.mo5011L() || childViewHolderInt.mo5034w()) {
                if (childViewHolderInt.mo5034w()) {
                    childViewHolderInt.mo5010K();
                } else {
                    childViewHolderInt.mo5016e();
                }
                this.f3780a.mo5397c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3781b) {
                int m = this.f3780a.mo5405m(view);
                if (i == -1) {
                    i = this.f3780a.mo5401g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3781b.indexOfChild(view) + this.f3781b.exceptionLabel());
                } else if (m != i) {
                    this.f3781b.mLayout.mo5118B0(m, i);
                }
            } else {
                this.f3780a.mo5395a(view, i, false);
                pVar.f3806c = true;
                C1367z zVar = this.f3786g;
                if (zVar != null && zVar.mo5286h()) {
                    this.f3786g.mo5289k(view);
                }
            }
            if (pVar.f3807d) {
                childViewHolderInt.f3747a.invalidate();
                pVar.f3807d = false;
            }
        }

        /* renamed from: i0 */
        public static C1354d m6033i0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1354d dVar = new C1354d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4842c.f25589f, i, i2);
            dVar.f3800a = obtainStyledAttributes.getInt(C4842c.f25590g, 1);
            dVar.f3801b = obtainStyledAttributes.getInt(C4842c.f25600q, 1);
            dVar.f3802c = obtainStyledAttributes.getBoolean(C4842c.f25599p, false);
            dVar.f3803d = obtainStyledAttributes.getBoolean(C4842c.f25601r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m6034n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: t0 */
        private boolean m6035t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e0 = mo5166e0();
            int g0 = mo5170g0();
            int o0 = mo5187o0() - mo5168f0();
            int W = mo5151W() - mo5164d0();
            Rect rect = this.f3781b.mTempRect;
            mo5142P(focusedChild, rect);
            if (rect.left - i >= o0 || rect.right - i <= e0 || rect.top - i2 >= W || rect.bottom - i2 <= g0) {
                return false;
            }
            return true;
        }

        /* renamed from: v1 */
        private void m6036v1(C1362v vVar, int i, View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo5009J()) {
                if (!childViewHolderInt.mo5030t() || childViewHolderInt.mo5033v() || this.f3781b.mAdapter.mo5064g()) {
                    mo5201x(i);
                    vVar.mo5239D(view);
                    this.f3781b.mViewInfoStore.mo5546k(childViewHolderInt);
                    return;
                }
                mo5192q1(i);
                vVar.mo5238C(childViewHolderInt);
            }
        }

        /* renamed from: w0 */
        private static boolean m6037w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: y */
        private void m6038y(int i, View view) {
            this.f3780a.mo5398d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5114A(RecyclerView recyclerView, C1362v vVar) {
            this.f3788i = false;
            mo4740I0(recyclerView, vVar);
        }

        /* renamed from: A0 */
        public void mo5115A0(View view, int i, int i2) {
            C1355p pVar = (C1355p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f3781b.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int K = m6030K(mo5187o0(), mo5189p0(), mo5166e0() + mo5168f0() + pVar.leftMargin + pVar.rightMargin + i3, pVar.width, mo4758k());
            int K2 = m6030K(mo5151W(), mo5152X(), mo5170g0() + mo5164d0() + pVar.topMargin + pVar.bottomMargin + i4, pVar.height, mo4759l());
            if (mo5126F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A1 */
        public void mo5116A1(int i, int i2) {
            this.f3796q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3794o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3796q = 0;
            }
            this.f3797r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3795p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3797r = 0;
            }
        }

        /* renamed from: B */
        public View mo5117B(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f3780a.mo5406n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: B0 */
        public void mo5118B0(int i, int i2) {
            View I = mo5132I(i);
            if (I != null) {
                mo5201x(i);
                mo5172h(I, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3781b.toString());
        }

        /* renamed from: B1 */
        public void mo5119B1(int i, int i2) {
            this.f3781b.setMeasuredDimension(i, i2);
        }

        /* renamed from: C */
        public View mo4736C(int i) {
            int J = mo5133J();
            for (int i2 = 0; i2 < J; i2++) {
                View I = mo5132I(i2);
                C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(I);
                if (childViewHolderInt != null && childViewHolderInt.mo5023m() == i && !childViewHolderInt.mo5009J() && (this.f3781b.mState.mo4985e() || !childViewHolderInt.mo5033v())) {
                    return I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo5120C0(int i) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: C1 */
        public void mo4695C1(Rect rect, int i, int i2) {
            mo5119B1(m6034n(i, rect.width() + mo5166e0() + mo5168f0(), mo5162c0()), m6034n(i2, rect.height() + mo5170g0() + mo5164d0(), mo5159b0()));
        }

        /* renamed from: D */
        public abstract C1355p mo4696D();

        /* renamed from: D0 */
        public void mo5121D0(int i) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D1 */
        public void mo5122D1(int i, int i2) {
            int J = mo5133J();
            if (J == 0) {
                this.f3781b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < J; i7++) {
                View I = mo5132I(i7);
                Rect rect = this.f3781b.mTempRect;
                mo5142P(I, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3781b.mTempRect.set(i5, i6, i3, i4);
            mo4695C1(this.f3781b.mTempRect, i, i2);
        }

        /* renamed from: E */
        public C1355p mo4697E(Context context, AttributeSet attributeSet) {
            return new C1355p(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo5123E0(C1339g gVar, C1339g gVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public void mo5124E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3781b = null;
                this.f3780a = null;
                this.f3796q = 0;
                this.f3797r = 0;
            } else {
                this.f3781b = recyclerView;
                this.f3780a = recyclerView.mChildHelper;
                this.f3796q = recyclerView.getWidth();
                this.f3797r = recyclerView.getHeight();
            }
            this.f3794o = 1073741824;
            this.f3795p = 1073741824;
        }

        /* renamed from: F */
        public C1355p mo4699F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1355p) {
                return new C1355p((C1355p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1355p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1355p(layoutParams);
        }

        /* renamed from: F0 */
        public boolean mo5125F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public boolean mo5126F1(View view, int i, int i2, C1355p pVar) {
            return view.isLayoutRequested() || !this.f3790k || !m6037w0(view.getWidth(), i, pVar.width) || !m6037w0(view.getHeight(), i2, pVar.height);
        }

        /* renamed from: G */
        public int mo5127G() {
            return -1;
        }

        /* renamed from: G0 */
        public void mo5128G0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean mo4739G1() {
            return false;
        }

        /* renamed from: H */
        public int mo5129H(View view) {
            return ((C1355p) view.getLayoutParams()).f3805b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void mo5130H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean mo5131H1(View view, int i, int i2, C1355p pVar) {
            return !this.f3790k || !m6037w0(view.getMeasuredWidth(), i, pVar.width) || !m6037w0(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: I */
        public View mo5132I(int i) {
            C1382b bVar = this.f3780a;
            if (bVar != null) {
                return bVar.mo5400f(i);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo4740I0(RecyclerView recyclerView, C1362v vVar) {
            mo5130H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo4741I1(RecyclerView recyclerView, C1330a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int mo5133J() {
            C1382b bVar = this.f3780a;
            if (bVar != null) {
                return bVar.mo5401g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo4700J0(View view, int i, C1362v vVar, C1330a0 a0Var) {
            return null;
        }

        /* renamed from: J1 */
        public void mo5134J1(C1367z zVar) {
            C1367z zVar2 = this.f3786g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo5286h())) {
                this.f3786g.mo5296r();
            }
            this.f3786g = zVar;
            zVar.mo5295q(this.f3781b, this);
        }

        /* renamed from: K0 */
        public void mo4742K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3781b;
            mo5136L0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K1 */
        public void mo5135K1() {
            C1367z zVar = this.f3786g;
            if (zVar != null) {
                zVar.mo5296r();
            }
        }

        /* renamed from: L0 */
        public void mo5136L0(C1362v vVar, C1330a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3781b.canScrollVertically(-1) && !this.f3781b.canScrollHorizontally(-1) && !this.f3781b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1339g gVar = this.f3781b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo5060c());
                }
            }
        }

        /* renamed from: L1 */
        public boolean mo4701L1() {
            return false;
        }

        /* renamed from: M */
        public boolean mo5137M() {
            RecyclerView recyclerView = this.f3781b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M0 */
        public void mo5138M0(C0862c cVar) {
            RecyclerView recyclerView = this.f3781b;
            mo5139N0(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* renamed from: N */
        public int mo4702N(C1362v vVar, C1330a0 a0Var) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4758k()) {
                return 1;
            }
            return this.f3781b.mAdapter.mo5060c();
        }

        /* renamed from: N0 */
        public void mo5139N0(C1362v vVar, C1330a0 a0Var, C0862c cVar) {
            if (this.f3781b.canScrollVertically(-1) || this.f3781b.canScrollHorizontally(-1)) {
                cVar.mo3296a(8192);
                cVar.mo3322o0(true);
            }
            if (this.f3781b.canScrollVertically(1) || this.f3781b.canScrollHorizontally(1)) {
                cVar.mo3296a(4096);
                cVar.mo3322o0(true);
            }
            cVar.mo3295Z(C0862c.C0864b.m3999a(mo4716k0(vVar, a0Var), mo4702N(vVar, a0Var), mo5199v0(vVar, a0Var), mo5181l0(vVar, a0Var)));
        }

        /* renamed from: O */
        public int mo5140O(View view) {
            return view.getBottom() + mo5129H(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O0 */
        public void mo5141O0(View view, C0862c cVar) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo5033v() && !this.f3780a.mo5406n(childViewHolderInt.f3747a)) {
                RecyclerView recyclerView = this.f3781b;
                mo4704P0(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        /* renamed from: P */
        public void mo5142P(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: P0 */
        public void mo4704P0(C1362v vVar, C1330a0 a0Var, View view, C0862c cVar) {
            cVar.mo3297a0(C0862c.C0865c.m4000a(mo4759l() ? mo5173h0(view) : 0, 1, mo4758k() ? mo5173h0(view) : 0, 1, false, false));
        }

        /* renamed from: Q */
        public int mo5143Q(View view) {
            return view.getLeft() - mo5156a0(view);
        }

        /* renamed from: Q0 */
        public View mo5144Q0(View view, int i) {
            return null;
        }

        /* renamed from: R */
        public int mo5145R(View view) {
            Rect rect = ((C1355p) view.getLayoutParams()).f3805b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo4705R0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: S */
        public int mo5146S(View view) {
            Rect rect = ((C1355p) view.getLayoutParams()).f3805b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo4706S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int mo5147T(View view) {
            return view.getRight() + mo5178j0(view);
        }

        /* renamed from: T0 */
        public void mo4707T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: U */
        public int mo5148U(View view) {
            return view.getTop() - mo5183m0(view);
        }

        /* renamed from: U0 */
        public void mo4708U0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: V */
        public View mo5149V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3780a.mo5406n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void mo5150V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public int mo5151W() {
            return this.f3797r;
        }

        /* renamed from: W0 */
        public void mo4709W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5150V0(recyclerView, i, i2);
        }

        /* renamed from: X */
        public int mo5152X() {
            return this.f3795p;
        }

        /* renamed from: X0 */
        public void mo4711X0(C1362v vVar, C1330a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int mo5153Y() {
            RecyclerView recyclerView = this.f3781b;
            C1339g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo5060c();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo4713Y0(C1330a0 a0Var) {
        }

        /* renamed from: Z */
        public int mo5154Z() {
            return C0835a0.m3682B(this.f3781b);
        }

        /* renamed from: Z0 */
        public void mo5155Z0(C1362v vVar, C1330a0 a0Var, int i, int i2) {
            this.f3781b.defaultOnMeasure(i, i2);
        }

        /* renamed from: a0 */
        public int mo5156a0(View view) {
            return ((C1355p) view.getLayoutParams()).f3805b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean mo5157a1(RecyclerView recyclerView, View view, View view2) {
            return mo5202x0() || recyclerView.isComputingLayout();
        }

        /* renamed from: b */
        public void mo5158b(View view) {
            mo5161c(view, -1);
        }

        /* renamed from: b0 */
        public int mo5159b0() {
            return C0835a0.m3684C(this.f3781b);
        }

        /* renamed from: b1 */
        public boolean mo5160b1(RecyclerView recyclerView, C1330a0 a0Var, View view, View view2) {
            return mo5157a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void mo5161c(View view, int i) {
            m6032f(view, i, true);
        }

        /* renamed from: c0 */
        public int mo5162c0() {
            return C0835a0.m3686D(this.f3781b);
        }

        /* renamed from: c1 */
        public void mo4752c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void mo5163d(View view) {
            mo5165e(view, -1);
        }

        /* renamed from: d0 */
        public int mo5164d0() {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo4754d1() {
            return null;
        }

        /* renamed from: e */
        public void mo5165e(View view, int i) {
            m6032f(view, i, false);
        }

        /* renamed from: e0 */
        public int mo5166e0() {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo5167e1(int i) {
        }

        /* renamed from: f0 */
        public int mo5168f0() {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public void mo5169f1(C1367z zVar) {
            if (this.f3786g == zVar) {
                this.f3786g = null;
            }
        }

        /* renamed from: g */
        public void mo4757g(String str) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: g0 */
        public int mo5170g0() {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public boolean mo5171g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3781b;
            return mo5174h1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* renamed from: h */
        public void mo5172h(View view, int i) {
            mo5175i(view, i, (C1355p) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int mo5173h0(View view) {
            return ((C1355p) view.getLayoutParams()).mo5213a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: h1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5174h1(androidx.recyclerview.widget.RecyclerView.C1362v r8, androidx.recyclerview.widget.RecyclerView.C1330a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3781b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo5151W()
                int r11 = r7.mo5170g0()
                int r8 = r8 - r11
                int r11 = r7.mo5164d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3781b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5187o0()
                int r11 = r7.mo5166e0()
                int r10 = r10 - r11
                int r11 = r7.mo5168f0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo5151W()
                int r10 = r7.mo5170g0()
                int r8 = r8 - r10
                int r10 = r7.mo5164d0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3781b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo5187o0()
                int r11 = r7.mo5166e0()
                int r10 = r10 - r11
                int r11 = r7.mo5168f0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3781b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1350o.mo5174h1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: i */
        public void mo5175i(View view, int i, C1355p pVar) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo5033v()) {
                this.f3781b.mViewInfoStore.mo5537b(childViewHolderInt);
            } else {
                this.f3781b.mViewInfoStore.mo5550p(childViewHolderInt);
            }
            this.f3780a.mo5397c(view, i, pVar, childViewHolderInt.mo5033v());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public boolean mo5176i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3781b;
            return mo5179j1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: j */
        public void mo5177j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: j0 */
        public int mo5178j0(View view) {
            return ((C1355p) view.getLayoutParams()).f3805b.right;
        }

        /* renamed from: j1 */
        public boolean mo5179j1(C1362v vVar, C1330a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo4758k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo4716k0(C1362v vVar, C1330a0 a0Var) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo4759l()) {
                return 1;
            }
            return this.f3781b.mAdapter.mo5060c();
        }

        /* renamed from: k1 */
        public void mo5180k1(C1362v vVar) {
            for (int J = mo5133J() - 1; J >= 0; J--) {
                if (!RecyclerView.getChildViewHolderInt(mo5132I(J)).mo5009J()) {
                    mo5186n1(J, vVar);
                }
            }
        }

        /* renamed from: l */
        public boolean mo4759l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo5181l0(C1362v vVar, C1330a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1 */
        public void mo5182l1(C1362v vVar) {
            int j = vVar.mo5256j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo5260n(i);
                C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n);
                if (!childViewHolderInt.mo5009J()) {
                    childViewHolderInt.mo5006G(false);
                    if (childViewHolderInt.mo5035x()) {
                        this.f3781b.removeDetachedView(n, false);
                    }
                    C1344l lVar = this.f3781b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo5091j(childViewHolderInt);
                    }
                    childViewHolderInt.mo5006G(true);
                    vVar.mo5269y(n);
                }
            }
            vVar.mo5251e();
            if (j > 0) {
                this.f3781b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo4717m(C1355p pVar) {
            return pVar != null;
        }

        /* renamed from: m0 */
        public int mo5183m0(View view) {
            return ((C1355p) view.getLayoutParams()).f3805b.top;
        }

        /* renamed from: m1 */
        public void mo5184m1(View view, C1362v vVar) {
            mo5190p1(view);
            vVar.mo5237B(view);
        }

        /* renamed from: n0 */
        public void mo5185n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1355p) view.getLayoutParams()).f3805b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3781b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3781b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void mo5186n1(int i, C1362v vVar) {
            View I = mo5132I(i);
            mo5192q1(i);
            vVar.mo5237B(I);
        }

        /* renamed from: o */
        public void mo4760o(int i, int i2, C1330a0 a0Var, C1353c cVar) {
        }

        /* renamed from: o0 */
        public int mo5187o0() {
            return this.f3796q;
        }

        /* renamed from: o1 */
        public boolean mo5188o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo4762p(int i, C1353c cVar) {
        }

        /* renamed from: p0 */
        public int mo5189p0() {
            return this.f3794o;
        }

        /* renamed from: p1 */
        public void mo5190p1(View view) {
            this.f3780a.mo5408p(view);
        }

        /* renamed from: q */
        public int mo4764q(C1330a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q0 */
        public boolean mo5191q0() {
            int J = mo5133J();
            for (int i = 0; i < J; i++) {
                ViewGroup.LayoutParams layoutParams = mo5132I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void mo5192q1(int i) {
            if (mo5132I(i) != null) {
                this.f3780a.mo5409q(i);
            }
        }

        /* renamed from: r */
        public int mo4718r(C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean mo5193r0() {
            return this.f3788i;
        }

        /* renamed from: r1 */
        public boolean mo5194r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo5195s1(recyclerView, view, rect, z, false);
        }

        /* renamed from: s */
        public int mo4719s(C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo4767s0() {
            return this.f3789j;
        }

        /* renamed from: s1 */
        public boolean mo5195s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] L = m6031L(view, rect);
            int i = L[0];
            int i2 = L[1];
            if ((z2 && !m6035t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: t */
        public int mo4768t(C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: t1 */
        public void mo5196t1() {
            RecyclerView recyclerView = this.f3781b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo4721u(C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean mo5197u0() {
            return this.f3791l;
        }

        /* renamed from: u1 */
        public void mo5198u1() {
            this.f3787h = true;
        }

        /* renamed from: v */
        public int mo4723v(C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean mo5199v0(C1362v vVar, C1330a0 a0Var) {
            return false;
        }

        /* renamed from: w */
        public void mo5200w(C1362v vVar) {
            for (int J = mo5133J() - 1; J >= 0; J--) {
                m6036v1(vVar, J, mo5132I(J));
            }
        }

        /* renamed from: w1 */
        public int mo4724w1(int i, C1362v vVar, C1330a0 a0Var) {
            return 0;
        }

        /* renamed from: x */
        public void mo5201x(int i) {
            m6038y(i, mo5132I(i));
        }

        /* renamed from: x0 */
        public boolean mo5202x0() {
            C1367z zVar = this.f3786g;
            return zVar != null && zVar.mo5286h();
        }

        /* renamed from: x1 */
        public void mo4769x1(int i) {
        }

        /* renamed from: y0 */
        public boolean mo5203y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3784e.mo5530b(view, 24579) && this.f3785f.mo5530b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: y1 */
        public int mo4725y1(int i, C1362v vVar, C1330a0 a0Var) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5204z(RecyclerView recyclerView) {
            this.f3788i = true;
            mo5128G0(recyclerView);
        }

        /* renamed from: z0 */
        public void mo5205z0(View view, int i, int i2, int i3, int i4) {
            C1355p pVar = (C1355p) view.getLayoutParams();
            Rect rect = pVar.f3805b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z1 */
        public void mo5206z1(RecyclerView recyclerView) {
            mo5116A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1356q {
        /* renamed from: a */
        void mo5217a(View view);

        /* renamed from: b */
        void mo5218b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1357r {
        /* renamed from: a */
        public abstract boolean mo5219a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C1358s {
        /* renamed from: a */
        void mo5220a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo5221b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo5222c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1359t {
        /* renamed from: a */
        public void mo5223a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo5224b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C1360u {

        /* renamed from: a */
        SparseArray<C1361a> f3808a = new SparseArray<>();

        /* renamed from: b */
        private int f3809b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C1361a {

            /* renamed from: a */
            final ArrayList<C1336d0> f3810a = new ArrayList<>();

            /* renamed from: b */
            int f3811b = 5;

            /* renamed from: c */
            long f3812c = 0;

            /* renamed from: d */
            long f3813d = 0;

            C1361a() {
            }
        }

        /* renamed from: g */
        private C1361a m6194g(int i) {
            C1361a aVar = this.f3808a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1361a aVar2 = new C1361a();
            this.f3808a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5225a() {
            this.f3809b++;
        }

        /* renamed from: b */
        public void mo5226b() {
            for (int i = 0; i < this.f3808a.size(); i++) {
                this.f3808a.valueAt(i).f3810a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5227c() {
            this.f3809b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5228d(int i, long j) {
            C1361a g = m6194g(i);
            g.f3813d = mo5233j(g.f3813d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5229e(int i, long j) {
            C1361a g = m6194g(i);
            g.f3812c = mo5233j(g.f3812c, j);
        }

        /* renamed from: f */
        public C1336d0 mo5230f(int i) {
            C1361a aVar = this.f3808a.get(i);
            if (aVar == null || aVar.f3810a.isEmpty()) {
                return null;
            }
            ArrayList<C1336d0> arrayList = aVar.f3810a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).mo5028r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5231h(C1339g gVar, C1339g gVar2, boolean z) {
            if (gVar != null) {
                mo5227c();
            }
            if (!z && this.f3809b == 0) {
                mo5226b();
            }
            if (gVar2 != null) {
                mo5225a();
            }
        }

        /* renamed from: i */
        public void mo5232i(C1336d0 d0Var) {
            int l = d0Var.mo5022l();
            ArrayList<C1336d0> arrayList = m6194g(l).f3810a;
            if (this.f3808a.get(l).f3811b > arrayList.size()) {
                d0Var.mo5003D();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo5233j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo5234k(int i, long j, long j2) {
            long j3 = m6194g(i).f3813d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo5235l(int i, long j, long j2) {
            long j3 = m6194g(i).f3812c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C1362v {

        /* renamed from: a */
        final ArrayList<C1336d0> f3814a;

        /* renamed from: b */
        ArrayList<C1336d0> f3815b = null;

        /* renamed from: c */
        final ArrayList<C1336d0> f3816c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1336d0> f3817d;

        /* renamed from: e */
        private int f3818e;

        /* renamed from: f */
        int f3819f;

        /* renamed from: g */
        C1360u f3820g;

        public C1362v() {
            ArrayList<C1336d0> arrayList = new ArrayList<>();
            this.f3814a = arrayList;
            this.f3817d = Collections.unmodifiableList(arrayList);
            this.f3818e = 2;
            this.f3819f = 2;
        }

        /* renamed from: H */
        private boolean m6206H(C1336d0 d0Var, int i, int i2, long j) {
            d0Var.f3764r = RecyclerView.this;
            int l = d0Var.mo5022l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f3820g.mo5234k(l, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo5058a(d0Var, i);
            this.f3820g.mo5228d(d0Var.mo5022l(), RecyclerView.this.getNanoTime() - nanoTime);
            m6207b(d0Var);
            if (!RecyclerView.this.mState.mo4985e()) {
                return true;
            }
            d0Var.f3753g = i2;
            return true;
        }

        /* renamed from: b */
        private void m6207b(C1336d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f3747a;
                if (C0835a0.m3764z(view) == 0) {
                    C0835a0.m3761x0(view, 1);
                }
                C1413k kVar = RecyclerView.this.mAccessibilityDelegate;
                if (kVar != null) {
                    C0832a n = kVar.mo5504n();
                    if (n instanceof C1413k.C1414a) {
                        ((C1413k.C1414a) n).mo5507o(view);
                    }
                    C0835a0.m3741n0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m6208q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m6208q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m6209r(C1336d0 d0Var) {
            View view = d0Var.f3747a;
            if (view instanceof ViewGroup) {
                m6208q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5236A(int i) {
            mo5248a(this.f3816c.get(i), true);
            this.f3816c.remove(i);
        }

        /* renamed from: B */
        public void mo5237B(View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo5035x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo5034w()) {
                childViewHolderInt.mo5010K();
            } else if (childViewHolderInt.mo5011L()) {
                childViewHolderInt.mo5016e();
            }
            mo5238C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo5032u()) {
                RecyclerView.this.mItemAnimator.mo5091j(childViewHolderInt);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo5238C(C1336d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo5034w() || d0Var.f3747a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo5034w());
                sb.append(" isAttached:");
                if (d0Var.f3747a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo5035x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!d0Var.mo5009J()) {
                boolean h = d0Var.mo5018h();
                C1339g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && h && gVar.mo5071n(d0Var)) || d0Var.mo5032u()) {
                    if (this.f3819f <= 0 || d0Var.mo5026p(526)) {
                        z = false;
                    } else {
                        int size = this.f3816c.size();
                        if (size >= this.f3819f && size > 0) {
                            mo5236A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo5467d(d0Var.f3749c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo5467d(this.f3816c.get(i).f3749c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3816c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo5248a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.mo5551q(d0Var);
                        if (!z2 && !z3 && h) {
                            d0Var.f3764r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.mo5551q(d0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo5239D(View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo5026p(12) && childViewHolderInt.mo5036y() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3815b == null) {
                    this.f3815b = new ArrayList<>();
                }
                childViewHolderInt.mo5007H(this, true);
                this.f3815b.add(childViewHolderInt);
            } else if (!childViewHolderInt.mo5030t() || childViewHolderInt.mo5033v() || RecyclerView.this.mAdapter.mo5064g()) {
                childViewHolderInt.mo5007H(this, false);
                this.f3814a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5240E(C1360u uVar) {
            C1360u uVar2 = this.f3820g;
            if (uVar2 != null) {
                uVar2.mo5227c();
            }
            this.f3820g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3820g.mo5225a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo5241F(C1332b0 b0Var) {
        }

        /* renamed from: G */
        public void mo5242G(int i) {
            this.f3818e = i;
            mo5245K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1336d0 mo5243I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.mo4982b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.mo4985e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo5254h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo5259m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5246L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo5013b(r5)
                boolean r5 = r1.mo5034w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f3747a
                r5.removeDetachedView(r9, r8)
                r1.mo5010K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo5011L()
                if (r5 == 0) goto L_0x0057
                r1.mo5016e()
            L_0x0057:
                r6.mo5238C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.mo5383m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo5060c()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo5062e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.mo5064g()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.mo5061d(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo5258l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f3749c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo5255i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo5230f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.mo5003D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L_0x00ac
                r6.m6209r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3820g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5235l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo5059b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.f3747a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3748b = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3820g
                long r10 = r10 - r0
                r5.mo5229e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo4982b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo4985e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo5026p(r0)
                if (r1 == 0) goto L_0x0166
                r9.mo5005F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f3730k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.C1344l.m5997e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r9.mo5025o()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo5101t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo4985e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.mo5029s()
                if (r0 == 0) goto L_0x0179
                r9.f3753g = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.mo5029s()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.mo5037z()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.mo5030t()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = 0
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo5383m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m6206H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.f3747a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1355p) r1
                android.view.View r2 = r9.f3747a
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1355p) r1
                android.view.View r2 = r9.f3747a
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1355p) r1
            L_0x01cf:
                r1.f3804a = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = 0
            L_0x01d7:
                r1.f3807d = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo4982b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1362v.mo5243I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo5244J(C1336d0 d0Var) {
            if (d0Var.f3761o) {
                this.f3815b.remove(d0Var);
            } else {
                this.f3814a.remove(d0Var);
            }
            d0Var.f3760n = null;
            d0Var.f3761o = false;
            d0Var.mo5016e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo5245K() {
            C1350o oVar = RecyclerView.this.mLayout;
            this.f3819f = this.f3818e + (oVar != null ? oVar.f3792m : 0);
            for (int size = this.f3816c.size() - 1; size >= 0 && this.f3816c.size() > this.f3819f; size--) {
                mo5236A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo5246L(C1336d0 d0Var) {
            if (d0Var.mo5033v()) {
                return RecyclerView.this.mState.mo4985e();
            }
            int i = d0Var.f3749c;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo5060c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.mo4985e() && RecyclerView.this.mAdapter.mo5062e(d0Var.f3749c) != d0Var.mo5022l()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.mo5064g() || d0Var.mo5021k() == RecyclerView.this.mAdapter.mo5061d(d0Var.f3749c)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo5247M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3816c.size() - 1; size >= 0; size--) {
                C1336d0 d0Var = this.f3816c.get(size);
                if (d0Var != null && (i3 = d0Var.f3749c) >= i && i3 < i4) {
                    d0Var.mo5013b(2);
                    mo5236A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5248a(C1336d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f3747a;
            C1413k kVar = RecyclerView.this.mAccessibilityDelegate;
            if (kVar != null) {
                C0832a n = kVar.mo5504n();
                C0835a0.m3741n0(view, n instanceof C1413k.C1414a ? ((C1413k.C1414a) n).mo5506n(view) : null);
            }
            if (z) {
                mo5253g(d0Var);
            }
            d0Var.f3764r = null;
            mo5255i().mo5232i(d0Var);
        }

        /* renamed from: c */
        public void mo5249c() {
            this.f3814a.clear();
            mo5270z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5250d() {
            int size = this.f3816c.size();
            for (int i = 0; i < size; i++) {
                this.f3816c.get(i).mo5014c();
            }
            int size2 = this.f3814a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3814a.get(i2).mo5014c();
            }
            ArrayList<C1336d0> arrayList = this.f3815b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3815b.get(i3).mo5014c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5251e() {
            this.f3814a.clear();
            ArrayList<C1336d0> arrayList = this.f3815b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo5252f(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.mo4982b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.mo4982b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.mo4985e()) {
                return i;
            } else {
                return RecyclerView.this.mAdapterHelper.mo5383m(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5253g(C1336d0 d0Var) {
            C1363w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.mo5271a(d0Var);
            }
            C1339g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo5074q(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo5551q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1336d0 mo5254h(int i) {
            int size;
            int m;
            ArrayList<C1336d0> arrayList = this.f3815b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C1336d0 d0Var = this.f3815b.get(i3);
                    if (d0Var.mo5011L() || d0Var.mo5023m() != i) {
                        i3++;
                    } else {
                        d0Var.mo5013b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.mo5064g() && (m = RecyclerView.this.mAdapterHelper.mo5383m(i)) > 0 && m < RecyclerView.this.mAdapter.mo5060c()) {
                    long d = RecyclerView.this.mAdapter.mo5061d(m);
                    while (i2 < size) {
                        C1336d0 d0Var2 = this.f3815b.get(i2);
                        if (d0Var2.mo5011L() || d0Var2.mo5021k() != d) {
                            i2++;
                        } else {
                            d0Var2.mo5013b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1360u mo5255i() {
            if (this.f3820g == null) {
                this.f3820g = new C1360u();
            }
            return this.f3820g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo5256j() {
            return this.f3814a.size();
        }

        /* renamed from: k */
        public List<C1336d0> mo5257k() {
            return this.f3817d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1336d0 mo5258l(long j, int i, boolean z) {
            for (int size = this.f3814a.size() - 1; size >= 0; size--) {
                C1336d0 d0Var = this.f3814a.get(size);
                if (d0Var.mo5021k() == j && !d0Var.mo5011L()) {
                    if (i == d0Var.mo5022l()) {
                        d0Var.mo5013b(32);
                        if (d0Var.mo5033v() && !RecyclerView.this.mState.mo4985e()) {
                            d0Var.mo5005F(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f3814a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f3747a, false);
                        mo5269y(d0Var.f3747a);
                    }
                }
            }
            int size2 = this.f3816c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1336d0 d0Var2 = this.f3816c.get(size2);
                if (d0Var2.mo5021k() == j && !d0Var2.mo5028r()) {
                    if (i == d0Var2.mo5022l()) {
                        if (!z) {
                            this.f3816c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo5236A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1336d0 mo5259m(int i, boolean z) {
            View e;
            int size = this.f3814a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1336d0 d0Var = this.f3814a.get(i3);
                if (d0Var.mo5011L() || d0Var.mo5023m() != i || d0Var.mo5030t() || (!RecyclerView.this.mState.f3727h && d0Var.mo5033v())) {
                    i3++;
                } else {
                    d0Var.mo5013b(32);
                    return d0Var;
                }
            }
            if (z || (e = RecyclerView.this.mChildHelper.mo5399e(i)) == null) {
                int size2 = this.f3816c.size();
                while (i2 < size2) {
                    C1336d0 d0Var2 = this.f3816c.get(i2);
                    if (d0Var2.mo5030t() || d0Var2.mo5023m() != i || d0Var2.mo5028r()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3816c.remove(i2);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e);
            RecyclerView.this.mChildHelper.mo5411s(e);
            int m = RecyclerView.this.mChildHelper.mo5405m(e);
            if (m != -1) {
                RecyclerView.this.mChildHelper.mo5398d(m);
                mo5239D(e);
                childViewHolderInt.mo5013b(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo5260n(int i) {
            return this.f3814a.get(i).f3747a;
        }

        /* renamed from: o */
        public View mo5261o(int i) {
            return mo5262p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo5262p(int i, boolean z) {
            return mo5243I(i, z, RecyclerView.FOREVER_NS).f3747a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5263s() {
            int size = this.f3816c.size();
            for (int i = 0; i < size; i++) {
                C1355p pVar = (C1355p) this.f3816c.get(i).f3747a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3806c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5264t() {
            int size = this.f3816c.size();
            for (int i = 0; i < size; i++) {
                C1336d0 d0Var = this.f3816c.get(i);
                if (d0Var != null) {
                    d0Var.mo5013b(6);
                    d0Var.mo5012a((Object) null);
                }
            }
            C1339g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo5064g()) {
                mo5270z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5265u(int i, int i2) {
            int size = this.f3816c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1336d0 d0Var = this.f3816c.get(i3);
                if (d0Var != null && d0Var.f3749c >= i) {
                    d0Var.mo5000A(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5266v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3816c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1336d0 d0Var = this.f3816c.get(i7);
                if (d0Var != null && (i6 = d0Var.f3749c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.mo5000A(i2 - i, false);
                    } else {
                        d0Var.mo5000A(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5267w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3816c.size() - 1; size >= 0; size--) {
                C1336d0 d0Var = this.f3816c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f3749c;
                    if (i4 >= i3) {
                        d0Var.mo5000A(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo5013b(8);
                        mo5236A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5268x(C1339g gVar, C1339g gVar2, boolean z) {
            mo5249c();
            mo5255i().mo5231h(gVar, gVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5269y(View view) {
            C1336d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f3760n = null;
            childViewHolderInt.f3761o = false;
            childViewHolderInt.mo5016e();
            mo5238C(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5270z() {
            for (int size = this.f3816c.size() - 1; size >= 0; size--) {
                mo5236A(size);
            }
            this.f3816c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo5465b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C1363w {
        /* renamed from: a */
        void mo5271a(C1336d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C1364x extends C1341i {
        C1364x() {
        }

        /* renamed from: a */
        public void mo5080a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3726g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo5386p()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C1367z {

        /* renamed from: a */
        private int f3824a = -1;

        /* renamed from: b */
        private RecyclerView f3825b;

        /* renamed from: c */
        private C1350o f3826c;

        /* renamed from: d */
        private boolean f3827d;

        /* renamed from: e */
        private boolean f3828e;

        /* renamed from: f */
        private View f3829f;

        /* renamed from: g */
        private final C1368a f3830g = new C1368a(0, 0);

        /* renamed from: h */
        private boolean f3831h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C1368a {

            /* renamed from: a */
            private int f3832a;

            /* renamed from: b */
            private int f3833b;

            /* renamed from: c */
            private int f3834c;

            /* renamed from: d */
            private int f3835d;

            /* renamed from: e */
            private Interpolator f3836e;

            /* renamed from: f */
            private boolean f3837f;

            /* renamed from: g */
            private int f3838g;

            public C1368a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, (Interpolator) null);
            }

            /* renamed from: e */
            private void m6269e() {
                if (this.f3836e != null && this.f3834c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3834c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo5297a() {
                return this.f3835d >= 0;
            }

            /* renamed from: b */
            public void mo5298b(int i) {
                this.f3835d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo5299c(RecyclerView recyclerView) {
                int i = this.f3835d;
                if (i >= 0) {
                    this.f3835d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f3837f = false;
                } else if (this.f3837f) {
                    m6269e();
                    recyclerView.mViewFlinger.mo4993f(this.f3832a, this.f3833b, this.f3834c, this.f3836e);
                    int i2 = this.f3838g + 1;
                    this.f3838g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3837f = false;
                } else {
                    this.f3838g = 0;
                }
            }

            /* renamed from: d */
            public void mo5300d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3832a = i;
                this.f3833b = i2;
                this.f3834c = i3;
                this.f3836e = interpolator;
                this.f3837f = true;
            }

            public C1368a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3835d = -1;
                this.f3837f = false;
                this.f3838g = 0;
                this.f3832a = i;
                this.f3833b = i2;
                this.f3834c = i3;
                this.f3836e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C1369b {
            /* renamed from: a */
            PointF mo4751a(int i);
        }

        /* renamed from: a */
        public PointF mo5279a(int i) {
            C1350o e = mo5283e();
            if (e instanceof C1369b) {
                return ((C1369b) e).mo4751a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C1369b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo5280b(int i) {
            return this.f3825b.mLayout.mo4736C(i);
        }

        /* renamed from: c */
        public int mo5281c() {
            return this.f3825b.mLayout.mo5133J();
        }

        /* renamed from: d */
        public int mo5282d(View view) {
            return this.f3825b.getChildLayoutPosition(view);
        }

        /* renamed from: e */
        public C1350o mo5283e() {
            return this.f3826c;
        }

        /* renamed from: f */
        public int mo5284f() {
            return this.f3824a;
        }

        /* renamed from: g */
        public boolean mo5285g() {
            return this.f3827d;
        }

        /* renamed from: h */
        public boolean mo5286h() {
            return this.f3828e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo5287i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5288j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3825b;
            if (this.f3824a == -1 || recyclerView == null) {
                mo5296r();
            }
            if (this.f3827d && this.f3829f == null && this.f3826c != null && (a = mo5279a(this.f3824a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f3827d = false;
            View view = this.f3829f;
            if (view != null) {
                if (mo5282d(view) == this.f3824a) {
                    mo5293o(this.f3829f, recyclerView.mState, this.f3830g);
                    this.f3830g.mo5299c(recyclerView);
                    mo5296r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3829f = null;
                }
            }
            if (this.f3828e) {
                mo5290l(i, i2, recyclerView.mState, this.f3830g);
                boolean a2 = this.f3830g.mo5297a();
                this.f3830g.mo5299c(recyclerView);
                if (a2 && this.f3828e) {
                    this.f3827d = true;
                    recyclerView.mViewFlinger.mo4992e();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo5289k(View view) {
            if (mo5282d(view) == mo5284f()) {
                this.f3829f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo5290l(int i, int i2, C1330a0 a0Var, C1368a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo5291m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo5292n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo5293o(View view, C1330a0 a0Var, C1368a aVar);

        /* renamed from: p */
        public void mo5294p(int i) {
            this.f3824a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5295q(RecyclerView recyclerView, C1350o oVar) {
            recyclerView.mViewFlinger.mo4994g();
            if (this.f3831h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3825b = recyclerView;
            this.f3826c = oVar;
            int i = this.f3824a;
            if (i != -1) {
                recyclerView.mState.f3720a = i;
                this.f3828e = true;
                this.f3827d = true;
                this.f3829f = mo5280b(mo5284f());
                mo5291m();
                this.f3825b.mViewFlinger.mo4992e();
                this.f3831h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo5296r() {
            if (this.f3828e) {
                this.f3828e = false;
                mo5292n();
                this.f3825b.mState.f3720a = -1;
                this.f3829f = null;
                this.f3824a = -1;
                this.f3827d = false;
                this.f3826c.mo5169f1(this);
                this.f3826c = null;
                this.f3825b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            FORCE_INVALIDATE_DISPLAY_LIST = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            POST_UPDATES_ON_ANIMATION = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            ALLOW_THREAD_GAP_WORK = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            IGNORE_DETACHED_FOCUSED_CHILD = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(C1336d0 d0Var) {
        View view = d0Var.f3747a;
        boolean z = view.getParent() == this;
        this.mRecycler.mo5244J(getChildViewHolder(view));
        if (d0Var.mo5035x()) {
            this.mChildHelper.mo5397c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.mo5396b(view, true);
        } else {
            this.mChildHelper.mo5404k(view);
        }
    }

    private void animateChange(C1336d0 d0Var, C1336d0 d0Var2, C1344l.C1347c cVar, C1344l.C1347c cVar2, boolean z, boolean z2) {
        d0Var.mo5006G(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f3754h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo5244J(d0Var);
            d0Var2.mo5006G(false);
            d0Var2.f3755i = d0Var;
        }
        if (this.mItemAnimator.mo5084b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(C1336d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f3748b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.f3747a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.f3748b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(C1350o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1350o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0860b.m3918b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo4981a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3729j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo5541f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C1330a0 a0Var = this.mState;
        if (!a0Var.f3730k || !this.mItemsChanged) {
            z = false;
        }
        a0Var.f3728i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f3727h = a0Var.f3731l;
        a0Var.f3725f = this.mAdapter.mo5060c();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3730k) {
            int g = this.mChildHelper.mo5401g();
            for (int i = 0; i < g; i++) {
                C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5400f(i));
                if (!childViewHolderInt.mo5009J() && (!childViewHolderInt.mo5030t() || this.mAdapter.mo5064g())) {
                    this.mViewInfoStore.mo5540e(childViewHolderInt, this.mItemAnimator.mo5101t(this.mState, childViewHolderInt, C1344l.m5997e(childViewHolderInt), childViewHolderInt.mo5025o()));
                    if (this.mState.f3728i && childViewHolderInt.mo5036y() && !childViewHolderInt.mo5033v() && !childViewHolderInt.mo5009J() && !childViewHolderInt.mo5030t()) {
                        this.mViewInfoStore.mo5538c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3731l) {
            saveOldPositions();
            C1330a0 a0Var2 = this.mState;
            boolean z2 = a0Var2.f3726g;
            a0Var2.f3726g = false;
            this.mLayout.mo4711X0(this.mRecycler, a0Var2);
            this.mState.f3726g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo5401g(); i2++) {
                C1336d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo5400f(i2));
                if (!childViewHolderInt2.mo5009J() && !this.mViewInfoStore.mo5544i(childViewHolderInt2)) {
                    int e = C1344l.m5997e(childViewHolderInt2);
                    boolean p = childViewHolderInt2.mo5026p(8192);
                    if (!p) {
                        e |= 4096;
                    }
                    C1344l.C1347c t = this.mItemAnimator.mo5101t(this.mState, childViewHolderInt2, e, childViewHolderInt2.mo5025o());
                    if (p) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t);
                    } else {
                        this.mViewInfoStore.mo5536a(childViewHolderInt2, t);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3724e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo4981a(6);
        this.mAdapterHelper.mo5381j();
        this.mState.f3725f = this.mAdapter.mo5060c();
        C1330a0 a0Var = this.mState;
        a0Var.f3723d = 0;
        a0Var.f3727h = false;
        this.mLayout.mo4711X0(this.mRecycler, a0Var);
        C1330a0 a0Var2 = this.mState;
        a0Var2.f3726g = false;
        this.mPendingSavedState = null;
        a0Var2.f3730k = a0Var2.f3730k && this.mItemAnimator != null;
        a0Var2.f3724e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo4981a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1330a0 a0Var = this.mState;
        a0Var.f3724e = 1;
        if (a0Var.f3730k) {
            for (int g = this.mChildHelper.mo5401g() - 1; g >= 0; g--) {
                C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5400f(g));
                if (!childViewHolderInt.mo5009J()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C1344l.C1347c s = this.mItemAnimator.mo5100s(this.mState, childViewHolderInt);
                    C1336d0 g2 = this.mViewInfoStore.mo5542g(changedHolderKey);
                    if (g2 == null || g2.mo5009J()) {
                        this.mViewInfoStore.mo5539d(childViewHolderInt, s);
                    } else {
                        boolean h = this.mViewInfoStore.mo5543h(g2);
                        boolean h2 = this.mViewInfoStore.mo5543h(childViewHolderInt);
                        if (!h || g2 != childViewHolderInt) {
                            C1344l.C1347c n = this.mViewInfoStore.mo5548n(g2);
                            this.mViewInfoStore.mo5539d(childViewHolderInt, s);
                            C1344l.C1347c m = this.mViewInfoStore.mo5547m(childViewHolderInt);
                            if (n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g2);
                            } else {
                                animateChange(g2, childViewHolderInt, n, m, h, h2);
                            }
                        } else {
                            this.mViewInfoStore.mo5539d(childViewHolderInt, s);
                        }
                    }
                }
            }
            this.mViewInfoStore.mo5549o(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo5182l1(this.mRecycler);
        C1330a0 a0Var2 = this.mState;
        a0Var2.f3722c = a0Var2.f3725f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f3730k = false;
        a0Var2.f3731l = false;
        this.mLayout.f3787h = false;
        ArrayList<C1336d0> arrayList = this.mRecycler.f3815b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1350o oVar = this.mLayout;
        if (oVar.f3793n) {
            oVar.f3792m = 0;
            oVar.f3793n = false;
            this.mRecycler.mo5245K();
        }
        this.mLayout.mo4713Y0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo5541f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C1358s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo5220a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C1358s sVar = this.mOnItemTouchListeners.get(i);
            if (!sVar.mo5221b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g = this.mChildHelper.mo5401g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < g; i3++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5400f(i3));
            if (!childViewHolderInt.mo5009J()) {
                int m = childViewHolderInt.mo5023m();
                if (m < i) {
                    i = m;
                }
                if (m > i2) {
                    i2 = m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        C1336d0 findViewHolderForAdapterPosition;
        C1330a0 a0Var = this.mState;
        int i = a0Var.f3732m;
        if (i == -1) {
            i = 0;
        }
        int b = a0Var.mo4982b();
        int i2 = i;
        while (i2 < b) {
            C1336d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f3747a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f3747a;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f3747a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f3747a;
            }
        }
    }

    static C1336d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1355p) view.getLayoutParams()).f3804a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1355p pVar = (C1355p) view.getLayoutParams();
        Rect rect2 = pVar.f3805b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private C0948p getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0948p(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C1336d0 d0Var, C1336d0 d0Var2) {
        int g = this.mChildHelper.mo5401g();
        for (int i = 0; i < g; i++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5400f(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C1339g gVar = this.mAdapter;
                if (gVar == null || !gVar.mo5064g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g = this.mChildHelper.mo5401g();
        for (int i = 0; i < g; i++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5400f(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo5009J() && childViewHolderInt.mo5036y()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (C0835a0.m3680A(this) == 0) {
            C0835a0.m3763y0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1382b(new C1337e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.mo5154Z() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i2 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i2 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo4701L1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo5390u();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo4706S0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo5388s();
        } else {
            this.mAdapterHelper.mo5381j();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3730k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.f3787h) && (!z || this.mAdapter.mo5064g());
        C1330a0 a0Var = this.mState;
        if (a0Var.f3730k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.f3731l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0975e.m4423c(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0975e.m4423c(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0975e.m4423c(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0975e.m4423c(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.C0835a0.m3723e0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo5406n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo5401g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C1336d0 findViewHolderForItemId = (this.mState.f3733n == -1 || !this.mAdapter.mo5064g()) ? null : findViewHolderForItemId(this.mState.f3733n);
                if (findViewHolderForItemId != null && !this.mChildHelper.mo5406n(findViewHolderForItemId.f3747a) && findViewHolderForItemId.f3747a.hasFocusable()) {
                    view = findViewHolderForItemId.f3747a;
                } else if (this.mChildHelper.mo5401g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f3734o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0835a0.m3723e0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1355p) {
            C1355p pVar = (C1355p) layoutParams;
            if (!pVar.f3806c) {
                Rect rect = pVar.f3805b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo5195s1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C1330a0 a0Var = this.mState;
        a0Var.f3733n = -1;
        a0Var.f3732m = -1;
        a0Var.f3734o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i;
        C1336d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3733n = this.mAdapter.mo5064g() ? d0Var.mo5021k() : -1;
        C1330a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (d0Var.mo5033v()) {
            i = d0Var.f3750d;
        } else {
            i = d0Var.mo5020j();
        }
        a0Var.f3732m = i;
        this.mState.f3734o = getDeepestFocusedViewWithId(d0Var.f3747a);
    }

    private void setAdapterInternal(C1339g gVar, boolean z, boolean z2) {
        C1339g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.mo5077t(this.mObserver);
            this.mAdapter.mo5070m(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo5390u();
        C1339g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.mo5075r(this.mObserver);
            gVar.mo5066i(this);
        }
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5123E0(gVar3, this.mAdapter);
        }
        this.mRecycler.mo5268x(gVar3, this.mAdapter, z);
        this.mState.f3726g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo4994g();
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5135K1();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0835a0.m3723e0(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1350o oVar = this.mLayout;
        if (oVar == null || !oVar.mo5125F0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(C1349n nVar, int i) {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4757g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C1356q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(C1358s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(C1359t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(C1336d0 d0Var, C1344l.C1347c cVar, C1344l.C1347c cVar2) {
        d0Var.mo5006G(false);
        if (this.mItemAnimator.mo5083a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(C1336d0 d0Var, C1344l.C1347c cVar, C1344l.C1347c cVar2) {
        addAnimatingView(d0Var);
        d0Var.mo5006G(false);
        if (this.mItemAnimator.mo5085c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(C1336d0 d0Var) {
        C1344l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo5088g(d0Var, d0Var.mo5025o());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1355p) && this.mLayout.mo4717m((C1355p) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int j = this.mChildHelper.mo5403j();
        for (int i = 0; i < j; i++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i));
            if (!childViewHolderInt.mo5009J()) {
                childViewHolderInt.mo5014c();
            }
        }
        this.mRecycler.mo5250d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C1356q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C1359t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4758k()) {
            return this.mLayout.mo4764q(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4758k()) {
            return this.mLayout.mo4718r(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4758k()) {
            return this.mLayout.mo4719s(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4759l()) {
            return this.mLayout.mo4768t(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4759l()) {
            return this.mLayout.mo4721u(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C1350o oVar = this.mLayout;
        if (oVar != null && oVar.mo4759l()) {
            return this.mLayout.mo4723v(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0835a0.m3723e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0777m.m3535a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0777m.m3536b();
        } else if (this.mAdapterHelper.mo5386p()) {
            if (this.mAdapterHelper.mo5385o(4) && !this.mAdapterHelper.mo5385o(11)) {
                C0777m.m3535a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo5388s();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo5380i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C0777m.m3536b();
            } else if (this.mAdapterHelper.mo5386p()) {
                C0777m.m3535a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C0777m.m3536b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C1350o.m6034n(i, getPaddingLeft() + getPaddingRight(), C0835a0.m3686D(this)), C1350o.m6034n(i2, getPaddingTop() + getPaddingBottom(), C0835a0.m3684C(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        C1336d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C1339g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo5072o(childViewHolderInt);
        }
        List<C1356q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo5218b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        C1336d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C1339g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo5073p(childViewHolderInt);
        }
        List<C1356q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo5217a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            C1330a0 a0Var = this.mState;
            a0Var.f3729j = false;
            if (a0Var.f3724e == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo5206z1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.mo5387q() && this.mLayout.mo5187o0() == getWidth() && this.mLayout.mo5151W() == getHeight()) {
                this.mLayout.mo5206z1(this);
            } else {
                this.mLayout.mo5206z1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3476a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3477b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3478c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3481f(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5167e1(i);
        }
        onScrollStateChanged(i);
        C1359t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo5223a(this, i);
        }
        List<C1359t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo5223a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C1359t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo5224b(this, i, i2);
        }
        List<C1359t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).mo5224b(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C1336d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f3747a.getParent() == this && !d0Var.mo5009J() && (i = d0Var.f3763q) != -1) {
                C0835a0.m3761x0(d0Var.f3747a, i);
                d0Var.f3763q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo5113i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo5097p()) {
            z3 = z;
        }
        if (z3) {
            C0835a0.m3723e0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5082a(this, 3);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5082a(this, 0);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5082a(this, 2);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo5082a(this, 1);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(C1330a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f3740c;
            a0Var.f3735p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f3736q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f3735p = 0;
        a0Var.f3736q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int g = this.mChildHelper.mo5401g() - 1; g >= 0; g--) {
            View f3 = this.mChildHelper.mo5400f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C1336d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C1336d0 findViewHolderForAdapterPosition(int i) {
        C1336d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j = this.mChildHelper.mo5403j();
        for (int i2 = 0; i2 < j; i2++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo5033v() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo5406n(childViewHolderInt.f3747a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C1336d0 findViewHolderForItemId(long j) {
        C1339g gVar = this.mAdapter;
        C1336d0 d0Var = null;
        if (gVar != null && gVar.mo5064g()) {
            int j2 = this.mChildHelper.mo5403j();
            for (int i = 0; i < j2; i++) {
                C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo5033v() && childViewHolderInt.mo5021k() == j) {
                    if (!this.mChildHelper.mo5406n(childViewHolderInt.f3747a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public C1336d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C1336d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public boolean fling(int i, int i2) {
        C1350o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean k = oVar.mo4758k();
            boolean l = this.mLayout.mo4759l();
            if (!k || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!l || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = k || l;
                dispatchNestedFling(f, f2, z);
                C1357r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.mo5219a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (l) {
                        k |= true;
                    }
                    startNestedScroll(k ? 1 : 0, 1);
                    int i3 = this.mMaxFlingVelocity;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.mMaxFlingVelocity;
                    this.mViewFlinger.mo4991c(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View Q0 = this.mLayout.mo5144Q0(view, i);
        if (Q0 != null) {
            return Q0;
        }
        boolean z2 = true;
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo4700J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo4759l()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo4758k()) {
                int i3 = (this.mLayout.mo5154Z() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo4700J0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4696D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4697E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C1339g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(C1336d0 d0Var) {
        if (d0Var.mo5026p(524) || !d0Var.mo5029s()) {
            return -1;
        }
        return this.mAdapterHelper.mo5379e(d0Var.f3749c);
    }

    public int getBaseline() {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo5127G();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(C1336d0 d0Var) {
        return this.mAdapter.mo5064g() ? d0Var.mo5021k() : (long) d0Var.f3749c;
    }

    public int getChildAdapterPosition(View view) {
        C1336d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo5020j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1342j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo5081a(i, i2);
    }

    public long getChildItemId(View view) {
        C1336d0 childViewHolderInt;
        C1339g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo5064g() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.mo5021k();
    }

    public int getChildLayoutPosition(View view) {
        C1336d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo5023m();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C1336d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1413k getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C1343k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C1344l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        C1355p pVar = (C1355p) view.getLayoutParams();
        if (!pVar.f3806c) {
            return pVar.f3805b;
        }
        if (this.mState.mo4985e() && (pVar.mo5214b() || pVar.mo5216d())) {
            return pVar.f3805b;
        }
        Rect rect = pVar.f3805b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).mo5109e(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3806c = false;
        return rect;
    }

    public C1349n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C1350o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1357r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C1360u getRecycledViewPool() {
        return this.mRecycler.mo5255i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3483k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo5386p();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new C1379a(new C1338f());
    }

    /* access modifiers changed from: package-private */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C1396d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C4841b.fastscroll_default_thickness), resources.getDimensionPixelSize(C4841b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C4841b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C1350o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo4757g("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C1344l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo5097p();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo3485m();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo4769x1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int j = this.mChildHelper.mo5403j();
        for (int i = 0; i < j; i++) {
            ((C1355p) this.mChildHelper.mo5402i(i).getLayoutParams()).f3806c = true;
        }
        this.mRecycler.mo5263s();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int j = this.mChildHelper.mo5403j();
        for (int i = 0; i < j; i++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo5009J()) {
                childViewHolderInt.mo5013b(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo5264t();
    }

    public void offsetChildrenHorizontal(int i) {
        int g = this.mChildHelper.mo5401g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.mo5400f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int g = this.mChildHelper.mo5401g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.mo5400f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int j = this.mChildHelper.mo5403j();
        for (int i3 = 0; i3 < j; i3++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo5009J() && childViewHolderInt.f3749c >= i) {
                childViewHolderInt.mo5000A(i2, false);
                this.mState.f3726g = true;
            }
        }
        this.mRecycler.mo5265u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.mChildHelper.mo5403j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.f3749c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.mo5000A(i2 - i, false);
                } else {
                    childViewHolderInt.mo5000A(i5, false);
                }
                this.mState.f3726g = true;
            }
        }
        this.mRecycler.mo5266v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.mChildHelper.mo5403j();
        for (int i4 = 0; i4 < j; i4++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo5009J()) {
                int i5 = childViewHolderInt.f3749c;
                if (i5 >= i3) {
                    childViewHolderInt.mo5000A(-i2, z);
                    this.mState.f3726g = true;
                } else if (i5 >= i) {
                    childViewHolderInt.mo5019i(i - 1, -i2, z);
                    this.mState.f3726g = true;
                }
            }
        }
        this.mRecycler.mo5267w(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5204z(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<C1401e> threadLocal = C1401e.f3999e;
            C1401e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new C1401e();
                Display u = C0835a0.m3754u(this);
                float f = 60.0f;
                if (!isInEditMode() && u != null) {
                    float refreshRate = u.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1401e eVar2 = this.mGapWorker;
                eVar2.f4003c = (long) (1.0E9f / f);
                threadLocal.set(eVar2);
            }
            this.mGapWorker.mo5458a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1401e eVar;
        super.onDetachedFromWindow();
        C1344l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo5092k();
        }
        stopScroll();
        this.mIsAttached = false;
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5114A(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo5545j();
        if (ALLOW_THREAD_GAP_WORK && (eVar = this.mGapWorker) != null) {
            eVar.mo5461j(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).mo5111g(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo4759l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo4758k()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo4759l()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo4758k()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C1350o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean k = oVar.mo4758k();
        boolean l = this.mLayout.mo4759l();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l) {
                k |= true;
            }
            startNestedScroll(k ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!k || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (l && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0777m.m3535a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0777m.m3536b();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1350o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo4767s0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.mo5155Z0(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f3724e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo5116A1(i, i2);
                this.mState.f3729j = true;
                dispatchLayoutStep2();
                this.mLayout.mo5122D1(i, i2);
                if (this.mLayout.mo4739G1()) {
                    this.mLayout.mo5116A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f3729j = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo5122D1(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo5155Z0(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C1330a0 a0Var = this.mState;
                if (a0Var.f3731l) {
                    a0Var.f3727h = true;
                } else {
                    this.mAdapterHelper.mo5381j();
                    this.mState.f3727h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f3731l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1339g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f3725f = gVar.mo5060c();
            } else {
                this.mState.f3725f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo5155Z0(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f3727h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1365y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1365y yVar = (C1365y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.mo20873a());
        C1350o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f3823c) != null) {
            oVar.mo4752c1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1365y yVar = new C1365y(super.onSaveInstanceState());
        C1365y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.mo5272b(yVar2);
        } else {
            C1350o oVar = this.mLayout;
            if (oVar != null) {
                yVar.f3823c = oVar.mo4754d1();
            } else {
                yVar.f3823c = null;
            }
        }
        return yVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4758k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo4759l()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d4
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.e r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.mo5459f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.resetScroll()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.startNestedScroll(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0835a0.m3725f0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(C1336d0 d0Var, C1344l.C1347c cVar) {
        d0Var.mo5005F(0, 8192);
        if (this.mState.f3728i && d0Var.mo5036y() && !d0Var.mo5033v() && !d0Var.mo5009J()) {
            this.mViewInfoStore.mo5538c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo5540e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        C1344l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo5092k();
        }
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo5180k1(this.mRecycler);
            this.mLayout.mo5182l1(this.mRecycler);
        }
        this.mRecycler.mo5249c();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r = this.mChildHelper.mo5410r(view);
        if (r) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo5244J(childViewHolderInt);
            this.mRecycler.mo5238C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r);
        return r;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1336d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo5035x()) {
                childViewHolderInt.mo5017f();
            } else if (!childViewHolderInt.mo5009J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C1349n nVar) {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo4757g("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C1356q qVar) {
        List<C1356q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(C1358s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C1359t tVar) {
        List<C1359t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        C1336d0 d0Var;
        int g = this.mChildHelper.mo5401g();
        for (int i = 0; i < g; i++) {
            View f = this.mChildHelper.mo5400f(i);
            C1336d0 childViewHolder = getChildViewHolder(f);
            if (!(childViewHolder == null || (d0Var = childViewHolder.f3755i) == null)) {
                View view = d0Var.f3747a;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo5160b1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo5194r1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo5222c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int j = this.mChildHelper.mo5403j();
        for (int i = 0; i < j; i++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i));
            if (!childViewHolderInt.mo5009J()) {
                childViewHolderInt.mo5004E();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C1350o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean k = oVar.mo4758k();
            boolean l = this.mLayout.mo4759l();
            if (k || l) {
                if (!k) {
                    i = 0;
                }
                if (!l) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0946n.m4289a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i5 == 0 && i6 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0777m.m3535a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int w1 = i != 0 ? this.mLayout.mo4724w1(i, this.mRecycler, this.mState) : 0;
        int y1 = i2 != 0 ? this.mLayout.mo4725y1(i2, this.mRecycler, this.mState) : 0;
        C0777m.m3536b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = w1;
            iArr[1] = y1;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C1350o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo4769x1(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1413k kVar) {
        this.mAccessibilityDelegate = kVar;
        C0835a0.m3741n0(this, kVar);
    }

    public void setAdapter(C1339g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1342j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setChildImportantForAccessibilityInternal(C1336d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f3763q = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C0835a0.m3761x0(d0Var.f3747a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1343k kVar) {
        C0831h.m3662f(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C1344l lVar) {
        C1344l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo5092k();
            this.mItemAnimator.mo5103v((C1344l.C1346b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.mo5103v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo5242G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1350o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C1344l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo5092k();
                }
                this.mLayout.mo5180k1(this.mRecycler);
                this.mLayout.mo5182l1(this.mRecycler);
                this.mRecycler.mo5249c();
                if (this.mIsAttached) {
                    this.mLayout.mo5114A(this, this.mRecycler);
                }
                this.mLayout.mo5124E1((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo5249c();
            }
            this.mChildHelper.mo5407o();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f3781b == null) {
                    oVar.mo5124E1(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo5204z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3781b.exceptionLabel());
                }
            }
            this.mRecycler.mo5245K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3486n(z);
    }

    public void setOnFlingListener(C1357r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C1359t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C1360u uVar) {
        this.mRecycler.mo5240E(uVar);
    }

    public void setRecyclerListener(C1363w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1332b0 b0Var) {
        this.mRecycler.mo5241F(b0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0860b.m3917a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C1350o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo4741I1(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3487p(i);
    }

    /* access modifiers changed from: package-private */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3489r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(C1339g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int j = this.mChildHelper.mo5403j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.mChildHelper.mo5402i(i5);
            C1336d0 childViewHolderInt = getChildViewHolderInt(i6);
            if (childViewHolderInt != null && !childViewHolderInt.mo5009J() && (i3 = childViewHolderInt.f3749c) >= i && i3 < i4) {
                childViewHolderInt.mo5013b(2);
                childViewHolderInt.mo5012a(obj);
                ((C1355p) i6.getLayoutParams()).f3806c = true;
            }
        }
        this.mRecycler.mo5247M(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4840a.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo3479d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo3482g(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: package-private */
    public C1336d0 findViewHolderForPosition(int i, boolean z) {
        int j = this.mChildHelper.mo5403j();
        C1336d0 d0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C1336d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo5402i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo5033v()) {
                if (z) {
                    if (childViewHolderInt.f3749c != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo5023m() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo5406n(childViewHolderInt.f3747a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo3484l(i);
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo3488q(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo3490s(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.mObserver = new C1364x();
        this.mRecycler = new C1362v();
        this.mViewInfoStore = new C1423p();
        this.mUpdateChildViewsRunnable = new C1329a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C1343k();
        this.mItemAnimator = new C1385c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C1334c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1401e.C1403b() : null;
        this.mState = new C1330a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1348m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C1331b();
        this.mViewInfoProcessCallback = new C1335d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0894c0.m4060b(viewConfiguration, context2);
        this.mScaledVerticalScrollFactor = C0894c0.m4062d(viewConfiguration, context2);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo5103v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0835a0.m3764z(this) == 0) {
            C0835a0.m3761x0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1413k(this));
        int[] iArr = C4842c.f25589f;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C4842c.f25598o);
        if (obtainStyledAttributes.getInt(C4842c.f25592i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C4842c.f25591h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C4842c.f25593j, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C4842c.f25596m), obtainStyledAttributes.getDrawable(C4842c.f25597n), (StateListDrawable) obtainStyledAttributes.getDrawable(C4842c.f25594k), obtainStyledAttributes.getDrawable(C4842c.f25595l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (i3 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo3480e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C1355p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C1336d0 f3804a;

        /* renamed from: b */
        final Rect f3805b = new Rect();

        /* renamed from: c */
        boolean f3806c = true;

        /* renamed from: d */
        boolean f3807d = false;

        public C1355p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo5213a() {
            return this.f3804a.mo5023m();
        }

        /* renamed from: b */
        public boolean mo5214b() {
            return this.f3804a.mo5036y();
        }

        /* renamed from: c */
        public boolean mo5215c() {
            return this.f3804a.mo5033v();
        }

        /* renamed from: d */
        public boolean mo5216d() {
            return this.f3804a.mo5030t();
        }

        public C1355p(int i, int i2) {
            super(i, i2);
        }

        public C1355p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1355p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1355p(C1355p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C1365y extends C6079a {
        public static final Parcelable.Creator<C1365y> CREATOR = new C1366a();

        /* renamed from: c */
        Parcelable f3823c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C1366a implements Parcelable.ClassLoaderCreator<C1365y> {
            C1366a() {
            }

            /* renamed from: a */
            public C1365y createFromParcel(Parcel parcel) {
                return new C1365y(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1365y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1365y(parcel, classLoader);
            }

            /* renamed from: c */
            public C1365y[] newArray(int i) {
                return new C1365y[i];
            }
        }

        C1365y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3823c = parcel.readParcelable(classLoader == null ? C1350o.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5272b(C1365y yVar) {
            this.f3823c = yVar.f3823c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3823c, 0);
        }

        C1365y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1350o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo4699F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C1350o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo4758k()) {
                i = 0;
            }
            if (!this.mLayout.mo4759l()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo4993f(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public void addItemDecoration(C1349n nVar) {
        addItemDecoration(nVar, -1);
    }
}
