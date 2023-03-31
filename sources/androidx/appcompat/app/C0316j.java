package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.view.C0339d;
import androidx.appcompat.widget.C0437a0;
import androidx.appcompat.widget.C0477d;
import androidx.appcompat.widget.C0478d0;
import androidx.appcompat.widget.C0490f;
import androidx.appcompat.widget.C0491f0;
import androidx.appcompat.widget.C0493g;
import androidx.appcompat.widget.C0496h;
import androidx.appcompat.widget.C0514l;
import androidx.appcompat.widget.C0534p;
import androidx.appcompat.widget.C0549r;
import androidx.appcompat.widget.C0551s;
import androidx.appcompat.widget.C0563v;
import androidx.appcompat.widget.C0565w;
import androidx.appcompat.widget.C0569x0;
import androidx.appcompat.widget.C0570y;
import androidx.core.view.C0835a0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p048g.C4297j;
import p124r.C5426g;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: AppCompatViewInflater */
public class C0316j {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final C5426g<String, Constructor<? extends View>> sConstructorMap = new C5426g<>();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sScreenReaderFocusable = {16844148};
    private final Object[] mConstructorArgs = new Object[2];

    /* renamed from: androidx.appcompat.app.j$a */
    /* compiled from: AppCompatViewInflater */
    private static class C0317a implements View.OnClickListener {

        /* renamed from: a */
        private final View f845a;

        /* renamed from: b */
        private final String f846b;

        /* renamed from: c */
        private Method f847c;

        /* renamed from: d */
        private Context f848d;

        public C0317a(View view, String str) {
            this.f845a = view;
            this.f846b = str;
        }

        /* renamed from: a */
        private void m1510a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f846b, new Class[]{View.class})) != null) {
                        this.f847c = method;
                        this.f848d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f845a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f845a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f846b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f845a.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f847c == null) {
                m1510a(this.f845a.getContext());
            }
            try {
                this.f847c.invoke(this.f848d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
            if (obtainStyledAttributes.hasValue(0)) {
                C0835a0.m3743o0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
            if (obtainStyledAttributes2.hasValue(0)) {
                C0835a0.m3747q0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
            if (obtainStyledAttributes3.hasValue(0)) {
                C0835a0.m3683B0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0835a0.m3700M(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0317a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C5426g<String, Constructor<? extends View>> gVar = sConstructorMap;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24154v3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C4297j.f24159w3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C4297j.f24164x3, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C0339d) || ((C0339d) context).mo1116c() != resourceId) ? new C0339d(context, resourceId) : context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public C0477d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0477d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0490f createButton(Context context, AttributeSet attributeSet) {
        return new C0490f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0493g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0493g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0496h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0496h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0514l createEditText(Context context, AttributeSet attributeSet) {
        return new C0514l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0534p createImageButton(Context context, AttributeSet attributeSet) {
        return new C0534p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0549r createImageView(Context context, AttributeSet attributeSet) {
        return new C0549r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0551s createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0551s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0563v createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0563v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0565w createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0565w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0570y createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0570y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0437a0 createSpinner(Context context, AttributeSet attributeSet) {
        return new C0437a0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0478d0 createTextView(Context context, AttributeSet attributeSet) {
        return new C0478d0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0491f0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0491f0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0569x0.m2725b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 8:
                view2 = createToggleButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 9:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 10:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 12:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 13:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
            backportAccessibilityAttributes(context2, view2, attributeSet);
        }
        return view2;
    }
}
