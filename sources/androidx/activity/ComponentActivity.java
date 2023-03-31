package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0256b;
import androidx.activity.result.C0257c;
import androidx.activity.result.C0258d;
import androidx.activity.result.C0259e;
import androidx.core.app.C0615b;
import androidx.core.app.C0623c;
import androidx.core.app.C0635g;
import androidx.core.app.C0647i;
import androidx.core.app.C0675q;
import androidx.core.content.C0681a;
import androidx.core.util.C0823a;
import androidx.core.view.C0920k;
import androidx.core.view.C0945m;
import androidx.lifecycle.C1174a0;
import androidx.lifecycle.C1187d0;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1206i;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1215k0;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1217l0;
import androidx.lifecycle.C1219m0;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1221n0;
import androidx.lifecycle.C1222o;
import androidx.lifecycle.C1236x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p034e.C4169a;
import p034e.C4170b;
import p041f.C4246a;
import p049g0.C4298a;
import p049g0.C4303d;
import p104o0.C5140c;
import p104o0.C5144d;
import p104o0.C5146e;
import p104o0.C5147f;
import p139t0.C5497a;

public class ComponentActivity extends C0635g implements C1217l0, C1206i, C5146e, C0246h, C0258d {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C4169a mContextAwareHelper;
    private C1196h0.C1200b mDefaultFactory;
    private final C1222o mLifecycleRegistry;
    private final C0920k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<C0823a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<C0823a<C0647i>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<C0823a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<C0823a<C0675q>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<C0823a<Integer>> mOnTrimMemoryListeners;
    final C5144d mSavedStateRegistryController;
    private C1215k0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0232a implements Runnable {
        C0232a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0233b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class C0234a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f554a;

            /* renamed from: b */
            final /* synthetic */ C4246a.C4247a f555b;

            C0234a(int i, C4246a.C4247a aVar) {
                this.f554a = i;
                this.f555b = aVar;
            }

            public void run() {
                C0233b.this.mo776c(this.f554a, this.f555b.mo17612a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class C0235b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f557a;

            /* renamed from: b */
            final /* synthetic */ IntentSender.SendIntentException f558b;

            C0235b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f557a = i;
                this.f558b = sendIntentException;
            }

            public void run() {
                C0233b.this.mo775b(this.f557a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f558b));
            }
        }

        C0233b() {
        }

        /* renamed from: f */
        public <I, O> void mo754f(int i, C4246a<I, O> aVar, I i2, C0623c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C4246a.C4247a<O> b = aVar.mo17611b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0234a(i, b));
                return;
            }
            Intent a = aVar.mo4184a(componentActivity, i2);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0615b.m2923u(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                C0259e eVar = (C0259e) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0615b.m2928z(componentActivity, eVar.mo800d(), i, eVar.mo797a(), eVar.mo798b(), eVar.mo799c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0235b(i, e));
                }
            } else {
                C0615b.m2927y(componentActivity, a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static class C0236c {
        /* renamed from: a */
        static void m1210a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    static final class C0237d {

        /* renamed from: a */
        Object f560a;

        /* renamed from: b */
        C1215k0 f561b;

        C0237d() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C4169a();
        this.mMenuHostHelper = new C0920k(new C0241c(this));
        this.mLifecycleRegistry = new C1222o(this);
        C5144d a = C5144d.m32043a(this);
        this.mSavedStateRegistryController = a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0232a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0233b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                getLifecycle().mo4399a(new C1216l() {
                    /* renamed from: c */
                    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                        if (bVar == C1208j.C1210b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                C0236c.m1210a(peekDecorView);
                            }
                        }
                    }
                });
            }
            getLifecycle().mo4399a(new C1216l() {
                /* renamed from: c */
                public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                    if (bVar == C1208j.C1210b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.mo17498b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo4404a();
                        }
                    }
                }
            });
            getLifecycle().mo4399a(new C1216l() {
                /* renamed from: c */
                public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo4401c(this);
                }
            });
            a.mo19114c();
            C1174a0.m5353c(this);
            if (19 <= i && i <= 23) {
                getLifecycle().mo4399a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo19111h(ACTIVITY_RESULT_TAG, new C0242d(this));
            addOnContextAvailableListener(new C0240b(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        C1219m0.m5436a(getWindow().getDecorView(), this);
        C1221n0.m5437a(getWindow().getDecorView(), this);
        C5147f.m32049a(getWindow().getDecorView(), this);
        C0248j.m1228a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.mo778h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle b = getSavedStateRegistry().mo19106b(ACTIVITY_RESULT_TAG);
        if (b != null) {
            this.mActivityResultRegistry.mo777g(b);
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(C0945m mVar) {
        this.mMenuHostHelper.mo3398c(mVar);
    }

    public final void addOnConfigurationChangedListener(C0823a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C4170b bVar) {
        this.mContextAwareHelper.mo17497a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(C0823a<C0647i> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(C0823a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(C0823a<C0675q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(C0823a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0237d dVar = (C0237d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f561b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C1215k0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C4298a getDefaultViewModelCreationExtras() {
        C4303d dVar = new C4303d();
        if (getApplication() != null) {
            dVar.mo17714c(C1196h0.C1197a.f3319h, getApplication());
        }
        dVar.mo17714c(C1174a0.f3281a, this);
        dVar.mo17714c(C1174a0.f3282b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.mo17714c(C1174a0.f3283c, getIntent().getExtras());
        }
        return dVar;
    }

    public C1196h0.C1200b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C1187d0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0237d dVar = (C0237d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f560a;
        }
        return null;
    }

    public C1208j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C5140c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo19113b();
    }

    public C1215k0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo775b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo759c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<C0823a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo19115d(bundle);
        this.mContextAwareHelper.mo17499c(this);
        super.onCreate(bundle);
        C1236x.m5481g(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.mo3401h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.mo3403j(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z) {
        Iterator<C0823a<C0647i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0647i(z));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<C0823a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.mo3402i(menu);
        super.onPanelClosed(i, menu);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<C0823a<C0675q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0675q(z));
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.mo3404k(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo775b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0237d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1215k0 k0Var = this.mViewModelStore;
        if (k0Var == null && (dVar = (C0237d) getLastNonConfigurationInstance()) != null) {
            k0Var = dVar.f561b;
        }
        if (k0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0237d dVar2 = new C0237d();
        dVar2.f560a = onRetainCustomNonConfigurationInstance;
        dVar2.f561b = k0Var;
        return dVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C1208j lifecycle = getLifecycle();
        if (lifecycle instanceof C1222o) {
            ((C1222o) lifecycle).mo4410o(C1208j.C1211c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo19116e(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<C0823a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.mo17500d();
    }

    public final <I, O> C0257c<I> registerForActivityResult(C4246a<I, O> aVar, ActivityResultRegistry activityResultRegistry, C0256b<O> bVar) {
        return activityResultRegistry.mo779i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(C0945m mVar) {
        this.mMenuHostHelper.mo3405l(mVar);
    }

    public final void removeOnConfigurationChangedListener(C0823a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C4170b bVar) {
        this.mContextAwareHelper.mo17501e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(C0823a<C0647i> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(C0823a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(C0823a<C0675q> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(C0823a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C5497a.m33451h()) {
                C5497a.m33446c("reportFullyDrawn() for ComponentActivity");
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19) {
                super.reportFullyDrawn();
            } else if (i == 19 && C0681a.m3145a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            C5497a.m33449f();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(C0945m mVar, C1220n nVar) {
        this.mMenuHostHelper.mo3399d(mVar, nVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void addMenuProvider(C0945m mVar, C1220n nVar, C1208j.C1211c cVar) {
        this.mMenuHostHelper.mo3400e(mVar, nVar, cVar);
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<C0823a<C0647i>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0647i(z, configuration));
        }
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<C0823a<C0675q>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0675q(z, configuration));
        }
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> C0257c<I> registerForActivityResult(C4246a<I, O> aVar, C0256b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
