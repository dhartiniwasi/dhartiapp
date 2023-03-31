package p264io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import p264io.flutter.embedding.android.C10644k;
import p264io.flutter.embedding.engine.C10685a;
import p297mb.C11881b;
import p408yb.C13257b;

/* renamed from: io.flutter.embedding.android.FlutterSplashView */
final class FlutterSplashView extends FrameLayout {

    /* renamed from: r */
    private static String f41706r = "FlutterSplashView";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10679x f41707a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10644k f41708b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f41709c;

    /* renamed from: d */
    Bundle f41710d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f41711e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f41712f;

    /* renamed from: g */
    private final C10644k.C10650f f41713g;

    /* renamed from: h */
    private final C13257b f41714h;

    /* renamed from: i */
    private final Runnable f41715i;

    @Keep
    /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new C10619a();
        /* access modifiers changed from: private */
        public String previousCompletedSplashIsolate;
        /* access modifiers changed from: private */
        public Bundle splashScreenState;

        /* renamed from: io.flutter.embedding.android.FlutterSplashView$SavedState$a */
        class C10619a implements Parcelable.Creator<SavedState> {
            C10619a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$a */
    class C10620a implements C10644k.C10650f {
        C10620a() {
        }

        /* renamed from: a */
        public void mo33828a() {
        }

        /* renamed from: b */
        public void mo33829b(C10685a aVar) {
            FlutterSplashView.this.f41708b.mo33974y(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.mo33820g(flutterSplashView.f41708b, FlutterSplashView.this.f41707a);
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$b */
    class C10621b implements C13257b {
        C10621b() {
        }

        /* renamed from: b */
        public void mo33830b() {
        }

        /* renamed from: d */
        public void mo33831d() {
            if (FlutterSplashView.this.f41707a != null) {
                FlutterSplashView.this.m53227k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterSplashView$c */
    class C10622c implements Runnable {
        C10622c() {
        }

        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f41709c);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            String unused = flutterSplashView2.f41712f = flutterSplashView2.f41711e;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: h */
    private boolean m53224h() {
        C10644k kVar = this.f41708b;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (kVar.mo33973w()) {
            return this.f41708b.getAttachedFlutterEngine().mo34072i().mo36422m() != null && this.f41708b.getAttachedFlutterEngine().mo34072i().mo36422m().equals(this.f41712f);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: i */
    private boolean m53225i() {
        C10644k kVar = this.f41708b;
        return kVar != null && kVar.mo33973w() && !this.f41708b.mo33972u() && !m53224h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f41707a;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m53226j() {
        /*
            r1 = this;
            io.flutter.embedding.android.k r0 = r1.f41708b
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.mo33973w()
            if (r0 == 0) goto L_0x001c
            io.flutter.embedding.android.x r0 = r1.f41707a
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.mo33837b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.m53228l()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.embedding.android.FlutterSplashView.m53226j():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m53227k() {
        this.f41711e = this.f41708b.getAttachedFlutterEngine().mo34072i().mo36422m();
        String str = f41706r;
        C11881b.m57388f(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f41711e);
        this.f41707a.mo33836a(this.f41715i);
    }

    /* renamed from: l */
    private boolean m53228l() {
        C10644k kVar = this.f41708b;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (kVar.mo33973w()) {
            return this.f41708b.mo33972u() && !m53224h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: g */
    public void mo33820g(C10644k kVar, C10679x xVar) {
        C10644k kVar2 = this.f41708b;
        if (kVar2 != null) {
            kVar2.mo33975z(this.f41714h);
            removeView(this.f41708b);
        }
        View view = this.f41709c;
        if (view != null) {
            removeView(view);
        }
        this.f41708b = kVar;
        addView(kVar);
        this.f41707a = xVar;
        if (xVar == null) {
            return;
        }
        if (m53225i()) {
            C11881b.m57388f(f41706r, "Showing splash screen UI.");
            View c = xVar.mo33838c(getContext(), this.f41710d);
            this.f41709c = c;
            addView(c);
            kVar.mo33953l(this.f41714h);
        } else if (m53226j()) {
            C11881b.m57388f(f41706r, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c2 = xVar.mo33838c(getContext(), this.f41710d);
            this.f41709c = c2;
            addView(c2);
            m53227k();
        } else if (!kVar.mo33973w()) {
            C11881b.m57388f(f41706r, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            kVar.mo33952k(this.f41713g);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f41712f = savedState.previousCompletedSplashIsolate;
        this.f41710d = savedState.splashScreenState;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        String unused = savedState.previousCompletedSplashIsolate = this.f41712f;
        C10679x xVar = this.f41707a;
        Bundle unused2 = savedState.splashScreenState = xVar != null ? xVar.mo33839d() : null;
        return savedState;
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41713g = new C10620a();
        this.f41714h = new C10621b();
        this.f41715i = new C10622c();
        setSaveEnabled(true);
    }
}
