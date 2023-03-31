package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.startapp.C8837b0;
import com.startapp.C9023i4;
import com.startapp.C9087k9;
import com.startapp.C9142n0;
import com.startapp.C9231q0;
import com.startapp.C9265rb;
import com.startapp.C9270s0;
import com.startapp.C9641x9;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Sta */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {

    /* renamed from: A */
    public boolean f38227A;

    /* renamed from: B */
    public boolean f38228B;

    /* renamed from: C */
    public boolean f38229C;

    /* renamed from: D */
    public boolean f38230D;

    /* renamed from: E */
    public boolean f38231E;

    /* renamed from: F */
    public boolean f38232F;

    /* renamed from: G */
    public boolean f38233G;

    /* renamed from: H */
    public boolean f38234H;

    /* renamed from: I */
    public boolean f38235I;

    /* renamed from: J */
    public boolean f38236J;

    /* renamed from: K */
    public boolean f38237K;

    /* renamed from: L */
    public boolean f38238L;

    /* renamed from: M */
    public boolean f38239M;

    /* renamed from: N */
    public AdInformationOverrides f38240N;

    /* renamed from: O */
    public List<C9142n0> f38241O;

    /* renamed from: P */
    public int f38242P;

    /* renamed from: Q */
    public BannerListener f38243Q;

    /* renamed from: R */
    public Runnable f38244R;

    /* renamed from: r */
    public BannerOptions f38245r;

    /* renamed from: s */
    public Banner3DAd f38246s;

    /* renamed from: t */
    public List<AdDetails> f38247t;

    /* renamed from: v */
    public Camera f38248v;

    /* renamed from: w */
    public Matrix f38249w;

    /* renamed from: x */
    public Paint f38250x;

    /* renamed from: y */
    public float f38251y;

    /* renamed from: z */
    public float f38252z;

    /* compiled from: Sta */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public AdRulesResult adRulesResult;
        public boolean bDefaultLoad;
        public boolean bIsVisible;
        private int currentImage;
        private AdDetails[] details;
        public C9142n0[] faces;
        private int firstRotation;
        private int firstRotationFinished;
        public boolean loaded;
        public boolean loading;
        public BannerOptions options;
        public AdInformationOverrides overrides;
        private float rotation;

        public int describeContents() {
            return 0;
        }

        public int getCurrentImage() {
            return this.currentImage;
        }

        public List<AdDetails> getDetails() {
            return Arrays.asList(this.details);
        }

        public float getRotation() {
            return this.rotation;
        }

        public boolean isFirstRotation() {
            return this.firstRotation == 1;
        }

        public boolean isFirstRotationFinished() {
            return this.firstRotationFinished == 1;
        }

        public void setCurrentImage(int i) {
            this.currentImage = i;
        }

        public void setDetails(List<AdDetails> list) {
            this.details = new AdDetails[list.size()];
            for (int i = 0; i < list.size(); i++) {
                this.details[i] = list.get(i);
            }
        }

        public void setFirstRotation(boolean z) {
            this.firstRotation = z ? 1 : 0;
        }

        public void setFirstRotationFinished(boolean z) {
            this.firstRotationFinished = z ? 1 : 0;
        }

        public void setRotation(float f) {
            this.rotation = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            if (!this.bIsVisible) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(this.currentImage);
            parcel.writeFloat(this.rotation);
            parcel.writeInt(this.firstRotation);
            parcel.writeInt(this.firstRotationFinished);
            parcel.writeParcelableArray(this.details, i);
            parcel.writeInt(this.loaded ? 1 : 0);
            parcel.writeInt(this.loading ? 1 : 0);
            parcel.writeInt(this.bDefaultLoad ? 1 : 0);
            C9142n0[] n0VarArr = this.faces;
            if (n0VarArr == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(n0VarArr.length);
                for (C9142n0 writeParcelable : this.faces) {
                    parcel.writeParcelable(writeParcelable, i);
                }
            }
            parcel.writeSerializable(this.overrides);
            parcel.writeSerializable(this.options);
            parcel.writeSerializable(this.adRulesResult);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            if (parcel.readInt() == 1) {
                this.bIsVisible = true;
                this.currentImage = parcel.readInt();
                this.rotation = parcel.readFloat();
                this.firstRotation = parcel.readInt();
                this.firstRotationFinished = parcel.readInt();
                Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
                if (readParcelableArray != null) {
                    AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
                    this.details = adDetailsArr;
                    System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
                }
                int readInt = parcel.readInt();
                this.loaded = false;
                if (readInt == 1) {
                    this.loaded = true;
                }
                int readInt2 = parcel.readInt();
                this.loading = false;
                if (readInt2 == 1) {
                    this.loading = true;
                }
                int readInt3 = parcel.readInt();
                this.bDefaultLoad = false;
                if (readInt3 == 1) {
                    this.bDefaultLoad = true;
                }
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    this.faces = new C9142n0[readInt4];
                    for (int i = 0; i < readInt4; i++) {
                        this.faces[i] = (C9142n0) parcel.readParcelable(C9142n0.class.getClassLoader());
                    }
                }
                this.overrides = (AdInformationOverrides) parcel.readSerializable();
                this.options = (BannerOptions) parcel.readSerializable();
                this.adRulesResult = (AdRulesResult) parcel.readSerializable();
                return;
            }
            this.bIsVisible = false;
        }
    }

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    /* renamed from: a */
    public void mo29994a(List<AdDetails> list, boolean z) {
        Banner3DAd banner3DAd;
        this.f38247t = list;
        String str = null;
        if (list != null) {
            C9270s0 s0Var = new C9270s0();
            StringBuilder sb = new StringBuilder();
            for (AdDetails g : list) {
                sb.append(C9396a.m49774a(g.mo30834g(), (String) null));
                sb.append(",");
            }
            if (Banner3DSize.m49331a(getContext(), getParent(), this.f38245r, this, s0Var)) {
                setMinimumWidth(C9265rb.m49233a(getContext(), this.f38245r.mo29978o()));
                setMinimumHeight(C9265rb.m49233a(getContext(), this.f38245r.mo29965d()));
                if (getLayoutParams() != null && getLayoutParams().width == -1) {
                    setMinimumWidth(C9265rb.m49233a(getContext(), s0Var.f38176a.x));
                }
                if (getLayoutParams() != null && getLayoutParams().height == -1) {
                    setMinimumHeight(C9265rb.m49233a(getContext(), s0Var.f38176a.y));
                }
                if (getLayoutParams() != null) {
                    if (getLayoutParams().width > 0) {
                        setMinimumWidth(getLayoutParams().width);
                    }
                    if (getLayoutParams().height > 0) {
                        setMinimumHeight(getLayoutParams().height);
                    }
                    if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (banner3DAd = this.f38246s) != null) {
                        banner3DAd.mo30024b(true);
                    }
                }
                List<C9142n0> list2 = this.f38241O;
                if (list2 == null || list2.size() == 0) {
                    mo29995n();
                    removeAllViews();
                    this.f38241O = new ArrayList();
                    for (AdDetails n0Var : list) {
                        this.f38241O.add(new C9142n0(getContext(), this, n0Var, this.f38245r, new TrackingParams(getAdPreferences().getAdTag())));
                    }
                    this.f38242P = 0;
                } else {
                    for (C9142n0 a : this.f38241O) {
                        a.mo29706a(getContext(), this.f38245r, this);
                    }
                }
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mo30001r(), mo29996o());
                layoutParams.addRule(13);
                int p = mo29999p();
                layoutParams.rightMargin = p;
                layoutParams.leftMargin = p;
                int q = mo30000q();
                layoutParams.topMargin = q;
                layoutParams.bottomMargin = q;
                addView(relativeLayout, layoutParams);
                Context context = getContext();
                AdInformationObject.Size size = AdInformationObject.Size.SMALL;
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                AdInformationOverrides adInformationOverrides = this.f38240N;
                Banner3DAd banner3DAd2 = this.f38246s;
                String requestUrl = banner3DAd2 != null ? banner3DAd2.getRequestUrl() : null;
                Banner3DAd banner3DAd3 = this.f38246s;
                if (banner3DAd3 != null) {
                    str = banner3DAd3.getDParam();
                }
                new AdInformationObject(context, size, placement, adInformationOverrides, (ConsentData) null, requestUrl, str).mo30608a(relativeLayout);
                if (this.f38250x == null) {
                    Paint paint = new Paint();
                    this.f38250x = paint;
                    paint.setAntiAlias(true);
                    this.f38250x.setFilterBitmap(true);
                }
                if (!this.f38233G) {
                    this.f38233G = true;
                    mo30004u();
                }
                if (this.f38234H) {
                    mo30003t();
                }
                if (z) {
                    C9231q0.m49172c(getContext(), this.f38243Q, this, sb.toString());
                    return;
                }
                return;
            }
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z) {
                C9231q0.m49171b(getContext(), this.f38243Q, this, sb.toString());
                return;
            }
            return;
        }
        setErrorMessage("No ads to load");
        if (z) {
            C9231q0.m49171b(getContext(), this.f38243Q, this, (String) null);
        }
    }

    /* renamed from: d */
    public int mo29916d() {
        return this.f38207h;
    }

    /* renamed from: e */
    public String mo29917e() {
        return "StartApp Banner3D";
    }

    /* renamed from: f */
    public int mo29918f() {
        return BannerMetaData.f38219b.mo29957a().mo29973j();
    }

    public String getBidToken() {
        Banner3DAd banner3DAd = this.f38246s;
        if (banner3DAd != null) {
            return banner3DAd.getBidToken();
        }
        return null;
    }

    public int getHeightInDp() {
        return 50;
    }

    public int getWidthInDp() {
        return 300;
    }

    public void hideBanner() {
        this.f38234H = false;
        setVisibility(8);
    }

    /* renamed from: i */
    public void mo29927i() {
        if (!this.f38237K) {
            this.f38245r = BannerMetaData.f38219b.mo29958b();
            this.f38247t = new ArrayList();
            this.f38240N = AdInformationOverrides.m49816a();
            mo29995n();
            this.f38241O = new ArrayList();
            this.f38237K = true;
            setBackgroundColor(0);
            if (getId() == -1) {
                setId(this.f38207h);
            }
            if (this.f38235I) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        ViewTreeObserver viewTreeObserver = Banner3D.this.getViewTreeObserver();
                        int i = C8837b0.f36438a;
                        if (Build.VERSION.SDK_INT >= 16) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        } else {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        }
                        Banner3D banner3D = Banner3D.this;
                        if (!banner3D.f38236J) {
                            banner3D.mo29931k();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: l */
    public void mo29932l() {
        int i = 0;
        this.f38236J = false;
        this.f38237K = true;
        this.f38233G = false;
        this.f38227A = true;
        this.f38229C = true;
        this.f38230D = false;
        this.f38231E = false;
        this.f38206g = false;
        this.f38202c = null;
        mo29995n();
        this.f38241O = new ArrayList();
        Context context = getContext();
        Banner3DAd banner3DAd = this.f38246s;
        if (banner3DAd != null) {
            i = banner3DAd.mo30025h();
        }
        Banner3DAd banner3DAd2 = new Banner3DAd(context, i);
        this.f38246s = banner3DAd2;
        banner3DAd2.load(mo29946v(), this);
    }

    /* renamed from: n */
    public final void mo29995n() {
        List<C9142n0> list = this.f38241O;
        if (list != null && !list.isEmpty()) {
            for (C9142n0 next : this.f38241O) {
                if (next != null) {
                    Bitmap bitmap = next.f37329c;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmap2 = next.f37330d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    next.f37329c = null;
                    next.f37330d = null;
                    C9087k9 k9Var = next.f37333g;
                    if (k9Var != null) {
                        k9Var.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                    }
                    Banner3DView banner3DView = next.f37334h;
                    if (banner3DView != null) {
                        banner3DView.removeAllViews();
                        next.f37334h = null;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final int mo29996o() {
        return (int) (this.f38245r.mo29966e() * ((float) C9265rb.m49233a(getContext(), this.f38245r.mo29965d())));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38238L = true;
        BannerOptions bannerOptions = this.f38245r;
        if (bannerOptions == null || !bannerOptions.mo29982s()) {
            this.f38229C = false;
            this.f38230D = true;
        }
        mo30004u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38238L = false;
        removeCallbacks(this.f38244R);
        List<C9142n0> list = this.f38241O;
        if (list != null) {
            for (C9142n0 n0Var : list) {
                C9087k9 k9Var = n0Var.f37333g;
                if (k9Var != null) {
                    k9Var.mo29608a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDraw(canvas);
        if (!this.f38206g && !this.f38237K) {
            this.f38206g = true;
            mo30004u();
        }
        if (!isInEditMode() && this.f38234H) {
            List<C9142n0> list = this.f38241O;
            if (!(list == null || list.size() == 0)) {
                try {
                    int r = mo30001r();
                    int o = mo29996o();
                    int p = mo29999p();
                    int q = mo30000q();
                    float g = !this.f38230D ? this.f38245r.mo29969g() : ((1.0f - this.f38245r.mo29969g()) * ((float) Math.pow((double) (Math.abs(this.f38251y - 45.0f) / 45.0f), (double) this.f38245r.mo29975l()))) + this.f38245r.mo29969g();
                    Bitmap bitmap3 = this.f38241O.get((this.f38241O.size() + (this.f38242P - 1)) % this.f38241O.size()).f37330d;
                    Bitmap bitmap4 = this.f38241O.get(this.f38242P).f37330d;
                    if (bitmap4 != null && bitmap3 != null) {
                        float f = this.f38251y;
                        if (f < 45.0f) {
                            if (f > 3.0f) {
                                bitmap2 = bitmap3;
                                mo29993a(canvas, bitmap4, q, p, r / 2, o / 2, g, (f - 90.0f) * ((float) this.f38245r.mo29964c().getRotationMultiplier()));
                            } else {
                                bitmap2 = bitmap3;
                            }
                            mo29993a(canvas, bitmap2, q, p, r / 2, o / 2, g, this.f38251y * ((float) this.f38245r.mo29964c().getRotationMultiplier()));
                            return;
                        }
                        Bitmap bitmap5 = bitmap3;
                        if (f < 87.0f) {
                            bitmap = bitmap4;
                            mo29993a(canvas, bitmap5, q, p, r / 2, o / 2, g, f * ((float) this.f38245r.mo29964c().getRotationMultiplier()));
                        } else {
                            bitmap = bitmap4;
                        }
                        mo29993a(canvas, bitmap, q, p, r / 2, o / 2, g, (this.f38251y - 90.0f) * ((float) this.f38245r.mo29964c().getRotationMultiplier()));
                        if (!this.f38229C) {
                            this.f38230D = true;
                        }
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    public void onFailedToReceiveAd(C9381Ad ad) {
        if (ad != null) {
            setErrorMessage(ad.getErrorMessage());
        }
        C9231q0.m49171b(getContext(), this.f38243Q, this, (String) null);
    }

    public void onReceiveAd(C9381Ad ad) {
        this.f38236J = true;
        this.f38237K = false;
        this.f38240N = this.f38246s.getAdInfoOverride();
        List<AdDetails> g = ((JsonAd) ad).mo30512g();
        this.f38247t = g;
        mo29994a(g, this.f38239M);
        this.f38239M = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z = savedState.bIsVisible;
        this.f38234H = z;
        if (z) {
            this.f38247t = savedState.getDetails();
            this.f38251y = savedState.getRotation();
            this.f38229C = savedState.isFirstRotation();
            this.f38230D = savedState.isFirstRotationFinished();
            this.f38242P = savedState.getCurrentImage();
            C9142n0[] n0VarArr = savedState.faces;
            mo29995n();
            this.f38241O = new ArrayList();
            if (n0VarArr != null) {
                for (C9142n0 add : n0VarArr) {
                    this.f38241O.add(add);
                }
            }
            this.f38236J = savedState.loaded;
            this.f38237K = savedState.loading;
            this.f38235I = savedState.bDefaultLoad;
            this.f38240N = savedState.overrides;
            this.f38245r = savedState.options;
            if (this.f38247t.size() == 0) {
                this.f38235I = true;
                mo29925h();
                return;
            }
            post(new Runnable() {
                public void run() {
                    Banner3D banner3D = Banner3D.this;
                    banner3D.mo29994a(banner3D.f38247t, false);
                }
            });
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.bIsVisible = this.f38234H;
        savedState.setDetails(this.f38247t);
        savedState.setRotation(this.f38251y);
        savedState.setFirstRotation(this.f38229C);
        savedState.setFirstRotationFinished(this.f38230D);
        savedState.setCurrentImage(this.f38242P);
        savedState.options = this.f38245r;
        savedState.faces = new C9142n0[this.f38241O.size()];
        savedState.loaded = this.f38236J;
        savedState.loading = this.f38237K;
        savedState.overrides = this.f38240N;
        for (int i = 0; i < this.f38241O.size(); i++) {
            savedState.faces[i] = this.f38241O.get(i);
        }
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<C9142n0> list;
        int r = mo30001r();
        int o = mo29996o();
        int p = mo29999p();
        int q = mo30000q();
        if (!(motionEvent.getX() >= ((float) p) && motionEvent.getY() >= ((float) q) && motionEvent.getX() <= ((float) (p + r)) && motionEvent.getY() <= ((float) (q + o))) || (list = this.f38241O) == null || list.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f38232F = true;
            this.f38252z = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.f38252z - motionEvent.getY() >= 10.0f) {
                this.f38232F = false;
                this.f38252z = motionEvent.getY();
            }
        } else if (this.f38232F) {
            if (this.f38251y < 45.0f) {
                mo30002s();
            }
            this.f38232F = false;
            this.f38227A = false;
            setClicked(true);
            postDelayed(new Runnable() {
                public void run() {
                    Banner3D.this.f38227A = true;
                }
            }, AdsCommonMetaData.f38625h.mo30481z());
            C9142n0 n0Var = this.f38241O.get(this.f38242P);
            Context context = getContext();
            String m = n0Var.f37327a.mo30840m();
            boolean a = C9396a.m49790a(context, AdPreferences.Placement.INAPP_BANNER);
            C9087k9 k9Var = n0Var.f37333g;
            String str = null;
            if (k9Var != null) {
                k9Var.mo29608a((String) null, (JSONObject) null);
            }
            if (m != null && !"null".equals(m) && !TextUtils.isEmpty(m)) {
                C9396a.m49785a(m, n0Var.f37327a.mo30839l(), n0Var.f37327a.mo30834g(), context, n0Var.f37332f);
            } else if (!n0Var.f37327a.mo30824A() || a) {
                C9396a.m49781a(context, n0Var.f37327a.mo30834g(), n0Var.f37327a.mo30849u(), n0Var.f37332f, n0Var.f37327a.mo30825B() && !a, false);
            } else {
                C9396a.m49782a(context, n0Var.f37327a.mo30834g(), n0Var.f37327a.mo30849u(), n0Var.f37327a.mo30843p(), n0Var.f37332f, AdsCommonMetaData.f38625h.mo30481z(), AdsCommonMetaData.f38625h.mo30480y(), n0Var.f37327a.mo30825B(), n0Var.f37327a.mo30826C(), false, (Runnable) null);
            }
            if (this.f38242P < this.f38247t.size()) {
                str = C9396a.m49774a(this.f38247t.get(this.f38242P).mo30834g(), (String) null);
            }
            C9231q0.m49170a(getContext(), this.f38243Q, this, str);
        }
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f38238L = true;
            BannerOptions bannerOptions = this.f38245r;
            if (bannerOptions == null || !bannerOptions.mo29982s()) {
                this.f38229C = false;
                this.f38230D = true;
            }
            mo30004u();
            return;
        }
        this.f38238L = false;
        if (!this.f38228B) {
            removeCallbacks(this.f38244R);
        }
    }

    /* renamed from: p */
    public final int mo29999p() {
        return (getWidth() - mo30001r()) / 2;
    }

    /* renamed from: q */
    public final int mo30000q() {
        return (getHeight() - mo29996o()) / 2;
    }

    /* renamed from: r */
    public final int mo30001r() {
        return (int) (this.f38245r.mo29979p() * ((float) C9265rb.m49233a(getContext(), this.f38245r.mo29978o())));
    }

    /* renamed from: s */
    public final void mo30002s() {
        this.f38242P = ((this.f38242P - 1) + this.f38241O.size()) % this.f38241O.size();
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.f38243Q = bannerListener;
    }

    public void showBanner() {
        this.f38234H = true;
        mo30003t();
    }

    /* renamed from: t */
    public final void mo30003t() {
        setVisibility(0);
        if (this.f38246s != null) {
            C9641x9 t = ComponentLocator.m50248a(getContext()).mo31184t();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.f38246s.getAdId();
            if (adId != null) {
                t.f39385a.put(new C9641x9.C9642a(placement, -1), adId);
            }
        }
    }

    /* renamed from: u */
    public final void mo30004u() {
        if (this.f38238L && this.f38206g) {
            removeCallbacks(this.f38244R);
            post(this.f38244R);
        }
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public Banner3D(Activity activity, boolean z, AdPreferences adPreferences) {
        this((Context) activity, z, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z, AdPreferences adPreferences) {
        super(context);
        this.f38248v = null;
        this.f38249w = null;
        this.f38250x = null;
        this.f38251y = 45.0f;
        this.f38252z = 0.0f;
        this.f38227A = true;
        this.f38228B = false;
        this.f38229C = true;
        this.f38230D = false;
        this.f38231E = false;
        this.f38232F = false;
        this.f38233G = false;
        this.f38234H = true;
        this.f38235I = true;
        this.f38236J = false;
        this.f38237K = false;
        this.f38238L = false;
        this.f38239M = true;
        this.f38241O = new ArrayList();
        this.f38242P = 0;
        this.f38244R = new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
            /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r12 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38236J
                    if (r1 == 0) goto L_0x0136
                    java.util.List<com.startapp.n0> r0 = r0.f38241O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0136
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38234H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008e
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008e
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38206g
                    if (r1 == 0) goto L_0x008e
                    java.util.List<com.startapp.n0> r1 = r0.f38241O
                    int r0 = r0.f38242P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.n0 r0 = (com.startapp.C9142n0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.String[] r4 = r4.mo30851w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007d
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f37331e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007d
                    com.startapp.k9 r11 = new com.startapp.k9
                    com.startapp.sdk.adsbase.model.AdPreferences$Placement r6 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.String[] r7 = r4.mo30851w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r8 = r0.f37332f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.Long r4 = r4.mo30835h()
                    if (r4 == 0) goto L_0x006a
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r9 = r0.f37327a
                    java.lang.Long r9 = r9.mo30835h()
                    long r9 = r9.longValue()
                    long r9 = r4.toMillis(r9)
                    goto L_0x0076
                L_0x006a:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r9 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                    long r9 = r9.mo31037r()
                    long r9 = r4.toMillis(r9)
                L_0x0076:
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.f37333g = r11
                    goto L_0x007e
                L_0x007d:
                    r11 = 0
                L_0x007e:
                    if (r11 == 0) goto L_0x0083
                    r1.mo29913a((com.startapp.C9087k9) r11)
                L_0x0083:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38231E
                    if (r1 != 0) goto L_0x008e
                    r0.f38231E = r3
                    r0.mo29910a()
                L_0x008e:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38227A
                    if (r1 == 0) goto L_0x00d9
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29976m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.f38230D
                    if (r5 != 0) goto L_0x00a7
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f38245r
                    int r4 = r4.mo29974k()
                    goto L_0x00a8
                L_0x00a7:
                    r4 = 1
                L_0x00a8:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f38251y
                    float r4 = r4 + r1
                    r0.f38251y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c7
                    int r4 = r0.f38242P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.n0> r5 = r0.f38241O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.f38242P = r4
                    float r4 = r0.f38251y
                    float r4 = r4 - r1
                    r0.f38251y = r4
                L_0x00c7:
                    float r4 = r0.f38251y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d6
                    r0.mo30002s()
                    float r4 = r0.f38251y
                    float r4 = r4 + r1
                    r0.f38251y = r4
                L_0x00d6:
                    r0.invalidate()
                L_0x00d9:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f38251y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f38245r
                    int r0 = r0.mo29976m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0114
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f38251y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f38245r
                    int r0 = r0.mo29976m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0114
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38229C
                    if (r1 != 0) goto L_0x0114
                    boolean r1 = r0.f38238L
                    if (r1 == 0) goto L_0x010f
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29963b()
                    long r4 = (long) r1
                    r0.postDelayed(r12, r4)
                L_0x010f:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38228B = r2
                    goto L_0x0124
                L_0x0114:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29977n()
                    long r4 = (long) r1
                    r0.postDelayed(r12, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38228B = r3
                L_0x0124:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.f38242P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.n0> r0 = r0.f38241O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0136
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38229C = r2
                L_0x0136:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.C92911.run():void");
            }
        };
        try {
            this.f38235I = z;
            setAdPreferences(adPreferences);
            mo29925h();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38248v = null;
        this.f38249w = null;
        this.f38250x = null;
        this.f38251y = 45.0f;
        this.f38252z = 0.0f;
        this.f38227A = true;
        this.f38228B = false;
        this.f38229C = true;
        this.f38230D = false;
        this.f38231E = false;
        this.f38232F = false;
        this.f38233G = false;
        this.f38234H = true;
        this.f38235I = true;
        this.f38236J = false;
        this.f38237K = false;
        this.f38238L = false;
        this.f38239M = true;
        this.f38241O = new ArrayList();
        this.f38242P = 0;
        this.f38244R = new Runnable() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r12 = this;
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38236J
                    if (r1 == 0) goto L_0x0136
                    java.util.List<com.startapp.n0> r0 = r0.f38241O
                    int r0 = r0.size()
                    if (r0 != 0) goto L_0x0010
                    goto L_0x0136
                L_0x0010:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38234H
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x008e
                    boolean r0 = r0.isShown()
                    if (r0 == 0) goto L_0x008e
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38206g
                    if (r1 == 0) goto L_0x008e
                    java.util.List<com.startapp.n0> r1 = r0.f38241O
                    int r0 = r0.f38242P
                    java.lang.Object r0 = r1.get(r0)
                    com.startapp.n0 r0 = (com.startapp.C9142n0) r0
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r1 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    android.content.Context r5 = r1.getContext()
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.String[] r4 = r4.mo30851w()
                    int r4 = r4.length
                    if (r4 <= 0) goto L_0x007d
                    java.util.concurrent.atomic.AtomicBoolean r4 = r0.f37331e
                    boolean r4 = r4.compareAndSet(r2, r3)
                    if (r4 == 0) goto L_0x007d
                    com.startapp.k9 r11 = new com.startapp.k9
                    com.startapp.sdk.adsbase.model.AdPreferences$Placement r6 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.INAPP_BANNER
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.String[] r7 = r4.mo30851w()
                    com.startapp.sdk.adsbase.commontracking.TrackingParams r8 = r0.f37332f
                    com.startapp.sdk.adsbase.model.AdDetails r4 = r0.f37327a
                    java.lang.Long r4 = r4.mo30835h()
                    if (r4 == 0) goto L_0x006a
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.model.AdDetails r9 = r0.f37327a
                    java.lang.Long r9 = r9.mo30835h()
                    long r9 = r9.longValue()
                    long r9 = r4.toMillis(r9)
                    goto L_0x0076
                L_0x006a:
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    com.startapp.sdk.adsbase.remoteconfig.MetaData r9 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
                    long r9 = r9.mo31037r()
                    long r9 = r4.toMillis(r9)
                L_0x0076:
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.f37333g = r11
                    goto L_0x007e
                L_0x007d:
                    r11 = 0
                L_0x007e:
                    if (r11 == 0) goto L_0x0083
                    r1.mo29913a((com.startapp.C9087k9) r11)
                L_0x0083:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38231E
                    if (r1 != 0) goto L_0x008e
                    r0.f38231E = r3
                    r0.mo29910a()
                L_0x008e:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38227A
                    if (r1 == 0) goto L_0x00d9
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29976m()
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r4 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r5 = r4.f38230D
                    if (r5 != 0) goto L_0x00a7
                    com.startapp.sdk.ads.banner.BannerOptions r4 = r4.f38245r
                    int r4 = r4.mo29974k()
                    goto L_0x00a8
                L_0x00a7:
                    r4 = 1
                L_0x00a8:
                    int r1 = r1 * r4
                    float r1 = (float) r1
                    float r4 = r0.f38251y
                    float r4 = r4 + r1
                    r0.f38251y = r4
                    r1 = 1119092736(0x42b40000, float:90.0)
                    int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r4 < 0) goto L_0x00c7
                    int r4 = r0.f38242P
                    int r4 = r4 + r3
                    java.util.List<com.startapp.n0> r5 = r0.f38241O
                    int r5 = r5.size()
                    int r4 = r4 % r5
                    r0.f38242P = r4
                    float r4 = r0.f38251y
                    float r4 = r4 - r1
                    r0.f38251y = r4
                L_0x00c7:
                    float r4 = r0.f38251y
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 > 0) goto L_0x00d6
                    r0.mo30002s()
                    float r4 = r0.f38251y
                    float r4 = r4 + r1
                    r0.f38251y = r4
                L_0x00d6:
                    r0.invalidate()
                L_0x00d9:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f38251y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f38245r
                    int r0 = r0.mo29976m()
                    int r0 = 90 - r0
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0114
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    float r1 = r0.f38251y
                    com.startapp.sdk.ads.banner.BannerOptions r0 = r0.f38245r
                    int r0 = r0.mo29976m()
                    int r0 = r0 + 90
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0114
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    boolean r1 = r0.f38229C
                    if (r1 != 0) goto L_0x0114
                    boolean r1 = r0.f38238L
                    if (r1 == 0) goto L_0x010f
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29963b()
                    long r4 = (long) r1
                    r0.postDelayed(r12, r4)
                L_0x010f:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38228B = r2
                    goto L_0x0124
                L_0x0114:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    com.startapp.sdk.ads.banner.BannerOptions r1 = r0.f38245r
                    int r1 = r1.mo29977n()
                    long r4 = (long) r1
                    r0.postDelayed(r12, r4)
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38228B = r3
                L_0x0124:
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    int r1 = r0.f38242P
                    int r1 = r1 + r3
                    java.util.List<com.startapp.n0> r0 = r0.f38241O
                    int r0 = r0.size()
                    int r1 = r1 % r0
                    if (r1 != 0) goto L_0x0136
                    com.startapp.sdk.ads.banner.banner3d.Banner3D r0 = com.startapp.sdk.ads.banner.banner3d.Banner3D.this
                    r0.f38229C = r2
                L_0x0136:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.banner3d.Banner3D.C92911.run():void");
            }
        };
        try {
            mo29925h();
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public final void mo29993a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.f38248v == null) {
            this.f38248v = new Camera();
        }
        this.f38248v.save();
        this.f38248v.translate(0.0f, 0.0f, (float) i4);
        this.f38248v.rotateX(f2);
        float f3 = (float) (-i4);
        this.f38248v.translate(0.0f, 0.0f, f3);
        if (this.f38249w == null) {
            this.f38249w = new Matrix();
        }
        this.f38248v.getMatrix(this.f38249w);
        this.f38248v.restore();
        this.f38249w.preTranslate((float) (-i3), f3);
        this.f38249w.postScale(f, f);
        this.f38249w.postTranslate((float) (i2 + i3), (float) (i + i4));
        canvas.drawBitmap(bitmap, this.f38249w, this.f38250x);
    }

    /* renamed from: a */
    public void mo29911a(int i) {
        this.f38207h = i;
    }
}
