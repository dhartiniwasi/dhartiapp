package p143t4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4587t2;
import p179z3.C6327d;
import p179z3.C6337h;

/* renamed from: t4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C5526b extends ViewGroup {

    /* renamed from: a */
    private final C4587t2 f28043a;

    public C6327d getAdListener() {
        return this.f28043a.mo18146d();
    }

    public C6337h getAdSize() {
        return this.f28043a.mo18147e();
    }

    public String getAdUnitId() {
        return this.f28043a.mo18154m();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        C6337h hVar;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e) {
                pm0.m18665e("Unable to retrieve ad size.", e);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int k = hVar.mo21669k(context);
                i3 = hVar.mo21665d(context);
                i4 = k;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(C6327d dVar) {
        this.f28043a.mo18161t(dVar);
    }

    public void setAdSize(C6337h hVar) {
        this.f28043a.mo18162u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f28043a.mo18164w(str);
    }
}
