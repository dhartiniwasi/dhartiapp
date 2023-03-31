package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4584t;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdActivity extends Activity {

    /* renamed from: a */
    private bf0 f5947a;

    /* renamed from: a */
    private final void m8994a() {
        bf0 bf0 = this.f5947a;
        if (bf0 != null) {
            try {
                bf0.mo8773g0();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8774g3(i, i2, intent);
            }
        } catch (Exception e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null && !bf0.mo8775k0()) {
                return;
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            bf0 bf02 = this.f5947a;
            if (bf02 != null) {
                bf02.mo8765U();
            }
        } catch (RemoteException e2) {
            pm0.m18669i("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8763B(C4956b.m31385o3(configuration));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bf0 k = C4584t.m30035a().mo18131k(this);
        this.f5947a = k;
        if (k != null) {
            try {
                k.mo8764Q4(bundle);
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
                finish();
            }
        } else {
            pm0.m18669i("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8767Z();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8768a0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8766Y();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8769b0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8776n0(bundle);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8771e0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8770d0();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            bf0 bf0 = this.f5947a;
            if (bf0 != null) {
                bf0.mo8772g();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m8994a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        m8994a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m8994a();
    }
}
