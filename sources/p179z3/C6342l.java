package p179z3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.pm0;
import p006a4.C0100e;
import p033d5.C4141r;
import p060h4.C4470a;
import p060h4.C4587t2;
import p060h4.C4596v;

/* renamed from: z3.l */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C6342l extends ViewGroup {

    /* renamed from: a */
    protected final C4587t2 f30542a;

    protected C6342l(Context context, int i) {
        super(context);
        this.f30542a = new C4587t2(this, i);
    }

    /* renamed from: a */
    public void mo21695a() {
        C2679nz.m17343c(getContext());
        if (((Boolean) c10.f7559e.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14341J8)).booleanValue()) {
                em0.f8846b.execute(new C6328d0(this));
                return;
            }
        }
        this.f30542a.mo18155n();
    }

    /* renamed from: b */
    public void mo21696b(C6334g gVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(getContext());
        if (((Boolean) c10.f7560f.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C6324b0(this, gVar));
                return;
            }
        }
        this.f30542a.mo18157p(gVar.mo229a());
    }

    /* renamed from: c */
    public void mo21697c() {
        C2679nz.m17343c(getContext());
        if (((Boolean) c10.f7561g.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14351K8)).booleanValue()) {
                em0.f8846b.execute(new C6326c0(this));
                return;
            }
        }
        this.f30542a.mo18158q();
    }

    /* renamed from: d */
    public void mo21698d() {
        C2679nz.m17343c(getContext());
        if (((Boolean) c10.f7562h.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14331I8)).booleanValue()) {
                em0.f8846b.execute(new C6330e0(this));
                return;
            }
        }
        this.f30542a.mo18159r();
    }

    public C6327d getAdListener() {
        return this.f30542a.mo18146d();
    }

    public C6337h getAdSize() {
        return this.f30542a.mo18147e();
    }

    public String getAdUnitId() {
        return this.f30542a.mo18154m();
    }

    public C6348r getOnPaidEventListener() {
        return this.f30542a.mo18148f();
    }

    public C6353v getResponseInfo() {
        return this.f30542a.mo18149g();
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
        this.f30542a.mo18161t(dVar);
        if (dVar == null) {
            this.f30542a.mo18160s((C4470a) null);
            return;
        }
        if (dVar instanceof C4470a) {
            this.f30542a.mo18160s((C4470a) dVar);
        }
        if (dVar instanceof C0100e) {
            this.f30542a.mo18165x((C0100e) dVar);
        }
    }

    public void setAdSize(C6337h hVar) {
        this.f30542a.mo18162u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f30542a.mo18164w(str);
    }

    public void setOnPaidEventListener(C6348r rVar) {
        this.f30542a.mo18167z(rVar);
    }
}
