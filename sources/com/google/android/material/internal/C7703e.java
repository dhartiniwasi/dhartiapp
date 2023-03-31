package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.e */
/* compiled from: StateListAnimator */
public final class C7703e {

    /* renamed from: a */
    private final ArrayList<C7705b> f33841a = new ArrayList<>();

    /* renamed from: b */
    private C7705b f33842b = null;

    /* renamed from: c */
    ValueAnimator f33843c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f33844d = new C7704a();

    /* renamed from: com.google.android.material.internal.e$a */
    /* compiled from: StateListAnimator */
    class C7704a extends AnimatorListenerAdapter {
        C7704a() {
        }

        public void onAnimationEnd(Animator animator) {
            C7703e eVar = C7703e.this;
            if (eVar.f33843c == animator) {
                eVar.f33843c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.e$b */
    /* compiled from: StateListAnimator */
    static class C7705b {

        /* renamed from: a */
        final int[] f33846a;

        /* renamed from: b */
        final ValueAnimator f33847b;

        C7705b(int[] iArr, ValueAnimator valueAnimator) {
            this.f33846a = iArr;
            this.f33847b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m42934b() {
        ValueAnimator valueAnimator = this.f33843c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33843c = null;
        }
    }

    /* renamed from: e */
    private void m42935e(C7705b bVar) {
        ValueAnimator valueAnimator = bVar.f33847b;
        this.f33843c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo25733a(int[] iArr, ValueAnimator valueAnimator) {
        C7705b bVar = new C7705b(iArr, valueAnimator);
        valueAnimator.addListener(this.f33844d);
        this.f33841a.add(bVar);
    }

    /* renamed from: c */
    public void mo25734c() {
        ValueAnimator valueAnimator = this.f33843c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f33843c = null;
        }
    }

    /* renamed from: d */
    public void mo25735d(int[] iArr) {
        C7705b bVar;
        int size = this.f33841a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f33841a.get(i);
            if (StateSet.stateSetMatches(bVar.f33846a, iArr)) {
                break;
            }
            i++;
        }
        C7705b bVar2 = this.f33842b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m42934b();
            }
            this.f33842b = bVar;
            if (bVar != null) {
                m42935e(bVar);
            }
        }
    }
}
