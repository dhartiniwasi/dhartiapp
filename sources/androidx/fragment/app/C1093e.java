package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0246h;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0258d;
import androidx.core.app.C0615b;
import androidx.core.app.C0678s;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1215k0;
import androidx.lifecycle.C1217l0;
import androidx.lifecycle.C1222o;
import androidx.loader.app.C1242a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p034e.C4170b;
import p104o0.C5140c;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentActivity */
public class C1093e extends ComponentActivity implements C0615b.C0620e, C0615b.C0622g {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C1222o mFragmentLifecycleRegistry = new C1222o(this);
    final C1107i mFragments = C1107i.m4944b(new C1096c());
    boolean mResumed;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.e$a */
    /* compiled from: FragmentActivity */
    class C1094a implements C5140c.C5143c {
        C1094a() {
        }

        /* renamed from: a */
        public Bundle mo763a() {
            Bundle bundle = new Bundle();
            C1093e.this.markFragmentsCreated();
            C1093e.this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_STOP);
            Parcelable x = C1093e.this.mFragments.mo4063x();
            if (x != null) {
                bundle.putParcelable(C1093e.FRAGMENTS_TAG, x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    /* compiled from: FragmentActivity */
    class C1095b implements C4170b {
        C1095b() {
        }

        /* renamed from: a */
        public void mo761a(Context context) {
            C1093e.this.mFragments.mo4041a((Fragment) null);
            Bundle b = C1093e.this.getSavedStateRegistry().mo19106b(C1093e.FRAGMENTS_TAG);
            if (b != null) {
                C1093e.this.mFragments.mo4062w(b.getParcelable(C1093e.FRAGMENTS_TAG));
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    /* compiled from: FragmentActivity */
    class C1096c extends C1109k<C1093e> implements C1217l0, C0246h, C0258d, C1138r {
        public C1096c() {
            super(C1093e.this);
        }

        /* renamed from: a */
        public void mo4008a(C1114n nVar, Fragment fragment) {
            C1093e.this.onAttachFragment(fragment);
        }

        /* renamed from: c */
        public View mo3873c(int i) {
            return C1093e.this.findViewById(i);
        }

        /* renamed from: d */
        public boolean mo3874d() {
            Window window = C1093e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return C1093e.this.getActivityResultRegistry();
        }

        public C1208j getLifecycle() {
            return C1093e.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C1093e.this.getOnBackPressedDispatcher();
        }

        public C1215k0 getViewModelStore() {
            return C1093e.this.getViewModelStore();
        }

        /* renamed from: i */
        public LayoutInflater mo4010i() {
            return C1093e.this.getLayoutInflater().cloneInContext(C1093e.this);
        }

        /* renamed from: j */
        public boolean mo4011j(Fragment fragment) {
            return !C1093e.this.isFinishing();
        }

        /* renamed from: m */
        public void mo4012m() {
            C1093e.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: n */
        public C1093e mo4009h() {
            return C1093e.this;
        }
    }

    public C1093e() {
        init();
    }

    private void init() {
        getSavedStateRegistry().mo19111h(FRAGMENTS_TAG, new C1094a());
        addOnContextAvailableListener(new C1095b());
    }

    private static boolean markState(C1114n nVar, C1208j.C1211c cVar) {
        boolean z = false;
        for (Fragment next : nVar.mo4164s0()) {
            if (next != null) {
                if (next.mo3862x() != null) {
                    z |= markState(next.mo3831o(), cVar);
                }
                C1058a0 a0Var = next.f2839i0;
                if (a0Var != null && a0Var.getLifecycle().mo4400b().mo4403a(C1208j.C1211c.STARTED)) {
                    next.f2839i0.mo3905f(cVar);
                    z = true;
                }
                if (next.f2837h0.mo4400b().mo4403a(C1208j.C1211c.STARTED)) {
                    next.f2837h0.mo4410o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo4061v(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C1242a.m5493b(this).mo4456a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo4059t().mo4128W(str, fileDescriptor, printWriter, strArr);
    }

    public C1114n getSupportFragmentManager() {
        return this.mFragments.mo4059t();
    }

    @Deprecated
    public C1242a getSupportLoaderManager() {
        return C1242a.m5493b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C1208j.C1211c.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo4060u();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.mo4060u();
        super.onConfigurationChanged(configuration);
        this.mFragments.mo4043d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_CREATE);
        this.mFragments.mo4045f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo4046g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo4047h();
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo4048i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo4050k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo4044e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo4049j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.mFragments.mo4060u();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo4051l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo4052m();
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo4053n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo4054o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo4060u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.mo4060u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo4058s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_RESUME);
        this.mFragments.mo4055p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.mo4060u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo4042c();
        }
        this.mFragments.mo4058s();
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_START);
        this.mFragments.mo4056q();
    }

    public void onStateNotSaved() {
        this.mFragments.mo4060u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo4057r();
        this.mFragmentLifecycleRegistry.mo4408h(C1208j.C1210b.ON_STOP);
    }

    public void setEnterSharedElementCallback(C0678s sVar) {
        C0615b.m2924v(this, sVar);
    }

    public void setExitSharedElementCallback(C0678s sVar) {
        C0615b.m2925w(this, sVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C0615b.m2928z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.mo3747D1(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0615b.m2919q(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0615b.m2921s(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0615b.m2916A(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0615b.m2927y(this, intent, -1, bundle);
        } else {
            fragment.mo3744C1(intent, i, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public C1093e(int i) {
        super(i);
        init();
    }
}
