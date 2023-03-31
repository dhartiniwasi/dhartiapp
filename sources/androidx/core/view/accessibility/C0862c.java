package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p010os.C0759a;
import androidx.core.view.accessibility.C0873f;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p138t.C5493d;

/* renamed from: androidx.core.view.accessibility.c */
/* compiled from: AccessibilityNodeInfoCompat */
public class C0862c {

    /* renamed from: d */
    private static int f2476d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f2477a;

    /* renamed from: b */
    public int f2478b = -1;

    /* renamed from: c */
    private int f2479c = -1;

    /* renamed from: androidx.core.view.accessibility.c$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0863a {

        /* renamed from: A */
        public static final C0863a f2480A;

        /* renamed from: B */
        public static final C0863a f2481B;

        /* renamed from: C */
        public static final C0863a f2482C;

        /* renamed from: D */
        public static final C0863a f2483D;

        /* renamed from: E */
        public static final C0863a f2484E;

        /* renamed from: F */
        public static final C0863a f2485F;

        /* renamed from: G */
        public static final C0863a f2486G;

        /* renamed from: H */
        public static final C0863a f2487H;

        /* renamed from: I */
        public static final C0863a f2488I;

        /* renamed from: J */
        public static final C0863a f2489J;

        /* renamed from: K */
        public static final C0863a f2490K;

        /* renamed from: L */
        public static final C0863a f2491L;

        /* renamed from: M */
        public static final C0863a f2492M;

        /* renamed from: N */
        public static final C0863a f2493N;

        /* renamed from: O */
        public static final C0863a f2494O;

        /* renamed from: P */
        public static final C0863a f2495P;

        /* renamed from: Q */
        public static final C0863a f2496Q;

        /* renamed from: R */
        public static final C0863a f2497R;

        /* renamed from: S */
        public static final C0863a f2498S;

        /* renamed from: T */
        public static final C0863a f2499T;

        /* renamed from: U */
        public static final C0863a f2500U;

        /* renamed from: e */
        public static final C0863a f2501e = new C0863a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C0863a f2502f = new C0863a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C0863a f2503g = new C0863a(4, (CharSequence) null);

        /* renamed from: h */
        public static final C0863a f2504h = new C0863a(8, (CharSequence) null);

        /* renamed from: i */
        public static final C0863a f2505i = new C0863a(16, (CharSequence) null);

        /* renamed from: j */
        public static final C0863a f2506j = new C0863a(32, (CharSequence) null);

        /* renamed from: k */
        public static final C0863a f2507k = new C0863a(64, (CharSequence) null);

        /* renamed from: l */
        public static final C0863a f2508l = new C0863a(128, (CharSequence) null);

        /* renamed from: m */
        public static final C0863a f2509m;

        /* renamed from: n */
        public static final C0863a f2510n;

        /* renamed from: o */
        public static final C0863a f2511o;

        /* renamed from: p */
        public static final C0863a f2512p;

        /* renamed from: q */
        public static final C0863a f2513q = new C0863a(4096, (CharSequence) null);

        /* renamed from: r */
        public static final C0863a f2514r = new C0863a(8192, (CharSequence) null);

        /* renamed from: s */
        public static final C0863a f2515s = new C0863a(16384, (CharSequence) null);

        /* renamed from: t */
        public static final C0863a f2516t = new C0863a(32768, (CharSequence) null);

        /* renamed from: u */
        public static final C0863a f2517u = new C0863a(65536, (CharSequence) null);

        /* renamed from: v */
        public static final C0863a f2518v = new C0863a(131072, (CharSequence) null, C0873f.C0880g.class);

        /* renamed from: w */
        public static final C0863a f2519w = new C0863a(262144, (CharSequence) null);

        /* renamed from: x */
        public static final C0863a f2520x = new C0863a(524288, (CharSequence) null);

        /* renamed from: y */
        public static final C0863a f2521y = new C0863a(1048576, (CharSequence) null);

        /* renamed from: z */
        public static final C0863a f2522z = new C0863a(2097152, (CharSequence) null, C0873f.C0881h.class);

        /* renamed from: a */
        final Object f2523a;

        /* renamed from: b */
        private final int f2524b;

        /* renamed from: c */
        private final Class<? extends C0873f.C0874a> f2525c;

        /* renamed from: d */
        protected final C0873f f2526d;

        static {
            Class<C0873f.C0876c> cls = C0873f.C0876c.class;
            Class<C0873f.C0875b> cls2 = C0873f.C0875b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f2509m = new C0863a(256, (CharSequence) null, cls2);
            f2510n = new C0863a(512, (CharSequence) null, cls2);
            f2511o = new C0863a(1024, (CharSequence) null, cls);
            f2512p = new C0863a(2048, (CharSequence) null, cls);
            int i = Build.VERSION.SDK_INT;
            f2480A = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2481B = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C0873f) null, C0873f.C0878e.class);
            f2482C = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2483D = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2484E = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2485F = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2486G = new C0863a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2487H = new C0863a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2488I = new C0863a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2489J = new C0863a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2490K = new C0863a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2491L = new C0863a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C0873f) null, C0873f.C0879f.class);
            f2492M = new C0863a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C0873f) null, C0873f.C0877d.class);
            f2493N = new C0863a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2494O = new C0863a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2495P = new C0863a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2496Q = new C0863a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2497R = new C0863a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2498S = new C0863a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            f2499T = new C0863a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
            if (i >= 33) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f2500U = new C0863a(accessibilityAction, 16908376, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
        }

        public C0863a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
        }

        /* renamed from: a */
        public C0863a mo3336a(CharSequence charSequence, C0873f fVar) {
            return new C0863a((Object) null, this.f2524b, charSequence, fVar, this.f2525c);
        }

        /* renamed from: b */
        public int mo3337b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2523a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo3338c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2523a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3339d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.accessibility.f r0 = r4.f2526d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r2 = r4.f2525c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.accessibility.f$a r1 = (androidx.core.view.accessibility.C0873f.C0874a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo3354a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.accessibility.f$a> r1 = r4.f2525c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.accessibility.f r6 = r4.f2526d
                boolean r5 = r6.mo3353a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.C0862c.C0863a.mo3339d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0863a)) {
                return false;
            }
            C0863a aVar = (C0863a) obj;
            Object obj2 = this.f2523a;
            if (obj2 == null) {
                if (aVar.f2523a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f2523a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f2523a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        C0863a(Object obj) {
            this(obj, 0, (CharSequence) null, (C0873f) null, (Class<? extends C0873f.C0874a>) null);
        }

        private C0863a(int i, CharSequence charSequence, Class<? extends C0873f.C0874a> cls) {
            this((Object) null, i, charSequence, (C0873f) null, cls);
        }

        C0863a(Object obj, int i, CharSequence charSequence, C0873f fVar, Class<? extends C0873f.C0874a> cls) {
            this.f2524b = i;
            this.f2526d = fVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f2523a = obj;
            } else {
                this.f2523a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f2525c = cls;
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0864b {

        /* renamed from: a */
        final Object f2527a;

        C0864b(Object obj) {
            this.f2527a = obj;
        }

        /* renamed from: a */
        public static C0864b m3999a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C0864b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C0864b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0864b((Object) null);
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0865c {

        /* renamed from: a */
        final Object f2528a;

        C0865c(Object obj) {
            this.f2528a = obj;
        }

        /* renamed from: a */
        public static C0865c m4000a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C0865c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C0865c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0865c((Object) null);
        }
    }

    private C0862c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2477a = accessibilityNodeInfo;
    }

    /* renamed from: L */
    public static C0862c m3921L() {
        return m3934v0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: M */
    public static C0862c m3922M(View view) {
        return m3934v0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: N */
    public static C0862c m3923N(C0862c cVar) {
        return m3934v0(AccessibilityNodeInfo.obtain(cVar.f2477a));
    }

    /* renamed from: Q */
    private void m3924Q(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = m3933u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u.size(); i++) {
                if (u.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: S */
    private void m3925S(int i, boolean z) {
        Bundle r = mo3326r();
        if (r != null) {
            int i2 = r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: d */
    private void m3926d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m3927f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2477a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2477a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2477a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2477a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: g */
    private List<Integer> m3928g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2477a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f2477a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static String m3929i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m3930k(int i) {
        Bundle r = mo3326r();
        if (r != null && (r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static ClickableSpan[] m3931p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray<WeakReference<ClickableSpan>> m3932s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = m3933u(view);
        if (u != null) {
            return u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C5493d.f27871Q, sparseArray);
        return sparseArray;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m3933u(View view) {
        return (SparseArray) view.getTag(C5493d.f27871Q);
    }

    /* renamed from: v0 */
    public static C0862c m3934v0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0862c(accessibilityNodeInfo);
    }

    /* renamed from: y */
    private boolean m3935y() {
        return !m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m3936z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f2476d;
        f2476d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo3275A() {
        return this.f2477a.isCheckable();
    }

    /* renamed from: B */
    public boolean mo3276B() {
        return this.f2477a.isChecked();
    }

    /* renamed from: C */
    public boolean mo3277C() {
        return this.f2477a.isClickable();
    }

    /* renamed from: D */
    public boolean mo3278D() {
        return this.f2477a.isEnabled();
    }

    /* renamed from: E */
    public boolean mo3279E() {
        return this.f2477a.isFocusable();
    }

    /* renamed from: F */
    public boolean mo3280F() {
        return this.f2477a.isFocused();
    }

    /* renamed from: G */
    public boolean mo3281G() {
        return this.f2477a.isLongClickable();
    }

    /* renamed from: H */
    public boolean mo3282H() {
        return this.f2477a.isPassword();
    }

    /* renamed from: I */
    public boolean mo3283I() {
        return this.f2477a.isScrollable();
    }

    /* renamed from: J */
    public boolean mo3284J() {
        return this.f2477a.isSelected();
    }

    /* renamed from: K */
    public boolean mo3285K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f2477a.isShowingHintText();
        }
        return m3930k(4);
    }

    /* renamed from: O */
    public boolean mo3286O(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2477a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: P */
    public void mo3287P() {
        this.f2477a.recycle();
    }

    /* renamed from: R */
    public void mo3288R(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2477a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: T */
    public void mo3289T(Rect rect) {
        this.f2477a.setBoundsInParent(rect);
    }

    /* renamed from: U */
    public void mo3290U(Rect rect) {
        this.f2477a.setBoundsInScreen(rect);
    }

    /* renamed from: V */
    public void mo3291V(boolean z) {
        this.f2477a.setCheckable(z);
    }

    /* renamed from: W */
    public void mo3292W(boolean z) {
        this.f2477a.setChecked(z);
    }

    /* renamed from: X */
    public void mo3293X(CharSequence charSequence) {
        this.f2477a.setClassName(charSequence);
    }

    /* renamed from: Y */
    public void mo3294Y(boolean z) {
        this.f2477a.setClickable(z);
    }

    /* renamed from: Z */
    public void mo3295Z(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2477a;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C0864b) obj).f2527a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    /* renamed from: a */
    public void mo3296a(int i) {
        this.f2477a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo3297a0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2477a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C0865c) obj).f2528a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: b */
    public void mo3298b(C0863a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2477a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2523a);
        }
    }

    /* renamed from: b0 */
    public void mo3299b0(CharSequence charSequence) {
        this.f2477a.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public void mo3300c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2477a.addChild(view, i);
        }
    }

    /* renamed from: c0 */
    public void mo3301c0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2477a.setContentInvalid(z);
        }
    }

    /* renamed from: d0 */
    public void mo3302d0(boolean z) {
        this.f2477a.setEnabled(z);
    }

    /* renamed from: e */
    public void mo3303e(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m3927f();
            m3924Q(view);
            ClickableSpan[] p = m3931p(charSequence);
            if (p != null && p.length > 0) {
                mo3326r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C5493d.f27881a);
                SparseArray<WeakReference<ClickableSpan>> s = m3932s(view);
                for (int i2 = 0; i2 < p.length; i2++) {
                    int z = m3936z(p[i2], s);
                    s.put(z, new WeakReference(p[i2]));
                    m3926d(p[i2], (Spanned) charSequence, z);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo3304e0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2477a.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0862c)) {
            return false;
        }
        C0862c cVar = (C0862c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2477a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2477a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2477a)) {
            return false;
        }
        return this.f2479c == cVar.f2479c && this.f2478b == cVar.f2478b;
    }

    /* renamed from: f0 */
    public void mo3306f0(boolean z) {
        this.f2477a.setFocusable(z);
    }

    /* renamed from: g0 */
    public void mo3307g0(boolean z) {
        this.f2477a.setFocused(z);
    }

    /* renamed from: h */
    public List<C0863a> mo3308h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2477a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0863a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void mo3309h0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2477a.setHeading(z);
        } else {
            m3925S(2, z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2477a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void mo3311i0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2477a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f2477a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: j */
    public int mo3312j() {
        return this.f2477a.getActions();
    }

    /* renamed from: j0 */
    public void mo3313j0(CharSequence charSequence) {
        this.f2477a.setPackageName(charSequence);
    }

    /* renamed from: k0 */
    public void mo3314k0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f2477a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f2477a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: l */
    public void mo3315l(Rect rect) {
        this.f2477a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void mo3316l0(View view) {
        this.f2478b = -1;
        this.f2477a.setParent(view);
    }

    /* renamed from: m */
    public void mo3317m(Rect rect) {
        this.f2477a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void mo3318m0(View view, int i) {
        this.f2478b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2477a.setParent(view, i);
        }
    }

    /* renamed from: n */
    public int mo3319n() {
        return this.f2477a.getChildCount();
    }

    /* renamed from: n0 */
    public void mo3320n0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2477a.setScreenReaderFocusable(z);
        } else {
            m3925S(1, z);
        }
    }

    /* renamed from: o */
    public CharSequence mo3321o() {
        return this.f2477a.getClassName();
    }

    /* renamed from: o0 */
    public void mo3322o0(boolean z) {
        this.f2477a.setScrollable(z);
    }

    /* renamed from: p0 */
    public void mo3323p0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2477a.setShowingHintText(z);
        } else {
            m3925S(4, z);
        }
    }

    /* renamed from: q */
    public CharSequence mo3324q() {
        return this.f2477a.getContentDescription();
    }

    /* renamed from: q0 */
    public void mo3325q0(View view, int i) {
        this.f2479c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2477a.setSource(view, i);
        }
    }

    /* renamed from: r */
    public Bundle mo3326r() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f2477a.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: r0 */
    public void mo3327r0(CharSequence charSequence) {
        if (C0759a.m3505b()) {
            this.f2477a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2477a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: s0 */
    public void mo3328s0(CharSequence charSequence) {
        this.f2477a.setText(charSequence);
    }

    /* renamed from: t */
    public CharSequence mo3329t() {
        return this.f2477a.getPackageName();
    }

    /* renamed from: t0 */
    public void mo3330t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2477a.setVisibleToUser(z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3315l(rect);
        sb.append("; boundsInParent: " + rect);
        mo3317m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo3329t());
        sb.append("; className: ");
        sb.append(mo3321o());
        sb.append("; text: ");
        sb.append(mo3333v());
        sb.append("; contentDescription: ");
        sb.append(mo3324q());
        sb.append("; viewId: ");
        sb.append(mo3335x());
        sb.append("; uniqueId: ");
        sb.append(mo3334w());
        sb.append("; checkable: ");
        sb.append(mo3275A());
        sb.append("; checked: ");
        sb.append(mo3276B());
        sb.append("; focusable: ");
        sb.append(mo3279E());
        sb.append("; focused: ");
        sb.append(mo3280F());
        sb.append("; selected: ");
        sb.append(mo3284J());
        sb.append("; clickable: ");
        sb.append(mo3277C());
        sb.append("; longClickable: ");
        sb.append(mo3281G());
        sb.append("; enabled: ");
        sb.append(mo3278D());
        sb.append("; password: ");
        sb.append(mo3282H());
        sb.append("; scrollable: " + mo3283I());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0863a> h = mo3308h();
            for (int i = 0; i < h.size(); i++) {
                C0863a aVar = h.get(i);
                String i2 = m3929i(aVar.mo3337b());
                if (i2.equals("ACTION_UNKNOWN") && aVar.mo3338c() != null) {
                    i2 = aVar.mo3338c().toString();
                }
                sb.append(i2);
                if (i != h.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int j = mo3312j();
            while (j != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j);
                j &= ~numberOfTrailingZeros;
                sb.append(m3929i(numberOfTrailingZeros));
                if (j != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public AccessibilityNodeInfo mo3332u0() {
        return this.f2477a;
    }

    /* renamed from: v */
    public CharSequence mo3333v() {
        if (!m3935y()) {
            return this.f2477a.getText();
        }
        List<Integer> g = m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g2 = m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g3 = m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g4 = m3928g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2477a.getText(), 0, this.f2477a.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new C0859a(g4.get(i).intValue(), this, mo3326r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g.get(i).intValue(), g2.get(i).intValue(), g3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: w */
    public String mo3334w() {
        if (C0759a.m3507d()) {
            return this.f2477a.getUniqueId();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f2477a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        return null;
    }

    /* renamed from: x */
    public String mo3335x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2477a.getViewIdResourceName();
        }
        return null;
    }
}
