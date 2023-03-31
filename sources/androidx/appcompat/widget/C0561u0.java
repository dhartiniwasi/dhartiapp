package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0681a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p048g.C4288a;
import p048g.C4293f;
import p163x.C5987c;

/* renamed from: androidx.appcompat.widget.u0 */
/* compiled from: SuggestionsAdapter */
class C0561u0 extends C5987c implements View.OnClickListener {

    /* renamed from: A */
    private ColorStateList f1832A;

    /* renamed from: B */
    private int f1833B = -1;

    /* renamed from: C */
    private int f1834C = -1;

    /* renamed from: D */
    private int f1835D = -1;

    /* renamed from: E */
    private int f1836E = -1;

    /* renamed from: F */
    private int f1837F = -1;

    /* renamed from: G */
    private int f1838G = -1;

    /* renamed from: t */
    private final SearchView f1839t;

    /* renamed from: u */
    private final SearchableInfo f1840u;

    /* renamed from: v */
    private final Context f1841v;

    /* renamed from: w */
    private final WeakHashMap<String, Drawable.ConstantState> f1842w;

    /* renamed from: x */
    private final int f1843x;

    /* renamed from: y */
    private boolean f1844y = false;

    /* renamed from: z */
    private int f1845z = 1;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0562a {

        /* renamed from: a */
        public final TextView f1846a;

        /* renamed from: b */
        public final TextView f1847b;

        /* renamed from: c */
        public final ImageView f1848c;

        /* renamed from: d */
        public final ImageView f1849d;

        /* renamed from: e */
        public final ImageView f1850e;

        public C0562a(View view) {
            this.f1846a = (TextView) view.findViewById(16908308);
            this.f1847b = (TextView) view.findViewById(16908309);
            this.f1848c = (ImageView) view.findViewById(16908295);
            this.f1849d = (ImageView) view.findViewById(16908296);
            this.f1850e = (ImageView) view.findViewById(C4293f.f23888q);
        }
    }

    public C0561u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1839t = searchView;
        this.f1840u = searchableInfo;
        this.f1843x = searchView.getSuggestionCommitIconResId();
        this.f1841v = context;
        this.f1842w = weakHashMap;
    }

    /* renamed from: A */
    private void m2690A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1842w.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m2691B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m2692k(String str) {
        Drawable.ConstantState constantState = this.f1842w.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m2693l(CharSequence charSequence) {
        if (this.f1832A == null) {
            TypedValue typedValue = new TypedValue();
            this.f1841v.getTheme().resolveAttribute(C4288a.f23758K, typedValue, true);
            this.f1832A = this.f1841v.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1832A, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m2694m(ComponentName componentName) {
        PackageManager packageManager = this.f1841v.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m2695n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1842w.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1842w.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1841v.getResources());
        }
        Drawable m = m2694m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f1842w.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m2696o(Cursor cursor, String str) {
        return m2702w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m2697p() {
        Drawable n = m2695n(this.f1840u.getSearchActivity());
        if (n != null) {
            return n;
        }
        return this.f1841v.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2698q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2630r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1841v     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0561u0.m2698q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m2699s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1841v.getPackageName() + "/" + parseInt;
            Drawable k = m2692k(str2);
            if (k != null) {
                return k;
            }
            Drawable f = C0681a.m3150f(this.f1841v, parseInt);
            m2690A(str2, f);
            return f;
        } catch (NumberFormatException unused) {
            Drawable k2 = m2692k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m2698q(Uri.parse(str));
            m2690A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m2700t(Cursor cursor) {
        int i = this.f1836E;
        if (i == -1) {
            return null;
        }
        Drawable s = m2699s(cursor.getString(i));
        if (s != null) {
            return s;
        }
        return m2697p();
    }

    /* renamed from: u */
    private Drawable m2701u(Cursor cursor) {
        int i = this.f1837F;
        if (i == -1) {
            return null;
        }
        return m2699s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m2702w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m2703y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m2704z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo2619a(Cursor cursor) {
        if (this.f1844y) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2619a(cursor);
            if (cursor != null) {
                this.f1833B = cursor.getColumnIndex("suggest_text_1");
                this.f1834C = cursor.getColumnIndex("suggest_text_2");
                this.f1835D = cursor.getColumnIndex("suggest_text_2_url");
                this.f1836E = cursor.getColumnIndex("suggest_icon_1");
                this.f1837F = cursor.getColumnIndex("suggest_icon_2");
                this.f1838G = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public CharSequence mo2620c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m2696o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f1840u.shouldRewriteQueryFromData() && (o2 = m2696o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f1840u.shouldRewriteQueryFromText() || (o = m2696o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    /* renamed from: d */
    public Cursor mo2621d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1839t.getVisibility() == 0 && this.f1839t.getWindowVisibility() == 0) {
            try {
                Cursor v = mo2631v(this.f1840u, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo2622e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0562a aVar = (C0562a) view.getTag();
        int i = this.f1838G;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1846a != null) {
            m2704z(aVar.f1846a, m2702w(cursor, this.f1833B));
        }
        if (aVar.f1847b != null) {
            String w = m2702w(cursor, this.f1835D);
            if (w != null) {
                charSequence = m2693l(w);
            } else {
                charSequence = m2702w(cursor, this.f1834C);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1846a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1846a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1846a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1846a.setMaxLines(1);
                }
            }
            m2704z(aVar.f1847b, charSequence);
        }
        ImageView imageView = aVar.f1848c;
        if (imageView != null) {
            m2703y(imageView, m2700t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1849d;
        if (imageView2 != null) {
            m2703y(imageView2, m2701u(cursor), 8);
        }
        int i3 = this.f1845z;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1850e.setVisibility(0);
            aVar.f1850e.setTag(aVar.f1846a.getText());
            aVar.f1850e.setOnClickListener(this);
            return;
        }
        aVar.f1850e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo20692g(this.f1841v, mo20690b(), viewGroup);
            if (g != null) {
                ((C0562a) g.getTag()).f1846a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo2625h(this.f1841v, mo20690b(), viewGroup);
            if (h != null) {
                ((C0562a) h.getTag()).f1846a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo2625h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo2625h(context, cursor, viewGroup);
        h.setTag(new C0562a(h));
        ((ImageView) h.findViewById(C4293f.f23888q)).setImageResource(this.f1843x);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2691B(mo20690b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2691B(mo20690b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1839t.mo1766U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo2630r(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1841v.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo2631v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1841v.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: x */
    public void mo2632x(int i) {
        this.f1845z = i;
    }
}
