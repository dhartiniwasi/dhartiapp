package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.widget.C0501i1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0615b;
import androidx.core.app.C0648j;
import androidx.core.app.C0679t;
import androidx.fragment.app.C1093e;
import androidx.lifecycle.C1219m0;
import androidx.lifecycle.C1221n0;
import p034e.C4170b;
import p104o0.C5140c;
import p104o0.C5147f;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: AppCompatActivity */
public class C0282d extends C1093e implements C0285e, C0679t.C0680a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private C0286f mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.d$a */
    /* compiled from: AppCompatActivity */
    class C0283a implements C5140c.C5143c {
        C0283a() {
        }

        /* renamed from: a */
        public Bundle mo763a() {
            Bundle bundle = new Bundle();
            C0282d.this.getDelegate().mo950v(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    /* compiled from: AppCompatActivity */
    class C0284b implements C4170b {
        C0284b() {
        }

        /* renamed from: a */
        public void mo761a(Context context) {
            C0286f delegate = C0282d.this.getDelegate();
            delegate.mo943o();
            delegate.mo946r(C0282d.this.getSavedStateRegistry().mo19106b(C0282d.DELEGATE_TAG));
        }
    }

    public C0282d() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().mo19111h(DELEGATE_TAG, new C0283a());
        addOnContextAvailableListener(new C0284b());
    }

    private void initViewTreeOwners() {
        C1219m0.m5436a(getWindow().getDecorView(), this);
        C1221n0.m5437a(getWindow().getDecorView(), this);
        C5147f.m32049a(getWindow().getDecorView(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0282d.performMenuItemShortcut(android.view.KeyEvent):boolean");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo935d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo937f(context));
    }

    public void closeOptionsMenu() {
        C0275a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo841f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0275a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo852q(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo938i(i);
    }

    public C0286f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0286f.m1344g(this, this);
        }
        return this.mDelegate;
    }

    public C0279b getDrawerToggleDelegate() {
        return getDelegate().mo939k();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo941m();
    }

    public Resources getResources() {
        if (this.mResources == null && C0501i1.m2469c()) {
            this.mResources = new C0501i1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public C0275a getSupportActionBar() {
        return getDelegate().mo942n();
    }

    public Intent getSupportParentActivityIntent() {
        return C0648j.m2983a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo944p();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo945q(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C0679t tVar) {
        tVar.mo2994c(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo947s();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0275a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo844i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo948t(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo949u();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0679t tVar) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().mo951w();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().mo952x();
    }

    public void onSupportActionModeFinished(C0336b bVar) {
    }

    public void onSupportActionModeStarted(C0336b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0679t i = C0679t.m3139i(this);
            onCreateSupportNavigateUpTaskStack(i);
            onPrepareSupportNavigateUpTaskStack(i);
            i.mo2997j();
            try {
                C0615b.m2918p(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo933G(charSequence);
    }

    public C0336b onWindowStartingSupportActionMode(C0336b.C0337a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C0275a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo853r()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo928B(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo931E(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo932F(i);
    }

    public C0336b startSupportActionMode(C0336b.C0337a aVar) {
        return getDelegate().mo934H(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo944p();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0648j.m2987e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo927A(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0648j.m2988f(this, intent);
    }

    public C0282d(int i) {
        super(i);
        initDelegate();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo929C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo930D(view, layoutParams);
    }
}
