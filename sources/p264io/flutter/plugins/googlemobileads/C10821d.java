package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.Collections;
import p006a4.C0097b;
import p179z3.C6337h;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: io.flutter.plugins.googlemobileads.d */
/* compiled from: FluidAdManagerBannerAd */
final class C10821d extends C10848j {

    /* renamed from: h */
    private ViewGroup f42264h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f42265i = -1;

    /* renamed from: io.flutter.plugins.googlemobileads.d$a */
    /* compiled from: FluidAdManagerBannerAd */
    class C10822a implements View.OnLayoutChangeListener {
        C10822a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != C10821d.this.f42265i) {
                C10821d dVar = C10821d.this;
                dVar.f42333b.mo34464s(dVar.f42276a, measuredHeight);
            }
            int unused = C10821d.this.f42265i = measuredHeight;
        }
    }

    C10821d(int i, C10813a aVar, String str, C10843i iVar, C10819c cVar) {
        super(i, aVar, str, Collections.singletonList(new C10855m(C6337h.f30525p)), iVar, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        C0097b bVar = this.f42338g;
        if (bVar != null) {
            bVar.mo21695a();
            this.f42338g = null;
        }
        ViewGroup viewGroup = this.f42264h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f42264h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10731f mo34478b() {
        if (this.f42338g == null) {
            return null;
        }
        ViewGroup viewGroup = this.f42264h;
        if (viewGroup != null) {
            return new C10818b0(viewGroup);
        }
        ScrollView g = mo34479g();
        if (g == null) {
            return null;
        }
        g.setClipChildren(false);
        g.setVerticalScrollBarEnabled(false);
        g.setHorizontalScrollBarEnabled(false);
        this.f42264h = g;
        g.addView(this.f42338g);
        return new C10818b0(this.f42338g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ScrollView mo34479g() {
        if (this.f42333b.mo34452f() != null) {
            return new ScrollView(this.f42333b.mo34452f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    public void onAdLoaded() {
        C0097b bVar = this.f42338g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new C10822a());
            this.f42333b.mo34458m(this.f42276a, this.f42338g.getResponseInfo());
        }
    }
}
