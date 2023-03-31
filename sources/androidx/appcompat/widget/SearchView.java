package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0338c;
import androidx.core.view.C0835a0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p048g.C4288a;
import p048g.C4291d;
import p048g.C4293f;
import p048g.C4294g;
import p048g.C4295h;
import p048g.C4297j;
import p163x.C5982a;
import p169y.C6079a;

public class SearchView extends C0519m0 implements C0338c {

    /* renamed from: C0 */
    static final C0422o f1326C0 = (Build.VERSION.SDK_INT < 29 ? new C0422o() : null);

    /* renamed from: A */
    private final View f1327A;

    /* renamed from: A0 */
    private final AdapterView.OnItemSelectedListener f1328A0;

    /* renamed from: B */
    final ImageView f1329B;

    /* renamed from: B0 */
    private TextWatcher f1330B0;

    /* renamed from: C */
    final ImageView f1331C;

    /* renamed from: D */
    final ImageView f1332D;

    /* renamed from: E */
    final ImageView f1333E;

    /* renamed from: F */
    private final View f1334F;

    /* renamed from: G */
    private C0425q f1335G;

    /* renamed from: H */
    private Rect f1336H;

    /* renamed from: I */
    private Rect f1337I;

    /* renamed from: J */
    private int[] f1338J;

    /* renamed from: K */
    private int[] f1339K;

    /* renamed from: L */
    private final ImageView f1340L;

    /* renamed from: M */
    private final Drawable f1341M;

    /* renamed from: N */
    private final int f1342N;

    /* renamed from: O */
    private final int f1343O;

    /* renamed from: P */
    private final Intent f1344P;

    /* renamed from: Q */
    private final Intent f1345Q;

    /* renamed from: R */
    private final CharSequence f1346R;

    /* renamed from: S */
    private C0420m f1347S;

    /* renamed from: a0 */
    private C0419l f1348a0;

    /* renamed from: b0 */
    View.OnFocusChangeListener f1349b0;

    /* renamed from: c0 */
    private C0421n f1350c0;

    /* renamed from: d0 */
    private View.OnClickListener f1351d0;

    /* renamed from: e0 */
    private boolean f1352e0;

    /* renamed from: f0 */
    private boolean f1353f0;

    /* renamed from: g0 */
    C5982a f1354g0;

    /* renamed from: h0 */
    private boolean f1355h0;

    /* renamed from: i0 */
    private CharSequence f1356i0;

    /* renamed from: j0 */
    private boolean f1357j0;

    /* renamed from: k0 */
    private boolean f1358k0;

    /* renamed from: l0 */
    private int f1359l0;

    /* renamed from: m0 */
    private boolean f1360m0;

    /* renamed from: n0 */
    private CharSequence f1361n0;

    /* renamed from: o0 */
    private CharSequence f1362o0;

    /* renamed from: p0 */
    private boolean f1363p0;

    /* renamed from: q0 */
    private int f1364q0;

    /* renamed from: r0 */
    SearchableInfo f1365r0;

    /* renamed from: s0 */
    private Bundle f1366s0;

    /* renamed from: t0 */
    private final Runnable f1367t0;

    /* renamed from: u0 */
    private Runnable f1368u0;

    /* renamed from: v0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1369v0;

    /* renamed from: w0 */
    private final View.OnClickListener f1370w0;

    /* renamed from: x */
    final SearchAutoComplete f1371x;

    /* renamed from: x0 */
    View.OnKeyListener f1372x0;

    /* renamed from: y */
    private final View f1373y;

    /* renamed from: y0 */
    private final TextView.OnEditorActionListener f1374y0;

    /* renamed from: z */
    private final View f1375z;

    /* renamed from: z0 */
    private final AdapterView.OnItemClickListener f1376z0;

    public static class SearchAutoComplete extends C0477d {

        /* renamed from: e */
        private int f1377e;

        /* renamed from: f */
        private SearchView f1378f;

        /* renamed from: g */
        private boolean f1379g;

        /* renamed from: h */
        final Runnable f1380h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0407a implements Runnable {
            C0407a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1807d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C4288a.f23776p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1805b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0418k.m2086b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1326C0.mo1840c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1806c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1807d() {
            if (this.f1379g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1379g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1377e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1379g) {
                removeCallbacks(this.f1380h);
                post(this.f1380h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1378f.mo1771Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1378f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1378f.hasFocus() && getVisibility() == 0) {
                this.f1379g = true;
                if (SearchView.m2051M(getContext())) {
                    mo1805b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1379g = false;
                removeCallbacks(this.f1380h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1379g = false;
                removeCallbacks(this.f1380h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1379g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1378f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1377e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1380h = new C0407a();
            this.f1377e = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0408a implements TextWatcher {
        C0408a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1770Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0409b implements Runnable {
        C0409b() {
        }

        public void run() {
            SearchView.this.mo1775f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0410c implements Runnable {
        C0410c() {
        }

        public void run() {
            C5982a aVar = SearchView.this.f1354g0;
            if (aVar instanceof C0561u0) {
                aVar.mo2619a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0411d implements View.OnFocusChangeListener {
        C0411d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1349b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0412e implements View.OnLayoutChangeListener {
        C0412e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1759B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0413f implements View.OnClickListener {
        C0413f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1329B) {
                searchView.mo1767V();
            } else if (view == searchView.f1332D) {
                searchView.mo1763R();
            } else if (view == searchView.f1331C) {
                searchView.mo1768W();
            } else if (view == searchView.f1333E) {
                searchView.mo1772a0();
            } else if (view == searchView.f1371x) {
                searchView.mo1760H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0414g implements View.OnKeyListener {
        C0414g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1365r0 == null) {
                return false;
            }
            if (searchView.f1371x.isPopupShowing() && SearchView.this.f1371x.getListSelection() != -1) {
                return SearchView.this.mo1769X(view, i, keyEvent);
            }
            if (SearchView.this.f1371x.mo1806c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1762P(0, (String) null, searchView2.f1371x.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0415h implements TextView.OnEditorActionListener {
        C0415h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1768W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0416i implements AdapterView.OnItemClickListener {
        C0416i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1764S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0417j implements AdapterView.OnItemSelectedListener {
        C0417j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1765T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    static class C0418k {
        /* renamed from: a */
        static void m2085a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        static void m2086b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0419l {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0420m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0421n {
        /* renamed from: a */
        boolean mo1836a(int i);

        /* renamed from: b */
        boolean mo1837b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0422o {

        /* renamed from: a */
        private Method f1392a = null;

        /* renamed from: b */
        private Method f1393b = null;

        /* renamed from: c */
        private Method f1394c = null;

        C0422o() {
            m2089d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1392a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1393b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1394c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m2089d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1838a(AutoCompleteTextView autoCompleteTextView) {
            m2089d();
            Method method = this.f1393b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1839b(AutoCompleteTextView autoCompleteTextView) {
            m2089d();
            Method method = this.f1392a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1840c(AutoCompleteTextView autoCompleteTextView) {
            m2089d();
            Method method = this.f1394c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    static class C0423p extends C6079a {
        public static final Parcelable.Creator<C0423p> CREATOR = new C0424a();

        /* renamed from: c */
        boolean f1395c;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        class C0424a implements Parcelable.ClassLoaderCreator<C0423p> {
            C0424a() {
            }

            /* renamed from: a */
            public C0423p createFromParcel(Parcel parcel) {
                return new C0423p(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0423p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0423p(parcel, classLoader);
            }

            /* renamed from: c */
            public C0423p[] newArray(int i) {
                return new C0423p[i];
            }
        }

        C0423p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1395c + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1395c));
        }

        public C0423p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1395c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    private static class C0425q extends TouchDelegate {

        /* renamed from: a */
        private final View f1396a;

        /* renamed from: b */
        private final Rect f1397b = new Rect();

        /* renamed from: c */
        private final Rect f1398c = new Rect();

        /* renamed from: d */
        private final Rect f1399d = new Rect();

        /* renamed from: e */
        private final int f1400e;

        /* renamed from: f */
        private boolean f1401f;

        public C0425q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1400e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1849a(rect, rect2);
            this.f1396a = view;
        }

        /* renamed from: a */
        public void mo1849a(Rect rect, Rect rect2) {
            this.f1397b.set(rect);
            this.f1399d.set(rect);
            Rect rect3 = this.f1399d;
            int i = this.f1400e;
            rect3.inset(-i, -i);
            this.f1398c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1401f
                r7.f1401f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1401f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1399d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1397b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1401f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f1398c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f1396a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1396a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f1398c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f1396a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0425q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C */
    private Intent m2043C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1362o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1366s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1365r0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m2044D(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String o;
        try {
            String o2 = C0561u0.m2696o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f1365r0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String str2 = o2;
            String o3 = C0561u0.m2696o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f1365r0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = C0561u0.m2696o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + "/" + Uri.encode(o);
            }
            if (o3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o3);
            }
            return m2043C(str2, uri, C0561u0.m2696o(cursor, "suggest_intent_extra_data"), C0561u0.m2696o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m2045E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1366s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m2046F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: G */
    private void m2047G() {
        this.f1371x.dismissDropDown();
    }

    /* renamed from: I */
    private void m2048I(View view, Rect rect) {
        view.getLocationInWindow(this.f1338J);
        getLocationInWindow(this.f1339K);
        int[] iArr = this.f1338J;
        int i = iArr[1];
        int[] iArr2 = this.f1339K;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m2049J(CharSequence charSequence) {
        if (!this.f1352e0 || this.f1341M == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1371x.getTextSize()) * 1.25d);
        this.f1341M.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1341M), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m2050K() {
        SearchableInfo searchableInfo = this.f1365r0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1365r0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1344P;
        } else if (this.f1365r0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1345Q;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m2051M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m2052N() {
        return (this.f1355h0 || this.f1360m0) && !mo1761L();
    }

    /* renamed from: O */
    private void m2053O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m2054Q(int i, int i2, String str) {
        Cursor b = this.f1354g0.mo20690b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m2053O(m2044D(b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m2055b0() {
        post(this.f1367t0);
    }

    /* renamed from: c0 */
    private void m2056c0(int i) {
        Editable text = this.f1371x.getText();
        Cursor b = this.f1354g0.mo20690b();
        if (b != null) {
            if (b.moveToPosition(i)) {
                CharSequence c = this.f1354g0.mo2620c(b);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: e0 */
    private void m2057e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1371x.getText());
        int i = 0;
        if (!z2 && (!this.f1352e0 || this.f1363p0)) {
            z = false;
        }
        ImageView imageView = this.f1332D;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1332D.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m2058g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1371x;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2049J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C4291d.f23802g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C4291d.f23803h);
    }

    /* renamed from: h0 */
    private void m2059h0() {
        this.f1371x.setThreshold(this.f1365r0.getSuggestThreshold());
        this.f1371x.setImeOptions(this.f1365r0.getImeOptions());
        int inputType = this.f1365r0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1365r0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1371x.setInputType(inputType);
        C5982a aVar = this.f1354g0;
        if (aVar != null) {
            aVar.mo2619a((Cursor) null);
        }
        if (this.f1365r0.getSuggestAuthority() != null) {
            C0561u0 u0Var = new C0561u0(getContext(), this, this.f1365r0, this.f1369v0);
            this.f1354g0 = u0Var;
            this.f1371x.setAdapter(u0Var);
            C0561u0 u0Var2 = (C0561u0) this.f1354g0;
            if (this.f1357j0) {
                i = 2;
            }
            u0Var2.mo2632x(i);
        }
    }

    /* renamed from: i0 */
    private void m2060i0() {
        this.f1327A.setVisibility((!m2052N() || !(this.f1331C.getVisibility() == 0 || this.f1333E.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m2061j0(boolean z) {
        this.f1331C.setVisibility((!this.f1355h0 || !m2052N() || !hasFocus() || (!z && this.f1360m0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m2062k0(boolean z) {
        this.f1353f0 = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1371x.getText());
        this.f1329B.setVisibility(i2);
        m2061j0(z2);
        this.f1373y.setVisibility(z ? 8 : 0);
        if (this.f1340L.getDrawable() == null || this.f1352e0) {
            i = 8;
        }
        this.f1340L.setVisibility(i);
        m2057e0();
        m2063l0(!z2);
        m2060i0();
    }

    /* renamed from: l0 */
    private void m2063l0(boolean z) {
        int i = 8;
        if (this.f1360m0 && !mo1761L() && z) {
            this.f1331C.setVisibility(8);
            i = 0;
        }
        this.f1333E.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1371x.setText(charSequence);
        this.f1371x.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1759B() {
        int i;
        if (this.f1334F.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1375z.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0508j1.m2496b(this);
            int dimensionPixelSize = this.f1352e0 ? resources.getDimensionPixelSize(C4291d.f23800e) + resources.getDimensionPixelSize(C4291d.f23801f) : 0;
            this.f1371x.getDropDownBackground().getPadding(rect);
            if (b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f1371x.setDropDownHorizontalOffset(i);
            this.f1371x.setDropDownWidth((((this.f1334F.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1760H() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0418k.m2085a(this.f1371x);
            return;
        }
        C0422o oVar = f1326C0;
        oVar.mo1839b(this.f1371x);
        oVar.mo1838a(this.f1371x);
    }

    /* renamed from: L */
    public boolean mo1761L() {
        return this.f1353f0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1762P(int i, String str, String str2) {
        getContext().startActivity(m2043C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1763R() {
        if (!TextUtils.isEmpty(this.f1371x.getText())) {
            this.f1371x.setText("");
            this.f1371x.requestFocus();
            this.f1371x.setImeVisibility(true);
        } else if (this.f1352e0) {
            C0419l lVar = this.f1348a0;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                m2062k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1764S(int i, int i2, String str) {
        C0421n nVar = this.f1350c0;
        if (nVar != null && nVar.mo1837b(i)) {
            return false;
        }
        m2054Q(i, 0, (String) null);
        this.f1371x.setImeVisibility(false);
        m2047G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1765T(int i) {
        C0421n nVar = this.f1350c0;
        if (nVar != null && nVar.mo1836a(i)) {
            return false;
        }
        m2056c0(i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo1766U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1767V() {
        m2062k0(false);
        this.f1371x.requestFocus();
        this.f1371x.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1351d0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1768W() {
        Editable text = this.f1371x.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0420m mVar = this.f1347S;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f1365r0 != null) {
                    mo1762P(0, (String) null, text.toString());
                }
                this.f1371x.setImeVisibility(false);
                m2047G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1769X(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1365r0 != null && this.f1354g0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1764S(this.f1371x.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1371x.length();
                }
                this.f1371x.setSelection(i2);
                this.f1371x.setListSelection(0);
                this.f1371x.clearListSelection();
                this.f1371x.mo1805b();
                return true;
            } else if (i == 19) {
                this.f1371x.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1770Y(CharSequence charSequence) {
        Editable text = this.f1371x.getText();
        this.f1362o0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m2061j0(z);
        m2063l0(!z);
        m2057e0();
        m2060i0();
        if (this.f1347S != null && !TextUtils.equals(charSequence, this.f1361n0)) {
            this.f1347S.onQueryTextChange(charSequence.toString());
        }
        this.f1361n0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1771Z() {
        m2062k0(mo1761L());
        m2055b0();
        if (this.f1371x.hasFocus()) {
            mo1760H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1772a0() {
        SearchableInfo searchableInfo = this.f1365r0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m2046F(this.f1344P, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m2045E(this.f1345Q, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo1112c() {
        if (!this.f1363p0) {
            this.f1363p0 = true;
            int imeOptions = this.f1371x.getImeOptions();
            this.f1364q0 = imeOptions;
            this.f1371x.setImeOptions(imeOptions | 33554432);
            this.f1371x.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1358k0 = true;
        super.clearFocus();
        this.f1371x.clearFocus();
        this.f1371x.setImeVisibility(false);
        this.f1358k0 = false;
    }

    /* renamed from: d0 */
    public void mo1774d0(CharSequence charSequence, boolean z) {
        this.f1371x.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1371x;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1362o0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1768W();
        }
    }

    /* renamed from: f */
    public void mo1113f() {
        mo1774d0("", false);
        clearFocus();
        m2062k0(true);
        this.f1371x.setImeOptions(this.f1364q0);
        this.f1363p0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1775f0() {
        int[] iArr = this.f1371x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1375z.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1327A.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1371x.getImeOptions();
    }

    public int getInputType() {
        return this.f1371x.getInputType();
    }

    public int getMaxWidth() {
        return this.f1359l0;
    }

    public CharSequence getQuery() {
        return this.f1371x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1356i0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1365r0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1346R;
        }
        return getContext().getText(this.f1365r0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1343O;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1342N;
    }

    public C5982a getSuggestionsAdapter() {
        return this.f1354g0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1367t0);
        post(this.f1368u0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2048I(this.f1371x, this.f1336H);
            Rect rect = this.f1337I;
            Rect rect2 = this.f1336H;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0425q qVar = this.f1335G;
            if (qVar == null) {
                C0425q qVar2 = new C0425q(this.f1337I, this.f1336H, this.f1371x);
                this.f1335G = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.mo1849a(this.f1337I, this.f1336H);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo1761L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1359l0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1359l0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1359l0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0423p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0423p pVar = (C0423p) parcelable;
        super.onRestoreInstanceState(pVar.mo20873a());
        m2062k0(pVar.f1395c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0423p pVar = new C0423p(super.onSaveInstanceState());
        pVar.f1395c = mo1761L();
        return pVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2055b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1358k0 || !isFocusable()) {
            return false;
        }
        if (mo1761L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1371x.requestFocus(i, rect);
        if (requestFocus) {
            m2062k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1366s0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1763R();
        } else {
            mo1767V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1352e0 != z) {
            this.f1352e0 = z;
            m2062k0(z);
            m2058g0();
        }
    }

    public void setImeOptions(int i) {
        this.f1371x.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1371x.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1359l0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0419l lVar) {
        this.f1348a0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1349b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0420m mVar) {
        this.f1347S = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1351d0 = onClickListener;
    }

    public void setOnSuggestionListener(C0421n nVar) {
        this.f1350c0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1356i0 = charSequence;
        m2058g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1357j0 = z;
        C5982a aVar = this.f1354g0;
        if (aVar instanceof C0561u0) {
            ((C0561u0) aVar).mo2632x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1365r0 = searchableInfo;
        if (searchableInfo != null) {
            m2059h0();
            m2058g0();
        }
        boolean K = m2050K();
        this.f1360m0 = K;
        if (K) {
            this.f1371x.setPrivateImeOptions("nm");
        }
        m2062k0(mo1761L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1355h0 = z;
        m2062k0(mo1761L());
    }

    public void setSuggestionsAdapter(C5982a aVar) {
        this.f1354g0 = aVar;
        this.f1371x.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23755H);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1336H = new Rect();
        this.f1337I = new Rect();
        this.f1338J = new int[2];
        this.f1339K = new int[2];
        this.f1367t0 = new C0409b();
        this.f1368u0 = new C0410c();
        this.f1369v0 = new WeakHashMap<>();
        C0413f fVar = new C0413f();
        this.f1370w0 = fVar;
        this.f1372x0 = new C0414g();
        C0415h hVar = new C0415h();
        this.f1374y0 = hVar;
        C0416i iVar = new C0416i();
        this.f1376z0 = iVar;
        C0417j jVar = new C0417j();
        this.f1328A0 = jVar;
        this.f1330B0 = new C0408a();
        int[] iArr = C4297j.f24073f2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0452a1 v = C0452a1.m2210v(context, attributeSet2, iArr, i2, 0);
        C0835a0.m3737l0(this, context, iArr, attributeSet2, v.mo2059r(), i2, 0);
        LayoutInflater.from(context).inflate(v.mo2055n(C4297j.f24123p2, C4294g.f23915r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C4293f.f23859D);
        this.f1371x = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1373y = findViewById(C4293f.f23897z);
        View findViewById = findViewById(C4293f.f23858C);
        this.f1375z = findViewById;
        View findViewById2 = findViewById(C4293f.f23865J);
        this.f1327A = findViewById2;
        ImageView imageView = (ImageView) findViewById(C4293f.f23895x);
        this.f1329B = imageView;
        ImageView imageView2 = (ImageView) findViewById(C4293f.f23856A);
        this.f1331C = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C4293f.f23896y);
        this.f1332D = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C4293f.f23860E);
        this.f1333E = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C4293f.f23857B);
        this.f1340L = imageView5;
        C0835a0.m3749r0(findViewById, v.mo2048g(C4297j.f24128q2));
        C0835a0.m3749r0(findViewById2, v.mo2048g(C4297j.f24148u2));
        int i3 = C4297j.f24143t2;
        imageView.setImageDrawable(v.mo2048g(i3));
        imageView2.setImageDrawable(v.mo2048g(C4297j.f24113n2));
        imageView3.setImageDrawable(v.mo2048g(C4297j.f24098k2));
        imageView4.setImageDrawable(v.mo2048g(C4297j.f24158w2));
        imageView5.setImageDrawable(v.mo2048g(i3));
        this.f1341M = v.mo2048g(C4297j.f24138s2);
        C0479d1.m2358a(imageView, getResources().getString(C4295h.f23929l));
        this.f1342N = v.mo2055n(C4297j.f24153v2, C4294g.f23914q);
        this.f1343O = v.mo2055n(C4297j.f24103l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1330B0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1372x0);
        searchAutoComplete.setOnFocusChangeListener(new C0411d());
        setIconifiedByDefault(v.mo2042a(C4297j.f24118o2, true));
        int f = v.mo2047f(C4297j.f24083h2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f1346R = v.mo2057p(C4297j.f24108m2);
        this.f1356i0 = v.mo2057p(C4297j.f24133r2);
        int k = v.mo2052k(C4297j.f24093j2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo2052k(C4297j.f24088i2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo2042a(C4297j.f24078g2, true));
        v.mo2061w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1344P = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1345Q = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1334F = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0412e());
        }
        m2062k0(this.f1352e0);
        m2058g0();
    }
}
