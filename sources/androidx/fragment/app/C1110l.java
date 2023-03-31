package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p019c0.C1835c;

/* renamed from: androidx.fragment.app.l */
/* compiled from: FragmentLayoutInflaterFactory */
class C1110l implements LayoutInflater.Factory2 {

    /* renamed from: a */
    final C1114n f3038a;

    /* renamed from: androidx.fragment.app.l$a */
    /* compiled from: FragmentLayoutInflaterFactory */
    class C1111a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1142u f3039a;

        C1111a(C1142u uVar) {
            this.f3039a = uVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f3039a.mo4252k();
            this.f3039a.mo4253m();
            C1077c0.m4861n((ViewGroup) k.f2818P.getParent(), C1110l.this.f3038a).mo3946j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    C1110l(C1114n nVar) {
        this.f3038a = nVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1142u uVar;
        if (C1106h.class.getName().equals(str)) {
            return new C1106h(context, attributeSet, this.f3038a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1835c.f5387d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C1835c.f5388e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C1835c.f5389f, -1);
        String string = obtainStyledAttributes.getString(C1835c.f5390g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1108j.m4968b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3038a.mo4144h0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3038a.mo4147i0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3038a.mo4144h0(id);
        }
        if (fragment == null) {
            fragment = this.f3038a.mo4162q0().mo4064a(context.getClassLoader(), attributeValue);
            fragment.f2850v = true;
            fragment.f2807E = resourceId != 0 ? resourceId : id;
            fragment.f2808F = id;
            fragment.f2809G = string;
            fragment.f2851w = true;
            C1114n nVar = this.f3038a;
            fragment.f2803A = nVar;
            fragment.f2804B = nVar.mo4166t0();
            fragment.mo3866y0(this.f3038a.mo4166t0().mo4066f(), attributeSet, fragment.f2824b);
            uVar = this.f3038a.mo4141g(fragment);
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.f2851w) {
            fragment.f2851w = true;
            C1114n nVar2 = this.f3038a;
            fragment.f2803A = nVar2;
            fragment.f2804B = nVar2.mo4166t0();
            fragment.mo3866y0(this.f3038a.mo4166t0().mo4066f(), attributeSet, fragment.f2824b);
            uVar = this.f3038a.mo4169v(fragment);
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        fragment.f2817O = (ViewGroup) view;
        uVar.mo4253m();
        uVar.mo4251j();
        View view2 = fragment.f2818P;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f2818P.getTag() == null) {
                fragment.f2818P.setTag(string);
            }
            fragment.f2818P.addOnAttachStateChangeListener(new C1111a(uVar));
            return fragment.f2818P;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
