package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.facebook.ads.AdError;
import com.startapp.C8837b0;
import com.startapp.C8920e;
import com.startapp.C8938f;
import com.startapp.C8988gd;
import com.startapp.C9087k9;
import com.startapp.C9206p0;
import com.startapp.C9265rb;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Random;

/* compiled from: Sta */
public abstract class BannerBase extends RelativeLayout {

    /* renamed from: a */
    public boolean f38200a;

    /* renamed from: b */
    public AdPreferences f38201b;

    /* renamed from: c */
    public AdRulesResult f38202c;

    /* renamed from: d */
    public int f38203d;

    /* renamed from: e */
    public boolean f38204e;

    /* renamed from: f */
    public Point f38205f;

    /* renamed from: g */
    public boolean f38206g;

    /* renamed from: h */
    public int f38207h;

    /* renamed from: i */
    public int f38208i;

    /* renamed from: k */
    public C8988gd f38209k;

    /* renamed from: l */
    public boolean f38210l;

    /* renamed from: m */
    public boolean f38211m;

    /* renamed from: n */
    public String f38212n;

    /* renamed from: o */
    public final Runnable f38213o;

    /* renamed from: p */
    public final Handler f38214p;

    /* renamed from: q */
    public final Object f38215q;

    /* renamed from: com.startapp.sdk.ads.banner.BannerBase$a */
    /* compiled from: Sta */
    public class C9286a implements Runnable {
        public C9286a() {
        }

        public void run() {
            AdRulesResult adRulesResult;
            if (BannerBase.this.isShown() || ((adRulesResult = BannerBase.this.f38202c) != null && !adRulesResult.mo30646b())) {
                BannerBase.this.mo29930j();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerBase$b */
    /* compiled from: Sta */
    public class C9287b implements Handler.Callback {
        public C9287b() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1 || i == 2) {
                BannerBase bannerBase = BannerBase.this;
                bannerBase.mo29935m();
                bannerBase.mo29930j();
            }
            return true;
        }
    }

    public BannerBase(Context context) {
        super(context);
        this.f38200a = false;
        this.f38203d = 0;
        this.f38204e = true;
        this.f38206g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f38207h = nextInt;
        this.f38208i = nextInt + 1;
        this.f38210l = false;
        this.f38211m = false;
        this.f38213o = new C9286a();
        this.f38214p = new Handler(Looper.getMainLooper(), new C9287b());
        this.f38215q = new Object();
        try {
            ComponentLocator.m50248a(context).mo31183s().mo29264a(512);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public abstract void mo29911a(int i);

    /* renamed from: a */
    public void mo29913a(C9087k9 k9Var) {
        if (this.f38209k == null) {
            C8988gd gdVar = new C8988gd(mo29919g(), k9Var, BannerMetaData.f38219b.mo29957a());
            this.f38209k = gdVar;
            if (gdVar.mo29439b()) {
                gdVar.run();
            }
        }
    }

    /* renamed from: b */
    public void mo29914b() {
        if (!isInEditMode()) {
            removeCallbacks(this.f38213o);
            synchronized (this.f38215q) {
                this.f38214p.removeMessages(2);
            }
        }
    }

    /* renamed from: c */
    public int mo29915c() {
        return mo29918f();
    }

    /* renamed from: d */
    public abstract int mo29916d();

    /* renamed from: e */
    public abstract String mo29917e();

    /* renamed from: f */
    public abstract int mo29918f();

    /* renamed from: g */
    public View mo29919g() {
        return this;
    }

    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.f38201b;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.f38201b = adPreferences2;
        return adPreferences2;
    }

    public abstract String getBidToken();

    public String getErrorMessage() {
        return this.f38212n;
    }

    @Keep
    public abstract int getHeightInDp();

    @Keep
    public abstract int getWidthInDp();

    /* renamed from: h */
    public void mo29925h() {
        if (!isInEditMode()) {
            mo29927i();
            return;
        }
        setMinimumWidth(C9265rb.m49233a(getContext(), getWidthInDp()));
        setMinimumHeight(C9265rb.m49233a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(mo29917e());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void hideBanner();

    /* renamed from: i */
    public abstract void mo29927i();

    public boolean isClicked() {
        return this.f38210l;
    }

    public boolean isFirstLoad() {
        return this.f38204e;
    }

    /* renamed from: j */
    public void mo29930j() {
        C8988gd gdVar = this.f38209k;
        if (gdVar != null) {
            gdVar.mo29438a();
            this.f38209k = null;
        }
        if (this.f38202c == null || AdaptMetaData.f38768a.mo30647a().mo30642a()) {
            AdRulesResult a = AdaptMetaData.f38768a.mo30647a().mo30640a(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag());
            this.f38202c = a;
            if (a.mo30646b()) {
                mo29932l();
            } else {
                hideBanner();
            }
        } else if (this.f38202c.mo30646b()) {
            mo29932l();
        }
    }

    /* renamed from: k */
    public void mo29931k() {
        synchronized (this.f38215q) {
            if (!this.f38214p.hasMessages(1)) {
                this.f38214p.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: l */
    public abstract void mo29932l();

    public void loadAd(int i, int i2) {
        if (getParent() == null) {
            try {
                ComponentLocator.m50248a(getContext()).mo31183s().mo29264a(1024);
            } catch (Throwable unused) {
            }
            this.f38205f = new Point(i, i2);
            mo29931k();
        }
    }

    /* renamed from: m */
    public void mo29935m() {
        if (this.f38200a && !isInEditMode() && CacheMetaData.m49873d()) {
            removeCallbacks(this.f38213o);
            postDelayed(this.f38213o, (long) mo29915c());
            long B = (long) (MetaData.f38952k.mo30986B() * AdError.NETWORK_ERROR_CODE);
            synchronized (this.f38215q) {
                this.f38214p.removeMessages(2);
                this.f38214p.sendEmptyMessageDelayed(2, B);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ComponentLocator.m50248a(getContext()).mo31183s().mo29264a(4096);
        } catch (Throwable unused) {
        }
        this.f38200a = true;
        mo29935m();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38200a = false;
        mo29914b();
        C8988gd gdVar = this.f38209k;
        if (gdVar != null) {
            gdVar.mo29438a();
            this.f38209k = null;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        mo29911a(bundle.getInt("bannerId"));
        this.f38202c = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.f38201b = (AdPreferences) bundle.getSerializable("adPreferences");
        this.f38203d = bundle.getInt("offset");
        this.f38204e = bundle.getBoolean("firstLoad");
        this.f38211m = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.f38211m = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putInt("bannerId", mo29916d());
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.f38202c);
        bundle.putSerializable("adPreferences", this.f38201b);
        bundle.putInt("offset", this.f38203d);
        bundle.putBoolean("firstLoad", this.f38204e);
        bundle.putBoolean("shouldReloadBanner", this.f38211m);
        return bundle;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.f38211m) {
                this.f38211m = false;
                mo29930j();
            }
            this.f38200a = true;
            mo29935m();
            return;
        }
        this.f38200a = false;
        mo29914b();
    }

    public void setAdPreferences(AdPreferences adPreferences) {
        this.f38201b = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z) {
        this.f38210l = z;
    }

    public void setErrorMessage(String str) {
        this.f38212n = str;
    }

    public void setFirstLoad(boolean z) {
        this.f38204e = z;
    }

    /* renamed from: v */
    public AdPreferences mo29946v() {
        AdPreferences adPreferences = getAdPreferences();
        boolean z = false;
        if (adPreferences.getPlacementId() == null) {
            String str = null;
            if (Build.VERSION.SDK_INT >= 9) {
                StringBuilder sb = null;
                String str2 = null;
                for (ViewParent viewParent = this; viewParent instanceof View; viewParent = ((View) viewParent).getParent()) {
                    if (str2 == null) {
                        str2 = C9396a.m49796c(((View) viewParent).getContext());
                    }
                    try {
                        String resourceEntryName = ((View) viewParent).getResources().getResourceEntryName(((View) viewParent).getId());
                        if (sb == null) {
                            sb = new StringBuilder();
                        } else {
                            sb.insert(0, "/");
                        }
                        sb.insert(0, resourceEntryName);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                if (sb != null) {
                    str = sb.toString();
                }
                Pair pair = new Pair(str2, str);
                str = C9396a.m49775a(getContext().getPackageName(), getClass().getName(), (String) pair.first, (String) pair.second);
            }
            adPreferences.setPlacementId(str);
        }
        boolean z2 = this.f38200a;
        int i = C8837b0.f36438a;
        if (Build.VERSION.SDK_INT >= 11 && 1 != getLayerType() && z2) {
            z = isHardwareAccelerated();
        }
        adPreferences.setHardwareAccelerated(z);
        return adPreferences;
    }

    /* renamed from: a */
    public final void mo29912a(Context context, AttributeSet attributeSet) {
        setAdTag(new C9206p0(context, attributeSet).f38040b);
    }

    public void loadAd() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        loadAd(C9265rb.m49239b(getContext(), displayMetrics.widthPixels), C9265rb.m49239b(getContext(), displayMetrics.heightPixels));
    }

    /* renamed from: a */
    public void mo29910a() {
        if (isFirstLoad() || AdaptMetaData.f38768a.mo30647a().mo30642a()) {
            setFirstLoad(false);
            C8938f.f36742d.mo29342a(new C8920e(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag()));
        }
    }

    public BannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38200a = false;
        this.f38203d = 0;
        this.f38204e = true;
        this.f38206g = false;
        int nextInt = new Random().nextInt(100000) + 159868227;
        this.f38207h = nextInt;
        this.f38208i = nextInt + 1;
        this.f38210l = false;
        this.f38211m = false;
        this.f38213o = new C9286a();
        this.f38214p = new Handler(Looper.getMainLooper(), new C9287b());
        this.f38215q = new Object();
        mo29912a(context, attributeSet);
    }
}
