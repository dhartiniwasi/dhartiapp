package p236g6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p124r.C5426g;

/* renamed from: g6.h */
/* compiled from: MotionSpec */
public class C10215h {

    /* renamed from: a */
    private final C5426g<String, C10216i> f40663a = new C5426g<>();

    /* renamed from: b */
    private final C5426g<String, PropertyValuesHolder[]> f40664b = new C5426g<>();

    /* renamed from: a */
    private static void m51723a(C10215h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo32896h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo32898i(objectAnimator.getPropertyName(), C10216i.m51732b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C10215h m51724b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m51725c(context, resourceId);
    }

    /* renamed from: c */
    public static C10215h m51725c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m51726d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m51726d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C10215h m51726d(List<Animator> list) {
        C10215h hVar = new C10215h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m51723a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public C10216i mo32892e(String str) {
        if (mo32895g(str)) {
            return this.f40663a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10215h)) {
            return false;
        }
        return this.f40663a.equals(((C10215h) obj).f40663a);
    }

    /* renamed from: f */
    public long mo32894f() {
        int size = this.f40663a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C10216i n = this.f40663a.mo19672n(i);
            j = Math.max(j, n.mo32901c() + n.mo32902d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean mo32895g(String str) {
        return this.f40663a.get(str) != null;
    }

    /* renamed from: h */
    public void mo32896h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f40664b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f40663a.hashCode();
    }

    /* renamed from: i */
    public void mo32898i(String str, C10216i iVar) {
        this.f40663a.put(str, iVar);
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f40663a + "}\n";
    }
}
