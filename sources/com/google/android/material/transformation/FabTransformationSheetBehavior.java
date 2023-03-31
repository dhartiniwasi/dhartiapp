package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p227f6.C10125a;
import p236g6.C10215h;
import p236g6.C10217j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f34060i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m43191g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f34060i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0606f) && (((CoordinatorLayout.C0606f) childAt.getLayoutParams()).mo2816f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f34060i;
                        if (map != null && map.containsKey(childAt)) {
                            C0835a0.m3761x0(childAt, this.f34060i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f34060i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0835a0.m3761x0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f34060i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo25963H(View view, View view2, boolean z, boolean z2) {
        m43191g0(view2, z);
        return super.mo25963H(view, view2, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public FabTransformationBehavior.C7766e mo25967e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C10125a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C10125a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C7766e eVar = new FabTransformationBehavior.C7766e();
        eVar.f34053a = C10215h.m51725c(context, i);
        eVar.f34054b = new C10217j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
